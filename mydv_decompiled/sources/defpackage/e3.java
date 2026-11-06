package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e3 extends yk4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AbstractMap J;

    public /* synthetic */ e3(AbstractMap abstractMap, byte b) {
        this.I = b;
        this.J = abstractMap;
    }

    public final boolean c(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map d = d();
        d.getClass();
        try {
            obj2 = d.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (jl2.z(obj2, entry.getValue())) {
            return obj2 != null || d().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.I) {
            case 0:
                Set entrySet = ((g3) this.J).K.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return c(obj);
        }
    }

    public final Map d() {
        byte b = this.I;
        AbstractMap abstractMap = this.J;
        switch (b) {
            case 0:
                return (g3) abstractMap;
            default:
                return (rv2) abstractMap;
        }
    }

    public final boolean e(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return d().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.I;
        AbstractMap abstractMap = this.J;
        switch (b) {
            case 0:
                return new f3((g3) abstractMap);
            default:
                return ((rv2) abstractMap).b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.I) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a3 a3Var = ((g3) this.J).L;
                Object key = entry.getKey();
                Map map = a3Var.M;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    a3Var.N -= size;
                }
                return true;
            default:
                return e(obj);
        }
    }

    @Override // defpackage.yk4, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // defpackage.yk4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(lq2.s(collection.size()));
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.d().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d().size();
    }
}
