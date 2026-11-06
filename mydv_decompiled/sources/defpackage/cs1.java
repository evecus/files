package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cs1 implements eq4 {
    public final q04 I;
    public final Deflater J;
    public final ot0 K;
    public boolean L;
    public final CRC32 M;

    public cs1(lz lzVar) {
        q04 q04Var = new q04(lzVar);
        this.I = q04Var;
        Deflater deflater = new Deflater(-1, true);
        this.J = deflater;
        this.K = new ot0(q04Var, deflater);
        this.M = new CRC32();
        cz czVar = q04Var.J;
        czVar.h0(8075);
        czVar.d0(8);
        czVar.d0(0);
        czVar.g0(0);
        czVar.d0(0);
        czVar.d0(0);
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int value;
        Deflater deflater = this.J;
        q04 q04Var = this.I;
        cz czVar = q04Var.J;
        if (this.L) {
            return;
        }
        try {
            ot0 ot0Var = this.K;
            ot0Var.J.finish();
            ot0Var.e(false);
            value = (int) this.M.getValue();
        } catch (Throwable th) {
            th = th;
        }
        if (q04Var.K) {
            throw new IllegalStateException("closed");
        }
        czVar.g0(o7.M(value));
        q04Var.r();
        int bytesRead = (int) deflater.getBytesRead();
        if (q04Var.K) {
            throw new IllegalStateException("closed");
        }
        czVar.g0(o7.M(bytesRead));
        q04Var.r();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            q04Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.L = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.eq4, java.io.Flushable
    public final void flush() {
        this.K.flush();
    }

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.I.I.timeout();
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return;
        }
        if (j == 0) {
            return;
        }
        kh4 kh4Var = czVar.I;
        kh4Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, kh4Var.c - kh4Var.b);
            this.M.update(kh4Var.a, kh4Var.b, min);
            j2 -= min;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
        }
        this.K.write(czVar, j);
    }
}
