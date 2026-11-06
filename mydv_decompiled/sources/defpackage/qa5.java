package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qa5 {
    public final TreeMap a = new TreeMap();

    public final Map a() {
        return new rv2(this, this.a.values());
    }

    public final Map.Entry b(Long l) {
        Map.Entry floorEntry = this.a.floorEntry(new xm0(l, (byte) 2));
        if (floorEntry == null) {
            return null;
        }
        g04 g04Var = ((pa5) floorEntry.getValue()).I;
        g04Var.getClass();
        if (!g04Var.I.e(l) || g04Var.J.e(l)) {
            return null;
        }
        return (Map.Entry) floorEntry.getValue();
    }

    public final void c(g04 g04Var, Object obj) {
        xm0 xm0Var = g04Var.I;
        xm0 xm0Var2 = g04Var.J;
        boolean equals = xm0Var.equals(xm0Var2);
        xm0 xm0Var3 = g04Var.I;
        if (equals) {
            return;
        }
        obj.getClass();
        boolean equals2 = xm0Var3.equals(xm0Var2);
        TreeMap treeMap = this.a;
        if (!equals2) {
            Map.Entry lowerEntry = treeMap.lowerEntry(xm0Var3);
            if (lowerEntry != null) {
                g04 g04Var2 = ((pa5) lowerEntry.getValue()).I;
                xm0 xm0Var4 = g04Var2.J;
                xm0 xm0Var5 = g04Var2.J;
                if (xm0Var4.b(xm0Var3) > 0) {
                    if (xm0Var5.b(xm0Var2) > 0) {
                        d(xm0Var2, xm0Var5, ((pa5) lowerEntry.getValue()).J);
                    }
                    d(g04Var2.I, xm0Var3, ((pa5) lowerEntry.getValue()).J);
                }
            }
            Map.Entry lowerEntry2 = treeMap.lowerEntry(xm0Var2);
            if (lowerEntry2 != null) {
                pa5 pa5Var = (pa5) lowerEntry2.getValue();
                if (pa5Var.I.J.b(xm0Var2) > 0) {
                    d(xm0Var2, pa5Var.I.J, ((pa5) lowerEntry2.getValue()).J);
                }
            }
            treeMap.subMap(xm0Var3, xm0Var2).clear();
        }
        treeMap.put(xm0Var3, new pa5(g04Var, obj));
    }

    public final void d(xm0 xm0Var, xm0 xm0Var2, Object obj) {
        this.a.put(xm0Var, new pa5(new g04(xm0Var, xm0Var2), obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qa5)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((qa5) obj).a());
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
