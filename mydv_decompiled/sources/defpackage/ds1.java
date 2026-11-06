package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ds1 implements ut4 {
    public byte I;
    public final s04 J;
    public final Inflater K;
    public final h02 L;
    public final CRC32 M;

    public ds1(mz mzVar) {
        mzVar.getClass();
        s04 s04Var = new s04(mzVar);
        this.J = s04Var;
        Inflater inflater = new Inflater(true);
        this.K = inflater;
        this.L = new h02(s04Var, inflater);
        this.M = new CRC32();
    }

    public static void e(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + jx4.P(8, o7.T(i2)) + " != expected 0x" + jx4.P(8, o7.T(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.L.close();
    }

    public final void g(cz czVar, long j, long j2) {
        kh4 kh4Var = czVar.I;
        kh4Var.getClass();
        while (true) {
            long j3 = kh4Var.c - kh4Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(kh4Var.c - r6, j2);
            this.M.update(kh4Var.a, (int) (kh4Var.b + j), min);
            j2 -= min;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        byte b;
        cz czVar2;
        ds1 ds1Var = this;
        s04 s04Var = ds1Var.J;
        cz czVar3 = s04Var.J;
        czVar.getClass();
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = ds1Var.I;
        CRC32 crc32 = ds1Var.M;
        if (b2 == 0) {
            s04Var.U(10L);
            byte y = czVar3.y(3L);
            boolean z = ((y >> 1) & 1) == 1;
            if (z) {
                ds1Var.g(czVar3, 0L, 10L);
            }
            e(8075, s04Var.readShort(), "ID1ID2");
            s04Var.skip(8L);
            if (((y >> 2) & 1) == 1) {
                s04Var.U(2L);
                if (z) {
                    g(czVar3, 0L, 2L);
                }
                long M = czVar3.M() & 65535;
                s04Var.U(M);
                if (z) {
                    g(czVar3, 0L, M);
                }
                czVar2 = czVar3;
                s04Var.skip(M);
            } else {
                czVar2 = czVar3;
            }
            if (((y >> 3) & 1) == 1) {
                long e = s04Var.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e == -1) {
                    zy.c();
                    return 0L;
                }
                if (z) {
                    g(czVar2, 0L, e + 1);
                }
                s04Var.skip(e + 1);
            }
            if (((y >> 4) & 1) == 1) {
                long e2 = s04Var.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e2 == -1) {
                    zy.c();
                    return 0L;
                }
                if (z) {
                    ds1Var = this;
                    ds1Var.g(czVar2, 0L, e2 + 1);
                } else {
                    ds1Var = this;
                }
                s04Var.skip(e2 + 1);
            } else {
                ds1Var = this;
            }
            if (z) {
                e(s04Var.t(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ds1Var.I = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = czVar.J;
            long read = ds1Var.L.read(czVar, j);
            if (read != -1) {
                ds1Var.g(czVar, j2, read);
                return read;
            }
            b = 2;
            ds1Var.I = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            e(s04Var.g(), (int) crc32.getValue(), "CRC");
            e(s04Var.g(), (int) ds1Var.K.getBytesWritten(), "ISIZE");
            ds1Var.I = (byte) 3;
            if (!s04Var.p()) {
                zl1.g("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.J.I.timeout();
    }
}
