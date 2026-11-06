package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qk3 extends jl3 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public qk3(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk3)) {
            return false;
        }
        qk3 qk3Var = (qk3) obj;
        return Float.compare(this.c, qk3Var.c) == 0 && Float.compare(this.d, qk3Var.d) == 0 && Float.compare(this.e, qk3Var.e) == 0 && this.f == qk3Var.f && this.g == qk3Var.g && Float.compare(this.h, qk3Var.h) == 0 && Float.compare(this.i, qk3Var.i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.i) + jp0.o(this.h, (pt1.o(this.g) + ((pt1.o(this.f) + jp0.o(this.e, jp0.o(this.d, Float.floatToIntBits(this.c) * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        B.append(this.e);
        B.append(", isMoreThanHalf=");
        B.append(this.f);
        B.append(", isPositiveArc=");
        B.append(this.g);
        B.append(", arcStartX=");
        B.append(this.h);
        B.append(", arcStartY=");
        B.append(this.i);
        B.append(")");
        return B.toString();
    }
}
