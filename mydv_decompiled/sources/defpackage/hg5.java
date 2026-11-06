package defpackage;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hg5 extends eg5 {
    public static final Method i;

    static {
        Method method;
        try {
            method = String.class.getMethod("encodedLength", Charset.class);
        } catch (ReflectiveOperationException unused) {
            method = null;
        }
        i = method;
    }

    @Override // defpackage.eg5
    public final int m(String str) {
        try {
            return ((Integer) i.invoke(str, StandardCharsets.UTF_8)).intValue();
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
