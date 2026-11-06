package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mh2 implements t94 {
    public final void a(w94 w94Var) {
        if (!(w94Var instanceof wr5)) {
            s83.k(w94Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
            return;
        }
        LinkedHashMap linkedHashMap = ((wr5) w94Var).f().a;
        da g = w94Var.g();
        Iterator it = o70.u1(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            qr5 qr5Var = (qr5) linkedHashMap.get(it.next());
            if (qr5Var != null) {
                sp0.k(qr5Var, g, w94Var.k());
            }
        }
        if (o70.u1(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        g.v();
    }
}
