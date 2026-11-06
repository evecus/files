package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sy1 extends vx1 implements Set, j$.util.Set {
    public static final /* synthetic */ int K = 0;
    public transient dy1 J;

    public static int m(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            sp0.p(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static sy1 n(int i, Object... objArr) {
        if (i == 0) {
            return e34.R;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new dq4(obj);
        }
        int m = m(i);
        Object[] objArr2 = new Object[m];
        int i2 = m - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                zy.m(hf1.u(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int X = ut0.X(hashCode);
            while (true) {
                int i6 = X & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                X++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new dq4(obj4);
        }
        if (m(i4) < m / 2) {
            return n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new e34(i3, i2, i4, objArr, objArr2);
    }

    public static sy1 o(Collection collection) {
        if ((collection instanceof sy1) && !(collection instanceof SortedSet)) {
            sy1 sy1Var = (sy1) collection;
            if (!sy1Var.j()) {
                return sy1Var;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    @Override // defpackage.vx1
    public dy1 c() {
        dy1 dy1Var = this.J;
        if (dy1Var != null) {
            return dy1Var;
        }
        dy1 p = p();
        this.J = p;
        return p;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof sy1) && (this instanceof e34) && (((sy1) obj) instanceof e34) && ((e34) this).M != obj.hashCode()) {
            return false;
        }
        return kb4.o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return kb4.I(this);
    }

    public dy1 p() {
        Object[] array = toArray(vx1.I);
        ay1 ay1Var = dy1.J;
        return dy1.m(array.length, array);
    }
}
