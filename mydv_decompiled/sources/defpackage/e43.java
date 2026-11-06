package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e43 {
    public Object[] a;
    public int b;
    public c43 c;

    public e43(int i) {
        this.a = i == 0 ? ed3.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(e43 e43Var) {
        e43Var.getClass();
        if (e43Var.i()) {
            return;
        }
        int i = this.b + e43Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        dq.Q0(this.b, 0, e43Var.b, e43Var.a, this.a);
        this.b += e43Var.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        dq.X0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean e(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e43) {
            e43 e43Var = (e43) obj;
            int i = e43Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = e43Var.a;
                u22 c0 = ut0.c0(0, i2);
                int i3 = c0.I;
                int i4 = c0.J;
                if (i3 > i4) {
                    return true;
                }
                while (j42.c(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f() {
        if (!i()) {
            return this.a[0];
        }
        dq2.K0("ObjectList is empty.");
        throw null;
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        p(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final boolean k(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return false;
        }
        l(h);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            dq.Q0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder D = hf1.D("Start (", i, ") and end (", i2, ") must be in 0..");
            D.append(this.b);
            dq2.J0(D.toString());
            throw null;
        }
        if (i2 < i) {
            dq2.H0("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                dq.Q0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            dq.X0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        dq.Q0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void p(int i) {
        StringBuilder C = hf1.C("Index ", i, " must be in 0..");
        C.append(this.b - 1);
        dq2.J0(C.toString());
        throw null;
    }

    public final String toString() {
        am0 am0Var = new am0(this, (byte) 3);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) am0Var.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ e43() {
        this(16);
    }
}
