package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cm0 extends r92 implements hn1 {
    public final /* synthetic */ ea5 J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ ve1 L;
    public final /* synthetic */ tm1 M;
    public final /* synthetic */ int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(ea5 ea5Var, l13 l13Var, ve1 ve1Var, tm1 tm1Var, int i) {
        super(2);
        this.J = ea5Var;
        this.K = l13Var;
        this.L = ve1Var;
        this.M = tm1Var;
        this.N = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c5.f(this.J, this.K, this.L, this.M, (fe0) obj, mu0.X(this.N | 1));
        return wd5.a;
    }
}
