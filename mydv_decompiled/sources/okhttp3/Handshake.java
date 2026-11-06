package okhttp3;

import defpackage.eq;
import defpackage.er0;
import defpackage.j42;
import defpackage.k30;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.rm1;
import defpackage.su0;
import defpackage.u05;
import defpackage.uc2;
import defpackage.zl1;
import defpackage.zy;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final uc2 peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, rm1 rm1Var) {
        tlsVersion.getClass();
        cipherSuite.getClass();
        list.getClass();
        rm1Var.getClass();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = new u05(new eq(rm1Var, (byte) 9));
    }

    public static final Handshake get(SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List peerCertificates_delegate$lambda$0(rm1 rm1Var) {
        try {
            return (List) rm1Var.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return o91.I;
        }
    }

    @su0
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m252deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @su0
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m253deprecated_localCertificates() {
        return this.localCertificates;
    }

    @su0
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m254deprecated_localPrincipal() {
        return localPrincipal();
    }

    @su0
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m255deprecated_peerCertificates() {
        return peerCertificates();
    }

    @su0
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m256deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @su0
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m257deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.tlsVersion == this.tlsVersion && j42.c(handshake.cipherSuite, this.cipherSuite) && j42.c(handshake.peerCertificates(), peerCertificates()) && j42.c(handshake.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object U0 = o70.U0(this.localCertificates);
        X509Certificate x509Certificate = U0 instanceof X509Certificate ? (X509Certificate) U0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object U0 = o70.U0(peerCertificates());
        X509Certificate x509Certificate = U0 instanceof X509Certificate ? (X509Certificate) U0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(p70.J(peerCertificates, 10));
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(p70.J(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        @su0
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m258deprecated_get(SSLSession sSLSession) {
            sSLSession.getClass();
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) {
            Object obj;
            sSLSession.getClass();
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                zy.i("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                zl1.g("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                zy.i("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                zl1.g("tlsVersion == NONE");
                return null;
            }
            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
            try {
                obj = _UtilJvmKt.toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                obj = o91.I;
            }
            return new Handshake(forJavaName2, forJavaName, _UtilJvmKt.toImmutableList(sSLSession.getLocalCertificates()), new eq(obj, (byte) 10));
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List get$lambda$0(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List handshake$lambda$2(List list) {
            return list;
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            tlsVersion.getClass();
            cipherSuite.getClass();
            list.getClass();
            list2.getClass();
            return new Handshake(tlsVersion, cipherSuite, _UtilJvmKt.toImmutableList(list2), new k30(_UtilJvmKt.toImmutableList(list), (byte) 3));
        }
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }
}
