package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e92 implements w70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final f92 e;

    static {
        f92 f92Var = g92.a;
        f92 f92Var2 = g92.a;
    }

    public e92(float f, float f2, float f3, float f4, f92 f92Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f92Var;
    }

    @Override // defpackage.w70
    public final fs1 a() {
        return c().a();
    }

    @Override // defpackage.w70
    public final x06 b() {
        Double valueOf = Double.valueOf(0.0d);
        ht5 ht5Var = this.e.I;
        y06 a = g06.a(ht5Var);
        float f = this.a;
        if (f == 0.0f) {
            return a.a(valueOf, valueOf, valueOf, Float.valueOf(1.0f));
        }
        double d = (16.0f + f) / 116.0d;
        double d2 = d - (this.c / 200.0d);
        double d3 = (this.b / 500.0d) + d;
        double d4 = f;
        double pow = d4 > 8.0d ? Math.pow(d, 3.0d) : d4 / 903.2962962962963d;
        double pow2 = Math.pow(d2, 3.0d);
        if (pow2 <= 0.008856451679035631d) {
            pow2 = ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double pow3 = Math.pow(d3, 3.0d);
        if (pow3 <= 0.008856451679035631d) {
            pow3 = ((116.0d * d3) - 16.0d) / 903.2962962962963d;
        }
        return a.a(Double.valueOf(pow3 * ((r1.a * r2) / r1.b)), Double.valueOf(pow * ht5Var.b.c), Double.valueOf(pow2 * r1.a()), Float.valueOf(this.d));
    }

    @Override // defpackage.w70
    public final tz3 c() {
        return this.a == 0.0f ? tz3.f.g(0.0f, 0.0f, 0.0f, this.d) : b().d(yz3.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e92)) {
            return false;
        }
        e92 e92Var = (e92) obj;
        return Float.compare(this.a, e92Var.a) == 0 && Float.compare(this.b, e92Var.b) == 0 && Float.compare(this.c, e92Var.c) == 0 && Float.compare(this.d, e92Var.d) == 0 && this.e.equals(e92Var.e);
    }

    public final int hashCode() {
        return this.e.I.hashCode() + jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "LAB(l=" + this.a + ", a=" + this.b + ", b=" + this.c + ", alpha=" + this.d + ", space=" + this.e + ')';
    }
}
