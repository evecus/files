package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q42 extends AbstractList implements RandomAccess, Serializable {
    public final int[] I;
    public final int J;
    public final int K;

    public q42(int i, int i2, int[] iArr) {
        this.I = iArr;
        this.J = i;
        this.K = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.J;
        while (true) {
            if (i >= this.K) {
                i = -1;
                break;
            }
            if (this.I[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q42)) {
            return super.equals(obj);
        }
        q42 q42Var = (q42) obj;
        int size = size();
        if (q42Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.I[this.J + i] != q42Var.I[q42Var.J + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        sp0.u(i, size());
        return Integer.valueOf(this.I[this.J + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.J; i2 < this.K; i2++) {
            i = (i * 31) + this.I[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.J;
            int i2 = i;
            while (true) {
                if (i2 >= this.K) {
                    i2 = -1;
                    break;
                }
                if (this.I[i2] == intValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.K;
            while (true) {
                i2--;
                i = this.J;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.I[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        sp0.u(i, size());
        int i2 = this.J + i;
        int[] iArr = this.I;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K - this.J;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sp0.y(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.J;
        return new q42(i + i3, i3 + i2, this.I);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.I;
        int i = this.J;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.K) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
