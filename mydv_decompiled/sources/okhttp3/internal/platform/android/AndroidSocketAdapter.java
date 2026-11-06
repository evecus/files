package okhttp3.internal.platform.android;

import android.os.Build;
import defpackage.er0;
import defpackage.h00;
import defpackage.j42;
import defpackage.nt3;
import defpackage.qx4;
import defpackage.z50;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) {
        cls.getClass();
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list, h00 h00Var) {
        sSLSocket.getClass();
        list.getClass();
        if (matchesSocket(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.setHostname.invoke(sSLSocket, str);
                }
                this.setAlpnProtocols.invoke(sSLSocket, Platform.Companion.concatLengthPrefixed(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        if (!matchesSocket(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, z50.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && j42.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* synthetic */ boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        nt3.a(sSLSocketFactory);
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* synthetic */ X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        nt3.d(sSLSocketFactory);
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidSocketAdapter build(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            cls2.getClass();
            return new AndroidSocketAdapter(cls2);
        }

        public final DeferredSocketAdapter.Factory factory(final String str) {
            str.getClass();
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public SocketAdapter create(SSLSocket sSLSocket) {
                    AndroidSocketAdapter build;
                    sSLSocket.getClass();
                    build = AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
                    return build;
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(SSLSocket sSLSocket) {
                    sSLSocket.getClass();
                    return qx4.y(sSLSocket.getClass().getName(), str + '.', false);
                }
            };
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }

        private Companion() {
        }
    }
}
