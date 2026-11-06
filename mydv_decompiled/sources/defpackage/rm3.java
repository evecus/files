package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rm3 extends x3 implements Collection, x72 {
    public a4 I;
    public Object[] J;
    public Object[] K;
    public int L;
    public jp M = new jp((byte) 27);
    public Object[] N;
    public Object[] O;
    public int P;

    public rm3(a4 a4Var, Object[] objArr, Object[] objArr2, int i) {
        this.I = a4Var;
        this.J = objArr;
        this.K = objArr2;
        this.L = i;
        this.N = objArr;
        this.O = objArr2;
        this.P = a4Var.c();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(tm1 tm1Var, Object[] objArr, int i, int i2, o5 o5Var, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = o5Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) tm1Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        o5Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(tm1 tm1Var, Object[] objArr, int i, o5 o5Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) tm1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        o5Var.a = objArr2;
        return i2;
    }

    public final int C(tm1 tm1Var, int i, o5 o5Var) {
        int B = B(tm1Var, this.O, i, o5Var);
        Object obj = o5Var.a;
        if (B == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B, i, (Object) null);
        this.O = objArr;
        this.P -= i - B;
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (C(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(defpackage.tm1 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.J()
            o5 r5 = new o5
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.N
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.C(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            z2 r12 = r15.o(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.B(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.C(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.N
            int r2 = r15.P
            int r3 = r15.L
            r15.v(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.I
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.O
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.N
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.L
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.w(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            defpackage.jr3.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.L = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.L
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.L = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.t(r4, r3, r5)
        Lc8:
            r15.N = r9
            r15.O = r2
            int r14 = r14 + r1
            r15.P = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm3.D(tm1):boolean");
    }

    public final Object[] E(Object[] objArr, int i, int i2, o5 o5Var) {
        int l = ui4.l(i2, i);
        if (i == 0) {
            Object obj = objArr[l];
            Object[] p = p(objArr);
            dq.Q0(l, l + 1, 32, objArr, p);
            p[31] = o5Var.a;
            o5Var.a = obj;
            return p;
        }
        int l2 = objArr[31] == null ? ui4.l(G() - 1, i) : 31;
        Object[] p2 = p(objArr);
        int i3 = i - 5;
        int i4 = l + 1;
        if (i4 <= l2) {
            while (true) {
                Object obj2 = p2[l2];
                obj2.getClass();
                p2[l2] = E((Object[]) obj2, i3, 0, o5Var);
                if (l2 == i4) {
                    break;
                }
                l2--;
            }
        }
        Object obj3 = p2[l];
        obj3.getClass();
        p2[l] = E((Object[]) obj3, i3, i2, o5Var);
        return p2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.P - i;
        Object[] objArr2 = this.O;
        if (i4 == 1) {
            Object obj = objArr2[0];
            v(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] p = p(objArr2);
        dq.Q0(i3, i3 + 1, i4, objArr2, p);
        p[i4 - 1] = null;
        this.N = objArr;
        this.O = p;
        this.P = (i + i4) - 1;
        this.L = i2;
        return obj2;
    }

    public final int G() {
        int i = this.P;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, o5 o5Var) {
        int l = ui4.l(i2, i);
        Object[] p = p(objArr);
        if (i != 0) {
            Object obj2 = p[l];
            obj2.getClass();
            p[l] = H((Object[]) obj2, i - 5, i2, obj, o5Var);
            return p;
        }
        if (p != objArr) {
            ((AbstractList) this).modCount++;
        }
        o5Var.a = p[l];
        p[l] = obj;
        return p;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] r;
        if (i3 < 1) {
            jr3.a("requires at least one nullBuffer");
        }
        Object[] p = p(objArr);
        objArr2[0] = p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            dq.Q0(size + 1, i4, i2, p, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                r = p;
            } else {
                r = r();
                i3--;
                objArr2[i3] = r;
            }
            int i7 = i2 - i6;
            dq.Q0(0, i7, i2, p, objArr3);
            dq.Q0(size + 1, i4, i7, p, r);
            objArr3 = r;
        }
        Iterator it = collection.iterator();
        f(p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] r2 = r();
            f(r2, 0, it);
            objArr2[i8] = r2;
        }
        f(objArr3, 0, it);
    }

    public final int J() {
        int i = this.P;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        mu0.l(i, c());
        if (i == c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            m(i - G, obj, this.N);
            return;
        }
        o5 o5Var = new o5(null);
        Object[] objArr = this.N;
        objArr.getClass();
        m(0, o5Var.a, l(objArr, this.L, i, obj, o5Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] r;
        mu0.l(i, this.P);
        if (i == this.P) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.P - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.O;
            Object[] p = p(objArr);
            dq.Q0(size2 + 1, i3, J(), objArr, p);
            f(p, i3, collection.iterator());
            this.O = p;
            this.P = collection.size() + this.P;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int J = J();
        int size3 = collection.size() + this.P;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            r = r();
            collection2 = collection;
            I(collection2, i, this.O, J, objArr2, size, r);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.O;
            if (size3 > J) {
                int i4 = size3 - J;
                Object[] q = q(i4, objArr3);
                j(collection2, i, i4, objArr2, size, q);
                objArr2 = objArr2;
                r = q;
            } else {
                r = r();
                int i5 = J - size3;
                dq.Q0(0, i5, J, objArr3, r);
                int i6 = 32 - i5;
                Object[] q2 = q(i6, this.O);
                int i7 = size - 1;
                objArr2[i7] = q2;
                j(collection2, i, i6, objArr2, i7, q2);
                collection2 = collection2;
            }
        }
        this.N = x(this.N, i2, objArr2);
        this.O = r;
        this.P = collection2.size() + this.P;
        return true;
    }

    @Override // defpackage.x3
    public final int c() {
        return this.P;
    }

    @Override // defpackage.x3
    public final Object d(int i) {
        mu0.k(i, c());
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            return F(this.N, G, this.L, i - G);
        }
        o5 o5Var = new o5(this.O[0]);
        Object[] objArr = this.N;
        objArr.getClass();
        F(E(objArr, this.L, i, o5Var), G, this.L, 0);
        return o5Var.a;
    }

    public final a4 e() {
        a4 xr4Var;
        Object[] objArr = this.N;
        if (objArr == this.J && this.O == this.K) {
            xr4Var = this.I;
        } else {
            this.M = new jp((byte) 27);
            this.J = objArr;
            Object[] objArr2 = this.O;
            this.K = objArr2;
            xr4Var = objArr == null ? objArr2.length == 0 ? xr4.J : new xr4(Arrays.copyOf(objArr2, this.P)) : new qm3(objArr, objArr2, this.P, this.L);
        }
        this.I = xr4Var;
        return xr4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        mu0.k(i, c());
        if (G() <= i) {
            objArr = this.O;
        } else {
            Object[] objArr2 = this.N;
            objArr2.getClass();
            for (int i2 = this.L; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ui4.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.N == null) {
            zy.i("root is null");
            return;
        }
        int i4 = i >> 5;
        z2 o = o(G() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (o.I - 1 != i4) {
            Object[] objArr4 = (Object[]) o.previous();
            dq.Q0(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = q(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) o.previous();
        int G = i3 - (((G() >> 5) - 1) - i4);
        if (G < i3) {
            objArr2 = objArr[G];
            objArr2.getClass();
        }
        I(collection, i, objArr5, 32, objArr, G, objArr2);
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, o5 o5Var) {
        Object obj2;
        int l = ui4.l(i2, i);
        if (i == 0) {
            o5Var.a = objArr[31];
            Object[] p = p(objArr);
            dq.Q0(l + 1, l, 31, objArr, p);
            p[l] = obj;
            return p;
        }
        Object[] p2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = p2[l];
        obj3.getClass();
        p2[l] = l((Object[]) obj3, i3, i2, obj, o5Var);
        while (true) {
            l++;
            if (l >= 32 || (obj2 = p2[l]) == null) {
                break;
            }
            p2[l] = l((Object[]) obj2, i3, 0, o5Var.a, o5Var);
        }
        return p2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        mu0.l(i, this.P);
        return new tm3(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int J = J();
        Object[] p = p(this.O);
        Object[] objArr2 = this.O;
        if (J >= 32) {
            Object obj2 = objArr2[31];
            dq.Q0(i + 1, i, 31, objArr2, p);
            p[i] = obj;
            y(objArr, p, s(obj2));
            return;
        }
        dq.Q0(i + 1, i, J, objArr2, p);
        p[i] = obj;
        this.N = objArr;
        this.O = p;
        this.P++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.M;
    }

    public final z2 o(int i) {
        Object[] objArr = this.N;
        if (objArr == null) {
            zy.i("Invalid root");
            return null;
        }
        int G = G() >> 5;
        mu0.l(i, G);
        int i2 = this.L;
        return i2 == 0 ? new ip4(i, objArr) : new ra5(objArr, i, G, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] r = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        dq.T0(0, length, 6, objArr, r);
        return r;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            dq.Q0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] r = r();
        dq.Q0(i, 0, 32 - i, objArr, r);
        return r;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.M;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new z3(collection, (byte) 1));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.M;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        mu0.k(i, c());
        if (G() > i) {
            o5 o5Var = new o5(null);
            Object[] objArr = this.N;
            objArr.getClass();
            this.N = H(objArr, this.L, i, obj, o5Var);
            return o5Var.a;
        }
        Object[] p = p(this.O);
        if (p != this.O) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = p[i2];
        p[i2] = obj;
        this.O = p;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            jr3.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int l = ui4.l(i, i2);
        Object obj = objArr[l];
        obj.getClass();
        Object t = t((Object[]) obj, i, i2 - 5);
        if (l < 31) {
            int i3 = l + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] r = r();
                dq.Q0(0, 0, i3, objArr, r);
                objArr = r;
            }
        }
        if (t == objArr[l]) {
            return objArr;
        }
        Object[] p = p(objArr);
        p[l] = t;
        return p;
    }

    public final Object[] u(Object[] objArr, int i, int i2, o5 o5Var) {
        Object[] u;
        int l = ui4.l(i2 - 1, i);
        if (i == 5) {
            o5Var.a = objArr[l];
            u = null;
        } else {
            Object obj = objArr[l];
            obj.getClass();
            u = u((Object[]) obj, i - 5, i2, o5Var);
        }
        if (u == null && l == 0) {
            return null;
        }
        Object[] p = p(objArr);
        p[l] = u;
        return p;
    }

    public final void v(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.N = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.O = objArr;
            this.P = i;
            this.L = i2;
            return;
        }
        o5 o5Var = new o5(null);
        objArr.getClass();
        Object[] u = u(objArr, i2, i, o5Var);
        u.getClass();
        Object obj = o5Var.a;
        obj.getClass();
        this.O = (Object[]) obj;
        this.P = i;
        if (u[1] == null) {
            this.N = (Object[]) u[0];
            this.L = i2 - 5;
        } else {
            this.N = u;
            this.L = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            jr3.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            jr3.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] p = p(objArr);
        int l = ui4.l(i, i2);
        int i3 = i2 - 5;
        p[l] = w((Object[]) p[l], i, i3, it);
        while (true) {
            l++;
            if (l >= 32 || !it.hasNext()) {
                break;
            }
            p[l] = w((Object[]) p[l], 0, i3, it);
        }
        return p;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        v2 v2Var = new v2(objArr2, (byte) 1);
        int i2 = i >> 5;
        int i3 = this.L;
        Object[] w = i2 < (1 << i3) ? w(objArr, i, i3, v2Var) : p(objArr);
        while (v2Var.hasNext()) {
            this.L += 5;
            w = s(w);
            int i4 = this.L;
            w(w, 1 << i4, i4, v2Var);
        }
        return w;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.P;
        int i2 = i >> 5;
        int i3 = this.L;
        if (i2 > (1 << i3)) {
            this.N = z(this.L + 5, s(objArr), objArr2);
            this.O = objArr3;
            this.L += 5;
            this.P++;
            return;
        }
        if (objArr == null) {
            this.N = objArr2;
            this.O = objArr3;
            this.P = i + 1;
        } else {
            this.N = z(i3, objArr, objArr2);
            this.O = objArr3;
            this.P++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int l = ui4.l(c() - 1, i);
        Object[] p = p(objArr);
        if (i == 5) {
            p[l] = objArr2;
            return p;
        }
        p[l] = z(i - 5, (Object[]) p[l], objArr2);
        return p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int J = J();
        if (J < 32) {
            Object[] p = p(this.O);
            p[J] = obj;
            this.O = p;
            this.P = c() + 1;
        } else {
            y(this.N, this.O, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int J = J();
        Iterator it = collection.iterator();
        if (32 - J >= collection.size()) {
            Object[] p = p(this.O);
            f(p, J, it);
            this.O = p;
            this.P = collection.size() + this.P;
            return true;
        }
        int size = ((collection.size() + J) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] p2 = p(this.O);
        f(p2, J, it);
        objArr[0] = p2;
        for (int i = 1; i < size; i++) {
            Object[] r = r();
            f(r, 0, it);
            objArr[i] = r;
        }
        this.N = x(this.N, G(), objArr);
        Object[] r2 = r();
        f(r2, 0, it);
        this.O = r2;
        this.P = collection.size() + this.P;
        return true;
    }
}
