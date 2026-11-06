package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class if1 {
    public final float a;
    public final float b;
    public final long c;

    public if1(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return Float.compare(this.a, if1Var.a) == 0 && Float.compare(this.b, if1Var.b) == 0 && this.c == if1Var.c;
    }

    public final int hashCode() {
        int o = jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31);
        long j = this.c;
        return o + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return r7.D(hf1.B("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
