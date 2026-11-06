package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m60 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public m60(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            ji2 ji2Var = (ji2) entry.getValue();
            List list = (List) this.a.get(ji2Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(ji2Var, list);
            }
            list.add((n60) entry.getKey());
        }
    }

    public static void a(List list, vi2 vi2Var, ji2 ji2Var, ui2 ui2Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n60 n60Var = (n60) list.get(size);
                Method method = n60Var.b;
                try {
                    int i = n60Var.a;
                    if (i == 0) {
                        method.invoke(ui2Var, null);
                    } else if (i == 1) {
                        method.invoke(ui2Var, vi2Var);
                    } else if (i == 2) {
                        method.invoke(ui2Var, vi2Var, ji2Var);
                    }
                } catch (IllegalAccessException e) {
                    zl1.k(e);
                    return;
                } catch (InvocationTargetException e2) {
                    s83.p("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
