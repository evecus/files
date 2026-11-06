package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class s82 extends q13 {
    public final tm1 a;
    public final tm1 b;

    public s82(tm1 tm1Var, tm1 tm1Var2) {
        this.a = tm1Var;
        this.b = tm1Var2;
    }

    @Override // defpackage.q13
    public final k13 create() {
        u82 u82Var = new u82();
        u82Var.I = this.a;
        u82Var.J = this.b;
        return u82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s82)) {
            return false;
        }
        s82 s82Var = (s82) obj;
        return this.a == s82Var.a && this.b == s82Var.b;
    }

    public final int hashCode() {
        tm1 tm1Var = this.a;
        int hashCode = (tm1Var != null ? tm1Var.hashCode() : 0) * 31;
        tm1 tm1Var2 = this.b;
        return hashCode + (tm1Var2 != null ? tm1Var2.hashCode() : 0);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        tm1 tm1Var = this.a;
        if (tm1Var != null) {
            z12Var.d("onKeyEvent");
            z12Var.b().b(tm1Var, "onKeyEvent");
        }
        tm1 tm1Var2 = this.b;
        if (tm1Var2 != null) {
            z12Var.d("onPreviewKeyEvent");
            z12Var.b().b(tm1Var2, "onPreviewKeyEvent");
        }
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        u82 u82Var = (u82) k13Var;
        u82Var.I = this.a;
        u82Var.J = this.b;
    }
}
