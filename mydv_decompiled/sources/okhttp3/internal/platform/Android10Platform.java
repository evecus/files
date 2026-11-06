package okhttp3.internal.platform;

import android.content.Context;
import android.net.ssl.EchConfigList;
import android.net.ssl.EchConfigMismatchException;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import defpackage.dq;
import defpackage.er0;
import defpackage.h00;
import defpackage.j0;
import defpackage.jp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.Android17SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Android10Platform extends Platform implements ContextAwarePlatform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;
    private Context applicationContext;
    private final List<SocketAdapter> socketAdapters;

    static {
        isSupported = Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        int i = 0;
        ArrayList b1 = dq.b1(new SocketAdapter[]{Android17SocketAdapter.Companion.buildIfSupported(), Android10SocketAdapter.Companion.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory())});
        ArrayList arrayList = new ArrayList();
        int size = b1.size();
        while (i < size) {
            Object obj = b1.get(i);
            i++;
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        AndroidCertificateChainCleaner buildIfSupported = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager);
        return buildIfSupported != null ? buildIfSupported : super.buildCertificateChainCleaner(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.buildTrustRootIndex(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list, h00 h00Var) {
        Object obj;
        sSLSocket.getClass();
        list.getClass();
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, str, list, h00Var);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public EchRetryPlan echRetryPlan(SSLException sSLException) {
        EchConfigMismatchException echConfigMismatchException;
        String publicHostname;
        byte[] bytes;
        sSLException.getClass();
        h00 h00Var = null;
        if (Build.VERSION.SDK_INT < 37 || !(sSLException instanceof EchConfigMismatchException) || (publicHostname = (echConfigMismatchException = (EchConfigMismatchException) sSLException).getPublicHostname()) == null) {
            return null;
        }
        EchRetryPlan.Companion companion = EchRetryPlan.Companion;
        EchConfigList retryConfigList = echConfigMismatchException.getRetryConfigList();
        if (retryConfigList != null && (bytes = retryConfigList.toBytes()) != null) {
            h00 h00Var2 = h00.L;
            h00Var = jp.w(bytes);
        }
        return companion.getOrNull(publicHostname, h00Var);
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        Object obj;
        sSLSocket.getClass();
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            return super.getStackTraceForCloseable(str);
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open(str);
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(String str, int i, Throwable th) {
        str.getClass();
        if (i == 5) {
            Log.w(AndroidPlatform.Companion.getTag(), str, th);
        } else {
            Log.i(AndroidPlatform.Companion.getTag(), str, th);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        str.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            super.logCloseableLeak(str, obj);
        } else {
            obj.getClass();
            j0.d(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext newSSLContext() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.newSSLContext();
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public void setApplicationContext(Context context) {
        this.applicationContext = context;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object obj;
        sSLSocketFactory.getClass();
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sSLSocketFactory);
        }
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean isSupported() {
            return Android10Platform.isSupported;
        }

        private Companion() {
        }
    }
}
