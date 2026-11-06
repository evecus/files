package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tz3 implements w70 {
    public static final sz3 f = new sz3();
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final wz3 e;

    public tz3(float f2, float f3, float f4, float f5, wz3 wz3Var) {
        wz3Var.getClass();
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = wz3Var;
    }

    @Override // defpackage.w70
    public final fs1 a() {
        tz3 d = d(r84.J);
        double d2 = d.a;
        double d3 = d.b;
        double d4 = d.c;
        double min = Math.min(d2, Math.min(d3, d4));
        double max = Math.max(d2, Math.max(d3, d4));
        double d5 = max - min;
        double d6 = min + max;
        double d7 = d6 / 2.0d;
        return new fs1((float) (((((d5 < 1.0E-7d ? Double.NaN : d2 == max ? (d3 - d4) / d5 : d3 == max ? ((d4 - d2) / d5) + 2.0d : d4 == max ? ((d2 - d3) / d5) + 4.0d : 0.0d) * 60.0d) % 360.0d) + 360.0d) % 360.0d), (float) (max != min ? d7 <= 0.5d ? d5 / d6 : d5 / ((2.0d - max) - min) : 0.0d), (float) d7, this.d);
    }

    @Override // defpackage.w70
    public final x06 b() {
        wz3 wz3Var = this.e;
        vz3 j = wz3Var.j();
        float[] b = wz3Var.b();
        b.getClass();
        float e = j.e(this.a);
        float e2 = j.e(this.b);
        float e3 = j.e(this.c);
        float f2 = (b[2] * e3) + (b[1] * e2) + (b[0] * e);
        float f3 = (b[5] * e3) + (b[4] * e2) + (b[3] * e);
        float f4 = (b[8] * e3) + (b[7] * e2) + (b[6] * e);
        y06 a = g06.a(wz3Var.h());
        a.getClass();
        return new x06(f2, f3, f4, this.d, a);
    }

    @Override // defpackage.w70
    public final tz3 c() {
        return d(yz3.a);
    }

    public final tz3 d(wz3 wz3Var) {
        wz3Var.getClass();
        r84 r84Var = r84.J;
        vz3 vz3Var = r84Var.I.K;
        wz3 wz3Var2 = this.e;
        if (j42.c(wz3Var2, wz3Var)) {
            return this;
        }
        boolean c = j42.c(wz3Var2, r84Var);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        float f5 = this.a;
        return (c && wz3Var.equals(yz3.b)) ? wz3Var.g(vz3Var.e(f5), vz3Var.e(f4), vz3Var.e(f3), f2) : (j42.c(wz3Var2, yz3.b) && wz3Var.equals(r84Var)) ? wz3Var.g(vz3Var.h(f5), vz3Var.h(f4), vz3Var.h(f3), f2) : b().d(wz3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz3)) {
            return false;
        }
        tz3 tz3Var = (tz3) obj;
        return Float.compare(this.a, tz3Var.a) == 0 && Float.compare(this.b, tz3Var.b) == 0 && Float.compare(this.c, tz3Var.c) == 0 && Float.compare(this.d, tz3Var.d) == 0 && j42.c(this.e, tz3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RGB(r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", alpha=" + this.d + ", space=" + this.e + ')';
    }
}
