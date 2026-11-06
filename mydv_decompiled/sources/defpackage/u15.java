package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u15 extends f54 implements hn1 {
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ ts3 M;
    public final /* synthetic */ tm1 N;
    public final /* synthetic */ tm1 O;
    public final /* synthetic */ in1 P;
    public final /* synthetic */ tm1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u15(dl0 dl0Var, ts3 ts3Var, tm1 tm1Var, tm1 tm1Var2, in1 in1Var, tm1 tm1Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = dl0Var;
        this.M = ts3Var;
        this.N = tm1Var;
        this.O = tm1Var2;
        this.P = in1Var;
        this.Q = tm1Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        u15 u15Var = new u15(this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
        u15Var.K = obj;
        return u15Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((u15) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.J;
        if (!z) {
            mu0.V(obj);
            q05 q05Var = (q05) this.K;
            this.J = true;
            Object g = z15.g(q05Var, this.L, this.M, this.N, this.O, this.P, this.Q, this);
            el0 el0Var = el0.I;
            if (g == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5.a;
    }
}
