package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class v80 {
    public final String a;
    public final long b;
    public final int c;

    public v80(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            s83.t("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            s83.t("The id must be between -1 and 63");
            throw null;
        }
    }

    public float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    public float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    public boolean c() {
        return false;
    }

    public long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = xd3.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = xd3.f;
        return (Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }

    public float e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = xd3.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = xd3.f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v80 v80Var = (v80) obj;
        if (this.c == v80Var.c && this.a.equals(v80Var.a)) {
            return o7.r(this.b, v80Var.b);
        }
        return false;
    }

    public long f(float f, float f2, float f3, float f4, v80 v80Var) {
        float[] fArr = xd3.d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float q = vt0.q(f5);
        float q2 = vt0.q(f6);
        float q3 = vt0.q(f7);
        float[] fArr2 = xd3.e;
        return qb.h((fArr2[6] * q3) + (fArr2[3] * q2) + (fArr2[0] * q), (fArr2[7] * q3) + (fArr2[4] * q2) + (fArr2[1] * q), (fArr2[8] * q3) + (fArr2[5] * q2) + (fArr2[2] * q), f4, v80Var);
    }

    public int hashCode() {
        return ((pt1.m(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        long j = this.b;
        return this.a + " (id=" + this.c + ", model=" + (o7.r(j, 12884901888L) ? "Rgb" : o7.r(j, 12884901889L) ? "Xyz" : o7.r(j, 12884901890L) ? "Lab" : o7.r(j, 17179869187L) ? "Cmyk" : "Unknown") + ")";
    }
}
