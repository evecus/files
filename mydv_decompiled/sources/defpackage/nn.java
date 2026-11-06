package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ l13 L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ short N;
    public final /* synthetic */ byte O;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nn(int i, int i2, rm1 rm1Var, l13 l13Var, String str, boolean z) {
        this.I = (byte) 0;
        this.J = str;
        this.M = z;
        this.K = rm1Var;
        this.L = l13Var;
        this.N = i;
        this.O = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        short s = this.N;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                rm1 rm1Var = (rm1) obj3;
                ((Integer) obj2).getClass();
                p70.h(mu0.X(s | 1), this.O, (fe0) obj, rm1Var, this.L, this.J, this.M);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X = mu0.X(s | 1);
                byte b2 = this.O;
                hy3.c(X, b2, (fe0) obj, (rm1) obj3, this.L, this.J, this.M);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(s | 1);
                p9.a(this.J, (hv4) obj3, this.L, this.M, (fe0) obj, X2, this.O);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nn(String str, Object obj, l13 l13Var, boolean z, int i, int i2, byte b) {
        this.I = b;
        this.J = str;
        this.K = obj;
        this.L = l13Var;
        this.M = z;
        this.N = i;
        this.O = i2;
    }
}
