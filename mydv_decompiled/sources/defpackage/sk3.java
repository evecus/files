package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sk3 extends jl3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public sk3(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk3)) {
            return false;
        }
        sk3 sk3Var = (sk3) obj;
        return Float.compare(this.c, sk3Var.c) == 0 && Float.compare(this.d, sk3Var.d) == 0 && Float.compare(this.e, sk3Var.e) == 0 && Float.compare(this.f, sk3Var.f) == 0 && Float.compare(this.g, sk3Var.g) == 0 && Float.compare(this.h, sk3Var.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + jp0.o(this.g, jp0.o(this.f, jp0.o(this.e, jp0.o(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        B.append(this.e);
        B.append(", y2=");
        B.append(this.f);
        B.append(", x3=");
        B.append(this.g);
        B.append(", y3=");
        B.append(this.h);
        B.append(")");
        return B.toString();
    }
}
