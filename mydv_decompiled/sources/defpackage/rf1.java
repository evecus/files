package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rf1 {
    public final long a;

    public static long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rf1) {
            return this.a == ((rf1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }
}
