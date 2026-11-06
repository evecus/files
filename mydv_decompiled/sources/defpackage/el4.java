package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class el4 {
    public static boolean a(String str) {
        List<String> X = jx4.X(str, new String[]{";"}, 6);
        if (!X.isEmpty()) {
            for (String str2 : X) {
                int I = jx4.I(str2, '=', 0, 6);
                if (I > 0) {
                    String obj = jx4.g0(str2.substring(0, I)).toString();
                    String obj2 = jx4.g0(str2.substring(I + 1)).toString();
                    if (j42.c(obj, "sessionid") || j42.c(obj, "sessionid_ss")) {
                        if (obj2.length() > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
