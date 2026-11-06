package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vr5 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map X = sv2.X(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = X.values().iterator();
        while (it.hasNext()) {
            ((qr5) it.next()).m();
        }
    }

    public final String toString() {
        String c = s24.a(vr5.class).c();
        if (c == null) {
            c = "ViewModelStore";
        }
        int hashCode = hashCode();
        o7.k(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return c + "@" + num + "(keys=" + o70.u1(this.a.keySet()) + ")";
    }
}
