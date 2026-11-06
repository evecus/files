package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class gh2 extends q13 {
    public final md a;
    public final oh2 b;
    public final u45 c;

    public gh2(md mdVar, oh2 oh2Var, u45 u45Var) {
        this.a = mdVar;
        this.b = oh2Var;
        this.c = u45Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new hh2(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gh2) {
            gh2 gh2Var = (gh2) obj;
            return j42.c(this.a, gh2Var.a) && this.b == gh2Var.b && this.c == gh2Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        hh2 hh2Var = (hh2) k13Var;
        if (hh2Var.isAttached()) {
            hh2Var.I.d();
            hh2Var.I.k(hh2Var);
        }
        hh2Var.I = this.a;
        if (hh2Var.isAttached()) {
            md mdVar = hh2Var.I;
            if (mdVar.a != null) {
                t02.c("Expected textInputModifierNode to be null");
            }
            mdVar.a = hh2Var;
        }
        hh2Var.J = this.b;
        hh2Var.K = this.c;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
