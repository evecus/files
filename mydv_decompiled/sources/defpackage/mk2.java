package defpackage;

import androidx.media3.common.util.Log;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mk2 extends x3 implements RandomAccess, Serializable {
    public static final mk2 L;
    public Object[] I;
    public int J;
    public boolean K;

    static {
        mk2 mk2Var = new mk2(0);
        mk2Var.K = true;
        L = mk2Var;
    }

    public mk2(int i) {
        if (i >= 0) {
            this.I = new Object[i];
        } else {
            s83.t("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        int i2 = this.J;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.I[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        j();
        int i2 = this.J;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        f(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.x3
    public final int c() {
        return this.J;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        n(0, this.J);
    }

    @Override // defpackage.x3
    public final Object d(int i) {
        j();
        int i2 = this.J;
        if (i >= 0 && i < i2) {
            return m(i);
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.I;
            int i = this.J;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (j42.c(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.I[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.J;
        if (i >= 0 && i < i2) {
            return this.I[i];
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.I[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.I;
        int i = this.J;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.J; i++) {
            if (j42.c(this.I[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.J == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.K) {
            e1.a();
        }
    }

    public final void l(int i, int i2) {
        int i3 = this.J + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.I;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
            }
            objArr = Arrays.copyOf(objArr, i4);
            this.I = objArr;
        }
        dq.Q0(i + i2, i, this.J, objArr, objArr);
        this.J += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.J - 1; i >= 0; i--) {
            if (j42.c(this.I[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.J;
        if (i >= 0 && i <= i2) {
            return new lk2(this, i);
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.I;
        Object obj = objArr[i];
        dq.Q0(i, i + 1, this.J, objArr, objArr);
        Object[] objArr2 = this.I;
        int i2 = this.J - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.J--;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.I;
        dq.Q0(i, i + i2, this.J, objArr, objArr);
        Object[] objArr2 = this.I;
        int i3 = this.J;
        vt0.U(objArr2, i3 - i2, i3);
        this.J -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.I;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.I;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        dq.Q0(i + i4, i2 + i, this.J, objArr, objArr);
        Object[] objArr3 = this.I;
        int i7 = this.J;
        vt0.U(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.J -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        j();
        return o(0, this.J, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        return o(0, this.J, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        int i2 = this.J;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.I;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p70.F(i, i2, this.J);
        return new kk2(this.I, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.J;
        Object[] objArr2 = this.I;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        dq.Q0(0, 0, i, objArr2, objArr);
        int i2 = this.J;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return vt0.Y(this.I, 0, this.J, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        int i = this.J;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.I[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return dq.W0(this.I, 0, this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        j();
        int size = collection.size();
        f(this.J, collection, size);
        return size > 0;
    }
}
