package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dp0 {
    public static final dp0 b;
    public final HashMap a;

    static {
        dp0 dp0Var = new dp0(new LinkedHashMap());
        c5.j0(dp0Var);
        b = dp0Var;
    }

    public dp0(dp0 dp0Var) {
        dp0Var.getClass();
        this.a = new HashMap(dp0Var.a);
    }

    public final String a(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && dp0.class.equals(obj.getClass())) {
                HashMap hashMap = ((dp0) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (j42.c(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = dq.N0(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return hf1.z(new StringBuilder("Data {"), o70.Z0(this.a.entrySet(), null, null, null, 0, new m90((byte) 7), 31), "}");
    }

    public dp0(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
