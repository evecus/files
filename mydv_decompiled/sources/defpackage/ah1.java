package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ah1 extends k05 implements in1 {
    public ag1 I;
    public byte J;
    public /* synthetic */ ag1 K;
    public /* synthetic */ Object[] L;
    public final /* synthetic */ cu2 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah1(fj0 fj0Var, cu2 cu2Var) {
        super(3, fj0Var);
        this.M = cu2Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ah1 ah1Var = new ah1((fj0) obj3, this.M);
        ah1Var.K = (ag1) obj;
        ah1Var.L = (Object[]) obj2;
        return ah1Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        ag1 ag1Var = this.K;
        Object[] objArr = this.L;
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (b == 0) {
            mu0.V(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            this.K = null;
            this.L = null;
            this.I = ag1Var;
            this.J = (byte) 1;
            this.M.c(obj2, obj3, obj4, this);
            if (wd5Var != el0Var) {
                obj = wd5Var;
            }
        }
        if (b != 1) {
            if (b == 2) {
                mu0.V(obj);
            }
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ag1Var = this.I;
        mu0.V(obj);
        this.K = null;
        this.L = null;
        this.I = null;
        this.J = (byte) 2;
        return ag1Var.emit(obj, this) == el0Var ? el0Var : wd5Var;
    }
}
