package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class mw1 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ long L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    public /* synthetic */ mw1(Object obj, String str, l13 l13Var, long j, int i, byte b) {
        this.I = b;
        this.N = obj;
        this.J = str;
        this.K = l13Var;
        this.L = j;
        this.M = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.M;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                ow1.a((hx1) obj3, this.J, this.K, this.L, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                ow1.b((rj3) obj3, this.J, this.K, this.L, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }
}
