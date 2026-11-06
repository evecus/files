package okhttp3.internal.concurrent;

import androidx.media3.common.C;
import defpackage.r7;
import defpackage.rm1;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? r7.D(new StringBuilder(), (j - 500000000) / C.NANOS_PER_SECOND, " s ") : j <= -999500 ? r7.D(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? r7.D(new StringBuilder(), (j - 500) / 1000, " µs") : j < 999500 ? r7.D(new StringBuilder(), (j + 500) / 1000, " µs") : j < 999500000 ? r7.D(new StringBuilder(), (j + 500000) / 1000000, " ms") : r7.D(new StringBuilder(), (j + 500000000) / C.NANOS_PER_SECOND, " s ")}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Logger logger, Task task, TaskQueue taskQueue, rm1 rm1Var) {
        long j;
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        rm1Var.getClass();
        boolean isLoggable = logger.isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(logger, task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T t = (T) rm1Var.invoke();
            if (isLoggable) {
                log(logger, task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            return t;
        } catch (Throwable th) {
            if (isLoggable) {
                log(logger, task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            throw th;
        }
    }

    public static final void taskLog(Logger logger, Task task, TaskQueue taskQueue, rm1 rm1Var) {
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        rm1Var.getClass();
        if (logger.isLoggable(Level.FINE)) {
            log(logger, task, taskQueue, (String) rm1Var.invoke());
        }
    }
}
