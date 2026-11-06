package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i74 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public i74(long j, long j2, long j3, ok0 ok0Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long a0 = sp0.a0(j, j2);
        long a02 = sp0.a0(j3, j2);
        float N = sp0.N(a0);
        float N2 = sp0.N(a02);
        if (N <= 0.0f || N2 <= 0.0f) {
            this.d = rf1.a(0.0f, 0.0f);
            this.e = rf1.a(0.0f, 0.0f);
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 0.0f;
        } else {
            long D = sp0.D(a0, N);
            this.d = D;
            long D2 = sp0.D(a02, N2);
            this.e = D2;
            float f = ok0Var.a;
            this.f = f;
            this.g = 0.0f;
            float E = sp0.E(D, D2);
            float f2 = sg5.b;
            float sqrt = (float) Math.sqrt(1.0f - (E * E));
            this.h = ((double) sqrt) > 0.001d ? ((E + 1.0f) * f) / sqrt : 0.0f;
        }
        this.i = rf1.a(0.0f, 0.0f);
    }

    public static km0 b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long a0 = sp0.a0(j2, j);
        float N = sp0.N(a0);
        rf1 rf1Var = null;
        if (N <= 0.0f) {
            s83.t("Can't get the direction of a 0-length vector");
            return null;
        }
        long D = sp0.D(a0, N);
        long c0 = sp0.c0(j, sp0.f0(sp0.f0(D, f), 1.0f + f2));
        long D2 = sp0.D(sp0.c0(j3, j4), 2.0f);
        long a = rf1.a(sg5.b(sp0.V(j3), sp0.V(D2), f2), sg5.b(sp0.W(j3), sp0.W(D2), f2));
        long c02 = sp0.c0(j5, sp0.f0(sg5.a(sp0.V(a) - sp0.V(j5), sp0.W(a) - sp0.W(j5)), f3));
        long a02 = sp0.a0(c02, j5);
        long a2 = rf1.a(-sp0.W(a02), sp0.V(a02));
        long a3 = rf1.a(-sp0.W(a2), sp0.V(a2));
        float E = sp0.E(D, a3);
        if (Math.abs(E) >= 1.0E-4f) {
            float E2 = sp0.E(sp0.a0(c02, j2), a3);
            if (Math.abs(E) >= Math.abs(E2) * 1.0E-4f) {
                rf1Var = new rf1(sp0.c0(j2, sp0.f0(D, E2 / E)));
            }
        }
        long j6 = rf1Var != null ? rf1Var.a : j3;
        long D3 = sp0.D(sp0.c0(c0, sp0.f0(j6, 2.0f)), 3.0f);
        return new km0(new float[]{sp0.V(c0), sp0.W(c0), sp0.V(D3), sp0.W(D3), sp0.V(j6), sp0.W(j6), sp0.V(c02), sp0.W(c02)});
    }

    public final float a(float f) {
        float c = c();
        float f2 = this.g;
        if (f > c) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
