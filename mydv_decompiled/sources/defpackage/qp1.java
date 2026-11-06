package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qp1 extends k05 implements jn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ vo K;
    public /* synthetic */ boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp1(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = 4;
        vo voVar = (vo) obj2;
        Boolean bool = (Boolean) obj3;
        switch (b) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                qp1 qp1Var = new qp1(i, (fj0) obj4, (byte) 0);
                qp1Var.K = voVar;
                qp1Var.L = booleanValue;
                return qp1Var.invokeSuspend(wd5Var);
            default:
                boolean booleanValue2 = bool.booleanValue();
                qp1 qp1Var2 = new qp1(i, (fj0) obj4, (byte) 1);
                qp1Var2.K = voVar;
                qp1Var2.L = booleanValue2;
                return qp1Var2.invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                wd5 wd5Var = wd5.a;
                if (!z) {
                    mu0.V(obj);
                    vo voVar = this.K;
                    if (this.L) {
                        this.J = true;
                        Object e = voVar.e(po.a, this);
                        if (e != el0Var) {
                            e = wd5Var;
                        }
                        if (e == el0Var) {
                            return el0Var;
                        }
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    vo voVar2 = this.K;
                    if (!this.L) {
                        this.J = true;
                        Object f = voVar2.f(this);
                        return f == el0Var ? el0Var : f;
                    }
                } else {
                    if (z2) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
