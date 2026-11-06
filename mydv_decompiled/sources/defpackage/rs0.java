package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rs0 implements eq4 {
    public final OutputStream I;
    public final nt4 J;
    public final /* synthetic */ ts0 K;

    public rs0(ts0 ts0Var) {
        this.K = ts0Var;
        Socket socket = (Socket) ts0Var.J;
        this.I = socket.getOutputStream();
        this.J = new nt4(socket);
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.I;
        ts0 ts0Var = this.K;
        nt4 nt4Var = this.J;
        nt4Var.enter();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) ts0Var.K;
            Socket socket = (Socket) ts0Var.J;
            int c = h06.c(atomicInteger, 1);
            if (c != 0) {
                if (c != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (nt4Var.exit()) {
                    throw nt4Var.access$newTimeoutException(null);
                }
            }
        } catch (IOException e) {
            if (!nt4Var.exit()) {
                throw e;
            }
            throw nt4Var.access$newTimeoutException(e);
        } finally {
            nt4Var.exit();
        }
    }

    @Override // defpackage.eq4, java.io.Flushable
    public final void flush() {
        nt4 nt4Var = this.J;
        nt4Var.enter();
        try {
            this.I.flush();
            if (nt4Var.exit()) {
                throw nt4Var.access$newTimeoutException(null);
            }
        } catch (IOException e) {
            if (!nt4Var.exit()) {
                throw e;
            }
            throw nt4Var.access$newTimeoutException(e);
        } finally {
            nt4Var.exit();
        }
    }

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.J;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.K.J) + ')';
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        o7.j(czVar.J, 0L, j);
        while (j > 0) {
            nt4 nt4Var = this.J;
            nt4Var.throwIfReached();
            kh4 kh4Var = czVar.I;
            kh4Var.getClass();
            int min = (int) Math.min(j, kh4Var.c - kh4Var.b);
            nt4Var.enter();
            try {
                try {
                    this.I.write(kh4Var.a, kh4Var.b, min);
                    if (nt4Var.exit()) {
                        throw nt4Var.access$newTimeoutException(null);
                    }
                    int i = kh4Var.b + min;
                    kh4Var.b = i;
                    long j2 = min;
                    j -= j2;
                    czVar.J -= j2;
                    if (i == kh4Var.c) {
                        czVar.I = kh4Var.a();
                        ph4.a(kh4Var);
                    }
                } catch (IOException e) {
                    if (!nt4Var.exit()) {
                        throw e;
                    }
                    throw nt4Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                nt4Var.exit();
                throw th;
            }
        }
    }
}
