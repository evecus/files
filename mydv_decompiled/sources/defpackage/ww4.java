package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ww4 implements Runnable {
    public final yt3 I;
    public final wv4 J;
    public final boolean K;
    public final int L;

    public ww4(yt3 yt3Var, wv4 wv4Var, boolean z, int i) {
        yt3Var.getClass();
        wv4Var.getClass();
        this.I = yt3Var;
        this.J = wv4Var;
        this.K = z;
        this.L = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean i;
        dz5 b;
        boolean z = this.K;
        yt3 yt3Var = this.I;
        wv4 wv4Var = this.J;
        if (z) {
            int i2 = this.L;
            yt3Var.getClass();
            String str = wv4Var.a.a;
            synchronized (yt3Var.k) {
                b = yt3Var.b(str);
            }
            i = yt3.e(str, b, i2);
        } else {
            i = yt3Var.i(wv4Var, this.L);
        }
        fr2.e().a(fr2.h("StopWorkRunnable"), "StopWorkRunnable for " + this.J.a.a + "; Processor.stopWork = " + i);
    }
}
