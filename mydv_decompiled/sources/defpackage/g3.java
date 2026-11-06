package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class g3 extends AbstractMap {
    public transient e3 I;
    public transient t3 J;
    public final transient Map K;
    public final /* synthetic */ a3 L;

    public g3(a3 a3Var, Map map) {
        this.L = a3Var;
        this.K = map;
    }

    public final wx1 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        a3 a3Var = this.L;
        return new wx1(key, z ? new l3(a3Var, key, list, null) : new p3(a3Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a3 a3Var = this.L;
        if (this.K == a3Var.M) {
            a3Var.clear();
        } else {
            ut0.o(new f3(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.K;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e3 e3Var = this.I;
        if (e3Var != null) {
            return e3Var;
        }
        e3 e3Var2 = new e3(this, (byte) 0);
        this.I = e3Var2;
        return e3Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.K.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.K;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        a3 a3Var = this.L;
        return z ? new l3(a3Var, obj, list, null) : new p3(a3Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.K.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.L.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.K.remove(obj);
        if (collection == null) {
            return null;
        }
        a3 a3Var = this.L;
        Collection j = a3Var.j();
        j.addAll(collection);
        a3Var.N -= collection.size();
        collection.clear();
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.K.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.K.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        t3 t3Var = this.J;
        if (t3Var != null) {
            return t3Var;
        }
        t3 t3Var2 = new t3(this);
        this.J = t3Var2;
        return t3Var2;
    }
}
