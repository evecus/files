package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pq5 {
    public final fk3 a = new fk3(1.0f);
    public final jk3 b = ad4.w(new pd3(0));
    public long c;
    public rv4 d;

    public static long b(long j, long j2, long j3, float f) {
        if (f <= 1.0f) {
            return 0L;
        }
        float intBitsToFloat = ((Float.intBitsToFloat((int) (j2 >> 32)) * f) - Float.intBitsToFloat((int) (j3 >> 32))) / 2.0f;
        if (intBitsToFloat < 0.0f) {
            intBitsToFloat = 0.0f;
        }
        float intBitsToFloat2 = ((Float.intBitsToFloat((int) (j2 & 4294967295L)) * f) - Float.intBitsToFloat((int) (j3 & 4294967295L))) / 2.0f;
        float f2 = intBitsToFloat2 >= 0.0f ? intBitsToFloat2 : 0.0f;
        return (Float.floatToRawIntBits(ut0.q(Float.intBitsToFloat((int) (j >> 32)), -intBitsToFloat, intBitsToFloat)) << 32) | (Float.floatToRawIntBits(ut0.q(Float.intBitsToFloat((int) (j & 4294967295L)), -f2, f2)) & 4294967295L);
    }

    public static void h(pq5 pq5Var) {
        pq5Var.getClass();
        pq5Var.c = SystemClock.uptimeMillis() + 400;
    }

    public final void a(long j, long j2, float f, long j3, long j4, long j5) {
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f || Float.intBitsToFloat((int) (j3 >> 32)) <= 0.0f || Float.intBitsToFloat((int) (j3 & 4294967295L)) <= 0.0f) {
            return;
        }
        int i = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i) > 0.0f) {
            int i2 = (int) (j4 & 4294967295L);
            if (Float.intBitsToFloat(i2) <= 0.0f || Float.intBitsToFloat((int) (j5 >> 32)) <= 0.0f || Float.intBitsToFloat((int) (j5 & 4294967295L)) <= 0.0f) {
                return;
            }
            fk3 fk3Var = this.a;
            float h = fk3Var.h();
            float q = ut0.q(h * f, 1.0f, 3.0f);
            float f2 = q / h;
            float intBitsToFloat = Float.intBitsToFloat(i) / 2.0f;
            float intBitsToFloat2 = Float.intBitsToFloat(i2) / 2.0f;
            long f3 = pd3.f(pd3.f(pd3.g(c(), f2), pd3.g(pd3.e(j, (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), 1.0f - f2)), j2);
            fk3Var.i(q);
            g(b(f3, j3, j5, q));
        }
    }

    public final long c() {
        return ((pd3) this.b.getValue()).a;
    }

    public final boolean d() {
        return this.a.h() > 1.001f;
    }

    public final void e(long j, long j2, long j3) {
        if (d()) {
            g(b(pd3.f(c(), j), j2, j3, this.a.h()));
        }
    }

    public final void f() {
        rv4 rv4Var = this.d;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.d = null;
        this.a.i(1.0f);
        g(0L);
        this.c = 0L;
    }

    public final void g(long j) {
        this.b.setValue(new pd3(j));
    }
}
