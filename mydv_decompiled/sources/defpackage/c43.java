package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c43 implements List, y72 {
    public final e43 I;

    public c43(e43 e43Var) {
        this.I = e43Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        e43 e43Var = this.I;
        if (i < 0 || i > (i2 = e43Var.b)) {
            StringBuilder C = hf1.C("Index ", i, " must be in 0..");
            C.append(e43Var.b);
            dq2.J0(C.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = e43Var.a;
        if (objArr.length < i3) {
            e43Var.n(i3, objArr);
        }
        Object[] objArr2 = e43Var.a;
        int i4 = e43Var.b;
        if (i != i4) {
            dq.Q0(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        e43Var.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        e43 e43Var = this.I;
        if (i < 0 || i > e43Var.b) {
            StringBuilder C = hf1.C("Index ", i, " must be in 0..");
            C.append(e43Var.b);
            dq2.J0(C.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + e43Var.b;
        Object[] objArr = e43Var.a;
        if (objArr.length < size) {
            e43Var.n(size, objArr);
        }
        Object[] objArr2 = e43Var.a;
        if (i != e43Var.b) {
            dq.Q0(collection.size() + i, i, e43Var.b, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p70.A0();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        e43Var.b = collection.size() + e43Var.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.I.d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.e(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.I.e(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ed3.a(i, this);
        return this.I.g(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.I.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.I.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b43(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e43 e43Var = this.I;
        Object[] objArr = e43Var.a;
        int i = e43Var.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new b43(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ed3.a(i, this);
        return this.I.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        e43 e43Var = this.I;
        int i = e43Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e43Var.k(it.next());
        }
        return i != e43Var.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        e43 e43Var = this.I;
        int i = e43Var.b;
        Object[] objArr = e43Var.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                e43Var.l(i2);
            }
        }
        return i != e43Var.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ed3.a(i, this);
        return this.I.o(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.I.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        ed3.b(this, i, i2);
        return new d43(this, i, i2, (byte) 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return j42.i0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new b43(this, i, (byte) 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.I.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.I.a(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        e43 e43Var = this.I;
        int i = e43Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e43Var.a(it.next());
        }
        return i != e43Var.b;
    }
}
