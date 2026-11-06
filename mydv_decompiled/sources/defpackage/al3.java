package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class al3 extends jl3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public al3(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return Float.compare(this.c, al3Var.c) == 0 && Float.compare(this.d, al3Var.d) == 0 && Float.compare(this.e, al3Var.e) == 0 && Float.compare(this.f, al3Var.f) == 0 && Float.compare(this.g, al3Var.g) == 0 && Float.compare(this.h, al3Var.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + jp0.o(this.g, jp0.o(this.f, jp0.o(this.e, jp0.o(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        B.append(this.e);
        B.append(", dy2=");
        B.append(this.f);
        B.append(", dx3=");
        B.append(this.g);
        B.append(", dy3=");
        B.append(this.h);
        B.append(")");
        return B.toString();
    }
}
