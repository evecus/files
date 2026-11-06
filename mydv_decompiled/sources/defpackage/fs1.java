package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fs1 implements w70 {
    public static final j81 e = new j81((byte) 7);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
        n84 n84Var = w80.a;
        mk2 K = p70.K();
        for (int i = 0; i < 3; i++) {
            char charAt = "HSL".charAt(i);
            K.add(new n84(String.valueOf(charAt), 0.0f, charAt == 'H' ? 360.0f : 1.0f));
        }
        K.add(w80.a);
        p70.D(K);
    }

    public fs1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static final float d(double d, double d2, double d3, int i) {
        double d4 = (i + d) % 12.0d;
        double min = Math.min(d3, 1.0d - d3) * d2;
        double min2 = Math.min(d4 - 3.0d, Math.min(9.0d - d4, 1.0d));
        if (min2 < -1.0d) {
            min2 = -1.0d;
        }
        return (float) (d3 - (min * min2));
    }

    @Override // defpackage.w70
    public final x06 b() {
        return c().b();
    }

    @Override // defpackage.w70
    public final tz3 c() {
        double d = this.b;
        float f = this.d;
        float f2 = this.c;
        if (d < 1.0E-7d) {
            return tz3.f.g(f2, f2, f2, f);
        }
        Integer num = 0;
        float f3 = this.a;
        if (Float.isNaN(f3)) {
            f3 = num.floatValue();
        }
        double d2 = (((f3 % 360.0f) + 360.0f) % 360.0f) / 30.0d;
        double d3 = f2;
        return r84.J.g(d(d2, d, d3, 0), d(d2, d, d3, 8), d(d2, d, d3, 4), f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs1)) {
            return false;
        }
        fs1 fs1Var = (fs1) obj;
        return Float.compare(this.a, fs1Var.a) == 0 && Float.compare(this.b, fs1Var.b) == 0 && Float.compare(this.c, fs1Var.c) == 0 && Float.compare(this.d, fs1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "HSL(h=" + this.a + ", s=" + this.b + ", l=" + this.c + ", alpha=" + this.d + ')';
    }

    @Override // defpackage.w70
    public final fs1 a() {
        return this;
    }
}
