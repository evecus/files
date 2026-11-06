package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sv implements u8 {
    public final float a;

    public sv(float f) {
        this.a = f;
    }

    @Override // defpackage.u8
    public final long a(long j, long j2, da2 da2Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = (1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f);
        float f2 = 0.0f * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f) << 32) | (Math.round(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv) && Float.compare(this.a, ((sv) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
