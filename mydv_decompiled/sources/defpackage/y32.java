package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class y32 extends q13 {
    @Override // defpackage.q13
    public final k13 create() {
        z32 z32Var = new z32();
        z32Var.I = d42.I;
        z32Var.J = true;
        return z32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y32 ? (y32) obj : null) != null;
    }

    public final int hashCode() {
        return (d42.I.hashCode() * 31) + 1231;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        z32 z32Var = (z32) k13Var;
        z32Var.I = d42.I;
        z32Var.J = true;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
