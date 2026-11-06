package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ib5 extends r2 implements RunnableFuture, m2 {
    public volatile hb5 P;

    public ib5(Callable callable) {
        this.P = new hb5(this, callable);
    }

    @Override // defpackage.r2
    public final void c() {
        hb5 hb5Var;
        Object obj = this.I;
        if ((obj instanceof f2) && ((f2) obj).a && (hb5Var = this.P) != null) {
            w32 w32Var = hb5.L;
            w32 w32Var2 = hb5.K;
            Runnable runnable = (Runnable) hb5Var.get();
            if (runnable instanceof Thread) {
                v32 v32Var = new v32(hb5Var);
                v32Var.a(Thread.currentThread());
                if (hb5Var.compareAndSet(runnable, v32Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) hb5Var.getAndSet(w32Var2)) == w32Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.P = null;
    }

    @Override // defpackage.r2
    public final String i() {
        hb5 hb5Var = this.P;
        if (hb5Var == null) {
            return super.i();
        }
        return "task=[" + hb5Var + "]";
    }

    @Override // defpackage.r2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.I instanceof f2;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        hb5 hb5Var = this.P;
        if (hb5Var != null) {
            hb5Var.run();
        }
        this.P = null;
    }
}
