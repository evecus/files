package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zc5 implements Comparable {
    public final long I;

    public /* synthetic */ zc5(long j) {
        this.I = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j42.n(this.I ^ Long.MIN_VALUE, ((zc5) obj).I ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zc5) {
            return this.I == ((zc5) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.I);
    }

    public final String toString() {
        return li4.t(10, this.I);
    }
}
