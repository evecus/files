package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ym5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym5(boolean z, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ym5(this.J, this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ym5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        t43 t43Var = this.K;
        t43 t43Var2 = this.L;
        if (!z) {
            mu0.V(obj);
            if (this.J) {
                ta1 ta1Var = on5.a;
                if (!((Boolean) t43Var.getValue()).booleanValue()) {
                    t43Var2.setValue(Boolean.FALSE);
                    this.I = true;
                    Object n = rt0.n(200L, this);
                    el0 el0Var = el0.I;
                    if (n == el0Var) {
                        return el0Var;
                    }
                }
            }
            ta1 ta1Var2 = on5.a;
            t43Var2.setValue(Boolean.FALSE);
            return wd5.a;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        ta1 ta1Var3 = on5.a;
        t43Var2.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
        return wd5.a;
    }
}
