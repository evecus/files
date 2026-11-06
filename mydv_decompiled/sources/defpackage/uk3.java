package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uk3 extends jl3 {
    public final float c;
    public final float d;

    public uk3(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk3)) {
            return false;
        }
        uk3 uk3Var = (uk3) obj;
        return Float.compare(this.c, uk3Var.c) == 0 && Float.compare(this.d, uk3Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
