package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qk0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ hn1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(hn1 hn1Var, Object obj, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 3;
        this.L = hn1Var;
        this.K = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        hn1 hn1Var = this.L;
        switch (b) {
            case 0:
                qk0 qk0Var = new qk0(hn1Var, fj0Var, (byte) 0);
                qk0Var.K = obj;
                return qk0Var;
            case 1:
                qk0 qk0Var2 = new qk0(hn1Var, fj0Var, (byte) 1);
                qk0Var2.K = obj;
                return qk0Var2;
            case 2:
                qk0 qk0Var3 = new qk0(hn1Var, fj0Var, (byte) 2);
                qk0Var3.K = obj;
                return qk0Var3;
            default:
                return new qk0(hn1Var, this.K, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((qk0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hn1 hn1Var = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    dl0 dl0Var = (dl0) this.K;
                    this.J = true;
                    if (hn1Var.invoke(dl0Var, this) == el0Var) {
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
                    j43 j43Var = (j43) this.K;
                    this.J = true;
                    obj = hn1Var.invoke(j43Var, this);
                    if (obj == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                j43 j43Var2 = (j43) obj;
                j43Var2.b.set(true);
                break;
            case 2:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    dl0 dl0Var2 = (dl0) this.K;
                    this.J = true;
                    if (hn1Var.invoke(dl0Var2, this) == el0Var) {
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
            default:
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    Object obj2 = this.K;
                    this.J = true;
                    Object invoke = hn1Var.invoke(obj2, this);
                    if (invoke == el0Var) {
                        break;
                    }
                } else if (!z4) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk0(hn1 hn1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = hn1Var;
    }
}
