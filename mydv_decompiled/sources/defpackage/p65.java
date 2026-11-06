package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p65 {
    public static final q65[] b = {new q65(0), new q65(4294967296L), new q65(8589934592L)};
    public static final long c = oh4.p(0, Float.NaN);
    public final long a;

    public /* synthetic */ p65(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (q65.a(b2, 0L)) {
            return "Unspecified";
        }
        if (q65.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!q65.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p65) {
            return this.a == ((p65) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
