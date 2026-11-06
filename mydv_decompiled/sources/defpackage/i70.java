package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i70 {
    public static final Logger f = Logger.getLogger(i70.class.getName());
    public static final boolean g = we5.f;
    public uu2 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final mp4 e;

    public i70(mp4 mp4Var, int i) {
        if (i < 0) {
            s83.t("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.b = new byte[max];
        this.c = max;
        this.e = mp4Var;
    }

    public static int f(int i, f00 f00Var) {
        return g(f00Var) + m(i);
    }

    public static int g(f00 f00Var) {
        int size = f00Var.size();
        return n(size) + size;
    }

    public static int h(int i) {
        return m(i) + 4;
    }

    public static int i(int i) {
        return m(i) + 8;
    }

    public static int j(int i, s3 s3Var, ra4 ra4Var) {
        return s3Var.b(ra4Var) + (m(i) * 2);
    }

    public static int k(int i) {
        if (i >= 0) {
            return n(i);
        }
        return 10;
    }

    public static int l(String str) {
        int length;
        try {
            length = ng5.a(str);
        } catch (kg5 unused) {
            length = str.getBytes(r32.a).length;
        }
        return n(length) + length;
    }

    public static int m(int i) {
        return n(i << 3);
    }

    public static int n(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int o(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void A(int i, int i2) {
        q(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void B(int i) {
        if (i >= 0) {
            I(i);
        } else {
            K(i);
        }
    }

    public final void C(byte[] bArr, int i, int i2) {
        s(bArr, i, i2);
    }

    public final void D(int i, s3 s3Var, ra4 ra4Var) {
        G(i, 2);
        I(s3Var.b(ra4Var));
        ra4Var.i(this.a, s3Var);
    }

    public final void E(int i, String str) {
        G(i, 2);
        F(str);
    }

    public final void F(String str) {
        try {
            int length = str.length() * 3;
            int n = n(length);
            int i = n + length;
            int i2 = this.c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int l = ng5.a.l(str, bArr, 0, length);
                I(l);
                s(bArr, 0, l);
                return;
            }
            if (i > i2 - this.d) {
                p();
            }
            int n2 = n(str.length());
            int i3 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (n2 == n) {
                    int i4 = i3 + n2;
                    this.d = i4;
                    int l2 = ng5.a.l(str, bArr2, i4, i2 - i4);
                    this.d = i3;
                    d((l2 - i3) - n2);
                    this.d = l2;
                } else {
                    int a = ng5.a(str);
                    d(a);
                    this.d = ng5.a.l(str, bArr2, this.d, a);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new g70(e);
            } catch (kg5 e2) {
                this.d = i3;
                throw e2;
            }
        } catch (kg5 e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(r32.a);
            try {
                I(bytes.length);
                C(bytes, 0, bytes.length);
            } catch (g70 e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new g70(e5);
            }
        }
    }

    public final void G(int i, int i2) {
        I((i << 3) | i2);
    }

    public final void H(int i, int i2) {
        q(20);
        c(i, 0);
        d(i2);
    }

    public final void I(int i) {
        q(5);
        d(i);
    }

    public final void J(int i, long j) {
        q(20);
        c(i, 0);
        e(j);
    }

    public final void K(long j) {
        q(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte[] bArr = this.b;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void b(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    we5.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.d = i3 + 1;
                    we5.k(bArr, i3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.d;
                if (j2 == 0) {
                    this.d = i + 1;
                    we5.k(bArr, i, (byte) j);
                    return;
                } else {
                    this.d = i + 1;
                    we5.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.d;
                if (j3 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void p() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void q(int i) {
        if (this.c - this.d < i) {
            p();
        }
    }

    public final void r(byte b) {
        if (this.d == this.c) {
            p();
        }
        int i = this.d;
        this.d = i + 1;
        this.b[i] = b;
    }

    public final void s(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        p();
        if (i7 > i4) {
            this.e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    public final void t(int i, boolean z) {
        q(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void u(int i, f00 f00Var) {
        G(i, 2);
        v(f00Var);
    }

    public final void v(f00 f00Var) {
        I(f00Var.size());
        C(f00Var.J, f00Var.d(), f00Var.size());
    }

    public final void w(int i, int i2) {
        q(14);
        c(i, 5);
        a(i2);
    }

    public final void x(int i) {
        q(4);
        a(i);
    }

    public final void y(int i, long j) {
        q(18);
        c(i, 1);
        b(j);
    }

    public final void z(long j) {
        q(8);
        b(j);
    }
}
