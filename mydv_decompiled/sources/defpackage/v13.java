package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v13 extends el1 implements ScheduledFuture, fl2, Future {
    public final r2 I;
    public final ScheduledFuture J;

    public v13(r2 r2Var, ScheduledFuture scheduledFuture) {
        this.I = r2Var;
        this.J = scheduledFuture;
    }

    @Override // defpackage.fl2
    public final void a(Executor executor, Runnable runnable) {
        this.I.a(executor, runnable);
    }

    public final boolean b(boolean z) {
        return this.I.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean b = b(z);
        if (b) {
            this.J.cancel(z);
        }
        return b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.J.compareTo(delayed);
    }

    @Override // defpackage.el1
    public final Object delegate() {
        return this.I;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.I.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.J.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.I.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.I.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.I.get(j, timeUnit);
    }
}
