package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f94 implements k34 {
    public z94 I;
    public j94 J;
    public String K;
    public Object L;
    public Object[] M;
    public i94 N;
    public final eq O = new eq(this, 28);

    public f94(z94 z94Var, j94 j94Var, String str, Object obj, Object[] objArr) {
        this.I = z94Var;
        this.J = j94Var;
        this.K = str;
        this.L = obj;
        this.M = objArr;
    }

    public final void a() {
        String B;
        j94 j94Var = this.J;
        i94 i94Var = this.N;
        if (i94Var != null) {
            s83.j(i94Var, ") is not null", "entry(");
            return;
        }
        if (j94Var != null) {
            eq eqVar = this.O;
            Object invoke = eqVar.invoke();
            if (invoke == null || j94Var.c(invoke)) {
                this.N = j94Var.a(this.K, eqVar);
                return;
            }
            if (invoke instanceof bt4) {
                bt4 bt4Var = (bt4) invoke;
                if (bt4Var.b() == q8.v0 || bt4Var.b() == q8.B0 || bt4Var.b() == q8.y0) {
                    B = "MutableState containing " + bt4Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    B = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                B = ut0.B(invoke);
            }
            throw new IllegalArgumentException(B);
        }
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
        i94 i94Var = this.N;
        if (i94Var != null) {
            ((pn) i94Var).Z();
        }
    }

    @Override // defpackage.k34
    public final void onForgotten() {
        i94 i94Var = this.N;
        if (i94Var != null) {
            ((pn) i94Var).Z();
        }
    }

    @Override // defpackage.k34
    public final void onRemembered() {
        a();
    }
}
