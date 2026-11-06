package okhttp3.internal.http;

import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import defpackage.er0;
import defpackage.zy;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final Authenticator authenticator;
    private final Cache cache;
    private final RealCall call;
    private int calls;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final CookieJar cookieJar;
    private final Dns dns;
    private final Exchange exchange;
    private final HostnameVerifier hostnameVerifier;
    private final int index;
    private final List<Interceptor> interceptors;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final Request request;
    private final boolean retryOnConnectionFailure;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManagerOrNull;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        realCall.getClass();
        list.getClass();
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.call = realCall;
        this.interceptors = list;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
        this.authenticator = authenticator;
        this.cache = cache;
        this.certificatePinner = certificatePinner;
        this.connectionPool = connectionPool;
        this.cookieJar = cookieJar;
        this.dns = dns;
        this.hostnameVerifier = hostnameVerifier;
        this.proxy = proxy;
        this.proxyAuthenticator = authenticator2;
        this.proxySelector = proxySelector;
        this.retryOnConnectionFailure = z;
        this.socketFactory = socketFactory;
        this.sslSocketFactoryOrNull = sSLSocketFactory;
        this.x509TrustManagerOrNull = x509TrustManager;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner, int i5, Object obj) {
        return realInterceptorChain.copy$okhttp((i5 & 1) != 0 ? realInterceptorChain.index : i, (i5 & 2) != 0 ? realInterceptorChain.exchange : exchange, (i5 & 4) != 0 ? realInterceptorChain.request : request, (i5 & 8) != 0 ? realInterceptorChain.connectTimeoutMillis : i2, (i5 & 16) != 0 ? realInterceptorChain.readTimeoutMillis : i3, (i5 & 32) != 0 ? realInterceptorChain.writeTimeoutMillis : i4, (i5 & 64) != 0 ? realInterceptorChain.getAuthenticator() : authenticator, (i5 & 128) != 0 ? realInterceptorChain.getCache() : cache, (i5 & 256) != 0 ? realInterceptorChain.getCertificatePinner() : certificatePinner, (i5 & 512) != 0 ? realInterceptorChain.getConnectionPool() : connectionPool, (i5 & 1024) != 0 ? realInterceptorChain.getCookieJar() : cookieJar, (i5 & 2048) != 0 ? realInterceptorChain.getDns() : dns, (i5 & 4096) != 0 ? realInterceptorChain.getHostnameVerifier() : hostnameVerifier, (i5 & 8192) != 0 ? realInterceptorChain.getProxy() : proxy, (i5 & 16384) != 0 ? realInterceptorChain.getProxyAuthenticator() : authenticator2, (i5 & 32768) != 0 ? realInterceptorChain.getProxySelector() : proxySelector, (i5 & 65536) != 0 ? realInterceptorChain.getRetryOnConnectionFailure() : z, (i5 & 131072) != 0 ? realInterceptorChain.getSocketFactory() : socketFactory, (i5 & 262144) != 0 ? realInterceptorChain.getSslSocketFactoryOrNull() : sSLSocketFactory, (i5 & 524288) != 0 ? realInterceptorChain.getX509TrustManagerOrNull() : x509TrustManager, (i5 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? realInterceptorChain.certificateChainCleaner : certificateChainCleaner);
    }

    public final Address address(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        httpUrl.getClass();
        if (httpUrl.isHttps()) {
            sSLSocketFactory = getSslSocketFactoryOrNull();
            hostnameVerifier = getHostnameVerifier();
            certificatePinner = getCertificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), getDns(), getSocketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, getProxyAuthenticator(), getProxy(), this.call.getClient().protocols(), this.call.getClient().connectionSpecs(), getProxySelector());
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    public final RealInterceptorChain copy$okhttp(int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new RealInterceptorChain(this.call, this.interceptors, i, exchange, request, i2, i3, i4, authenticator, cache, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, proxy, authenticator2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, certificateChainCleaner);
    }

    @Override // okhttp3.Interceptor.Chain
    public Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @Override // okhttp3.Interceptor.Chain
    public Cache getCache() {
        return this.cache;
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @Override // okhttp3.Interceptor.Chain
    public CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @Override // okhttp3.Interceptor.Chain
    public CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @Override // okhttp3.Interceptor.Chain
    public Dns getDns() {
        return this.dns;
    }

    @Override // okhttp3.Interceptor.Chain
    public EventListener getEventListener() {
        return this.call.getEventListener$okhttp();
    }

    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getFollowRedirects() {
        return this.call.getClient().followRedirects();
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getFollowSslRedirects() {
        return this.call.getClient().followSslRedirects();
    }

    @Override // okhttp3.Interceptor.Chain
    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // okhttp3.Interceptor.Chain
    public Proxy getProxy() {
        return this.proxy;
    }

    @Override // okhttp3.Interceptor.Chain
    public Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Override // okhttp3.Interceptor.Chain
    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    public final Request getRequest$okhttp() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Override // okhttp3.Interceptor.Chain
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Override // okhttp3.Interceptor.Chain
    public SSLSocketFactory getSslSocketFactoryOrNull() {
        return this.sslSocketFactoryOrNull;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public X509TrustManager getX509TrustManagerOrNull() {
        return this.x509TrustManagerOrNull;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) {
        request.getClass();
        if (this.index >= this.interceptors.size()) {
            zy.i("Check failed.");
            return null;
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder$okhttp().getRoutePlanner().sameHostAndPort(request.url())) {
                zy.g(this.interceptors.get(this.index - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.calls != 1) {
                zy.g(this.interceptors.get(this.index - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097146, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response intercept = interceptor.intercept(copy$okhttp$default);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange == null || this.index + 1 >= this.interceptors.size() || copy$okhttp$default.calls == 1) {
            return intercept;
        }
        zy.g(interceptor, " must call proceed() exactly once", "network interceptor ");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withAuthenticator(Authenticator authenticator) {
        authenticator.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, authenticator, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097087, null);
        }
        zy.i("authenticator can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCache(Cache cache) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, cache, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097023, null);
        }
        zy.i("cache can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCertificatePinner(CertificatePinner certificatePinner) {
        certificatePinner.getClass();
        if (this.exchange == null) {
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, certificateChainCleaner != null ? certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner) : certificatePinner, null, null, null, null, null, null, null, false, null, null, null, null, 2096895, null);
        }
        zy.i("certificatePinner can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, _UtilJvmKt.checkDuration("connectTimeout", i, timeUnit), 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097143, null);
        }
        zy.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectionPool(ConnectionPool connectionPool) {
        connectionPool.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, connectionPool, null, null, null, null, null, null, false, null, null, null, null, 2096639, null);
        }
        zy.i("connectionPool can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCookieJar(CookieJar cookieJar) {
        cookieJar.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, cookieJar, null, null, null, null, null, false, null, null, null, null, 2096127, null);
        }
        zy.i("cookieJar can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withDns(Dns dns) {
        dns.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, dns, null, null, null, null, false, null, null, null, null, 2095103, null);
        }
        zy.i("dns can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withHostnameVerifier(HostnameVerifier hostnameVerifier) {
        hostnameVerifier.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, hostnameVerifier, null, null, null, false, null, null, null, null, 2093055, null);
        }
        zy.i("hostnameVerifier can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxy(Proxy proxy) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, proxy, null, null, false, null, null, null, null, 2088959, null);
        }
        zy.i("proxy can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxyAuthenticator(Authenticator authenticator) {
        authenticator.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, authenticator, null, false, null, null, null, null, 2080767, null);
        }
        zy.i("proxyAuthenticator can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxySelector(ProxySelector proxySelector) {
        proxySelector.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, proxySelector, false, null, null, null, null, 2064383, null);
        }
        zy.i("proxySelector can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, _UtilJvmKt.checkDuration("readTimeout", i, timeUnit), 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097135, null);
        }
        zy.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withRetryOnConnectionFailure(boolean z) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, z, null, null, null, null, 2031615, null);
        }
        zy.i("retryOnConnectionFailure can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withSocketFactory(SocketFactory socketFactory) {
        socketFactory.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, socketFactory, null, null, null, 1966079, null);
        }
        zy.i("socketFactory can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withSslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (this.exchange != null) {
            zy.i("sslSocketFactory can't be adjusted in a network interceptor");
            return null;
        }
        if (sSLSocketFactory == null || x509TrustManager == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 262143, null);
        }
        CertificateChainCleaner certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
        return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner), null, null, null, null, null, null, null, false, null, sSLSocketFactory, x509TrustManager, certificateChainCleaner, 261887, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, _UtilJvmKt.checkDuration("writeTimeout", i, timeUnit), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097119, null);
        }
        zy.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public /* synthetic */ RealInterceptorChain(RealCall realCall, List list, int i, Void r11, Request request, OkHttpClient okHttpClient, int i2, er0 er0Var) {
        this(realCall, list, i, r11, request, (i2 & 32) != 0 ? realCall.getClient() : okHttpClient);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Void r28, Request request, OkHttpClient okHttpClient) {
        this(realCall, list, i, (Exchange) r28, request, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis(), okHttpClient.authenticator(), okHttpClient.cache(), okHttpClient.certificatePinner(), okHttpClient.connectionPool(), okHttpClient.cookieJar(), okHttpClient.dns(), okHttpClient.hostnameVerifier(), okHttpClient.proxy(), okHttpClient.proxyAuthenticator(), okHttpClient.proxySelector(), okHttpClient.retryOnConnectionFailure(), okHttpClient.socketFactory(), okHttpClient.getSslSocketFactoryOrNull$okhttp(), okHttpClient.x509TrustManager(), okHttpClient.certificateChainCleaner());
        realCall.getClass();
        list.getClass();
        request.getClass();
        okHttpClient.getClass();
    }
}
