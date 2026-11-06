package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qb1 extends pb1 implements pt0 {
    public final Executor I;

    public qb1(Executor executor) {
        Method method;
        this.I = executor;
        Method method2 = rf0.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = rf0.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.pt0
    public final void K(long j, k10 k10Var) {
        Executor executor = this.I;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            wn1 wn1Var = new wn1(this, k10Var, (byte) 9);
            tk0 tk0Var = k10Var.M;
            try {
                scheduledFuture = scheduledExecutorService.schedule(wn1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                vt0.j(tk0Var, e41.a("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            k10Var.w(new d10(scheduledFuture));
        } else {
            ir0.Q.K(j, k10Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.I;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        try {
            this.I.execute(runnable);
        } catch (RejectedExecutionException e) {
            vt0.j(tk0Var, e41.a("The task was rejected", e));
            os0 os0Var = sx0.a;
            ur0.I.dispatch(tk0Var, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qb1) && ((qb1) obj).I == this.I;
    }

    public final int hashCode() {
        return System.identityHashCode(this.I);
    }

    @Override // defpackage.vk0
    public final String toString() {
        return this.I.toString();
    }

    @Override // defpackage.pt0
    public final cy0 y(long j, Runnable runnable, tk0 tk0Var) {
        Executor executor = this.I;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                vt0.j(tk0Var, e41.a("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new by0(scheduledFuture) : ir0.Q.y(j, runnable, tk0Var);
    }
}
