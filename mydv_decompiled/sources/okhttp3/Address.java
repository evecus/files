package okhttp3;

import defpackage.j42;
import defpackage.su0;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = _UtilJvmKt.toImmutableList(list);
        this.connectionSpecs = _UtilJvmKt.toImmutableList(list2);
    }

    @su0
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m207deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @su0
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m208deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @su0
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m209deprecated_dns() {
        return this.dns;
    }

    @su0
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m210deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @su0
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m211deprecated_protocols() {
        return this.protocols;
    }

    @su0
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m212deprecated_proxy() {
        return this.proxy;
    }

    @su0
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m213deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @su0
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m214deprecated_proxySelector() {
        return this.proxySelector;
    }

    @su0
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m215deprecated_socketFactory() {
        return this.socketFactory;
    }

    @su0
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m216deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @su0
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m217deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return j42.c(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        address.getClass();
        return j42.c(this.dns, address.dns) && j42.c(this.proxyAuthenticator, address.proxyAuthenticator) && j42.c(this.protocols, address.protocols) && j42.c(this.connectionSpecs, address.connectionSpecs) && j42.c(this.proxySelector, address.proxySelector) && j42.c(this.proxy, address.proxy) && j42.c(this.sslSocketFactory, address.sslSocketFactory) && j42.c(this.hostnameVerifier, address.hostnameVerifier) && j42.c(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
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

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }
}
