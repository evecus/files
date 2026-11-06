package okhttp3.internal.connection;

import defpackage.er0;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Route;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ConnectionListener {
    public static final Companion Companion = new Companion(null);
    private static final ConnectionListener NONE = new ConnectionListener() { // from class: okhttp3.internal.connection.ConnectionListener$Companion$NONE$1
    };

    public void connectEnd(Connection connection, Route route, Call call) {
        connection.getClass();
        route.getClass();
        call.getClass();
    }

    public void connectFailed(Route route, Call call, IOException iOException) {
        route.getClass();
        call.getClass();
        iOException.getClass();
    }

    public void connectStart(Route route, Call call) {
        route.getClass();
        call.getClass();
    }

    public void connectionAcquired(Connection connection, Call call) {
        connection.getClass();
        call.getClass();
    }

    public void connectionClosed(Connection connection) {
        connection.getClass();
    }

    public void connectionReleased(Connection connection, Call call) {
        connection.getClass();
        call.getClass();
    }

    public void noNewExchanges(Connection connection) {
        connection.getClass();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final ConnectionListener getNONE() {
            return ConnectionListener.NONE;
        }

        private Companion() {
        }
    }
}
