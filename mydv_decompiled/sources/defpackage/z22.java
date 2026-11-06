package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z22 {
    public final long a;

    public /* synthetic */ z22(long j) {
        this.a = j;
    }

    public static final /* synthetic */ z22 a(long j) {
        return new z22(j);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z22) {
            return this.a == ((z22) obj).a;
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
