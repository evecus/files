package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ga2 extends q13 {
    public final Object a;

    public ga2(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ha2 ha2Var = new ha2();
        ha2Var.I = this.a;
        return ha2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga2) && this.a.equals(((ga2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "layoutId";
        z12Var.b = this.a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((ha2) k13Var).I = this.a;
    }
}
