package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sa5 {
    public static final sa5 e = new sa5(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final jp c;
    public Object[] d;

    public sa5(int i, int i2, Object[] objArr, jp jpVar) {
        this.a = i;
        this.b = i2;
        this.c = jpVar;
        this.d = objArr;
    }

    public static sa5 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, jp jpVar) {
        if (i3 > 30) {
            return new sa5(0, 0, new Object[]{obj, obj2, obj3, obj4}, jpVar);
        }
        int k = oh4.k(i, i3);
        int k2 = oh4.k(i2, i3);
        if (k != k2) {
            return new sa5((1 << k) | (1 << k2), 0, k < k2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, jpVar);
        }
        return new sa5(0, 1 << k, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, jpVar)}, jpVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, jp jpVar) {
        Object obj3 = this.d[i];
        sa5 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, jpVar);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        dq.T0(0, i, 6, objArr, objArr2);
        dq.Q0(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = j;
        dq.Q0(t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        s22 Z = ut0.Z(ut0.c0(0, this.d.length), 2);
        int i = Z.I;
        int i2 = Z.J;
        int i3 = Z.K;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!j42.c(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int k = 1 << oh4.k(i, i2);
        if (h(k)) {
            return j42.c(obj, this.d[f(k)]);
        }
        if (!i(k)) {
            return false;
        }
        sa5 s = s(t(k));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(sa5 sa5Var) {
        if (this == sa5Var) {
            return true;
        }
        if (this.b == sa5Var.b && this.a == sa5Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == sa5Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int k = 1 << oh4.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (j42.c(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(k)) {
            return null;
        }
        sa5 s = s(t(k));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        s22 Z = ut0.Z(ut0.c0(0, s.d.length), 2);
        int i3 = Z.I;
        int i4 = Z.J;
        int i5 = Z.K;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!j42.c(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final sa5 k(int i, dm3 dm3Var) {
        dm3Var.b(dm3Var.N - 1);
        dm3Var.L = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != dm3Var.J) {
            return new sa5(0, 0, oh4.q(i, objArr), dm3Var.J);
        }
        this.d = oh4.q(i, objArr);
        return this;
    }

    public final sa5 l(int i, Object obj, Object obj2, int i2, dm3 dm3Var) {
        dm3 dm3Var2;
        sa5 l;
        int k = 1 << oh4.k(i, i2);
        boolean h = h(k);
        jp jpVar = this.c;
        if (h) {
            int f = f(k);
            if (!j42.c(obj, this.d[f])) {
                dm3Var.b(dm3Var.N + 1);
                jp jpVar2 = dm3Var.J;
                if (jpVar != jpVar2) {
                    return new sa5(this.a ^ k, this.b | k, a(f, k, i, obj, obj2, i2, jpVar2), jpVar2);
                }
                this.d = a(f, k, i, obj, obj2, i2, jpVar2);
                this.a ^= k;
                this.b |= k;
                return this;
            }
            dm3Var.L = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (jpVar == dm3Var.J) {
                this.d[f + 1] = obj2;
                return this;
            }
            dm3Var.M++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new sa5(this.a, this.b, copyOf, dm3Var.J);
        }
        if (!i(k)) {
            dm3Var.b(dm3Var.N + 1);
            jp jpVar3 = dm3Var.J;
            int f2 = f(k);
            Object[] objArr2 = this.d;
            if (jpVar != jpVar3) {
                return new sa5(this.a | k, this.b, oh4.l(objArr2, f2, obj, obj2), jpVar3);
            }
            this.d = oh4.l(objArr2, f2, obj, obj2);
            this.a |= k;
            return this;
        }
        int t = t(k);
        sa5 s = s(t);
        if (i2 == 30) {
            s22 Z = ut0.Z(ut0.c0(0, s.d.length), 2);
            int i3 = Z.I;
            int i4 = Z.J;
            int i5 = Z.K;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!j42.c(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                dm3Var.L = s.x(i3);
                if (s.c == dm3Var.J) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    dm3Var.M++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new sa5(0, 0, copyOf2, dm3Var.J);
                }
                dm3Var2 = dm3Var;
            }
            dm3Var.b(dm3Var.N + 1);
            l = new sa5(0, 0, oh4.l(s.d, 0, obj, obj2), dm3Var.J);
            dm3Var2 = dm3Var;
        } else {
            dm3Var2 = dm3Var;
            l = s.l(i, obj, obj2, i2 + 5, dm3Var2);
        }
        return s == l ? this : r(t, l, dm3Var2.J);
    }

    public final sa5 m(sa5 sa5Var, int i, hu0 hu0Var, dm3 dm3Var) {
        Object[] objArr;
        sa5 j;
        if (this == sa5Var) {
            hu0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            jp jpVar = dm3Var.J;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + sa5Var.d.length);
            int length = this.d.length;
            s22 Z = ut0.Z(ut0.c0(0, sa5Var.d.length), 2);
            int i3 = Z.I;
            int i4 = Z.J;
            int i5 = Z.K;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(sa5Var.d[i3])) {
                        hu0Var.a++;
                    } else {
                        Object[] objArr3 = sa5Var.d;
                        copyOf[length] = objArr3[i3];
                        copyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != sa5Var.d.length) {
                    return length == copyOf.length ? new sa5(0, 0, copyOf, jpVar) : new sa5(0, 0, Arrays.copyOf(copyOf, length), jpVar);
                }
            }
            return this;
        }
        int i6 = this.b | sa5Var.b;
        int i7 = this.a;
        int i8 = sa5Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            if (j42.c(this.d[f(lowestOneBit)], sa5Var.d[sa5Var.f(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i6 |= lowestOneBit;
            }
            i10 ^= lowestOneBit;
        }
        if ((i6 & i11) != 0) {
            jr3.b("Check failed.");
        }
        sa5 sa5Var2 = (j42.c(this.c, dm3Var.J) && this.a == i11 && this.b == i6) ? this : new sa5(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = sa5Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(lowestOneBit2)) {
                j = s(t(lowestOneBit2));
                if (sa5Var.i(lowestOneBit2)) {
                    j = j.m(sa5Var.s(sa5Var.t(lowestOneBit2)), i + 5, hu0Var, dm3Var);
                    objArr = objArr4;
                } else if (sa5Var.h(lowestOneBit2)) {
                    int f = sa5Var.f(lowestOneBit2);
                    Object obj = sa5Var.d[f];
                    Object x = sa5Var.x(f);
                    int i14 = dm3Var.N;
                    objArr = objArr4;
                    j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, dm3Var);
                    if (dm3Var.N == i14) {
                        hu0Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (sa5Var.i(lowestOneBit2)) {
                    sa5 s = sa5Var.s(sa5Var.t(lowestOneBit2));
                    if (h(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        int i15 = i + 5;
                        if (s.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            hu0Var.a++;
                        } else {
                            j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i15, dm3Var);
                        }
                    }
                    j = s;
                } else {
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    Object x2 = x(f3);
                    int f4 = sa5Var.f(lowestOneBit2);
                    Object obj4 = sa5Var.d[f4];
                    j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, sa5Var.x(f4), i + 5, dm3Var.J);
                }
            }
            objArr[length2] = j;
            i13++;
            i12 ^= lowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (sa5Var.h(lowestOneBit3)) {
                int f5 = sa5Var.f(lowestOneBit3);
                Object[] objArr5 = sa5Var2.d;
                objArr5[i17] = sa5Var.d[f5];
                objArr5[i17 + 1] = sa5Var.x(f5);
                if (h(lowestOneBit3)) {
                    hu0Var.a++;
                }
            } else {
                int f6 = f(lowestOneBit3);
                Object[] objArr6 = sa5Var2.d;
                objArr6[i17] = this.d[f6];
                objArr6[i17 + 1] = x(f6);
            }
            i16++;
            i11 ^= lowestOneBit3;
        }
        if (!e(sa5Var2)) {
            return sa5Var.e(sa5Var2) ? sa5Var : sa5Var2;
        }
        return this;
    }

    public final sa5 n(int i, Object obj, int i2, dm3 dm3Var) {
        sa5 n;
        int k = 1 << oh4.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (j42.c(obj, this.d[f])) {
                return p(f, k, dm3Var);
            }
        } else if (i(k)) {
            int t = t(k);
            sa5 s = s(t);
            if (i2 == 30) {
                s22 Z = ut0.Z(ut0.c0(0, s.d.length), 2);
                int i3 = Z.I;
                int i4 = Z.J;
                int i5 = Z.K;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!j42.c(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, dm3Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, dm3Var);
            return q(s, n, t, k, dm3Var.J);
        }
        return this;
    }

    public final sa5 o(int i, Object obj, Object obj2, int i2, dm3 dm3Var) {
        dm3 dm3Var2;
        sa5 o;
        int k = 1 << oh4.k(i, i2);
        if (h(k)) {
            int f = f(k);
            return (j42.c(obj, this.d[f]) && j42.c(obj2, x(f))) ? p(f, k, dm3Var) : this;
        }
        if (!i(k)) {
            return this;
        }
        int t = t(k);
        sa5 s = s(t);
        if (i2 == 30) {
            s22 Z = ut0.Z(ut0.c0(0, s.d.length), 2);
            int i3 = Z.I;
            int i4 = Z.J;
            int i5 = Z.K;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!j42.c(obj, s.d[i3]) || !j42.c(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, dm3Var);
                        break;
                    }
                }
                dm3Var2 = dm3Var;
            }
            o = s;
            dm3Var2 = dm3Var;
        } else {
            dm3Var2 = dm3Var;
            o = s.o(i, obj, obj2, i2 + 5, dm3Var2);
        }
        return q(s, o, t, k, dm3Var2.J);
    }

    public final sa5 p(int i, int i2, dm3 dm3Var) {
        dm3Var.b(dm3Var.N - 1);
        dm3Var.L = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != dm3Var.J) {
            return new sa5(i2 ^ this.a, this.b, oh4.q(i, objArr), dm3Var.J);
        }
        this.d = oh4.q(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final sa5 q(sa5 sa5Var, sa5 sa5Var2, int i, int i2, jp jpVar) {
        jp jpVar2 = this.c;
        if (sa5Var2 != null) {
            return (jpVar2 == jpVar || sa5Var != sa5Var2) ? r(i, sa5Var2, jpVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (jpVar2 != jpVar) {
            return new sa5(this.a, this.b ^ i2, oh4.r(i, objArr), jpVar);
        }
        this.d = oh4.r(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final sa5 r(int i, sa5 sa5Var, jp jpVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && sa5Var.d.length == 2 && sa5Var.b == 0) {
            sa5Var.a = this.b;
            return sa5Var;
        }
        if (this.c == jpVar) {
            objArr[i] = sa5Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = sa5Var;
        return new sa5(this.a, this.b, copyOf, jpVar);
    }

    public final sa5 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (sa5) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.J = w(r11, r4, (defpackage.sa5) r13.J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ac4 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa5.u(int, int, java.lang.Object, java.lang.Object):ac4");
    }

    public final sa5 v(int i, int i2, Object obj) {
        sa5 v;
        int k = 1 << oh4.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (!j42.c(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new sa5(this.a ^ k, this.b, oh4.q(f, objArr), null);
            }
        } else {
            if (!i(k)) {
                return this;
            }
            int t = t(k);
            sa5 s = s(t);
            if (i2 == 30) {
                s22 Z = ut0.Z(ut0.c0(0, s.d.length), 2);
                int i3 = Z.I;
                int i4 = Z.J;
                int i5 = Z.K;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!j42.c(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new sa5(0, 0, oh4.q(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, k, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new sa5(this.a, this.b ^ k, oh4.r(t, objArr3), null);
            }
        }
        return null;
    }

    public final sa5 w(int i, int i2, sa5 sa5Var) {
        Object[] objArr = sa5Var.d;
        if (objArr.length != 2 || sa5Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = sa5Var;
            return new sa5(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            sa5Var.a = this.b;
            return sa5Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        dq.Q0(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        dq.Q0(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new sa5(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
