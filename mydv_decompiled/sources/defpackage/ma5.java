package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ma5 extends q13 {
    public final bf2 a;

    public ma5(bf2 bf2Var) {
        this.a = bf2Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        na5 na5Var = new na5();
        na5Var.I = this.a;
        return na5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma5) && j42.c(this.a, ((ma5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("traversablePrefetchState");
        z12Var.e(this.a);
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((na5) k13Var).I = this.a;
    }
}
