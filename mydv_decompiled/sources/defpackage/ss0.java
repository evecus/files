package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ss0 implements ut4 {
    public final InputStream I;
    public final nt4 J;
    public final /* synthetic */ ts0 K;

    public ss0(ts0 ts0Var) {
        this.K = ts0Var;
        Socket socket = (Socket) ts0Var.J;
        this.I = socket.getInputStream();
        this.J = new nt4(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ts0 ts0Var = this.K;
        nt4 nt4Var = this.J;
        nt4Var.enter();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) ts0Var.K;
            Socket socket = (Socket) ts0Var.J;
            int c = h06.c(atomicInteger, 2);
            if (c != 0) {
                if (c == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.I.close();
                    }
                }
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
        nt4 nt4Var = this.J;
        nt4Var.throwIfReached();
        kh4 a0 = czVar.a0(1);
        int min = (int) Math.min(j, 8192 - a0.c);
        try {
            nt4Var.enter();
            try {
                int read = this.I.read(a0.a, a0.c, min);
                if (nt4Var.exit()) {
                    throw nt4Var.access$newTimeoutException(null);
                }
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
            } catch (IOException e) {
                if (nt4Var.exit()) {
                    throw nt4Var.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                nt4Var.exit();
            }
        } catch (AssertionError e2) {
            if (k16.b(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.J;
    }

    public final String toString() {
        return "source(" + ((Socket) this.K.J) + ')';
    }
}
