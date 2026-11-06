package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jp2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ op2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp2(op2 op2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = op2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        op2 op2Var = this.K;
        switch (b) {
            case 0:
                return new jp2(op2Var, fj0Var, (byte) 0);
            case 1:
                return new jp2(op2Var, fj0Var, (byte) 1);
            case 2:
                return new jp2(op2Var, fj0Var, (byte) 2);
            case 3:
                return new jp2(op2Var, fj0Var, (byte) 3);
            case 4:
                return new jp2(op2Var, fj0Var, (byte) 4);
            case 5:
                return new jp2(op2Var, fj0Var, (byte) 5);
            case 6:
                return new jp2(op2Var, fj0Var, (byte) 6);
            case 7:
                return new jp2(op2Var, fj0Var, (byte) 7);
            case 8:
                return new jp2(op2Var, fj0Var, (byte) 8);
            case 9:
                return new jp2(op2Var, fj0Var, (byte) 9);
            case 10:
                return new jp2(op2Var, fj0Var, (byte) 10);
            case 11:
                return new jp2(op2Var, fj0Var, (byte) 11);
            case 12:
                return new jp2(op2Var, fj0Var, (byte) 12);
            case 13:
                return new jp2(op2Var, fj0Var, (byte) 13);
            default:
                return new jp2(op2Var, fj0Var, (byte) 14);
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
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 6:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 7:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 8:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 9:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 10:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 11:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 12:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 13:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((jp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return el0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        op2 op2Var = this.K;
        el0 el0Var = el0.I;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (z) {
                    if (z) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var = op2Var.c.l0;
                ip2 ip2Var = new ip2(op2Var, b2);
                this.J = true;
                ((fw4) p04Var.I).collect(ip2Var, this);
                return el0Var;
            case 1:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var2 = op2Var.c.b0;
                ip2 ip2Var2 = new ip2(op2Var, (byte) 2);
                this.J = true;
                ((fw4) p04Var2.I).collect(ip2Var2, this);
                return el0Var;
            case 2:
                boolean z3 = this.J;
                if (z3) {
                    if (z3) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var3 = op2Var.c.d0;
                ip2 ip2Var3 = new ip2(op2Var, (byte) 3);
                this.J = true;
                ((fw4) p04Var3.I).collect(ip2Var3, this);
                return el0Var;
            case 3:
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                mn4 mn4Var = op2Var.w.r;
                ip2 ip2Var4 = new ip2(op2Var, (byte) 4);
                this.J = true;
                mn4.j(mn4Var, ip2Var4, this);
                return el0Var;
            case 4:
                boolean z5 = this.J;
                if (z5) {
                    if (z5) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                mn4 mn4Var2 = op2Var.w.t;
                ip2 ip2Var5 = new ip2(op2Var, (byte) 5);
                this.J = true;
                mn4.j(mn4Var2, ip2Var5, this);
                return el0Var;
            case 5:
                boolean z6 = this.J;
                if (z6) {
                    if (z6) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var4 = op2Var.c.p;
                ip2 ip2Var6 = new ip2(op2Var, (byte) 6);
                this.J = true;
                ((fw4) p04Var4.I).collect(ip2Var6, this);
                return el0Var;
            case 6:
                boolean z7 = this.J;
                if (z7) {
                    if (z7) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var5 = op2Var.c.L;
                ip2 ip2Var7 = new ip2(op2Var, (byte) 0);
                this.J = true;
                ((fw4) p04Var5.I).collect(ip2Var7, this);
                return el0Var;
            case 7:
                boolean z8 = this.J;
                if (z8) {
                    if (z8) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var6 = op2Var.c.H;
                ip2 ip2Var8 = new ip2(op2Var, (byte) 7);
                this.J = true;
                ((fw4) p04Var6.I).collect(ip2Var8, this);
                return el0Var;
            case 8:
                boolean z9 = this.J;
                if (z9) {
                    if (z9) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var7 = op2Var.c.N;
                ip2 ip2Var9 = new ip2(op2Var, (byte) 8);
                this.J = true;
                ((fw4) p04Var7.I).collect(ip2Var9, this);
                return el0Var;
            case 9:
                boolean z10 = this.J;
                if (z10) {
                    if (z10) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var8 = op2Var.c.Z;
                ip2 ip2Var10 = new ip2(op2Var, (byte) 9);
                this.J = true;
                ((fw4) p04Var8.I).collect(ip2Var10, this);
                return el0Var;
            case 10:
                boolean z11 = this.J;
                if (z11) {
                    if (z11) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var9 = op2Var.c.X;
                ip2 ip2Var11 = new ip2(op2Var, (byte) 10);
                this.J = true;
                ((fw4) p04Var9.I).collect(ip2Var11, this);
                return el0Var;
            case 11:
                boolean z12 = this.J;
                if (z12) {
                    if (z12) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var10 = op2Var.c.P;
                ip2 ip2Var12 = new ip2(op2Var, (byte) 11);
                this.J = true;
                ((fw4) p04Var10.I).collect(ip2Var12, this);
                return el0Var;
            case 12:
                boolean z13 = this.J;
                if (z13) {
                    if (z13) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var11 = op2Var.c.R;
                ip2 ip2Var13 = new ip2(op2Var, (byte) 12);
                this.J = true;
                ((fw4) p04Var11.I).collect(ip2Var13, this);
                return el0Var;
            case 13:
                boolean z14 = this.J;
                if (z14) {
                    if (z14) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var12 = op2Var.c.T;
                ip2 ip2Var14 = new ip2(op2Var, (byte) 13);
                this.J = true;
                ((fw4) p04Var12.I).collect(ip2Var14, this);
                return el0Var;
            default:
                boolean z15 = this.J;
                if (z15) {
                    if (z15) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var13 = op2Var.c.V;
                ip2 ip2Var15 = new ip2(op2Var, (byte) 14);
                this.J = true;
                ((fw4) p04Var13.I).collect(ip2Var15, this);
                return el0Var;
        }
    }
}
