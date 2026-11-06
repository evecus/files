package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u11 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public u11(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u11)) {
            return false;
        }
        u11 u11Var = (u11) obj;
        return r11.c(this.a, u11Var.a) && r11.c(this.b, u11Var.b) && r11.c(this.c, u11Var.c) && r11.c(this.d, u11Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String d = r11.d(this.a);
        String d2 = r11.d(this.b);
        String d3 = r11.d(this.c);
        String d4 = r11.d(this.d);
        StringBuilder F = r7.F("DpRect(left=", d, ", top=", d2, ", right=");
        F.append(d3);
        F.append(", bottom=");
        F.append(d4);
        F.append(")");
        return F.toString();
    }
}
