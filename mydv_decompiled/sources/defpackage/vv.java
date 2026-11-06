package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vv implements u8 {
    public final float a;
    public final float b;

    public vv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.u8
    public final long a(long j, long j2, da2 da2Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        da2 da2Var2 = da2.I;
        float f3 = this.a;
        if (da2Var != da2Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        return Float.compare(this.a, vvVar.a) == 0 && Float.compare(this.b, vvVar.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
