package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a53 implements List, y72 {
    public final b53 I;

    public a53(b53 b53Var) {
        this.I = b53Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.I.c(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        b53 b53Var = this.I;
        return b53Var.f(b53Var.K, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.I.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.I.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c53.a(i, this);
        return this.I.I[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.I.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.I.K == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b43(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b53 b53Var = this.I;
        Object[] objArr = b53Var.I;
        for (int i = b53Var.K - 1; i >= 0; i--) {
            if (j42.c(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new b43(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c53.a(i, this);
        return this.I.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        b53 b53Var = this.I;
        int i = b53Var.K;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b53Var.k(it.next());
        }
        return i != b53Var.K;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        b53 b53Var = this.I;
        int i = b53Var.K;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(b53Var.I[i2])) {
                b53Var.l(i2);
            }
        }
        return i != b53Var.K;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c53.a(i, this);
        Object[] objArr = this.I.I;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.I.K;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c53.b(this, i, i2);
        return new d43(this, i, i2, (byte) 1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j42.i0(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.I.b(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new b43(this, i, (byte) 1);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.I.f(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.I.k(obj);
    }
}
