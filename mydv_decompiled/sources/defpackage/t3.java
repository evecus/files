package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class t3 extends AbstractCollection {
    public final /* synthetic */ byte I;
    public final Object J;

    public t3(AbstractMap abstractMap) {
        this.I = (byte) 2;
        this.J = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((v3) obj).clear();
                break;
            case 1:
                ((jb0) obj).clear();
                break;
            default:
                ((AbstractMap) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((v3) obj2).b().get(key);
                return collection != null && collection.contains(value);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.I) {
            case 2:
                return ((AbstractMap) this.J).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((v3) obj).h();
            case 1:
                jb0 jb0Var = (jb0) obj;
                Map c = jb0Var.c();
                return c != null ? c.values().iterator() : new gb0(jb0Var, (byte) 2);
            default:
                return new pv2(((AbstractMap) obj).entrySet().iterator(), (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((v3) obj2).remove(entry.getKey(), entry.getValue());
            case 1:
            default:
                return super.remove(obj);
            case 2:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (jl2.z(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.I) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.J;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.I) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.J;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((v3) obj).size();
            case 1:
                return ((jb0) obj).size();
            default:
                return ((AbstractMap) obj).size();
        }
    }

    public /* synthetic */ t3(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }
}
