package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dw3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ int L;
    public final /* synthetic */ ki1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw3(int i, ki1 ki1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = i;
        this.M = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                dw3 dw3Var = new dw3(this.L, this.M, fj0Var, (byte) 0);
                dw3Var.K = obj;
                return dw3Var;
            case 1:
                dw3 dw3Var2 = new dw3(this.L, this.M, fj0Var, (byte) 1);
                dw3Var2.K = obj;
                return dw3Var2;
            default:
                dw3 dw3Var3 = new dw3(this.L, this.M, fj0Var, (byte) 2);
                dw3Var3.K = obj;
                return dw3Var3;
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
        return ((dw3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.M;
        int i = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.K;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    if (i > 0) {
                        this.K = dl0Var;
                        this.J = true;
                        if (rt0.n(100L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z) {
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
            case 1:
                dl0 dl0Var2 = (dl0) this.K;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (i > 0) {
                        this.K = dl0Var2;
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
                } catch (Throwable unused2) {
                    return wd5Var;
                }
                break;
            default:
                dl0 dl0Var3 = (dl0) this.K;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    if (i > 0) {
                        this.K = dl0Var3;
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
                } catch (Throwable unused3) {
                    return wd5Var;
                }
                break;
        }
        return wd5Var;
    }
}
