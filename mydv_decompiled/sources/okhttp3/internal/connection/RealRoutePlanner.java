package okhttp3.internal.connection;

import coil3.network.internal.UtilsKt;
import defpackage.j42;
import defpackage.pp;
import defpackage.r7;
import defpackage.zl1;
import defpackage.zy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealRoutePlanner implements RoutePlanner {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private final pp deferredPlans;
    private final boolean doExtensiveHealthChecks;
    private final boolean fastFallback;
    private Route nextRouteToTry;
    private final int pingIntervalMillis;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final int writeTimeoutMillis;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        request.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.fastFallback = z2;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = realCall;
        this.doExtensiveHealthChecks = !j42.c(request.method(), UtilsKt.HTTP_METHOD_GET);
        this.deferredPlans = new pp();
    }

    private final Request createTunnelRequest(Route route) {
        Request build = new Request.Builder().url(route.address().url()).method("CONNECT", null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", _UtilCommonKt.USER_AGENT).build();
        Request authenticate = route.address().proxyAuthenticator().authenticate(route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate == null ? build : authenticate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectPlan planConnectToRoute$okhttp$default(RealRoutePlanner realRoutePlanner, Route route, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    private final ReusePlan planReuseCallConnection() {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z;
        RealConnection connection = this.call.getConnection();
        if (connection == null) {
            return null;
        }
        boolean isHealthy = connection.isHealthy(this.doExtensiveHealthChecks);
        synchronized (connection) {
            try {
                if (isHealthy) {
                    if (!connection.getNoNewExchanges() && sameHostAndPort(connection.route().address().url())) {
                        z = false;
                        releaseConnectionNoEvents$okhttp = null;
                    }
                    releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                    z = false;
                } else {
                    z = !connection.getNoNewExchanges();
                    connection.setNoNewExchanges(true);
                    releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                }
            } finally {
            }
        }
        if (this.call.getConnection() != null) {
            if (releaseConnectionNoEvents$okhttp == null) {
                return new ReusePlan(connection);
            }
            zy.i("Check failed.");
            return null;
        }
        if (releaseConnectionNoEvents$okhttp != null) {
            _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
        }
        this.call.getEventListener$okhttp().connectionReleased(this.call, connection);
        connection.getConnectionListener$okhttp().connectionReleased(connection, this.call);
        if (releaseConnectionNoEvents$okhttp != null) {
            connection.getConnectionListener$okhttp().connectionClosed(connection);
        } else if (z) {
            connection.getConnectionListener$okhttp().noNewExchanges(connection);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReusePlan planReusePooledConnection$okhttp$default(RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            connectPlan = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    private final Route retryRoute(RealConnection realConnection) {
        Route route;
        synchronized (realConnection) {
            route = null;
            if (realConnection.getRouteFailureCount$okhttp() == 0 && realConnection.getNoNewExchanges() && _UtilJvmKt.canReuseConnectionFor(realConnection.route().address().url(), getAddress().url())) {
                route = realConnection.route();
            }
        }
        return route;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public Address getAddress() {
        return this.address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public pp getDeferredPlans() {
        return this.deferredPlans;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route retryRoute;
        if (!getDeferredPlans().isEmpty() || this.nextRouteToTry != null) {
            return true;
        }
        if (realConnection != null && (retryRoute = retryRoute(realConnection)) != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
        return this.call.isCanceled();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public RoutePlanner.Plan plan() {
        ReusePlan planReuseCallConnection = planReuseCallConnection();
        if (planReuseCallConnection != null) {
            return planReuseCallConnection;
        }
        ReusePlan planReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (planReusePooledConnection$okhttp$default != null) {
            return planReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return (RoutePlanner.Plan) getDeferredPlans().removeFirst();
        }
        ConnectPlan planConnect$okhttp = planConnect$okhttp();
        ReusePlan planReusePooledConnection$okhttp = planReusePooledConnection$okhttp(planConnect$okhttp, planConnect$okhttp.getRoutes$okhttp());
        return planReusePooledConnection$okhttp != null ? planReusePooledConnection$okhttp : planConnect$okhttp;
    }

    public final ConnectPlan planConnect$okhttp() {
        Route route = this.nextRouteToTry;
        if (route != null) {
            this.nextRouteToTry = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
        }
        RouteSelector routeSelector = this.routeSelector;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(getAddress(), this.routeDatabase, this.call, this.fastFallback);
            this.routeSelector = routeSelector;
        }
        if (!routeSelector.hasNext()) {
            zl1.g("exhausted all routes");
            return null;
        }
        RouteSelector.Selection next = routeSelector.next();
        this.routeSelection = next;
        if (!isCanceled()) {
            return planConnectToRoute$okhttp(next.next(), next.getRoutes());
        }
        zl1.g("Canceled");
        return null;
    }

    public final ConnectPlan planConnectToRoute$okhttp(Route route, List<Route> list) {
        route.getClass();
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String host = route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted(host)) {
                throw new UnknownServiceException(r7.C("CLEARTEXT communication to ", host, " not permitted by network security policy"));
            }
        } else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this, route, list, 0, route.requiresTunnel() ? createTunnelRequest(route) : null, -1, false, null, 65536, null);
    }

    public final ReusePlan planReusePooledConnection$okhttp(ConnectPlan connectPlan, List<Route> list) {
        RealConnection callAcquirePooledConnection$okhttp = this.connectionPool.callAcquirePooledConnection$okhttp(this.doExtensiveHealthChecks, getAddress(), this.call, list, connectPlan != null && connectPlan.isReady());
        if (callAcquirePooledConnection$okhttp == null) {
            return null;
        }
        if (connectPlan != null) {
            this.nextRouteToTry = connectPlan.getRoute();
            connectPlan.closeQuietly();
        }
        this.call.getEventListener$okhttp().connectionAcquired(this.call, callAcquirePooledConnection$okhttp);
        callAcquirePooledConnection$okhttp.getConnectionListener$okhttp().connectionAcquired(callAcquirePooledConnection$okhttp, this.call);
        return new ReusePlan(callAcquirePooledConnection$okhttp);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(HttpUrl httpUrl) {
        httpUrl.getClass();
        HttpUrl url = getAddress().url();
        return httpUrl.port() == url.port() && j42.c(httpUrl.host(), url.host());
    }
}
