package okhttp3.internal.platform;

import defpackage.b13;
import defpackage.cz;
import defpackage.er0;
import defpackage.h00;
import defpackage.o91;
import defpackage.p70;
import defpackage.zy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.dns.InetAddressDns;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class Platform {
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: log");
            return;
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i, th);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        sSLSocket.getClass();
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list, h00 h00Var) {
        sSLSocket.getClass();
        list.getClass();
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.getClass();
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public EchRetryPlan echRetryPlan(SSLException sSLException) {
        sSLException.getClass();
        return null;
    }

    public List<String> getHandshakeServerNames(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        SSLSession session = sSLSocket.getSession();
        ExtendedSSLSession e = b13.k(session) ? b13.e(session) : null;
        o91 o91Var = o91.I;
        if (e == null) {
            return o91Var;
        }
        try {
            List<SNIServerName> requestedServerNames = e.getRequestedServerNames();
            requestedServerNames.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = requestedServerNames.iterator();
            while (it.hasNext()) {
                SNIServerName g = b13.g(it.next());
                SNIHostName f = b13.n(g) ? b13.f(g) : null;
                String asciiName = f != null ? f.getAsciiName() : null;
                if (asciiName != null) {
                    arrayList.add(asciiName);
                }
            }
            return arrayList;
        } catch (UnsupportedOperationException unused) {
            return o91Var;
        }
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        return null;
    }

    public ServerSocketFactory getServerSocketFactory() {
        ServerSocketFactory serverSocketFactory = ServerSocketFactory.getDefault();
        serverSocketFactory.getClass();
        return serverSocketFactory;
    }

    public SocketFactory getSocketFactory() {
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        return socketFactory;
    }

    public Object getStackTraceForCloseable(String str) {
        str.getClass();
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public Dns getSystemDns() {
        return InetAddressDns.INSTANCE;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        str.getClass();
        return true;
    }

    public void log(String str, int i, Throwable th) {
        str.getClass();
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        str.getClass();
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(str, 5, (Throwable) obj);
    }

    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                trustManager.getClass();
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        arrays.getClass();
        zy.e("Unexpected default trust managers: ".concat(arrays));
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
        try {
            Object readFieldOrNull = _UtilJvmKt.readFieldOrNull(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) _UtilJvmKt.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!e.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            return PlatformRegistry.INSTANCE.findPlatform();
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> list) {
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((Protocol) obj2).toString());
            }
            return arrayList2;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> list) {
            list.getClass();
            cz czVar = new cz();
            for (String str : alpnProtocolNames(list)) {
                czVar.d0(str.length());
                czVar.k0(str);
            }
            return czVar.N(czVar.J);
        }

        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return PlatformRegistry.INSTANCE.isAndroid();
        }

        public final void resetForTests(Platform platform) {
            platform.getClass();
            Platform.platform = platform;
            PublicSuffixDatabase.Companion.resetForTests$okhttp();
        }

        private Companion() {
        }
    }
}
