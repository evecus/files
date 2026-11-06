package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y95 {
    public final ub5 a;
    public final jk3 b = ad4.w(null);
    public final /* synthetic */ ea5 c;

    public y95(ea5 ea5Var, ub5 ub5Var, String str) {
        this.c = ea5Var;
        this.a = ub5Var;
    }

    public final x95 a(tm1 tm1Var, Object obj, hj hjVar, tm1 tm1Var2) {
        jk3 jk3Var = this.b;
        x95 x95Var = (x95) jk3Var.getValue();
        ea5 ea5Var = this.c;
        if (x95Var == null) {
            Object invoke = tm1Var2.invoke(ea5Var.a.d());
            Object invoke2 = tm1Var2.invoke(ea5Var.a.d());
            ub5 ub5Var = this.a;
            hj hjVar2 = (hj) ub5Var.a.invoke(invoke2);
            hjVar2.d();
            ba5 ba5Var = new ba5(ea5Var, invoke, hjVar2, ub5Var);
            x95Var = new x95(this, ba5Var, tm1Var, tm1Var2);
            jk3Var.setValue(x95Var);
            ea5Var.j.add(ba5Var);
        }
        x95Var.K = tm1Var2;
        x95Var.J = tm1Var;
        x95Var.c(ea5Var.g(), obj, hjVar);
        return x95Var;
    }
}
