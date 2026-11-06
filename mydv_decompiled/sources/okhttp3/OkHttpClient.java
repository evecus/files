package okhttp3;

import defpackage.er0;
import defpackage.j42;
import defpackage.r7;
import defpackage.s83;
import defpackage.su0;
import defpackage.tm1;
import defpackage.u70;
import defpackage.zy;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean fastFallback;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final TaskRunner taskRunner;
    private final int webSocketCloseTimeout;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = _UtilJvmKt.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = _UtilJvmKt.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector$okhttp;
        builder.getClass();
        this.dispatcher = builder.getDispatcher$okhttp();
        this.interceptors = _UtilJvmKt.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = _UtilJvmKt.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.fastFallback = builder.getFastFallback$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            if (proxySelector$okhttp == null && (proxySelector$okhttp = ProxySelector.getDefault()) == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp == null ? TaskRunner.INSTANCE : taskRunner$okhttp;
        ConnectionPool connectionPool$okhttp = builder.getConnectionPool$okhttp();
        if (connectionPool$okhttp == null) {
            connectionPool$okhttp = new ConnectionPool();
            builder.setConnectionPool$okhttp(connectionPool$okhttp);
        }
        this.connectionPool = connectionPool$okhttp;
        if (connectionSpecs$okhttp == null || !connectionSpecs$okhttp.isEmpty()) {
            Iterator<T> it = connectionSpecs$okhttp.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        certificateChainCleaner$okhttp.getClass();
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        x509TrustManagerOrNull$okhttp.getClass();
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        this.certificatePinner = builder.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        Platform.Companion companion = Platform.Companion;
                        X509TrustManager platformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = platformTrustManager;
                        this.sslSocketFactoryOrNull = companion.get().newSslSocketFactory(platformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = CertificateChainCleaner.Companion.get(platformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        this.certificatePinner = builder.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                    verifyClientState();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.DEFAULT;
        verifyClientState();
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        list.getClass();
        if (list.contains(null)) {
            s83.k(this.interceptors, "Null interceptor: ");
            return;
        }
        List<Interceptor> list2 = this.networkInterceptors;
        list2.getClass();
        if (list2.contains(null)) {
            s83.k(this.networkInterceptors, "Null network interceptor: ");
            return;
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        zy.i("sslSocketFactory == null");
                        return;
                    } else if (this.certificateChainCleaner == null) {
                        zy.i("certificateChainCleaner == null");
                        return;
                    } else {
                        if (this.x509TrustManager != null) {
                            return;
                        }
                        zy.i("x509TrustManager == null");
                        return;
                    }
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            zy.i("Check failed.");
            return;
        }
        if (this.certificateChainCleaner != null) {
            zy.i("Check failed.");
        } else if (this.x509TrustManager != null) {
            zy.i("Check failed.");
        } else {
            if (j42.c(this.certificatePinner, CertificatePinner.DEFAULT)) {
                return;
            }
            zy.i("Check failed.");
        }
    }

    @su0
    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m295deprecated_authenticator() {
        return this.authenticator;
    }

    @su0
    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m296deprecated_cache() {
        return this.cache;
    }

    @su0
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m297deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @su0
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m298deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @su0
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m299deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @su0
    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m300deprecated_connectionPool() {
        return this.connectionPool;
    }

    @su0
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m301deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @su0
    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m302deprecated_cookieJar() {
        return this.cookieJar;
    }

    @su0
    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m303deprecated_dispatcher() {
        return this.dispatcher;
    }

    @su0
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m304deprecated_dns() {
        return this.dns;
    }

    @su0
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m305deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @su0
    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m306deprecated_followRedirects() {
        return this.followRedirects;
    }

    @su0
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m307deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @su0
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m308deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @su0
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m309deprecated_interceptors() {
        return this.interceptors;
    }

    @su0
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m310deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @su0
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m311deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @su0
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m312deprecated_protocols() {
        return this.protocols;
    }

    @su0
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m313deprecated_proxy() {
        return this.proxy;
    }

    @su0
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m314deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @su0
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m315deprecated_proxySelector() {
        return this.proxySelector;
    }

    @su0
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m316deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @su0
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m317deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @su0
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m318deprecated_socketFactory() {
        return this.socketFactory;
    }

    @su0
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m319deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @su0
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m320deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Address address(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        httpUrl.getClass();
        if (httpUrl.isHttps()) {
            sSLSocketFactory = sslSocketFactory();
            hostnameVerifier = this.hostnameVerifier;
            certificatePinner = this.certificatePinner;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.dns, this.socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean fastFallback() {
        return this.fastFallback;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase$okhttp() {
        return this.routeDatabase;
    }

    public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
        return this.sslSocketFactoryOrNull;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        request.getClass();
        webSocketListener.getClass();
        RealWebSocket realWebSocket = new RealWebSocket(this.taskRunner, request, webSocketListener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        zy.i("CLEARTEXT-only client");
        return null;
    }

    public final int webSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean fastFallback;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private TaskRunner taskRunner;
        private int webSocketCloseTimeout;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            okHttpClient.getClass();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            u70.I0(this.interceptors, okHttpClient.interceptors());
            u70.I0(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.fastFallback = okHttpClient.fastFallback();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.getSslSocketFactoryOrNull$okhttp();
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.webSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase$okhttp();
            this.taskRunner = okHttpClient.getTaskRunner$okhttp();
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m321addInterceptor(final tm1 tm1Var) {
            tm1Var.getClass();
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return (Response) tm1.this.invoke(chain);
                }
            });
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m322addNetworkInterceptor(final tm1 tm1Var) {
            tm1Var.getClass();
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return (Response) tm1.this.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            duration.getClass();
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m323callTimeoutLRDsOJo(long j) {
            this.callTimeout = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            if (!certificatePinner.equals(this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            duration.getClass();
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m324connectTimeoutLRDsOJo(long j) {
            this.connectTimeout = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            connectionPool.getClass();
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            list.getClass();
            if (!list.equals(this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = _UtilJvmKt.toImmutableList(list);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            dns.getClass();
            if (!dns.equals(this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            eventListener.getClass();
            this.eventListenerFactory = _UtilJvmKt.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            factory.getClass();
            this.eventListenerFactory = factory;
            return this;
        }

        public final Builder fastFallback(boolean z) {
            this.fastFallback = z;
            return this;
        }

        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFastFallback$okhttp() {
            return this.fastFallback;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final int getWebSocketCloseTimeout$okhttp() {
            return this.webSocketCloseTimeout;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            if (!hostnameVerifier.equals(this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long j) {
            if (j >= 0) {
                this.minWebSocketMessageToCompress = j;
                return this;
            }
            s83.h(r7.A("minWebSocketMessageToCompress must be positive: ", j));
            return null;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(Duration duration) {
            duration.getClass();
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final Builder m325pingIntervalLRDsOJo(long j) {
            this.pingInterval = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                s83.s(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                s83.s(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return null;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                s83.s(arrayList, "protocols must not contain http/1.0: ");
                return null;
            }
            if (arrayList.contains(null)) {
                s83.t("protocols must not contain null");
                return null;
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            this.protocols = unmodifiableList;
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            if (!j42.c(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
            authenticator.getClass();
            if (!authenticator.equals(this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            proxySelector.getClass();
            if (!proxySelector.equals(this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            duration.getClass();
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m326readTimeoutLRDsOJo(long j) {
            this.readTimeout = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            list.getClass();
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            dns.getClass();
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            factory.getClass();
            this.eventListenerFactory = factory;
        }

        public final void setFastFallback$okhttp(boolean z) {
            this.fastFallback = z;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            list.getClass();
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            socketFactory.getClass();
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setTaskRunner$okhttp(TaskRunner taskRunner) {
            this.taskRunner = taskRunner;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i) {
            this.webSocketCloseTimeout = i;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            socketFactory.getClass();
            if (socketFactory instanceof SSLSocketFactory) {
                s83.t("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            if (!socketFactory.equals(this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @su0
        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            sSLSocketFactory.getClass();
            if (!sSLSocketFactory.equals(this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sSLSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                x509TrustManager.getClass();
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
            sb.append(companion.get());
            Class<?> cls = sSLSocketFactory.getClass();
            sb.append(", sslSocketFactory is ");
            sb.append(cls);
            throw new IllegalStateException(sb.toString());
        }

        public final Builder taskRunner$okhttp(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.taskRunner = taskRunner;
            return this;
        }

        public final Builder webSocketCloseTimeout(Duration duration) {
            duration.getClass();
            webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m327webSocketCloseTimeoutLRDsOJo(long j) {
            this.webSocketCloseTimeout = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            duration.getClass();
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m328writeTimeoutLRDsOJo(long j) {
            this.writeTimeout = _UtilJvmKt.m351checkDurationHG0u8IE("duration", j);
            return this;
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.callTimeout = _UtilJvmKt.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.connectTimeout = _UtilJvmKt.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.pingInterval = _UtilJvmKt.checkDuration("interval", j, timeUnit);
            return this;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.readTimeout = _UtilJvmKt.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder webSocketCloseTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.webSocketCloseTimeout = _UtilJvmKt.checkDuration("webSocketCloseTimeout", j, timeUnit);
            return this;
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.writeTimeout = _UtilJvmKt.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            sSLSocketFactory.getClass();
            x509TrustManager.getClass();
            if (!sSLSocketFactory.equals(this.sslSocketFactoryOrNull) || !x509TrustManager.equals(this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = _UtilJvmKt.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            this.socketFactory = Platform.Companion.get().getSocketFactory();
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
