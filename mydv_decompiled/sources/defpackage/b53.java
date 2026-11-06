package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b53 implements RandomAccess {
    public Object[] I;
    public a53 J;
    public int K = 0;

    public b53(Object[] objArr) {
        this.I = objArr;
    }

    public final void b(int i, Object obj) {
        int i2 = this.K + 1;
        if (this.I.length < i2) {
            n(i2);
        }
        Object[] objArr = this.I;
        int i3 = this.K;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.K++;
    }

    public final void c(Object obj) {
        int i = this.K + 1;
        if (this.I.length < i) {
            n(i);
        }
        Object[] objArr = this.I;
        int i2 = this.K;
        objArr[i2] = obj;
        this.K = i2 + 1;
    }

    public final void d(int i, b53 b53Var) {
        int i2 = b53Var.K;
        if (i2 == 0) {
            return;
        }
        int i3 = this.K + i2;
        if (this.I.length < i3) {
            n(i3);
        }
        Object[] objArr = this.I;
        int i4 = this.K;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(b53Var.I, 0, objArr, i, i2);
        this.K += i2;
    }

    public final void e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.K + size;
        if (this.I.length < i2) {
            n(i2);
        }
        Object[] objArr = this.I;
        int i3 = this.K;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.K += size;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.K + size;
        if (this.I.length < i3) {
            n(i3);
        }
        Object[] objArr = this.I;
        int i4 = this.K;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                p70.A0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.K += size;
        return true;
    }

    public final List g() {
        a53 a53Var = this.J;
        if (a53Var != null) {
            return a53Var;
        }
        a53 a53Var2 = new a53(this);
        this.J = a53Var2;
        return a53Var2;
    }

    public final void h() {
        Object[] objArr = this.I;
        int i = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.K = 0;
    }

    public final boolean i(Object obj) {
        int i = this.K - 1;
        if (i >= 0) {
            for (int i2 = 0; !j42.c(this.I[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.I;
        int i = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            if (j42.c(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int j = j(obj);
        if (j < 0) {
            return false;
        }
        l(j);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.I;
        Object obj = objArr[i];
        int i2 = this.K;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.K - 1;
        this.K = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.K;
            if (i2 < i3) {
                Object[] objArr = this.I;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.K;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.I[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.K = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.I;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.I = objArr2;
    }
}
