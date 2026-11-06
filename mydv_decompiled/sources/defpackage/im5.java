package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class im5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ long L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im5(long j, rm1 rm1Var, fk3 fk3Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = j;
        this.M = rm1Var;
        this.N = fk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                im5 im5Var = new im5(this.L, (rm1) obj3, (fk3) obj2, fj0Var, (byte) 0);
                im5Var.K = obj;
                return im5Var;
            case 1:
                im5 im5Var2 = new im5(this.L, (rm1) obj3, (fk3) obj2, fj0Var, (byte) 1);
                im5Var2.K = obj;
                return im5Var2;
            default:
                im5 im5Var3 = new im5((oc4) obj3, this.L, (o24) obj2, fj0Var);
                im5Var3.K = obj;
                return im5Var3;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((im5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((im5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((im5) create((mc4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.N;
        el0 el0Var = el0.I;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.K;
                boolean z = this.J;
                long j = this.L;
                if (!z) {
                    mu0.V(obj);
                    if (j <= 0) {
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                while (i42.u0(dl0Var)) {
                    hm5 hm5Var = new hm5((rm1) obj3, j, (fk3) obj2, (byte) 0);
                    this.K = dl0Var;
                    this.J = true;
                    if (ut0.e0(hm5Var, this) == el0Var) {
                        break;
                    }
                }
                break;
            case 1:
                dl0 dl0Var2 = (dl0) this.K;
                boolean z2 = this.J;
                long j2 = this.L;
                if (!z2) {
                    mu0.V(obj);
                    if (j2 <= 0) {
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                while (i42.u0(dl0Var2)) {
                    hm5 hm5Var2 = new hm5((rm1) obj3, j2, (fk3) obj2, (byte) 1);
                    this.K = dl0Var2;
                    this.J = true;
                    if (ut0.e0(hm5Var2, this) == el0Var) {
                        break;
                    }
                }
                break;
            default:
                oc4 oc4Var = (oc4) obj3;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    mc4 mc4Var = (mc4) this.K;
                    float h = oc4Var.h(this.L);
                    tf tfVar = new tf((o24) obj2, oc4Var, mc4Var, (byte) 12);
                    this.J = true;
                    if (ad4.b(0.0f, h, null, tfVar, this, 12) == el0Var) {
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
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im5(oc4 oc4Var, long j, o24 o24Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.M = oc4Var;
        this.L = j;
        this.N = o24Var;
    }
}
