package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rx4 extends z31 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public rx4(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4)) {
            return false;
        }
        rx4 rx4Var = (rx4) obj;
        return this.a == rx4Var.a && this.b == rx4Var.b && this.c == rx4Var.c && this.d == rx4Var.d;
    }

    public final int hashCode() {
        return (((jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.c;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        StringBuilder B = hf1.B("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        B.append(str2);
        B.append(", join=");
        B.append(str);
        B.append(", pathEffect=null)");
        return B.toString();
    }
}
