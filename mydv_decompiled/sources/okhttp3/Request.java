package okhttp3;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import coil3.network.internal.UtilsKt;
import defpackage.cz;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.k60;
import defpackage.p70;
import defpackage.qx4;
import defpackage.r7;
import defpackage.s24;
import defpackage.s83;
import defpackage.su0;
import defpackage.sv2;
import defpackage.t72;
import defpackage.uj3;
import defpackage.zy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public Request(Builder builder) {
        builder.getClass();
        HttpUrl url$okhttp = builder.getUrl$okhttp();
        if (url$okhttp == null) {
            zy.i("url == null");
            throw null;
        }
        this.url = url$okhttp;
        this.method = builder.getMethod$okhttp();
        this.headers = builder.getHeaders$okhttp().build();
        this.body = builder.getBody$okhttp();
        this.cacheUrlOverride = builder.getCacheUrlOverride$okhttp();
        this.tags = builder.getTags$okhttp();
    }

    private final String shellEscape(String str) {
        return "'" + qx4.x(str, "'", "'\\''", false) + '\'';
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return request.toCurl(z);
    }

    @su0
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m329deprecated_body() {
        return this.body;
    }

    @su0
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m330deprecated_cacheControl() {
        return cacheControl();
    }

    @su0
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m331deprecated_headers() {
        return this.headers;
    }

    @su0
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m332deprecated_method() {
        return this.method;
    }

    @su0
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m333deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
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

    public final HttpUrl cacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    public final Tags getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        str.getClass();
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        str.getClass();
        return this.headers.values(str);
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final <T> T reifiedTag() {
        j42.f0();
        throw null;
    }

    public final <T> T tag(t72 t72Var) {
        t72Var.getClass();
        return (T) sv2.B(t72Var).cast(this.tags.get(t72Var));
    }

    public final String toCurl(boolean z) {
        RequestBody requestBody;
        MediaType contentType;
        StringBuilder sb = new StringBuilder("curl " + shellEscape(this.url.toString()));
        RequestBody requestBody2 = this.body;
        String mediaType = (requestBody2 == null || (contentType = requestBody2.contentType()) == null) ? null : contentType.toString();
        if (!j42.c(this.method, (!z || this.body == null) ? UtilsKt.HTTP_METHOD_GET : HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            sb.append(" \\\n  -X " + shellEscape(this.method));
        }
        Iterator<uj3> it = this.headers.iterator();
        while (it.hasNext()) {
            uj3 next = it.next();
            String str = (String) next.I;
            String str2 = (String) next.J;
            if (mediaType == null || !qx4.t(str, UtilsKt.CONTENT_TYPE, true)) {
                StringBuilder sb2 = new StringBuilder(" \\\n  -H ");
                sb2.append(shellEscape(str + ": " + str2));
                sb.append(sb2.toString());
            }
        }
        if (mediaType != null) {
            sb.append(" \\\n  -H " + shellEscape("Content-Type: ".concat(mediaType)));
        }
        if (z && (requestBody = this.body) != null) {
            cz czVar = new cz();
            requestBody.writeTo(czVar);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(czVar, 0L, 1, null)) {
                sb.append(" \\\n  --data " + shellEscape(czVar.Q()));
            } else {
                sb.append(" \\\n  --data-binary " + shellEscape(czVar.i(czVar.J).e()));
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (uj3 uj3Var : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    p70.A0();
                    throw null;
                }
                uj3 uj3Var2 = uj3Var;
                String str = (String) uj3Var2.I;
                String str2 = (String) uj3Var2.J;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!j42.c(this.tags, EmptyTags.INSTANCE)) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        return sb.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;

        public Builder(Request request) {
            request.getClass();
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.cacheUrlOverride();
        }

        private final String canonicalUrl(String str) {
            return qx4.y(str, "ws:", true) ? "http:".concat(str.substring(3)) : qx4.y(str, "wss:", true) ? "https:".concat(str.substring(4)) : str;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                zy.p("Super calls with default arguments not supported in this target, function: delete");
                return null;
            }
            if ((i & 1) != 0) {
                requestBody = RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.add(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder cacheControl(CacheControl cacheControl) {
            cacheControl.getClass();
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader(UtilsKt.CACHE_CONTROL) : header(UtilsKt.CACHE_CONTROL, cacheControl2);
        }

        public final Builder cacheUrlOverride(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
            return this;
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method(UtilsKt.HTTP_METHOD_GET, null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final HttpUrl getCacheUrlOverride$okhttp() {
            return this.cacheUrlOverride;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Tags getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody == null) {
                zy.i("cannot gzip a request that has no body");
                return null;
            }
            String str = this.headers.get("Content-Encoding");
            if (str != null) {
                zy.e(hf1.w("Content-Encoding already set: ", str));
                return null;
            }
            this.headers.add("Content-Encoding", "gzip");
            this.body = new GzipRequestBody(requestBody);
            return this;
        }

        public Builder head() {
            return method("HEAD", null);
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

        public Builder method(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                s83.t("method.isEmpty() == true");
                return null;
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(str)) {
                    s83.h(r7.C("method ", str, " must have a request body."));
                    return null;
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                s83.h(r7.C("method ", str, " must not have a request body."));
                return null;
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            requestBody.getClass();
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            requestBody.getClass();
            return method(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST, requestBody);
        }

        public Builder put(RequestBody requestBody) {
            requestBody.getClass();
            return method("PUT", requestBody);
        }

        public Builder query(RequestBody requestBody) {
            requestBody.getClass();
            return method("QUERY", requestBody);
        }

        public final <T> Builder reifiedTag(T t) {
            j42.f0();
            throw null;
        }

        public Builder removeHeader(String str) {
            str.getClass();
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            str.getClass();
            this.method = str;
        }

        public final void setTags$okhttp(Tags tags) {
            tags.getClass();
            this.tags = tags;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            cls.getClass();
            return tag((t72) s24.a(cls), (k60) t);
        }

        public Builder url(URL url) {
            url.getClass();
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            url2.getClass();
            return url(companion.get(url2));
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public final <T> Builder tag(t72 t72Var, T t) {
            t72Var.getClass();
            this.tags = this.tags.plus(t72Var, t);
            return this;
        }

        public Builder tag(Object obj) {
            return tag((t72) s24.a(Object.class), (k60) obj);
        }

        public Builder url(String str) {
            str.getClass();
            return url(HttpUrl.Companion.get(canonicalUrl(str)));
        }

        public Builder url(HttpUrl httpUrl) {
            httpUrl.getClass();
            this.url = httpUrl;
            return this;
        }

        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = UtilsKt.HTTP_METHOD_GET;
            this.headers = new Headers.Builder();
        }
    }

    public final Headers headers() {
        return this.headers;
    }

    public final <T> T tag(Class<? extends T> cls) {
        cls.getClass();
        return (T) tag(s24.a(cls));
    }

    public final Object tag() {
        return tag(s24.a(Object.class));
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i, er0 er0Var) {
        this(httpUrl, (i & 2) != 0 ? Headers.Companion.of(new String[0]) : headers, (i & 4) != 0 ? "\u0000" : str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Request(okhttp3.HttpUrl r2, okhttp3.Headers r3, java.lang.String r4, okhttp3.RequestBody r5) {
        /*
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r2 = r0.url(r2)
            okhttp3.Request$Builder r2 = r2.headers(r3)
            java.lang.String r3 = "\u0000"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L1f
            goto L26
        L1f:
            if (r5 == 0) goto L24
            java.lang.String r4 = "POST"
            goto L26
        L24:
            java.lang.String r4 = "GET"
        L26:
            okhttp3.Request$Builder r2 = r2.method(r4, r5)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Request.<init>(okhttp3.HttpUrl, okhttp3.Headers, java.lang.String, okhttp3.RequestBody):void");
    }

    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }
}
