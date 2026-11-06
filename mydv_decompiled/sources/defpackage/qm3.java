package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qm3 extends a4 {
    public final Object[] I;
    public final Object[] J;
    public final int K;
    public final int L;

    public qm3(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.I = objArr;
        this.J = objArr2;
        this.K = i;
        this.L = i2;
        if (!(c() > 32)) {
            jr3.a("Trie-based persistent vector should have at least 33 elements, got " + c());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj, o5 o5Var) {
        int l = ui4.l(i2, i);
        if (i == 0) {
            Object[] copyOf = l == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            dq.Q0(l + 1, l, 31, objArr, copyOf);
            o5Var.a = objArr[31];
            copyOf[l] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[l];
        obj2.getClass();
        copyOf2[l] = n((Object[]) obj2, i3, i2, obj, o5Var);
        while (true) {
            l++;
            if (l >= 32 || copyOf2[l] == null) {
                break;
            }
            Object obj3 = objArr[l];
            obj3.getClass();
            copyOf2[l] = n((Object[]) obj3, i3, 0, o5Var.a, o5Var);
        }
        return copyOf2;
    }

    public static Object[] p(Object[] objArr, int i, int i2, o5 o5Var) {
        Object[] p;
        int l = ui4.l(i2, i);
        if (i == 5) {
            o5Var.a = objArr[l];
            p = null;
        } else {
            Object obj = objArr[l];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, o5Var);
        }
        if (p == null && l == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[l] = p;
        return copyOf;
    }

    public static Object[] v(int i, int i2, Object obj, Object[] objArr) {
        int l = ui4.l(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[l] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[l];
        obj2.getClass();
        copyOf[l] = v(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.K;
    }

    @Override // defpackage.a4
    public final a4 d(int i, Object obj) {
        int i2 = this.K;
        mu0.l(i, i2);
        if (i == i2) {
            return e(obj);
        }
        int u = u();
        Object[] objArr = this.I;
        if (i >= u) {
            return o(i - u, obj, objArr);
        }
        o5 o5Var = new o5(null);
        return o(0, o5Var.a, n(objArr, this.L, i, obj, o5Var));
    }

    @Override // defpackage.a4
    public final a4 e(Object obj) {
        int u = u();
        int i = this.K;
        int i2 = i - u;
        Object[] objArr = this.I;
        Object[] objArr2 = this.J;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new qm3(objArr, copyOf, i + 1, this.L);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return q(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        mu0.k(i, c());
        if (u() <= i) {
            objArr = this.J;
        } else {
            Object[] objArr2 = this.I;
            for (int i2 = this.L; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ui4.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.a4
    public final rm3 h() {
        return new rm3(this, this.I, this.J, this.L);
    }

    @Override // defpackage.a4
    public final a4 j(z3 z3Var) {
        rm3 rm3Var = new rm3(this, this.I, this.J, this.L);
        rm3Var.D(z3Var);
        return rm3Var.e();
    }

    @Override // defpackage.a4
    public final a4 l(int i) {
        mu0.k(i, c());
        int u = u();
        int i2 = this.L;
        Object[] objArr = this.I;
        return i >= u ? t(objArr, u, i2, i - u) : t(s(objArr, i2, i, new o5(this.J[0])), u, i2, 0);
    }

    @Override // defpackage.y2, java.util.List
    public final ListIterator listIterator(int i) {
        mu0.l(i, this.K);
        return new sm3(i, this.K, (this.L / 5) + 1, this.I, this.J);
    }

    @Override // defpackage.a4
    public final a4 m(int i, Object obj) {
        int i2 = this.K;
        mu0.k(i, i2);
        int u = u();
        Object[] objArr = this.I;
        Object[] objArr2 = this.J;
        int i3 = this.L;
        if (u > i) {
            return new qm3(v(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new qm3(objArr, copyOf, i2, i3);
    }

    public final qm3 o(int i, Object obj, Object[] objArr) {
        int u = u();
        int i2 = this.K;
        int i3 = i2 - u;
        Object[] objArr2 = this.J;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            dq.Q0(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new qm3(objArr, copyOf, i2 + 1, this.L);
        }
        Object obj2 = objArr2[31];
        dq.Q0(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, copyOf, objArr3);
    }

    public final qm3 q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.K;
        int i2 = i >> 5;
        int i3 = this.L;
        if (i2 <= (1 << i3)) {
            return new qm3(r(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new qm3(r(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] r(int i, Object[] objArr, Object[] objArr2) {
        int l = ui4.l(c() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[l] = objArr2;
            return copyOf;
        }
        copyOf[l] = r(i - 5, (Object[]) copyOf[l], objArr2);
        return copyOf;
    }

    public final Object[] s(Object[] objArr, int i, int i2, o5 o5Var) {
        int l = ui4.l(i2, i);
        if (i == 0) {
            Object[] copyOf = l == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            dq.Q0(l, l + 1, 32, objArr, copyOf);
            copyOf[31] = o5Var.a;
            o5Var.a = objArr[l];
            return copyOf;
        }
        int l2 = objArr[31] == null ? ui4.l(u() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = l + 1;
        if (i4 <= l2) {
            while (true) {
                Object obj = copyOf2[l2];
                obj.getClass();
                copyOf2[l2] = s((Object[]) obj, i3, 0, o5Var);
                if (l2 == i4) {
                    break;
                }
                l2--;
            }
        }
        Object obj2 = copyOf2[l];
        obj2.getClass();
        copyOf2[l] = s((Object[]) obj2, i3, i2, o5Var);
        return copyOf2;
    }

    public final a4 t(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.K - i;
        if (i4 != 1) {
            Object[] objArr2 = this.J;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                dq.Q0(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new qm3(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new xr4(objArr);
        }
        o5 o5Var = new o5(null);
        Object[] p = p(objArr, i2, i - 1, o5Var);
        p.getClass();
        Object obj = o5Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (p[1] != null) {
            return new qm3(p, objArr3, i, i2);
        }
        Object obj2 = p[0];
        obj2.getClass();
        return new qm3((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int u() {
        return (this.K - 1) & (-32);
    }
}
