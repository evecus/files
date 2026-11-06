package defpackage;

import android.view.autofill.AutofillManager;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b13 {
    public static /* bridge */ /* synthetic */ ExtendedSSLSession e(Object obj) {
        return (ExtendedSSLSession) obj;
    }

    public static /* bridge */ /* synthetic */ SNIHostName f(Object obj) {
        return (SNIHostName) obj;
    }

    public static /* bridge */ /* synthetic */ SNIServerName g(Object obj) {
        return (SNIServerName) obj;
    }

    public static /* synthetic */ void h(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void i(String str, int i, Object obj, Object obj2) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void j(String str, Exception exc) {
        throw new h0(str + ((Object) exc.toString()), exc, (byte) 3);
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof ExtendedSSLSession;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof SNIHostName;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return AutofillManager.class;
    }
}
