package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class di3 extends q13 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final tm1 e;

    public di3(float f, float f2, float f3, float f4, tm1 tm1Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = tm1Var;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            o02.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.q13
    public final k13 create() {
        ii3 ii3Var = new ii3();
        ii3Var.I = this.a;
        ii3Var.J = this.b;
        ii3Var.K = this.c;
        ii3Var.L = this.d;
        ii3Var.M = true;
        return ii3Var;
    }

    public final boolean equals(Object obj) {
        di3 di3Var = obj instanceof di3 ? (di3) obj : null;
        return di3Var != null && r11.c(this.a, di3Var.a) && r11.c(this.b, di3Var.b) && r11.c(this.c, di3Var.c) && r11.c(this.d, di3Var.d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        this.e.invoke(z12Var);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ii3 ii3Var = (ii3) k13Var;
        ii3Var.I = this.a;
        ii3Var.J = this.b;
        ii3Var.K = this.c;
        ii3Var.L = this.d;
        ii3Var.M = true;
    }
}
