package okhttp3;

import defpackage.a;
import defpackage.dq;
import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jp;
import defpackage.jx4;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.qx4;
import defpackage.rm1;
import defpackage.s83;
import defpackage.su0;
import defpackage.yj;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            str.getClass();
            strArr.getClass();
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(o70.u1(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Pin {
        private final h00 hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            str.getClass();
            str2.getClass();
            if ((!qx4.y(str, "*.", false) || jx4.J(str, "*", 1, false, 4) != -1) && ((!qx4.y(str, "**.", false) || jx4.J(str, "*", 2, false, 4) != -1) && jx4.J(str, "*", 0, false, 6) != -1)) {
                s83.h("Unexpected pattern: ".concat(str));
                throw null;
            }
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                s83.t("Invalid pattern: ".concat(str));
                throw null;
            }
            this.pattern = canonicalHost;
            if (qx4.y(str2, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                h00 h00Var = h00.L;
                byte[] a = a.a(str2.substring(5));
                h00 h00Var2 = a != null ? new h00(a) : null;
                if (h00Var2 != null) {
                    this.hash = h00Var2;
                    return;
                } else {
                    s83.t("Invalid pin hash: ".concat(str2));
                    throw null;
                }
            }
            if (!qx4.y(str2, "sha256/", false)) {
                s83.t("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                throw null;
            }
            this.hashAlgorithm = "sha256";
            h00 h00Var3 = h00.L;
            byte[] a2 = a.a(str2.substring(7));
            h00 h00Var4 = a2 != null ? new h00(a2) : null;
            if (h00Var4 != null) {
                this.hash = h00Var4;
            } else {
                s83.t("Invalid pin hash: ".concat(str2));
                throw null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return j42.c(this.pattern, pin.pattern) && j42.c(this.hashAlgorithm, pin.hashAlgorithm) && j42.c(this.hash, pin.hash);
        }

        public final h00 getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + hf1.n(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            String str = this.hashAlgorithm;
            if (j42.c(str, "sha256")) {
                return j42.c(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (j42.c(str, "sha1")) {
                return j42.c(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0068 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean matchesHostname(java.lang.String r12) {
            /*
                r11 = this;
                r12.getClass()
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                boolean r0 = defpackage.qx4.y(r0, r1, r2)
                java.lang.String r1 = r11.pattern
                r3 = 46
                r4 = 1
                if (r0 == 0) goto L39
                int r0 = r1.length()
                int r7 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r7
                int r1 = r12.length()
                int r5 = r1 - r7
                java.lang.String r9 = r11.pattern
                r6 = 3
                r10 = 0
                r8 = r12
                boolean r11 = defpackage.qx4.v(r5, r6, r7, r8, r9, r10)
                if (r11 == 0) goto L69
                if (r0 == 0) goto L68
                int r0 = r0 - r4
                char r11 = r8.charAt(r0)
                if (r11 != r3) goto L69
                goto L68
            L39:
                r8 = r12
                java.lang.String r12 = "*."
                boolean r12 = defpackage.qx4.y(r1, r12, r2)
                java.lang.String r0 = r11.pattern
                if (r12 == 0) goto L6a
                int r12 = r0.length()
                int r7 = r12 + (-1)
                int r12 = r8.length()
                int r12 = r12 - r7
                int r0 = r8.length()
                int r5 = r0 - r7
                java.lang.String r9 = r11.pattern
                r6 = 1
                r10 = 0
                boolean r11 = defpackage.qx4.v(r5, r6, r7, r8, r9, r10)
                if (r11 == 0) goto L69
                int r12 = r12 - r4
                r11 = 4
                int r11 = defpackage.jx4.M(r8, r3, r12, r11)
                r12 = -1
                if (r11 != r12) goto L69
            L68:
                return r4
            L69:
                return r2
            L6a:
                boolean r11 = r8.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append('/');
            h00 h00Var = this.hash;
            h00 h00Var2 = h00.L;
            sb.append(h00Var.a());
            return sb.toString();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List check$lambda$0(CertificatePinner certificatePinner, List list, String str) {
        List<Certificate> clean;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (clean = certificateChainCleaner.clean(list, str)) != null) {
            list = clean;
        }
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        for (Certificate certificate : list) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final h00 sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final h00 sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        str.getClass();
        list.getClass();
        check$okhttp(str, new yj((Object) this, (Object) list, (Object) str, (byte) 2));
    }

    public final void check$okhttp(String str, rm1 rm1Var) {
        str.getClass();
        rm1Var.getClass();
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) rm1Var.invoke();
        for (X509Certificate x509Certificate : list) {
            h00 h00Var = null;
            h00 h00Var2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (j42.c(hashAlgorithm, "sha256")) {
                    if (h00Var == null) {
                        h00Var = Companion.sha256Hash(x509Certificate);
                    }
                    if (j42.c(pin.getHash(), h00Var)) {
                        return;
                    }
                } else {
                    if (!j42.c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (h00Var2 == null) {
                        h00Var2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (j42.c(pin.getHash(), h00Var2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return j42.c(certificatePinner.pins, this.pins) && j42.c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String str) {
        str.getClass();
        List list = o91.I;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                p70.w(list).add(obj);
            }
        }
        return list;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        certificateChainCleaner.getClass();
        return j42.c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final String pin(Certificate certificate) {
            certificate.getClass();
            if (!(certificate instanceof X509Certificate)) {
                s83.t("Certificate pinning requires X509 certificates");
                return null;
            }
            StringBuilder sb = new StringBuilder("sha256/");
            h00 sha256Hash = sha256Hash((X509Certificate) certificate);
            h00 h00Var = h00.L;
            sb.append(sha256Hash.a());
            return sb.toString();
        }

        public final h00 sha1Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            h00 h00Var = h00.L;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return jp.w(encoded).c("SHA-1");
        }

        public final h00 sha256Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            h00 h00Var = h00.L;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return jp.w(encoded).c("SHA-256");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, er0 er0Var) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    @su0
    public final void check(String str, Certificate... certificateArr) {
        str.getClass();
        certificateArr.getClass();
        check(str, dq.o1(certificateArr));
    }
}
