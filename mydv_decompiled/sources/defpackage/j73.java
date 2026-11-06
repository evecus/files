package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class j73 {
    public final u83 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public j73(u83 u83Var, String str) {
        this.a = u83Var;
        this.b = str;
    }

    public i73 a() {
        i73 b = b();
        b.getClass();
        c8 c8Var = b.J;
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            n63 n63Var = (n63) entry.getValue();
            str.getClass();
            n63Var.getClass();
            c8Var.getClass();
            ((LinkedHashMap) c8Var.e).put(str, n63Var);
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f73 f73Var = (f73) obj;
            f73Var.getClass();
            c8Var.getClass();
            ArrayList N = sv2.N((LinkedHashMap) c8Var.e, new tf2(f73Var, (byte) 12));
            if (!N.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + f73Var.a + " can't be used to open destination " + ((i73) c8Var.c) + ".\nFollowing required arguments are missing: " + N).toString());
            }
            ((ArrayList) c8Var.d).add(f73Var);
        }
        Iterator it = this.e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            zl1.c();
            return null;
        }
        String str2 = this.b;
        if (str2 != null) {
            c8Var.getClass();
            if (jx4.L(str2)) {
                s83.t("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            ArrayList N2 = sv2.N((LinkedHashMap) c8Var.e, new i9(new f73(concat), (byte) 15));
            if (!N2.isEmpty()) {
                StringBuilder E = r7.E("Cannot set route \"", str2, "\" for destination ");
                E.append((i73) c8Var.c);
                E.append(". Following required arguments are missing: ");
                E.append(N2);
                throw new IllegalArgumentException(E.toString().toString());
            }
            c8Var.g = new u05(new eq(concat, (byte) 18));
            c8Var.b = concat.hashCode();
            c8Var.f = str2;
        }
        return b;
    }

    public i73 b() {
        return this.a.a();
    }
}
