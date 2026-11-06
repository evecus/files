package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class af3 {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= 105.0d && doubleValue < 125.0d;
    }

    public final boolean equals(Object obj) {
        return obj instanceof af3;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(105.0d);
        long doubleToLongBits2 = Double.doubleToLongBits(125.0d);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "105.0..<125.0";
    }
}
