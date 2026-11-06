package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q43 implements b82, Set, w72 {
    public final ja4 I;
    public final o43 J;

    public q43(o43 o43Var) {
        this.I = o43Var;
        this.J = o43Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.J.d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        o43 o43Var = this.J;
        int i = o43Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o43Var.k(it.next());
        }
        return i != o43Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.J.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.I.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q43.class != obj.getClass()) {
            return false;
        }
        return this.I.equals(((q43) obj).I);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.I.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h43(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.J.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        o43 o43Var = this.J;
        int i = o43Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o43Var.i(it.next());
        }
        return i != o43Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        o43 o43Var = this.J;
        Object[] objArr = o43Var.b;
        int i = o43Var.d;
        long[] jArr = o43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!o70.O0(collection, objArr[i5])) {
                                o43Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != o43Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.I.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return j42.i0(this, objArr);
    }

    public final String toString() {
        return this.I.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }
}
