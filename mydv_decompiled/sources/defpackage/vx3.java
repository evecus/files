package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vx3 extends f4 implements RandomAccess {
    public static final vx3 L;
    public Object[] J;
    public int K;

    static {
        vx3 vx3Var = new vx3(0, new Object[0]);
        L = vx3Var;
        vx3Var.I = false;
    }

    public vx3(int i, Object[] objArr) {
        this.J = objArr;
        this.K = i;
    }

    @Override // defpackage.o32
    public final o32 a(int i) {
        if (i >= this.K) {
            return new vx3(this.K, Arrays.copyOf(this.J, i));
        }
        s83.d();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.K)) {
            zl1.e(this.K, hf1.C("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.J;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.J, i, objArr2, i + 1, this.K - i);
            this.J = objArr2;
        }
        this.J[i] = obj;
        this.K++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.K) {
            zl1.e(this.K, hf1.C("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.J[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        d(i);
        Object[] objArr = this.J;
        Object obj = objArr[i];
        if (i < this.K - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.K--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        d(i);
        Object[] objArr = this.J;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }

    @Override // defpackage.f4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.K;
        Object[] objArr = this.J;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.J = objArr;
        }
        int i2 = this.K;
        this.K = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
