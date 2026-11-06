package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uc5 implements Comparable {
    public final int I;

    public /* synthetic */ uc5(int i) {
        this.I = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j42.m(this.I ^ Integer.MIN_VALUE, ((uc5) obj).I ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uc5) {
            return this.I == ((uc5) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return this.I;
    }

    public final String toString() {
        return String.valueOf(this.I & 4294967295L);
    }
}
