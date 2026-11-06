package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class u75 {
    public static final t75 Companion = new t75();
    public static final u75 NONE = new s75();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) {
        condition.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(timeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public u75 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public u75 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final u75 deadline(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
        }
        s83.h(r7.A("duration <= 0: ", j));
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        zy.i("No deadline");
        return 0L;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(u75 u75Var, rm1 rm1Var) {
        u75Var.getClass();
        rm1Var.getClass();
        long timeoutNanos = timeoutNanos();
        t75 t75Var = Companion;
        long timeoutNanos2 = u75Var.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        t75Var.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (!hasDeadline()) {
            if (u75Var.hasDeadline()) {
                deadlineNanoTime(u75Var.deadlineNanoTime());
            }
            try {
                return (T) rm1Var.invoke();
            } finally {
                timeout(timeoutNanos, timeUnit);
                if (u75Var.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (u75Var.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), u75Var.deadlineNanoTime()));
        }
        try {
            return (T) rm1Var.invoke();
        } finally {
            timeout(timeoutNanos, timeUnit);
            if (u75Var.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
        }
    }

    public void throwIfReached() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public u75 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        s83.h(r7.A("timeout < 0: ", j));
        return null;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) {
        obj.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj2 = this.cancelMark;
            long j = timeoutNanos / 1000000;
            Long.signum(j);
            obj.wait(j, (int) (timeoutNanos - (1000000 * j)));
            if (System.nanoTime() - nanoTime >= timeoutNanos && this.cancelMark == obj2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public u75 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
