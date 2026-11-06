package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx3 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ m65 K;
    public final /* synthetic */ hn1 L;
    public final /* synthetic */ short M;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zx3(long j, m65 m65Var, hn1 hn1Var, int i, byte b) {
        this.I = b;
        this.J = j;
        this.K = m65Var;
        this.L = hn1Var;
        this.M = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        short s = this.M;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(s | 1);
                jl2.b(this.J, this.K, this.L, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(s | 1);
                kb4.d(this.J, this.K, this.L, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }
}
