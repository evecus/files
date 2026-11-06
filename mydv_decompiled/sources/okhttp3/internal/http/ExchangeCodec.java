package okhttp3.internal.http;

import defpackage.eq4;
import defpackage.mt4;
import defpackage.ut4;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Carrier {
        /* renamed from: cancel */
        void mo352cancel();

        Route getRoute();

        void noNewExchanges();

        void trackFailure(RealCall realCall, IOException iOException);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    eq4 createRequestBody(Request request, long j);

    void finishRequest();

    void flushRequest();

    Carrier getCarrier();

    mt4 getSocket();

    boolean isResponseComplete();

    ut4 openResponseBodySource(Response response);

    Headers peekTrailers();

    Response.Builder readResponseHeaders(boolean z);

    long reportedContentLength(Response response);

    void writeRequestHeaders(Request request);
}
