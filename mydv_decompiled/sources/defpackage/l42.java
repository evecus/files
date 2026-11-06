package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l42 extends gj0 {
    public byte I;
    public final /* synthetic */ hn1 J;
    public final /* synthetic */ fj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l42(fj0 fj0Var, tk0 tk0Var, hn1 hn1Var, fj0 fj0Var2) {
        super(fj0Var, tk0Var);
        this.J = hn1Var;
        this.K = fj0Var2;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        if (b != 0) {
            if (b != 1) {
                zy.i("This coroutine had already completed");
                return null;
            }
            this.I = (byte) 2;
            mu0.V(obj);
            return obj;
        }
        this.I = (byte) 1;
        mu0.V(obj);
        hn1 hn1Var = this.J;
        hn1Var.getClass();
        p70.A(2, hn1Var);
        return hn1Var.invoke(this.K, this);
    }
}
