package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e02 implements cw4 {
    public Float I;
    public Float J;
    public final jk3 K;
    public a25 L;
    public boolean M;
    public boolean N;
    public long O;
    public final /* synthetic */ g02 P;

    public e02(g02 g02Var, Float f, Float f2, d02 d02Var) {
        ub5 ub5Var = p70.F;
        this.P = g02Var;
        this.I = f;
        this.J = f2;
        this.K = ad4.w(f);
        this.L = new a25(d02Var, ub5Var, this.I, this.J, null);
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.K.getValue();
    }
}
