package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kh4 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public kh4 f;
    public kh4 g;

    public kh4(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final kh4 a() {
        kh4 kh4Var = this.f;
        if (kh4Var == this) {
            kh4Var = null;
        }
        kh4 kh4Var2 = this.g;
        kh4Var2.getClass();
        kh4Var2.f = this.f;
        kh4 kh4Var3 = this.f;
        kh4Var3.getClass();
        kh4Var3.g = this.g;
        this.f = null;
        this.g = null;
        return kh4Var;
    }

    public final void b(kh4 kh4Var) {
        kh4Var.getClass();
        kh4Var.g = this;
        kh4Var.f = this.f;
        kh4 kh4Var2 = this.f;
        kh4Var2.getClass();
        kh4Var2.g = kh4Var;
        this.f = kh4Var;
    }

    public final kh4 c() {
        this.d = true;
        return new kh4(this.a, this.b, this.c, true, false);
    }

    public final void d(kh4 kh4Var, int i) {
        kh4Var.getClass();
        byte[] bArr = kh4Var.a;
        if (!kh4Var.e) {
            zy.i("only owner can write");
            return;
        }
        int i2 = kh4Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (kh4Var.d) {
                s83.d();
                return;
            }
            int i4 = kh4Var.b;
            if (i3 - i4 > 8192) {
                s83.d();
                return;
            }
            dq.R0(bArr, 0, i4, bArr, i2);
            i2 = kh4Var.c - kh4Var.b;
            kh4Var.c = i2;
            kh4Var.b = 0;
        }
        int i5 = this.b;
        dq.R0(this.a, i2, i5, bArr, i5 + i);
        kh4Var.c += i;
        this.b += i;
    }

    public kh4() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
