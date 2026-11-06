package okhttp3.internal.ech;

import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EchUntrustedException extends SSLException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EchUntrustedException(String str, SSLException sSLException) {
        super(str, sSLException);
        str.getClass();
        sSLException.getClass();
    }
}
