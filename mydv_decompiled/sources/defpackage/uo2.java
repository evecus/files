package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uo2 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ l13 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    public /* synthetic */ uo2(hu2 hu2Var, l13 l13Var, int i, rm1 rm1Var, boolean z, int i2) {
        this.N = hu2Var;
        this.L = l13Var;
        this.M = i;
        this.K = rm1Var;
        this.J = z;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(9);
                qg5.u((hu2) obj3, this.L, this.M, this.K, this.J, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(this.M | 1);
                on5.e((String) obj3, this.J, this.K, this.L, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ uo2(String str, boolean z, rm1 rm1Var, l13 l13Var, int i) {
        this.N = str;
        this.J = z;
        this.K = rm1Var;
        this.L = l13Var;
        this.M = i;
    }
}
