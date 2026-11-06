package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ec4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ fc4 K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec4(fc4 fc4Var, long j, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = fc4Var;
        this.L = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new ec4(this.K, this.L, fj0Var, (byte) 0);
            case 1:
                return new ec4(this.K, this.L, fj0Var, (byte) 1);
            default:
                return new ec4(this.K, this.L, fj0Var, (byte) 2);
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
        return ((ec4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        long j = this.L;
        fc4 fc4Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    oc4 oc4Var = fc4Var.l0;
                    dc4 dc4Var = new dc4(j, null);
                    this.J = true;
                    if (oc4Var.g(d53.J, dc4Var, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    oc4 oc4Var2 = fc4Var.l0;
                    this.J = true;
                    if (oc4Var2.c(j, true, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    oc4 oc4Var3 = fc4Var.l0;
                    this.J = true;
                    if (oc4Var3.c(j, false, this) == el0Var) {
                        break;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
        }
        return el0Var;
    }
}
