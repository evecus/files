package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vr1 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof vr1) {
            return this.a == ((vr1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ")";
    }
}
