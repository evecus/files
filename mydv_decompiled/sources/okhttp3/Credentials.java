package okhttp3;

import defpackage.h00;
import defpackage.z50;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2, Charset charset) {
        str.getClass();
        str2.getClass();
        charset.getClass();
        byte[] bytes = (str + ':' + str2).getBytes(charset);
        bytes.getClass();
        return "Basic ".concat(new h00(bytes).a());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = z50.d;
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2) {
        str.getClass();
        str2.getClass();
        return basic$default(str, str2, null, 4, null);
    }
}
