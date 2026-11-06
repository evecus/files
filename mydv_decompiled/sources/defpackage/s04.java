package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s04 implements mz {
    public final ut4 I;
    public final cz J;
    public boolean K;

    public s04(ut4 ut4Var) {
        ut4Var.getClass();
        this.I = ut4Var;
        this.J = new cz();
    }

    @Override // defpackage.mz
    public final void C(cz czVar, long j) {
        cz czVar2 = this.J;
        czVar.getClass();
        try {
            U(j);
            czVar2.C(czVar, j);
        } catch (EOFException e) {
            czVar.q(czVar2);
            throw e;
        }
    }

    @Override // defpackage.mz
    public final String D(Charset charset) {
        charset.getClass();
        ut4 ut4Var = this.I;
        cz czVar = this.J;
        czVar.q(ut4Var);
        return czVar.O(czVar.J, charset);
    }

    @Override // defpackage.mz
    public final h00 I() {
        ut4 ut4Var = this.I;
        cz czVar = this.J;
        czVar.q(ut4Var);
        return czVar.i(czVar.J);
    }

    @Override // defpackage.mz
    public final String L() {
        return w(Long.MAX_VALUE);
    }

    @Override // defpackage.mz
    public final byte[] N(long j) {
        U(j);
        return this.J.N(j);
    }

    @Override // defpackage.mz
    public final int P(mg3 mg3Var) {
        mg3Var.getClass();
        if (this.K) {
            zy.i("closed");
            return 0;
        }
        while (true) {
            cz czVar = this.J;
            int d = b.d(czVar, mg3Var, true);
            if (d != -2) {
                if (d != -1) {
                    czVar.skip(mg3Var.I[d].d());
                    return d;
                }
            } else if (this.I.read(czVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.mz
    public final void U(long j) {
        if (request(j)) {
            return;
        }
        zy.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.o7.k(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.mz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long X() {
        /*
            r6 = this;
            r0 = 1
            r6.U(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.request(r2)
            cz r3 = r6.J
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.y(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.o7.k(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L4c:
            long r0 = r3.X()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s04.X():long");
    }

    @Override // defpackage.mz
    public final InputStream Z() {
        return new r04(this);
    }

    @Override // defpackage.mz, defpackage.lz
    public final cz a() {
        return this.J;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.I.close();
        this.J.e();
    }

    public final long e(byte b, long j, long j2) {
        if (this.K) {
            zy.i("closed");
            return 0L;
        }
        if (0 > j2) {
            s83.h(r7.A("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            cz czVar = this.J;
            byte b2 = b;
            long j4 = j2;
            long A = czVar.A(b2, j3, j4);
            if (A == -1) {
                long j5 = czVar.J;
                if (j5 >= j4 || this.I.read(czVar, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return A;
            }
        }
        return -1L;
    }

    @Override // defpackage.mz
    public final String f(long j) {
        U(j);
        return this.J.O(j, z50.a);
    }

    public final int g() {
        U(4L);
        return o7.M(this.J.readInt());
    }

    @Override // defpackage.mz
    public final boolean h(long j, h00 h00Var) {
        h00Var.getClass();
        int d = h00Var.d();
        if (!this.K) {
            return d >= 0 && d <= h00Var.d() && (d == 0 || j16.t(this, h00Var, d, 1L) != -1);
        }
        zy.i("closed");
        return false;
    }

    @Override // defpackage.mz
    public final h00 i(long j) {
        U(j);
        return this.J.i(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.K;
    }

    @Override // defpackage.mz
    public final byte[] m() {
        ut4 ut4Var = this.I;
        cz czVar = this.J;
        czVar.q(ut4Var);
        return czVar.N(czVar.J);
    }

    public final long n() {
        U(8L);
        long readLong = this.J.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // defpackage.mz
    public final boolean p() {
        if (this.K) {
            zy.i("closed");
            return false;
        }
        cz czVar = this.J;
        return czVar.p() && this.I.read(czVar, 8192L) == -1;
    }

    @Override // defpackage.mz
    public final s04 peek() {
        return new s04(new pl3(this));
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        czVar.getClass();
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return 0L;
        }
        if (this.K) {
            zy.i("closed");
            return 0L;
        }
        cz czVar2 = this.J;
        if (czVar2.J == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.I.read(czVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return czVar2.read(czVar, Math.min(j, czVar2.J));
    }

    @Override // defpackage.mz
    public final byte readByte() {
        U(1L);
        return this.J.readByte();
    }

    @Override // defpackage.mz
    public final void readFully(byte[] bArr) {
        cz czVar = this.J;
        bArr.getClass();
        try {
            U(bArr.length);
            czVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = czVar.J;
                if (j <= 0) {
                    throw e;
                }
                int read = czVar.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // defpackage.mz
    public final int readInt() {
        U(4L);
        return this.J.readInt();
    }

    @Override // defpackage.mz
    public final long readLong() {
        U(8L);
        return this.J.readLong();
    }

    @Override // defpackage.mz
    public final short readShort() {
        U(2L);
        return this.J.readShort();
    }

    @Override // defpackage.mz
    public final boolean request(long j) {
        cz czVar;
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return false;
        }
        if (this.K) {
            zy.i("closed");
            return false;
        }
        do {
            czVar = this.J;
            if (czVar.J >= j) {
                return true;
            }
        } while (this.I.read(czVar, 8192L) != -1);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        defpackage.o7.k(16);
        r0 = java.lang.Integer.toString(r8, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    @Override // defpackage.mz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s() {
        /*
            r11 = this;
            r0 = 1
            r11.U(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.request(r6)
            cz r9 = r11.J
            if (r8 == 0) goto L44
            byte r8 = r9.y(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L44
        L2c:
            java.lang.NumberFormatException r11 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.o7.k(r0)
            java.lang.String r0 = java.lang.Integer.toString(r8, r0)
            r0.getClass()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r11.<init>(r0)
            throw r11
        L44:
            long r0 = r9.s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s04.s():long");
    }

    @Override // defpackage.mz
    public final void skip(long j) {
        if (this.K) {
            zy.i("closed");
            return;
        }
        while (j > 0) {
            cz czVar = this.J;
            if (czVar.J == 0 && this.I.read(czVar, 8192L) == -1) {
                zy.c();
                return;
            } else {
                long min = Math.min(j, czVar.J);
                czVar.skip(min);
                j -= min;
            }
        }
    }

    public final short t() {
        U(2L);
        return this.J.M();
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.I.timeout();
    }

    public final String toString() {
        return "buffer(" + this.I + ')';
    }

    @Override // defpackage.mz
    public final long u(long j, h00 h00Var) {
        h00Var.getClass();
        return j16.u(this, h00Var, j);
    }

    @Override // defpackage.mz
    public final String w(long j) {
        if (j < 0) {
            s83.h(r7.A("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long e = e((byte) 10, 0L, j2);
        cz czVar = this.J;
        if (e != -1) {
            return b.c(czVar, e);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && czVar.y(j2 - 1) == 13 && request(j2 + 1) && czVar.y(j2) == 10) {
            return b.c(czVar, j2);
        }
        cz czVar2 = new cz();
        czVar.t(czVar2, 0L, Math.min(32L, czVar.J));
        throw new EOFException("\\n not found: limit=" + Math.min(czVar.J, j) + " content=" + czVar2.i(czVar2.J).e() + (char) 8230);
    }

    @Override // defpackage.mz
    public final long z(lz lzVar) {
        cz czVar;
        lzVar.getClass();
        long j = 0;
        while (true) {
            ut4 ut4Var = this.I;
            czVar = this.J;
            if (ut4Var.read(czVar, 8192L) == -1) {
                break;
            }
            long g = czVar.g();
            if (g > 0) {
                j += g;
                lzVar.write(czVar, g);
            }
        }
        long j2 = czVar.J;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        lzVar.write(czVar, j2);
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        cz czVar = this.J;
        if (czVar.J == 0 && this.I.read(czVar, 8192L) == -1) {
            return -1;
        }
        return czVar.read(byteBuffer);
    }
}
