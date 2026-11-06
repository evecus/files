package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bv1 extends q13 {
    @Override // defpackage.q13
    public final k13 create() {
        tv tvVar = q8.W;
        cv1 cv1Var = new cv1();
        cv1Var.I = tvVar;
        return cv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bv1 ? (bv1) obj : null) == null) {
            return false;
        }
        tv tvVar = q8.W;
        return tvVar.equals(tvVar);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "align";
        z12Var.b = q8.W;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((cv1) k13Var).I = q8.W;
    }
}
