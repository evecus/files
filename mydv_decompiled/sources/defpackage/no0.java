package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class no0 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ String J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ l13 L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ byte N;
    public final /* synthetic */ byte O;
    public final /* synthetic */ Object P;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ no0(String str, rm1 rm1Var, l13 l13Var, boolean z, ki1 ki1Var, int i, int i2) {
        this.J = str;
        this.K = rm1Var;
        this.L = l13Var;
        this.M = z;
        this.P = ki1Var;
        this.N = i;
        this.O = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = this.N;
        Object obj3 = this.P;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(b2 | 1);
                a5.h(this.J, (hx1) obj3, this.M, this.K, this.L, (fe0) obj, X, this.O);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(b2 | 1);
                hy3.a(this.J, this.K, this.L, this.M, (ki1) obj3, (fe0) obj, X2, this.O);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ no0(String str, hx1 hx1Var, boolean z, rm1 rm1Var, l13 l13Var, int i, int i2) {
        this.J = str;
        this.P = hx1Var;
        this.M = z;
        this.K = rm1Var;
        this.L = l13Var;
        this.N = i;
        this.O = i2;
    }
}
