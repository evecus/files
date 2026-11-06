package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m12 implements ut4 {
    public final InputStream I;
    public final u75 J;

    public m12(InputStream inputStream, u75 u75Var) {
        inputStream.getClass();
        u75Var.getClass();
        this.I = inputStream;
        this.J = u75Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        czVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.J.throwIfReached();
            kh4 a0 = czVar.a0(1);
            int read = this.I.read(a0.a, a0.c, (int) Math.min(j, 8192 - a0.c));
            if (read != -1) {
                a0.c += read;
                long j2 = read;
                czVar.J += j2;
                return j2;
            }
            if (a0.b != a0.c) {
                return -1L;
            }
            czVar.I = a0.a();
            ph4.a(a0);
            return -1L;
        } catch (AssertionError e) {
            if (k16.b(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.J;
    }

    public final String toString() {
        return "source(" + this.I + ')';
    }
}
