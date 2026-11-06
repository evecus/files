package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r04 extends InputStream {
    public final /* synthetic */ s04 I;

    public r04(s04 s04Var) {
        this.I = s04Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        s04 s04Var = this.I;
        if (!s04Var.K) {
            return (int) Math.min(s04Var.J.J, 2147483647L);
        }
        zl1.g("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        s04 s04Var = this.I;
        cz czVar = s04Var.J;
        if (s04Var.K) {
            zl1.g("closed");
            return 0;
        }
        o7.j(bArr.length, i, i2);
        if (czVar.J == 0 && s04Var.I.read(czVar, 8192L) == -1) {
            return -1;
        }
        return czVar.read(bArr, i, i2);
    }

    public final String toString() {
        return this.I + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) {
        outputStream.getClass();
        s04 s04Var = this.I;
        cz czVar = s04Var.J;
        if (s04Var.K) {
            zl1.g("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (czVar.J == 0 && s04Var.I.read(czVar, 8192L) == -1) {
                return j;
            }
            long j2 = czVar.J;
            j += j2;
            o7.j(j2, 0L, j2);
            kh4 kh4Var = czVar.I;
            while (j2 > 0) {
                kh4Var.getClass();
                int min = (int) Math.min(j2, kh4Var.c - kh4Var.b);
                outputStream.write(kh4Var.a, kh4Var.b, min);
                int i = kh4Var.b + min;
                kh4Var.b = i;
                long j3 = min;
                czVar.J -= j3;
                j2 -= j3;
                if (i == kh4Var.c) {
                    kh4 a = kh4Var.a();
                    czVar.I = a;
                    ph4.a(kh4Var);
                    kh4Var = a;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        s04 s04Var = this.I;
        cz czVar = s04Var.J;
        if (s04Var.K) {
            zl1.g("closed");
            return 0;
        }
        if (czVar.J == 0 && s04Var.I.read(czVar, 8192L) == -1) {
            return -1;
        }
        return czVar.readByte() & 255;
    }
}
