package okhttp3.internal.platform.android;

import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import defpackage.er0;
import defpackage.h00;
import defpackage.nt3;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Android17SocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion(null);

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list, h00 h00Var) {
        EchConfigList echConfigList;
        sSLSocket.getClass();
        list.getClass();
        SSLSockets.setUseSessionTickets(sSLSocket, true);
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
            if (str == null || h00Var == null) {
                return;
            }
            try {
                echConfigList = EchConfigList.fromBytes(h00Var.r());
            } catch (InvalidEchDataException unused) {
                echConfigList = null;
            }
            if (echConfigList != null) {
                SSLSockets.setEchConfigList(sSLSocket, echConfigList);
            }
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        return SSLSockets.isSupportedSocket(sSLSocket);
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

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final SocketAdapter buildIfSupported() {
            if (isSupported()) {
                return new Android17SocketAdapter();
            }
            return null;
        }

        public final boolean isSupported() {
            return Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 37;
        }

        private Companion() {
        }
    }
}
