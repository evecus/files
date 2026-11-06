package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d65 {
    public static final long b = ui4.c(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ d65(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof d65) && j == ((d65) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String h(long j) {
        return hf1.v("TextRange(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
