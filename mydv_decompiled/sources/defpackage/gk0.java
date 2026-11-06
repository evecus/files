package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gk0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ xp3 K;
    public final /* synthetic */ s35 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk0(xp3 xp3Var, s35 s35Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = xp3Var;
        this.L = s35Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new gk0(this.K, this.L, fj0Var, (byte) 0);
            case 1:
                return new gk0(this.K, this.L, fj0Var, (byte) 1);
            default:
                return new gk0(this.K, this.L, fj0Var, (byte) 2);
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
        return ((gk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        s35 s35Var = this.L;
        xp3 xp3Var = this.K;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    Object o0 = i42.o0(new q30(xp3Var, s35Var, fj0Var, (byte) 6), this);
                    if (o0 != el0Var) {
                        o0 = wd5Var;
                    }
                    if (o0 == el0Var) {
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    Object k = e21.k(xp3Var, new uk1(s35Var, null), this);
                    if (k != el0Var) {
                        k = wd5Var;
                    }
                    if (k == el0Var) {
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            default:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    this.J = true;
                    ur2 ur2Var = new ur2(s35Var, (byte) 0);
                    vr2 vr2Var = new vr2(s35Var, (byte) 0);
                    vr2 vr2Var2 = new vr2(s35Var, (byte) 1);
                    rd rdVar = new rd(s35Var, (byte) 9);
                    float f = z21.a;
                    Object k2 = e21.k(xp3Var, new v21(new df0((byte) 13), new j10(ur2Var, (byte) 4), rdVar, vr2Var2, new v1(vr2Var, (byte) 17), (fj0) null), this);
                    if (k2 != el0Var) {
                        k2 = wd5Var;
                    }
                    if (k2 != el0Var) {
                        k2 = wd5Var;
                    }
                    if (k2 != el0Var) {
                        k2 = wd5Var;
                    }
                    if (k2 == el0Var) {
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
        }
        return wd5Var;
    }
}
