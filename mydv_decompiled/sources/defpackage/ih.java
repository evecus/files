package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ih extends r92 implements hn1 {
    public final /* synthetic */ byte J = 0;
    public final /* synthetic */ ea5 K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ l13 M;
    public final /* synthetic */ tc0 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(ea5 ea5Var, tm1 tm1Var, l13 l13Var, ta1 ta1Var, bc1 bc1Var, tc0 tc0Var, int i) {
        super(2);
        this.K = ea5Var;
        this.L = tm1Var;
        this.M = l13Var;
        this.P = ta1Var;
        this.Q = bc1Var;
        this.N = tc0Var;
        this.O = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        int i = this.O;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int X = mu0.X(i | 1);
                ea5 ea5Var = this.K;
                l13 l13Var = this.M;
                tm1 tm1Var = this.L;
                qb.a(ea5Var, l13Var, tm1Var, (u8) obj3, (tm1) obj4, this.N, (fe0) obj, X);
                break;
            default:
                ((Number) obj2).intValue();
                int X2 = mu0.X(i | 1);
                ea5 ea5Var2 = this.K;
                tm1 tm1Var2 = this.L;
                l13 l13Var2 = this.M;
                p70.f(ea5Var2, tm1Var2, l13Var2, (ta1) obj4, (bc1) obj3, this.N, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(ea5 ea5Var, l13 l13Var, tm1 tm1Var, u8 u8Var, tm1 tm1Var2, tc0 tc0Var, int i) {
        super(2);
        this.K = ea5Var;
        this.M = l13Var;
        this.L = tm1Var;
        this.Q = u8Var;
        this.P = tm1Var2;
        this.N = tc0Var;
        this.O = i;
    }
}
