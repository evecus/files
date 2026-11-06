package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class f42 extends q13 {
    @Override // defpackage.q13
    public final k13 create() {
        h42 h42Var = new h42();
        h42Var.I = d42.J;
        h42Var.J = true;
        return h42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f42 ? (f42) obj : null) != null;
    }

    public final int hashCode() {
        return (d42.J.hashCode() * 31) + 1231;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        h42 h42Var = (h42) k13Var;
        h42Var.I = d42.J;
        h42Var.J = true;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
