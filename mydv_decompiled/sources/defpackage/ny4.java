package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ny4 implements List, y72 {
    public final gt4 I;
    public final int J;
    public int K;
    public int L;

    public ny4(gt4 gt4Var, int i, int i2) {
        this.I = gt4Var;
        this.J = i;
        this.K = j42.E(gt4Var);
        this.L = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i = this.J + this.L;
        gt4 gt4Var = this.I;
        gt4Var.add(i, obj);
        this.L++;
        this.K = j42.E(gt4Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        int i2 = i + this.J;
        gt4 gt4Var = this.I;
        boolean addAll = gt4Var.addAll(i2, collection);
        if (addAll) {
            this.L = collection.size() + this.L;
            this.K = j42.E(gt4Var);
        }
        return addAll;
    }

    public final void c() {
        if (j42.E(this.I) == this.K) {
            return;
        }
        y9.e();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.L > 0) {
            c();
            int i = this.L;
            int i2 = this.J;
            gt4 gt4Var = this.I;
            gt4Var.f(i2, i + i2);
            this.L = 0;
            this.K = j42.E(gt4Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        j42.n0(i, this.L);
        return this.I.get(this.J + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.L;
        int i2 = this.J;
        Iterator it = ut0.c0(i2, i + i2).iterator();
        while (((t22) it).K) {
            int nextInt = ((l22) it).nextInt();
            if (j42.c(obj, this.I.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.L == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.L;
        int i2 = this.J;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (j42.c(obj, this.I.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        p24 p24Var = new p24();
        p24Var.I = i - 1;
        return new my4(p24Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        int i2 = this.J + i;
        gt4 gt4Var = this.I;
        Object remove = gt4Var.remove(i2);
        this.L--;
        this.K = j42.E(gt4Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        a4 a4Var;
        ns4 h;
        boolean f;
        c();
        gt4 gt4Var = this.I;
        int i2 = this.J;
        int i3 = this.L + i2;
        int size = gt4Var.size();
        do {
            synchronized (j42.r) {
                hw4 hw4Var = gt4Var.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            rm3 h2 = a4Var.h();
            h2.subList(i2, i3).retainAll(collection);
            a4 e = h2.e();
            if (j42.c(e, a4Var)) {
                break;
            }
            hw4 hw4Var3 = gt4Var.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, gt4Var, h), i, e, true);
            }
            ws4.m(h, gt4Var);
        } while (!f);
        int size2 = size - gt4Var.size();
        if (size2 > 0) {
            this.K = j42.E(this.I);
            this.L -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        j42.n0(i, this.L);
        c();
        int i2 = i + this.J;
        gt4 gt4Var = this.I;
        Object obj2 = gt4Var.set(i2, obj);
        this.K = j42.E(gt4Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.L;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.L) {
            jr3.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i3 = this.J;
        return new ny4(this.I, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        int i2 = this.J + i;
        gt4 gt4Var = this.I;
        gt4Var.add(i2, obj);
        this.L++;
        this.K = j42.E(gt4Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.L, collection);
    }
}
