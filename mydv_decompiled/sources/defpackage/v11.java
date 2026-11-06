package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v11 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        return j != 9205357640488583168L ? r7.C(r11.d(b(j)), " x ", r11.d(a(j))) : "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v11) {
            return this.a == ((v11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
