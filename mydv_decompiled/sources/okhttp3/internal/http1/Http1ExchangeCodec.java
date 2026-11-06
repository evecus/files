package okhttp3.internal.http1;

import androidx.media3.common.util.Log;
import defpackage.cz;
import defpackage.eq4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.il1;
import defpackage.jx4;
import defpackage.lz;
import defpackage.qx4;
import defpackage.r7;
import defpackage.s83;
import defpackage.u75;
import defpackage.ut4;
import defpackage.zl1;
import defpackage.zy;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final ExchangeCodec.Carrier carrier;
    private final OkHttpClient client;
    private final HeadersReader headersReader;
    private final BufferedSocket socket;
    private int state;
    private Headers trailers;
    public static final Companion Companion = new Companion(null);
    private static final Headers TRAILERS_RESPONSE_BODY_TRUNCATED = Headers.Companion.of("OkHttp-Response-Body", "Truncated");

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public abstract class AbstractSource implements ut4 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final il1 timeout;
        private final HttpUrl url;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.timeout = new il1(http1ExchangeCodec.getSocket().getSource().timeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final il1 getTimeout() {
            return this.timeout;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        @Override // defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            try {
                return this.this$0.getSocket().getSource().read(czVar, j);
            } catch (IOException e) {
                this.this$0.getCarrier().noNewExchanges();
                this.responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw e;
            }
        }

        public final void responseBodyComplete(Headers headers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            headers.getClass();
            if (this.this$0.state == 6) {
                return;
            }
            int i = this.this$0.state;
            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
            if (i != 5) {
                zl1.d(http1ExchangeCodec.state, "state: ");
                return;
            }
            http1ExchangeCodec.detachTimeout(this.timeout);
            this.this$0.trailers = headers;
            this.this$0.state = 6;
            if (headers.size() <= 0 || (okHttpClient = this.this$0.client) == null || (cookieJar = okHttpClient.cookieJar()) == null) {
                return;
            }
            HttpHeaders.receiveHeaders(cookieJar, this.url, headers);
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // defpackage.ut4
        public u75 timeout() {
            return this.timeout;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public final class ChunkedSink implements eq4 {
        private boolean closed;
        private final il1 timeout;

        public ChunkedSink() {
            this.timeout = new il1(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.getSocket().getSink().B("0\r\n\r\n");
            Http1ExchangeCodec.this.getSocket().getSink().flush();
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.eq4, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.eq4
        public u75 timeout() {
            return this.timeout;
        }

        @Override // defpackage.eq4
        public void write(cz czVar, long j) {
            czVar.getClass();
            if (this.closed) {
                zy.i("closed");
                return;
            }
            if (j == 0) {
                return;
            }
            lz sink = Http1ExchangeCodec.this.getSocket().getSink();
            sink.G(j);
            sink.B("\r\n");
            sink.write(czVar, j);
            sink.B("\r\n");
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.getSocket().getSource().L();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.getSocket().getSource().X();
                String obj = jx4.g0(this.this$0.getSocket().getSource().L()).toString();
                if (this.bytesRemainingInChunk < 0 || (obj.length() > 0 && !qx4.y(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    responseBodyComplete(this.this$0.headersReader.readHeaders());
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            if (j < 0) {
                s83.h(r7.A("byteCount < 0: ", j));
                return 0L;
            }
            if (getClosed()) {
                zy.i("closed");
                return 0L;
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long read = super.read(czVar, Math.min(j, this.bytesRemainingInChunk));
            if (read != -1) {
                this.bytesRemainingInChunk -= read;
                return read;
            }
            this.this$0.getCarrier().noNewExchanges();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            throw protocolException;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            if (j < 0) {
                s83.h(r7.A("byteCount < 0: ", j));
                return 0L;
            }
            if (getClosed()) {
                zy.i("closed");
                return 0L;
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(czVar, Math.min(j2, j));
            if (read == -1) {
                this.this$0.getCarrier().noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw protocolException;
            }
            long j3 = this.bytesRemaining - read;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
            return read;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class KnownLengthSink implements eq4 {
        private boolean closed;
        private final il1 timeout;

        public KnownLengthSink() {
            this.timeout = new il1(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.getSocket().getSink().flush();
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.eq4, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.eq4
        public u75 timeout() {
            return this.timeout;
        }

        @Override // defpackage.eq4
        public void write(cz czVar, long j) {
            czVar.getClass();
            if (this.closed) {
                zy.i("closed");
            } else {
                _UtilCommonKt.checkOffsetAndCount(czVar.J, 0L, j);
                Http1ExchangeCodec.this.getSocket().getSink().write(czVar, j);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            if (j < 0) {
                s83.h(r7.A("byteCount < 0: ", j));
                return 0L;
            }
            if (getClosed()) {
                zy.i("closed");
                return 0L;
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = super.read(czVar, j);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            responseBodyComplete(Headers.EMPTY);
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSocket bufferedSocket) {
        carrier.getClass();
        bufferedSocket.getClass();
        this.client = okHttpClient;
        this.carrier = carrier;
        this.socket = bufferedSocket;
        this.headersReader = new HeadersReader(getSocket().getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(il1 il1Var) {
        u75 u75Var = il1Var.a;
        u75 u75Var2 = u75.NONE;
        u75Var2.getClass();
        il1Var.a = u75Var2;
        u75Var.clearDeadline();
        u75Var.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final eq4 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        s83.e(this.state, "state: ");
        return null;
    }

    private final ut4 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        s83.e(this.state, "state: ");
        return null;
    }

    private final ut4 newFixedLengthSource(HttpUrl httpUrl, long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        s83.e(this.state, "state: ");
        return null;
    }

    private final eq4 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        s83.e(this.state, "state: ");
        return null;
    }

    private final ut4 newUnknownLengthSource(HttpUrl httpUrl) {
        if (this.state != 4) {
            s83.e(this.state, "state: ");
            return null;
        }
        this.state = 5;
        getCarrier().noNewExchanges();
        return new UnknownLengthSource(this, httpUrl);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getCarrier().mo352cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public eq4 createRequestBody(Request request, long j) {
        request.getClass();
        RequestBody body = request.body();
        if (body != null && body.isDuplex()) {
            zl1.m("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newKnownLengthSink();
        }
        zy.i("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ut4 openResponseBodySource(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(response.request().url(), 0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        return headersContentLength != -1 ? newFixedLengthSource(response.request().url(), headersContentLength) : newUnknownLengthSource(response.request().url());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers peekTrailers() {
        Headers headers = this.trailers;
        if (headers == TRAILERS_RESPONSE_BODY_TRUNCATED) {
            zl1.g("Trailers cannot be read because the response body was truncated");
            return null;
        }
        int i = this.state;
        if (i == 5 || i == 6) {
            return headers;
        }
        s83.e(this.state, "Trailers cannot be read because the state is ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            s83.e(this.state, "state: ");
            return null;
        }
        try {
            StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            int i2 = parse.code;
            if (i2 == 100) {
                this.state = 3;
                return headers;
            }
            if (102 > i2 || i2 >= 200) {
                this.state = 4;
                return headers;
            }
            this.state = 3;
            return headers;
        } catch (EOFException e) {
            throw new IOException(hf1.w("unexpected end of stream on ", getCarrier().getRoute().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return _UtilJvmKt.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        response.getClass();
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        ut4 newFixedLengthSource = newFixedLengthSource(response.request().url(), headersContentLength);
        _UtilJvmKt.skipAll(newFixedLengthSource, Log.LOG_LEVEL_OFF, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    public final void writeRequest(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        if (this.state != 0) {
            s83.e(this.state, "state: ");
            return;
        }
        getSocket().getSink().B(str).B("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            getSocket().getSink().B(headers.name(i)).B(": ").B(headers.value(i)).B("\r\n");
        }
        getSocket().getSink().B("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        type.getClass();
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public BufferedSocket getSocket() {
        return this.socket;
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
