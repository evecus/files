package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p03 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ boolean K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p03(boolean z, hu2 hu2Var, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = hu2Var;
        this.M = t43Var;
        this.N = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        boolean z = this.K;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                p03 p03Var = new p03(z, (ki1) obj3, (ki1) obj2, fj0Var);
                p03Var.L = obj;
                return p03Var;
            case 1:
                return new p03((t43) obj3, z, (t33) obj2, fj0Var);
            default:
                return new p03(this.K, (hu2) this.L, (t43) obj3, (t43) obj2, fj0Var);
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
        return ((p03) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        boolean z = this.K;
        Object obj2 = this.M;
        el0 el0Var = el0.I;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.L;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.L = dl0Var;
                    this.J = true;
                    if (rt0.n(300L, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ki1 ki1Var = (ki1) obj2;
                ki1 ki1Var2 = (ki1) obj3;
                if (!z) {
                    ki1Var = ki1Var2;
                }
                try {
                    ki1.a(ki1Var);
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
            case 1:
                t43 t43Var = (t43) obj2;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    vs3 vs3Var = (vs3) t43Var.getValue();
                    if (vs3Var != null) {
                        t33 t33Var = (t33) obj3;
                        c32 ws3Var = z ? new ws3(vs3Var) : new us3(vs3Var);
                        if (t33Var != null) {
                            this.L = t43Var;
                            this.J = true;
                            if (t33Var.a(ws3Var, this) == el0Var) {
                                break;
                            }
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t43Var = (t43) this.L;
                    mu0.V(obj);
                }
                t43Var.setValue(null);
                break;
            default:
                t43 t43Var2 = (t43) obj3;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    if (!((List) ((t43) obj2).getValue()).isEmpty() && !((Boolean) t43Var2.getValue()).booleanValue() && !z) {
                        t43Var2.setValue(Boolean.TRUE);
                        this.J = true;
                        if (rt0.n(500L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ((hu2) this.L).i.p();
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p03(boolean z, ki1 ki1Var, ki1 ki1Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.M = ki1Var;
        this.N = ki1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p03(t43 t43Var, boolean z, t33 t33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = t43Var;
        this.K = z;
        this.N = t33Var;
    }
}
