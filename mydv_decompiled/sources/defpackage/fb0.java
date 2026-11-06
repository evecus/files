package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fb0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u45 J;
    public final /* synthetic */ tc0 K;
    public final /* synthetic */ int L;

    public /* synthetic */ fb0(u45 u45Var, tc0 tc0Var, int i, byte b) {
        this.I = b;
        this.J = u45Var;
        this.K = tc0Var;
        this.L = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        tc0 tc0Var = this.K;
        u45 u45Var = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                a5.d(u45Var, tc0Var, fe0Var, mu0.X(i | 1));
                break;
            default:
                d4.a(u45Var, tc0Var, fe0Var, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
