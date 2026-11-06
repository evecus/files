package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class li1 extends q13 {
    public final ki1 a;

    public li1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ni1 ni1Var = new ni1();
        ni1Var.I = this.a;
        return ni1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li1) && j42.c(this.a, ((li1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("focusRequester");
        z12Var.b().b(this.a, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ni1 ni1Var = (ni1) k13Var;
        ni1Var.I.a.k(ni1Var);
        ki1 ki1Var = this.a;
        ni1Var.I = ki1Var;
        ki1Var.a.c(ni1Var);
    }
}
