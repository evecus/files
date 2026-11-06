package okhttp3.internal.cache;

import coil3.network.internal.UtilsKt;
import defpackage.cz;
import defpackage.eq4;
import defpackage.er0;
import defpackage.mz;
import defpackage.q04;
import defpackage.qx4;
import defpackage.s04;
import defpackage.sv2;
import defpackage.u75;
import defpackage.ut4;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        eq4 body = cacheRequest.body();
        final mz source = response.body().source();
        final q04 l = sv2.l(body);
        ut4 ut4Var = new ut4() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                mz.this.close();
            }

            @Override // defpackage.ut4
            public long read(cz czVar, long j) {
                czVar.getClass();
                try {
                    long read = mz.this.read(czVar, j);
                    if (read != -1) {
                        czVar.t(l.a(), czVar.J - read, read);
                        l.r();
                        return read;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        l.close();
                    }
                    return -1L;
                } catch (IOException e) {
                    if (this.cacheRequestClosed) {
                        throw e;
                    }
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                    throw e;
                }
            }

            @Override // defpackage.ut4
            public u75 timeout() {
                return mz.this.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, UtilsKt.CONTENT_TYPE, null, 2, null), response.body().contentLength(), new s04(ut4Var))).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response response;
        Request requestForCache;
        Request requestForCache2;
        chain.getClass();
        Call call = chain.call();
        Cache cache = chain.getCache();
        if (cache != null) {
            requestForCache2 = CacheInterceptorKt.requestForCache(chain.request());
            response = cache.get$okhttp(requestForCache2);
        } else {
            response = null;
        }
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        if (cache != null) {
            cache.trackResponse$okhttp(compute);
        }
        if (response != null && cacheResponse == null) {
            _UtilCommonKt.closeQuietly(response.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            chain.getEventListener().satisfactionFailure(call, build);
            return build;
        }
        if (networkRequest == null) {
            cacheResponse.getClass();
            Response build2 = cacheResponse.newBuilder().cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).build();
            chain.getEventListener().cacheHit(call, build2);
            return build2;
        }
        if (cacheResponse != null) {
            chain.getEventListener().cacheConditionalHit(call, cacheResponse);
        } else if (cache != null) {
            chain.getEventListener().cacheMiss(call);
        }
        try {
            Response proceed = chain.proceed(networkRequest);
            if (proceed == null && response != null) {
            }
            if (cacheResponse != null) {
                if (proceed != null && proceed.code() == 304) {
                    Response build3 = cacheResponse.newBuilder().headers(Companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).networkResponse(UnreadableResponseBodyKt.stripBody(proceed)).build();
                    proceed.body().close();
                    cache.getClass();
                    cache.trackConditionalCacheHit$okhttp();
                    cache.update$okhttp(cacheResponse, build3);
                    chain.getEventListener().cacheHit(call, build3);
                    return build3;
                }
                _UtilCommonKt.closeQuietly(cacheResponse.body());
            }
            proceed.getClass();
            Response build4 = proceed.newBuilder().cacheResponse(cacheResponse != null ? UnreadableResponseBodyKt.stripBody(cacheResponse) : null).networkResponse(UnreadableResponseBodyKt.stripBody(proceed)).build();
            if (cache != null) {
                requestForCache = CacheInterceptorKt.requestForCache(networkRequest);
                if (HttpHeaders.promisesBody(build4) && CacheStrategy.Companion.isCacheable(build4, requestForCache)) {
                    Response cacheWritingResponse = cacheWritingResponse(cache.put$okhttp(build4.newBuilder().request(requestForCache).build()), build4);
                    if (cacheResponse != null) {
                        chain.getEventListener().cacheMiss(call);
                    }
                    return cacheWritingResponse;
                }
                if (HttpMethod.invalidatesCache(networkRequest.method())) {
                    try {
                        cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return build4;
        } finally {
            if (response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!"Warning".equalsIgnoreCase(name) || !qx4.y(value, "1", false)) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || UtilsKt.CONTENT_TYPE.equalsIgnoreCase(str);
        }

        private final boolean isEndToEnd(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        private Companion() {
        }
    }
}
