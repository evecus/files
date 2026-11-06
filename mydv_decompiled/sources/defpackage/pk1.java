package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pk1 {
    public final short a;

    public final boolean equals(Object obj) {
        if (obj instanceof pk1) {
            return this.a == ((pk1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "FontWeight(value=" + ((int) this.a) + ')';
    }
}
