package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pc0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ pc0(x70 x70Var, ma4 ma4Var, tc0 tc0Var, int i) {
        this.I = (byte) 1;
        this.L = x70Var;
        this.M = ma4Var;
        this.J = tc0Var;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        int i = this.K;
        Object obj3 = this.M;
        Object obj4 = this.L;
        wd5 wd5Var = wd5.a;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ((tc0) obj5).h(obj4, obj3, (fe0) obj, mu0.X(i) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                xh0.a((x70) obj4, (ma4) obj3, (tc0) obj5, (fe0) obj, mu0.X(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                sp0.e((me2) obj5, this.L, this.K, this.M, (fe0) obj, X);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((eg2) obj3).b(obj4, (tc0) obj5, (fe0) obj, mu0.X(i | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                sv2.e((vi2) obj5, (bj2) obj4, (tm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((h94) obj3).b(obj4, (tc0) obj5, (fe0) obj, mu0.X(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                i42.Z((vy4) obj5, (l13) obj4, (hn1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ pc0(me2 me2Var, Object obj, int i, Object obj2, int i2) {
        this.I = (byte) 2;
        this.J = me2Var;
        this.L = obj;
        this.K = i;
        this.M = obj2;
    }

    public /* synthetic */ pc0(g94 g94Var, Object obj, tc0 tc0Var, int i, byte b) {
        this.I = b;
        this.M = g94Var;
        this.L = obj;
        this.J = tc0Var;
        this.K = i;
    }

    public /* synthetic */ pc0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.I = b;
        this.J = obj;
        this.L = obj2;
        this.M = obj3;
        this.K = i;
    }
}
