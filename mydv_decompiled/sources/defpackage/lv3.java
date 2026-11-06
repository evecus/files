package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lv3 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ lv3(hx1 hx1Var, String str, String str2, boolean z, boolean z2, rm1 rm1Var, int i) {
        this.N = hx1Var;
        this.O = str;
        this.P = str2;
        this.J = z;
        this.K = z2;
        this.L = rm1Var;
        this.M = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.M;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                mw3.c(this.J, this.K, this.L, (rm1) obj5, (rm1) obj4, (ki1) obj3, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                fv4.a((hx1) obj5, (String) obj4, (String) obj3, this.J, this.K, this.L, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ lv3(boolean z, boolean z2, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, ki1 ki1Var, int i) {
        this.J = z;
        this.K = z2;
        this.L = rm1Var;
        this.N = rm1Var2;
        this.O = rm1Var3;
        this.P = ki1Var;
        this.M = i;
    }
}
