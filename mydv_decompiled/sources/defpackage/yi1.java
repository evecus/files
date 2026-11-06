package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class yi1 extends q13 {
    public final t33 a;

    public yi1(t33 t33Var) {
        this.a = t33Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new zi1(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi1) {
            return j42.c(this.a, ((yi1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        t33 t33Var = this.a;
        if (t33Var != null) {
            return t33Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("focusable");
        z12Var.b().b(Boolean.TRUE, "enabled");
        z12Var.b().b(this.a, "interactionSource");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((zi1) k13Var).n0(this.a);
    }
}
