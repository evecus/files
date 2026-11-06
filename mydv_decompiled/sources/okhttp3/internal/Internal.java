package okhttp3.internal;

import defpackage.uj3;
import defpackage.z50;
import java.nio.charset.Charset;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.CipherSuite;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        connectionSpec.getClass();
        sSLSocket.getClass();
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final ConnectionPool buildConnectionPool(ConnectionListener connectionListener, TaskRunner taskRunner) {
        connectionListener.getClass();
        taskRunner.getClass();
        return new ConnectionPool(0, 0L, null, taskRunner, connectionListener, 7, null);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        cache.getClass();
        request.getClass();
        return cache.get$okhttp(request);
    }

    public static final Charset charsetOrUtf8(MediaType mediaType) {
        Charset charset$default;
        return (mediaType == null || (charset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? z50.a : charset$default;
    }

    public static final uj3 chooseCharset(MediaType mediaType) {
        Charset charset = z50.a;
        if (mediaType != null) {
            Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
            if (charset$default == null) {
                mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset$default;
            }
        }
        return new uj3(charset, mediaType);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        cookie.getClass();
        return cookie.toString$okhttp(z);
    }

    public static final String[] effectiveCipherSuites(ConnectionSpec connectionSpec, String[] strArr) {
        connectionSpec.getClass();
        strArr.getClass();
        return connectionSpec.getCipherSuitesAsString$okhttp() != null ? _UtilCommonKt.intersect(connectionSpec.getCipherSuitesAsString$okhttp(), strArr, CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : strArr;
    }

    public static final RealConnection getConnection(Response response) {
        response.getClass();
        Exchange exchange = response.exchange();
        exchange.getClass();
        return exchange.getConnection$okhttp();
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        httpUrl.getClass();
        str.getClass();
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final OkHttpClient.Builder taskRunnerInternal(OkHttpClient.Builder builder, TaskRunner taskRunner) {
        builder.getClass();
        taskRunner.getClass();
        return builder.taskRunner$okhttp(taskRunner);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        return builder.addLenient$okhttp(str);
    }
}
