package okhttp3;

import defpackage.h00;
import defpackage.j42;
import defpackage.jx4;
import defpackage.su0;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.internal._HostnamesCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Route {
    private final Address address;
    private final h00 echConfigList;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress, h00 h00Var) {
        address.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
        this.echConfigList = h00Var;
    }

    @su0
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m347deprecated_address() {
        return this.address;
    }

    @su0
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m348deprecated_proxy() {
        return this.proxy;
    }

    @su0
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m349deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public final h00 echConfigList() {
        return this.echConfigList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return j42.c(route.address, this.address) && j42.c(route.proxy, this.proxy) && j42.c(route.socketAddress, this.socketAddress) && j42.c(route.echConfigList, this.echConfigList);
    }

    public int hashCode() {
        int hashCode = (this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31)) * 31;
        h00 h00Var = this.echConfigList;
        return hashCode + (h00Var != null ? h00Var.hashCode() : 0);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.address.sslSocketFactory() != null || this.address.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE);
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String host = this.address.url().host();
        InetAddress address = this.socketAddress.getAddress();
        String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : _HostnamesCommonKt.toCanonicalHost(hostAddress);
        if (jx4.E(host, ':')) {
            sb.append("[");
            sb.append(host);
            sb.append("]");
        } else {
            sb.append(host);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || host.equals(canonicalHost)) {
            sb.append(":");
            sb.append(this.address.url().port());
        }
        if (!host.equals(canonicalHost)) {
            if (j42.c(this.proxy, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (canonicalHost == null) {
                sb.append("<unresolved>");
            } else if (jx4.E(canonicalHost, ':')) {
                sb.append("[");
                sb.append(canonicalHost);
                sb.append("]");
            } else {
                sb.append(canonicalHost);
            }
            sb.append(":");
            sb.append(this.socketAddress.getPort());
        }
        if (this.echConfigList != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this(address, proxy, inetSocketAddress, null);
        address.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
    }
}
