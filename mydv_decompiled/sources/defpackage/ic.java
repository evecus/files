package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ic implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ tw0 K;
    public final /* synthetic */ tc0 L;
    public final /* synthetic */ int M;

    public /* synthetic */ ic(rm1 rm1Var, tw0 tw0Var, tc0 tc0Var, int i, byte b) {
        this.I = b;
        this.J = rm1Var;
        this.K = tw0Var;
        this.L = tc0Var;
        this.M = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.M;
        tc0 tc0Var = this.L;
        tw0 tw0Var = this.K;
        rm1 rm1Var = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                d4.b(rm1Var, tw0Var, tc0Var, fe0Var, mu0.X(i | 1));
                break;
            case 1:
                eu5.f(rm1Var, tw0Var, tc0Var, fe0Var, mu0.X(i | 1));
                break;
            default:
                eu5.f(rm1Var, tw0Var, tc0Var, fe0Var, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
