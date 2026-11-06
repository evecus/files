package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h70 extends j70 {
    public final byte[] d;
    public final int e;
    public int f;
    public final mp4 g;

    public h70(mp4 mp4Var, int i) {
        if (i < 0) {
            s83.t("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        this.g = mp4Var;
    }

    public final void A(long j) {
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        byte[] bArr = this.d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void B(int i, int i2) {
        C((i << 3) | i2);
    }

    public final void C(int i) {
        boolean z = j70.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    ve5.l(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f = i3 + 1;
                    ve5.l(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void D(long j) {
        boolean z = j70.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    ve5.l(bArr, i, (byte) j);
                    return;
                } else {
                    this.f = i + 1;
                    ve5.l(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f;
                if (j3 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void E() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void F(int i) {
        if (this.e - this.f < i) {
            E();
        }
    }

    public final void G(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = i4;
        E();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // defpackage.j70
    public final void i(byte b) {
        if (this.f == this.e) {
            E();
        }
        int i = this.f;
        this.f = i + 1;
        this.d[i] = b;
    }

    @Override // defpackage.j70
    public final void j(int i, boolean z) {
        F(11);
        B(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f;
        this.f = i2 + 1;
        this.d[i2] = b;
    }

    @Override // defpackage.j70
    public final void k(int i, g00 g00Var) {
        u(i, 2);
        w(g00Var.size());
        e00 e00Var = (e00) g00Var;
        r(e00Var.L, e00Var.h(), e00Var.size());
    }

    @Override // defpackage.j70
    public final void l(int i, int i2) {
        F(14);
        B(i, 5);
        z(i2);
    }

    @Override // defpackage.j70
    public final void m(int i) {
        F(4);
        z(i);
    }

    @Override // defpackage.j70
    public final void n(int i, long j) {
        F(18);
        B(i, 1);
        A(j);
    }

    @Override // defpackage.j70
    public final void o(long j) {
        F(8);
        A(j);
    }

    @Override // defpackage.j70
    public final void p(int i, int i2) {
        F(20);
        B(i, 0);
        if (i2 >= 0) {
            C(i2);
        } else {
            D(i2);
        }
    }

    @Override // defpackage.j70
    public final void q(int i) {
        if (i >= 0) {
            w(i);
        } else {
            y(i);
        }
    }

    @Override // defpackage.j70
    public final void r(byte[] bArr, int i, int i2) {
        G(bArr, i, i2);
    }

    @Override // defpackage.j70
    public final void s(int i, r3 r3Var, qa4 qa4Var) {
        u(i, 2);
        w(r3Var.a(qa4Var));
        qa4Var.h(this.a, r3Var);
    }

    @Override // defpackage.j70
    public final void t(int i, String str) {
        u(i, 2);
        try {
            int length = str.length() * 3;
            int f = j70.f(length);
            int i2 = f + length;
            int i3 = this.e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int w = lg5.a.w(str, bArr, 0, length);
                w(w);
                G(bArr, 0, w);
                return;
            }
            if (i2 > i3 - this.f) {
                E();
            }
            int f2 = j70.f(str.length());
            int i4 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (f2 != f) {
                    int a = lg5.a(str);
                    C(a);
                    this.f = lg5.a.w(str, bArr2, this.f, a);
                    return;
                }
                int i5 = i4 + f2;
                this.f = i5;
                int w2 = lg5.a.w(str, bArr2, i5, i3 - i5);
                this.f = i4;
                C((w2 - i4) - f2);
                this.f = w2;
            } catch (ig5 e) {
                this.f = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new f70(e2);
            }
        } catch (ig5 e3) {
            h(str, e3);
        }
    }

    @Override // defpackage.j70
    public final void u(int i, int i2) {
        w((i << 3) | i2);
    }

    @Override // defpackage.j70
    public final void v(int i, int i2) {
        F(20);
        B(i, 0);
        C(i2);
    }

    @Override // defpackage.j70
    public final void w(int i) {
        F(5);
        C(i);
    }

    @Override // defpackage.j70
    public final void x(int i, long j) {
        F(20);
        B(i, 0);
        D(j);
    }

    @Override // defpackage.j70
    public final void y(long j) {
        F(10);
        D(j);
    }

    public final void z(int i) {
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        byte[] bArr = this.d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }
}
