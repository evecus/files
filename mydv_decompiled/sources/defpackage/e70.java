package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e70 extends j70 {
    public final byte[] d;
    public final int e;
    public int f;

    public e70(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // defpackage.j70
    public final void i(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // defpackage.j70
    public final void j(int i, boolean z) {
        u(i, 0);
        i(z ? (byte) 1 : (byte) 0);
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
        u(i, 5);
        m(i2);
    }

    @Override // defpackage.j70
    public final void m(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // defpackage.j70
    public final void n(int i, long j) {
        u(i, 1);
        o(j);
    }

    @Override // defpackage.j70
    public final void o(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // defpackage.j70
    public final void p(int i, int i2) {
        u(i, 0);
        q(i2);
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
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
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
        int i2 = this.f;
        try {
            int f = j70.f(str.length() * 3);
            int f2 = j70.f(str.length());
            byte[] bArr = this.d;
            if (f2 != f) {
                w(lg5.a(str));
                this.f = lg5.a.w(str, bArr, this.f, z());
                return;
            }
            int i3 = i2 + f2;
            this.f = i3;
            int w = lg5.a.w(str, bArr, i3, z());
            this.f = i2;
            w((w - i2) - f2);
            this.f = w;
        } catch (ig5 e) {
            this.f = i2;
            h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new f70(e2);
        }
    }

    @Override // defpackage.j70
    public final void u(int i, int i2) {
        w((i << 3) | i2);
    }

    @Override // defpackage.j70
    public final void v(int i, int i2) {
        u(i, 0);
        w(i2);
    }

    @Override // defpackage.j70
    public final void w(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f;
            byte[] bArr = this.d;
            if (i2 == 0) {
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // defpackage.j70
    public final void x(int i, long j) {
        u(i, 0);
        y(j);
    }

    @Override // defpackage.j70
    public final void y(long j) {
        boolean z = j70.c;
        byte[] bArr = this.d;
        if (!z || z() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.f = i + 1;
                        bArr[i] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                throw new f70(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.f;
            if (j3 == 0) {
                this.f = i2 + 1;
                ve5.l(bArr, i2, (byte) j);
                return;
            } else {
                this.f = i2 + 1;
                ve5.l(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        }
    }

    public final int z() {
        return this.e - this.f;
    }
}
