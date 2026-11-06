package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p4 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ long J;
    public final /* synthetic */ fc4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fc4 fc4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = fc4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        p4 p4Var = new p4(this.K, fj0Var);
        p4Var.J = ((pd3) obj).a;
        return p4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        long j = ((pd3) obj).a;
        p4 p4Var = new p4(this.K, (fj0) obj2);
        p4Var.J = j;
        return p4Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (z) {
            if (z) {
                mu0.V(obj);
                return obj;
            }
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        long j = this.J;
        this.I = true;
        Object b0 = j42.b0(this.K.l0, j, this);
        el0 el0Var = el0.I;
        return b0 == el0Var ? el0Var : b0;
    }
}
