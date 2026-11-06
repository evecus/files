package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jo0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ int L;

    public /* synthetic */ jo0(rm1 rm1Var, l13 l13Var, int i, byte b) {
        this.I = b;
        this.J = rm1Var;
        this.K = l13Var;
        this.L = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        l13 l13Var = this.K;
        rm1 rm1Var = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                a5.f(rm1Var, l13Var, fe0Var, mu0.X(i | 1));
                break;
            case 1:
                qe4.l(rm1Var, l13Var, fe0Var, mu0.X(i | 1));
                break;
            default:
                eu5.m(rm1Var, l13Var, fe0Var, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
