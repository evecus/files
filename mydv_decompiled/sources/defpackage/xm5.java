package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xm5 extends k05 implements hn1 {
    public final /* synthetic */ int I;
    public final /* synthetic */ t43 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm5(int i, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = i;
        this.J = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new xm5(this.I, this.J, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        xm5 xm5Var = (xm5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        xm5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        if (this.I > 0) {
            ta1 ta1Var = on5.a;
            this.J.setValue(Boolean.TRUE);
        }
        return wd5.a;
    }
}
