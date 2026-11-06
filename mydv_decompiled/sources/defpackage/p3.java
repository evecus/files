package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class p3 extends AbstractCollection implements List {
    public final Object I;
    public Collection J;
    public final p3 K;
    public final Collection L;
    public final /* synthetic */ a3 M;
    public final /* synthetic */ a3 N;

    public p3(a3 a3Var, Object obj, List list, p3 p3Var) {
        this.N = a3Var;
        this.M = a3Var;
        this.I = obj;
        this.J = list;
        this.K = p3Var;
        this.L = p3Var == null ? null : p3Var.J;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        boolean isEmpty = this.J.isEmpty();
        boolean add = this.J.add(obj);
        if (add) {
            this.M.N++;
            if (isEmpty) {
                c();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.J).addAll(i, collection);
        if (addAll) {
            this.N.N += this.J.size() - size;
            if (size == 0) {
                c();
            }
        }
        return addAll;
    }

    public final void c() {
        p3 p3Var = this.K;
        if (p3Var != null) {
            p3Var.c();
        } else {
            this.M.M.put(this.I, this.J);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.J.clear();
        this.M.N -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        d();
        return this.J.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        d();
        return this.J.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        p3 p3Var = this.K;
        if (p3Var != null) {
            p3Var.d();
            if (p3Var.J == this.L) {
                return;
            }
            y9.e();
            return;
        }
        if (!this.J.isEmpty() || (collection = (Collection) this.M.M.get(this.I)) == null) {
            return;
        }
        this.J = collection;
    }

    public final void e() {
        p3 p3Var = this.K;
        if (p3Var != null) {
            p3Var.e();
        } else if (this.J.isEmpty()) {
            this.M.M.remove(this.I);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.J.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        d();
        return ((List) this.J).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        return this.J.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        return ((List) this.J).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d();
        return new f3(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.J).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        d();
        return new o3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        boolean remove = this.J.remove(obj);
        if (remove) {
            a3 a3Var = this.M;
            a3Var.N--;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.J.removeAll(collection);
        if (removeAll) {
            this.M.N += this.J.size() - size;
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.J.retainAll(collection);
        if (retainAll) {
            this.M.N += this.J.size() - size;
            e();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        d();
        return ((List) this.J).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        d();
        return this.J.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        d();
        List subList = ((List) this.J).subList(i, i2);
        p3 p3Var = this.K;
        if (p3Var == null) {
            p3Var = this;
        }
        boolean z = subList instanceof RandomAccess;
        a3 a3Var = this.N;
        Object obj = this.I;
        return z ? new l3(a3Var, obj, subList, p3Var) : new p3(a3Var, obj, subList, p3Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return this.J.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        d();
        return new o3(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        d();
        Object remove = ((List) this.J).remove(i);
        a3 a3Var = this.N;
        a3Var.N--;
        e();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        d();
        boolean isEmpty = this.J.isEmpty();
        ((List) this.J).add(i, obj);
        this.N.N++;
        if (isEmpty) {
            c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.J.addAll(collection);
        if (addAll) {
            this.M.N += this.J.size() - size;
            if (size == 0) {
                c();
            }
        }
        return addAll;
    }
}
