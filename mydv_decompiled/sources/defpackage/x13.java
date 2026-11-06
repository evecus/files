package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x13 extends u13 implements ScheduledExecutorService {
    public final ScheduledExecutorService J;

    public x13(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.J = scheduledExecutorService;
    }

    @Override // defpackage.u13, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        b3.f(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ib5 ib5Var = new ib5(Executors.callable(runnable, null));
        return new v13(ib5Var, this.J.schedule(ib5Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        w13 w13Var = new w13(runnable);
        return new v13(w13Var, this.J.scheduleAtFixedRate(w13Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        w13 w13Var = new w13(runnable);
        return new v13(w13Var, this.J.scheduleWithFixedDelay(w13Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ib5 ib5Var = new ib5(callable);
        return new v13(ib5Var, this.J.schedule(ib5Var, j, timeUnit));
    }
}
