package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x95 implements cw4 {
    public final ba5 I;
    public tm1 J;
    public tm1 K;
    public final /* synthetic */ y95 L;

    public x95(y95 y95Var, ba5 ba5Var, tm1 tm1Var, tm1 tm1Var2) {
        this.L = y95Var;
        this.I = ba5Var;
        this.J = tm1Var;
        this.K = tm1Var2;
    }

    public final void c(z95 z95Var, Object obj, hj hjVar) {
        Object invoke = this.K.invoke(z95Var.d());
        boolean i = this.L.c.i();
        ba5 ba5Var = this.I;
        if (i) {
            ba5Var.h(this.K.invoke(z95Var.b()), invoke, (ve1) this.J.invoke(z95Var));
        } else {
            ba5Var.i(invoke, (ve1) this.J.invoke(z95Var), obj, hjVar);
        }
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        c(this.L.c.g(), null, null);
        return this.I.R.getValue();
    }
}
