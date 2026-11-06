package okhttp3.internal.tls;

import defpackage.j42;
import defpackage.jx4;
import defpackage.kb4;
import defpackage.nt3;
import defpackage.o70;
import defpackage.o91;
import defpackage.qx4;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal._HostnamesCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        o91 o91Var = o91.I;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return o91Var;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && j42.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return o91Var;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) kb4.g0(str));
    }

    private final boolean verifyHostname(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !qx4.y(str, ".", false) && !qx4.s(str, "..", false) && str2 != null && str2.length() != 0 && !qx4.y(str2, ".", false) && !qx4.s(str2, "..", false)) {
            if (!qx4.s(str, ".", false)) {
                str = str.concat(".");
            }
            if (!qx4.s(str2, ".", false)) {
                str2 = str2.concat(".");
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!jx4.D(asciiToLowercase, "*", false)) {
                return str.equals(asciiToLowercase);
            }
            if (qx4.y(asciiToLowercase, "*.", false) && jx4.I(asciiToLowercase, '*', 1, 4) == -1 && str.length() >= asciiToLowercase.length() && !"*.".equals(asciiToLowercase)) {
                String substring = asciiToLowercase.substring(1);
                if (qx4.s(str, substring, false) && ((length = str.length() - substring.length()) <= 0 || jx4.M(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
        if (canonicalHost == null) {
            return false;
        }
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (nt3.r(subjectAltNames) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (canonicalHost.equals(_HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        x509Certificate.getClass();
        return o70.f1(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        str.getClass();
        x509Certificate.getClass();
        return _HostnamesCommonKt.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (nt3.r(subjectAltNames) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
