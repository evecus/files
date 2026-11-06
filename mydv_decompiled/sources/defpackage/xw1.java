package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xw1 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ byte L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xw1(rm1 rm1Var, l13 l13Var, boolean z, tm1 tm1Var, tc0 tc0Var, int i, int i2) {
        this.M = rm1Var;
        this.N = l13Var;
        this.J = z;
        this.O = tm1Var;
        this.P = tc0Var;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                boolean z = this.J;
                byte b2 = this.L;
                c21.c((ex1) obj6, (String) obj5, (lq1) obj4, z ? 1 : 0, (b80) obj3, (fe0) obj, X, b2);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                bp3.c((rm1) obj6, (l13) obj5, this.J, (tm1) obj4, (tc0) obj3, (fe0) obj, X2, this.L);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xw1(ex1 ex1Var, String str, lq1 lq1Var, int i, b80 b80Var, int i2, int i3) {
        this.M = ex1Var;
        this.N = str;
        this.O = lq1Var;
        this.J = i;
        this.P = b80Var;
        this.K = i2;
        this.L = i3;
    }
}
