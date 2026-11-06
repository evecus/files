package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v55 {
    public final u55 a;
    public ca2 b = null;
    public ca2 c;

    public v55(u55 u55Var, ca2 ca2Var) {
        this.a = u55Var;
        this.c = ca2Var;
    }

    public final long a(long j) {
        m14 m14Var;
        ca2 ca2Var = this.b;
        m14 m14Var2 = m14.e;
        if (ca2Var != null) {
            if (ca2Var.h()) {
                ca2 ca2Var2 = this.c;
                m14Var = ca2Var2 != null ? ca2Var2.J(ca2Var, true) : null;
            } else {
                m14Var = m14Var2;
            }
            if (m14Var != null) {
                m14Var2 = m14Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = m14Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = m14Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = m14Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = m14Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        u55 u55Var = this.a;
        int e = u55Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= u55Var.f(e) && Float.intBitsToFloat(i) <= u55Var.g(e);
    }

    public final long d(long j) {
        ca2 ca2Var;
        ca2 ca2Var2 = this.b;
        if (ca2Var2 != null) {
            if (!ca2Var2.h()) {
                ca2Var2 = null;
            }
            if (ca2Var2 != null && (ca2Var = this.c) != null) {
                ca2 ca2Var3 = ca2Var.h() ? ca2Var : null;
                if (ca2Var3 != null) {
                    return ca2Var2.G(ca2Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        ca2 ca2Var;
        ca2 ca2Var2 = this.b;
        if (ca2Var2 != null) {
            if (!ca2Var2.h()) {
                ca2Var2 = null;
            }
            if (ca2Var2 != null && (ca2Var = this.c) != null) {
                ca2 ca2Var3 = ca2Var.h() ? ca2Var : null;
                if (ca2Var3 != null) {
                    return ca2Var3.G(ca2Var2, j);
                }
            }
        }
        return j;
    }
}
