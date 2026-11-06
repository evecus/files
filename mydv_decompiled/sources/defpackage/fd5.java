package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fd5 implements Comparable {
    public final short I;

    public /* synthetic */ fd5(short s) {
        this.I = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j42.m(this.I & 65535, ((fd5) obj).I & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fd5) {
            return this.I == ((fd5) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return this.I;
    }

    public final String toString() {
        return String.valueOf(this.I & 65535);
    }
}
