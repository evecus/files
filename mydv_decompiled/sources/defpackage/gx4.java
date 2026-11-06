package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class gx4 {
    public static final Charset a = Charset.defaultCharset();
    public static final Charset b;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        b = charset;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charset2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset3 = b;
        if ((charset3 == null || !charset3.equals(a)) && charset2 != null) {
            charset2.equals(a);
        }
    }
}
