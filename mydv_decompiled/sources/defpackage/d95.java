package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d95 {
    public long a;
    public Serializable b;

    /* JADX WARN: Multi-variable type inference failed */
    public d95(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public static long a(d95 d95Var, long j, float f) {
        long f2 = pd3.f(d95Var.a, j);
        d95Var.a = f2;
        float d = ((pg3) d95Var.b) == null ? pd3.d(f2) : Math.abs(d95Var.b(f2));
        if (d <= 0.0f || d < f) {
            return 9205357640488583168L;
        }
        pg3 pg3Var = (pg3) d95Var.b;
        long j2 = d95Var.a;
        if (pg3Var == null) {
            return pd3.e(d95Var.a, pd3.g(pd3.b(j2, pd3.d(j2)), f));
        }
        float b = d95Var.b(j2) - (Math.signum(d95Var.b(d95Var.a)) * f);
        long j3 = d95Var.a;
        pg3 pg3Var2 = (pg3) d95Var.b;
        pg3 pg3Var3 = pg3.J;
        float intBitsToFloat = Float.intBitsToFloat((int) (pg3Var2 == pg3Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((pg3) d95Var.b) == pg3Var3) {
            return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static void d(d95 d95Var) {
        d95Var.a = 0L;
    }

    public float b(long j) {
        return Float.intBitsToFloat(((pg3) this.b) == pg3.J ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public void c(long j) {
        this.a = j;
    }

    public void e(pg3 pg3Var) {
        this.b = pg3Var;
    }

    public d95(pg3 pg3Var) {
        this(0L, pg3Var);
    }

    public d95(long j, pg3 pg3Var) {
        this.b = pg3Var;
        this.a = j;
    }
}
