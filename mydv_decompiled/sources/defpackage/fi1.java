package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class fi1 extends q13 {
    public final hi1 a;

    public fi1(hi1 hi1Var) {
        this.a = hi1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ji1 ji1Var = new ji1();
        ji1Var.I = this.a;
        return ji1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi1) && this.a.equals(((fi1) obj).a);
    }

    public final int hashCode() {
        return this.a.I.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "focusProperties";
        z12Var.c.b(this.a, "scope");
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((ji1) k13Var).I = this.a;
    }
}
