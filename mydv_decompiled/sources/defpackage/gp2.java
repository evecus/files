package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gp2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ is0 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp2(is0 is0Var, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = is0Var;
        this.L = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        int i = this.L;
        is0 is0Var = this.K;
        switch (b) {
            case 0:
                return new gp2(is0Var, i, fj0Var, (byte) 0);
            case 1:
                return new gp2(is0Var, i, fj0Var, (byte) 1);
            case 2:
                return new gp2(is0Var, i, fj0Var, (byte) 2);
            case 3:
                return new gp2(is0Var, i, fj0Var, (byte) 3);
            case 4:
                return new gp2(is0Var, i, fj0Var, (byte) 4);
            default:
                return new gp2(is0Var, i, fj0Var, (byte) 5);
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
        return ((gp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object f2;
        Object f3;
        Object f4;
        Object f5;
        Object f6;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        is0 is0Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    f = is0Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f == el0Var) {
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
                    this.J = true;
                    f2 = is0Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f2 == el0Var) {
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
            case 2:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    this.J = true;
                    f3 = is0Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f3 == el0Var) {
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
            case 3:
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    this.J = true;
                    f4 = is0Var.f(i + 1, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f4 == el0Var) {
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
            case 4:
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    this.J = true;
                    f5 = is0Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f5 == el0Var) {
                        break;
                    }
                } else if (!z5) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    this.J = true;
                    f6 = is0Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (f6 == el0Var) {
                        break;
                    }
                } else if (!z6) {
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
