package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fl3 extends jl3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public fl3(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return Float.compare(this.c, fl3Var.c) == 0 && Float.compare(this.d, fl3Var.d) == 0 && Float.compare(this.e, fl3Var.e) == 0 && Float.compare(this.f, fl3Var.f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + jp0.o(this.e, jp0.o(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        B.append(this.e);
        B.append(", dy2=");
        B.append(this.f);
        B.append(")");
        return B.toString();
    }
}
