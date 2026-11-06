package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ k80 J;
    public final /* synthetic */ h23 K;
    public final /* synthetic */ hn4 L;
    public final /* synthetic */ lc5 M;
    public final /* synthetic */ hn1 N;
    public final /* synthetic */ int O;

    public /* synthetic */ jw2(k80 k80Var, h23 h23Var, hn4 hn4Var, lc5 lc5Var, hn1 hn1Var, int i, byte b) {
        this.I = b;
        this.J = k80Var;
        this.K = h23Var;
        this.L = hn4Var;
        this.M = lc5Var;
        this.N = hn1Var;
        this.O = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.O;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                lw2.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                lw2.b(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }
}
