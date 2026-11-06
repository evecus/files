package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m16 {
    public final float a;
    public final float b;
    public final float c;

    public m16(Double d, Double d2) {
        Double valueOf = Double.valueOf(1.0d);
        float floatValue = d.floatValue();
        float floatValue2 = d2.floatValue();
        float floatValue3 = valueOf.floatValue();
        this.a = floatValue;
        this.b = floatValue2;
        this.c = floatValue3;
    }

    public final float a() {
        float f = 1.0f - this.a;
        float f2 = this.b;
        return ((f - f2) * this.c) / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16Var = (m16) obj;
        return Float.compare(this.a, m16Var.a) == 0 && Float.compare(this.b, m16Var.b) == 0 && Float.compare(this.c, m16Var.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31);
    }

    public final String toString() {
        return "xyY(x=" + this.a + ", y=" + this.b + ", Y=" + this.c + ')';
    }
}
