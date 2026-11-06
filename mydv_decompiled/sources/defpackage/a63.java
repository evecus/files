package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a63 implements Runnable {
    public final InputStream I;
    public final Socket J;
    public final /* synthetic */ k63 K;

    public a63(k63 k63Var, InputStream inputStream, Socket socket) {
        this.K = k63Var;
        this.I = inputStream;
        this.J = socket;
    }

    public final void a() {
        k63.c(this.I);
        k63.c(this.J);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.I;
        k63 k63Var = this.K;
        Socket socket = this.J;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            e63 e63Var = new e63(k63Var, new d63((byte) 0), this.I, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                e63Var.c();
            }
            k63.c(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                k63.e.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            k63.c(outputStream2);
            k63.c(inputStream);
            k63.c(socket);
            ((List) k63Var.d.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            k63.c(outputStream2);
            k63.c(inputStream);
            k63.c(socket);
            ((List) k63Var.d.c).remove(this);
            throw th;
        }
        k63.c(inputStream);
        k63.c(socket);
        ((List) k63Var.d.c).remove(this);
    }
}
