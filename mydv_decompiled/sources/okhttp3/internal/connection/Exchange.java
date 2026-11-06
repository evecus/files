package okhttp3.internal.connection;

import coil3.network.internal.UtilsKt;
import defpackage.cz;
import defpackage.eq4;
import defpackage.gl1;
import defpackage.hl1;
import defpackage.j42;
import defpackage.mt4;
import defpackage.s04;
import defpackage.ut4;
import defpackage.zl1;
import defpackage.zy;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class RequestBodySink extends gl1 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, eq4 eq4Var, long j, boolean z) {
            super(eq4Var);
            eq4Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = z;
        }

        private final IOException complete(IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, false, true, iOException, 4, null);
        }

        @Override // defpackage.gl1, defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                zl1.m("unexpected end of stream");
                return;
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        @Override // defpackage.gl1, defpackage.eq4, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        @Override // defpackage.gl1, defpackage.eq4
        public void write(cz czVar, long j) {
            czVar.getClass();
            if (this.closed) {
                zy.i("closed");
                return;
            }
            long j2 = this.contentLength;
            if (j2 != -1 && this.bytesReceived + j > j2) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j));
            }
            try {
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getCall$okhttp().getEventListener$okhttp().requestBodyStart(this.this$0.getCall$okhttp());
                }
                super.write(czVar, j);
                this.bytesReceived += j;
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ResponseBodySource extends hl1 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, ut4 ut4Var, long j, boolean z) {
            super(ut4Var);
            ut4Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // defpackage.hl1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        public final IOException complete(IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            if (iOException == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getCall$okhttp().getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, true, false, iOException, 8, null);
        }

        @Override // defpackage.hl1, defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            if (this.closed) {
                zy.i("closed");
                return 0L;
            }
            try {
                long read = delegate().read(czVar, j);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getCall$okhttp().getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (read == -1) {
                    complete(null);
                    return -1L;
                }
                long j2 = this.bytesReceived + read;
                long j3 = this.contentLength;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j2);
                }
                this.bytesReceived = j2;
                if (this.this$0.codec.isResponseComplete()) {
                    complete(null);
                }
                return read;
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }
    }

    public Exchange(RealCall realCall, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        realCall.getClass();
        exchangeFinder.getClass();
        exchangeCodec.getClass();
        this.call = realCall;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    public static /* synthetic */ IOException bodyComplete$default(Exchange exchange, long j, boolean z, boolean z2, boolean z3, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return exchange.bodyComplete(j, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, iOException);
    }

    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.codec.getCarrier().trackFailure(this.call, iOException);
    }

    public final IOException bodyComplete(long j, boolean z, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (iOException != null) {
            trackFailure(iOException);
        }
        if (z3) {
            RealCall realCall = this.call;
            if (iOException != null) {
                realCall.getEventListener$okhttp().requestFailed(this.call, iOException);
            } else {
                realCall.getEventListener$okhttp().requestBodyEnd(this.call, j);
            }
        }
        if (z2) {
            RealCall realCall2 = this.call;
            if (iOException != null) {
                realCall2.getEventListener$okhttp().responseFailed(this.call, iOException);
            } else {
                realCall2.getEventListener$okhttp().responseBodyEnd(this.call, j);
            }
        }
        RealCall realCall3 = this.call;
        boolean z7 = false;
        if (!z3 || z) {
            z4 = false;
        } else {
            z4 = false;
            z7 = true;
        }
        if (!z2 || z) {
            z5 = z;
            z6 = z4;
        } else {
            z5 = z;
            z6 = true;
        }
        return realCall3.messageDone$okhttp(this, z7, z6, (z2 && z5) ? true : z4, (z3 && z5) ? true : z4, iOException);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final eq4 createRequestBody(Request request, boolean z) {
        request.getClass();
        this.isDuplex = z;
        RequestBody body = request.body();
        body.getClass();
        long contentLength = body.contentLength();
        this.call.getEventListener$okhttp().requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength, false);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    public final void finishRequest() {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.call.getEventListener$okhttp().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void flushRequest() {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.call.getEventListener$okhttp().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        RealConnection realConnection = carrier instanceof RealConnection ? (RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        zy.i("no connection for CONNECT tunnels");
        return null;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !j42.c(this.finder.getRoutePlanner().getAddress().url().host(), this.codec.getCarrier().getRoute().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }

    public final void noRequestBody() {
        RealCall.messageDone$okhttp$default(this.call, this, true, false, false, false, null, 28, null);
    }

    public final ResponseBody openResponseBody(Response response) {
        Exchange exchange;
        response.getClass();
        try {
            String header$default = Response.header$default(response, UtilsKt.CONTENT_TYPE, null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            exchange = this;
            try {
                return new RealResponseBody(header$default, reportedContentLength, new s04(new ResponseBodySource(exchange, this.codec.openResponseBodySource(response), reportedContentLength, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.call.getEventListener$okhttp().responseFailed(exchange.call, iOException);
                exchange.trackFailure(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Headers peekTrailers() {
        return this.codec.peekTrailers();
    }

    public final Response.Builder readResponseHeaders(boolean z) {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z);
            if (readResponseHeaders == null) {
                return readResponseHeaders;
            }
            readResponseHeaders.initExchange$okhttp(this);
            return readResponseHeaders;
        } catch (IOException e) {
            this.call.getEventListener$okhttp().responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        response.getClass();
        this.call.getEventListener$okhttp().responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.call.getEventListener$okhttp().responseHeadersStart(this.call);
    }

    public final mt4 upgradeToSocket() {
        this.call.upgradeToSocket();
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        carrier.getClass();
        ((RealConnection) carrier).useAsSocket$okhttp();
        return new mt4() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1
            private final Exchange.RequestBodySink sink;
            private final Exchange.ResponseBodySource source;

            {
                this.sink = new Exchange.RequestBodySink(Exchange.this, Exchange.this.codec.getSocket().getSink(), -1L, true);
                this.source = new Exchange.ResponseBodySource(Exchange.this, Exchange.this.codec.getSocket().getSource(), -1L, true);
            }

            @Override // defpackage.mt4
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // defpackage.mt4
            public Exchange.RequestBodySink getSink() {
                return this.sink;
            }

            @Override // defpackage.mt4
            public Exchange.ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void writeRequestHeaders(Request request) {
        request.getClass();
        try {
            this.call.getEventListener$okhttp().requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.call.getEventListener$okhttp().requestHeadersEnd(this.call, request);
        } catch (IOException e) {
            this.call.getEventListener$okhttp().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }
}
