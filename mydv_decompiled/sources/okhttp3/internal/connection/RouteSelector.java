package okhttp3.internal.connection;

import defpackage.er0;
import defpackage.h00;
import defpackage.o91;
import defpackage.p70;
import defpackage.s83;
import defpackage.sv2;
import defpackage.u70;
import defpackage.zy;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Address;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final RealCall call;
    private final boolean fastFallback;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            list.getClass();
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                zy.k();
                return null;
            }
            List<Route> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = realCall;
        this.fastFallback = z;
        this.proxies = o91.I;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final List<Route> dnsLookup(Proxy proxy, String str, int i) {
        ArrayList arrayList;
        this.call.getEventListener$okhttp().dnsStart(this.call, str);
        Dns.Call newCall = this.address.dns().newCall(new Dns.Request(str, (this.address.url().isHttps() || i != 80) ? i : -1));
        if (newCall instanceof LookupDnsCall) {
            List<InetAddress> lookup = this.address.dns().lookup(str);
            arrayList = new ArrayList(p70.J(lookup, 10));
            Iterator<T> it = lookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new Route(this.address, proxy, new InetSocketAddress((InetAddress) it.next(), i)));
            }
        } else {
            List<Dns.Record> execute = _ExecuteDnsKt.execute(newCall);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : execute) {
                if (obj instanceof Dns.Record.ServiceMetadata) {
                    arrayList2.add(obj);
                }
            }
            int J = sv2.J(p70.J(arrayList2, 10));
            if (J < 16) {
                J = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(J);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                linkedHashMap.put(((Dns.Record.ServiceMetadata) obj2).getHostname(), obj2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : execute) {
                if (obj3 instanceof Dns.Record.IpAddress) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(p70.J(arrayList3, 10));
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList3.get(i3);
                i3++;
                Dns.Record.IpAddress ipAddress = (Dns.Record.IpAddress) obj4;
                Dns.Record.ServiceMetadata serviceMetadata = (Dns.Record.ServiceMetadata) linkedHashMap.get(ipAddress.getHostname());
                Address address = this.address;
                InetSocketAddress inetSocketAddress = new InetSocketAddress(ipAddress.address(), i);
                Proxy.Type type = proxy.type();
                h00 h00Var = null;
                if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1 && serviceMetadata != null) {
                    h00Var = serviceMetadata.echConfigList();
                }
                arrayList4.add(new Route(address, proxy, inetSocketAddress, h00Var));
            }
            arrayList = arrayList4;
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + str);
        }
        EventListener eventListener$okhttp = this.call.getEventListener$okhttp();
        RealCall realCall = this.call;
        ArrayList arrayList5 = new ArrayList(p70.J(arrayList, 10));
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj5 = arrayList.get(i4);
            i4++;
            arrayList5.add(((Route) obj5).socketAddress().getAddress());
        }
        eventListener$okhttp.dnsEnd(realCall, str, arrayList5);
        return arrayList;
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final List<Route> nextProxy() {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            return nextRoutes(list.get(i));
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final List<Route> nextRoutes(Proxy proxy) {
        String host;
        int port;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.url().host();
            port = this.address.url().port();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                s83.s(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                return null;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            host = Companion.getSocketHost(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || port >= 65536) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            Address address2 = this.address;
            InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(host, port);
            createUnresolved.getClass();
            return p70.j0(new Route(address2, proxy, createUnresolved));
        }
        if (_HostnamesCommonKt.canParseAsIpAddress(host)) {
            return p70.j0(new Route(this.address, proxy, new InetSocketAddress(InetAddress.getByName(host), port)));
        }
        List<Route> dnsLookup = dnsLookup(proxy, host, port);
        ArrayList arrayList = new ArrayList();
        for (Object obj : dnsLookup) {
            if (((Route) obj).echConfigList() != null) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            dnsLookup = arrayList;
        }
        return this.fastFallback ? InetAddressOrderKt.reorderForHappyEyeballs(dnsLookup) : dnsLookup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.call.getEventListener$okhttp().proxySelectStart(this.call, httpUrl);
        this.proxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.nextProxyIndex = 0;
        this.call.getEventListener$okhttp().proxySelectEnd(this.call, httpUrl, this.proxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        List<Proxy> list;
        if (proxy != null) {
            return p70.j0(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return _UtilJvmKt.immutableListOf(Proxy.NO_PROXY);
        }
        try {
            list = routeSelector.address.proxySelector().select(uri);
        } catch (IllegalArgumentException unused) {
            list = null;
        }
        return (list == null || list.isEmpty()) ? _UtilJvmKt.immutableListOf(Proxy.NO_PROXY) : _UtilJvmKt.toImmutableList(list);
    }

    public final boolean hasNext() {
        return hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    public final Selection next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            for (Route route : nextProxy()) {
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            u70.I0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            inetSocketAddress.getClass();
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                hostName.getClass();
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            hostAddress.getClass();
            return hostAddress;
        }

        private Companion() {
        }
    }
}
