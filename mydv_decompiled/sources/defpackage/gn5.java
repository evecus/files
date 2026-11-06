package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gn5 extends k05 implements hn1 {
    public /* synthetic */ Object I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ ki1 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn5(boolean z, boolean z2, t43 t43Var, t43 t43Var2, t43 t43Var3, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = z2;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        gn5 gn5Var = new gn5(this.J, this.K, this.L, this.M, this.N, this.O, fj0Var);
        gn5Var.I = obj;
        return gn5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        gn5 gn5Var = (gn5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        gn5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        ta1 ta1Var = on5.a;
        boolean z = ((Boolean) this.L.getValue()).booleanValue() || ((Boolean) this.M.getValue()).booleanValue();
        t43 t43Var = this.N;
        if (((Boolean) t43Var.getValue()).booleanValue() && !z && this.J && !this.K) {
            try {
                ki1.a(this.O);
            } catch (Throwable unused) {
            }
        }
        t43Var.setValue(Boolean.valueOf(z));
        return wd5.a;
    }
}
