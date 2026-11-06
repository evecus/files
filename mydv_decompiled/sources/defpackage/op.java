package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class op {
    public long a;
    public int b;
    public int c;
    public Object d;

    public op(fh1 fh1Var, long j, int i, int i2) {
        this.d = fh1Var;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public k21 a(bh1 bh1Var, boolean z, int i, int i2, int i3, int i4) {
        if (!bh1Var.b) {
            return null;
        }
        ((fh1) this.d).getClass();
        return null;
    }

    public bh1 b(boolean z, int i, long j, k22 k22Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.b;
        int i6 = this.c;
        long j2 = this.a;
        fh1 fh1Var = (fh1) this.d;
        int i7 = i3 + i4;
        if (k22Var == null) {
            return new bh1(true, true);
        }
        long j3 = k22Var.a;
        fh1Var.getClass();
        return (i2 < Integer.MAX_VALUE && ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) >= 0) ? (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) ? z2 ? new bh1(true, true) : new bh1(true, b(z, 0, k22.a(dh0.h(j2), (((int) (j & 4294967295L)) - i6) - i4), new k22(k22.a(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).b) : new bh1(false, false) : new bh1(true, true);
    }
}
