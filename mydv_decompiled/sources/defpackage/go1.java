package defpackage;

import android.os.Trace;
import androidx.media3.common.C;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class go1 implements fe0 {
    public int A;
    public int B;
    public boolean C;
    public final fo1 D;
    public final ArrayList E;
    public boolean F;
    public sr4 G;
    public tr4 H;
    public wr4 I;
    public boolean J;
    public am3 K;
    public h20 L;
    public final ge0 M;
    public bo1 N;
    public ff1 O;
    public wn4 P;
    public final ue0 Q;
    public final tk0 R;
    public boolean S;
    public long T;
    public ho1 U;
    public final k1 a;
    public final re0 b;
    public final tr4 c;
    public final q43 d;
    public final h20 e;
    public final h20 f;
    public final jf0 g;
    public final we0 h;
    public ko1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public o33 p;
    public boolean q;
    public boolean r;
    public q33 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final a32 n = new a32();
    public final ArrayList s = new ArrayList();
    public final a32 t = new a32();
    public am3 u = zl3.L;
    public final a32 x = new a32();
    public int z = -1;

    public go1(k1 k1Var, re0 re0Var, tr4 tr4Var, q43 q43Var, h20 h20Var, h20 h20Var2, jf0 jf0Var, we0 we0Var) {
        this.a = k1Var;
        this.b = re0Var;
        this.c = tr4Var;
        this.d = q43Var;
        this.e = h20Var;
        this.f = h20Var2;
        this.g = jf0Var;
        this.h = we0Var;
        this.C = re0Var.getCollectingSourceInformation$runtime() || re0Var.getCollectingCallByInformation$runtime();
        this.D = new fo1(this, (byte) 0);
        this.E = new ArrayList();
        sr4 h = tr4Var.h();
        h.c();
        this.G = h;
        tr4 tr4Var2 = new tr4();
        if (re0Var.getCollectingSourceInformation$runtime()) {
            tr4Var2.d();
        }
        if (re0Var.getCollectingCallByInformation$runtime()) {
            tr4Var2.S = new q33();
        }
        this.H = tr4Var2;
        wr4 j = tr4Var2.j();
        j.e(true);
        this.I = j;
        this.M = new ge0(this, h20Var);
        sr4 h2 = this.H.h();
        try {
            bo1 a = h2.a(0);
            h2.c();
            this.N = a;
            this.O = new ff1();
            this.Q = new ue0(this);
            tk0 effectCoroutineContext = re0Var.getEffectCoroutineContext();
            tk0 D = D();
            this.R = effectCoroutineContext.plus(D == null ? l91.I : D);
        } catch (Throwable th) {
            h2.c();
            throw th;
        }
    }

    public static final int S(go1 go1Var, int i, boolean z, int i2) {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        sr4 sr4Var;
        sr4 sr4Var2 = go1Var.G;
        int i7 = 0;
        if (sr4Var2.j(i)) {
            int i8 = sr4Var2.i(i);
            Object p = sr4Var2.p(i, sr4Var2.b);
            if (i8 == 206 && j42.c(p, ke0.e)) {
                Object h = sr4Var2.h(i, 0);
                lo1 lo1Var = h instanceof lo1 ? (lo1) h : null;
                Object obj = lo1Var != null ? lo1Var.a : null;
                do1 do1Var = obj instanceof do1 ? (do1) obj : null;
                if (do1Var != null) {
                    o43 o43Var = do1Var.I.f;
                    Object[] objArr = o43Var.b;
                    long[] jArr3 = o43Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr3[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        go1 go1Var2 = (go1) objArr[(i9 << 3) + i12];
                                        tr4 tr4Var = go1Var2.c;
                                        if (tr4Var.J <= 0 || (tr4Var.I[1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i10;
                                        } else {
                                            we0 we0Var = go1Var2.h;
                                            synchronized (we0Var.L) {
                                                we0Var.r();
                                                i6 = i10;
                                                n43 n43Var = we0Var.V;
                                                we0Var.V = ut0.y();
                                                try {
                                                    we0Var.d0.k0(n43Var);
                                                } finally {
                                                }
                                            }
                                            h20 h20Var = new h20();
                                            go1Var2.L = h20Var;
                                            sr4 h2 = go1Var2.c.h();
                                            try {
                                                go1Var2.G = h2;
                                                ge0 ge0Var = go1Var2.M;
                                                h20 h20Var2 = ge0Var.b;
                                                try {
                                                    ge0Var.b = h20Var;
                                                    go1Var2.R(0);
                                                    ge0 ge0Var2 = go1Var2.M;
                                                    ge0Var2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (ge0Var2.c) {
                                                            sr4Var = h2;
                                                            try {
                                                                ge0Var2.b.g.i0(ag3.c);
                                                                if (ge0Var2.c) {
                                                                    ge0Var2.d(false);
                                                                    ge0Var2.d(false);
                                                                    ge0Var2.b.g.i0(kf3.c);
                                                                    i5 = 0;
                                                                    ge0Var2.c = false;
                                                                    ge0Var.b = h20Var2;
                                                                    sr4Var.c();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                ge0Var.b = h20Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            sr4Var = h2;
                                                        }
                                                        ge0Var.b = h20Var2;
                                                        sr4Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        sr4Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    sr4Var = h2;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sr4Var = h2;
                                            }
                                        }
                                        go1Var.b.reportRemovedComposition$runtime(go1Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i10;
                                    }
                                    j >>= i6;
                                    i12++;
                                    i10 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return sr4Var2.o(i);
            }
            i3 = 1;
            if (!sr4Var2.l(i)) {
                return sr4Var2.o(i);
            }
        } else {
            i3 = 1;
            if (sr4Var2.d(i)) {
                int i13 = sr4Var2.b[(i * 5) + 3] + i;
                int i14 = 0;
                for (int i15 = i + 1; i15 < i13; i15 += sr4Var2.b[(i15 * 5) + 3]) {
                    boolean l = sr4Var2.l(i15);
                    if (l) {
                        go1Var.M.c();
                        ge0 ge0Var3 = go1Var.M;
                        Object n = sr4Var2.n(i15);
                        ge0Var3.c();
                        ge0Var3.h.add(n);
                    }
                    i14 += S(go1Var, i15, l || z, l ? 0 : i2 + i14);
                    if (l) {
                        go1Var.M.c();
                        go1Var.M.a();
                    }
                }
                if (!sr4Var2.l(i)) {
                    return i14;
                }
            } else if (!sr4Var2.l(i)) {
                return sr4Var2.o(i);
            }
        }
        return i3;
    }

    public final am3 A() {
        return m();
    }

    public final x04 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (x04) r7.w(arrayList, 1);
    }

    public final boolean C() {
        if (!F() || this.w) {
            return true;
        }
        x04 B = B();
        return (B == null || (B.b & 4) == 0) ? false : true;
    }

    public final ue0 D() {
        if (this.b.getStackTraceEnabled$runtime()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        x04 B;
        return (this.S || this.y || this.w || (B = B()) == null || (B.b & 8) != 0) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        go1 go1Var = this;
        h20 h20Var = go1Var.f;
        ge0 ge0Var = go1Var.M;
        h20 h20Var2 = ge0Var.b;
        try {
            ge0Var.b = h20Var;
            h20Var.g.i0(yf3.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                uj3 uj3Var = (uj3) arrayList.get(i);
                r23 r23Var = (r23) uj3Var.I;
                bo1 i2 = ut0.i(r23Var.a());
                tr4 a = vr4.a(r23Var.e());
                int c = a.c(i2);
                w22 w22Var = new w22();
                ge0Var.b();
                lg3 lg3Var = ge0Var.b.g;
                lg3Var.i0(hf3.c);
                rt0.H(lg3Var, 0, w22Var, 1, i2);
                if (a == go1Var.H) {
                    if (!go1Var.I.w) {
                        ke0.a("Check failed");
                    }
                    go1Var.x();
                }
                sr4 h = a.h();
                try {
                    h.r(c);
                    ge0Var.f = c;
                    h20 h20Var3 = new h20();
                    go1Var.L(null, null, null, o91.I, new yj(go1Var, h20Var3, h, r23Var));
                    h20 h20Var4 = ge0Var.b;
                    h20Var4.getClass();
                    if (!h20Var3.g.h0()) {
                        lg3 lg3Var2 = h20Var4.g;
                        lg3Var2.i0(df3.c);
                        rt0.H(lg3Var2, 0, h20Var3, 1, w22Var);
                    }
                    h.c();
                    ge0Var.b.g.i0(ag3.c);
                    i++;
                    go1Var = this;
                } catch (Throwable th) {
                    h.c();
                    throw th;
                }
            }
            ge0Var.b();
            ge0Var.b.g.i0(lf3.c);
            ge0Var.f = 0;
            ge0Var.b = h20Var2;
        } catch (Throwable th2) {
            ge0Var.b = h20Var2;
            throw th2;
        }
    }

    public final void H(am3 am3Var, Object obj) {
        a0(126665345, null);
        I();
        p0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                wr4.y(this.I);
            }
            boolean z = (this.S || j42.c(this.G.f(), am3Var)) ? false : true;
            if (z) {
                O(am3Var);
            }
            X(202, 0, ke0.c, am3Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            mu0.J(this, new tc0(-59194059, new rd(obj, (byte) 5), true));
            this.w = z2;
        } finally {
        }
    }

    public final Object I() {
        boolean z = this.S;
        jp jpVar = de0.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof m54)) {
                return m;
            }
        } else if (this.r) {
            ke0.a("A call to createNode(), emitNode() or useNode() expected");
            return jpVar;
        }
        return jpVar;
    }

    public final List J() {
        re0 re0Var = this.b;
        qe0 composition$runtime = re0Var.getComposition$runtime();
        we0 we0Var = composition$runtime instanceof we0 ? (we0) composition$runtime : null;
        if (we0Var != null) {
            tr4 tr4Var = we0Var.N;
            Integer w = a5.w(vr4.a(tr4Var), re0Var);
            if (w != null) {
                sr4 h = vr4.a(tr4Var).h();
                try {
                    ArrayList X = a5.X(h, w.intValue(), 0);
                    h.c();
                    return o70.f1(X, we0Var.d0.J());
                } catch (Throwable th) {
                    h.c();
                    throw th;
                }
            }
        }
        return o91.I;
    }

    public final int K(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.oj0 r9, defpackage.oj0 r10, java.lang.Integer r11, java.util.List r12, defpackage.rm1 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            uj3 r6 = (defpackage.uj3) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.I     // Catch: java.lang.Throwable -> L24
            x04 r7 = (defpackage.x04) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.J     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.j0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L66
        L26:
            r8.j0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L5d
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            we0 r9 = (defpackage.we0) r9     // Catch: java.lang.Throwable -> L24
            if (r10 == 0) goto L57
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L57
            if (r11 < 0) goto L57
            we0 r10 = (defpackage.we0) r10     // Catch: java.lang.Throwable -> L24
            r9.Z = r10     // Catch: java.lang.Throwable -> L24
            r9.a0 = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L51
            r9.Z = r5     // Catch: java.lang.Throwable -> L24
            r9.a0 = r2     // Catch: java.lang.Throwable -> L24
            goto L5b
        L51:
            r10 = move-exception
            r9.Z = r5     // Catch: java.lang.Throwable -> L24
            r9.a0 = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L57:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5b:
            if (r10 != 0) goto L61
        L5d:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L61:
            r8.F = r0
            r8.k = r1
            return r10
        L66:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.L(oj0, oj0, java.lang.Integer, java.util.List, rm1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.M():void");
    }

    public final void N() {
        int i;
        R(this.G.g);
        ge0 ge0Var = this.M;
        ge0Var.d(false);
        a32 a32Var = ge0Var.d;
        go1 go1Var = ge0Var.a;
        sr4 sr4Var = go1Var.G;
        if (sr4Var.c > 0 && a32Var.b(-2) != (i = sr4Var.i)) {
            if (!ge0Var.c && ge0Var.e) {
                ge0Var.d(false);
                ge0Var.b.g.i0(of3.c);
                ge0Var.c = true;
            }
            if (i > 0) {
                bo1 a = sr4Var.a(i);
                a32Var.d(i);
                ge0Var.d(false);
                lg3 lg3Var = ge0Var.b.g;
                lg3Var.i0(nf3.c);
                rt0.G(lg3Var, 0, a);
                ge0Var.c = true;
            }
        }
        ge0Var.b.g.i0(wf3.c);
        int i2 = ge0Var.f;
        sr4 sr4Var2 = go1Var.G;
        ge0Var.f = sr4Var2.b[(sr4Var2.g * 5) + 3] + i2;
    }

    public final void O(am3 am3Var) {
        q33 q33Var = this.v;
        if (q33Var == null) {
            q33Var = new q33();
            this.v = q33Var;
        }
        q33Var.i(this.G.g, am3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(int r7, int r8, int r9) {
        /*
            r6 = this;
            sr4 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            ge0 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.P(int, int, int):void");
    }

    public final Object Q() {
        boolean z = this.S;
        jp jpVar = de0.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof m54)) {
                return m instanceof lo1 ? ((lo1) m).a : m;
            }
        } else if (this.r) {
            ke0.a("A call to createNode(), emitNode() or useNode() expected");
            return jpVar;
        }
        return jpVar;
    }

    public final void R(int i) {
        boolean l = this.G.l(i);
        ge0 ge0Var = this.M;
        if (l) {
            ge0Var.c();
            Object n = this.G.n(i);
            ge0Var.c();
            ge0Var.h.add(n);
        }
        S(this, i, l, 0);
        ge0Var.c();
        if (l) {
            ge0Var.a();
        }
    }

    public final boolean T(int i, boolean z) {
        x04 B;
        if ((i & 1) == 0 && (this.S || this.y)) {
            wn4 wn4Var = this.P;
            if (wn4Var != null && (B = B()) != null && wn4Var.a()) {
                int i2 = B.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                B.b = i3;
                B.b = (this.y ? i2 | TsExtractor.TS_STREAM_TYPE_AC3 : i3 & (-129)) | 256;
                lg3 lg3Var = this.M.b.g;
                lg3Var.i0(vf3.c);
                rt0.G(lg3Var, 0, B);
                this.b.reportPausedScope$runtime(B);
                return false;
            }
        } else if (!z && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.U():void");
    }

    public final void V() {
        sr4 sr4Var = this.G;
        int i = sr4Var.i;
        this.l = i >= 0 ? sr4Var.b[(i * 5) + 1] & 67108863 : 0;
        sr4Var.t();
    }

    public final void W() {
        if (this.l != 0) {
            ke0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        x04 B = B();
        if (B != null) {
            int i = B.b;
            if ((i & 128) == 0) {
                B.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.X(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void Y() {
        X(-127, 0, null, null);
    }

    public final void Z(int i, ze3 ze3Var) {
        X(i, 0, ze3Var, null);
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.a = 0;
        this.t.a = 0;
        this.x.a = 0;
        this.v = null;
        ff1 ff1Var = this.O;
        ff1Var.e.f0();
        ff1Var.d.f0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        sr4 sr4Var = this.G;
        if (!sr4Var.f) {
            sr4Var.c();
        }
        if (this.I.w) {
            return;
        }
        x();
    }

    public final void a0(int i, Object obj) {
        X(i, 0, obj, null);
    }

    public final void b(Object obj, hn1 hn1Var) {
        if (this.S) {
            lg3 lg3Var = this.O.d;
            lg3Var.i0(gg3.c);
            rt0.G(lg3Var, 0, obj);
            p70.A(2, hn1Var);
            rt0.G(lg3Var, 1, hn1Var);
            return;
        }
        ge0 ge0Var = this.M;
        ge0Var.b();
        lg3 lg3Var2 = ge0Var.b.g;
        lg3Var2.i0(gg3.c);
        p70.A(2, hn1Var);
        rt0.H(lg3Var2, 0, obj, 1, hn1Var);
    }

    public final void b0() {
        X(125, 1, null, null);
        this.r = true;
    }

    public final boolean c(double d) {
        Object I = I();
        if ((I instanceof Double) && d == ((Number) I).doubleValue()) {
            return false;
        }
        p0(Double.valueOf(d));
        return true;
    }

    public final void c0(Object obj, boolean z) {
        if (z) {
            sr4 sr4Var = this.G;
            if (sr4Var.k <= 0) {
                if ((sr4Var.b[(sr4Var.g * 5) + 1] & 1073741824) == 0) {
                    jr3.a("Expected a node group");
                }
                sr4Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            ge0 ge0Var = this.M;
            ge0Var.getClass();
            ge0Var.d(false);
            lg3 lg3Var = ge0Var.b.g;
            lg3Var.i0(fg3.c);
            rt0.G(lg3Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean d(float f) {
        Object I = I();
        if ((I instanceof Float) && f == ((Number) I).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f));
        return true;
    }

    public final void d0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            X(i, 0, null, null);
            return;
        }
        if (this.r) {
            ke0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        sr4 sr4Var = this.G;
        boolean z = this.S;
        jp jpVar = de0.a;
        if (z) {
            sr4Var.k++;
            this.I.R(i, jpVar, false, jpVar);
            w(false, null);
            return;
        }
        if (sr4Var.g() == i && ((i3 = sr4Var.g) >= sr4Var.h || (sr4Var.b[(i3 * 5) + 1] & C.BUFFER_FLAG_LAST_SAMPLE) == 0)) {
            sr4Var.u();
            w(false, null);
            return;
        }
        if (sr4Var.k <= 0 && (i2 = sr4Var.g) != sr4Var.h) {
            int i4 = this.k;
            N();
            this.M.e(i4, sr4Var.s());
            p70.w0(this.s, i2, sr4Var.g);
        }
        sr4Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            wr4 j = this.H.j();
            this.I = j;
            j.N();
            this.J = false;
            this.K = null;
        }
        wr4 wr4Var = this.I;
        wr4Var.d();
        int i5 = wr4Var.t;
        wr4Var.R(i, jpVar, false, jpVar);
        this.N = wr4Var.b(i5);
        w(false, null);
    }

    public final boolean e(int i) {
        Object I = I();
        if ((I instanceof Integer) && i == ((Number) I).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i));
        return true;
    }

    public final void e0(int i) {
        X(i, 0, null, null);
    }

    public final boolean f(long j) {
        Object I = I();
        if ((I instanceof Long) && j == ((Number) I).longValue()) {
            return false;
        }
        p0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.go1 f0(int r7) {
        /*
            r6 = this;
            r6.d0(r7)
            boolean r7 = r6.S
            jf0 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            we0 r2 = r6.h
            if (r7 == 0) goto L26
            x04 r7 = new x04
            r7.<init>(r2)
            r1.add(r7)
            r6.p0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.a()
            return r6
        L26:
            sr4 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.p70.O(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            b52 r7 = (defpackage.b52) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            sr4 r3 = r6.G
            java.lang.Object r3 = r3.m()
            jp r4 = defpackage.de0.a
            boolean r4 = defpackage.j42.c(r3, r4)
            if (r4 == 0) goto L51
            x04 r3 = new x04
            r3.<init>(r2)
            r6.p0(r3)
            goto L56
        L51:
            r3.getClass()
            x04 r3 = (defpackage.x04) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.a()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            ge0 r7 = r6.M
            h20 r7 = r7.b
            lg3 r7 = r7.g
            bg3 r0 = defpackage.bg3.c
            r7.i0(r0)
            defpackage.rt0.G(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            sr4 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.f0(int):go1");
    }

    public final boolean g(Object obj) {
        if (j42.c(I(), obj)) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void g0(Object obj) {
        if (!this.S && this.G.g() == 207 && !j42.c(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        X(207, 0, null, obj);
    }

    public final boolean h(boolean z) {
        Object I = I();
        if ((I instanceof Boolean) && z == ((Boolean) I).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z));
        return true;
    }

    public final void h0() {
        X(125, 2, null, null);
        this.r = true;
    }

    public final boolean i(Object obj) {
        if (I() == obj) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void i0() {
        this.m = 0;
        this.G = this.c.h();
        X(100, 0, null, null);
        re0 re0Var = this.b;
        re0Var.startComposing$runtime();
        am3 compositionLocalScope$runtime = re0Var.getCompositionLocalScope$runtime();
        this.x.d(this.w ? 1 : 0);
        this.w = g(compositionLocalScope$runtime);
        this.K = null;
        if (!this.q) {
            this.q = re0Var.getCollectingParameterInformation$runtime();
        }
        boolean z = this.C;
        if (!z) {
            z = re0Var.getCollectingSourceInformation$runtime();
            this.C = z;
        }
        if (z) {
            i51 a = ve0.a();
            a.getClass();
            compositionLocalScope$runtime = ((zl3) compositionLocalScope$runtime).c(a, new qw4(D()));
        }
        this.u = compositionLocalScope$runtime;
        Set set = (Set) p70.r0(compositionLocalScope$runtime, y12.a);
        if (set != null) {
            set.add(z());
            re0Var.recordInspectionTable$runtime(set);
        }
        long compositeKeyHashCode$runtime = re0Var.getCompositeKeyHashCode$runtime();
        X((int) (compositeKeyHashCode$runtime ^ (compositeKeyHashCode$runtime >>> 32)), 0, null, null);
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        ge0 ge0Var = this.M;
        ge0Var.c = false;
        ge0Var.d.a = 0;
        ge0Var.f = 0;
        ge0Var.e = true;
        ge0Var.g = 0;
        ge0Var.h.clear();
        ge0Var.i = -1;
        ge0Var.j = -1;
        ge0Var.k = -1;
        ge0Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final boolean j0(x04 x04Var, Object obj) {
        bo1 bo1Var = x04Var.c;
        if (bo1Var == null) {
            return false;
        }
        int c = this.G.a.c(ut0.i(bo1Var));
        if (!this.F || c < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int O = p70.O(c, arrayList);
        if (O < 0) {
            int i = -(O + 1);
            if (!(obj instanceof wu0)) {
                obj = null;
            }
            arrayList.add(i, new b52(x04Var, c, obj));
            return true;
        }
        b52 b52Var = (b52) arrayList.get(O);
        if (!(obj instanceof wu0)) {
            b52Var.c = null;
            return true;
        }
        Object obj2 = b52Var.c;
        if (obj2 == null) {
            b52Var.c = obj;
            return true;
        }
        if (obj2 instanceof o43) {
            ((o43) obj2).d(obj);
            return true;
        }
        o43 o43Var = ka4.a;
        o43 o43Var2 = new o43(2);
        o43Var2.k(obj2);
        o43Var2.k(obj);
        b52Var.c = o43Var2;
        return true;
    }

    public final Object k(xx3 xx3Var) {
        return p70.r0(m(), xx3Var);
    }

    public final void k0(n43 n43Var) {
        ArrayList arrayList = this.s;
        for (int X = p70.X(arrayList); -1 < X; X--) {
            b52 b52Var = (b52) arrayList.get(X);
            bo1 bo1Var = b52Var.a.c;
            bo1 i = bo1Var != null ? ut0.i(bo1Var) : null;
            if (i == null || !i.a()) {
                arrayList.remove(X);
            } else {
                int i2 = b52Var.b;
                int i3 = i.a;
                if (i2 != i3) {
                    b52Var.b = i3;
                }
            }
        }
        Object[] objArr = n43Var.b;
        Object[] objArr2 = n43Var.c;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            obj.getClass();
                            x04 x04Var = (x04) obj;
                            bo1 bo1Var2 = x04Var.c;
                            if (bo1Var2 != null) {
                                int i8 = ut0.i(bo1Var2).a;
                                if (obj2 == q8.z0) {
                                    obj2 = null;
                                }
                                arrayList.add(new b52(x04Var, i8, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        t70.H0(p70.p, arrayList);
    }

    public final void l(rm1 rm1Var) {
        if (!this.r) {
            ke0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ke0.a("createNode() can only be called when inserting");
        }
        a32 a32Var = this.n;
        int i = ((int[]) a32Var.b)[a32Var.a - 1];
        wr4 wr4Var = this.I;
        bo1 b = wr4Var.b(wr4Var.v);
        this.l++;
        ff1 ff1Var = this.O;
        lg3 lg3Var = ff1Var.d;
        lg3Var.i0(pf3.d);
        rt0.G(lg3Var, 0, rm1Var);
        lg3Var.f[lg3Var.g - lg3Var.d[lg3Var.e - 1].a] = i;
        rt0.G(lg3Var, 1, b);
        lg3 lg3Var2 = ff1Var.e;
        lg3Var2.i0(pf3.e);
        lg3Var2.f[lg3Var2.g - lg3Var2.d[lg3Var2.e - 1].a] = i;
        rt0.G(lg3Var2, 0, b);
    }

    public final void l0(int i, int i2) {
        if (q0(i) != i2) {
            if (i < 0) {
                o33 o33Var = this.p;
                if (o33Var == null) {
                    o33Var = new o33();
                    this.p = o33Var;
                }
                o33Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                dq.Y0(-1, 0, 6, iArr);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final am3 m() {
        am3 am3Var;
        am3 am3Var2 = this.K;
        if (am3Var2 != null) {
            return am3Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        ze3 ze3Var = ke0.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.r(i2) == 202 && j42.c(this.I.s(i2), ze3Var)) {
                    Object p = this.I.p(i2);
                    p.getClass();
                    am3 am3Var3 = (am3) p;
                    this.K = am3Var3;
                    return am3Var3;
                }
                wr4 wr4Var = this.I;
                i2 = wr4Var.F(i2, wr4Var.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    sr4 sr4Var = this.G;
                    if (j42.c(sr4Var.p(i, sr4Var.b), ze3Var)) {
                        q33 q33Var = this.v;
                        if (q33Var == null || (am3Var = (am3) q33Var.b(i)) == null) {
                            sr4 sr4Var2 = this.G;
                            Object b = sr4Var2.b(i, sr4Var2.b);
                            b.getClass();
                            am3Var = (am3) b;
                        }
                        this.K = am3Var;
                        return am3Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        am3 am3Var4 = this.u;
        this.K = am3Var4;
        return am3Var4;
    }

    public final void m0(int i, int i2) {
        int q0 = q0(i);
        if (q0 != i2) {
            int i3 = i2 - q0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int q02 = q0(i) + i3;
                l0(i, q02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        ko1 ko1Var = (ko1) arrayList.get(i4);
                        if (ko1Var != null && ko1Var.a(i, q02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                sr4 sr4Var = this.G;
                if (i < 0) {
                    i = sr4Var.i;
                } else if (sr4Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final vd0 n() {
        if (!this.b.getStackTraceEnabled$runtime()) {
            return null;
        }
        mk2 K = p70.K();
        K.addAll(a5.p(this.I));
        K.addAll(a5.n(this.G));
        K.addAll(J());
        return new vd0(p70.D(K), this.C);
    }

    public final zl3 n0(am3 am3Var, zl3 zl3Var) {
        zl3 zl3Var2 = (zl3) am3Var;
        zl3Var2.getClass();
        yl3 yl3Var = new yl3(zl3Var2);
        yl3Var.O = zl3Var2;
        yl3Var.putAll(zl3Var);
        zl3 build = yl3Var.build();
        Z(204, ke0.d);
        I();
        p0(build);
        I();
        p0(zl3Var);
        q(false);
        return build;
    }

    public final void o(n43 n43Var, hn1 hn1Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            ke0.a("Reentrant composition is not supported");
        }
        this.g.a();
        Trace.beginSection("Compose:recompose");
        try {
            long g = ws4.h().g();
            this.B = (int) (g ^ (g >>> 32));
            this.v = null;
            k0(n43Var);
            this.k = 0;
            this.F = true;
            try {
                i0();
                Object I = I();
                if (I != hn1Var && hn1Var != null) {
                    p0(hn1Var);
                }
                fo1 fo1Var = this.D;
                b53 a = dt4.a();
                try {
                    a.c(fo1Var);
                    ze3 ze3Var = ke0.a;
                    if (hn1Var != null) {
                        Z(200, ze3Var);
                        mu0.J(this, hn1Var);
                        q(false);
                    } else if (!this.w || I == null || I.equals(de0.a)) {
                        U();
                    } else {
                        Z(200, ze3Var);
                        p70.A(2, I);
                        mu0.J(this, (hn1) I);
                        q(false);
                    }
                    a.l(a.K - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        ke0.a("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    a.l(a.K - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o0(Object obj) {
        if (obj instanceof k34) {
            lo1 lo1Var = new lo1((k34) obj, this.m - 1);
            if (this.S) {
                lg3 lg3Var = this.M.b.g;
                lg3Var.i0(uf3.c);
                rt0.G(lg3Var, 0, lo1Var);
            }
            this.d.add(obj);
            obj = lo1Var;
        }
        p0(obj);
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            ge0 ge0Var = this.M;
            ge0Var.c();
            ge0Var.h.add(n);
        }
    }

    public final void p0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        sr4 sr4Var = this.G;
        boolean z = sr4Var.n;
        ge0 ge0Var = this.M;
        if (!z) {
            bo1 a = sr4Var.a(sr4Var.i);
            lg3 lg3Var = ge0Var.b.g;
            lg3Var.i0(cf3.c);
            rt0.H(lg3Var, 0, a, 1, obj);
            return;
        }
        int d = (sr4Var.l - vr4.d(sr4Var.i, sr4Var.b)) - 1;
        if (ge0Var.a.G.i - ge0Var.f >= 0) {
            ge0Var.d(true);
            lg3 lg3Var2 = ge0Var.b.g;
            lg3Var2.i0(pf3.g);
            rt0.G(lg3Var2, 0, obj);
            lg3Var2.f[lg3Var2.g - lg3Var2.d[lg3Var2.e - 1].a] = d;
            return;
        }
        sr4 sr4Var2 = this.G;
        bo1 a2 = sr4Var2.a(sr4Var2.i);
        lg3 lg3Var3 = ge0Var.b.g;
        lg3Var3.i0(pf3.f);
        rt0.H(lg3Var3, 0, obj, 1, a2);
        lg3Var3.f[lg3Var3.g - lg3Var3.d[lg3Var3.e - 1].a] = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b4  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.q(boolean):void");
    }

    public final int q0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        o33 o33Var = this.p;
        if (o33Var == null || o33Var.c(i) < 0) {
            return 0;
        }
        int c = o33Var.c(i);
        if (c >= 0) {
            return o33Var.c[c];
        }
        dq2.K0("Cannot find value for key " + i);
        throw null;
    }

    public final void r() {
        q(false);
        x04 B = B();
        if (B != null) {
            int i = B.b;
            if ((i & 1) != 0) {
                B.b = i | 2;
            }
        }
    }

    public final void r0() {
        if (!this.r) {
            ke0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            ke0.a("useNode() called while inserting");
        }
        sr4 sr4Var = this.G;
        Object n = sr4Var.n(sr4Var.i);
        ge0 ge0Var = this.M;
        ge0Var.c();
        ge0Var.h.add(n);
        if (this.y && (n instanceof ld0)) {
            ge0Var.b();
            ge0Var.b.g.i0(ig3.c);
        }
    }

    public final void s() {
        q(true);
    }

    public final void t() {
        q(false);
    }

    public final x04 u() {
        x04 x04Var;
        bo1 a;
        tm1 tm1Var;
        ArrayList arrayList = this.E;
        final x04 x04Var2 = !arrayList.isEmpty() ? (x04) arrayList.remove(arrayList.size() - 1) : null;
        if (x04Var2 != null) {
            x04Var2.b &= -9;
            this.g.a();
            final int i = this.B;
            final a43 a43Var = x04Var2.f;
            if (a43Var != null && (x04Var2.b & 16) == 0) {
                Object[] objArr = a43Var.b;
                int[] iArr = a43Var.c;
                long[] jArr = a43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        tm1Var = new tm1() { // from class: w04
                                            @Override // defpackage.tm1
                                            public final Object invoke(Object obj2) {
                                                qe0 qe0Var;
                                                qe0 qe0Var2;
                                                int i6;
                                                qe0 qe0Var3 = (qe0) obj2;
                                                x04 x04Var3 = x04.this;
                                                int i7 = x04Var3.e;
                                                int i8 = i;
                                                if (i7 == i8) {
                                                    a43 a43Var2 = x04Var3.f;
                                                    a43 a43Var3 = a43Var;
                                                    if (j42.c(a43Var3, a43Var2) && (qe0Var3 instanceof we0)) {
                                                        long[] jArr2 = a43Var3.a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i9 = 0;
                                                            while (true) {
                                                                long j2 = jArr2[i9];
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i10 = 8;
                                                                    int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                                    int i12 = 0;
                                                                    while (i12 < i11) {
                                                                        if ((255 & j2) < 128) {
                                                                            int i13 = (i9 << 3) + i12;
                                                                            Object obj3 = a43Var3.b[i13];
                                                                            boolean z = a43Var3.c[i13] != i8;
                                                                            if (z) {
                                                                                we0 we0Var = (we0) qe0Var3;
                                                                                i6 = i10;
                                                                                n43 n43Var = we0Var.O;
                                                                                ut0.Q(n43Var, obj3, x04Var3);
                                                                                qe0Var2 = qe0Var3;
                                                                                if (obj3 instanceof wu0) {
                                                                                    wu0 wu0Var = (wu0) obj3;
                                                                                    if (!n43Var.c(wu0Var)) {
                                                                                        ut0.R(we0Var.R, wu0Var);
                                                                                    }
                                                                                    n43 n43Var2 = x04Var3.g;
                                                                                    if (n43Var2 != null) {
                                                                                        n43Var2.k(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                qe0Var2 = qe0Var3;
                                                                                i6 = i10;
                                                                            }
                                                                            if (z) {
                                                                                a43Var3.f(i13);
                                                                            }
                                                                        } else {
                                                                            qe0Var2 = qe0Var3;
                                                                            i6 = i10;
                                                                        }
                                                                        j2 >>= i6;
                                                                        i12++;
                                                                        i10 = i6;
                                                                        qe0Var3 = qe0Var2;
                                                                    }
                                                                    qe0Var = qe0Var3;
                                                                    if (i11 != i10) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    qe0Var = qe0Var3;
                                                                }
                                                                if (i9 == length2) {
                                                                    break;
                                                                }
                                                                i9++;
                                                                qe0Var3 = qe0Var;
                                                            }
                                                        }
                                                    }
                                                }
                                                return wd5.a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            tm1Var = null;
            ge0 ge0Var = this.M;
            if (tm1Var != null) {
                lg3 lg3Var = ge0Var.b.g;
                lg3Var.i0(jf3.c);
                rt0.H(lg3Var, 0, tm1Var, 1, this.h);
            }
            int i6 = x04Var2.b;
            if ((i6 & 512) != 0) {
                x04Var2.b = i6 & (-513);
                lg3 lg3Var2 = ge0Var.b.g;
                lg3Var2.i0(mf3.c);
                rt0.G(lg3Var2, 0, x04Var2);
                int i7 = x04Var2.b;
                x04Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    x04Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (x04Var2 != null) {
            int i8 = x04Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (x04Var2.c == null) {
                    if (this.S) {
                        wr4 wr4Var = this.I;
                        a = wr4Var.b(wr4Var.v);
                    } else {
                        sr4 sr4Var = this.G;
                        a = sr4Var.a(sr4Var.i);
                    }
                    x04Var2.c = a;
                }
                x04Var2.b &= -5;
                x04Var = x04Var2;
                q(false);
                return x04Var;
            }
        }
        x04Var = null;
        q(false);
        return x04Var;
    }

    public final void v() {
        q(false);
        this.b.doneComposing$runtime();
        q(false);
        ge0 ge0Var = this.M;
        if (ge0Var.c) {
            ge0Var.d(false);
            ge0Var.d(false);
            ge0Var.b.g.i0(kf3.c);
            ge0Var.c = false;
        }
        ge0Var.b();
        if (ge0Var.d.a != 0) {
            ke0.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ke0.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.w = this.x.c() != 0;
    }

    public final void w(boolean z, ko1 ko1Var) {
        this.i.add(this.j);
        this.j = ko1Var;
        int i = this.l;
        a32 a32Var = this.n;
        a32Var.d(i);
        a32Var.d(this.m);
        a32Var.d(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        tr4 tr4Var = new tr4();
        if (this.C) {
            tr4Var.d();
        }
        if (this.b.getCollectingCallByInformation$runtime()) {
            tr4Var.S = new q33();
        }
        this.H = tr4Var;
        wr4 j = tr4Var.j();
        j.e(true);
        this.I = j;
    }

    public final ap y() {
        return this.a;
    }

    public final te0 z() {
        ho1 ho1Var = this.U;
        if (ho1Var != null) {
            return ho1Var;
        }
        ho1 ho1Var2 = new ho1(this.h);
        this.U = ho1Var2;
        return ho1Var2;
    }
}
