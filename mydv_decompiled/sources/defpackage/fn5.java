package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fn5 extends k05 implements hn1 {
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ t43 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn5(boolean z, boolean z2, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = z;
        this.J = z2;
        this.K = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new fn5(this.I, this.J, this.K, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        fn5 fn5Var = (fn5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        fn5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        if (!this.I || this.J) {
            ta1 ta1Var = on5.a;
            this.K.setValue(Boolean.FALSE);
        }
        return wd5.a;
    }
}
