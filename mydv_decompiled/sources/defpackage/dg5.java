package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dg5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ String K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg5(String str, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = str;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new dg5(this.K, this.L, this.M, this.N, fj0Var, (byte) 0);
            default:
                return new dg5(this.K, this.L, this.M, this.N, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((dg5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.N;
        t43 t43Var2 = this.M;
        String str = this.K;
        el0 el0Var = el0.I;
        t43 t43Var3 = this.L;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    if (rt0.n(2200L, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                if (j42.c((String) t43Var3.getValue(), str) && !((Boolean) t43Var2.getValue()).booleanValue()) {
                    t43Var3.setValue(null);
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    if (rt0.n(2200L, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                if (j42.c((String) t43Var3.getValue(), str) && !((Boolean) t43Var2.getValue()).booleanValue()) {
                    t43Var3.setValue(null);
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
