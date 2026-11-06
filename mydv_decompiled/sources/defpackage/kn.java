package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ l13 J;
    public final /* synthetic */ float K;
    public final /* synthetic */ long L;
    public final /* synthetic */ byte M;
    public final /* synthetic */ byte N;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kn(l13 l13Var, float f, long j, int i, int i2, byte b) {
        this.I = b;
        this.J = l13Var;
        this.K = f;
        this.L = j;
        this.M = i;
        this.N = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = this.M;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(b2 | 1);
                p70.i(this.J, this.K, this.L, (fe0) obj, X, this.N);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(b2 | 1);
                a5.i(this.J, this.K, this.L, (fe0) obj, X2, this.N);
                break;
        }
        return wd5Var;
    }
}
