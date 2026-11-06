package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class iu4 {
    public final u50 a = t50.J;
    public final hu4 b;

    public iu4(hu4 hu4Var) {
        this.b = hu4Var;
    }

    public static iu4 a(String str) {
        sp0.p(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? new iu4(new ep((Object) new o50(str.charAt(0)), (byte) 24)) : new iu4(new ej1(str, (byte) 6));
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g = this.b.g(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            gu4 gu4Var = (gu4) g;
            if (!gu4Var.hasNext()) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add((String) gu4Var.next());
        }
    }
}
