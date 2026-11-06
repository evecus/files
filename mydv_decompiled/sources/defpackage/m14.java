package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m14 {
    public static final m14 e = new m14(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public m14(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final m14 e(m14 m14Var) {
        return new m14(Math.max(this.a, m14Var.a), Math.max(this.b, m14Var.b), Math.min(this.c, m14Var.c), Math.min(this.d, m14Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m14)) {
            return false;
        }
        m14 m14Var = (m14) obj;
        return Float.compare(this.a, m14Var.a) == 0 && Float.compare(this.b, m14Var.b) == 0 && Float.compare(this.c, m14Var.c) == 0 && Float.compare(this.d, m14Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(m14 m14Var) {
        return (this.a < m14Var.c) & (m14Var.a < this.c) & (this.b < m14Var.d) & (m14Var.b < this.d);
    }

    public final m14 h(float f, float f2) {
        return new m14(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final m14 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new m14(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String x0 = e41.x0(this.a);
        String x02 = e41.x0(this.b);
        String x03 = e41.x0(this.c);
        String x04 = e41.x0(this.d);
        StringBuilder F = r7.F("Rect.fromLTRB(", x0, ", ", x02, ", ");
        F.append(x03);
        F.append(", ");
        F.append(x04);
        F.append(")");
        return F.toString();
    }
}
