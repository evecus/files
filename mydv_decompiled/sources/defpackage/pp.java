package defpackage;

import androidx.media3.common.util.Log;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pp extends x3 {
    public static final Object[] L = new Object[0];
    public int I;
    public Object[] J;
    public int K;

    public pp(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = L;
        } else {
            if (i <= 0) {
                s83.t(hf1.u(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.J = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.K;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        f(this.K + 1);
        int o = o(this.I + i);
        int i3 = this.K;
        if (i < ((i3 + 1) >> 1)) {
            int length = o == 0 ? this.J.length - 1 : o - 1;
            int i4 = this.I;
            int length2 = i4 == 0 ? this.J.length - 1 : i4 - 1;
            Object[] objArr = this.J;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                dq.Q0(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                dq.Q0(i4 - 1, i4, objArr.length, objArr, objArr);
                Object[] objArr2 = this.J;
                objArr2[objArr2.length - 1] = objArr2[0];
                dq.Q0(0, 1, length + 1, objArr2, objArr2);
            }
            this.J[length] = obj;
            this.I = length2;
        } else {
            int o2 = o(i3 + this.I);
            Object[] objArr3 = this.J;
            if (o < o2) {
                dq.Q0(o + 1, o, o2, objArr3, objArr3);
            } else {
                dq.Q0(1, 0, o2, objArr3, objArr3);
                Object[] objArr4 = this.J;
                objArr4[0] = objArr4[objArr4.length - 1];
                dq.Q0(o + 1, o, objArr4.length - 1, objArr4, objArr4);
            }
            this.J[o] = obj;
        }
        this.K++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.K;
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.K) {
            return addAll(collection);
        }
        p();
        f(collection.size() + this.K);
        int o = o(this.K + this.I);
        int o2 = o(this.I + i);
        int size = collection.size();
        if (i >= ((this.K + 1) >> 1)) {
            int i3 = o2 + size;
            Object[] objArr = this.J;
            if (o2 < o) {
                int i4 = size + o;
                if (i4 <= objArr.length) {
                    dq.Q0(i3, o2, o, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    dq.Q0(i3 - objArr.length, o2, o, objArr, objArr);
                } else {
                    int length = o - (i4 - objArr.length);
                    dq.Q0(0, length, o, objArr, objArr);
                    Object[] objArr2 = this.J;
                    dq.Q0(i3, o2, length, objArr2, objArr2);
                }
            } else {
                dq.Q0(size, 0, o, objArr, objArr);
                Object[] objArr3 = this.J;
                if (i3 >= objArr3.length) {
                    dq.Q0(i3 - objArr3.length, o2, objArr3.length, objArr3, objArr3);
                } else {
                    dq.Q0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.J;
                    dq.Q0(i3, o2, objArr4.length - size, objArr4, objArr4);
                }
            }
            e(o2, collection);
            return true;
        }
        int i5 = this.I;
        int i6 = i5 - size;
        Object[] objArr5 = this.J;
        if (o2 < i5) {
            dq.Q0(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.J;
            if (size >= o2) {
                dq.Q0(objArr6.length - size, 0, o2, objArr6, objArr6);
            } else {
                dq.Q0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.J;
                dq.Q0(0, size, o2, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            dq.Q0(i6, i5, o2, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = o2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                dq.Q0(i6, i5, o2, objArr5, objArr5);
            } else {
                dq.Q0(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.J;
                dq.Q0(0, this.I + length2, o2, objArr8, objArr8);
            }
        }
        this.I = i6;
        e(m(o2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        f(this.K + 1);
        int i = this.I;
        if (i == 0) {
            i = this.J.length;
        }
        int i2 = i - 1;
        this.I = i2;
        this.J[i2] = obj;
        this.K++;
    }

    public final void addLast(Object obj) {
        p();
        f(this.K + 1);
        this.J[o(this.K + this.I)] = obj;
        this.K++;
    }

    @Override // defpackage.x3
    public final int c() {
        return this.K;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.I, o(this.K + this.I));
        }
        this.I = 0;
        this.K = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.x3
    public final Object d(int i) {
        int i2 = this.K;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == c() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int o = o(this.I + i);
        Object[] objArr = this.J;
        Object obj = objArr[o];
        int i3 = this.K >> 1;
        int i4 = this.I;
        if (i < i3) {
            if (o >= i4) {
                dq.Q0(i4 + 1, i4, o, objArr, objArr);
            } else {
                dq.Q0(1, 0, o, objArr, objArr);
                Object[] objArr2 = this.J;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.I;
                dq.Q0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.J;
            int i6 = this.I;
            objArr3[i6] = null;
            this.I = j(i6);
        } else {
            int o2 = o((c() - 1) + i4);
            Object[] objArr4 = this.J;
            if (o <= o2) {
                dq.Q0(o, o + 1, o2 + 1, objArr4, objArr4);
            } else {
                dq.Q0(o, o + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.J;
                objArr5[objArr5.length - 1] = objArr5[0];
                dq.Q0(0, 1, o2 + 1, objArr5, objArr5);
            }
            this.J[o2] = null;
        }
        this.K--;
        return obj;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.J.length;
        while (i < length && it.hasNext()) {
            this.J[i] = it.next();
            i++;
        }
        int i2 = this.I;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.J[i3] = it.next();
        }
        this.K = collection.size() + this.K;
    }

    public final void f(int i) {
        if (i < 0) {
            zy.i("Deque is too big.");
            return;
        }
        Object[] objArr = this.J;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == L) {
            if (i < 10) {
                i = 10;
            }
            this.J = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        dq.Q0(0, this.I, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.J;
        int length2 = objArr3.length;
        int i3 = this.I;
        dq.Q0(length2 - i3, 0, i3, objArr3, objArr2);
        this.I = 0;
        this.J = objArr2;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.J[this.I];
        }
        s83.l("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.K;
        if (i >= 0 && i < i2) {
            return this.J[o(this.I + i)];
        }
        zy.o(r7.x(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.J[this.I];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int o = o(this.K + this.I);
        int i2 = this.I;
        if (i2 < o) {
            while (i2 < o) {
                if (j42.c(obj, this.J[i2])) {
                    i = this.I;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.I) < o) {
            return -1;
        }
        int length = this.J.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < o; i3++) {
                    if (j42.c(obj, this.J[i3])) {
                        i2 = i3 + this.J.length;
                        i = this.I;
                    }
                }
                return -1;
            }
            if (j42.c(obj, this.J[i2])) {
                i = this.I;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final int j(int i) {
        if (i == this.J.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.J[o((c() - 1) + this.I)];
    }

    public final Object last() {
        if (isEmpty()) {
            s83.l("ArrayDeque is empty.");
            return null;
        }
        return this.J[o((c() - 1) + this.I)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int o = o(this.K + this.I);
        int i2 = this.I;
        if (i2 < o) {
            length = o - 1;
            if (i2 <= length) {
                while (!j42.c(obj, this.J[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.I;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.I >= o) {
            while (true) {
                o--;
                Object[] objArr = this.J;
                if (-1 >= o) {
                    length = objArr.length - 1;
                    int i3 = this.I;
                    if (i3 <= length) {
                        while (!j42.c(obj, this.J[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.I;
                    }
                } else if (j42.c(obj, objArr[o])) {
                    length = o + this.J.length;
                    i = this.I;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.J.length : i;
    }

    public final void n(int i, int i2) {
        Object[] objArr = this.J;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.J, 0, i2, (Object) null);
        }
    }

    public final int o(int i) {
        Object[] objArr = this.J;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int o;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.J.length != 0) {
            int o2 = o(this.K + this.I);
            int i = this.I;
            if (i < o2) {
                o = i;
                while (true) {
                    objArr = this.J;
                    if (i >= o2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.J[o] = obj;
                        o++;
                    }
                    i++;
                }
                Arrays.fill(objArr, o, o2, (Object) null);
            } else {
                int length = this.J.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.J;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.J[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                o = o(i2);
                for (int i3 = 0; i3 < o2; i3++) {
                    Object[] objArr3 = this.J;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.J[o] = obj3;
                        o = j(o);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.K = m(o - this.I);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            s83.l("ArrayDeque is empty.");
            return null;
        }
        p();
        Object[] objArr = this.J;
        int i = this.I;
        Object obj = objArr[i];
        objArr[i] = null;
        this.I = j(i);
        this.K--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            s83.l("ArrayDeque is empty.");
            return null;
        }
        p();
        int o = o((c() - 1) + this.I);
        Object[] objArr = this.J;
        Object obj = objArr[o];
        objArr[o] = null;
        this.K--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        p70.F(i, i2, this.K);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.K) {
            clear();
            return;
        }
        if (i3 == 1) {
            d(i);
            return;
        }
        p();
        int i4 = this.K - i2;
        int i5 = this.I;
        int i6 = this.I;
        if (i < i4) {
            int o = o((i - 1) + i5);
            int o2 = o((i2 - 1) + i6);
            while (i > 0) {
                int i7 = o + 1;
                int min = Math.min(i, Math.min(i7, o2 + 1));
                Object[] objArr = this.J;
                int i8 = o2 - min;
                int i9 = o - min;
                dq.Q0(i8 + 1, i9 + 1, i7, objArr, objArr);
                o = m(i9);
                o2 = m(i8);
                i -= min;
            }
            int o3 = o(this.I + i3);
            n(this.I, o3);
            this.I = o3;
        } else {
            int o4 = o(i5 + i2);
            int o5 = o(i6 + i);
            int i10 = this.K;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.J;
                i2 = Math.min(i10, Math.min(objArr2.length - o4, objArr2.length - o5));
                Object[] objArr3 = this.J;
                int i11 = o4 + i2;
                dq.Q0(o5, o4, i11, objArr3, objArr3);
                o4 = o(i11);
                o5 = o(o5 + i2);
            }
            int o6 = o(this.K + this.I);
            n(m(o6 - i3), o6);
        }
        this.K -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int o;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.J.length != 0) {
            int o2 = o(this.K + this.I);
            int i = this.I;
            if (i < o2) {
                o = i;
                while (true) {
                    objArr = this.J;
                    if (i >= o2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.J[o] = obj;
                        o++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, o, o2, (Object) null);
            } else {
                int length = this.J.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.J;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.J[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                o = o(i2);
                for (int i3 = 0; i3 < o2; i3++) {
                    Object[] objArr3 = this.J;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.J[o] = obj3;
                        o = j(o);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.K = m(o - this.I);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.K;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        int o = o(this.I + i);
        Object[] objArr = this.J;
        Object obj2 = objArr[o];
        objArr[o] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.K;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int o = o(this.K + this.I);
        int i2 = this.I;
        if (i2 < o) {
            dq.T0(i2, o, 2, this.J, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.J;
            dq.Q0(0, this.I, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.J;
            dq.Q0(objArr3.length - this.I, 0, o, objArr3, objArr);
        }
        int i3 = this.K;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public pp() {
        this.J = L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        p();
        f(collection.size() + this.K);
        e(o(this.K + this.I), collection);
        return true;
    }
}
