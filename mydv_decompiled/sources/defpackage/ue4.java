package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ue4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ ye4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue4(ye4 ye4Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = ye4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        ye4 ye4Var = this.K;
        switch (b) {
            case 0:
                return new ue4(ye4Var, fj0Var, (byte) 0);
            case 1:
                return new ue4(ye4Var, fj0Var, (byte) 1);
            default:
                return new ue4(ye4Var, fj0Var, (byte) 2);
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
                ((ue4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((ue4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((ue4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return el0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        ye4 ye4Var = this.K;
        el0 el0Var = el0.I;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    n04 n04Var = ye4Var.d.f;
                    te4 te4Var = new te4(ye4Var, (byte) 0);
                    this.J = true;
                    if (n04Var.I.collect(te4Var, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    n04 n04Var2 = ye4Var.d.h;
                    te4 te4Var2 = new te4(ye4Var, b2);
                    this.J = true;
                    if (n04Var2.I.collect(te4Var2, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
            default:
                boolean z3 = this.J;
                if (z3) {
                    if (z3) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var = ye4Var.F;
                te4 te4Var3 = new te4(ye4Var, (byte) 2);
                this.J = true;
                ((fw4) p04Var.I).collect(te4Var3, this);
                return el0Var;
        }
    }
}
