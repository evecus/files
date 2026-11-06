package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qi2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ dn1 N;

    public /* synthetic */ qi2(Object obj, Object obj2, Object obj3, dn1 dn1Var, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.N = dn1Var;
        this.J = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        dn1 dn1Var = this.N;
        Object obj3 = this.M;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                sv2.d((Boolean) obj4, this.L, (vi2) obj3, (tm1) dn1Var, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                on5.x((hx1) obj4, (String) this.L, (String) obj3, (rm1) dn1Var, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
