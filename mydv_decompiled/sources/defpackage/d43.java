package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d43 implements List, y72 {
    public final /* synthetic */ byte I;
    public final List J;
    public final int K;
    public int L;

    public /* synthetic */ d43(List list, int i, int i2, byte b) {
        this.I = b;
        this.J = list;
        this.K = i;
        this.L = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.I;
        int i2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.L++;
                break;
            default:
                list.add(i + i2, obj);
                this.L++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.I;
        int i2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.L = collection.size() + this.L;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.L += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.I;
        List list = this.J;
        int i = this.K;
        switch (b) {
            case 0:
                int i2 = this.L - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.L = i;
                break;
            default:
                int i3 = this.L - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.L = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.I;
        List list = this.J;
        int i = this.K;
        switch (b) {
            case 0:
                int i2 = this.L;
                while (i < i2) {
                    if (j42.c(list.get(i), obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
                break;
            default:
                int i3 = this.L;
                while (i < i3) {
                    if (j42.c(list.get(i), obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.I) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.I;
        int i2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                ed3.a(i, this);
                break;
            default:
                c53.a(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.I;
        List list = this.J;
        int i = this.K;
        switch (b) {
            case 0:
                int i2 = this.L;
                for (int i3 = i; i3 < i2; i3++) {
                    if (j42.c(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.L;
                for (int i5 = i; i5 < i4; i5++) {
                    if (j42.c(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.I) {
            case 0:
                if (this.L == this.K) {
                }
                break;
            default:
                if (this.L == this.K) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.I) {
            case 0:
                return new b43(this, 0, (byte) 0);
            default:
                return new b43(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.I;
        List list = this.J;
        int i = this.K;
        switch (b) {
            case 0:
                int i2 = this.L - 1;
                if (i <= i2) {
                    while (!j42.c(list.get(i2), obj)) {
                        if (i2 == i) {
                            break;
                        } else {
                            i2--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i3 = this.L - 1;
                if (i <= i3) {
                    while (!j42.c(list.get(i3), obj)) {
                        if (i3 == i) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.I) {
            case 0:
                return new b43(this, 0, (byte) 0);
            default:
                return new b43(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.I;
        int i = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                int i2 = this.L;
                while (i < i2) {
                    if (j42.c(list.get(i), obj)) {
                        list.remove(i);
                        this.L--;
                        break;
                    } else {
                        i++;
                    }
                }
                break;
            default:
                int i3 = this.L;
                while (i < i3) {
                    if (j42.c(list.get(i), obj)) {
                        list.remove(i);
                        this.L--;
                        break;
                    } else {
                        i++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.I) {
            case 0:
                collection.getClass();
                int i = this.L;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.L) {
                    break;
                }
                break;
            default:
                int i2 = this.L;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.L) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.I;
        int i = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.L;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.L--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                if (i2 != this.L) {
                    break;
                }
                break;
            default:
                int i4 = this.L;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.L--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                if (i4 != this.L) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.I;
        int i2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                ed3.a(i, this);
                break;
            default:
                c53.a(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.I) {
            case 0:
                i = this.L;
                i2 = this.K;
                break;
            default:
                i = this.L;
                i2 = this.K;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.I) {
            case 0:
                ed3.b(this, i, i2);
                return new d43(this, i, i2, (byte) 0);
            default:
                c53.b(this, i, i2);
                return new d43(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.I) {
            case 0:
                objArr.getClass();
                break;
        }
        return j42.i0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.I) {
        }
        return j42.h0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.I) {
            case 0:
                return new b43(this, i, (byte) 0);
            default:
                return new b43(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                int i = this.L;
                this.L = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.L;
                this.L = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.L, collection);
                this.L = collection.size() + this.L;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.L, collection);
                int size = collection.size();
                this.L += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.I;
        int i2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                ed3.a(i, this);
                this.L--;
                return list.remove(i + i2);
            default:
                c53.a(i, this);
                this.L--;
                return list.remove(i + i2);
        }
    }
}
