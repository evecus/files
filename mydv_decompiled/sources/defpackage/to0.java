package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class to0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public to0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to0)) {
            return false;
        }
        to0 to0Var = (to0) obj;
        return Float.compare(this.a, to0Var.a) == 0 && Float.compare(this.b, to0Var.b) == 0 && Float.compare(this.c, to0Var.c) == 0 && Float.compare(this.d, to0Var.d) == 0 && Float.compare(this.e, to0Var.e) == 0 && Float.compare(this.f, to0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + jp0.o(this.e, jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("DanmakuLayoutParameters(displayArea=", this.a, ", lineHeight=", this.b, ", padding=");
        B.append(this.c);
        B.append(", horizontalGap=");
        B.append(this.d);
        B.append(", durationMs=");
        B.append(this.e);
        B.append(", speedReferenceWidth=");
        B.append(this.f);
        B.append(")");
        return B.toString();
    }
}
