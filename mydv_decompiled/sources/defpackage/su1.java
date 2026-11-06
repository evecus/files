package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class su1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ ki1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su1(boolean z, t43 t43Var, ki1 ki1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = z;
        this.M = t43Var;
        this.N = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                su1 su1Var = new su1(this.L, this.M, this.N, fj0Var, (byte) 0);
                su1Var.K = obj;
                return su1Var;
            default:
                su1 su1Var2 = new su1(this.L, this.M, this.N, fj0Var, (byte) 1);
                su1Var2.K = obj;
                return su1Var2;
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
        return ((su1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.N;
        boolean z = this.L;
        t43 t43Var = this.M;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.K;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (((Boolean) t43Var.getValue()).booleanValue() && z) {
                        this.K = dl0Var;
                        this.J = true;
                        if (rt0.n(100L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
                break;
            default:
                dl0 dl0Var2 = (dl0) this.K;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    ml0 ml0Var = mw3.a;
                    if (((Boolean) t43Var.getValue()).booleanValue() && z) {
                        this.K = dl0Var2;
                        this.J = true;
                        if (rt0.n(100L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused2) {
                    return wd5Var;
                }
        }
        return wd5Var;
    }
}
