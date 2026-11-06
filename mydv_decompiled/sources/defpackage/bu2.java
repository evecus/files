package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bu2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ hu2 K;
    public final /* synthetic */ Application L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu2(hu2 hu2Var, Application application, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = hu2Var;
        this.L = application;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Application application = this.L;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                return new bu2(hu2Var, application, fj0Var, (byte) 0);
            case 1:
                return new bu2(hu2Var, application, fj0Var, (byte) 1);
            case 2:
                return new bu2(hu2Var, application, fj0Var, (byte) 2);
            case 3:
                return new bu2(hu2Var, application, fj0Var, (byte) 3);
            case 4:
                return new bu2(hu2Var, application, fj0Var, (byte) 4);
            case 5:
                return new bu2(hu2Var, application, fj0Var, (byte) 5);
            default:
                return new bu2(hu2Var, application, fj0Var, (byte) 6);
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
                return ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                return ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 2:
                ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            case 3:
                ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            case 4:
                ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            case 5:
                ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            default:
                return ((bu2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Application application = this.L;
        hu2 hu2Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var = hu2Var.d.j0;
                au2 au2Var = new au2(application, (byte) 0);
                this.J = true;
                p04Var.collect(new jy0(new p24(), au2Var), this);
                return el0Var;
            case 1:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var2 = hu2Var.d.h0;
                au2 au2Var2 = new au2(application, (byte) 1);
                this.J = true;
                p04Var2.collect(new jy0(new p24(), au2Var2), this);
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
                p04 p04Var3 = hu2Var.p.j0;
                au2 au2Var3 = new au2(application, (byte) 2);
                this.J = true;
                ((fw4) p04Var3.I).collect(au2Var3, this);
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
                p04 p04Var4 = hu2Var.p.t0;
                y30 y30Var = new y30(hu2Var, (Object) application, (byte) 7);
                this.J = true;
                ((fw4) p04Var4.I).collect(y30Var, this);
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
                p04 p04Var5 = hu2Var.o.H;
                au2 au2Var4 = new au2(application, (byte) 3);
                this.J = true;
                ((fw4) p04Var5.I).collect(au2Var4, this);
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
                p04 p04Var6 = hu2Var.n.j;
                au2 au2Var5 = new au2(application, (byte) 4);
                this.J = true;
                ((fw4) p04Var6.I).collect(au2Var5, this);
                return el0Var;
            default:
                boolean z7 = this.J;
                if (z7) {
                    if (z7) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                wm4 wm4Var = hu2Var.h;
                p04 p04Var7 = wm4Var.z;
                p04 p04Var8 = wm4Var.B;
                p04 p04Var9 = wm4Var.D;
                cu2 cu2Var = new cu2(4, null);
                zf1[] zf1VarArr = {p04Var7, p04Var8, p04Var9};
                au2 au2Var6 = new au2(application, (byte) 5);
                this.J = true;
                ia0 ia0Var = new ia0(zf1VarArr, as.L, new ah1(null, cu2Var), new jy0(new p24(), au2Var6), null);
                bg1 bg1Var = new bg1(this, getContext());
                Object s = oh4.s(bg1Var, true, bg1Var, ia0Var);
                if (s != el0Var) {
                    s = wd5Var;
                }
                if (s != el0Var) {
                    s = wd5Var;
                }
                if (s != el0Var) {
                    s = wd5Var;
                }
                return s == el0Var ? el0Var : wd5Var;
        }
    }
}
