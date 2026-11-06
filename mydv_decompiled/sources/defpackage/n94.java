package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n94 {
    public final LinkedHashMap a;
    public final ns b;

    public n94() {
        this.a = new LinkedHashMap();
        this.b = new ns(p91.I);
    }

    public final Object a(String str) {
        Object value;
        ns nsVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) nsVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) nsVar.d;
        try {
            w43 w43Var = (w43) linkedHashMap2.get(str);
            if (w43Var != null && (value = ((fw4) w43Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) nsVar.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final p04 b(String str, String str2) {
        ns nsVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) nsVar.d;
        boolean containsKey = linkedHashMap.containsKey(str);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) nsVar.a;
        if (containsKey) {
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, str2);
                }
                obj = o7.c(linkedHashMap2.get(str));
                linkedHashMap.put(str, obj);
            }
            return sv2.j((w43) obj);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) nsVar.c;
        Object obj2 = linkedHashMap3.get(str);
        if (obj2 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, str2);
            }
            obj2 = o7.c(linkedHashMap2.get(str));
            linkedHashMap3.put(str, obj2);
        }
        return sv2.j((w43) obj2);
    }

    public final void c(Object obj, String str) {
        if (obj != null) {
            ArrayList arrayList = p94.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            s83.j(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = p94.a;
        Object obj3 = this.a.get(str);
        u33 u33Var = obj3 instanceof u33 ? (u33) obj3 : null;
        if (u33Var != null) {
            u33Var.b(obj);
        }
        this.b.d(obj, str);
    }

    public n94(zu2 zu2Var) {
        this.a = new LinkedHashMap();
        this.b = new ns(zu2Var);
    }
}
