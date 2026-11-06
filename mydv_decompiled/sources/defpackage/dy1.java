package defpackage;

import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class dy1 extends vx1 implements List, RandomAccess, j$.util.List {
    public static final ay1 J = new ay1(0, x24.M);

    public static x24 m(int i, Object[] objArr) {
        return i == 0 ? x24.M : new x24(i, objArr);
    }

    public static zx1 n() {
        return new zx1(4);
    }

    public static zx1 o(int i) {
        j42.l(i, "expectedSize");
        return new zx1(i);
    }

    public static dy1 p(Collection collection) {
        if (!(collection instanceof vx1)) {
            Object[] array = collection.toArray();
            ut0.k(array.length, array);
            return m(array.length, array);
        }
        dy1 c = ((vx1) collection).c();
        if (!c.j()) {
            return c;
        }
        Object[] array2 = c.toArray(vx1.I);
        return m(array2.length, array2);
    }

    public static x24 q(Object[] objArr) {
        if (objArr.length == 0) {
            return x24.M;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ut0.k(objArr2.length, objArr2);
        return m(objArr2.length, objArr2);
    }

    public static x24 s(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        ut0.k(5, objArr);
        return m(5, objArr);
    }

    public static x24 t(Object obj) {
        Object[] objArr = {obj};
        ut0.k(1, objArr);
        return m(1, objArr);
    }

    public static x24 u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ut0.k(2, objArr);
        return m(2, objArr);
    }

    public static x24 v(Comparator comparator, List list) {
        comparator.getClass();
        if (!r7.O(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        ut0.k(array.length, array);
        Arrays.sort(array, comparator);
        return m(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.vx1
    public int d(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && jl2.z(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (jl2.z(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.vx1
    public final ee5 l() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ay1 listIterator(int i) {
        sp0.x(i, size());
        return isEmpty() ? J : new ay1(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public dy1 subList(int i, int i2) {
        sp0.y(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? x24.M : new by1(this, i, i3);
    }

    @Override // defpackage.vx1
    public final dy1 c() {
        return this;
    }
}
