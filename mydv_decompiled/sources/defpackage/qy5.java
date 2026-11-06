package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qy5 {
    public final a74 a;
    public final qu0 b = new qu0(6);

    public qy5(a74 a74Var) {
        this.a = a74Var;
    }

    public final void a(String str, LinkedHashSet linkedHashSet) {
        str.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            g4.V(this.a, false, true, new ap3((Object) this, (Object) new py5((String) it.next(), str), (byte) 25));
        }
    }
}
