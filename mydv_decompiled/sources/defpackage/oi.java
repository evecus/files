package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oi extends r92 implements hn1 {
    public final /* synthetic */ boolean J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ ta1 L;
    public final /* synthetic */ bc1 M;
    public final /* synthetic */ String N;
    public final /* synthetic */ tc0 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ byte Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oi(boolean z, l13 l13Var, ta1 ta1Var, bc1 bc1Var, String str, tc0 tc0Var, int i, int i2) {
        super(2);
        this.J = z;
        this.K = l13Var;
        this.L = ta1Var;
        this.M = bc1Var;
        this.N = str;
        this.O = tc0Var;
        this.P = i;
        this.Q = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p70.e(this.J, this.K, this.L, this.M, this.N, this.O, (fe0) obj, mu0.X(this.P | 1), this.Q);
        return wd5.a;
    }
}
