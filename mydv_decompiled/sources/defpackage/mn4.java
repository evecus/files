package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class mn4 extends s4 implements r43, zf1, un1 {
    public final int M;
    public final int N;
    public final ez O;
    public Object[] P;
    public long Q;
    public long R;
    public int S;
    public int T;

    public mn4(int i, int i2, ez ezVar) {
        this.M = i;
        this.N = i2;
        this.O = ezVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [s4] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [mn4] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ag1] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [t4] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [nn4] */
    /* JADX WARN: Type inference failed for: r9v8, types: [nn4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.mn4 r8, defpackage.ag1 r9, defpackage.fj0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ln4
            if (r0 == 0) goto L13
            r0 = r10
            ln4 r0 = (defpackage.ln4) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            ln4 r0 = new ln4
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.M
            int r1 = r0.O
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            v52 r8 = r0.L
            nn4 r9 = r0.K
            ag1 r1 = r0.J
            mn4 r4 = r0.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return
        L3f:
            v52 r8 = r0.L
            nn4 r9 = r0.K
            ag1 r1 = r0.J
            mn4 r4 = r0.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            nn4 r9 = r0.K
            ag1 r8 = r0.J
            mn4 r1 = r0.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            defpackage.mu0.V(r10)
            t4 r10 = r8.c()
            nn4 r10 = (defpackage.nn4) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            tk0 r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            q8 r4 = defpackage.q8.r0     // Catch: java.lang.Throwable -> Laf
            rk0 r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Laf
            v52 r1 = (defpackage.v52) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.r(r9)     // Catch: java.lang.Throwable -> L36
            ep r5 = defpackage.o7.s     // Catch: java.lang.Throwable -> L36
            el0 r6 = defpackage.el0.I
            if (r10 != r5) goto L90
            r0.I = r4     // Catch: java.lang.Throwable -> L36
            r0.J = r1     // Catch: java.lang.Throwable -> L36
            r0.K = r9     // Catch: java.lang.Throwable -> L36
            r0.L = r8     // Catch: java.lang.Throwable -> L36
            r0.O = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.isActive()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.t()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.I = r4     // Catch: java.lang.Throwable -> L36
            r0.J = r1     // Catch: java.lang.Throwable -> L36
            r0.K = r9     // Catch: java.lang.Throwable -> L36
            r0.L = r8     // Catch: java.lang.Throwable -> L36
            r0.O = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn4.j(mn4, ag1, fj0):void");
    }

    @Override // defpackage.un1
    public final zf1 a(tk0 tk0Var, int i, ez ezVar) {
        return o7.w(this, tk0Var, i, ezVar);
    }

    @Override // defpackage.r43
    public final boolean b(Object obj) {
        int i;
        boolean z;
        fj0[] fj0VarArr = i42.a;
        synchronized (this) {
            if (p(obj)) {
                fj0VarArr = m(fj0VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (fj0 fj0Var : fj0VarArr) {
            if (fj0Var != null) {
                fj0Var.resumeWith(wd5.a);
            }
        }
        return z;
    }

    @Override // defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        j(this, ag1Var, fj0Var);
        return el0.I;
    }

    @Override // defpackage.s4
    public final t4 d() {
        nn4 nn4Var = new nn4();
        nn4Var.a = -1L;
        return nn4Var;
    }

    @Override // defpackage.s4
    public final t4[] e() {
        return new nn4[2];
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        mn4 mn4Var;
        Throwable th;
        fj0[] m;
        kn4 kn4Var;
        if (b(obj)) {
            return wd5.a;
        }
        byte b = 1;
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        fj0[] fj0VarArr = i42.a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        k10Var.resumeWith(wd5.a);
                        m = m(fj0VarArr);
                        kn4Var = null;
                        mn4Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        mn4Var = this;
                        throw th;
                    }
                } else {
                    try {
                        mn4Var = this;
                        try {
                            kn4 kn4Var2 = new kn4(mn4Var, n() + this.S + this.T, obj, k10Var);
                            mn4Var.l(kn4Var2);
                            mn4Var.T++;
                            if (mn4Var.N == 0) {
                                fj0VarArr = mn4Var.m(fj0VarArr);
                            }
                            m = fj0VarArr;
                            kn4Var = kn4Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        mn4Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (kn4Var != null) {
                    k10Var.w(new e10(kn4Var, b));
                }
                for (fj0 fj0Var2 : m) {
                    if (fj0Var2 != null) {
                        fj0Var2.resumeWith(wd5.a);
                    }
                }
                Object r = k10Var.r();
                el0 el0Var = el0.I;
                if (r != el0Var) {
                    r = wd5.a;
                }
                return r == el0Var ? r : wd5.a;
            } catch (Throwable th5) {
                th = th5;
                mn4Var = this;
            }
        }
    }

    public final Object h(nn4 nn4Var, ln4 ln4Var) {
        k10 k10Var = new k10(1, mu0.G(ln4Var));
        k10Var.t();
        synchronized (this) {
            try {
                if (q(nn4Var) < 0) {
                    nn4Var.b = k10Var;
                } else {
                    k10Var.resumeWith(wd5.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r = k10Var.r();
        return r == el0.I ? r : wd5.a;
    }

    public final void i() {
        if (this.N != 0 || this.T > 1) {
            Object[] objArr = this.P;
            objArr.getClass();
            while (this.T > 0) {
                long n = n();
                int i = this.S;
                int i2 = this.T;
                if (objArr[((int) ((n + (i + i2)) - 1)) & (objArr.length - 1)] != o7.s) {
                    return;
                }
                this.T = i2 - 1;
                o7.N(objArr, n() + this.S + this.T, null);
            }
        }
    }

    public final void k() {
        t4[] t4VarArr;
        Object[] objArr = this.P;
        objArr.getClass();
        o7.N(objArr, n(), null);
        this.S--;
        long n = n() + 1;
        if (this.Q < n) {
            this.Q = n;
        }
        if (this.R < n) {
            if (this.J != 0 && (t4VarArr = this.I) != null) {
                for (t4 t4Var : t4VarArr) {
                    if (t4Var != null) {
                        nn4 nn4Var = (nn4) t4Var;
                        long j = nn4Var.a;
                        if (0 <= j && j < n) {
                            nn4Var.a = n;
                        }
                    }
                }
            }
            this.R = n;
        }
    }

    public final void l(Object obj) {
        int i = this.S + this.T;
        Object[] objArr = this.P;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        o7.N(objArr, n() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fj0[] m(fj0[] fj0VarArr) {
        t4[] t4VarArr;
        nn4 nn4Var;
        k10 k10Var;
        int length = fj0VarArr.length;
        if (this.J != 0 && (t4VarArr = this.I) != null) {
            int length2 = t4VarArr.length;
            int i = 0;
            fj0VarArr = fj0VarArr;
            while (i < length2) {
                t4 t4Var = t4VarArr[i];
                if (t4Var != null && (k10Var = (nn4Var = (nn4) t4Var).b) != null && q(nn4Var) >= 0) {
                    int length3 = fj0VarArr.length;
                    fj0VarArr = fj0VarArr;
                    if (length >= length3) {
                        fj0VarArr = Arrays.copyOf(fj0VarArr, Math.max(2, fj0VarArr.length * 2));
                    }
                    fj0VarArr[length] = k10Var;
                    nn4Var.b = null;
                    length++;
                }
                i++;
                fj0VarArr = fj0VarArr;
            }
        }
        return fj0VarArr;
    }

    public final long n() {
        return Math.min(this.R, this.Q);
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            zy.i("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.P = objArr2;
        if (objArr != null) {
            long n = n();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + n;
                o7.N(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        int i = this.J;
        int i2 = this.M;
        if (i != 0) {
            int i3 = this.S;
            int i4 = this.N;
            if (i3 >= i4 && this.R <= this.Q) {
                int ordinal = this.O.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        s83.v();
                        return false;
                    }
                }
            }
            l(obj);
            int i5 = this.S + 1;
            this.S = i5;
            if (i5 > i4) {
                k();
            }
            long n = n() + this.S;
            long j = this.Q;
            if (((int) (n - j)) > i2) {
                s(1 + j, this.R, n() + this.S, n() + this.S + this.T);
            }
        } else if (i2 != 0) {
            l(obj);
            int i6 = this.S + 1;
            this.S = i6;
            if (i6 > i2) {
                k();
            }
            this.R = n() + this.S;
            return true;
        }
        return true;
    }

    public final long q(nn4 nn4Var) {
        long j = nn4Var.a;
        if (j >= n() + this.S && (this.N > 0 || j > n() || this.T == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object r(nn4 nn4Var) {
        Object obj;
        fj0[] fj0VarArr = i42.a;
        synchronized (this) {
            try {
                long q = q(nn4Var);
                if (q < 0) {
                    obj = o7.s;
                } else {
                    long j = nn4Var.a;
                    Object[] objArr = this.P;
                    objArr.getClass();
                    Object obj2 = objArr[((int) q) & (objArr.length - 1)];
                    if (obj2 instanceof kn4) {
                        obj2 = ((kn4) obj2).K;
                    }
                    nn4Var.a = q + 1;
                    Object obj3 = obj2;
                    fj0VarArr = t(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fj0 fj0Var : fj0VarArr) {
            if (fj0Var != null) {
                fj0Var.resumeWith(wd5.a);
            }
        }
        return obj;
    }

    public final void s(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long n = n(); n < min; n++) {
            Object[] objArr = this.P;
            objArr.getClass();
            o7.N(objArr, n, null);
        }
        this.Q = j;
        this.R = j2;
        this.S = (int) (j3 - min);
        this.T = (int) (j4 - j3);
    }

    public final fj0[] t(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        fj0[] fj0VarArr;
        fj0[] fj0VarArr2;
        t4[] t4VarArr;
        ep epVar = o7.s;
        fj0[] fj0VarArr3 = i42.a;
        if (j <= this.R) {
            long n = n();
            long j5 = this.S + n;
            int i2 = this.N;
            if (i2 == 0 && this.T > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.J != 0 && (t4VarArr = this.I) != null) {
                for (t4 t4Var : t4VarArr) {
                    if (t4Var != null) {
                        long j6 = ((nn4) t4Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.R) {
                long n2 = n() + this.S;
                int i4 = this.J;
                int i5 = this.T;
                if (i4 > 0) {
                    j2 = 1;
                    i5 = Math.min(i5, i2 - ((int) (n2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.T + n2;
                if (i5 > 0) {
                    fj0[] fj0VarArr4 = new fj0[i5];
                    Object[] objArr = this.P;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = n2;
                    while (true) {
                        if (n2 >= j7) {
                            fj0VarArr2 = fj0VarArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        fj0VarArr2 = fj0VarArr4;
                        Object obj = objArr[((int) n2) & (objArr.length - 1)];
                        if (obj != epVar) {
                            obj.getClass();
                            kn4 kn4Var = (kn4) obj;
                            i = i2;
                            int i6 = i3 + 1;
                            j4 = j7;
                            fj0VarArr2[i3] = kn4Var.L;
                            o7.N(objArr, n2, epVar);
                            o7.N(objArr, j8, kn4Var.K);
                            j8 += j2;
                            if (i6 >= i5) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        n2 += j2;
                        fj0VarArr4 = fj0VarArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    n2 = j8;
                    fj0VarArr = fj0VarArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    fj0VarArr = fj0VarArr3;
                }
                long max = Math.max(this.Q, Math.max(n, n2 - this.M));
                if (i == 0 && max < j4) {
                    Object[] objArr2 = this.P;
                    objArr2.getClass();
                    if (j42.c(objArr2[((int) max) & (objArr2.length - 1)], epVar)) {
                        n2 += j2;
                        max += j2;
                    }
                }
                long j9 = n2;
                s(max, this.J == 0 ? j9 : j3, j9, j4);
                i();
                return fj0VarArr.length == 0 ? fj0VarArr : m(fj0VarArr);
            }
        }
        return fj0VarArr3;
    }
}
