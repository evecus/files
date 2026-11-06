package okhttp3.internal.http;

import androidx.media3.common.util.Log;
import coil3.network.internal.UtilsKt;
import defpackage.er0;
import defpackage.j42;
import defpackage.zl1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;

    private final Request buildRedirectRequest(Response response, String str, Interceptor.Chain chain) {
        String header$default;
        HttpUrl resolve;
        if (!chain.getFollowRedirects() || (header$default = Response.header$default(response, "Location", null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!j42.c(resolve.scheme(), response.request().url().scheme()) && !chain.getFollowSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            if (HttpMethod.INSTANCE.redirectsToGet(str, response.code())) {
                newBuilder.method(UtilsKt.HTTP_METHOD_GET, null);
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader(UtilsKt.CONTENT_TYPE);
            } else {
                newBuilder.method(str, response.request().body());
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response response, Exchange exchange, Interceptor.Chain chain) {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return chain.getAuthenticator().authenticate(route, response);
            }
            if (code == 421) {
                RequestBody body = response.request().body();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return response.request();
            }
            if (code == 503) {
                Response priorResponse = response.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Log.LOG_LEVEL_OFF) == 0) {
                    return response.request();
                }
                return null;
            }
            if (code == 407) {
                route.getClass();
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return chain.getProxyAuthenticator().authenticate(route, response);
                }
                zl1.m("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                return null;
            }
            if (code != 408) {
                switch (code) {
                }
                return null;
            }
            if (!chain.getRetryOnConnectionFailure()) {
                return null;
            }
            RequestBody body2 = response.request().body();
            if (body2 != null && body2.isOneShot()) {
                return null;
            }
            Response priorResponse2 = response.priorResponse();
            if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                return response.request();
            }
            return null;
        }
        return buildRedirectRequest(response, method, chain);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Interceptor.Chain chain, Request request) {
        boolean z = iOException instanceof ConnectionShutdownException;
        boolean z2 = !z;
        if (chain.getRetryOnConnectionFailure()) {
            return (z || !requestIsOneShot(iOException, request)) && isRecoverable(iOException, z2) && realCall.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (header$default == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(header$default).matches()) {
            return Log.LOG_LEVEL_OFF;
        }
        Integer valueOf = Integer.valueOf(header$default);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1 = r0.proceed(r1).newBuilder().request(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r7 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r8 = r1.priorResponse(r7).build();
        r1 = r2.getInterceptorScopedExchange$okhttp();
        r7 = followUpRequest(r8, r1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r1 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r1.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r8.body());
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r9 > 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        if (r1.isDuplex$okhttp() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        r2.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0036, code lost:
    
        r7 = null;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r13) {
        /*
            r12 = this;
            r13.getClass()
            r0 = r13
            okhttp3.internal.http.RealInterceptorChain r0 = (okhttp3.internal.http.RealInterceptorChain) r0
            okhttp3.Request r1 = r0.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r2 = r0.getCall$okhttp()
            r3 = 0
            r4 = 0
            r5 = 1
            o91 r6 = defpackage.o91.I
            r9 = r3
            r8 = r4
        L15:
            r7 = r5
        L16:
            r2.enterNetworkInterceptorExchange(r1, r7, r0)
            boolean r7 = r2.isCanceled()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto Lcd
            okhttp3.Response r7 = r0.proceed(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> Lb0
            okhttp3.Response$Builder r7 = r7.newBuilder()     // Catch: java.lang.Throwable -> L32
            okhttp3.Response$Builder r1 = r7.request(r1)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L36
            okhttp3.Response r7 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r8)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r12 = move-exception
            r3 = r5
            goto Ld5
        L36:
            r7 = r4
        L37:
            okhttp3.Response$Builder r1 = r1.priorResponse(r7)     // Catch: java.lang.Throwable -> L32
            okhttp3.Response r8 = r1.build()     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.connection.Exchange r1 = r2.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> L32
            okhttp3.Request r7 = r12.followUpRequest(r8, r1, r13)     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L62
            if (r1 == 0) goto L54
            boolean r12 = r1.isDuplex$okhttp()     // Catch: java.lang.Throwable -> L32
            if (r12 == 0) goto L54
            r2.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L32
        L54:
            okhttp3.EventListener r12 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L5f
            r12.followUpDecision(r2, r8, r4)     // Catch: java.lang.Throwable -> L5f
            r2.exitNetworkInterceptorExchange$okhttp(r3)
            return r8
        L5f:
            r12 = move-exception
            goto Ld5
        L62:
            okhttp3.RequestBody r1 = r7.body()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L79
            boolean r1 = r1.isOneShot()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L79
            okhttp3.EventListener r12 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L5f
            r12.followUpDecision(r2, r8, r4)     // Catch: java.lang.Throwable -> L5f
            r2.exitNetworkInterceptorExchange$okhttp(r3)
            return r8
        L79:
            okhttp3.ResponseBody r1 = r8.body()     // Catch: java.lang.Throwable -> L32
            okhttp3.internal._UtilCommonKt.closeQuietly(r1)     // Catch: java.lang.Throwable -> L32
            int r9 = r9 + 1
            r1 = 20
            if (r9 > r1) goto L92
            okhttp3.EventListener r1 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L32
            r1.followUpDecision(r2, r8, r7)     // Catch: java.lang.Throwable -> L32
            r2.exitNetworkInterceptorExchange$okhttp(r5)
            r1 = r7
            goto L15
        L92:
            okhttp3.EventListener r12 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L32
            r12.followUpDecision(r2, r8, r4)     // Catch: java.lang.Throwable -> L32
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r13.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Too many follow-up requests: "
            r13.append(r0)     // Catch: java.lang.Throwable -> L32
            r13.append(r9)     // Catch: java.lang.Throwable -> L32
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L32
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        Lb0:
            r7 = move-exception
            boolean r10 = r12.recover(r7, r2, r13, r1)     // Catch: java.lang.Throwable -> L32
            okhttp3.EventListener r11 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L32
            r11.retryDecision(r2, r7, r10)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lc8
            java.util.ArrayList r6 = defpackage.o70.g1(r6, r7)     // Catch: java.lang.Throwable -> L32
            r2.exitNetworkInterceptorExchange$okhttp(r5)
            r7 = r3
            goto L16
        Lc8:
            java.lang.Throwable r12 = okhttp3.internal._UtilCommonKt.withSuppressed(r7, r6)     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        Lcd:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r13 = "Canceled"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        Ld5:
            r2.exitNetworkInterceptorExchange$okhttp(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}
