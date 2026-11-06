package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wu {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof wu) {
            return Float.compare(this.a, ((wu) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
