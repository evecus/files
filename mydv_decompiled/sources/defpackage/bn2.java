package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bn2 {
    public final HashMap a = new HashMap();
    public List b;
    public List c;
    public boolean d;
    public List e;

    public bn2() {
        o91 o91Var = o91.I;
        this.b = o91Var;
        this.c = o91Var;
        this.e = o91Var;
    }

    public static final boolean a(String str, List list, boolean z) {
        if (!z || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jx4.D(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
