package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nt4 extends sq {
    public final Socket a;

    public nt4(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.sq
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.sq
    public final void timedOut() {
        Logger logger;
        Logger logger2;
        Socket socket = this.a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!k16.b(e)) {
                throw e;
            }
            logger2 = k16.a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            logger = k16.a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
