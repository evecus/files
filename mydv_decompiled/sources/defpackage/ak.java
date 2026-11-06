package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ak extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ sb4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak(sb4 sb4Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = sb4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        sb4 sb4Var = this.K;
        switch (b) {
            case 0:
                return new ak(sb4Var, fj0Var, (byte) 0);
            case 1:
                return new ak(sb4Var, fj0Var, (byte) 1);
            case 2:
                return new ak(sb4Var, fj0Var, (byte) 2);
            case 3:
                return new ak(sb4Var, fj0Var, (byte) 3);
            case 4:
                return new ak(sb4Var, fj0Var, (byte) 4);
            case 5:
                return new ak(sb4Var, fj0Var, (byte) 5);
            default:
                return new ak(sb4Var, fj0Var, (byte) 6);
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
        return ((ak) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object h2;
        Object h3;
        Object h4;
        Object h5;
        Object h6;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        sb4 sb4Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    h = kb4.h(sb4Var, -(sb4Var.b.h() * 0.75f), qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h == el0Var) {
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
                    h2 = kb4.h(sb4Var, sb4Var.b.h() * 0.75f, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h2 == el0Var) {
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
                    h3 = kb4.h(sb4Var, -(sb4Var.b.h() * 0.75f), qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h3 == el0Var) {
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
                    h4 = kb4.h(sb4Var, sb4Var.b.h() * 0.75f, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h4 == el0Var) {
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
                    if (kb4.W(sb4Var, 0 - sb4Var.a.h(), this) == el0Var) {
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
            case 5:
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    this.J = true;
                    h5 = kb4.h(sb4Var, -140.0f, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h5 == el0Var) {
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
            default:
                boolean z7 = this.J;
                if (!z7) {
                    mu0.V(obj);
                    this.J = true;
                    h6 = kb4.h(sb4Var, 140.0f, qb.g0(0.0f, 0.0f, null, 7), this);
                    if (h6 == el0Var) {
                        break;
                    }
                } else if (!z7) {
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
