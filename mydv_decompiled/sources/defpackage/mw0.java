package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mw0 implements hn1 {
    public final /* synthetic */ p63 I;
    public final /* synthetic */ sw0 J;
    public final /* synthetic */ g94 K;
    public final /* synthetic */ gt4 L;
    public final /* synthetic */ rw0 M;

    public mw0(p63 p63Var, sw0 sw0Var, h94 h94Var, gt4 gt4Var, rw0 rw0Var) {
        this.I = p63Var;
        this.J = sw0Var;
        this.K = h94Var;
        this.L = gt4Var;
        this.M = rw0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        fe0 fe0Var = (fe0) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            go1 go1Var = (go1) fe0Var;
            if (go1Var.F()) {
                go1Var.W();
                return wd5.a;
            }
        }
        go1 go1Var2 = (go1) fe0Var;
        p63 p63Var = this.I;
        boolean i = go1Var2.i(p63Var);
        sw0 sw0Var = this.J;
        boolean i2 = i | go1Var2.i(sw0Var);
        Object Q = go1Var2.Q();
        if (i2 || Q == de0.a) {
            Q = new m6((Object) this.L, (Object) p63Var, (Object) sw0Var, (byte) 10);
            go1Var2.o0(Q);
        }
        mw2.e(p63Var, (tm1) Q, go1Var2);
        rt0.c(p63Var, this.K, p70.u0(-497631156, new lw0(this.M, p63Var), go1Var2), go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK);
        return wd5.a;
    }
}
