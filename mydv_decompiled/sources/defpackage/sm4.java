package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sm4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ wm4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm4(wm4 wm4Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = wm4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wm4 wm4Var = this.K;
        switch (b) {
            case 0:
                return new sm4(wm4Var, fj0Var, (byte) 0);
            case 1:
                return new sm4(wm4Var, fj0Var, (byte) 1);
            case 2:
                return new sm4(wm4Var, fj0Var, (byte) 2);
            case 3:
                return new sm4(wm4Var, fj0Var, (byte) 3);
            case 4:
                return new sm4(wm4Var, fj0Var, (byte) 4);
            case 5:
                return new sm4(wm4Var, fj0Var, (byte) 5);
            case 6:
                return new sm4(wm4Var, fj0Var, (byte) 6);
            case 7:
                return new sm4(wm4Var, fj0Var, (byte) 7);
            case 8:
                return new sm4(wm4Var, fj0Var, (byte) 8);
            case 9:
                return new sm4(wm4Var, fj0Var, (byte) 9);
            case 10:
                return new sm4(wm4Var, fj0Var, (byte) 10);
            default:
                return new sm4(wm4Var, fj0Var, (byte) 11);
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
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 6:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 7:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 8:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 9:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 10:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((sm4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return el0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wm4 wm4Var = this.K;
        el0 el0Var = el0.I;
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
                p04 p04Var = wm4Var.b.Z;
                rm4 rm4Var = new rm4(wm4Var, (byte) 1);
                this.J = true;
                ((fw4) p04Var.I).collect(rm4Var, this);
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
                p04 p04Var2 = wm4Var.b.n0;
                rm4 rm4Var2 = new rm4(wm4Var, (byte) 2);
                this.J = true;
                ((fw4) p04Var2.I).collect(rm4Var2, this);
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
                p04 p04Var3 = wm4Var.b.p0;
                this.J = true;
                ((fw4) p04Var3.I).collect(tm4.I, this);
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
                p04 p04Var4 = wm4Var.b.J;
                rm4 rm4Var3 = new rm4(wm4Var, (byte) 0);
                this.J = true;
                ((fw4) p04Var4.I).collect(rm4Var3, this);
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
                p04 p04Var5 = wm4Var.b.L;
                rm4 rm4Var4 = new rm4(wm4Var, (byte) 3);
                this.J = true;
                ((fw4) p04Var5.I).collect(rm4Var4, this);
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
                p04 p04Var6 = wm4Var.b.N;
                rm4 rm4Var5 = new rm4(wm4Var, (byte) 4);
                this.J = true;
                ((fw4) p04Var6.I).collect(rm4Var5, this);
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
                p04 p04Var7 = wm4Var.b.P;
                rm4 rm4Var6 = new rm4(wm4Var, (byte) 5);
                this.J = true;
                ((fw4) p04Var7.I).collect(rm4Var6, this);
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
                p04 p04Var8 = wm4Var.b.l;
                rm4 rm4Var7 = new rm4(wm4Var, (byte) 6);
                this.J = true;
                ((fw4) p04Var8.I).collect(rm4Var7, this);
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
                p04 p04Var9 = wm4Var.b.R;
                rm4 rm4Var8 = new rm4(wm4Var, (byte) 7);
                this.J = true;
                ((fw4) p04Var9.I).collect(rm4Var8, this);
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
                p04 p04Var10 = wm4Var.b.T;
                rm4 rm4Var9 = new rm4(wm4Var, (byte) 8);
                this.J = true;
                ((fw4) p04Var10.I).collect(rm4Var9, this);
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
                p04 p04Var11 = wm4Var.b.V;
                rm4 rm4Var10 = new rm4(wm4Var, (byte) 9);
                this.J = true;
                ((fw4) p04Var11.I).collect(rm4Var10, this);
                return el0Var;
            default:
                boolean z12 = this.J;
                if (z12) {
                    if (z12) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var12 = wm4Var.b.X;
                rm4 rm4Var11 = new rm4(wm4Var, (byte) 10);
                this.J = true;
                ((fw4) p04Var12.I).collect(rm4Var11, this);
                return el0Var;
        }
    }
}
