package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class wx0 extends q13 {
    public final ie2 a;

    public wx0(ie2 ie2Var) {
        this.a = ie2Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        xx0 xx0Var = new xx0();
        xx0Var.I = this.a;
        return xx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx0) && j42.c(this.a, ((wx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "DisplayingDisappearingItemsElement";
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        xx0 xx0Var = (xx0) k13Var;
        ie2 ie2Var = xx0Var.I;
        ie2 ie2Var2 = this.a;
        if (j42.c(ie2Var, ie2Var2) || !xx0Var.getNode().isAttached()) {
            return;
        }
        ie2 ie2Var3 = xx0Var.I;
        ie2Var3.d();
        ie2Var3.c = null;
        ie2Var2.getClass();
        xx0Var.I = ie2Var2;
    }
}
