package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x06 implements w70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final y06 e;

    static {
        y06 y06Var = z06.a;
        y06 y06Var2 = z06.a;
    }

    public x06(float f, float f2, float f3, float f4, y06 y06Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = y06Var;
    }

    @Override // defpackage.w70
    public final fs1 a() {
        return d(yz3.a).a();
    }

    @Override // defpackage.w70
    public final tz3 c() {
        return d(yz3.a);
    }

    public final tz3 d(wz3 wz3Var) {
        char c;
        char c2;
        x06 x06Var;
        char c3;
        wz3Var.getClass();
        y06 a = g06.a(wz3Var.h());
        a.getClass();
        float[] fArr = mg0.a;
        float[] fArr2 = mg0.b;
        ht5 ht5Var = a.I;
        ht5 ht5Var2 = this.e.I;
        if (j42.c(ht5Var, ht5Var2)) {
            x06Var = this;
            c3 = 0;
            c = '\b';
            c2 = 7;
        } else {
            m16 m16Var = ht5Var2.b;
            fArr2.getClass();
            m16 m16Var2 = ht5Var.b;
            float f = m16Var.a;
            c = '\b';
            float f2 = m16Var.c;
            c2 = 7;
            float[] t = il2.t((f * f2) / m16Var.b, f2, m16Var.a(), fArr);
            float f3 = m16Var2.a;
            float f4 = m16Var2.c;
            float[] t2 = il2.t((f3 * f4) / m16Var2.b, f4, m16Var2.a(), fArr);
            float[] u = il2.u(t2[0] / t[0], t2[1] / t[1], t2[2] / t[2], fArr2);
            float[] fArr3 = {il2.v(0, u, fArr, 0), il2.v(1, u, fArr, 0), il2.v(2, u, fArr, 0), il2.v(0, u, fArr, 1), il2.v(1, u, fArr, 1), il2.v(2, u, fArr, 1), il2.v(0, u, fArr, 2), il2.v(1, u, fArr, 2), il2.v(2, u, fArr, 2)};
            float f5 = fArr3[0];
            float f6 = this.a;
            float f7 = fArr3[1];
            float f8 = this.b;
            float f9 = (f7 * f8) + (f5 * f6);
            float f10 = fArr3[2];
            float f11 = this.c;
            c3 = 0;
            x06Var = new x06((f10 * f11) + f9, (fArr3[5] * f11) + (fArr3[4] * f8) + (fArr3[3] * f6), (fArr3[8] * f11) + (fArr3[7] * f8) + (fArr3[6] * f6), this.d, a);
        }
        vz3 j = wz3Var.j();
        float[] d = wz3Var.d();
        d.getClass();
        float f12 = d[c3];
        float f13 = x06Var.a;
        float f14 = d[1];
        float f15 = x06Var.b;
        float f16 = (f14 * f15) + (f12 * f13);
        float f17 = d[2];
        float f18 = x06Var.c;
        return wz3Var.g(j.h((f17 * f18) + f16), j.h((d[5] * f18) + (d[4] * f15) + (d[3] * f13)), j.h((d[c] * f18) + (d[c2] * f15) + (d[6] * f13)), this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06)) {
            return false;
        }
        x06 x06Var = (x06) obj;
        return Float.compare(this.a, x06Var.a) == 0 && Float.compare(this.b, x06Var.b) == 0 && Float.compare(this.c, x06Var.c) == 0 && Float.compare(this.d, x06Var.d) == 0 && this.e.equals(x06Var.e);
    }

    public final int hashCode() {
        return this.e.I.hashCode() + jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "XYZ(x=" + this.a + ", y=" + this.b + ", z=" + this.c + ", alpha=" + this.d + ", space=" + this.e + ')';
    }

    @Override // defpackage.w70
    public final x06 b() {
        return this;
    }
}
