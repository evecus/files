package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ u1 K;
    public final /* synthetic */ vs3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(u1 u1Var, vs3 vs3Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = u1Var;
        this.L = vs3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        vs3 vs3Var = this.L;
        u1 u1Var = this.K;
        switch (b) {
            case 0:
                return new s1(u1Var, vs3Var, fj0Var, (byte) 0);
            case 1:
                return new s1(u1Var, vs3Var, fj0Var, (byte) 1);
            case 2:
                return new s1(u1Var, vs3Var, fj0Var, (byte) 2);
            default:
                return new s1(u1Var, vs3Var, fj0Var, (byte) 3);
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
        return ((s1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        vs3 vs3Var = this.L;
        u1 u1Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    t33 t33Var = u1Var.K;
                    if (t33Var != null) {
                        us3 us3Var = new us3(vs3Var);
                        this.J = true;
                        if (t33Var.a(us3Var, this) == el0Var) {
                            break;
                        }
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
                    t33 t33Var2 = u1Var.K;
                    if (t33Var2 != null) {
                        us3 us3Var2 = new us3(vs3Var);
                        this.J = true;
                        if (t33Var2.a(us3Var2, this) == el0Var) {
                            break;
                        }
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
                    t33 t33Var3 = u1Var.K;
                    if (t33Var3 != null) {
                        this.J = true;
                        if (t33Var3.a(vs3Var, this) == el0Var) {
                            break;
                        }
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
                    t33 t33Var4 = u1Var.K;
                    if (t33Var4 != null) {
                        ws3 ws3Var = new ws3(vs3Var);
                        this.J = true;
                        if (t33Var4.a(ws3Var, this) == el0Var) {
                            break;
                        }
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
}
