package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v83 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(u83 u83Var) {
        u83Var.getClass();
        String D = sv2.D(u83Var.getClass());
        if (D.length() <= 0) {
            s83.t("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        u83 u83Var2 = (u83) linkedHashMap.get(D);
        if (j42.c(u83Var2, u83Var)) {
            return;
        }
        if (u83Var2 != null && u83Var2.b) {
            s83.n("Navigator ", u83Var, " is replacing an already attached ", u83Var2);
        } else if (u83Var.b) {
            zy.g(u83Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final u83 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            s83.t("navigator name cannot be an empty string");
            return null;
        }
        u83 u83Var = (u83) this.a.get(str);
        if (u83Var != null) {
            return u83Var;
        }
        zy.i(r7.C("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
