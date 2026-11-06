package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lc1 {
    public static volatile lc1 a;
    public static final lc1 b;

    static {
        lc1 lc1Var = new lc1();
        Map map = Collections.EMPTY_MAP;
        b = lc1Var;
    }

    public static lc1 a() {
        lc1 lc1Var;
        sx3 sx3Var = sx3.c;
        lc1 lc1Var2 = a;
        if (lc1Var2 != null) {
            return lc1Var2;
        }
        synchronized (lc1.class) {
            try {
                lc1Var = a;
                if (lc1Var == null) {
                    Class cls = jc1.a;
                    lc1 lc1Var3 = null;
                    if (cls != null) {
                        try {
                            lc1Var3 = (lc1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    lc1Var = lc1Var3 != null ? lc1Var3 : b;
                    a = lc1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lc1Var;
    }
}
