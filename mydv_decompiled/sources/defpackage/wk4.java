package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class wk4 extends AbstractCollection implements Set {
    public final Collection I;
    public final mr3 J;

    public wk4(Collection collection, mr3 mr3Var) {
        this.I = collection;
        this.J = mr3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        sp0.o(this.J.apply(obj));
        return this.I.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sp0.o(this.J.apply(it.next()));
        }
        return this.I.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Collection collection = this.I;
        boolean z = collection instanceof RandomAccess;
        mr3 mr3Var = this.J;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (mr3Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!mr3Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        rt0.I(list, mr3Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        rt0.I(list, mr3Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Collection collection = this.I;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.J.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return kb4.o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return kb4.I(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.I.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (this.J.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.I.iterator();
        it.getClass();
        return new l52(it, this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.I.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.I.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.J.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.I.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.J.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.I.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.J.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            l52 l52Var = (l52) it;
            if (!l52Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(l52Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            l52 l52Var = (l52) it;
            if (l52Var.hasNext()) {
                arrayList.add(l52Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
