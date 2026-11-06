package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f75 {
    public final q33 a;
    public e75 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public f75() {
        q33 q33Var = q22.a;
        this.a = new q33();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(e75 e75Var, long j, long j2, float[] fArr, long j3) {
        long j4 = e75Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            e75Var.g = j3;
            e75Var.a(e75Var.e, e75Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (r22.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!r22.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
