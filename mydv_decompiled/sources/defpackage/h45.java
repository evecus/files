package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h45 extends k05 implements in1 {
    public boolean I;
    public /* synthetic */ ts3 J;
    public /* synthetic */ long K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t33 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h45(dl0 dl0Var, t43 t43Var, t33 t33Var, fj0 fj0Var) {
        super(3, fj0Var);
        this.L = dl0Var;
        this.M = t43Var;
        this.N = t33Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((pd3) obj2).a;
        t43 t43Var = this.M;
        t33 t33Var = this.N;
        h45 h45Var = new h45(this.L, t43Var, t33Var, (fj0) obj3);
        h45Var.J = (ts3) obj;
        h45Var.K = j;
        return h45Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        dl0 dl0Var = this.L;
        if (!z) {
            mu0.V(obj);
            ts3 ts3Var = this.J;
            p70.g0(dl0Var, null, null, new p1((Object) this.M, this.K, this.N, (fj0) null, (byte) 3), 3);
            this.I = true;
            obj = ts3Var.f(this);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        p70.g0(dl0Var, null, null, new p03(this.M, ((Boolean) obj).booleanValue(), this.N, (fj0) null), 3);
        return wd5.a;
    }
}
