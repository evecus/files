package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w10 {
    public final float a;
    public final float b;

    public w10(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        return r11.c(this.a, w10Var.a) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f) && r11.c(this.b, w10Var.b) && r11.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + jp0.o(this.b, jp0.o(0.0f, jp0.o(0.0f, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }
}
