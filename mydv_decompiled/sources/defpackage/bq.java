package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bq implements Collection, Set, x72, b82 {
    public int[] I;
    public Object[] J;
    public int K;

    public bq(int i) {
        this.I = o7.e;
        this.J = o7.g;
        if (i > 0) {
            this.I = new int[i];
            this.J = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int E;
        int i2 = this.K;
        if (obj == null) {
            E = o7.E(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            E = o7.E(this, obj, hashCode);
        }
        if (E >= 0) {
            return false;
        }
        int i3 = ~E;
        int[] iArr = this.I;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.J;
            int[] iArr2 = new int[i4];
            this.I = iArr2;
            this.J = new Object[i4];
            if (i2 != this.K) {
                y9.e();
                return false;
            }
            if (iArr2.length != 0) {
                dq.S0(0, iArr.length, 6, iArr, iArr2);
                dq.T0(0, objArr.length, 6, objArr, this.J);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.I;
            int i5 = i3 + 1;
            dq.O0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.J;
            dq.Q0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.K;
        if (i2 == i6) {
            int[] iArr4 = this.I;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.J[i3] = obj;
                this.K = i6 + 1;
                return true;
            }
        }
        y9.e();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.K;
        int i = this.K;
        int[] iArr = this.I;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.J;
            int[] iArr2 = new int[size];
            this.I = iArr2;
            this.J = new Object[size];
            if (i > 0) {
                dq.S0(0, i, 6, iArr, iArr2);
                dq.T0(0, this.K, 6, objArr, this.J);
            }
        }
        if (this.K != i) {
            y9.e();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object c(int i) {
        int i2 = this.K;
        Object[] objArr = this.J;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.I;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                dq.O0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.J;
                dq.Q0(i, i4, i2, objArr2, objArr2);
            }
            this.J[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.I = iArr2;
            this.J = new Object[i5];
            if (i > 0) {
                dq.S0(0, i, 6, iArr, iArr2);
                dq.T0(0, i, 6, objArr, this.J);
            }
            if (i < i3) {
                int i6 = i + 1;
                dq.O0(i, i6, i2, iArr, this.I);
                dq.Q0(i, i6, i2, objArr, this.J);
            }
        }
        if (i2 == this.K) {
            this.K = i3;
            return obj;
        }
        y9.e();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.K;
        if (i != 0) {
            this.I = o7.e;
            this.J = o7.g;
            i = 0;
            this.K = 0;
        }
        if (i == 0) {
            return;
        }
        y9.e();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? o7.E(this, null, 0) : o7.E(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.K != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.K;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.J[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.I;
        int i = this.K;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.K <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aq(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int E = obj == null ? o7.E(this, null, 0) : o7.E(this, obj, obj.hashCode());
        if (E < 0) {
            return false;
        }
        c(E);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.K - 1; -1 < i; i--) {
            if (!o70.O0(collection, this.J[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.K;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        Object[] F = d4.F(this.K, objArr);
        dq.Q0(0, 0, this.K, this.J, F);
        return F;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.K * 14);
        sb.append('{');
        int i = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.J[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return dq.W0(this.J, 0, this.K);
    }
}
