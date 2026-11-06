package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f64 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public float J;
    public boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f64(ue ueVar, float f, bj bjVar, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = ueVar;
        this.J = f;
        this.M = bjVar;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                return new f64((ue) this.L, this.J, (bj) obj2, fj0Var);
            default:
                f64 f64Var = new f64((ea5) obj2, fj0Var);
                f64Var.L = obj;
                return f64Var;
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
        return ((f64) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        final float r;
        dl0 dl0Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.K;
                if (!z) {
                    mu0.V(obj);
                    this.K = true;
                    if (bh.a(((ue) this.L).O, new Float(this.J), (bj) obj2, null, null, this, 12) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.K;
                if (!z2) {
                    mu0.V(obj);
                    dl0 dl0Var2 = (dl0) this.L;
                    r = ad4.r(dl0Var2.getCoroutineContext());
                    dl0Var = dl0Var2;
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    r = this.J;
                    dl0Var = (dl0) this.L;
                    mu0.V(obj);
                }
                while (i42.u0(dl0Var)) {
                    final ea5 ea5Var = (ea5) obj2;
                    tm1 tm1Var = new tm1() { // from class: ca5
                        @Override // defpackage.tm1
                        public final Object invoke(Object obj3) {
                            long longValue = ((Long) obj3).longValue();
                            ea5 ea5Var2 = ea5.this;
                            boolean i = ea5Var2.i();
                            hk3 hk3Var = ea5Var2.h;
                            if (!i) {
                                if (hk3Var.h() == Long.MIN_VALUE) {
                                    hk3Var.i(longValue);
                                    ((jk3) ea5Var2.a.a).setValue(Boolean.TRUE);
                                }
                                long h = longValue - hk3Var.h();
                                float f = r;
                                if (f != 0.0f) {
                                    h = mw2.Q(h / f);
                                }
                                ea5Var2.p(h);
                                ea5Var2.j(h, f == 0.0f);
                            }
                            return wd5.a;
                        }
                    };
                    this.L = dl0Var;
                    this.J = r;
                    this.K = true;
                    if (ut0.E(getContext()).E(tm1Var, this) == el0Var) {
                        break;
                    }
                }
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f64(ea5 ea5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = ea5Var;
    }
}
