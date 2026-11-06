package okhttp3;

import defpackage.cz;
import defpackage.mt4;
import defpackage.o91;
import defpackage.r7;
import defpackage.s04;
import defpackage.s83;
import defpackage.su0;
import defpackage.zy;
import java.io.Closeable;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;
    private final mt4 socket;
    private TrailersSource trailersSource;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, mt4 mt4Var, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        headers.getClass();
        responseBody.getClass();
        trailersSource.getClass();
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.socket = mt4Var;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
        this.trailersSource = trailersSource;
        boolean z = true;
        this.isSuccessful = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.isRedirect = z;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @su0
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m334deprecated_body() {
        return this.body;
    }

    @su0
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m335deprecated_cacheControl() {
        return cacheControl();
    }

    @su0
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m336deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @su0
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m337deprecated_code() {
        return this.code;
    }

    @su0
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m338deprecated_handshake() {
        return this.handshake;
    }

    @su0
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m339deprecated_headers() {
        return this.headers;
    }

    @su0
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m340deprecated_message() {
        return this.message;
    }

    @su0
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m341deprecated_networkResponse() {
        return this.networkResponse;
    }

    @su0
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m342deprecated_priorResponse() {
        return this.priorResponse;
    }

    @su0
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m343deprecated_protocol() {
        return this.protocol;
    }

    @su0
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m344deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @su0
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m345deprecated_request() {
        return this.request;
    }

    @su0
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m346deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return o91.I;
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final CacheControl getLazyCacheControl$okhttp() {
        return this.lazyCacheControl;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String str, String str2) {
        str.getClass();
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    public final List<String> headers(String str) {
        str.getClass();
        return this.headers.values(str);
    }

    public final boolean isRedirect() {
        return this.isRedirect;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j) {
        s04 peek = this.body.source().peek();
        cz czVar = new cz();
        peek.request(j);
        czVar.b0(peek, Math.min(j, peek.J.J));
        return ResponseBody.Companion.create(czVar, this.body.contentType(), czVar.J);
    }

    public final Headers peekTrailers() {
        return this.trailersSource.peek();
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final void setLazyCacheControl$okhttp(CacheControl cacheControl) {
        this.lazyCacheControl = cacheControl;
    }

    public final mt4 socket() {
        return this.socket;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() {
        return this.trailersSource.get();
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String header(String str) {
        str.getClass();
        return header$default(this, str, null, 2, null);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;
        private mt4 socket;
        private TrailersSource trailersSource;

        public Builder(Response response) {
            response.getClass();
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.socket = response.socket();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
            this.trailersSource = response.trailersSource;
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.networkResponse() != null) {
                    s83.h(r7.B(str, ".networkResponse != null"));
                } else if (response.cacheResponse() != null) {
                    s83.h(r7.B(str, ".cacheResponse != null"));
                } else {
                    if (response.priorResponse() == null) {
                        return;
                    }
                    s83.h(r7.B(str, ".priorResponse != null"));
                }
            }
        }

        public Builder addHeader(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.add(str, str2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            responseBody.getClass();
            this.body = responseBody;
            return this;
        }

        public Response build() {
            int i = this.code;
            if (i < 0) {
                s83.e(this.code, "code < 0: ");
                return null;
            }
            Request request = this.request;
            if (request == null) {
                zy.i("request == null");
                return null;
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                zy.i("protocol == null");
                return null;
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.socket, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
            }
            zy.i("message == null");
            return null;
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public final mt4 getSocket$okhttp() {
            return this.socket;
        }

        public final TrailersSource getTrailersSource$okhttp() {
            return this.trailersSource;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            exchange.getClass();
            this.exchange = exchange;
        }

        public Builder message(String str) {
            str.getClass();
            this.message = str;
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            protocol.getClass();
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public Builder removeHeader(String str) {
            str.getClass();
            this.headers.removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            request.getClass();
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            responseBody.getClass();
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public final void setSocket$okhttp(mt4 mt4Var) {
            this.socket = mt4Var;
        }

        public final void setTrailersSource$okhttp(TrailersSource trailersSource) {
            trailersSource.getClass();
            this.trailersSource = trailersSource;
        }

        public Builder socket(mt4 mt4Var) {
            mt4Var.getClass();
            this.socket = mt4Var;
            return this;
        }

        public Builder trailers(TrailersSource trailersSource) {
            trailersSource.getClass();
            this.trailersSource = trailersSource;
            return this;
        }

        public Builder() {
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.headers = new Headers.Builder();
        }
    }
}
