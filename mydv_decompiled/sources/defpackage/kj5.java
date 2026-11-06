package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kj5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj5(t43 t43Var, t43 t43Var2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = t43Var;
        this.K = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                return new kj5(t43Var2, t43Var, fj0Var, (byte) 0);
            default:
                return new kj5(t43Var2, t43Var, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((kj5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((kj5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                Boolean bool = (Boolean) t43Var2.getValue();
                bool.booleanValue();
                t43Var.setValue(bool);
                break;
            default:
                mu0.V(obj);
                if (((Number) t43Var2.getValue()).intValue() > 0) {
                    t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
