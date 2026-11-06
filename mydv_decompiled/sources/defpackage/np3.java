package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class np3 extends q13 {
    public final ge a;

    public np3(ge geVar) {
        this.a = geVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new op3(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np3) && this.a.equals(((np3) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "pointerHoverIcon";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "icon");
        fqVar.b(Boolean.FALSE, "overrideDescendants");
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        op3 op3Var = (op3) k13Var;
        ge geVar = op3Var.J;
        ge geVar2 = this.a;
        if (j42.c(geVar, geVar2)) {
            return;
        }
        op3Var.J = geVar2;
        if (op3Var.K) {
            op3Var.l0();
        }
    }
}
