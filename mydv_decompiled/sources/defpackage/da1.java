package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class da1 extends r92 implements hn1 {
    public final /* synthetic */ ea5 J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da1(ea5 ea5Var, rm1 rm1Var, int i) {
        super(2);
        this.J = ea5Var;
        this.K = rm1Var;
        this.L = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int X = mu0.X(this.L | 1);
        ma1.a(this.J, this.K, (fe0) obj, X);
        return wd5.a;
    }
}
