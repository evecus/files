package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t11 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t11) {
            return this.a == ((t11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? hf1.x("(", r11.d(a(j)), ", ", r11.d(b(j)), ")") : "DpOffset.Unspecified";
    }
}
