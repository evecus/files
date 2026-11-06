package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dp2 extends k05 implements hn1 {
    public final /* synthetic */ t43 I;
    public final /* synthetic */ dl0 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ cw4 L;
    public final /* synthetic */ cw4 M;
    public final /* synthetic */ ki1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp2(t43 t43Var, dl0 dl0Var, t43 t43Var2, cw4 cw4Var, cw4 cw4Var2, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = t43Var;
        this.J = dl0Var;
        this.K = t43Var2;
        this.L = cw4Var;
        this.M = cw4Var2;
        this.N = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new dp2(this.I, this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        dp2 dp2Var = (dp2) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        dp2Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        t43 t43Var = this.I;
        if (!((Boolean) t43Var.getValue()).booleanValue()) {
            qg5.y(this.J, t43Var, this.K, this.L, this.M, this.N);
        }
        return wd5.a;
    }
}
