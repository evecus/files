package okhttp3;

import defpackage.tm1;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Interceptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Authenticator getAuthenticator();

        Cache getCache();

        CertificatePinner getCertificatePinner();

        ConnectionPool getConnectionPool();

        CookieJar getCookieJar();

        Dns getDns();

        EventListener getEventListener();

        boolean getFollowRedirects();

        boolean getFollowSslRedirects();

        HostnameVerifier getHostnameVerifier();

        Proxy getProxy();

        Authenticator getProxyAuthenticator();

        ProxySelector getProxySelector();

        boolean getRetryOnConnectionFailure();

        SocketFactory getSocketFactory();

        SSLSocketFactory getSslSocketFactoryOrNull();

        X509TrustManager getX509TrustManagerOrNull();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withAuthenticator(Authenticator authenticator);

        Chain withCache(Cache cache);

        Chain withCertificatePinner(CertificatePinner certificatePinner);

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withConnectionPool(ConnectionPool connectionPool);

        Chain withCookieJar(CookieJar cookieJar);

        Chain withDns(Dns dns);

        Chain withHostnameVerifier(HostnameVerifier hostnameVerifier);

        Chain withProxy(Proxy proxy);

        Chain withProxyAuthenticator(Authenticator authenticator);

        Chain withProxySelector(ProxySelector proxySelector);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withRetryOnConnectionFailure(boolean z);

        Chain withSocketFactory(SocketFactory socketFactory);

        Chain withSslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final tm1 tm1Var) {
            tm1Var.getClass();
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return (Response) tm1.this.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain);
}
