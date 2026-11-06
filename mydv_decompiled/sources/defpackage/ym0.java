package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ym0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ tm1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym0(byte b, fj0 fj0Var, tm1 tm1Var) {
        super(2, fj0Var);
        this.I = b;
        this.K = tm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        tm1 tm1Var = this.K;
        switch (b) {
            case 0:
                ym0 ym0Var = new ym0((byte) 0, fj0Var, tm1Var);
                ym0Var.J = obj;
                return ym0Var;
            default:
                ym0 ym0Var2 = new ym0((byte) 1, fj0Var, tm1Var);
                ym0Var2.J = obj;
                return ym0Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        lq3 lq3Var = (lq3) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ym0) create(lq3Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        tm1 tm1Var = this.K;
        mu0.V(obj);
        lq3 lq3Var = (lq3) this.J;
        switch (b) {
            case 0:
                lq3Var.getClass();
                break;
            default:
                lq3Var.getClass();
                break;
        }
        return tm1Var.invoke(lq3Var.c());
    }
}
