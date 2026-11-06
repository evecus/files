package okhttp3.internal.concurrent;

import androidx.media3.common.util.Log;
import defpackage.av5;
import defpackage.er0;
import defpackage.hf1;
import defpackage.o70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TaskRunner implements Lockable {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;
    private final Logger logger$1;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private int runCallCount;
    private final Runnable runnable;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Backend {
        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j);

        <T> BlockingQueue<T> decorate(BlockingQueue<T> blockingQueue);

        void execute(TaskRunner taskRunner, Runnable runnable);

        long nanoTime();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            threadFactory.getClass();
            this.executor = new ThreadPoolExecutor(0, Log.LOG_LEVEL_OFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            taskRunner.getClass();
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long j) {
            taskRunner.getClass();
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(taskRunner)) {
                av5.b(Thread.currentThread().getName(), " MUST hold lock on ", taskRunner);
                return;
            }
            if (j > 0) {
                long j2 = j / 1000000;
                long j3 = j - (1000000 * j2);
                if (j2 > 0 || j > 0) {
                    taskRunner.wait(j2, (int) j3);
                }
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public <T> BlockingQueue<T> decorate(BlockingQueue<T> blockingQueue) {
            blockingQueue.getClass();
            return blockingQueue;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(TaskRunner taskRunner, Runnable runnable) {
            taskRunner.getClass();
            runnable.getClass();
            this.executor.execute(runnable);
        }

        public final ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        logger2.getClass();
        logger = logger2;
        INSTANCE = new TaskRunner(new RealBackend(_UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public TaskRunner(Backend backend, Logger logger2) {
        backend.getClass();
        logger2.getClass();
        this.backend = backend;
        this.logger$1 = logger2;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                Task awaitTaskToRun;
                long j;
                Task awaitTaskToRun2;
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    i = taskRunner.runCallCount;
                    taskRunner.runCallCount = i + 1;
                    awaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (awaitTaskToRun == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                while (true) {
                    try {
                        currentThread.setName(awaitTaskToRun.getName());
                        Logger logger$okhttp = TaskRunner.this.getLogger$okhttp();
                        TaskQueue queue$okhttp = awaitTaskToRun.getQueue$okhttp();
                        queue$okhttp.getClass();
                        boolean isLoggable = logger$okhttp.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                            TaskLoggerKt.log(logger$okhttp, awaitTaskToRun, queue$okhttp, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long runOnce = awaitTaskToRun.runOnce();
                            if (isLoggable) {
                                TaskLoggerKt.log(logger$okhttp, awaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j));
                            }
                            TaskRunner taskRunner2 = TaskRunner.this;
                            synchronized (taskRunner2) {
                                taskRunner2.afterRun(awaitTaskToRun, runOnce, true);
                                awaitTaskToRun2 = taskRunner2.awaitTaskToRun();
                            }
                            if (awaitTaskToRun2 == null) {
                                return;
                            } else {
                                awaitTaskToRun = awaitTaskToRun2;
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                TaskLoggerKt.log(logger$okhttp, awaitTaskToRun, queue$okhttp, "failed a run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = TaskRunner.this;
                            synchronized (taskRunner3) {
                                taskRunner3.afterRun(awaitTaskToRun, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                                return;
                            }
                        } finally {
                            currentThread.setName(name);
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void afterRun(Task task, long j, boolean z) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        queue$okhttp.getClass();
        if (queue$okhttp.getActiveTask$okhttp() != task) {
            zy.i("Check failed.");
            return;
        }
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue$okhttp);
        if (j != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
            queue$okhttp.scheduleAndDecide$okhttp(task, j, true);
        }
        if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue$okhttp);
        if (z) {
            return;
        }
        startAnotherThread();
    }

    private final void beforeRun(Task task) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        queue$okhttp.getClass();
        queue$okhttp.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(task);
        this.busyQueues.add(queue$okhttp);
    }

    private final void startAnotherThread() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        int i = this.executeCallCount;
        if (i > this.runCallCount) {
            return;
        }
        this.executeCallCount = i + 1;
        this.backend.execute(this, this.runnable);
    }

    public final List<TaskQueue> activeQueues() {
        ArrayList f1;
        synchronized (this) {
            f1 = o70.f1(this.busyQueues, this.readyQueues);
        }
        return f1;
    }

    public final Task awaitTaskToRun() {
        boolean z;
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return null;
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long j = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = it.next().getFutureTasks$okhttp().get(0);
                long max = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (task != null) {
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    startAnotherThread();
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (j < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = nanoTime + j;
            try {
                try {
                    this.backend.coordinatorWait(this, j);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void cancelAll() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final Logger getLogger$okhttp() {
        return this.logger$1;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        taskQueue.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            boolean isEmpty = taskQueue.getFutureTasks$okhttp().isEmpty();
            List<TaskQueue> list = this.readyQueues;
            if (isEmpty) {
                list.remove(taskQueue);
            } else {
                _UtilCommonKt.addIfAbsent(list, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            startAnotherThread();
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new TaskQueue(this, hf1.u(i, "Q"));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TaskRunner(Backend backend, Logger logger2, int i, er0 er0Var) {
        this(backend, (i & 2) != 0 ? logger : logger2);
    }
}
