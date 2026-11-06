package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class sq extends u75 {
    private static final oq Companion = new oq();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static sq idleSentinel;
    private static final ReentrantLock lock;
    private static final ot3 queue;
    public int index = -1;
    private int state;
    private long timeoutAt;

    static {
        ot3 ot3Var = new ot3();
        ot3Var.b = new sq[8];
        queue = ot3Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        condition = newCondition;
        IDLE_TIMEOUT_MILLIS = 60000L;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(sq sqVar, long j, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: setTimeoutAt");
            return;
        }
        if ((i & 1) != 0) {
            j = System.nanoTime();
        }
        sqVar.setTimeoutAt$okio(j);
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // defpackage.u75
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.b(this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.getClass();
                oq.b(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            queue.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long getTimeoutAt$okio() {
        return this.timeoutAt;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long j) {
        return this.timeoutAt - j;
    }

    public final void setTimeoutAt$okio(long j) {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos() != 0 && hasDeadline()) {
            this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - j) + j;
        } else if (timeoutNanos != 0) {
            this.timeoutAt = j + timeoutNanos;
        } else {
            if (!hasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = deadlineNanoTime();
        }
    }

    public final eq4 sink(eq4 eq4Var) {
        eq4Var.getClass();
        return new qq(this, eq4Var);
    }

    public final ut4 source(ut4 ut4Var) {
        ut4Var.getClass();
        return new rq(this, ut4Var);
    }

    public final <T> T withTimeout(rm1 rm1Var) {
        rm1Var.getClass();
        enter();
        try {
            T t = (T) rm1Var.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return t;
        } catch (IOException e) {
            if (exit()) {
                throw access$newTimeoutException(e);
            }
            throw e;
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
