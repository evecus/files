package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class c16 extends q13 {
    public final float a;
    public final Object b;

    public c16(Object obj, float f) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.q13
    public final k13 create() {
        d16 d16Var = new d16();
        d16Var.I = this.a;
        d16Var.J = this.b;
        return d16Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c16)) {
            return false;
        }
        c16 c16Var = (c16) obj;
        return c16Var.a == this.a && j42.c(c16Var.b, this.b);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        Object obj = this.b;
        return floatToIntBits + (obj != null ? obj.hashCode() : 0);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("targetContentZIndex");
        z12Var.b().b(Float.valueOf(this.a), "zIndex");
        z12Var.b().b(this.b, "stateForContent");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        d16 d16Var = (d16) k13Var;
        d16Var.I = this.a;
        d16Var.J = this.b;
    }
}
