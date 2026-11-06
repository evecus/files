package okhttp3.internal.tls;

import defpackage.er0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
            x509CertificateArr.getClass();
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }

        private Companion() {
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            x509TrustManager.getClass();
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }
    }
}
