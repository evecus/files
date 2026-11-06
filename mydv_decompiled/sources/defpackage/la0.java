package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class la0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ ma0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la0(ma0 ma0Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = ma0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        ma0 ma0Var = this.K;
        switch (b) {
            case 0:
                return new la0(ma0Var, fj0Var, (byte) 0);
            case 1:
                return new la0(ma0Var, fj0Var, (byte) 1);
            default:
                return new la0(ma0Var, fj0Var, (byte) 2);
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
        return ((la0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        ma0 ma0Var = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    long b2 = ((gr5) j42.r(ma0Var, hf0.t)).b();
                    this.J = true;
                    if (rt0.n(b2, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                rm1 rm1Var = ma0Var.d0;
                if (rm1Var != null) {
                    rm1Var.invoke();
                }
                if (ma0Var.e0) {
                    ((kn3) ((ts1) j42.r(ma0Var, hf0.l))).a(0);
                }
                ma0Var.l0 = true;
                rv4 rv4Var = ma0Var.j0;
                if (rv4Var != null) {
                    rv4Var.e(null);
                }
                ma0Var.j0 = null;
                ma0Var.i0 = null;
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    long b3 = ((gr5) j42.r(ma0Var, hf0.t)).b();
                    this.J = true;
                    if (rt0.n(b3, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                rm1 rm1Var2 = ma0Var.d0;
                if (rm1Var2 != null) {
                    rm1Var2.invoke();
                }
                if (ma0Var.e0) {
                    ((kn3) ((ts1) j42.r(ma0Var, hf0.l))).a(0);
                }
                ma0Var.s0 = true;
                rv4 rv4Var2 = ma0Var.q0;
                if (rv4Var2 != null) {
                    rv4Var2.e(null);
                }
                ma0Var.q0 = null;
                ma0Var.p0 = null;
                break;
            default:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    long b4 = ((gr5) j42.r(ma0Var, hf0.t)).b();
                    this.J = true;
                    if (rt0.n(b4, this) == el0Var) {
                        break;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                rm1 rm1Var3 = ma0Var.d0;
                if (rm1Var3 != null) {
                    rm1Var3.invoke();
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
