package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rw2 {
    public final wa2 a;
    public boolean c;
    public boolean d;
    public dh0 h;
    public final pn b = new pn((byte) 4);
    public final da e = new da((byte) 5);
    public final b53 f = new b53(new ph3[16]);
    public final b53 g = new b53(new qw2[16]);

    public rw2(wa2 wa2Var) {
        this.a = wa2Var;
    }

    public static boolean b(wa2 wa2Var, dh0 dh0Var) {
        boolean C0;
        wa2 wa2Var2 = wa2Var.P;
        ab2 ab2Var = wa2Var.o0;
        if (wa2Var2 == null) {
            return false;
        }
        if (dh0Var != null) {
            if (wa2Var2 != null) {
                ns2 ns2Var = ab2Var.q;
                ns2Var.getClass();
                C0 = ns2Var.C0(dh0Var.a);
            }
            C0 = false;
        } else {
            ns2 ns2Var2 = ab2Var.q;
            dh0 k0 = ns2Var2 != null ? ns2Var2.k0() : null;
            if (k0 != null && wa2Var.P != null) {
                ns2 ns2Var3 = ab2Var.q;
                ns2Var3.getClass();
                C0 = ns2Var3.C0(k0.a);
            }
            C0 = false;
        }
        wa2 v = wa2Var.v();
        if (C0 && v != null) {
            if (v.P == null) {
                wa2.Y(v, false, 3);
                return C0;
            }
            if (wa2Var.t() == ua2.I) {
                wa2.W(v, false, 3);
                return C0;
            }
            if (wa2Var.t() == ua2.J) {
                v.V(false);
            }
        }
        return C0;
    }

    public static boolean c(wa2 wa2Var, dh0 dh0Var) {
        boolean z;
        ua2 ua2Var = ua2.K;
        if (dh0Var != null) {
            if (wa2Var.k0 == ua2Var) {
                wa2Var.e();
            }
            z = wa2Var.o0.p.p0(dh0Var.a);
        } else {
            tw2 tw2Var = wa2Var.o0.p;
            dh0 dh0Var2 = tw2Var.R ? new dh0(tw2Var.L) : null;
            if (dh0Var2 != null) {
                if (wa2Var.k0 == ua2Var) {
                    wa2Var.e();
                }
                z = wa2Var.o0.p.p0(dh0Var2.a);
            } else {
                z = false;
            }
        }
        wa2 v = wa2Var.v();
        if (z && v != null) {
            if (wa2Var.s() == ua2.I) {
                wa2.Y(v, false, 3);
                return z;
            }
            if (wa2Var.s() == ua2.J) {
                v.X(false);
            }
        }
        return z;
    }

    public static boolean h(wa2 wa2Var) {
        ns2 ns2Var;
        c9 a;
        if (wa2Var.o0.e) {
            return (wa2Var.t() == ua2.K && ((ns2Var = wa2Var.o0.q) == null || (a = ns2Var.a()) == null || !a.f())) ? false : true;
        }
        return false;
    }

    public static boolean i(wa2 wa2Var) {
        if (!wa2Var.r()) {
            return false;
        }
        do {
            if (wa2Var.s() == ua2.K && !wa2Var.o0.p.f0.f()) {
                wa2 v = wa2Var.v();
                if ((v != null ? v.o0.d : null) != sa2.I) {
                    return false;
                }
            }
            wa2Var = wa2Var.v();
            if (wa2Var == null) {
                return false;
            }
        } while (!wa2Var.L());
        return true;
    }

    public static boolean j(wa2 wa2Var) {
        ns2 ns2Var;
        c9 a;
        boolean L = wa2Var.L();
        ab2 ab2Var = wa2Var.o0;
        return L || ab2Var.p.b0 || i(wa2Var) || j42.c(wa2Var.M(), Boolean.TRUE) || h(wa2Var) || ab2Var.p.f0.f() || !((ns2Var = ab2Var.q) == null || (a = ns2Var.a()) == null || !a.f());
    }

    public final void a(boolean z) {
        da daVar = this.e;
        b53 b53Var = (b53) daVar.J;
        if (z) {
            wa2 wa2Var = this.a;
            if (wa2Var.x0 > 0) {
                b53Var.h();
                b53Var.c(wa2Var);
                wa2Var.w0 = true;
            }
        }
        if (b53Var.K != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                daVar.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void d() {
        b53 b53Var = this.g;
        int i = b53Var.K;
        if (i != 0) {
            Object[] objArr = b53Var.I;
            for (int i2 = 0; i2 < i; i2++) {
                qw2 qw2Var = (qw2) objArr[i2];
                if (qw2Var.a.K()) {
                    boolean z = qw2Var.b;
                    wa2 wa2Var = qw2Var.a;
                    boolean z2 = qw2Var.c;
                    if (z) {
                        wa2.W(wa2Var, z2, 2);
                    } else {
                        wa2.Y(wa2Var, z2, 2);
                    }
                }
            }
            b53Var.h();
        }
    }

    public final void e(wa2 wa2Var) {
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (j42.c(wa2Var2.M(), Boolean.TRUE) && !wa2Var2.y0) {
                if (this.b.m(wa2Var2)) {
                    wa2Var2.N();
                }
                e(wa2Var2);
            }
        }
    }

    public final void f(wa2 wa2Var, boolean z) {
        if (!this.c) {
            q02.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? wa2Var.o0.e : wa2Var.r()) {
            q02.a("node not yet measured");
        }
        g(wa2Var, z);
    }

    public final void g(wa2 wa2Var, boolean z) {
        ns2 ns2Var;
        c9 a;
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            ua2 ua2Var = ua2.I;
            if ((!z && (wa2Var2.s() == ua2Var || wa2Var2.o0.p.f0.f())) || (z && (wa2Var2.t() == ua2Var || ((ns2Var = wa2Var2.o0.q) != null && (a = ns2Var.a()) != null && a.f())))) {
                boolean G = sv2.G(wa2Var2);
                ab2 ab2Var = wa2Var2.o0;
                if (G && !z) {
                    if (ab2Var.e && this.b.m(wa2Var2)) {
                        o(wa2Var2, true);
                    } else {
                        f(wa2Var2, true);
                    }
                }
                if (z ? ab2Var.e : wa2Var2.r()) {
                    o(wa2Var2, z);
                }
                if (!(z ? ab2Var.e : wa2Var2.r())) {
                    g(wa2Var2, z);
                }
            }
        }
        if (z ? wa2Var.o0.e : wa2Var.r()) {
            o(wa2Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [k13] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean k(rm1 rm1Var) {
        boolean z;
        k13 k13Var;
        boolean z2;
        wa2 wa2Var;
        boolean z3;
        boolean o;
        pn pnVar = this.b;
        ep epVar = (ep) pnVar.b;
        wa2 wa2Var2 = this.a;
        if (!wa2Var2.K()) {
            q02.a("performMeasureAndLayout called with unattached root");
        }
        if (!wa2Var2.L()) {
            q02.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            q02.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (pnVar.M()) {
                    z = false;
                    while (true) {
                        ep epVar2 = (ep) pnVar.d;
                        st4 st4Var = (st4) epVar2.J;
                        ep epVar3 = (ep) pnVar.c;
                        st4 st4Var2 = (st4) epVar3.J;
                        if (!((st4) epVar.J).isEmpty()) {
                            wa2Var = (wa2) ((st4) epVar.J).first();
                            epVar.E(wa2Var);
                            z3 = wa2Var.P != null;
                            z2 = false;
                        } else if (!st4Var2.isEmpty()) {
                            wa2Var = (wa2) st4Var2.first();
                            epVar3.E(wa2Var);
                            z3 = wa2Var.P != null;
                            z2 = true;
                        } else {
                            if (st4Var.isEmpty()) {
                                break;
                            }
                            wa2 wa2Var3 = (wa2) st4Var.first();
                            epVar2.E(wa2Var3);
                            z2 = true;
                            wa2Var = wa2Var3;
                            z3 = false;
                        }
                        if (z2) {
                            o = n(wa2Var, z3);
                        } else {
                            o = o(wa2Var, z3);
                            if (wa2Var.o0.f) {
                                pnVar.j(wa2Var, a52.J);
                            }
                            if (wa2Var.q()) {
                                pnVar.j(wa2Var, a52.L);
                            }
                        }
                        if (wa2Var == wa2Var2 && o) {
                            z = true;
                        }
                    }
                    if (rm1Var != null) {
                        rm1Var.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        b53 b53Var = this.f;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        int i2 = 0;
        while (i2 < i) {
            ja3 ja3Var = ((wa2) ((ph3) objArr[i2])).n0;
            x02 x02Var = ja3Var.c;
            boolean h = oa3.h(4194304);
            k13 k13Var2 = x02Var.J0;
            if (h || (k13Var2 = k13Var2.getParent$ui()) != null) {
                u73 u73Var = na3.C0;
                k13 N0 = x02Var.N0(h);
                while (N0 != null && (N0.getAggregateChildKindSet$ui() & 4194304) != 0) {
                    if ((N0.getKindSet$ui() & 4194304) != 0) {
                        wt0 wt0Var = N0;
                        b53 b53Var2 = null;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof y92) {
                                ((y92) wt0Var).f(ja3Var.c);
                            } else if ((wt0Var.getKindSet$ui() & 4194304) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var3 = wt0Var.J;
                                ?? r15 = z4;
                                k13Var = wt0Var;
                                b53Var2 = b53Var2;
                                while (k13Var3 != null) {
                                    if ((k13Var3.getKindSet$ui() & 4194304) != 0) {
                                        r15++;
                                        b53Var2 = b53Var2;
                                        if (r15 == 1) {
                                            k13Var = k13Var3;
                                        } else {
                                            if (b53Var2 == null) {
                                                b53Var2 = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var2.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var2.c(k13Var3);
                                        }
                                    }
                                    k13Var3 = k13Var3.getChild$ui();
                                    k13Var = k13Var;
                                    b53Var2 = b53Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                    z4 = false;
                                    wt0Var = k13Var;
                                    b53Var2 = b53Var2;
                                }
                            }
                            k13Var = ut0.M(b53Var2);
                            z4 = false;
                            wt0Var = k13Var;
                            b53Var2 = b53Var2;
                        }
                    }
                    if (N0 != k13Var2) {
                        N0 = N0.getChild$ui();
                        z4 = false;
                    }
                }
            }
            i2++;
            z4 = false;
        }
        b53Var.h();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void l(wa2 wa2Var, long j) {
        if (wa2Var.y0) {
            return;
        }
        wa2 wa2Var2 = this.a;
        if (wa2Var == wa2Var2) {
            q02.a("measureAndLayout called on root");
        }
        if (!wa2Var2.K()) {
            q02.a("performMeasureAndLayout called with unattached root");
        }
        if (!wa2Var2.L()) {
            q02.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            q02.a("performMeasureAndLayout called during measure layout");
        }
        if (this.h != null) {
            this.c = true;
            this.d = false;
            try {
                pn pnVar = this.b;
                ((ep) pnVar.b).E(wa2Var);
                ((ep) pnVar.c).E(wa2Var);
                ((ep) pnVar.d).E(wa2Var);
                if ((b(wa2Var, new dh0(j)) || wa2Var.o0.f) && j42.c(wa2Var.M(), Boolean.TRUE)) {
                    wa2Var.N();
                }
                e(wa2Var);
                c(wa2Var, new dh0(j));
                if (wa2Var.q() && wa2Var.L()) {
                    wa2Var.U();
                    da daVar = this.e;
                    if (wa2Var.x0 > 0) {
                        ((b53) daVar.J).c(wa2Var);
                        wa2Var.w0 = true;
                    }
                }
                d();
            } finally {
            }
        }
        b53 b53Var = this.f;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ja3 ja3Var = ((wa2) ((ph3) objArr[i2])).n0;
            x02 x02Var = ja3Var.c;
            boolean h = oa3.h(4194304);
            k13 k13Var = x02Var.J0;
            if (h || (k13Var = k13Var.getParent$ui()) != null) {
                u73 u73Var = na3.C0;
                for (k13 N0 = x02Var.N0(h); N0 != null && (N0.getAggregateChildKindSet$ui() & 4194304) != 0; N0 = N0.getChild$ui()) {
                    if ((N0.getKindSet$ui() & 4194304) != 0) {
                        wt0 wt0Var = N0;
                        ?? r8 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof y92) {
                                ((y92) wt0Var).f(ja3Var.c);
                            } else if ((wt0Var.getKindSet$ui() & 4194304) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var2 = wt0Var.J;
                                int i3 = 0;
                                wt0Var = wt0Var;
                                r8 = r8;
                                while (k13Var2 != null) {
                                    if ((k13Var2.getKindSet$ui() & 4194304) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            wt0Var = k13Var2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r8.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r8.c(k13Var2);
                                        }
                                    }
                                    k13Var2 = k13Var2.getChild$ui();
                                    wt0Var = wt0Var;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            wt0Var = ut0.M(r8);
                        }
                    }
                    if (N0 != k13Var) {
                    }
                }
            }
        }
        b53Var.h();
    }

    public final void m() {
        pn pnVar = this.b;
        if (pnVar.M()) {
            wa2 wa2Var = this.a;
            if (!wa2Var.K()) {
                q02.a("performMeasureAndLayout called with unattached root");
            }
            if (!wa2Var.L()) {
                q02.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                q02.a("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((st4) ((ep) pnVar.d).J).isEmpty() || ((st4) ((ep) pnVar.b).J).isEmpty()) ? false : true) {
                        if (wa2Var.P != null) {
                            q(wa2Var, true);
                        } else {
                            p(wa2Var);
                        }
                    }
                    q(wa2Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean n(wa2 wa2Var, boolean z) {
        dh0 dh0Var;
        wa2 v;
        boolean z2 = wa2Var.y0;
        ab2 ab2Var = wa2Var.o0;
        if (!z2 && j(wa2Var)) {
            wa2 wa2Var2 = this.a;
            if (wa2Var == wa2Var2) {
                dh0Var = this.h;
                dh0Var.getClass();
            } else {
                dh0Var = null;
            }
            if (z) {
                r2 = ab2Var.e ? b(wa2Var, dh0Var) : false;
                if ((r2 || ab2Var.f) && j42.c(wa2Var.M(), Boolean.TRUE)) {
                    wa2Var.N();
                }
            } else {
                boolean c = wa2Var.r() ? c(wa2Var, dh0Var) : false;
                if (wa2Var.q() && (wa2Var == wa2Var2 || ((v = wa2Var.v()) != null && v.L() && ab2Var.p.b0))) {
                    if (wa2Var == wa2Var2) {
                        if (wa2Var.k0 == ua2.K) {
                            wa2Var.f();
                        }
                        wa2 v2 = wa2Var.v();
                        an3.i(v2 != null ? v2.n0.c.X : za2.a(wa2Var).getPlacementScope(), ab2Var.p, 0, 0);
                    } else {
                        wa2Var.U();
                    }
                    if (wa2Var.x0 > 0) {
                        ((b53) this.e.J).c(wa2Var);
                        wa2Var.w0 = true;
                    }
                }
                r2 = c;
            }
            d();
        }
        return r2;
    }

    public final boolean o(wa2 wa2Var, boolean z) {
        dh0 dh0Var;
        boolean z2 = false;
        if (!wa2Var.y0 && j(wa2Var)) {
            if (wa2Var == this.a) {
                dh0Var = this.h;
                dh0Var.getClass();
            } else {
                dh0Var = null;
            }
            if (z) {
                if (wa2Var.o0.e) {
                    z2 = b(wa2Var, dh0Var);
                }
            } else if (wa2Var.r()) {
                z2 = c(wa2Var, dh0Var);
            }
            d();
        }
        return z2;
    }

    public final void p(wa2 wa2Var) {
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (wa2Var2.s() == ua2.I || wa2Var2.o0.p.f0.f()) {
                if (sv2.G(wa2Var2)) {
                    q(wa2Var2, true);
                } else {
                    p(wa2Var2);
                }
            }
        }
    }

    public final void q(wa2 wa2Var, boolean z) {
        dh0 dh0Var;
        if (wa2Var.y0) {
            return;
        }
        if (wa2Var == this.a) {
            dh0Var = this.h;
            dh0Var.getClass();
        } else {
            dh0Var = null;
        }
        if (z) {
            b(wa2Var, dh0Var);
        } else {
            c(wa2Var, dh0Var);
        }
    }

    public final boolean r(wa2 wa2Var, boolean z) {
        int ordinal = wa2Var.o0.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.g.c(new qw2(wa2Var, false, z));
            } else {
                if (ordinal != 4) {
                    s83.v();
                    return false;
                }
                if (!wa2Var.r() || z) {
                    wa2Var.o0.p.c0 = true;
                    if (!wa2Var.y0 && (wa2Var.L() || i(wa2Var))) {
                        wa2 v = wa2Var.v();
                        if (v == null || !v.r()) {
                            this.b.j(wa2Var, a52.K);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        dh0 dh0Var = this.h;
        if (dh0Var == null ? false : dh0.b(dh0Var.a, j)) {
            return;
        }
        if (this.c) {
            q02.a("updateRootConstraints called while measuring");
        }
        this.h = new dh0(j);
        wa2 wa2Var = this.a;
        boolean K = wa2Var.K();
        ab2 ab2Var = wa2Var.o0;
        if (K) {
            wa2 wa2Var2 = wa2Var.P;
            if (wa2Var2 != null) {
                ab2Var.e = true;
            }
            ab2Var.p.c0 = true;
            this.b.j(wa2Var, wa2Var2 != null ? a52.I : a52.K);
        }
    }
}
