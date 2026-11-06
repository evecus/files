package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hj2 implements Runnable {
    public Runnable I;
    public final /* synthetic */ ij2 J;

    public hj2(ij2 ij2Var, Runnable runnable) {
        this.J = ij2Var;
        this.I = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.I.run();
            } catch (Throwable th) {
                o7.C(l91.I, th);
            }
            Runnable a0 = this.J.a0();
            if (a0 == null) {
                return;
            }
            try {
                this.I = a0;
                i++;
                if (i >= 16) {
                    ij2 ij2Var = this.J;
                    if (qb.e0(ij2Var.J, ij2Var)) {
                        ij2 ij2Var2 = this.J;
                        qb.d0(ij2Var2.J, ij2Var2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                ij2 ij2Var3 = this.J;
                synchronized (ij2Var3.N) {
                    ij2.O.decrementAndGet(ij2Var3);
                    throw th2;
                }
            }
        }
    }
}
