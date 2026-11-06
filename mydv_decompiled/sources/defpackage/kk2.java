package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kk2 extends x3 implements RandomAccess, Serializable {
    public Object[] I;
    public final int J;
    public int K;
    public final kk2 L;
    public final mk2 M;

    public kk2(Object[] objArr, int i, int i2, kk2 kk2Var, mk2 mk2Var) {
        int i3;
        objArr.getClass();
        this.I = objArr;
        this.J = i;
        this.K = i2;
        this.L = kk2Var;
        this.M = mk2Var;
        i3 = ((AbstractList) mk2Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        j();
        int i2 = this.K;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
        } else {
            h(this.J + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        j();
        int i2 = this.K;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        f(this.J + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.x3
    public final int c() {
        j();
        return this.K;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        j();
        n(this.J, this.K);
    }

    @Override // defpackage.x3
    public final Object d(int i) {
        l();
        j();
        int i2 = this.K;
        if (i >= 0 && i < i2) {
            return m(this.J + i);
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        j();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.I;
            int i = this.K;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (j42.c(objArr[this.J + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        mk2 mk2Var = this.M;
        kk2 kk2Var = this.L;
        if (kk2Var != null) {
            kk2Var.f(i, collection, i2);
        } else {
            mk2 mk2Var2 = mk2.L;
            mk2Var.f(i, collection, i2);
        }
        this.I = mk2Var.I;
        this.K += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        j();
        int i2 = this.K;
        if (i >= 0 && i < i2) {
            return this.I[this.J + i];
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        mk2 mk2Var = this.M;
        kk2 kk2Var = this.L;
        if (kk2Var != null) {
            kk2Var.h(i, obj);
        } else {
            mk2 mk2Var2 = mk2.L;
            mk2Var.h(i, obj);
        }
        this.I = mk2Var.I;
        this.K++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        j();
        Object[] objArr = this.I;
        int i = this.K;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.J + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        j();
        for (int i = 0; i < this.K; i++) {
            if (j42.c(this.I[this.J + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        j();
        return this.K == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        int i;
        i = ((AbstractList) this.M).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        y9.e();
    }

    public final void l() {
        if (this.M.K) {
            e1.a();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        j();
        for (int i = this.K - 1; i >= 0; i--) {
            if (j42.c(this.I[this.J + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        j();
        int i2 = this.K;
        if (i >= 0 && i <= i2) {
            return new it1(this, i);
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object m(int i) {
        Object m;
        ((AbstractList) this).modCount++;
        kk2 kk2Var = this.L;
        if (kk2Var != null) {
            m = kk2Var.m(i);
        } else {
            mk2 mk2Var = mk2.L;
            m = this.M.m(i);
        }
        this.K--;
        return m;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        kk2 kk2Var = this.L;
        if (kk2Var != null) {
            kk2Var.n(i, i2);
        } else {
            mk2 mk2Var = mk2.L;
            this.M.n(i, i2);
        }
        this.K -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int o;
        kk2 kk2Var = this.L;
        if (kk2Var != null) {
            o = kk2Var.o(i, i2, collection, z);
        } else {
            mk2 mk2Var = mk2.L;
            o = this.M.o(i, i2, collection, z);
        }
        if (o > 0) {
            ((AbstractList) this).modCount++;
        }
        this.K -= o;
        return o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        j();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        l();
        j();
        return o(this.J, this.K, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        j();
        return o(this.J, this.K, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        j();
        int i2 = this.K;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.I;
        int i3 = this.J;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p70.F(i, i2, this.K);
        return new kk2(this.I, this.J + i, i2 - i, this, this.M);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        j();
        int length = objArr.length;
        int i = this.K;
        Object[] objArr2 = this.I;
        int i2 = this.J;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        dq.Q0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.K;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        j();
        return vt0.Y(this.I, this.J, this.K, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        j();
        h(this.J + this.K, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        j();
        Object[] objArr = this.I;
        int i = this.K;
        int i2 = this.J;
        return dq.W0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        j();
        int size = collection.size();
        f(this.J + this.K, collection, size);
        return size > 0;
    }
}
