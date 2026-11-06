package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oo0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ ki1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo0(ki1 ki1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                oo0 oo0Var = new oo0(this.L, fj0Var, (byte) 0);
                oo0Var.K = obj;
                return oo0Var;
            case 1:
                oo0 oo0Var2 = new oo0(this.L, fj0Var, (byte) 1);
                oo0Var2.K = obj;
                return oo0Var2;
            case 2:
                oo0 oo0Var3 = new oo0(this.L, fj0Var, (byte) 2);
                oo0Var3.K = obj;
                return oo0Var3;
            case 3:
                oo0 oo0Var4 = new oo0(this.L, fj0Var, (byte) 3);
                oo0Var4.K = obj;
                return oo0Var4;
            case 4:
                oo0 oo0Var5 = new oo0(this.L, fj0Var, (byte) 4);
                oo0Var5.K = obj;
                return oo0Var5;
            case 5:
                oo0 oo0Var6 = new oo0(this.L, fj0Var, (byte) 5);
                oo0Var6.K = obj;
                return oo0Var6;
            case 6:
                oo0 oo0Var7 = new oo0(this.L, fj0Var, (byte) 6);
                oo0Var7.K = obj;
                return oo0Var7;
            case 7:
                oo0 oo0Var8 = new oo0(this.L, fj0Var, (byte) 7);
                oo0Var8.K = obj;
                return oo0Var8;
            case 8:
                oo0 oo0Var9 = new oo0(this.L, fj0Var, (byte) 8);
                oo0Var9.K = obj;
                return oo0Var9;
            case 9:
                oo0 oo0Var10 = new oo0(this.L, fj0Var, (byte) 9);
                oo0Var10.K = obj;
                return oo0Var10;
            case 10:
                oo0 oo0Var11 = new oo0(this.L, fj0Var, (byte) 10);
                oo0Var11.K = obj;
                return oo0Var11;
            case 11:
                oo0 oo0Var12 = new oo0(this.L, fj0Var, (byte) 11);
                oo0Var12.K = obj;
                return oo0Var12;
            case 12:
                oo0 oo0Var13 = new oo0(this.L, fj0Var, (byte) 12);
                oo0Var13.K = obj;
                return oo0Var13;
            case 13:
                oo0 oo0Var14 = new oo0(this.L, fj0Var, (byte) 13);
                oo0Var14.K = obj;
                return oo0Var14;
            case 14:
                oo0 oo0Var15 = new oo0(this.L, fj0Var, (byte) 14);
                oo0Var15.K = obj;
                return oo0Var15;
            case 15:
                oo0 oo0Var16 = new oo0(this.L, fj0Var, (byte) 15);
                oo0Var16.K = obj;
                return oo0Var16;
            case 16:
                oo0 oo0Var17 = new oo0(this.L, fj0Var, (byte) 16);
                oo0Var17.K = obj;
                return oo0Var17;
            case 17:
                oo0 oo0Var18 = new oo0(this.L, fj0Var, (byte) 17);
                oo0Var18.K = obj;
                return oo0Var18;
            case 18:
                oo0 oo0Var19 = new oo0(this.L, fj0Var, (byte) 18);
                oo0Var19.K = obj;
                return oo0Var19;
            case 19:
                oo0 oo0Var20 = new oo0(this.L, fj0Var, (byte) 19);
                oo0Var20.K = obj;
                return oo0Var20;
            default:
                oo0 oo0Var21 = new oo0(this.L, fj0Var, (byte) 20);
                oo0Var21.K = obj;
                return oo0Var21;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((oo0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.K;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.K = dl0Var;
                    this.J = true;
                    if (rt0.n(150L, this) == el0Var) {
                        break;
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
                    this.K = dl0Var2;
                    this.J = true;
                    if (rt0.n(500L, this) == el0Var) {
                        break;
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
            case 2:
                dl0 dl0Var3 = (dl0) this.K;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    this.K = dl0Var3;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
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
            case 3:
                dl0 dl0Var4 = (dl0) this.K;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    this.K = dl0Var4;
                    this.J = true;
                    if (rt0.n(32L, this) == el0Var) {
                        break;
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused4) {
                    return wd5Var;
                }
            case 4:
                dl0 dl0Var5 = (dl0) this.K;
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    this.K = dl0Var5;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
                    }
                } else if (!z5) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused5) {
                    return wd5Var;
                }
            case 5:
                dl0 dl0Var6 = (dl0) this.K;
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    this.K = dl0Var6;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z6) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused6) {
                    return wd5Var;
                }
            case 6:
                dl0 dl0Var7 = (dl0) this.K;
                boolean z7 = this.J;
                if (!z7) {
                    mu0.V(obj);
                    this.K = dl0Var7;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z7) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused7) {
                    return wd5Var;
                }
            case 7:
                dl0 dl0Var8 = (dl0) this.K;
                boolean z8 = this.J;
                if (!z8) {
                    mu0.V(obj);
                    this.K = dl0Var8;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
                    }
                } else if (!z8) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused8) {
                    return wd5Var;
                }
            case 8:
                dl0 dl0Var9 = (dl0) this.K;
                boolean z9 = this.J;
                if (!z9) {
                    mu0.V(obj);
                    this.K = dl0Var9;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z9) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused9) {
                    return wd5Var;
                }
            case 9:
                dl0 dl0Var10 = (dl0) this.K;
                boolean z10 = this.J;
                if (!z10) {
                    mu0.V(obj);
                    this.K = dl0Var10;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z10) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused10) {
                    return wd5Var;
                }
            case 10:
                dl0 dl0Var11 = (dl0) this.K;
                boolean z11 = this.J;
                if (!z11) {
                    mu0.V(obj);
                    this.K = dl0Var11;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
                    }
                } else if (!z11) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused11) {
                    return wd5Var;
                }
            case 11:
                dl0 dl0Var12 = (dl0) this.K;
                boolean z12 = this.J;
                if (!z12) {
                    mu0.V(obj);
                    this.K = dl0Var12;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
                    }
                } else if (!z12) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused12) {
                    return wd5Var;
                }
            case 12:
                dl0 dl0Var13 = (dl0) this.K;
                boolean z13 = this.J;
                if (!z13) {
                    mu0.V(obj);
                    this.K = dl0Var13;
                    this.J = true;
                    if (rt0.n(120L, this) == el0Var) {
                        break;
                    }
                } else if (!z13) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused13) {
                    return wd5Var;
                }
            case 13:
                zf1 zf1Var = (zf1) this.K;
                boolean z14 = this.J;
                if (!z14) {
                    mu0.V(obj);
                    w73 w73Var = w73.L;
                    this.K = null;
                    this.J = true;
                    if (zf1Var.collect(w73Var, this) == el0Var) {
                        break;
                    }
                } else if (!z14) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused14) {
                    return wd5Var;
                }
            case 14:
                dl0 dl0Var14 = (dl0) this.K;
                boolean z15 = this.J;
                if (!z15) {
                    mu0.V(obj);
                    this.K = dl0Var14;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z15) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused15) {
                    return wd5Var;
                }
            case 15:
                dl0 dl0Var15 = (dl0) this.K;
                boolean z16 = this.J;
                if (!z16) {
                    mu0.V(obj);
                    this.K = dl0Var15;
                    this.J = true;
                    if (rt0.n(100L, this) == el0Var) {
                        break;
                    }
                } else if (!z16) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused16) {
                    return wd5Var;
                }
            case 16:
                dl0 dl0Var16 = (dl0) this.K;
                boolean z17 = this.J;
                if (!z17) {
                    mu0.V(obj);
                    this.K = dl0Var16;
                    this.J = true;
                    if (rt0.n(80L, this) == el0Var) {
                        break;
                    }
                } else if (!z17) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused17) {
                    return wd5Var;
                }
            case 17:
                dl0 dl0Var17 = (dl0) this.K;
                boolean z18 = this.J;
                if (!z18) {
                    mu0.V(obj);
                    this.K = dl0Var17;
                    this.J = true;
                    if (rt0.n(50L, this) == el0Var) {
                        break;
                    }
                } else if (!z18) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused18) {
                    return wd5Var;
                }
            case 18:
                dl0 dl0Var18 = (dl0) this.K;
                boolean z19 = this.J;
                if (!z19) {
                    mu0.V(obj);
                    this.K = dl0Var18;
                    this.J = true;
                    if (rt0.n(80L, this) == el0Var) {
                        break;
                    }
                } else if (!z19) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused19) {
                    return wd5Var;
                }
            case 19:
                dl0 dl0Var19 = (dl0) this.K;
                boolean z20 = this.J;
                if (!z20) {
                    mu0.V(obj);
                    this.K = dl0Var19;
                    this.J = true;
                    if (rt0.n(150L, this) == el0Var) {
                        break;
                    }
                } else if (!z20) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused20) {
                    return wd5Var;
                }
            default:
                dl0 dl0Var20 = (dl0) this.K;
                boolean z21 = this.J;
                if (!z21) {
                    mu0.V(obj);
                    this.K = dl0Var20;
                    this.J = true;
                    if (rt0.n(100L, this) == el0Var) {
                        break;
                    }
                } else if (!z21) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused21) {
                    return wd5Var;
                }
        }
        return wd5Var;
    }
}
