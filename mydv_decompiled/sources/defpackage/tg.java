package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ l13 J;
    public final /* synthetic */ dn1 K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ tg(dn1 dn1Var, l13 l13Var, Object obj, Object obj2, int i, byte b) {
        this.I = b;
        this.K = dn1Var;
        this.J = l13Var;
        this.L = obj;
        this.M = obj2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        dn1 dn1Var = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                mw2.a((tm1) dn1Var, this.J, (tm1) obj4, (tm1) obj3, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(1);
                rt0.b((rm1) dn1Var, this.J, (bf2) obj4, (oe2) obj3, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }
}
