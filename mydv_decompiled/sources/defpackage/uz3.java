package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uz3 implements vz3 {
    public final double I;

    public uz3(double d) {
        this.I = d;
    }

    @Override // defpackage.vz3
    public final float e(float f) {
        return (float) e21.Q(f, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz3) && Double.compare(this.I, ((uz3) obj).I) == 0;
    }

    @Override // defpackage.vz3
    public final float h(float f) {
        return (float) e21.Q(f, 1.0d / this.I);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.I);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.I + ')';
    }
}
