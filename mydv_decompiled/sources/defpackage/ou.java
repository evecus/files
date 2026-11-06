package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ou extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou(Object obj, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.K = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        int i = this.K;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new ou((pu) obj2, i, fj0Var, (byte) 0);
            case 1:
                return new ou((lf2) obj2, i, fj0Var, (byte) 1);
            case 2:
                return new ou((dw4) obj2, i, fj0Var, (byte) 2);
            default:
                return new ou((zd1) obj2, i, fj0Var, (byte) 3);
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
        return ((ou) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        Object[] objArr = 0;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj2 = this.L;
        el0 el0Var = el0.I;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                pu puVar = (pu) obj2;
                boolean z = this.J;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    float h = puVar.R.h();
                    bh a = p70.a(h);
                    float f = 1.0f + h;
                    Float f2 = new Float(h);
                    Float f3 = new Float(f);
                    tm1 tm1Var = p70.F.a;
                    hj hjVar = (hj) tm1Var.invoke(f2);
                    if (hjVar == null) {
                        hjVar = a.g;
                    }
                    hj hjVar2 = (hj) tm1Var.invoke(f3);
                    if (hjVar2 == null) {
                        hjVar2 = a.h;
                    }
                    int b2 = hjVar.b();
                    for (int i2 = 0; i2 < b2; i2++) {
                        if (hjVar.a(i2) > hjVar2.a(i2)) {
                            lr3.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + hjVar + " is greater than upper bound " + hjVar2 + " on index " + i2);
                        }
                    }
                    a.i = hjVar;
                    a.j = hjVar2;
                    if (!((Boolean) a.d.getValue()).booleanValue()) {
                        Object b3 = a.b(a.d());
                        if (!j42.c(b3, a.d())) {
                            a.c.J.setValue(b3);
                        }
                    }
                    Float f4 = new Float(f);
                    d02 R = qb.R(qb.k0(i, 2, m61.b), d44.I, 0L, 4);
                    v1 v1Var = new v1((Object) puVar, (byte) 9);
                    this.J = true;
                    if (bh.a(a, f4, R, null, v1Var, this, 4) == el0Var) {
                        break;
                    }
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    ff2 ff2Var = ((lf2) obj2).J;
                    this.J = true;
                    if (ff2Var.c(i, this) == el0Var) {
                        break;
                    }
                }
                break;
            case 2:
                boolean z3 = this.J;
                if (z3) {
                    if (z3) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    lw3 lw3Var = new lw3(i, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                    this.J = true;
                    Object L = sp0.L((dw4) obj2, lw3Var, this);
                    if (L == el0Var) {
                        break;
                    }
                }
                break;
            default:
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    zd1 zd1Var = (zd1) obj2;
                    to3 to3Var = zd1Var instanceof to3 ? (to3) zd1Var : null;
                    if (to3Var != null) {
                        this.J = true;
                        if (to3Var.h(i, 1, this) == el0Var) {
                            break;
                        }
                    }
                }
                break;
        }
        return el0Var;
    }
}
