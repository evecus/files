package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class qd3 extends q13 {
    public final float a;
    public final float b;
    public final rd3 c;

    public qd3(float f, float f2, rd3 rd3Var) {
        this.a = f;
        this.b = f2;
        this.c = rd3Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ud3 ud3Var = new ud3();
        ud3Var.I = this.a;
        ud3Var.J = this.b;
        ud3Var.K = true;
        return ud3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        qd3 qd3Var = obj instanceof qd3 ? (qd3) obj : null;
        return qd3Var != null && r11.c(this.a, qd3Var.a) && r11.c(this.b, qd3Var.b);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31) + 1231;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        this.c.invoke(z12Var);
    }

    public final String toString() {
        return hf1.x("OffsetModifierElement(x=", r11.d(this.a), ", y=", r11.d(this.b), ", rtlAware=true)");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ud3 ud3Var = (ud3) k13Var;
        float f = ud3Var.I;
        float f2 = this.a;
        boolean c = r11.c(f, f2);
        float f3 = this.b;
        if (!c || !r11.c(ud3Var.J, f3) || !ud3Var.K) {
            ut0.U(ud3Var).X(false);
        }
        ud3Var.I = f2;
        ud3Var.J = f3;
        ud3Var.K = true;
    }
}
