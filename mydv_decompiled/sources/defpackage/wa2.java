package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wa2 implements ld0, rh3, xd0, ph3 {
    public final boolean I;
    public int J;
    public boolean K;
    public long L;
    public boolean M;
    public boolean N;
    public int O;
    public wa2 P;
    public int Q;
    public final da R;
    public b53 S;
    public boolean T;
    public wa2 U;
    public qh3 V;
    public ir5 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public ki4 a0;
    public boolean b0;
    public final b53 c0;
    public boolean d0;
    public uw2 e0;
    public g12 f0;
    public iu0 g0;
    public da2 h0;
    public gr5 i0;
    public af0 j0;
    public ua2 k0;
    public ua2 l0;
    public boolean m0;
    public final ja3 n0;
    public final ab2 o0;
    public kb2 p0;
    public na3 q0;
    public boolean r0;
    public l13 s0;
    public l13 t0;
    public jg u0;
    public kg v0;
    public boolean w0;
    public int x0;
    public boolean y0;
    public static final f74 z0 = new f74("Undefined intrinsics block and it is required", 1);
    public static final df0 A0 = new df0(23);
    public static final ra2 B0 = new ra2();
    public static final qe C0 = new qe(5);

    public wa2(boolean z, int i) {
        this.I = z;
        this.J = i;
        this.L = 9223372034707292159L;
        this.M = true;
        this.N = true;
        this.O = -4;
        this.R = new da((Object) new b53(new wa2[16]), (Object) new eq(this, (byte) 13), (byte) 4);
        this.c0 = new b53(new wa2[16]);
        this.d0 = true;
        this.e0 = z0;
        this.g0 = za2.a;
        this.h0 = da2.I;
        this.i0 = B0;
        af0.d.getClass();
        this.j0 = ze0.b;
        ua2 ua2Var = ua2.K;
        this.k0 = ua2Var;
        this.l0 = ua2Var;
        this.n0 = new ja3(this);
        this.o0 = new ab2(this);
        this.r0 = true;
        this.s0 = i13.a;
    }

    public static void W(wa2 wa2Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (wa2Var.P == null) {
            q02.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        qh3 qh3Var = wa2Var.V;
        if (qh3Var == null || wa2Var.Y || wa2Var.I) {
            return;
        }
        qh3Var.onRequestMeasure(wa2Var, true, z, z2);
        if (z3) {
            ns2 ns2Var = wa2Var.o0.q;
            ns2Var.getClass();
            ns2Var.p0(z);
        }
    }

    public static void Y(wa2 wa2Var, boolean z, int i) {
        qh3 qh3Var;
        wa2 v;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (wa2Var.Y || wa2Var.I || (qh3Var = wa2Var.V) == null) {
            return;
        }
        qh3Var.onRequestMeasure(wa2Var, false, z, z2);
        if (z3) {
            ab2 ab2Var = wa2Var.o0.p.N;
            wa2 v2 = ab2Var.a.v();
            ua2 ua2Var = ab2Var.a.k0;
            if (v2 == null || ua2Var == ua2.K) {
                return;
            }
            while (v2.k0 == ua2Var && (v = v2.v()) != null) {
                v2 = v;
            }
            int ordinal = ua2Var.ordinal();
            if (ordinal == 0) {
                Y(v2, z, 6);
            } else if (ordinal == 1) {
                v2.X(z);
            } else {
                zy.i("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void Z(wa2 wa2Var) {
        ab2 ab2Var = wa2Var.o0;
        if (va2.a[ab2Var.d.ordinal()] != 1) {
            zl1.n(ab2Var.d, "Unexpected state ");
            return;
        }
        if (ab2Var.e) {
            W(wa2Var, true, 6);
            return;
        }
        if (ab2Var.f) {
            wa2Var.V(true);
        }
        if (wa2Var.r()) {
            Y(wa2Var, true, 6);
        } else if (wa2Var.q()) {
            wa2Var.X(true);
        }
    }

    private final String j(wa2 wa2Var) {
        String g = g(0);
        wa2 wa2Var2 = wa2Var.U;
        return "Cannot insert " + wa2Var + " because it already has a parent or an owner. This tree: " + g + " Other tree: " + (wa2Var2 != null ? wa2Var2.g(0) : null);
    }

    public final b53 A() {
        i0();
        if (this.Q == 0) {
            return (b53) this.R.J;
        }
        b53 b53Var = this.S;
        b53Var.getClass();
        return b53Var;
    }

    public final void B(long j, kt1 kt1Var, int i, boolean z) {
        ja3 ja3Var = this.n0;
        na3 na3Var = ja3Var.d;
        u73 u73Var = na3.C0;
        ja3Var.d.Q0(na3.H0, na3Var.H0(j), kt1Var, i, z);
    }

    public final void C(wa2 wa2Var, int i) {
        if (wa2Var.U != null && wa2Var.V != null) {
            q02.b(j(wa2Var));
        }
        wa2Var.U = this;
        da daVar = this.R;
        ((b53) daVar.J).b(i, wa2Var);
        ((eq) daVar.K).invoke();
        R();
        if (wa2Var.I) {
            this.Q++;
        }
        J();
        qh3 qh3Var = this.V;
        if (qh3Var != null) {
            wa2Var.c(qh3Var);
        }
        if (wa2Var.o0.l > 0) {
            ab2 ab2Var = this.o0;
            ab2Var.c(ab2Var.l + 1);
        }
        if (wa2Var.x0 > 0) {
            d0(this.x0 + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [k13] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void D(boolean z) {
        if (z) {
            wa2 v = v();
            if (v != null) {
                v.E();
            } else {
                qh3 qh3Var = this.V;
                if (qh3Var != null) {
                    qh3Var.invalidateRootLayer();
                }
            }
        }
        ja3 ja3Var = this.n0;
        if ((ja3Var.f.getAggregateChildKindSet$ui() & 2) != 0) {
            for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                if ((k13Var.getKindSet$ui() & 2) != 0) {
                    wt0 wt0Var = k13Var;
                    ?? r4 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof na2) {
                            mr1 mr1Var = ut0.S((na2) wt0Var, 2).B0;
                            if (mr1Var != null) {
                                mr1Var.c();
                            }
                        } else if ((wt0Var.getKindSet$ui() & 2) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var2 = wt0Var.J;
                            int i = 0;
                            wt0Var = wt0Var;
                            r4 = r4;
                            while (k13Var2 != null) {
                                if ((k13Var2.getKindSet$ui() & 2) != 0) {
                                    i++;
                                    r4 = r4;
                                    if (i == 1) {
                                        wt0Var = k13Var2;
                                    } else {
                                        if (r4 == 0) {
                                            r4 = new b53(new k13[16]);
                                        }
                                        if (wt0Var != 0) {
                                            r4.c(wt0Var);
                                            wt0Var = 0;
                                        }
                                        r4.c(k13Var2);
                                    }
                                }
                                k13Var2 = k13Var2.getChild$ui();
                                wt0Var = wt0Var;
                                r4 = r4;
                            }
                            if (i == 1) {
                            }
                        }
                        wt0Var = ut0.M(r4);
                    }
                }
                if ((k13Var.getAggregateChildKindSet$ui() & 2) == 0) {
                    break;
                }
            }
        }
        b53 A = A();
        Object[] objArr = A.I;
        int i2 = A.K;
        for (int i3 = 0; i3 < i2; i3++) {
            ((wa2) objArr[i3]).D(false);
        }
    }

    public final void E() {
        if (this.r0) {
            ja3 ja3Var = this.n0;
            na3 na3Var = ja3Var.c;
            na3 na3Var2 = ja3Var.d.e0;
            this.q0 = null;
            while (true) {
                if (j42.c(na3Var, na3Var2)) {
                    break;
                }
                if ((na3Var != null ? na3Var.B0 : null) != null) {
                    this.q0 = na3Var;
                    break;
                }
                na3Var = na3Var != null ? na3Var.e0 : null;
            }
            this.r0 = false;
        }
        na3 na3Var3 = this.q0;
        if (na3Var3 != null && na3Var3.B0 == null) {
            throw r7.t("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (na3Var3 != null) {
            na3Var3.S0();
            return;
        }
        wa2 v = v();
        if (v != null) {
            v.E();
            return;
        }
        qh3 qh3Var = this.V;
        if (qh3Var != null) {
            qh3Var.invalidateRootLayer();
        }
    }

    public final void F() {
        ja3 ja3Var = this.n0;
        na3 na3Var = ja3Var.d;
        x02 x02Var = ja3Var.c;
        while (na3Var != x02Var) {
            na3Var.getClass();
            pa2 pa2Var = (pa2) na3Var;
            mr1 mr1Var = pa2Var.B0;
            if (mr1Var != null) {
                mr1Var.c();
            }
            na3Var = pa2Var.d0;
        }
        mr1 mr1Var2 = x02Var.B0;
        if (mr1Var2 != null) {
            mr1Var2.c();
        }
    }

    public final void G() {
        Y(this, false, 7);
        b53 A = A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((wa2) objArr[i2]).G();
        }
    }

    public final void H() {
        if (this.I) {
            wa2 v = v();
            if (v != null) {
                v.H();
                return;
            }
            return;
        }
        if (this.P != null) {
            W(this, false, 7);
        } else {
            Y(this, false, 7);
        }
    }

    public final void I() {
        if (this.b0) {
            return;
        }
        if (this.n0.b.getChild$ui() != null || this.t0 != null) {
            this.Z = true;
            return;
        }
        ki4 ki4Var = this.a0;
        this.b0 = true;
        r24 r24Var = new r24();
        r24Var.I = new ki4();
        sh3 snapshotObserver = za2.a(this).getSnapshotObserver();
        k9 k9Var = new k9(this, r24Var, (byte) 8);
        snapshotObserver.a.d(this, snapshotObserver.d, k9Var);
        this.b0 = false;
        this.a0 = (ki4) r24Var.I;
        this.Z = false;
        qh3 a = za2.a(this);
        a.getSemanticsOwner().b(this, ki4Var);
        a.onSemanticsChange();
    }

    public final void J() {
        wa2 wa2Var;
        if (this.Q > 0) {
            this.T = true;
        }
        if (!this.I || (wa2Var = this.U) == null) {
            return;
        }
        wa2Var.J();
    }

    public final boolean K() {
        return this.V != null;
    }

    public final boolean L() {
        return this.o0.p.a0;
    }

    public final Boolean M() {
        ns2 ns2Var = this.o0.q;
        if (ns2Var != null) {
            return Boolean.valueOf(ns2Var.r0());
        }
        return null;
    }

    public final void N() {
        if (this.k0 == ua2.K) {
            f();
        }
        ns2 ns2Var = this.o0.q;
        ns2Var.getClass();
        ns2Var.D0();
    }

    public final void O(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            da daVar = this.R;
            b53 b53Var = (b53) daVar.J;
            eq eqVar = (eq) daVar.K;
            Object l = b53Var.l(i5);
            eqVar.invoke();
            ((b53) daVar.J).b(i6, (wa2) l);
            eqVar.invoke();
        }
        R();
        J();
        H();
    }

    public final void P(wa2 wa2Var) {
        if (wa2Var.o0.l > 0) {
            this.o0.c(r0.l - 1);
        }
        if (this.V != null) {
            wa2Var.h();
        }
        wa2Var.U = null;
        if (wa2Var.x0 > 0) {
            d0(this.x0 - 1);
        }
        wa2Var.n0.d.e0 = null;
        if (wa2Var.I) {
            this.Q--;
            b53 b53Var = (b53) wa2Var.R.J;
            Object[] objArr = b53Var.I;
            int i = b53Var.K;
            for (int i2 = 0; i2 < i; i2++) {
                ((wa2) objArr[i2]).n0.d.e0 = null;
            }
        }
        J();
        R();
    }

    public final void Q(na3 na3Var) {
        qh3 qh3Var = this.V;
        o14 rectManager = qh3Var != null ? qh3Var.getRectManager() : null;
        ab2 ab2Var = this.o0;
        boolean z = ab2Var.d != sa2.M || r() || q();
        if (this.O != -4 && rectManager != null) {
            if (na3Var == this.n0.d) {
                this.N = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.M = true;
                b53 A = A();
                Object[] objArr = A.I;
                int i = A.K;
                for (int i2 = 0; i2 < i; i2++) {
                    wa2 wa2Var = (wa2) objArr[i2];
                    wa2Var.N = true;
                    if (!z) {
                        rectManager.g(wa2Var);
                    }
                }
                if (this.O != -4) {
                    rectManager.f = true;
                    int d = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.b;
                    int i3 = d + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        ab2Var.p.q0();
    }

    public final void R() {
        if (!this.I) {
            this.d0 = true;
            return;
        }
        wa2 v = v();
        if (v != null) {
            v.R();
        }
    }

    public final void S() {
        da daVar = this.R;
        int i = ((b53) daVar.J).K;
        while (true) {
            i--;
            b53 b53Var = (b53) daVar.J;
            if (-1 >= i) {
                b53Var.h();
                ((eq) daVar.K).invoke();
                return;
            }
            P((wa2) b53Var.I[i]);
        }
    }

    public final void T(int i, int i2) {
        if (i2 < 0) {
            q02.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            da daVar = this.R;
            P((wa2) ((b53) daVar.J).I[i3]);
            Object l = ((b53) daVar.J).l(i3);
            ((eq) daVar.K).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void U() {
        wa2 v;
        if (this.k0 == ua2.K) {
            f();
        }
        tw2 tw2Var = this.o0.p;
        ab2 ab2Var = tw2Var.N;
        try {
            tw2Var.O = true;
            if (!tw2Var.S) {
                q02.b("replace called on unplaced item");
            }
            boolean z = tw2Var.a0;
            tw2Var.o0(tw2Var.V, tw2Var.X, tw2Var.W);
            if (z && !tw2Var.n0 && (v = ab2Var.a.v()) != null) {
                v.X(false);
            }
        } finally {
        }
    }

    public final void V(boolean z) {
        qh3 qh3Var;
        if (this.I || (qh3Var = this.V) == null) {
            return;
        }
        qh3Var.onRequestRelayout(this, true, z);
    }

    public final void X(boolean z) {
        qh3 qh3Var;
        if (this.I || (qh3Var = this.V) == null) {
            return;
        }
        qh3Var.onRequestRelayout(this, false, z);
    }

    public final void a(l13 l13Var) {
        int i;
        p15 p15Var;
        ja3 ja3Var;
        ja3 ja3Var2;
        ia3 ia3Var;
        e43 e43Var;
        int i2;
        e43 e43Var2;
        boolean z;
        ja3 ja3Var3;
        ja3 ja3Var4 = this.n0;
        boolean c = ja3Var4.c(16);
        p15 p15Var2 = ja3Var4.e;
        boolean c2 = ja3Var4.c(1024);
        this.s0 = l13Var;
        x02 x02Var = ja3Var4.c;
        wa2 wa2Var = ja3Var4.a;
        k13 k13Var = ja3Var4.f;
        ia3 ia3Var2 = ja3Var4.b;
        if (k13Var == ia3Var2) {
            q02.b("padChain called on already padded chain");
        }
        k13 k13Var2 = ja3Var4.f;
        k13Var2.setParent$ui(ia3Var2);
        ia3Var2.setChild$ui(k13Var2);
        e43 e43Var3 = ja3Var4.g;
        int i3 = e43Var3.b;
        wa2 wa2Var2 = wa2Var;
        for (wa2 v = wa2Var.v(); v != null; v = v.v()) {
            wa2Var2 = v;
        }
        ja3 ja3Var5 = wa2Var2.n0;
        e43 e43Var4 = ja3Var5.h;
        if (e43Var4 == null) {
            e43Var4 = new e43();
            ja3Var5.h = e43Var4;
        }
        int i4 = e43Var4.b - 1;
        e43 e43Var5 = i4 >= 0 ? (e43) e43Var4.l(i4) : new e43();
        e43 e43Var6 = ja3Var5.i;
        if (e43Var6 == null) {
            e43Var6 = new e43();
        }
        boolean z2 = true;
        ja3Var5.i = null;
        e43Var6.a(l13Var);
        i9 i9Var = null;
        while (e43Var6.j()) {
            l13 l13Var2 = (l13) e43Var6.l(e43Var6.b - 1);
            i9 i9Var2 = i9Var;
            if (l13Var2 instanceof pa0) {
                pa0 pa0Var = (pa0) l13Var2;
                e43Var6.a(pa0Var.b);
                e43Var6.a(pa0Var.a);
            } else if (l13Var2 instanceof j13) {
                e43Var5.a(l13Var2);
            } else {
                if (i9Var2 == null) {
                    ja3Var3 = ja3Var4;
                    i9Var = new i9(e43Var5, (byte) 17);
                } else {
                    ja3Var3 = ja3Var4;
                    i9Var = i9Var2;
                }
                l13Var2.all(i9Var);
                ja3Var4 = ja3Var3;
            }
            i9Var = i9Var2;
            ja3Var3 = ja3Var4;
            ja3Var4 = ja3Var3;
        }
        ja3 ja3Var6 = ja3Var4;
        int i5 = e43Var5.b;
        int i6 = 0;
        if (i5 == i3) {
            k13 child$ui = ia3Var2.getChild$ui();
            i = 0;
            while (child$ui != null && i6 < i3) {
                j13 j13Var = (j13) e43Var3.g(i6);
                j13 j13Var2 = (j13) e43Var5.g(i6);
                if (j42.c(j13Var, j13Var2)) {
                    e43Var2 = e43Var3;
                    p15Var = p15Var2;
                    z = 2;
                } else {
                    e43Var2 = e43Var3;
                    p15Var = p15Var2;
                    z = j13Var.getClass() == j13Var2.getClass() ? z2 : false;
                }
                if (!z) {
                    child$ui = child$ui.getParent$ui();
                    break;
                }
                if (z == z2) {
                    ja3.h(j13Var, j13Var2, child$ui);
                }
                child$ui = child$ui.getChild$ui();
                i6++;
                e43Var3 = e43Var2;
                p15Var2 = p15Var;
                z2 = true;
            }
            e43Var2 = e43Var3;
            p15Var = p15Var2;
            k13 k13Var3 = child$ui;
            if (i6 >= i3) {
                ja3Var = ja3Var6;
                e43Var3 = e43Var2;
                ja3Var2 = ja3Var;
                ia3Var = ia3Var2;
                e43Var = e43Var5;
                i2 = i;
            } else {
                if (k13Var3 == null) {
                    throw r7.t("structuralUpdate requires a non-null tail");
                }
                boolean z3 = wa2Var.t0 != null;
                e43Var = e43Var5;
                ja3Var2 = ja3Var6;
                e43Var3 = e43Var2;
                ja3Var2.f(i6, e43Var3, e43Var, k13Var3, !z3);
                ia3Var = ia3Var2;
                i2 = 1;
            }
        } else {
            i = 0;
            p15Var = p15Var2;
            ja3Var = ja3Var6;
            l13 l13Var3 = wa2Var.t0;
            if (l13Var3 != null && i3 == 0) {
                k13 k13Var4 = ia3Var2;
                for (int i7 = 0; i7 < e43Var5.b; i7++) {
                    k13Var4 = ja3.a((j13) e43Var5.g(i7), k13Var4);
                }
                k13 parent$ui = p15Var.getParent$ui();
                while (parent$ui != null && parent$ui != ia3Var2) {
                    int kindSet$ui = i | parent$ui.getKindSet$ui();
                    parent$ui.setAggregateChildKindSet$ui(kindSet$ui);
                    parent$ui = parent$ui.getParent$ui();
                    i = kindSet$ui;
                }
                ja3Var2 = ja3Var;
                ia3Var = ia3Var2;
                e43Var = e43Var5;
                i2 = 1;
            } else if (i5 == 0) {
                k13 child$ui2 = ia3Var2.getChild$ui();
                for (int i8 = 0; child$ui2 != null && i8 < e43Var3.b; i8++) {
                    child$ui2 = ja3.b(child$ui2).getChild$ui();
                }
                wa2 v2 = wa2Var.v();
                x02Var.e0 = v2 != null ? v2.n0.c : null;
                ja3Var.d = x02Var;
                ja3Var2 = ja3Var;
                ia3Var = ia3Var2;
                e43Var = e43Var5;
                i2 = i;
            } else {
                ja3Var2 = ja3Var;
                ia3Var = ia3Var2;
                e43Var = e43Var5;
                ja3Var2.f(0, e43Var3, e43Var, ia3Var, !(l13Var3 != null));
                i2 = 1;
            }
        }
        ja3Var2.g = e43Var;
        e43Var3.d();
        e43Var4.a(e43Var3);
        e43Var6.d();
        ja3Var5.i = e43Var6;
        k13 child$ui3 = ia3Var.getChild$ui();
        k13 k13Var5 = child$ui3 == null ? p15Var : child$ui3;
        k13Var5.setParent$ui(null);
        ia3Var.setChild$ui(null);
        ia3Var.setAggregateChildKindSet$ui(-1);
        ia3Var.updateCoordinator$ui(null);
        if (k13Var5 == ia3Var) {
            q02.b("trimChain did not update the head");
        }
        ja3Var2.f = k13Var5;
        if (i2 != 0) {
            ja3Var2.g();
        }
        boolean c3 = ja3Var2.c(16);
        boolean c4 = ja3Var2.c(1024);
        this.o0.i();
        if (this.P == null && ja3Var2.c(512)) {
            e0(this);
        }
        if (c == c3 && c2 == c4) {
            return;
        }
        o14 rectManager = za2.a(this).getRectManager();
        rectManager.getClass();
        if (!K() || this.O == -4) {
            return;
        }
        tl tlVar = rectManager.c;
        int d = rectManager.d(this);
        long[] jArr = (long[]) tlVar.b;
        int i9 = d + 2;
        jArr[i9] = ((c3 ? 1L : 0L) * 4611686018427387904L) | (jArr[i9] & (-6917529027641081857L)) | ((c4 ? 1L : 0L) * 2305843009213693952L);
    }

    public final void a0() {
        b53 A = A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var = (wa2) objArr[i2];
            ua2 ua2Var = wa2Var.l0;
            wa2Var.k0 = ua2Var;
            if (ua2Var != ua2.K) {
                wa2Var.a0();
            }
        }
    }

    @Override // defpackage.ld0
    public final void b() {
        ir5 ir5Var = this.W;
        if (ir5Var != null) {
            ir5Var.b();
        }
        kb2 kb2Var = this.p0;
        if (kb2Var != null) {
            kb2Var.b();
        }
        ja3 ja3Var = this.n0;
        na3 na3Var = ja3Var.c.d0;
        for (na3 na3Var2 = ja3Var.d; !j42.c(na3Var2, na3Var) && na3Var2 != null; na3Var2 = na3Var2.d0) {
            na3Var2.X0();
        }
    }

    public final void b0(Throwable th) {
        af0 af0Var = this.j0;
        i51 a = ve0.a();
        zl3 zl3Var = (zl3) af0Var;
        zl3Var.getClass();
        ue0 ue0Var = (ue0) p70.r0(zl3Var, a);
        if (ue0Var == null) {
            throw th;
        }
        c5.m0(th, new ka(ue0Var, this, (byte) 12));
        throw th;
    }

    public final void c(qh3 qh3Var) {
        wa2 wa2Var;
        if (this.V != null) {
            q02.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        wa2 wa2Var2 = this.U;
        if (wa2Var2 != null && !j42.c(wa2Var2.V, qh3Var)) {
            wa2 v = v();
            qh3 qh3Var2 = v != null ? v.V : null;
            String g = g(0);
            wa2 wa2Var3 = this.U;
            q02.b("Attaching to a different owner(" + qh3Var + ") than the parent's owner(" + qh3Var2 + "). This tree: " + g + " Parent tree: " + (wa2Var3 != null ? wa2Var3.g(0) : null));
        }
        wa2 v2 = v();
        ab2 ab2Var = this.o0;
        if (v2 == null) {
            ab2Var.p.a0 = true;
            qh3Var.getRectManager().g(this);
            ns2 ns2Var = ab2Var.q;
            if (ns2Var != null) {
                ns2Var.w0();
            }
        }
        ja3 ja3Var = this.n0;
        ja3Var.d.e0 = v2 != null ? v2.n0.c : null;
        this.V = qh3Var;
        this.X = (v2 != null ? v2.X : -1) + 1;
        l13 l13Var = this.t0;
        if (l13Var != null) {
            a(l13Var);
        }
        this.t0 = null;
        qh3Var.onPreAttach(this);
        wa2 wa2Var4 = this.U;
        if (wa2Var4 == null || (wa2Var = wa2Var4.P) == null) {
            wa2Var = this.P;
        }
        e0(wa2Var);
        if (this.P == null && ja3Var.c(512)) {
            e0(this);
        }
        if (!this.y0) {
            for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                k13Var.markAsAttached$ui();
            }
        }
        b53 b53Var = (b53) this.R.J;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((wa2) objArr[i2]).c(qh3Var);
        }
        if (!this.y0) {
            ja3Var.e();
        }
        H();
        if (v2 != null) {
            v2.H();
        }
        jg jgVar = this.u0;
        if (jgVar != null) {
            jgVar.invoke(qh3Var);
        }
        ab2Var.i();
        if (!this.y0 && ja3Var.c(8)) {
            I();
        }
        qh3Var.onPostAttach(this);
    }

    public final void c0(iu0 iu0Var) {
        if (j42.c(this.g0, iu0Var)) {
            return;
        }
        this.g0 = iu0Var;
        H();
        wa2 v = v();
        if (v != null) {
            v.E();
        } else {
            qh3 qh3Var = this.V;
            if (qh3Var != null) {
                qh3Var.invalidateRootLayer();
            }
        }
        F();
        for (k13 k13Var = this.n0.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.onDensityChange();
        }
    }

    @Override // defpackage.ld0
    public final void d() {
        ir5 ir5Var = this.W;
        if (ir5Var != null) {
            ir5Var.d();
        }
        kb2 kb2Var = this.p0;
        if (kb2Var != null) {
            kb2Var.j(true);
        }
        this.y0 = true;
        k13 k13Var = this.n0.e;
        for (k13 k13Var2 = k13Var; k13Var2 != null; k13Var2 = k13Var2.getParent$ui()) {
            if (k13Var2.isAttached()) {
                k13Var2.reset$ui();
            }
        }
        for (k13 k13Var3 = k13Var; k13Var3 != null; k13Var3 = k13Var3.getParent$ui()) {
            if (k13Var3.isAttached()) {
                k13Var3.runDetachLifecycle$ui();
            }
        }
        while (k13Var != null) {
            if (k13Var.isAttached()) {
                k13Var.markAsDetached$ui();
            }
            k13Var = k13Var.getParent$ui();
        }
        if (K()) {
            this.a0 = null;
            this.Z = false;
        }
        qh3 qh3Var = this.V;
        if (qh3Var != null) {
            qh3Var.onLayoutNodeDeactivated(this);
        }
    }

    public final void d0(int i) {
        wa2 v;
        wa2 v2;
        int i2 = this.x0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.d0(v2.x0 + 1);
            }
            if (i == 0 && this.x0 > 0 && (v = v()) != null) {
                v.d0(v.x0 - 1);
            }
            this.x0 = i;
        }
    }

    public final void e() {
        this.l0 = this.k0;
        ua2 ua2Var = ua2.K;
        this.k0 = ua2Var;
        b53 A = A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var = (wa2) objArr[i2];
            if (wa2Var.k0 != ua2Var) {
                wa2Var.e();
            }
        }
    }

    public final void e0(wa2 wa2Var) {
        if (j42.c(wa2Var, this.P)) {
            return;
        }
        this.P = wa2Var;
        ab2 ab2Var = this.o0;
        if (wa2Var != null) {
            if (ab2Var.q == null) {
                ab2Var.q = new ns2(ab2Var);
            }
            ja3 ja3Var = this.n0;
            na3 na3Var = ja3Var.c.d0;
            for (na3 na3Var2 = ja3Var.d; !j42.c(na3Var2, na3Var) && na3Var2 != null; na3Var2 = na3Var2.d0) {
                na3Var2.F0();
            }
        } else {
            ab2Var.q = null;
            ab2Var.f = false;
            ab2Var.e = false;
        }
        H();
    }

    public final void f() {
        this.l0 = this.k0;
        this.k0 = ua2.K;
        b53 A = A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var = (wa2) objArr[i2];
            if (wa2Var.k0 == ua2.J) {
                wa2Var.f();
            }
        }
    }

    public final void f0(uw2 uw2Var) {
        if (j42.c(this.e0, uw2Var)) {
            return;
        }
        this.e0 = uw2Var;
        g12 g12Var = this.f0;
        if (g12Var != null) {
            g12Var.Y(uw2Var);
        }
        H();
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        b53 A = A();
        Object[] objArr = A.I;
        int i3 = A.K;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((wa2) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void g0(l13 l13Var) {
        if (this.I && this.s0 != i13.a) {
            q02.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.y0) {
            q02.a("modifier is updated when deactivated");
        }
        if (!K()) {
            this.t0 = l13Var;
            return;
        }
        a(l13Var);
        if (this.Z) {
            I();
        }
    }

    public final void h() {
        c9 a;
        qh3 qh3Var = this.V;
        if (qh3Var == null) {
            wa2 v = v();
            q02.c("Cannot detach node that is already detached!  Tree: " + (v != null ? v.g(0) : null));
            zy.n();
            return;
        }
        wa2 v2 = v();
        ab2 ab2Var = this.o0;
        if (v2 != null) {
            v2.E();
            v2.H();
            ab2Var.p.T = ua2.K;
            ns2 ns2Var = ab2Var.q;
            if (ns2Var != null) {
                ns2Var.F0();
            }
        }
        xa2 xa2Var = ab2Var.p.f0;
        xa2Var.b = true;
        xa2Var.c = false;
        xa2Var.e = false;
        xa2Var.d = false;
        xa2Var.f = false;
        xa2Var.g = false;
        xa2Var.h = null;
        ns2 ns2Var2 = ab2Var.q;
        if (ns2Var2 != null && (a = ns2Var2.a()) != null) {
            a.b = true;
            a.c = false;
            a.e = false;
            a.d = false;
            a.f = false;
            a.g = false;
            a.h = null;
        }
        ja3 ja3Var = this.n0;
        k13 k13Var = ja3Var.e;
        na3 na3Var = ja3Var.c.d0;
        for (na3 na3Var2 = ja3Var.d; !j42.c(na3Var2, na3Var) && na3Var2 != null; na3Var2 = na3Var2.d0) {
            na3Var2.d1();
            if (na3Var2.c0.L()) {
                na3Var2.Y0();
            }
        }
        kg kgVar = this.v0;
        if (kgVar != null) {
            kgVar.invoke(qh3Var);
        }
        for (k13 k13Var2 = k13Var; k13Var2 != null; k13Var2 = k13Var2.getParent$ui()) {
            if (k13Var2.isAttached()) {
                k13Var2.runDetachLifecycle$ui();
            }
        }
        this.Y = true;
        b53 b53Var = (b53) this.R.J;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((wa2) objArr[i2]).h();
        }
        this.Y = false;
        while (k13Var != null) {
            if (k13Var.isAttached()) {
                k13Var.markAsDetached$ui();
            }
            k13Var = k13Var.getParent$ui();
        }
        qh3Var.onDetach(this);
        qh3Var.getRectManager().h(this);
        this.V = null;
        e0(null);
        this.X = 0;
        tw2 tw2Var = ab2Var.p;
        tw2Var.Q = Log.LOG_LEVEL_OFF;
        tw2Var.P = Log.LOG_LEVEL_OFF;
        tw2Var.a0 = false;
        ns2 ns2Var3 = ab2Var.q;
        if (ns2Var3 != null) {
            ns2Var3.y0();
        }
        if (ja3Var.c(8)) {
            ki4 ki4Var = this.a0;
            this.a0 = null;
            this.Z = false;
            qh3Var.getSemanticsOwner().b(this, ki4Var);
            qh3Var.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void h0(gr5 gr5Var) {
        if (j42.c(this.i0, gr5Var)) {
            return;
        }
        this.i0 = gr5Var;
        ja3 ja3Var = this.n0;
        if ((ja3Var.f.getAggregateChildKindSet$ui() & 16) != 0) {
            for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                if ((k13Var.getKindSet$ui() & 16) != 0) {
                    wt0 wt0Var = k13Var;
                    ?? r2 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof vp3) {
                            ((vp3) wt0Var).e0();
                        } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var2 = wt0Var.J;
                            int i = 0;
                            wt0Var = wt0Var;
                            r2 = r2;
                            while (k13Var2 != null) {
                                if ((k13Var2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        wt0Var = k13Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new b53(new k13[16]);
                                        }
                                        if (wt0Var != 0) {
                                            r2.c(wt0Var);
                                            wt0Var = 0;
                                        }
                                        r2.c(k13Var2);
                                    }
                                }
                                k13Var2 = k13Var2.getChild$ui();
                                wt0Var = wt0Var;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        wt0Var = ut0.M(r2);
                    }
                }
                if ((k13Var.getAggregateChildKindSet$ui() & 16) == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ld0
    public final void i() {
        o14 rectManager;
        o14 rectManager2;
        if (!K()) {
            q02.a("onReuse is only expected on attached node");
        }
        ir5 ir5Var = this.W;
        if (ir5Var != null) {
            ir5Var.i();
        }
        kb2 kb2Var = this.p0;
        if (kb2Var != null) {
            kb2Var.j(false);
        }
        this.b0 = false;
        boolean z = this.y0;
        ja3 ja3Var = this.n0;
        if (z) {
            this.y0 = false;
        } else {
            k13 k13Var = ja3Var.e;
            for (k13 k13Var2 = k13Var; k13Var2 != null; k13Var2 = k13Var2.getParent$ui()) {
                if (k13Var2.isAttached()) {
                    k13Var2.reset$ui();
                }
            }
            for (k13 k13Var3 = k13Var; k13Var3 != null; k13Var3 = k13Var3.getParent$ui()) {
                if (k13Var3.isAttached()) {
                    k13Var3.runDetachLifecycle$ui();
                }
            }
            while (k13Var != null) {
                if (k13Var.isAttached()) {
                    k13Var.markAsDetached$ui();
                }
                k13Var = k13Var.getParent$ui();
            }
        }
        int i = this.J;
        qh3 qh3Var = this.V;
        if (qh3Var != null && (rectManager2 = qh3Var.getRectManager()) != null) {
            rectManager2.h(this);
        }
        this.J = oi4.a.addAndGet(1);
        qh3 qh3Var2 = this.V;
        if (qh3Var2 != null) {
            qh3Var2.onPreLayoutNodeReused(this, i);
        }
        for (k13 k13Var4 = ja3Var.f; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
            k13Var4.markAsAttached$ui();
        }
        ja3Var.e();
        if (ja3Var.c(8)) {
            I();
        }
        Z(this);
        qh3 qh3Var3 = this.V;
        if (qh3Var3 != null) {
            qh3Var3.onPostLayoutNodeReused(this, i);
        }
        qh3 qh3Var4 = this.V;
        if (qh3Var4 == null || (rectManager = qh3Var4.getRectManager()) == null) {
            return;
        }
        rectManager.g(this);
    }

    public final void i0() {
        if (this.Q <= 0 || !this.T) {
            return;
        }
        this.T = false;
        b53 b53Var = this.S;
        if (b53Var == null) {
            b53Var = new b53(new wa2[16]);
            this.S = b53Var;
        }
        b53Var.h();
        b53 b53Var2 = (b53) this.R.J;
        Object[] objArr = b53Var2.I;
        int i = b53Var2.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var = (wa2) objArr[i2];
            if (wa2Var.I) {
                b53Var.d(b53Var.K, wa2Var.A());
            } else {
                b53Var.c(wa2Var);
            }
        }
        ab2 ab2Var = this.o0;
        ab2Var.p.h0 = true;
        ns2 ns2Var = ab2Var.q;
        if (ns2Var != null) {
            ns2Var.E0();
        }
    }

    public final void k() {
        if (this.P != null) {
            W(this, false, 5);
        } else {
            Y(this, false, 5);
        }
        tw2 tw2Var = this.o0.p;
        dh0 dh0Var = tw2Var.R ? new dh0(tw2Var.L) : null;
        qh3 qh3Var = this.V;
        if (dh0Var != null) {
            if (qh3Var != null) {
                qh3Var.mo22measureAndLayout0kLqBqw(this, dh0Var.a);
            }
        } else if (qh3Var != null) {
            qh3Var.measureAndLayout(true);
        }
    }

    @Override // defpackage.rh3
    public final boolean l() {
        return K();
    }

    public final List m() {
        ns2 ns2Var = this.o0.q;
        ns2Var.getClass();
        return ns2Var.j0();
    }

    public final List n() {
        return this.o0.p.j0();
    }

    public final List o() {
        return A().g();
    }

    public final List p() {
        return ((b53) this.R.J).g();
    }

    public final boolean q() {
        return this.o0.p.d0;
    }

    public final boolean r() {
        return this.o0.p.c0;
    }

    public final ua2 s() {
        return this.o0.p.T;
    }

    public final ua2 t() {
        ua2 m0;
        ns2 ns2Var = this.o0.q;
        return (ns2Var == null || (m0 = ns2Var.m0()) == null) ? ua2.K : m0;
    }

    public final String toString() {
        return e21.P(this) + " children: " + ((a53) o()).I.K + " measurePolicy: " + this.e0 + " deactivated: " + this.y0 + " isVirtual: " + this.I + " isPlaced: " + L();
    }

    public final g12 u() {
        g12 g12Var = this.f0;
        if (g12Var != null) {
            return g12Var;
        }
        g12 g12Var2 = new g12(this, this.e0);
        this.f0 = g12Var2;
        return g12Var2;
    }

    public final wa2 v() {
        wa2 wa2Var = this.U;
        while (wa2Var != null && wa2Var.I) {
            wa2Var = wa2Var.U;
        }
        return wa2Var;
    }

    public final int w() {
        return this.o0.p.Q;
    }

    public final ki4 x() {
        if (K() && !this.y0 && this.n0.c(8)) {
            return this.a0;
        }
        return null;
    }

    public final float y() {
        return this.o0.p.m0;
    }

    public final b53 z() {
        boolean z = this.d0;
        b53 b53Var = this.c0;
        if (z) {
            b53Var.h();
            b53Var.d(b53Var.K, A());
            Arrays.sort(b53Var.I, 0, b53Var.K, C0);
            this.d0 = false;
        }
        return b53Var;
    }

    public wa2(int i) {
        this((i & 1) == 0, oi4.a.addAndGet(1));
    }
}
