package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sc2 extends q13 {
    public final float a;
    public final boolean b;

    public sc2(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.q13
    public final k13 create() {
        tc2 tc2Var = new tc2();
        tc2Var.I = this.a;
        tc2Var.J = this.b;
        return tc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        sc2 sc2Var = obj instanceof sc2 ? (sc2) obj : null;
        return sc2Var != null && this.a == sc2Var.a && this.b == sc2Var.b;
    }

    public final int hashCode() {
        return pt1.o(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("weight");
        float f = this.a;
        z12Var.e(Float.valueOf(f));
        z12Var.b().b(Float.valueOf(f), "weight");
        z12Var.b().b(Boolean.valueOf(this.b), "fill");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        tc2 tc2Var = (tc2) k13Var;
        tc2Var.I = this.a;
        tc2Var.J = this.b;
    }
}
