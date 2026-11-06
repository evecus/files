package okhttp3.internal.platform.android;

import defpackage.h00;
import defpackage.nt3;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private final Factory socketAdapterFactory;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        SocketAdapter create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        factory.getClass();
        this.socketAdapterFactory = factory;
    }

    private final synchronized SocketAdapter getDelegate(SSLSocket sSLSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket)) {
                this.delegate = this.socketAdapterFactory.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.delegate;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list, h00 h00Var) {
        sSLSocket.getClass();
        list.getClass();
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            delegate.configureTlsExtensions(sSLSocket, str, list, h00Var);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            return delegate.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* synthetic */ boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        nt3.a(sSLSocketFactory);
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* synthetic */ X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        nt3.d(sSLSocketFactory);
        return null;
    }
}
