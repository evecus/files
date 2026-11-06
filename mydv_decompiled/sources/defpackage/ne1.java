package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ne1 extends q13 {
    public final jx0 a;
    public final float b;
    public final String c;

    public ne1(jx0 jx0Var, float f, String str) {
        this.a = jx0Var;
        this.b = f;
        this.c = str;
    }

    @Override // defpackage.q13
    public final k13 create() {
        oe1 oe1Var = new oe1();
        oe1Var.I = this.a;
        oe1Var.J = this.b;
        return oe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne1)) {
            return false;
        }
        ne1 ne1Var = (ne1) obj;
        return this.a == ne1Var.a && this.b == ne1Var.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d(this.c);
        z12Var.b().b(Float.valueOf(this.b), "fraction");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        oe1 oe1Var = (oe1) k13Var;
        oe1Var.I = this.a;
        oe1Var.J = this.b;
    }
}
