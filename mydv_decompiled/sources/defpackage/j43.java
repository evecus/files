package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j43 {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public j43(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    public final void a(bs3 bs3Var, Object obj) {
        if (this.b.get()) {
            zy.i("Do mutate preferences once returned to DataStore.");
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (!z) {
            linkedHashMap.put(bs3Var, obj);
            return;
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(o70.u1((Iterable) obj));
        unmodifiableSet.getClass();
        linkedHashMap.put(bs3Var, unmodifiableSet);
    }

    public final j43 b() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.a);
        unmodifiableMap.getClass();
        return new j43(new LinkedHashMap(unmodifiableMap), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j43)) {
            return false;
        }
        return j42.c(this.a, ((j43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o70.Z0(this.a.entrySet(), ",\n", "{\n", "\n}", 0, fh.S, 24);
    }

    public /* synthetic */ j43(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
