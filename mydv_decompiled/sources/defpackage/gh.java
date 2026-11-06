package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gh extends r92 implements hn1 {
    public final /* synthetic */ Object J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ u8 M;
    public final /* synthetic */ String N;
    public final /* synthetic */ tm1 O;
    public final /* synthetic */ tc0 P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ byte R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gh(Object obj, l13 l13Var, tm1 tm1Var, u8 u8Var, String str, tm1 tm1Var2, tc0 tc0Var, int i, int i2) {
        super(2);
        this.J = obj;
        this.K = l13Var;
        this.L = tm1Var;
        this.M = u8Var;
        this.N = str;
        this.O = tm1Var2;
        this.P = tc0Var;
        this.Q = i;
        this.R = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        qb.b(this.J, this.K, this.L, this.M, this.N, this.O, this.P, (fe0) obj, mu0.X(this.Q | 1), this.R);
        return wd5.a;
    }
}
