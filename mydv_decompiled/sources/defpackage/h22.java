package defpackage;

import androidx.media3.common.util.Log;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h22 extends e4 implements m32, RandomAccess, jt3 {
    public static final h22 L = new h22(new int[0], 0, false);
    public int[] J;
    public int K;

    public h22(int[] iArr, int i, boolean z) {
        super(z);
        this.J = iArr;
        this.K = i;
    }

    @Override // defpackage.n32
    public final n32 a(int i) {
        if (i >= this.K) {
            return new h22(Arrays.copyOf(this.J, i), this.K, true);
        }
        s83.d();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.K)) {
            zl1.e(this.K, hf1.C("Index:", i, ", Size:"));
            return;
        }
        int[] iArr = this.J;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.J, i, iArr2, i + 1, this.K - i);
            this.J = iArr2;
        }
        this.J[i] = intValue;
        this.K++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.e4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = p32.a;
        collection.getClass();
        if (!(collection instanceof h22)) {
            return super.addAll(collection);
        }
        h22 h22Var = (h22) collection;
        int i = h22Var.K;
        if (i == 0) {
            return false;
        }
        int i2 = this.K;
        if (Log.LOG_LEVEL_OFF - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.J;
        if (i3 > iArr.length) {
            iArr = Arrays.copyOf(iArr, i3);
            this.J = iArr;
        }
        System.arraycopy(h22Var.J, 0, iArr, this.K, h22Var.K);
        this.K = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        c();
        int i2 = this.K;
        int[] iArr = this.J;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.J = iArr2;
            iArr = iArr2;
        }
        int i3 = this.K;
        this.K = i3 + 1;
        iArr[i3] = i;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.K) {
            zl1.e(this.K, hf1.C("Index:", i, ", Size:"));
        }
    }

    @Override // defpackage.e4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h22)) {
            return super.equals(obj);
        }
        h22 h22Var = (h22) obj;
        if (this.K != h22Var.K) {
            return false;
        }
        int[] iArr = h22Var.J;
        for (int i = 0; i < this.K; i++) {
            if (this.J[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        e(i);
        return this.J[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(f(i));
    }

    @Override // defpackage.e4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.K; i2++) {
            i = (i * 31) + this.J[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.J[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.e4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        e(i);
        int[] iArr = this.J;
        int i2 = iArr[i];
        if (i < this.K - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.K--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            zy.o("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.J;
        System.arraycopy(iArr, i2, iArr, i, this.K - i2);
        this.K -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        e(i);
        int[] iArr = this.J;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
