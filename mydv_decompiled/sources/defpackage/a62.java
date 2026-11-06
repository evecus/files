package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a62 extends k10 {
    public final e62 Q;

    public a62(fj0 fj0Var, e62 e62Var) {
        super(1, fj0Var);
        this.Q = e62Var;
    }

    @Override // defpackage.k10
    public final Throwable q(e62 e62Var) {
        Throwable c;
        Object H = this.Q.H();
        return (!(H instanceof c62) || (c = ((c62) H).c()) == null) ? H instanceof ub0 ? ((ub0) H).a : e62Var.t() : c;
    }

    @Override // defpackage.k10
    public final String z() {
        return "AwaitContinuation";
    }
}
