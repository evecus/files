package okhttp3.internal;

import defpackage.ke1;
import defpackage.ok3;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NativeImageTestsAccessorsKt {
    public static final Cache buildCache(ok3 ok3Var, long j, ke1 ke1Var) {
        ok3Var.getClass();
        ke1Var.getClass();
        return new Cache(ke1Var, ok3Var, j);
    }

    public static final void finishedAccessor(Dispatcher dispatcher, RealCall.AsyncCall asyncCall) {
        dispatcher.getClass();
        asyncCall.getClass();
        dispatcher.finished$okhttp(asyncCall);
    }

    public static final RealConnection getConnectionAccessor(Exchange exchange) {
        exchange.getClass();
        return exchange.getConnection$okhttp();
    }

    public static final Exchange getExchangeAccessor(Response response) {
        response.getClass();
        return response.exchange();
    }

    public static final long getIdleAtNsAccessor(RealConnection realConnection) {
        realConnection.getClass();
        return realConnection.getIdleAtNs();
    }

    public static final void setIdleAtNsAccessor(RealConnection realConnection, long j) {
        realConnection.getClass();
        realConnection.setIdleAtNs(j);
    }
}
