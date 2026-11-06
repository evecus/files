package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mc1 {
    public static volatile mc1 a;
    public static final mc1 b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        mc1 mc1Var = new mc1();
        Map map = Collections.EMPTY_MAP;
        b = mc1Var;
    }

    public static mc1 a() {
        mc1 mc1Var;
        mc1 mc1Var2 = a;
        if (mc1Var2 != null) {
            return mc1Var2;
        }
        synchronized (mc1.class) {
            try {
                mc1Var = a;
                if (mc1Var == null) {
                    Class cls = kc1.a;
                    if (cls != null) {
                        try {
                            mc1Var = (mc1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                        a = mc1Var;
                    }
                    mc1Var = b;
                    a = mc1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mc1Var;
    }
}
