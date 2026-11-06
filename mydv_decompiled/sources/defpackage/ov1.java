package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ov1 extends q13 {
    public final t33 a;

    public ov1(t33 t33Var) {
        this.a = t33Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        sv1 sv1Var = new sv1();
        sv1Var.I = this.a;
        return sv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov1) && j42.c(((ov1) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "hoverable";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "interactionSource");
        fqVar.b(Boolean.TRUE, "enabled");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        sv1 sv1Var = (sv1) k13Var;
        t33 t33Var = sv1Var.I;
        t33 t33Var2 = this.a;
        if (j42.c(t33Var, t33Var2)) {
            return;
        }
        sv1Var.l0();
        sv1Var.I = t33Var2;
    }
}
