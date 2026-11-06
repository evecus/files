package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                return new p((s) obj2, fj0Var, (byte) 0);
            case 1:
                return new p((zi1) obj2, fj0Var, (byte) 1);
            case 2:
                return new p((bh) obj2, fj0Var, (byte) 2);
            case 3:
                return new p((ue) obj2, fj0Var, (byte) 3);
            default:
                return new p((jj3) obj2, fj0Var, (byte) 4);
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
        return ((p) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        Object obj2 = this.K;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    s sVar = (s) obj2;
                    this.J = true;
                    Object D0 = p70.D0(sVar.b, new n(sVar, fj0Var, (byte) 0), this);
                    if (D0 == el0Var) {
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
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    if (mw2.r((zi1) obj2, null, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            case 2:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    Float f = new Float(360.0f);
                    d02 R = qb.R(qb.k0(4666, 2, m61.b), d44.I, 0L, 4);
                    this.J = true;
                    if (bh.a((bh) obj2, f, R, null, null, this, 12) == el0Var) {
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
            case 3:
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    bh bhVar = ((ue) obj2).P;
                    Float f2 = new Float(0.0f);
                    this.J = true;
                    if (bhVar.e(this, f2) == el0Var) {
                        break;
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                jj3 jj3Var = (jj3) obj2;
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    w84 w = wi4.w(new ej3(jj3Var, (byte) 3));
                    cg5 cg5Var = new cg5(jj3Var, (byte) 1);
                    this.J = true;
                    if (w.collect(cg5Var, this) == el0Var) {
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
        }
        return el0Var;
    }
}
