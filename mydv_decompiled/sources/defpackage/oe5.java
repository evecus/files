package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class oe5 {
    public static final ne5 a;
    public static final SSLContext b;

    static {
        ne5 ne5Var = new ne5();
        a = ne5Var;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new ne5[]{ne5Var}, new SecureRandom());
        b = sSLContext;
    }

    public static void a(OkHttpClient.Builder builder) {
        SSLSocketFactory socketFactory = b.getSocketFactory();
        socketFactory.getClass();
        builder.sslSocketFactory(socketFactory, a);
        builder.hostnameVerifier(new me5());
        builder.protocols(p70.j0(Protocol.HTTP_1_1));
    }
}
