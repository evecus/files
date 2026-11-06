package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vp implements Set {
    public final /* synthetic */ yp I;

    public vp(yp ypVar) {
        this.I = ypVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.I.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        yp ypVar = this.I;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (ypVar.K == set.size()) {
                return ypVar.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        yp ypVar = this.I;
        int i = 0;
        for (int i2 = ypVar.K - 1; i2 >= 0; i2--) {
            Object e = ypVar.e(i2);
            i += e == null ? 0 : e.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new up(this.I, (byte) 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        yp ypVar = this.I;
        int c = ypVar.c(obj);
        if (c < 0) {
            return false;
        }
        ypVar.f(c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.I.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        yp ypVar = this.I;
        int i = ypVar.K;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(ypVar.e(i2))) {
                ypVar.f(i2);
            }
        }
        return i != ypVar.K;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.I.K;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        yp ypVar = this.I;
        int i = ypVar.K;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ypVar.e(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        yp ypVar = this.I;
        int i = ypVar.K;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ypVar.e(i2);
        }
        return objArr;
    }
}
