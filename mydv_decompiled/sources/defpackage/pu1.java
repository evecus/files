package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ hu2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu1(boolean z, hu2 hu2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = z;
        this.K = hu2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                return new pu1(hu2Var, fj0Var, (byte) 0);
            case 1:
                return new pu1(this.J, hu2Var, fj0Var, (byte) 1);
            case 2:
                return new pu1(hu2Var, fj0Var, (byte) 2);
            case 3:
                return new pu1(hu2Var, fj0Var, (byte) 3);
            case 4:
                return new pu1(hu2Var, fj0Var, (byte) 4);
            case 5:
                return new pu1(hu2Var, fj0Var, (byte) 5);
            case 6:
                return new pu1(hu2Var, fj0Var, (byte) 6);
            case 7:
                return new pu1(this.J, hu2Var, fj0Var, (byte) 7);
            case 8:
                return new pu1(hu2Var, fj0Var, (byte) 8);
            case 9:
                return new pu1(hu2Var, fj0Var, (byte) 9);
            default:
                return new pu1(hu2Var, fj0Var, (byte) 10);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 8:
                break;
            case 9:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((pu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return el0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    if (rt0.n(5000L, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                hu2Var.D.h(null);
                return wd5Var;
            case 1:
                mu0.V(obj);
                if (this.J) {
                    hu2Var.i.q(true);
                }
                return wd5Var;
            case 2:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var = hu2Var.d.D;
                eu2 eu2Var = new eu2(hu2Var, (byte) 0);
                this.J = true;
                ((fw4) p04Var.I).collect(eu2Var, this);
                return el0Var;
            case 3:
                boolean z3 = this.J;
                if (z3) {
                    if (z3) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                n24 n24Var = new n24();
                p04 p04Var2 = hu2Var.j.f;
                y30 y30Var = new y30((Object) n24Var, (Object) hu2Var, (byte) 8);
                this.J = true;
                ((fw4) p04Var2.I).collect(y30Var, this);
                return el0Var;
            case 4:
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var3 = hu2Var.p.t0;
                eu2 eu2Var2 = new eu2(hu2Var, (byte) 1);
                this.J = true;
                ((fw4) p04Var3.I).collect(eu2Var2, this);
                return el0Var;
            case 5:
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    this.J = true;
                    if (rt0.n(1500L, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z5) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                if (hu2Var.v.getValue() != ab4.P) {
                    return wd5Var;
                }
                hu2Var.v(((rr0) ((fw4) hu2Var.h.q0.I).getValue()).K);
                return wd5Var;
            case 6:
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    this.J = true;
                    return hu2Var.s(this) == el0Var ? el0Var : wd5Var;
                }
                if (z6) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                mu0.V(obj);
                if (this.J) {
                    hu2Var.o.q();
                }
                return wd5Var;
            case 8:
                boolean z7 = this.J;
                if (!z7) {
                    mu0.V(obj);
                    n04 n04Var = hu2Var.o.d.f;
                    this.J = true;
                    if (sp0.K(n04Var, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z7) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                if (hu2Var.v.getValue() != ab4.O) {
                    return wd5Var;
                }
                hu2Var.q(g83.a);
                return wd5Var;
            case 9:
                boolean z8 = this.J;
                if (!z8) {
                    mu0.V(obj);
                    n04 n04Var2 = hu2Var.o.k;
                    eu2 eu2Var3 = new eu2(hu2Var, (byte) 2);
                    this.J = true;
                    if (n04Var2.I.collect(eu2Var3, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z8) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
            default:
                boolean z9 = this.J;
                if (!z9) {
                    mu0.V(obj);
                    n04 n04Var3 = hu2Var.o.k;
                    eu2 eu2Var4 = new eu2(hu2Var, (byte) 3);
                    this.J = true;
                    if (n04Var3.I.collect(eu2Var4, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z9) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu1(hu2 hu2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = hu2Var;
    }
}
