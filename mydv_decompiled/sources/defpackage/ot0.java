package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ot0 implements eq4 {
    public final q04 I;
    public final Deflater J;
    public boolean K;

    public ot0(q04 q04Var, Deflater deflater) {
        this.I = q04Var;
        this.J = deflater;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.J;
        if (this.K) {
            return;
        }
        try {
            deflater.finish();
            e(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.I.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.K = true;
        if (th != null) {
            throw th;
        }
    }

    public final void e(boolean z) {
        kh4 a0;
        int deflate;
        q04 q04Var = this.I;
        cz czVar = q04Var.J;
        while (true) {
            a0 = czVar.a0(1);
            byte[] bArr = a0.a;
            int i = a0.c;
            Deflater deflater = this.J;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                a0.c += deflate;
                czVar.J += deflate;
                q04Var.r();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (a0.b == a0.c) {
            czVar.I = a0.a();
            ph4.a(a0);
        }
    }

    @Override // defpackage.eq4, java.io.Flushable
    public final void flush() {
        e(true);
        this.I.flush();
    }

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.I.I.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.I + ')';
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        o7.j(czVar.J, 0L, j);
        while (true) {
            Deflater deflater = this.J;
            if (j <= 0) {
                deflater.setInput(wx5.q0, 0, 0);
                return;
            }
            kh4 kh4Var = czVar.I;
            kh4Var.getClass();
            int min = (int) Math.min(j, kh4Var.c - kh4Var.b);
            deflater.setInput(kh4Var.a, kh4Var.b, min);
            e(false);
            long j2 = min;
            czVar.J -= j2;
            int i = kh4Var.b + min;
            kh4Var.b = i;
            if (i == kh4Var.c) {
                czVar.I = kh4Var.a();
                ph4.a(kh4Var);
            }
            j -= j2;
        }
    }
}
