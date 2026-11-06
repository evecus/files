package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pc5 implements Comparable {
    public final byte I;

    public /* synthetic */ pc5(byte b) {
        this.I = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j42.m(this.I & 255, ((pc5) obj).I & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pc5) {
            return this.I == ((pc5) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return this.I;
    }

    public final String toString() {
        return String.valueOf(this.I & 255);
    }
}
