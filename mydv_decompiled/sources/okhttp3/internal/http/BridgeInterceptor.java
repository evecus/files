package okhttp3.internal.http;

import coil3.network.internal.UtilsKt;
import defpackage.ds1;
import defpackage.p70;
import defpackage.s04;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BridgeInterceptor implements Interceptor {
    private final String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            Cookie cookie = (Cookie) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
            i = i2;
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header(UtilsKt.CONTENT_TYPE, contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", String.valueOf(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        boolean z = true;
        if (request.header("Host") == null) {
            newBuilder.header("Host", _UtilJvmKt.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder.header("Accept-Encoding", "gzip");
        } else {
            z = false;
        }
        List<Cookie> loadForRequest = chain.getCookieJar().loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header("Cookie", cookieHeader(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", _UtilCommonKt.USER_AGENT);
        }
        Request build = newBuilder.build();
        Response proceed = chain.proceed(build);
        HttpHeaders.receiveHeaders(chain.getCookieJar(), build.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(build);
        if (z && "gzip".equalsIgnoreCase(Response.header$default(proceed, "Content-Encoding", null, 2, null)) && HttpHeaders.promisesBody(proceed)) {
            ds1 ds1Var = new ds1(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(Response.header$default(proceed, UtilsKt.CONTENT_TYPE, null, 2, null), -1L, new s04(ds1Var)));
        }
        return request2.build();
    }
}
