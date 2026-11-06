package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bi2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi2(gc4 gc4Var, List list, boolean z, boolean z2, rm1 rm1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = gc4Var;
        this.N = list;
        this.L = z;
        this.M = z2;
        this.O = rm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                bi2 bi2Var = new bi2(this.L, this.M, (ki1) obj3, (ki1) obj2, fj0Var);
                bi2Var.K = obj;
                return bi2Var;
            case 1:
                bi2 bi2Var2 = new bi2(this.L, this.M, (t43) obj2, (ki1) obj3, fj0Var);
                bi2Var2.K = obj;
                return bi2Var2;
            case 2:
                return new bi2((zg2) this.K, (List) obj3, this.L, this.M, (rm1) obj2, fj0Var, (byte) 2);
            default:
                return new bi2((ag2) this.K, (List) obj3, this.L, this.M, (rm1) obj2, fj0Var, (byte) 3);
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
        return ((bi2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        boolean z = this.M;
        boolean z2 = this.L;
        byte b2 = 2;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.O;
        el0 el0Var = el0.I;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.K;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    if (z2) {
                        this.K = dl0Var;
                        this.J = true;
                        if (rt0.n(100L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ki1 ki1Var = (ki1) obj3;
                ki1 ki1Var2 = (ki1) obj2;
                try {
                    if (z) {
                        ki1.a(ki1Var);
                    } else {
                        ki1.a(ki1Var2);
                    }
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
            case 1:
                dl0 dl0Var2 = (dl0) this.K;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    if (((String) ((t43) obj2).getValue()) != null && !z2 && z) {
                        this.K = dl0Var2;
                        this.J = true;
                        if (rt0.n(50L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a((ki1) obj3);
                    break;
                } catch (Throwable unused2) {
                    return wd5Var;
                }
                break;
            case 2:
                List list = (List) obj3;
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    t03 t03Var = new t03(o7.p(wi4.w(new jt2(this.K, (Object) list, (byte) 17))), (byte) 2);
                    sd4 sd4Var = new sd4(list, this.L, this.M, (rm1) obj2, (byte) 1);
                    this.J = true;
                    if (t03Var.collect(sd4Var, this) == el0Var) {
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
            default:
                List list2 = (List) obj3;
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    t03 t03Var2 = new t03(o7.p(wi4.w(new fw3((ag2) this.K, list2, b2))), (byte) 4);
                    sd4 sd4Var2 = new sd4(list2, this.L, this.M, (rm1) obj2, (byte) 3);
                    this.J = true;
                    if (t03Var2.collect(sd4Var2, this) == el0Var) {
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
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(boolean z, boolean z2, ki1 ki1Var, ki1 ki1Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.L = z;
        this.M = z2;
        this.N = ki1Var;
        this.O = ki1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(boolean z, boolean z2, t43 t43Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 1;
        this.L = z;
        this.M = z2;
        this.O = t43Var;
        this.N = ki1Var;
    }
}
