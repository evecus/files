package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class pe3 extends q13 {
    public final tm1 a;

    public pe3(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        qe3 qe3Var = new qe3();
        qe3Var.I = this.a;
        return qe3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pe3) {
            return this.a == ((pe3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("onGloballyPositioned");
        z12Var.b().b(this.a, "onGloballyPositioned");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((qe3) k13Var).I = this.a;
    }
}
