package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ dl0 M;
    public final /* synthetic */ bh N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(rm1 rm1Var, dl0 dl0Var, bh bhVar, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = rm1Var;
        this.M = dl0Var;
        this.N = bhVar;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                wu1 wu1Var = new wu1(this.L, this.M, this.N, fj0Var, (byte) 0);
                wu1Var.K = obj;
                return wu1Var;
            default:
                wu1 wu1Var2 = new wu1(this.L, this.M, this.N, fj0Var, (byte) 1);
                wu1Var2.K = obj;
                return wu1Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        zf1 zf1Var = (zf1) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((wu1) create(zf1Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        dl0 dl0Var = this.M;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.L;
        el0 el0Var = el0.I;
        bh bhVar = this.N;
        byte b2 = 1;
        fj0 fj0Var = null;
        byte b3 = 0;
        switch (b) {
            case 0:
                zf1 zf1Var = (zf1) this.K;
                boolean z = this.J;
                try {
                    if (!z) {
                        mu0.V(obj);
                        uu1 uu1Var = new uu1(bhVar, (byte) 0);
                        this.K = null;
                        this.J = true;
                        if (zf1Var.collect(uu1Var, this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    try {
                        rm1Var.invoke();
                        return wd5Var;
                    } catch (Throwable th) {
                        th = th;
                        if (b2 == 0) {
                            p70.g0(dl0Var, null, null, new vu1(bhVar, fj0Var, b3), 3);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    b2 = 0;
                }
            default:
                zf1 zf1Var2 = (zf1) this.K;
                boolean z2 = this.J;
                try {
                    if (!z2) {
                        mu0.V(obj);
                        uu1 uu1Var2 = new uu1(bhVar, (byte) 1);
                        this.K = null;
                        this.J = true;
                        if (zf1Var2.collect(uu1Var2, this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z2) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    try {
                        rm1Var.invoke();
                        return wd5Var;
                    } catch (Throwable th3) {
                        th = th3;
                        b3 = 1;
                        if (b3 == 0) {
                            p70.g0(dl0Var, null, null, new vu1(bhVar, fj0Var, b2), 3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }
}
