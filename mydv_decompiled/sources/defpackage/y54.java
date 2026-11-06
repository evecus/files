package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y54 extends y2 implements RandomAccess {
    public final Object[] I;
    public final int J;
    public int K;
    public int L;

    public y54(int i, Object[] objArr) {
        this.I = objArr;
        if (i < 0) {
            s83.h(hf1.u(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.J = objArr.length;
            this.L = i;
        } else {
            s83.f(objArr.length, hf1.C("ring buffer filled size: ", i, " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // defpackage.w1
    public final int c() {
        return this.L;
    }

    public final void d(int i) {
        if (i < 0) {
            s83.h(hf1.u(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.L) {
            s83.f(this.L, hf1.C("n shouldn't be greater than the buffer size: n = ", i, ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.K;
            int i3 = this.J;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.I;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.K = i4;
            this.L -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.L;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.I[(this.K + i) % this.J];
    }

    @Override // defpackage.y2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x54(this);
    }

    @Override // defpackage.w1, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.L;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.L;
        int i3 = this.K;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.I;
            if (i5 >= i2 || i3 >= this.J) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.w1, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }
}
