package okhttp3.internal.connection;

import defpackage.eq;
import defpackage.er0;
import defpackage.j42;
import defpackage.kx4;
import defpackage.ls;
import defpackage.or0;
import defpackage.p70;
import defpackage.s83;
import defpackage.u75;
import defpackage.zl1;
import defpackage.zy;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.ech.EchUntrustedException;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private final RealCall call;
    private volatile boolean canceled;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;
    private final EchRetryPlan echRetryPlan;
    private Handshake handshake;
    private final boolean isTlsFallback;
    private Socket javaNetSocket;
    private final int pingIntervalMillis;
    private Protocol protocol;
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final Route route;
    private final RealRoutePlanner routePlanner;
    private final List<Route> routes;
    private BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final Request tunnelRequest;
    private final int writeTimeoutMillis;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List<Route> list, int i6, Request request, int i7, boolean z2, EchRetryPlan echRetryPlan) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        realCall.getClass();
        realRoutePlanner.getClass();
        route.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.call = realCall;
        this.routePlanner = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i6;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
        this.echRetryPlan = echRetryPlan;
    }

    private final void connectSocket() {
        Socket createSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = getRoute().address().socketFactory().createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(getRoute().proxy());
        }
        this.rawSocket = createSocket;
        if (this.canceled) {
            zl1.g("canceled");
            return;
        }
        createSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            Platform.Companion.get().connectSocket(createSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
            try {
                this.socket = BufferedSocketKt.asBufferedSocket(createSocket);
            } catch (NullPointerException e) {
                if (j42.c(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols(), getRoute().echConfigList());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.Companion;
            session.getClass();
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(address.url().host(), session)) {
                CertificatePinner certificatePinner = address.certificatePinner();
                certificatePinner.getClass();
                Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new ls(certificatePinner, handshake, address, (byte) 2));
                this.handshake = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new eq(handshake2, (byte) 5));
                String selectedProtocol = connectionSpec.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket) : null;
                this.javaNetSocket = sSLSocket;
                this.socket = BufferedSocketKt.asBufferedSocket(sSLSocket);
                this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.Companion.get().afterHandshake(sSLSocket);
                return;
            }
            List<Certificate> peerCertificates = handshake.peerCertificates();
            if (peerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = peerCertificates.get(0);
            certificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(kx4.q("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            "));
        } catch (Throwable th) {
            Platform.Companion.get().afterHandshake(sSLSocket);
            _UtilJvmKt.closeQuietly(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$0(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner$okhttp();
        certificateChainCleaner$okhttp.getClass();
        return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$1(Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(p70.J(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final ConnectPlan copy(Route route, int i, Request request, int i2, boolean z, EchRetryPlan echRetryPlan) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, route, this.routes, i, request, i2, z, echRetryPlan);
    }

    public static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, Route route, int i, Request request, int i2, boolean z, EchRetryPlan echRetryPlan, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            route = connectPlan.getRoute();
        }
        if ((i3 & 2) != 0) {
            i = connectPlan.attempt;
        }
        if ((i3 & 4) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i3 & 8) != 0) {
            i2 = connectPlan.connectionSpecIndex;
        }
        if ((i3 & 16) != 0) {
            z = connectPlan.isTlsFallback;
        }
        if ((i3 & 32) != 0) {
            echRetryPlan = connectPlan.echRetryPlan;
        }
        boolean z2 = z;
        EchRetryPlan echRetryPlan2 = echRetryPlan;
        return connectPlan.copy(route, i, request, i2, z2, echRetryPlan2);
    }

    private final Request createTunnel() {
        Request request = this.tunnelRequest;
        request.getClass();
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket == null) {
                j42.g0("socket");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
            BufferedSocket bufferedSocket2 = this.socket;
            if (bufferedSocket2 == null) {
                j42.g0("socket");
                throw null;
            }
            u75 timeout = bufferedSocket2.getSource().timeout();
            long j = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j, timeUnit);
            BufferedSocket bufferedSocket3 = this.socket;
            if (bufferedSocket3 == null) {
                j42.g0("socket");
                throw null;
            }
            bufferedSocket3.getSink().timeout().timeout(this.writeTimeoutMillis, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            readResponseHeaders.getClass();
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code != 407) {
                    or0.d(build.code(), "Unexpected response code for CONNECT: ");
                    break;
                }
                Request authenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), build);
                if (authenticate == null) {
                    zl1.g("Failed to authenticate with proxy");
                    return null;
                }
                if ("close".equalsIgnoreCase(Response.header$default(build, "Connection", null, 2, null))) {
                    return authenticate;
                }
                request = authenticate;
            } else {
                break;
            }
        }
        return null;
    }

    private final ConnectPlan nextCompatibleConnectionSpec(List<ConnectionSpec> list, SSLSocket sSLSocket) {
        int i = this.connectionSpecIndex + 1;
        int size = list.size();
        for (int i2 = i; i2 < size; i2++) {
            if (list.get(i2).isCompatible(sSLSocket)) {
                return copy$default(this, null, 0, null, i2, this.connectionSpecIndex != -1, null, 39, null);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo352cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo356connectTcp() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.mo356connectTcp():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    public RoutePlanner.ConnectResult mo357connectTlsEtc() {
        IOException iOException;
        Socket socket = this.rawSocket;
        if (socket == null) {
            s83.t("TCP not connected");
            return null;
        }
        if (isReady()) {
            zy.i("already connected");
            return null;
        }
        List<ConnectionSpec> connectionSpecs = getRoute().address().connectionSpecs();
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    RoutePlanner.ConnectResult connectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectTunnel$okhttp.getNextPlan() != null || connectTunnel$okhttp.getThrowable() != null) {
                        this.call.getPlansToCancel$okhttp().remove(this);
                        Socket socket2 = this.javaNetSocket;
                        if (socket2 != null) {
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                        return connectTunnel$okhttp;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    BufferedSocket bufferedSocket = this.socket;
                    if (bufferedSocket == null) {
                        j42.g0("socket");
                        throw null;
                    }
                    if (bufferedSocket.getSource().a().p()) {
                        BufferedSocket bufferedSocket2 = this.socket;
                        if (bufferedSocket2 == null) {
                            j42.g0("socket");
                            throw null;
                        }
                        if (bufferedSocket2.getSink().a().p()) {
                            this.call.getEventListener$okhttp().secureConnectStart(this.call);
                            Socket createSocket = getRoute().address().sslSocketFactory().createSocket(socket, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            createSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(connectionSpecs, sSLSocket);
                            ConnectionSpec connectionSpec = connectionSpecs.get(planWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            connectionSpec.apply$okhttp(sSLSocket, planWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                            try {
                                connectTls(sSLSocket, connectionSpec);
                                this.call.getEventListener$okhttp().secureConnectEnd(this.call, this.handshake);
                            } catch (SSLException e) {
                                planWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(connectionSpecs, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket;
                List<Protocol> protocols = getRoute().address().protocols();
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!protocols.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                TaskRunner taskRunner = this.taskRunner;
                RealConnectionPool realConnectionPool = this.connectionPool;
                Route route = getRoute();
                Socket socket3 = this.javaNetSocket;
                socket3.getClass();
                Handshake handshake = this.handshake;
                Protocol protocol2 = this.protocol;
                protocol2.getClass();
                BufferedSocket bufferedSocket3 = this.socket;
                if (bufferedSocket3 == null) {
                    j42.g0("socket");
                    throw null;
                }
                RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket, socket3, handshake, protocol2, bufferedSocket3, this.pingIntervalMillis, this.connectionPool.getConnectionListener$okhttp());
                this.connection = realConnection;
                realConnection.start();
                this.call.getEventListener$okhttp().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), this.protocol);
                try {
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                    this.call.getPlansToCancel$okhttp().remove(this);
                    return connectResult;
                } catch (IOException e2) {
                    iOException = e2;
                    z = true;
                    this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                    this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, iOException);
                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, iOException);
                    this.call.getPlansToCancel$okhttp().remove(this);
                    if (!z) {
                        Socket socket4 = this.javaNetSocket;
                        if (socket4 != null) {
                            _UtilJvmKt.closeQuietly(socket4);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    return connectResult2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.call.getPlansToCancel$okhttp().remove(this);
                    if (!z) {
                        Socket socket5 = this.javaNetSocket;
                        if (socket5 != null) {
                            _UtilJvmKt.closeQuietly(socket5);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            iOException = e3;
        }
    }

    public final RoutePlanner.ConnectResult connectTunnel$okhttp() {
        Request createTunnel = createTunnel();
        if (createTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i = this.attempt + 1;
        if (i < 21) {
            this.call.getEventListener$okhttp().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, null, i, createTunnel, 0, false, null, 57, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    public final int getConnectionSpecIndex$okhttp() {
        return this.connectionSpecIndex;
    }

    public final Socket getJavaNetSocket$okhttp() {
        return this.javaNetSocket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public RealConnection mo353handleSuccess() {
        this.call.getClient().getRouteDatabase$okhttp().connected(getRoute());
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        realConnection.getConnectionListener$okhttp().connectEnd(realConnection, getRoute(), this.call);
        ReusePlan planReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.call.acquireConnectionNoEvents(realConnection);
        }
        this.call.getEventListener$okhttp().connectionAcquired(this.call, realConnection);
        realConnection.getConnectionListener$okhttp().connectionAcquired(realConnection, this.call);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
        return this.protocol != null;
    }

    public final boolean isTlsFallback$okhttp() {
        return this.isTlsFallback;
    }

    public final ConnectPlan nextConnectionSpec$okhttp(List<ConnectionSpec> list, SSLSocket sSLSocket, SSLException sSLException) {
        list.getClass();
        sSLSocket.getClass();
        sSLException.getClass();
        if (this.echRetryPlan != null) {
            return null;
        }
        EchRetryPlan echRetryPlan = Platform.Companion.get().echRetryPlan(sSLException);
        if (echRetryPlan == null) {
            if (this.retryOnConnectionFailure && RetryTlsHandshakeKt.attemptAnotherConnectionSpec(sSLException)) {
                return nextCompatibleConnectionSpec(list, sSLSocket);
            }
            return null;
        }
        HostnameVerifier hostnameVerifier = getRoute().address().hostnameVerifier();
        hostnameVerifier.getClass();
        if (hostnameVerifier.verify(echRetryPlan.getPublicName(), sSLSocket.getSession())) {
            return copy$default(this, new Route(getRoute().address(), getRoute().proxy(), getRoute().socketAddress(), echRetryPlan.getConfigList()), 0, null, 0, false, echRetryPlan, 30, null);
        }
        throw new EchUntrustedException("public_name '" + echRetryPlan.getPublicName() + "' not verified", sSLException);
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(List<ConnectionSpec> list, SSLSocket sSLSocket) {
        list.getClass();
        sSLSocket.getClass();
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan nextCompatibleConnectionSpec = nextCompatibleConnectionSpec(list, sSLSocket);
        if (nextCompatibleConnectionSpec != null) {
            return nextCompatibleConnectionSpec;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public RoutePlanner.Plan mo354retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback, this.echRetryPlan);
    }

    public final void setJavaNetSocket$okhttp(Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(RealCall realCall, IOException iOException) {
        realCall.getClass();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    public /* synthetic */ ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, int i6, Request request, int i7, boolean z2, EchRetryPlan echRetryPlan, int i8, er0 er0Var) {
        this(taskRunner, realConnectionPool, i, i2, i3, i4, i5, z, realCall, realRoutePlanner, route, list, i6, request, i7, z2, (i8 & 65536) != 0 ? null : echRetryPlan);
    }
}
