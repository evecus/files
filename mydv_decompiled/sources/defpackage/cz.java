package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cz implements mz, lz, Cloneable, ByteChannel {
    public kh4 I;
    public long J;

    public final long A(byte b, long j, long j2) {
        kh4 kh4Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.J + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.J;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (kh4Var = this.I) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                kh4Var = kh4Var.g;
                kh4Var.getClass();
                j4 -= kh4Var.c - kh4Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = kh4Var.a;
                int min = (int) Math.min(kh4Var.c, (kh4Var.b + j2) - j4);
                for (int i = (int) ((kh4Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - kh4Var.b) + j4;
                    }
                }
                j4 += kh4Var.c - kh4Var.b;
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (kh4Var.c - kh4Var.b) + j3;
            if (j5 > j) {
                break;
            }
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = kh4Var.a;
            int min2 = (int) Math.min(kh4Var.c, (kh4Var.b + j2) - j3);
            for (int i2 = (int) ((kh4Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - kh4Var.b) + j3;
                }
            }
            j3 += kh4Var.c - kh4Var.b;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz B(String str) {
        k0(str);
        return this;
    }

    @Override // defpackage.mz
    public final void C(cz czVar, long j) {
        czVar.getClass();
        long j2 = this.J;
        if (j2 >= j) {
            czVar.write(this, j);
        } else {
            czVar.write(this, j2);
            zy.c();
        }
    }

    @Override // defpackage.mz
    public final String D(Charset charset) {
        charset.getClass();
        return O(this.J, charset);
    }

    public final long E(h00 h00Var) {
        int i;
        int i2;
        h00Var.getClass();
        kh4 kh4Var = this.I;
        if (kh4Var == null) {
            return -1L;
        }
        long j = this.J;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                kh4Var = kh4Var.g;
                kh4Var.getClass();
                j -= kh4Var.c - kh4Var.b;
            }
            if (h00Var.d() == 2) {
                byte i3 = h00Var.i(0);
                byte i4 = h00Var.i(1);
                while (j < this.J) {
                    byte[] bArr = kh4Var.a;
                    i = (int) ((kh4Var.b + j2) - j);
                    int i5 = kh4Var.c;
                    while (i < i5) {
                        byte b = bArr[i];
                        if (b != i3 && b != i4) {
                            i++;
                        }
                        i2 = kh4Var.b;
                    }
                    j2 = (kh4Var.c - kh4Var.b) + j;
                    kh4Var = kh4Var.f;
                    kh4Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] h = h00Var.h();
            while (j < this.J) {
                byte[] bArr2 = kh4Var.a;
                i = (int) ((kh4Var.b + j2) - j);
                int i6 = kh4Var.c;
                while (i < i6) {
                    byte b2 = bArr2[i];
                    for (byte b3 : h) {
                        if (b2 == b3) {
                            i2 = kh4Var.b;
                        }
                    }
                    i++;
                }
                j2 = (kh4Var.c - kh4Var.b) + j;
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (kh4Var.c - kh4Var.b) + j;
            if (j3 > 0) {
                break;
            }
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j = j3;
        }
        if (h00Var.d() == 2) {
            byte i7 = h00Var.i(0);
            byte i8 = h00Var.i(1);
            while (j < this.J) {
                byte[] bArr3 = kh4Var.a;
                i = (int) ((kh4Var.b + j2) - j);
                int i9 = kh4Var.c;
                while (i < i9) {
                    byte b4 = bArr3[i];
                    if (b4 != i7 && b4 != i8) {
                        i++;
                    }
                    i2 = kh4Var.b;
                }
                j2 = (kh4Var.c - kh4Var.b) + j;
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] h2 = h00Var.h();
        while (j < this.J) {
            byte[] bArr4 = kh4Var.a;
            i = (int) ((kh4Var.b + j2) - j);
            int i10 = kh4Var.c;
            while (i < i10) {
                byte b5 = bArr4[i];
                for (byte b6 : h2) {
                    if (b5 == b6) {
                        i2 = kh4Var.b;
                    }
                }
                i++;
            }
            j2 = (kh4Var.c - kh4Var.b) + j;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final boolean F(int i, h00 h00Var, long j) {
        h00Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.J && i <= h00Var.d()) {
            return i == 0 || b.a(this, h00Var, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz G(long j) {
        f0(j);
        return this;
    }

    @Override // defpackage.mz
    public final h00 I() {
        return i(this.J);
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz J(int i, int i2, String str) {
        j0(i, i2, str);
        return this;
    }

    public final void K(az azVar) {
        azVar.getClass();
        byte[] bArr = b.a;
        if (azVar.I != null) {
            zy.i("already attached to a buffer");
        } else {
            azVar.I = this;
            azVar.J = true;
        }
    }

    @Override // defpackage.mz
    public final String L() {
        return w(Long.MAX_VALUE);
    }

    public final short M() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.mz
    public final byte[] N(long j) {
        if (j < 0 || j > 2147483647L) {
            s83.h(r7.A("byteCount: ", j));
            return null;
        }
        if (this.J < j) {
            zy.c();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final String O(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            s83.h(r7.A("byteCount: ", j));
            return null;
        }
        if (this.J < j) {
            zy.c();
            return null;
        }
        if (j == 0) {
            return "";
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        int i = kh4Var.b;
        if (i + j > kh4Var.c) {
            return new String(N(j), charset);
        }
        int i2 = (int) j;
        String str = new String(kh4Var.a, i, i2, charset);
        int i3 = kh4Var.b + i2;
        kh4Var.b = i3;
        this.J -= j;
        if (i3 == kh4Var.c) {
            this.I = kh4Var.a();
            ph4.a(kh4Var);
        }
        return str;
    }

    @Override // defpackage.mz
    public final int P(mg3 mg3Var) {
        mg3Var.getClass();
        int d = b.d(this, mg3Var, false);
        if (d == -1) {
            return -1;
        }
        skip(mg3Var.I[d].d());
        return d;
    }

    public final String Q() {
        return O(this.J, z50.a);
    }

    public final int R() {
        int i;
        int i2;
        int i3;
        if (this.J == 0) {
            zy.c();
            return 0;
        }
        byte y = y(0L);
        if ((y & 128) == 0) {
            i = y & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((y & 224) == 192) {
            i = y & 31;
            i2 = 2;
            i3 = 128;
        } else if ((y & 240) == 224) {
            i = y & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((y & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = y & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.J < j) {
            StringBuilder C = hf1.C("size < ", i2, ": ");
            C.append(this.J);
            C.append(" (to read code point prefixed 0x");
            C.append(o7.S(y));
            C.append(')');
            throw new EOFException(C.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte y2 = y(j2);
            if ((y2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (y2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz S(h00 h00Var) {
        c0(h00Var);
        return this;
    }

    @Override // defpackage.mz
    public final void U(long j) {
        if (this.J >= j) {
            return;
        }
        zy.c();
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz V(long j) {
        e0(j);
        return this;
    }

    public final h00 W(int i) {
        if (i == 0) {
            return h00.L;
        }
        o7.j(this.J, 0L, i);
        kh4 kh4Var = this.I;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kh4Var.getClass();
            int i5 = kh4Var.c;
            int i6 = kh4Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            kh4Var = kh4Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        kh4 kh4Var2 = this.I;
        int i7 = 0;
        while (i2 < i) {
            kh4Var2.getClass();
            bArr[i7] = kh4Var2.a;
            i2 += kh4Var2.c - kh4Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = kh4Var2.b;
            kh4Var2.d = true;
            i7++;
            kh4Var2 = kh4Var2.f;
        }
        return new qh4(bArr, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    @Override // defpackage.mz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long X() {
        /*
            r14 = this;
            long r0 = r14.J
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            kh4 r6 = r14.I
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            cz r14 = new cz
            r14.<init>()
            r14.f0(r4)
            r14.d0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.Q()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.o7.S(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            kh4 r7 = r6.a()
            r14.I = r7
            defpackage.ph4.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            kh4 r6 = r14.I
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.J
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.J = r1
            return r4
        L94:
            defpackage.zy.c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz.X():long");
    }

    @Override // defpackage.mz
    public final InputStream Z() {
        return new bz(this);
    }

    public final kh4 a0(int i) {
        if (i < 1 || i > 8192) {
            s83.t("unexpected capacity");
            return null;
        }
        kh4 kh4Var = this.I;
        if (kh4Var == null) {
            kh4 b = ph4.b();
            this.I = b;
            b.g = b;
            b.f = b;
            return b;
        }
        kh4 kh4Var2 = kh4Var.g;
        kh4Var2.getClass();
        if (kh4Var2.c + i <= 8192 && kh4Var2.e) {
            return kh4Var2;
        }
        kh4 b2 = ph4.b();
        kh4Var2.b(b2);
        return b2;
    }

    public final void b0(mz mzVar, long j) {
        while (j > 0) {
            long read = mzVar.read(this, j);
            if (read == -1) {
                zy.c();
                return;
            }
            j -= read;
        }
    }

    public final void c0(h00 h00Var) {
        h00Var.getClass();
        h00Var.t(h00Var.d(), this);
    }

    public final Object clone() {
        return n();
    }

    public final void d0(int i) {
        kh4 a0 = a0(1);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        a0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.J++;
    }

    public final void e() {
        skip(this.J);
    }

    public final void e0(long j) {
        boolean z;
        if (j == 0) {
            d0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                k0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > b.b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        kh4 a0 = a0(i);
        byte[] bArr2 = a0.a;
        int i2 = a0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        a0.c += i;
        this.J += i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        long j = this.J;
        cz czVar = (cz) obj;
        if (j != czVar.J) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        kh4 kh4Var2 = czVar.I;
        kh4Var2.getClass();
        int i = kh4Var.b;
        int i2 = kh4Var2.b;
        long j2 = 0;
        while (j2 < this.J) {
            long min = Math.min(kh4Var.c - i, kh4Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (kh4Var.a[i] != kh4Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == kh4Var.c) {
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                i = kh4Var.b;
            }
            if (i2 == kh4Var2.c) {
                kh4Var2 = kh4Var2.f;
                kh4Var2.getClass();
                i2 = kh4Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.mz
    public final String f(long j) {
        return O(j, z50.a);
    }

    public final void f0(long j) {
        if (j == 0) {
            d0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        kh4 a0 = a0(i);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        a0.c += i;
        this.J += i;
    }

    public final long g() {
        long j = this.J;
        if (j == 0) {
            return 0L;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        kh4 kh4Var2 = kh4Var.g;
        kh4Var2.getClass();
        return (kh4Var2.c >= 8192 || !kh4Var2.e) ? j : j - (r2 - kh4Var2.b);
    }

    public final void g0(int i) {
        kh4 a0 = a0(4);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        a0.c = i2 + 4;
        this.J += 4;
    }

    @Override // defpackage.mz
    public final boolean h(long j, h00 h00Var) {
        h00Var.getClass();
        return F(h00Var.d(), h00Var, j);
    }

    public final void h0(int i) {
        kh4 a0 = a0(2);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        a0.c = i2 + 2;
        this.J += 2;
    }

    public final int hashCode() {
        kh4 kh4Var = this.I;
        if (kh4Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = kh4Var.c;
            for (int i3 = kh4Var.b; i3 < i2; i3++) {
                i = (i * 31) + kh4Var.a[i3];
            }
            kh4Var = kh4Var.f;
            kh4Var.getClass();
        } while (kh4Var != this.I);
        return i;
    }

    @Override // defpackage.mz
    public final h00 i(long j) {
        if (j < 0 || j > 2147483647L) {
            s83.h(r7.A("byteCount: ", j));
            return null;
        }
        if (this.J < j) {
            zy.c();
            return null;
        }
        if (j < 4096) {
            return new h00(N(j));
        }
        h00 W = W((int) j);
        skip(j);
        return W;
    }

    public final void i0(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            s83.h(hf1.u(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            s83.h(r7.x(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            s83.f(str.length(), hf1.C("endIndex > string.length: ", i2, " > "));
        } else {
            if (charset.equals(z50.a)) {
                j0(i, i2, str);
                return;
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            bytes.getClass();
            m196write(bytes, 0, bytes.length);
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            s83.h(hf1.u(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            s83.h(r7.x(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            s83.f(str.length(), hf1.C("endIndex > string.length: ", i2, " > "));
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                kh4 a0 = a0(1);
                byte[] bArr = a0.a;
                int i3 = a0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = a0.c;
                int i6 = (i3 + i) - i5;
                a0.c = i5 + i6;
                this.J += i6;
            } else {
                if (charAt2 < 2048) {
                    kh4 a02 = a0(2);
                    byte[] bArr2 = a02.a;
                    int i7 = a02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    a02.c = i7 + 2;
                    this.J += 2;
                } else if (55296 <= charAt2 && charAt2 < 56320) {
                    int i8 = i + 1;
                    char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > charAt3 || charAt3 >= 57344) {
                        d0(63);
                        i = i8;
                    } else {
                        int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        kh4 a03 = a0(4);
                        byte[] bArr3 = a03.a;
                        int i10 = a03.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        a03.c = i10 + 4;
                        this.J += 4;
                        i += 2;
                    }
                } else if (56320 > charAt2 || charAt2 >= 57344) {
                    kh4 a04 = a0(3);
                    byte[] bArr4 = a04.a;
                    int i11 = a04.c;
                    bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                    a04.c = i11 + 3;
                    this.J += 3;
                } else {
                    d0(63);
                }
                i++;
            }
        }
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz k(int i) {
        l0(i);
        return this;
    }

    public final void k0(String str) {
        str.getClass();
        j0(0, str.length(), str);
    }

    public final void l0(int i) {
        if (i < 128) {
            d0(i);
            return;
        }
        if (i < 2048) {
            kh4 a0 = a0(2);
            byte[] bArr = a0.a;
            int i2 = a0.c;
            bArr[i2] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            a0.c = i2 + 2;
            this.J += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            d0(63);
            return;
        }
        if (i < 65536) {
            kh4 a02 = a0(3);
            byte[] bArr2 = a02.a;
            int i3 = a02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            a02.c = i3 + 3;
            this.J += 3;
            return;
        }
        if (i > 1114111) {
            s83.t("Unexpected code point: 0x".concat(o7.T(i)));
            return;
        }
        kh4 a03 = a0(4);
        byte[] bArr3 = a03.a;
        int i4 = a03.c;
        bArr3[i4] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        a03.c = i4 + 4;
        this.J += 4;
    }

    @Override // defpackage.mz
    public final byte[] m() {
        return N(this.J);
    }

    public final cz n() {
        cz czVar = new cz();
        if (this.J == 0) {
            return czVar;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        kh4 c = kh4Var.c();
        czVar.I = c;
        c.g = c;
        c.f = c;
        for (kh4 kh4Var2 = kh4Var.f; kh4Var2 != kh4Var; kh4Var2 = kh4Var2.f) {
            kh4 kh4Var3 = c.g;
            kh4Var3.getClass();
            kh4Var2.getClass();
            kh4Var3.b(kh4Var2.c());
        }
        czVar.J = this.J;
        return czVar;
    }

    @Override // defpackage.mz
    public final boolean p() {
        return this.J == 0;
    }

    @Override // defpackage.mz
    public final s04 peek() {
        return new s04(new pl3(this));
    }

    @Override // defpackage.lz
    public final long q(ut4 ut4Var) {
        ut4Var.getClass();
        long j = 0;
        while (true) {
            long read = ut4Var.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        o7.j(bArr.length, i, i2);
        kh4 kh4Var = this.I;
        if (kh4Var == null) {
            return -1;
        }
        int min = Math.min(i2, kh4Var.c - kh4Var.b);
        byte[] bArr2 = kh4Var.a;
        int i3 = kh4Var.b;
        dq.R0(bArr2, i, i3, bArr, i3 + min);
        int i4 = kh4Var.b + min;
        kh4Var.b = i4;
        this.J -= min;
        if (i4 == kh4Var.c) {
            this.I = kh4Var.a();
            ph4.a(kh4Var);
        }
        return min;
    }

    @Override // defpackage.mz
    public final byte readByte() {
        if (this.J == 0) {
            zy.c();
            return (byte) 0;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        int i = kh4Var.b;
        int i2 = kh4Var.c;
        int i3 = i + 1;
        byte b = kh4Var.a[i];
        this.J--;
        if (i3 != i2) {
            kh4Var.b = i3;
            return b;
        }
        this.I = kh4Var.a();
        ph4.a(kh4Var);
        return b;
    }

    @Override // defpackage.mz
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                zy.c();
                return;
            }
            i += read;
        }
    }

    @Override // defpackage.mz
    public final int readInt() {
        if (this.J < 4) {
            zy.c();
            return 0;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        int i = kh4Var.b;
        int i2 = kh4Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = kh4Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.J -= 4;
        if (i5 != i2) {
            kh4Var.b = i5;
            return i6;
        }
        this.I = kh4Var.a();
        ph4.a(kh4Var);
        return i6;
    }

    @Override // defpackage.mz
    public final long readLong() {
        if (this.J < 8) {
            zy.c();
            return 0L;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        int i = kh4Var.b;
        int i2 = kh4Var.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = kh4Var.a;
        int i3 = i + 7;
        long j = ((bArr[i + 3] & 255) << 32) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.J -= 8;
        if (i4 != i2) {
            kh4Var.b = i4;
            return j2;
        }
        this.I = kh4Var.a();
        ph4.a(kh4Var);
        return j2;
    }

    @Override // defpackage.mz
    public final short readShort() {
        if (this.J < 2) {
            zy.c();
            return (short) 0;
        }
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        int i = kh4Var.b;
        int i2 = kh4Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = kh4Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.J -= 2;
        if (i5 == i2) {
            this.I = kh4Var.a();
            ph4.a(kh4Var);
        } else {
            kh4Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.mz
    public final boolean request(long j) {
        return this.J >= j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.J - r1;
        r19.J = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + defpackage.o7.S(y(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        r3 = r17;
        defpackage.zy.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    @Override // defpackage.mz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz.s():long");
    }

    @Override // defpackage.mz
    public final void skip(long j) {
        while (j > 0) {
            kh4 kh4Var = this.I;
            if (kh4Var == null) {
                zy.c();
                return;
            }
            int min = (int) Math.min(j, kh4Var.c - kh4Var.b);
            long j2 = min;
            this.J -= j2;
            j -= j2;
            int i = kh4Var.b + min;
            kh4Var.b = i;
            if (i == kh4Var.c) {
                this.I = kh4Var.a();
                ph4.a(kh4Var);
            }
        }
    }

    public final void t(cz czVar, long j, long j2) {
        czVar.getClass();
        long j3 = j;
        o7.j(this.J, j3, j2);
        if (j2 == 0) {
            return;
        }
        czVar.J += j2;
        kh4 kh4Var = this.I;
        while (true) {
            kh4Var.getClass();
            long j4 = kh4Var.c - kh4Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            kh4Var = kh4Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            kh4Var.getClass();
            kh4 c = kh4Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            kh4 kh4Var2 = czVar.I;
            if (kh4Var2 == null) {
                c.g = c;
                c.f = c;
                czVar.I = c;
            } else {
                kh4 kh4Var3 = kh4Var2.g;
                kh4Var3.getClass();
                kh4Var3.b(c);
            }
            j5 -= c.c - c.b;
            kh4Var = kh4Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return u75.NONE;
    }

    public final String toString() {
        long j = this.J;
        if (j <= 2147483647L) {
            return W((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.J).toString());
    }

    @Override // defpackage.mz
    public final long u(long j, h00 h00Var) {
        h00Var.getClass();
        byte[] bArr = b.a;
        return b.a(this, h00Var, 0L, j, h00Var.d());
    }

    @Override // defpackage.mz
    public final String w(long j) {
        if (j < 0) {
            s83.h(r7.A("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long A = A((byte) 10, 0L, j2);
        if (A != -1) {
            return b.c(this, A);
        }
        if (j2 < this.J && y(j2 - 1) == 13 && y(j2) == 10) {
            return b.c(this, j2);
        }
        cz czVar = new cz();
        t(czVar, 0L, Math.min(32L, this.J));
        throw new EOFException("\\n not found: limit=" + Math.min(this.J, j) + " content=" + czVar.i(czVar.J).e() + (char) 8230);
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        kh4 b;
        czVar.getClass();
        if (czVar == this) {
            s83.t("source == this");
            return;
        }
        o7.j(czVar.J, 0L, j);
        while (j > 0) {
            kh4 kh4Var = czVar.I;
            kh4Var.getClass();
            int i = kh4Var.c;
            kh4 kh4Var2 = czVar.I;
            kh4Var2.getClass();
            long j2 = i - kh4Var2.b;
            int i2 = 0;
            if (j < j2) {
                kh4 kh4Var3 = this.I;
                kh4 kh4Var4 = kh4Var3 != null ? kh4Var3.g : null;
                if (kh4Var4 != null && kh4Var4.e) {
                    if ((kh4Var4.c + j) - (kh4Var4.d ? 0 : kh4Var4.b) <= 8192) {
                        kh4 kh4Var5 = czVar.I;
                        kh4Var5.getClass();
                        kh4Var5.d(kh4Var4, (int) j);
                        czVar.J -= j;
                        this.J += j;
                        return;
                    }
                }
                kh4 kh4Var6 = czVar.I;
                kh4Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > kh4Var6.c - kh4Var6.b) {
                    s83.t("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = kh4Var6.c();
                } else {
                    b = ph4.b();
                    byte[] bArr = kh4Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = kh4Var6.b;
                    dq.R0(bArr, 0, i4, bArr2, i4 + i3);
                }
                b.c = b.b + i3;
                kh4Var6.b += i3;
                kh4 kh4Var7 = kh4Var6.g;
                kh4Var7.getClass();
                kh4Var7.b(b);
                czVar.I = b;
            }
            kh4 kh4Var8 = czVar.I;
            kh4Var8.getClass();
            long j3 = kh4Var8.c - kh4Var8.b;
            czVar.I = kh4Var8.a();
            kh4 kh4Var9 = this.I;
            if (kh4Var9 == null) {
                this.I = kh4Var8;
                kh4Var8.g = kh4Var8;
                kh4Var8.f = kh4Var8;
            } else {
                kh4 kh4Var10 = kh4Var9.g;
                kh4Var10.getClass();
                kh4Var10.b(kh4Var8);
                kh4 kh4Var11 = kh4Var8.g;
                if (kh4Var11 == kh4Var8) {
                    zy.i("cannot compact");
                    return;
                }
                kh4Var11.getClass();
                if (kh4Var11.e) {
                    int i5 = kh4Var8.c - kh4Var8.b;
                    kh4 kh4Var12 = kh4Var8.g;
                    kh4Var12.getClass();
                    int i6 = 8192 - kh4Var12.c;
                    kh4 kh4Var13 = kh4Var8.g;
                    kh4Var13.getClass();
                    if (!kh4Var13.d) {
                        kh4 kh4Var14 = kh4Var8.g;
                        kh4Var14.getClass();
                        i2 = kh4Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        kh4 kh4Var15 = kh4Var8.g;
                        kh4Var15.getClass();
                        kh4Var8.d(kh4Var15, i5);
                        kh4Var8.a();
                        ph4.a(kh4Var8);
                    }
                }
            }
            czVar.J -= j3;
            this.J += j3;
            j -= j3;
        }
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz writeByte(int i) {
        d0(i);
        return this;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz writeInt(int i) {
        g0(i);
        return this;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz writeShort(int i) {
        h0(i);
        return this;
    }

    public final byte y(long j) {
        o7.j(this.J, j, 1L);
        kh4 kh4Var = this.I;
        kh4Var.getClass();
        long j2 = this.J;
        if (j2 - j < j) {
            while (j2 > j) {
                kh4Var = kh4Var.g;
                kh4Var.getClass();
                j2 -= kh4Var.c - kh4Var.b;
            }
            return kh4Var.a[(int) ((kh4Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = kh4Var.c;
            int i2 = kh4Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return kh4Var.a[(int) ((i2 + j) - j3)];
            }
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.mz
    public final long z(lz lzVar) {
        lzVar.getClass();
        long j = this.J;
        if (j > 0) {
            lzVar.write(this, j);
        }
        return j;
    }

    @Override // defpackage.mz, defpackage.lz
    public final cz a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.eq4
    public final void close() {
    }

    @Override // defpackage.lz, defpackage.eq4, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.lz
    public final lz r() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        kh4 kh4Var = this.I;
        if (kh4Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), kh4Var.c - kh4Var.b);
        byteBuffer.put(kh4Var.a, kh4Var.b, min);
        int i = kh4Var.b + min;
        kh4Var.b = i;
        this.J -= min;
        if (i == kh4Var.c) {
            this.I = kh4Var.a();
            ph4.a(kh4Var);
        }
        return min;
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        czVar.getClass();
        if (j >= 0) {
            long j2 = this.J;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            czVar.write(this, j);
            return j;
        }
        s83.h(r7.A("byteCount < 0: ", j));
        return 0L;
    }

    @Override // defpackage.lz
    public final /* bridge */ /* synthetic */ lz write(byte[] bArr, int i, int i2) {
        m196write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.lz
    public final lz write(byte[] bArr) {
        bArr.getClass();
        m196write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            kh4 a0 = a0(1);
            int min = Math.min(i, 8192 - a0.c);
            byteBuffer.get(a0.a, a0.c, min);
            i -= min;
            a0.c += min;
        }
        this.J += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m196write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        o7.j(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            kh4 a0 = a0(1);
            int min = Math.min(i3 - i, 8192 - a0.c);
            int i4 = i + min;
            dq.R0(bArr, a0.c, i, a0.a, i4);
            a0.c += min;
            i = i4;
        }
        this.J += j;
    }
}
