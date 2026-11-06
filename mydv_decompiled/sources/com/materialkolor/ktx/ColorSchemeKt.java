package com.materialkolor.ktx;

import androidx.media3.exoplayer.RendererCapabilities;
import defpackage.ba5;
import defpackage.cw4;
import defpackage.de0;
import defpackage.dt4;
import defpackage.ea5;
import defpackage.fe0;
import defpackage.go1;
import defpackage.hf1;
import defpackage.hh;
import defpackage.in1;
import defpackage.jk3;
import defpackage.jp;
import defpackage.k80;
import defpackage.kh;
import defpackage.m80;
import defpackage.mw2;
import defpackage.n80;
import defpackage.ns4;
import defpackage.nt3;
import defpackage.o63;
import defpackage.o80;
import defpackage.p70;
import defpackage.p80;
import defpackage.pt1;
import defpackage.ss4;
import defpackage.tm1;
import defpackage.ub5;
import defpackage.uc0;
import defpackage.v80;
import defpackage.ve1;
import defpackage.x70;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ColorSchemeKt {
    public static final long A(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final List B(ea5 ea5Var, in1 in1Var, fe0 fe0Var, int i) {
        Object m;
        Object m2;
        ba5 ba5Var;
        boolean z;
        Object m3;
        boolean z2;
        Object m4;
        ns4 i2;
        tm1 e;
        ns4 j;
        hh hhVar = hh.M;
        int i3 = (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i & 112);
        jk3 jk3Var = ea5Var.d;
        ss4 ss4Var = ea5Var.a;
        k80 k80Var = (k80) jk3Var.getValue();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(193446150);
        long j2 = k80Var.j;
        boolean z3 = false;
        go1Var.q(false);
        v80 f = x70.f(j2);
        boolean g = go1Var.g(f);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g || Q == jpVar) {
            Q = hf1.s(hhVar, new kh(f, (byte) 3), go1Var);
        }
        ub5 ub5Var = (ub5) Q;
        int i4 = ((i3 << 3) & 896) | (i3 & 14) | 3072;
        if (ea5Var.i()) {
            m = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z4 = (((i4 & 14) ^ 6) > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m = go1Var.Q();
            if (z4 || m == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d);
                    m = d;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(193446150);
        x70 l = nt3.l(go1Var, false, ((k80) m).j);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z5 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q2 = go1Var.Q();
        if (z5 || Q2 == jpVar) {
            Q2 = dt4.b(new o80(ea5Var, (byte) 18));
            go1Var.o0(Q2);
        }
        k80 k80Var2 = (k80) ((cw4) Q2).getValue();
        go1Var.d0(193446150);
        x70 l2 = nt3.l(go1Var, false, k80Var2.j);
        boolean z6 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q3 = go1Var.Q();
        if (z6 || Q3 == jpVar) {
            Q3 = dt4.b(new o80(ea5Var, (byte) 19));
            go1Var.o0(Q3);
        }
        int i7 = (i4 >> 3) & 112;
        ve1 ve1Var = (ve1) in1Var.invoke(((cw4) Q3).getValue(), go1Var, Integer.valueOf(i7));
        int i8 = 196608 | i5;
        ba5 y = mw2.y(ea5Var, l, l2, ve1Var, ub5Var, go1Var, i8);
        k80 k80Var3 = (k80) jk3Var.getValue();
        go1Var.d0(-971161369);
        long j3 = k80Var3.k;
        go1Var.q(false);
        v80 f2 = x70.f(j3);
        boolean g2 = go1Var.g(f2);
        Object Q4 = go1Var.Q();
        if (g2 || Q4 == jpVar) {
            Q4 = hf1.s(hhVar, new kh(f2, (byte) 3), go1Var);
        }
        ub5 ub5Var2 = (ub5) Q4;
        if (ea5Var.i()) {
            m2 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z7 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m2 = go1Var.Q();
            if (z7 || m2 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d2 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d2);
                    m2 = d2;
                    z3 = false;
                } finally {
                }
            }
            go1Var.q(z3);
        }
        go1Var.d0(-971161369);
        x70 l3 = nt3.l(go1Var, z3, ((k80) m2).k);
        boolean z8 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q5 = go1Var.Q();
        if (z8 || Q5 == jpVar) {
            Q5 = dt4.b(new o80(ea5Var, (byte) 20));
            go1Var.o0(Q5);
        }
        k80 k80Var4 = (k80) ((cw4) Q5).getValue();
        go1Var.d0(-971161369);
        x70 l4 = nt3.l(go1Var, false, k80Var4.k);
        boolean z9 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q6 = go1Var.Q();
        if (z9 || Q6 == jpVar) {
            Q6 = dt4.b(new o80(ea5Var, (byte) 21));
            go1Var.o0(Q6);
        }
        ba5 y2 = mw2.y(ea5Var, l3, l4, (ve1) in1Var.invoke(((cw4) Q6).getValue(), go1Var, Integer.valueOf(i7)), ub5Var2, go1Var, i8);
        k80 k80Var5 = (k80) jk3Var.getValue();
        go1Var.d0(-639376011);
        long j4 = k80Var5.l;
        go1Var.q(false);
        v80 f3 = x70.f(j4);
        boolean g3 = go1Var.g(f3);
        Object Q7 = go1Var.Q();
        if (g3 || Q7 == jpVar) {
            Q7 = hf1.s(hhVar, new kh(f3, (byte) 3), go1Var);
        }
        ub5 ub5Var3 = (ub5) Q7;
        if (ea5Var.i()) {
            ba5Var = y2;
            z = false;
            m3 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z10 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m3 = go1Var.Q();
            if (z10 || m3 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ba5Var = y2;
                try {
                    Object d3 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d3);
                    m3 = d3;
                } finally {
                }
            } else {
                ba5Var = y2;
            }
            z = false;
            go1Var.q(false);
        }
        go1Var.d0(-639376011);
        x70 l5 = nt3.l(go1Var, z, ((k80) m3).l);
        boolean z11 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q8 = go1Var.Q();
        if (z11 || Q8 == jpVar) {
            Q8 = dt4.b(new o80(ea5Var, (byte) 22));
            go1Var.o0(Q8);
        }
        k80 k80Var6 = (k80) ((cw4) Q8).getValue();
        go1Var.d0(-639376011);
        x70 l6 = nt3.l(go1Var, false, k80Var6.l);
        boolean z12 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q9 = go1Var.Q();
        if (z12 || Q9 == jpVar) {
            Q9 = dt4.b(new o80(ea5Var, (byte) 23));
            go1Var.o0(Q9);
        }
        ba5 ba5Var2 = ba5Var;
        ba5 y3 = mw2.y(ea5Var, l5, l6, (ve1) in1Var.invoke(((cw4) Q9).getValue(), go1Var, Integer.valueOf(i7)), ub5Var3, go1Var, i8);
        k80 k80Var7 = (k80) jk3Var.getValue();
        go1Var.d0(1520022196);
        long j5 = k80Var7.m;
        go1Var.q(false);
        v80 f4 = x70.f(j5);
        boolean g4 = go1Var.g(f4);
        Object Q10 = go1Var.Q();
        if (g4 || Q10 == jpVar) {
            Q10 = hf1.s(hhVar, new kh(f4, (byte) 3), go1Var);
        }
        ub5 ub5Var4 = (ub5) Q10;
        if (ea5Var.i()) {
            z2 = false;
            m4 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z13 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m4 = go1Var.Q();
            if (z13 || m4 == jpVar) {
                ns4 i9 = o63.i();
                tm1 e2 = i9 != null ? i9.e() : null;
                ns4 j6 = o63.j(i9);
                try {
                    Object d4 = ss4Var.d();
                    o63.o(i9, j6, e2);
                    go1Var.o0(d4);
                    m4 = d4;
                } catch (Throwable th) {
                    o63.o(i9, j6, e2);
                    throw th;
                }
            }
            z2 = false;
            go1Var.q(false);
        }
        go1Var.d0(1520022196);
        x70 l7 = nt3.l(go1Var, z2, ((k80) m4).m);
        boolean z14 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q11 = go1Var.Q();
        if (z14 || Q11 == jpVar) {
            Q11 = dt4.b(new o80(ea5Var, (byte) 24));
            go1Var.o0(Q11);
        }
        k80 k80Var8 = (k80) ((cw4) Q11).getValue();
        go1Var.d0(1520022196);
        x70 l8 = nt3.l(go1Var, false, k80Var8.m);
        boolean z15 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q12 = go1Var.Q();
        if (z15 || Q12 == jpVar) {
            Q12 = dt4.b(new o80(ea5Var, (byte) 25));
            go1Var.o0(Q12);
        }
        ba5 y4 = mw2.y(ea5Var, l7, l8, (ve1) in1Var.invoke(((cw4) Q12).getValue(), go1Var, Integer.valueOf(i7)), ub5Var4, go1Var, i8);
        x70 x70Var = (x70) y.R.getValue();
        long j7 = x70Var.a;
        x70 x70Var2 = (x70) ba5Var2.R.getValue();
        long j8 = x70Var2.a;
        x70 x70Var3 = (x70) y3.R.getValue();
        long j9 = x70Var3.a;
        x70 x70Var4 = (x70) y4.R.getValue();
        long j10 = x70Var4.a;
        return p70.k0(x70Var, x70Var2, x70Var3, x70Var4);
    }

    public static final List C(ea5 ea5Var, in1 in1Var, fe0 fe0Var, int i) {
        Object m;
        Object m2;
        ub5 ub5Var;
        boolean z;
        Object m3;
        ba5 ba5Var;
        char c;
        boolean z2;
        Object m4;
        boolean z3;
        Object m5;
        ns4 i2;
        tm1 e;
        ns4 j;
        ss4 ss4Var = ea5Var.a;
        hh hhVar = hh.M;
        int i3 = (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i & 112);
        jk3 jk3Var = ea5Var.d;
        k80 k80Var = (k80) jk3Var.getValue();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-129903265);
        long j2 = k80Var.u;
        boolean z4 = false;
        go1Var.q(false);
        v80 f = x70.f(j2);
        boolean g = go1Var.g(f);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g || Q == jpVar) {
            Q = hf1.s(hhVar, new kh(f, (byte) 3), go1Var);
        }
        ub5 ub5Var2 = (ub5) Q;
        int i4 = ((i3 << 3) & 896) | (i3 & 14) | 3072;
        if (ea5Var.i()) {
            m = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z5 = (((i4 & 14) ^ 6) > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m = go1Var.Q();
            if (z5 || m == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d);
                    m = d;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(-129903265);
        x70 l = nt3.l(go1Var, false, ((k80) m).u);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z6 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q2 = go1Var.Q();
        if (z6 || Q2 == jpVar) {
            Q2 = dt4.b(new o80(ea5Var, (byte) 27));
            go1Var.o0(Q2);
        }
        k80 k80Var2 = (k80) ((cw4) Q2).getValue();
        go1Var.d0(-129903265);
        x70 l2 = nt3.l(go1Var, false, k80Var2.u);
        boolean z7 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q3 = go1Var.Q();
        if (z7 || Q3 == jpVar) {
            Q3 = dt4.b(new o80(ea5Var, (byte) 28));
            go1Var.o0(Q3);
        }
        int i7 = (i4 >> 3) & 112;
        ve1 ve1Var = (ve1) in1Var.invoke(((cw4) Q3).getValue(), go1Var, Integer.valueOf(i7));
        int i8 = 196608 | i5;
        ba5 y = mw2.y(ea5Var, l, l2, ve1Var, ub5Var2, go1Var, i8);
        k80 k80Var3 = (k80) jk3Var.getValue();
        go1Var.d0(-917575040);
        long j3 = k80Var3.v;
        go1Var.q(false);
        v80 f2 = x70.f(j3);
        boolean g2 = go1Var.g(f2);
        Object Q4 = go1Var.Q();
        if (g2 || Q4 == jpVar) {
            Q4 = hf1.s(hhVar, new kh(f2, (byte) 3), go1Var);
        }
        ub5 ub5Var3 = (ub5) Q4;
        if (ea5Var.i()) {
            m2 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z8 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m2 = go1Var.Q();
            if (z8 || m2 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d2 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d2);
                    m2 = d2;
                    z4 = false;
                } finally {
                }
            }
            go1Var.q(z4);
        }
        go1Var.d0(-917575040);
        x70 l3 = nt3.l(go1Var, z4, ((k80) m2).v);
        boolean z9 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q5 = go1Var.Q();
        if (z9 || Q5 == jpVar) {
            Q5 = dt4.b(new o80(ea5Var, (byte) 29));
            go1Var.o0(Q5);
        }
        k80 k80Var4 = (k80) ((cw4) Q5).getValue();
        go1Var.d0(-917575040);
        x70 l4 = nt3.l(go1Var, false, k80Var4.v);
        boolean z10 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q6 = go1Var.Q();
        if (z10 || Q6 == jpVar) {
            Q6 = dt4.b(new p80(ea5Var, (byte) 0));
            go1Var.o0(Q6);
        }
        ba5 y2 = mw2.y(ea5Var, l3, l4, (ve1) in1Var.invoke(((cw4) Q6).getValue(), go1Var, Integer.valueOf(i7)), ub5Var3, go1Var, i8);
        k80 k80Var5 = (k80) jk3Var.getValue();
        go1Var.d0(736165112);
        long j4 = k80Var5.A;
        go1Var.q(false);
        v80 f3 = x70.f(j4);
        boolean g3 = go1Var.g(f3);
        Object Q7 = go1Var.Q();
        if (g3 || Q7 == jpVar) {
            Q7 = hf1.s(hhVar, new kh(f3, (byte) 3), go1Var);
        }
        ub5 ub5Var4 = (ub5) Q7;
        if (ea5Var.i()) {
            ub5Var = ub5Var4;
            z = false;
            m3 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z11 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m3 = go1Var.Q();
            if (z11 || m3 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var = ub5Var4;
                try {
                    Object d3 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d3);
                    m3 = d3;
                } finally {
                }
            } else {
                ub5Var = ub5Var4;
            }
            z = false;
            go1Var.q(false);
        }
        go1Var.d0(736165112);
        x70 l5 = nt3.l(go1Var, z, ((k80) m3).A);
        boolean z12 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q8 = go1Var.Q();
        if (z12 || Q8 == jpVar) {
            Q8 = dt4.b(new p80(ea5Var, (byte) 1));
            go1Var.o0(Q8);
        }
        k80 k80Var6 = (k80) ((cw4) Q8).getValue();
        go1Var.d0(736165112);
        x70 l6 = nt3.l(go1Var, false, k80Var6.A);
        boolean z13 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q9 = go1Var.Q();
        if (z13 || Q9 == jpVar) {
            Q9 = dt4.b(new p80(ea5Var, (byte) 2));
            go1Var.o0(Q9);
        }
        ba5 y3 = mw2.y(ea5Var, l5, l6, (ve1) in1Var.invoke(((cw4) Q9).getValue(), go1Var, Integer.valueOf(i7)), ub5Var, go1Var, i8);
        k80 k80Var7 = (k80) jk3Var.getValue();
        go1Var.d0(598084837);
        long j5 = k80Var7.B;
        go1Var.q(false);
        v80 f4 = x70.f(j5);
        boolean g4 = go1Var.g(f4);
        Object Q10 = go1Var.Q();
        if (g4 || Q10 == jpVar) {
            Q10 = hf1.s(hhVar, new kh(f4, (byte) 3), go1Var);
        }
        ub5 ub5Var5 = (ub5) Q10;
        if (ea5Var.i()) {
            ba5Var = y3;
            c = 2;
            z2 = false;
            m4 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z14 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m4 = go1Var.Q();
            if (z14 || m4 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                c = 2;
                j = o63.j(i2);
                ba5Var = y3;
                try {
                    Object d4 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d4);
                    m4 = d4;
                } finally {
                }
            } else {
                ba5Var = y3;
                c = 2;
            }
            z2 = false;
            go1Var.q(false);
        }
        go1Var.d0(598084837);
        x70 l7 = nt3.l(go1Var, z2, ((k80) m4).B);
        boolean z15 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q11 = go1Var.Q();
        if (z15 || Q11 == jpVar) {
            Q11 = dt4.b(new p80(ea5Var, (byte) 3));
            go1Var.o0(Q11);
        }
        k80 k80Var8 = (k80) ((cw4) Q11).getValue();
        go1Var.d0(598084837);
        x70 l8 = nt3.l(go1Var, false, k80Var8.B);
        boolean z16 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q12 = go1Var.Q();
        if (z16 || Q12 == jpVar) {
            Q12 = dt4.b(new p80(ea5Var, (byte) 4));
            go1Var.o0(Q12);
        }
        ba5 ba5Var2 = ba5Var;
        ba5 y4 = mw2.y(ea5Var, l7, l8, (ve1) in1Var.invoke(((cw4) Q12).getValue(), go1Var, Integer.valueOf(i7)), ub5Var5, go1Var, i8);
        k80 k80Var9 = (k80) jk3Var.getValue();
        go1Var.d0(-1333650948);
        long j6 = k80Var9.C;
        go1Var.q(false);
        v80 f5 = x70.f(j6);
        boolean g5 = go1Var.g(f5);
        Object Q13 = go1Var.Q();
        if (g5 || Q13 == jpVar) {
            Q13 = hf1.s(hhVar, new kh(f5, (byte) 3), go1Var);
        }
        ub5 ub5Var6 = (ub5) Q13;
        if (ea5Var.i()) {
            z3 = false;
            m5 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z17 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            Object Q14 = go1Var.Q();
            if (z17 || Q14 == jpVar) {
                ns4 i9 = o63.i();
                tm1 e2 = i9 != null ? i9.e() : null;
                ns4 j7 = o63.j(i9);
                try {
                    Object d5 = ss4Var.d();
                    o63.o(i9, j7, e2);
                    go1Var.o0(d5);
                    Q14 = d5;
                } catch (Throwable th) {
                    o63.o(i9, j7, e2);
                    throw th;
                }
            }
            go1Var.q(false);
            m5 = Q14;
            z3 = false;
        }
        go1Var.d0(-1333650948);
        x70 l9 = nt3.l(go1Var, z3, ((k80) m5).C);
        boolean z18 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q15 = go1Var.Q();
        if (z18 || Q15 == jpVar) {
            Q15 = dt4.b(new p80(ea5Var, (byte) 5));
            go1Var.o0(Q15);
        }
        k80 k80Var10 = (k80) ((cw4) Q15).getValue();
        go1Var.d0(-1333650948);
        x70 l10 = nt3.l(go1Var, false, k80Var10.C);
        boolean z19 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q16 = go1Var.Q();
        if (z19 || Q16 == jpVar) {
            Q16 = dt4.b(new o80(ea5Var, (byte) 26));
            go1Var.o0(Q16);
        }
        ba5 y5 = mw2.y(ea5Var, l9, l10, (ve1) in1Var.invoke(((cw4) Q16).getValue(), go1Var, Integer.valueOf(i7)), ub5Var6, go1Var, i8);
        x70 x70Var = (x70) y.R.getValue();
        long j8 = x70Var.a;
        x70 x70Var2 = (x70) y2.R.getValue();
        long j9 = x70Var2.a;
        x70 x70Var3 = (x70) ba5Var2.R.getValue();
        long j10 = x70Var3.a;
        x70 x70Var4 = (x70) y4.R.getValue();
        long j11 = x70Var4.a;
        x70 x70Var5 = (x70) y5.R.getValue();
        long j12 = x70Var5.a;
        x70[] x70VarArr = new x70[5];
        x70VarArr[0] = x70Var;
        x70VarArr[1] = x70Var2;
        x70VarArr[c] = x70Var3;
        x70VarArr[3] = x70Var4;
        x70VarArr[4] = x70Var5;
        return p70.k0(x70VarArr);
    }

    public static final List a(ea5 ea5Var, in1 in1Var, fe0 fe0Var, int i) {
        Object m;
        ba5 ba5Var;
        boolean z;
        Object m2;
        ba5 ba5Var2;
        ub5 ub5Var;
        boolean z2;
        Object m3;
        ba5 ba5Var3;
        ub5 ub5Var2;
        boolean z3;
        Object m4;
        ba5 ba5Var4;
        ub5 ub5Var3;
        boolean z4;
        Object m5;
        boolean z5;
        Object m6;
        ns4 i2;
        tm1 e;
        ns4 j;
        ss4 ss4Var = ea5Var.a;
        hh hhVar = hh.M;
        int i3 = (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i & 112);
        jk3 jk3Var = ea5Var.d;
        k80 k80Var = (k80) jk3Var.getValue();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-835464483);
        long j2 = k80Var.n;
        go1Var.q(false);
        v80 f = x70.f(j2);
        boolean g = go1Var.g(f);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g || Q == jpVar) {
            Q = hf1.s(hhVar, new kh(f, (byte) 3), go1Var);
        }
        ub5 ub5Var4 = (ub5) Q;
        int i4 = ((i3 << 3) & 896) | (i3 & 14) | 3072;
        if (ea5Var.i()) {
            m = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z6 = (((i4 & 14) ^ 6) > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m = go1Var.Q();
            if (z6 || m == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d);
                    m = d;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(-835464483);
        x70 l = nt3.l(go1Var, false, ((k80) m).n);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z7 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q2 = go1Var.Q();
        if (z7 || Q2 == jpVar) {
            Q2 = dt4.b(new m80(ea5Var, (byte) 3));
            go1Var.o0(Q2);
        }
        k80 k80Var2 = (k80) ((cw4) Q2).getValue();
        go1Var.d0(-835464483);
        x70 l2 = nt3.l(go1Var, false, k80Var2.n);
        boolean z8 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q3 = go1Var.Q();
        if (z8 || Q3 == jpVar) {
            Q3 = dt4.b(new m80(ea5Var, (byte) 4));
            go1Var.o0(Q3);
        }
        Object value = ((cw4) Q3).getValue();
        int i7 = (i4 >> 3) & 112;
        int i8 = 196608 | i5;
        ba5 y = mw2.y(ea5Var, l, l2, (ve1) in1Var.invoke(value, go1Var, Integer.valueOf(i7)), ub5Var4, go1Var, i8);
        k80 k80Var3 = (k80) jk3Var.getValue();
        go1Var.d0(-223639234);
        long j3 = k80Var3.o;
        go1Var.q(false);
        v80 f2 = x70.f(j3);
        boolean g2 = go1Var.g(f2);
        Object Q4 = go1Var.Q();
        if (g2 || Q4 == jpVar) {
            Q4 = hf1.s(hhVar, new kh(f2, (byte) 3), go1Var);
        }
        ub5 ub5Var5 = (ub5) Q4;
        if (ea5Var.i()) {
            ba5Var = y;
            z = false;
            m2 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z9 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m2 = go1Var.Q();
            if (z9 || m2 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ba5Var = y;
                try {
                    Object d2 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d2);
                    m2 = d2;
                } finally {
                }
            } else {
                ba5Var = y;
            }
            z = false;
            go1Var.q(false);
        }
        go1Var.d0(-223639234);
        x70 l3 = nt3.l(go1Var, z, ((k80) m2).o);
        boolean z10 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q5 = go1Var.Q();
        if (z10 || Q5 == jpVar) {
            Q5 = dt4.b(new m80(ea5Var, (byte) 5));
            go1Var.o0(Q5);
        }
        k80 k80Var4 = (k80) ((cw4) Q5).getValue();
        go1Var.d0(-223639234);
        x70 l4 = nt3.l(go1Var, false, k80Var4.o);
        boolean z11 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q6 = go1Var.Q();
        if (z11 || Q6 == jpVar) {
            Q6 = dt4.b(new m80(ea5Var, (byte) 6));
            go1Var.o0(Q6);
        }
        ve1 ve1Var = (ve1) in1Var.invoke(((cw4) Q6).getValue(), go1Var, Integer.valueOf(i7));
        ba5 ba5Var5 = ba5Var;
        ba5 y2 = mw2.y(ea5Var, l3, l4, ve1Var, ub5Var5, go1Var, i8);
        k80 k80Var5 = (k80) jk3Var.getValue();
        go1Var.d0(-2038357105);
        long j4 = k80Var5.w;
        go1Var.q(false);
        v80 f3 = x70.f(j4);
        boolean g3 = go1Var.g(f3);
        Object Q7 = go1Var.Q();
        if (g3 || Q7 == jpVar) {
            Q7 = hf1.s(hhVar, new kh(f3, (byte) 3), go1Var);
        }
        ub5 ub5Var6 = (ub5) Q7;
        if (ea5Var.i()) {
            ba5Var2 = y2;
            ub5Var = ub5Var6;
            z2 = false;
            m3 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z12 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m3 = go1Var.Q();
            if (z12 || m3 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                ba5Var2 = y2;
                j = o63.j(i2);
                ub5Var = ub5Var6;
                try {
                    Object d3 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d3);
                    m3 = d3;
                } finally {
                }
            } else {
                ba5Var2 = y2;
                ub5Var = ub5Var6;
            }
            z2 = false;
            go1Var.q(false);
        }
        go1Var.d0(-2038357105);
        x70 l5 = nt3.l(go1Var, z2, ((k80) m3).w);
        boolean z13 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q8 = go1Var.Q();
        if (z13 || Q8 == jpVar) {
            Q8 = dt4.b(new m80(ea5Var, (byte) 7));
            go1Var.o0(Q8);
        }
        k80 k80Var6 = (k80) ((cw4) Q8).getValue();
        go1Var.d0(-2038357105);
        x70 l6 = nt3.l(go1Var, false, k80Var6.w);
        boolean z14 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q9 = go1Var.Q();
        if (z14 || Q9 == jpVar) {
            Q9 = dt4.b(new m80(ea5Var, (byte) 8));
            go1Var.o0(Q9);
        }
        ba5 ba5Var6 = ba5Var2;
        ba5 y3 = mw2.y(ea5Var, l5, l6, (ve1) in1Var.invoke(((cw4) Q9).getValue(), go1Var, Integer.valueOf(i7)), ub5Var, go1Var, i8);
        k80 k80Var7 = (k80) jk3Var.getValue();
        go1Var.d0(-1401473906);
        long j5 = k80Var7.x;
        go1Var.q(false);
        v80 f4 = x70.f(j5);
        boolean g4 = go1Var.g(f4);
        Object Q10 = go1Var.Q();
        if (g4 || Q10 == jpVar) {
            Q10 = hf1.s(hhVar, new kh(f4, (byte) 3), go1Var);
        }
        ub5 ub5Var7 = (ub5) Q10;
        if (ea5Var.i()) {
            ba5Var3 = y3;
            ub5Var2 = ub5Var7;
            z3 = false;
            m4 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z15 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m4 = go1Var.Q();
            if (z15 || m4 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                ba5Var3 = y3;
                j = o63.j(i2);
                ub5Var2 = ub5Var7;
                try {
                    Object d4 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d4);
                    m4 = d4;
                } finally {
                }
            } else {
                ba5Var3 = y3;
                ub5Var2 = ub5Var7;
            }
            z3 = false;
            go1Var.q(false);
        }
        go1Var.d0(-1401473906);
        x70 l7 = nt3.l(go1Var, z3, ((k80) m4).x);
        boolean z16 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q11 = go1Var.Q();
        if (z16 || Q11 == jpVar) {
            Q11 = dt4.b(new m80(ea5Var, (byte) 9));
            go1Var.o0(Q11);
        }
        k80 k80Var8 = (k80) ((cw4) Q11).getValue();
        go1Var.d0(-1401473906);
        x70 l8 = nt3.l(go1Var, false, k80Var8.x);
        boolean z17 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q12 = go1Var.Q();
        if (z17 || Q12 == jpVar) {
            Q12 = dt4.b(new m80(ea5Var, (byte) 10));
            go1Var.o0(Q12);
        }
        ve1 ve1Var2 = (ve1) in1Var.invoke(((cw4) Q12).getValue(), go1Var, Integer.valueOf(i7));
        ba5 ba5Var7 = ba5Var3;
        ba5 y4 = mw2.y(ea5Var, l7, l8, ve1Var2, ub5Var2, go1Var, i8);
        k80 k80Var9 = (k80) jk3Var.getValue();
        go1Var.d0(1510356562);
        long j6 = k80Var9.y;
        go1Var.q(false);
        v80 f5 = x70.f(j6);
        boolean g5 = go1Var.g(f5);
        Object Q13 = go1Var.Q();
        if (g5 || Q13 == jpVar) {
            Q13 = hf1.s(hhVar, new kh(f5, (byte) 3), go1Var);
        }
        ub5 ub5Var8 = (ub5) Q13;
        if (ea5Var.i()) {
            ba5Var4 = y4;
            ub5Var3 = ub5Var8;
            z4 = false;
            m5 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z18 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            m5 = go1Var.Q();
            if (z18 || m5 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                ba5Var4 = y4;
                j = o63.j(i2);
                ub5Var3 = ub5Var8;
                try {
                    Object d5 = ss4Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d5);
                    m5 = d5;
                } finally {
                }
            } else {
                ba5Var4 = y4;
                ub5Var3 = ub5Var8;
            }
            z4 = false;
            go1Var.q(false);
        }
        go1Var.d0(1510356562);
        x70 l9 = nt3.l(go1Var, z4, ((k80) m5).y);
        boolean z19 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q14 = go1Var.Q();
        if (z19 || Q14 == jpVar) {
            Q14 = dt4.b(new m80(ea5Var, (byte) 11));
            go1Var.o0(Q14);
        }
        k80 k80Var10 = (k80) ((cw4) Q14).getValue();
        go1Var.d0(1510356562);
        x70 l10 = nt3.l(go1Var, false, k80Var10.y);
        boolean z20 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q15 = go1Var.Q();
        if (z20 || Q15 == jpVar) {
            Q15 = dt4.b(new m80(ea5Var, (byte) 0));
            go1Var.o0(Q15);
        }
        ba5 ba5Var8 = ba5Var4;
        ba5 y5 = mw2.y(ea5Var, l9, l10, (ve1) in1Var.invoke(((cw4) Q15).getValue(), go1Var, Integer.valueOf(i7)), ub5Var3, go1Var, i8);
        k80 k80Var11 = (k80) jk3Var.getValue();
        go1Var.d0(1963578419);
        long j7 = k80Var11.z;
        go1Var.q(false);
        v80 f6 = x70.f(j7);
        boolean g6 = go1Var.g(f6);
        Object Q16 = go1Var.Q();
        if (g6 || Q16 == jpVar) {
            Q16 = hf1.s(hhVar, new kh(f6, (byte) 3), go1Var);
        }
        ub5 ub5Var9 = (ub5) Q16;
        if (ea5Var.i()) {
            z5 = false;
            m6 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean z21 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            Object Q17 = go1Var.Q();
            if (z21 || Q17 == jpVar) {
                ns4 i9 = o63.i();
                tm1 e2 = i9 != null ? i9.e() : null;
                ns4 j8 = o63.j(i9);
                try {
                    Object d6 = ss4Var.d();
                    o63.o(i9, j8, e2);
                    go1Var.o0(d6);
                    Q17 = d6;
                } catch (Throwable th) {
                    o63.o(i9, j8, e2);
                    throw th;
                }
            }
            go1Var.q(false);
            m6 = Q17;
            z5 = false;
        }
        go1Var.d0(1963578419);
        x70 l11 = nt3.l(go1Var, z5, ((k80) m6).z);
        boolean z22 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q18 = go1Var.Q();
        if (z22 || Q18 == jpVar) {
            Q18 = dt4.b(new m80(ea5Var, (byte) 1));
            go1Var.o0(Q18);
        }
        k80 k80Var12 = (k80) ((cw4) Q18).getValue();
        go1Var.d0(1963578419);
        x70 l12 = nt3.l(go1Var, false, k80Var12.z);
        boolean z23 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q19 = go1Var.Q();
        if (z23 || Q19 == jpVar) {
            Q19 = dt4.b(new m80(ea5Var, (byte) 2));
            go1Var.o0(Q19);
        }
        ba5 y6 = mw2.y(ea5Var, l11, l12, (ve1) in1Var.invoke(((cw4) Q19).getValue(), go1Var, Integer.valueOf(i7)), ub5Var9, go1Var, i8);
        x70 x70Var = (x70) ba5Var5.R.getValue();
        long j9 = x70Var.a;
        x70 x70Var2 = (x70) ba5Var6.R.getValue();
        long j10 = x70Var2.a;
        x70 x70Var3 = (x70) ba5Var7.R.getValue();
        long j11 = x70Var3.a;
        x70 x70Var4 = (x70) ba5Var8.R.getValue();
        long j12 = x70Var4.a;
        x70 x70Var5 = (x70) y5.R.getValue();
        long j13 = x70Var5.a;
        x70 x70Var6 = (x70) y6.R.getValue();
        long j14 = x70Var6.a;
        return p70.k0(x70Var, x70Var2, x70Var3, x70Var4, x70Var5, x70Var6);
    }

    public static final k80 animateColorScheme(k80 k80Var, in1 in1Var, String str, fe0 fe0Var, int i, int i2) {
        Object m;
        Object m2;
        Object m3;
        Object m4;
        Object m5;
        boolean z;
        Object m6;
        boolean z2;
        Object m7;
        boolean z3;
        Object m8;
        boolean z4;
        Object m9;
        ns4 i3;
        tm1 e;
        ns4 j;
        k80Var.getClass();
        in1 uc0Var = (i2 & 2) != 0 ? new uc0((byte) 4) : in1Var;
        ea5 Z = mw2.Z(k80Var, (i2 & 4) != 0 ? "ColorSchemeAnimation" : str, fe0Var, (i & 14) | ((i >> 3) & 112));
        jk3 jk3Var = Z.d;
        ss4 ss4Var = Z.a;
        int i4 = i & 112;
        hh hhVar = hh.M;
        int i5 = 384 | i4;
        k80 k80Var2 = (k80) jk3Var.getValue();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(999586274);
        long j2 = k80Var2.a;
        go1Var.q(false);
        v80 f = x70.f(j2);
        boolean g = go1Var.g(f);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g || Q == jpVar) {
            Q = hf1.s(hhVar, new kh(f, (byte) 3), go1Var);
        }
        ub5 ub5Var = (ub5) Q;
        int i6 = ((i5 << 3) & 896) | 3072;
        if (Z.i()) {
            m = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g2 = go1Var.g(Z);
            m = go1Var.Q();
            if (g2 || m == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d);
                    m = d;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(999586274);
        x70 l = nt3.l(go1Var, false, ((k80) m).a);
        boolean g3 = go1Var.g(Z);
        Object Q2 = go1Var.Q();
        if (g3 || Q2 == jpVar) {
            Q2 = dt4.b(new n80(Z, (byte) 7));
            go1Var.o0(Q2);
        }
        k80 k80Var3 = (k80) ((cw4) Q2).getValue();
        go1Var.d0(999586274);
        x70 l2 = nt3.l(go1Var, false, k80Var3.a);
        boolean g4 = go1Var.g(Z);
        Object Q3 = go1Var.Q();
        if (g4 || Q3 == jpVar) {
            Q3 = dt4.b(new n80(Z, (byte) 8));
            go1Var.o0(Q3);
        }
        int i7 = (i6 >> 3) & 112;
        ba5 y = mw2.y(Z, l, l2, (ve1) uc0Var.invoke(((cw4) Q3).getValue(), go1Var, Integer.valueOf(i7)), ub5Var, go1Var, 196608);
        k80 k80Var4 = (k80) jk3Var.getValue();
        go1Var.d0(-543523325);
        long j3 = k80Var4.b;
        go1Var.q(false);
        v80 f2 = x70.f(j3);
        boolean g5 = go1Var.g(f2);
        Object Q4 = go1Var.Q();
        if (g5 || Q4 == jpVar) {
            Q4 = hf1.s(hhVar, new kh(f2, (byte) 3), go1Var);
        }
        ub5 ub5Var2 = (ub5) Q4;
        if (Z.i()) {
            m2 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g6 = go1Var.g(Z);
            m2 = go1Var.Q();
            if (g6 || m2 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d2 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d2);
                    m2 = d2;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(-543523325);
        x70 l3 = nt3.l(go1Var, false, ((k80) m2).b);
        boolean g7 = go1Var.g(Z);
        Object Q5 = go1Var.Q();
        if (g7 || Q5 == jpVar) {
            Q5 = dt4.b(new n80(Z, (byte) 9));
            go1Var.o0(Q5);
        }
        k80 k80Var5 = (k80) ((cw4) Q5).getValue();
        go1Var.d0(-543523325);
        x70 l4 = nt3.l(go1Var, false, k80Var5.b);
        boolean g8 = go1Var.g(Z);
        Object Q6 = go1Var.Q();
        if (g8 || Q6 == jpVar) {
            Q6 = dt4.b(new n80(Z, (byte) 10));
            go1Var.o0(Q6);
        }
        ba5 y2 = mw2.y(Z, l3, l4, (ve1) uc0Var.invoke(((cw4) Q6).getValue(), go1Var, Integer.valueOf(i7)), ub5Var2, go1Var, 196608);
        k80 k80Var6 = (k80) jk3Var.getValue();
        go1Var.d0(-158641333);
        long j4 = k80Var6.c;
        go1Var.q(false);
        v80 f3 = x70.f(j4);
        boolean g9 = go1Var.g(f3);
        Object Q7 = go1Var.Q();
        if (g9 || Q7 == jpVar) {
            Q7 = hf1.s(hhVar, new kh(f3, (byte) 3), go1Var);
        }
        ub5 ub5Var3 = (ub5) Q7;
        if (Z.i()) {
            m3 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g10 = go1Var.g(Z);
            m3 = go1Var.Q();
            if (g10 || m3 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d3 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d3);
                    m3 = d3;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(-158641333);
        x70 l5 = nt3.l(go1Var, false, ((k80) m3).c);
        boolean g11 = go1Var.g(Z);
        Object Q8 = go1Var.Q();
        if (g11 || Q8 == jpVar) {
            Q8 = dt4.b(new n80(Z, (byte) 11));
            go1Var.o0(Q8);
        }
        k80 k80Var7 = (k80) ((cw4) Q8).getValue();
        go1Var.d0(-158641333);
        x70 l6 = nt3.l(go1Var, false, k80Var7.c);
        boolean g12 = go1Var.g(Z);
        Object Q9 = go1Var.Q();
        if (g12 || Q9 == jpVar) {
            Q9 = dt4.b(new n80(Z, (byte) 12));
            go1Var.o0(Q9);
        }
        ba5 y3 = mw2.y(Z, l5, l6, (ve1) uc0Var.invoke(((cw4) Q9).getValue(), go1Var, Integer.valueOf(i7)), ub5Var3, go1Var, 196608);
        k80 k80Var8 = (k80) jk3Var.getValue();
        go1Var.d0(478241866);
        long j5 = k80Var8.d;
        go1Var.q(false);
        v80 f4 = x70.f(j5);
        boolean g13 = go1Var.g(f4);
        Object Q10 = go1Var.Q();
        if (g13 || Q10 == jpVar) {
            Q10 = hf1.s(hhVar, new kh(f4, (byte) 3), go1Var);
        }
        ub5 ub5Var4 = (ub5) Q10;
        if (Z.i()) {
            m4 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g14 = go1Var.g(Z);
            m4 = go1Var.Q();
            if (g14 || m4 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d4 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d4);
                    m4 = d4;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(478241866);
        x70 l7 = nt3.l(go1Var, false, ((k80) m4).d);
        boolean g15 = go1Var.g(Z);
        Object Q11 = go1Var.Q();
        if (g15 || Q11 == jpVar) {
            Q11 = dt4.b(new n80(Z, (byte) 13));
            go1Var.o0(Q11);
        }
        k80 k80Var9 = (k80) ((cw4) Q11).getValue();
        go1Var.d0(478241866);
        x70 l8 = nt3.l(go1Var, false, k80Var9.d);
        boolean g16 = go1Var.g(Z);
        Object Q12 = go1Var.Q();
        if (g16 || Q12 == jpVar) {
            Q12 = dt4.b(new n80(Z, (byte) 14));
            go1Var.o0(Q12);
        }
        ba5 y4 = mw2.y(Z, l7, l8, (ve1) uc0Var.invoke(((cw4) Q12).getValue(), go1Var, Integer.valueOf(i7)), ub5Var4, go1Var, 196608);
        k80 k80Var10 = (k80) jk3Var.getValue();
        go1Var.d0(-314960546);
        long j6 = k80Var10.e;
        go1Var.q(false);
        v80 f5 = x70.f(j6);
        boolean g17 = go1Var.g(f5);
        Object Q13 = go1Var.Q();
        if (g17 || Q13 == jpVar) {
            Q13 = hf1.s(hhVar, new kh(f5, (byte) 3), go1Var);
        }
        ub5 ub5Var5 = (ub5) Q13;
        if (Z.i()) {
            m5 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g18 = go1Var.g(Z);
            m5 = go1Var.Q();
            if (g18 || m5 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d5 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d5);
                    m5 = d5;
                } finally {
                }
            }
            go1Var.q(false);
        }
        go1Var.d0(-314960546);
        x70 l9 = nt3.l(go1Var, false, ((k80) m5).e);
        boolean g19 = go1Var.g(Z);
        Object Q14 = go1Var.Q();
        if (g19 || Q14 == jpVar) {
            Q14 = dt4.b(new n80(Z, (byte) 15));
            go1Var.o0(Q14);
        }
        k80 k80Var11 = (k80) ((cw4) Q14).getValue();
        go1Var.d0(-314960546);
        x70 l10 = nt3.l(go1Var, false, k80Var11.e);
        boolean g20 = go1Var.g(Z);
        Object Q15 = go1Var.Q();
        if (g20 || Q15 == jpVar) {
            Q15 = dt4.b(new n80(Z, (byte) 6));
            go1Var.o0(Q15);
        }
        ba5 y5 = mw2.y(Z, l9, l10, (ve1) uc0Var.invoke(((cw4) Q15).getValue(), go1Var, Integer.valueOf(i7)), ub5Var5, go1Var, 196608);
        x70 x70Var = (x70) y.R.getValue();
        long j7 = x70Var.a;
        x70 x70Var2 = (x70) y2.R.getValue();
        long j8 = x70Var2.a;
        x70 x70Var3 = (x70) y3.R.getValue();
        long j9 = x70Var3.a;
        x70 x70Var4 = (x70) y4.R.getValue();
        long j10 = x70Var4.a;
        x70 x70Var5 = (x70) y5.R.getValue();
        long j11 = x70Var5.a;
        List k0 = p70.k0(x70Var, x70Var2, x70Var3, x70Var4, x70Var5);
        k80 k80Var12 = (k80) jk3Var.getValue();
        go1Var.d0(-864381662);
        long j12 = k80Var12.f;
        go1Var.q(false);
        v80 f6 = x70.f(j12);
        boolean g21 = go1Var.g(f6);
        Object Q16 = go1Var.Q();
        if (g21 || Q16 == jpVar) {
            Q16 = hf1.s(hhVar, new kh(f6, (byte) 3), go1Var);
        }
        ub5 ub5Var6 = (ub5) Q16;
        if (Z.i()) {
            z = false;
            m6 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g22 = go1Var.g(Z);
            m6 = go1Var.Q();
            if (g22 || m6 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d6 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d6);
                    m6 = d6;
                } finally {
                }
            }
            z = false;
            go1Var.q(false);
        }
        go1Var.d0(-864381662);
        x70 l11 = nt3.l(go1Var, z, ((k80) m6).f);
        boolean g23 = go1Var.g(Z);
        Object Q17 = go1Var.Q();
        if (g23 || Q17 == jpVar) {
            Q17 = dt4.b(new n80(Z, (byte) 16));
            go1Var.o0(Q17);
        }
        k80 k80Var13 = (k80) ((cw4) Q17).getValue();
        go1Var.d0(-864381662);
        x70 l12 = nt3.l(go1Var, false, k80Var13.f);
        boolean g24 = go1Var.g(Z);
        Object Q18 = go1Var.Q();
        if (g24 || Q18 == jpVar) {
            Q18 = dt4.b(new n80(Z, (byte) 17));
            go1Var.o0(Q18);
        }
        ba5 y6 = mw2.y(Z, l11, l12, (ve1) uc0Var.invoke(((cw4) Q18).getValue(), go1Var, Integer.valueOf(i7)), ub5Var6, go1Var, 196608);
        k80 k80Var14 = (k80) jk3Var.getValue();
        go1Var.d0(934256835);
        long j13 = k80Var14.g;
        go1Var.q(false);
        v80 f7 = x70.f(j13);
        boolean g25 = go1Var.g(f7);
        Object Q19 = go1Var.Q();
        if (g25 || Q19 == jpVar) {
            Q19 = hf1.s(hhVar, new kh(f7, (byte) 3), go1Var);
        }
        ub5 ub5Var7 = (ub5) Q19;
        if (Z.i()) {
            z2 = false;
            m7 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g26 = go1Var.g(Z);
            m7 = go1Var.Q();
            if (g26 || m7 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d7 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d7);
                    m7 = d7;
                } finally {
                }
            }
            z2 = false;
            go1Var.q(false);
        }
        go1Var.d0(934256835);
        x70 l13 = nt3.l(go1Var, z2, ((k80) m7).g);
        boolean g27 = go1Var.g(Z);
        Object Q20 = go1Var.Q();
        if (g27 || Q20 == jpVar) {
            Q20 = dt4.b(new n80(Z, (byte) 18));
            go1Var.o0(Q20);
        }
        k80 k80Var15 = (k80) ((cw4) Q20).getValue();
        go1Var.d0(934256835);
        x70 l14 = nt3.l(go1Var, false, k80Var15.g);
        boolean g28 = go1Var.g(Z);
        Object Q21 = go1Var.Q();
        if (g28 || Q21 == jpVar) {
            Q21 = dt4.b(new n80(Z, (byte) 19));
            go1Var.o0(Q21);
        }
        ba5 y7 = mw2.y(Z, l13, l14, (ve1) uc0Var.invoke(((cw4) Q21).getValue(), go1Var, Integer.valueOf(i7)), ub5Var7, go1Var, 196608);
        k80 k80Var16 = (k80) jk3Var.getValue();
        go1Var.d0(765186471);
        long j14 = k80Var16.h;
        go1Var.q(false);
        v80 f8 = x70.f(j14);
        boolean g29 = go1Var.g(f8);
        Object Q22 = go1Var.Q();
        if (g29 || Q22 == jpVar) {
            Q22 = hf1.s(hhVar, new kh(f8, (byte) 3), go1Var);
        }
        ub5 ub5Var8 = (ub5) Q22;
        if (Z.i()) {
            z3 = false;
            m8 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g30 = go1Var.g(Z);
            m8 = go1Var.Q();
            if (g30 || m8 == jpVar) {
                i3 = o63.i();
                e = i3 != null ? i3.e() : null;
                j = o63.j(i3);
                try {
                    Object d8 = ss4Var.d();
                    o63.o(i3, j, e);
                    go1Var.o0(d8);
                    m8 = d8;
                } finally {
                }
            }
            z3 = false;
            go1Var.q(false);
        }
        go1Var.d0(765186471);
        x70 l15 = nt3.l(go1Var, z3, ((k80) m8).h);
        boolean g31 = go1Var.g(Z);
        Object Q23 = go1Var.Q();
        if (g31 || Q23 == jpVar) {
            Q23 = dt4.b(new n80(Z, (byte) 20));
            go1Var.o0(Q23);
        }
        k80 k80Var17 = (k80) ((cw4) Q23).getValue();
        go1Var.d0(765186471);
        x70 l16 = nt3.l(go1Var, false, k80Var17.h);
        boolean g32 = go1Var.g(Z);
        Object Q24 = go1Var.Q();
        if (g32 || Q24 == jpVar) {
            Q24 = dt4.b(new n80(Z, (byte) 21));
            go1Var.o0(Q24);
        }
        ba5 y8 = mw2.y(Z, l15, l16, (ve1) uc0Var.invoke(((cw4) Q24).getValue(), go1Var, Integer.valueOf(i7)), ub5Var8, go1Var, 196608);
        k80 k80Var18 = (k80) jk3Var.getValue();
        go1Var.d0(1477659430);
        long j15 = k80Var18.i;
        go1Var.q(false);
        v80 f9 = x70.f(j15);
        boolean g33 = go1Var.g(f9);
        Object Q25 = go1Var.Q();
        if (g33 || Q25 == jpVar) {
            Q25 = hf1.s(hhVar, new kh(f9, (byte) 3), go1Var);
        }
        ub5 ub5Var9 = (ub5) Q25;
        if (Z.i()) {
            z4 = false;
            m9 = nt3.m(go1Var, 1666827533, false, ss4Var);
        } else {
            go1Var.d0(1666573488);
            boolean g34 = go1Var.g(Z);
            m9 = go1Var.Q();
            if (g34 || m9 == jpVar) {
                ns4 i8 = o63.i();
                tm1 e2 = i8 != null ? i8.e() : null;
                ns4 j16 = o63.j(i8);
                try {
                    Object d9 = ss4Var.d();
                    o63.o(i8, j16, e2);
                    go1Var.o0(d9);
                    m9 = d9;
                } catch (Throwable th) {
                    o63.o(i8, j16, e2);
                    throw th;
                }
            }
            go1Var.q(false);
            z4 = false;
        }
        go1Var.d0(1477659430);
        x70 l17 = nt3.l(go1Var, z4, ((k80) m9).i);
        boolean g35 = go1Var.g(Z);
        Object Q26 = go1Var.Q();
        if (g35 || Q26 == jpVar) {
            Q26 = dt4.b(new n80(Z, (byte) 22));
            go1Var.o0(Q26);
        }
        k80 k80Var19 = (k80) ((cw4) Q26).getValue();
        go1Var.d0(1477659430);
        x70 l18 = nt3.l(go1Var, false, k80Var19.i);
        boolean g36 = go1Var.g(Z);
        Object Q27 = go1Var.Q();
        if (g36 || Q27 == jpVar) {
            Q27 = dt4.b(new n80(Z, (byte) 23));
            go1Var.o0(Q27);
        }
        ba5 y9 = mw2.y(Z, l17, l18, (ve1) uc0Var.invoke(((cw4) Q27).getValue(), go1Var, Integer.valueOf(i7)), ub5Var9, go1Var, 196608);
        x70 x70Var6 = (x70) y6.R.getValue();
        long j17 = x70Var6.a;
        x70 x70Var7 = (x70) y7.R.getValue();
        long j18 = x70Var7.a;
        x70 x70Var8 = (x70) y8.R.getValue();
        long j19 = x70Var8.a;
        x70 x70Var9 = (x70) y9.R.getValue();
        long j20 = x70Var9.a;
        List k02 = p70.k0(x70Var6, x70Var7, x70Var8, x70Var9);
        List B = B(Z, uc0Var, fe0Var, i4);
        List o = o(Z, uc0Var, fe0Var, i4);
        List a = a(Z, uc0Var, fe0Var, i4);
        List C = C(Z, uc0Var, fe0Var, i4);
        List b = b(Z, uc0Var, fe0Var, i4);
        return new k80(((x70) k0.get(0)).a, ((x70) k0.get(1)).a, ((x70) k0.get(2)).a, ((x70) k0.get(3)).a, ((x70) k0.get(4)).a, ((x70) k02.get(0)).a, ((x70) k02.get(1)).a, ((x70) k02.get(2)).a, ((x70) k02.get(3)).a, ((x70) B.get(0)).a, ((x70) B.get(1)).a, ((x70) B.get(2)).a, ((x70) B.get(3)).a, ((x70) a.get(0)).a, ((x70) a.get(1)).a, ((x70) o.get(0)).a, ((x70) o.get(1)).a, ((x70) o.get(2)).a, ((x70) o.get(3)).a, ((x70) o.get(4)).a, ((x70) C.get(0)).a, ((x70) C.get(1)).a, ((x70) a.get(2)).a, ((x70) a.get(3)).a, ((x70) a.get(4)).a, ((x70) a.get(5)).a, ((x70) C.get(2)).a, ((x70) C.get(3)).a, ((x70) C.get(4)).a, ((x70) o.get(5)).a, ((x70) o.get(6)).a, ((x70) o.get(7)).a, ((x70) o.get(8)).a, ((x70) o.get(9)).a, ((x70) o.get(10)).a, ((x70) o.get(11)).a, ((x70) b.get(0)).a, ((x70) b.get(1)).a, ((x70) b.get(2)).a, ((x70) b.get(3)).a, ((x70) b.get(4)).a, ((x70) b.get(5)).a, ((x70) b.get(6)).a, ((x70) b.get(7)).a, ((x70) b.get(8)).a, ((x70) b.get(9)).a, ((x70) b.get(10)).a, ((x70) b.get(11)).a);
    }

    public static final List b(ea5 ea5Var, in1 in1Var, fe0 fe0Var, int i) {
        Object s;
        Object s2;
        Object s3;
        char c;
        Object s4;
        ub5 ub5Var;
        Object s5;
        Object s6;
        ub5 ub5Var2;
        Object s7;
        ub5 ub5Var3;
        Object s8;
        ub5 ub5Var4;
        Object s9;
        ub5 ub5Var5;
        Object s10;
        ub5 ub5Var6;
        Object s11;
        Object s12;
        ns4 i2;
        tm1 e;
        ns4 j;
        hh hhVar = hh.M;
        int i3 = (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i & 112);
        k80 k80Var = (k80) ea5Var.h();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(705124748);
        long j2 = k80Var.K;
        go1Var.t();
        v80 f = x70.f(j2);
        boolean g = go1Var.g(f);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g || Q == jpVar) {
            Q = hf1.s(hhVar, new kh(f, (byte) 3), go1Var);
        }
        ub5 ub5Var7 = (ub5) Q;
        int i4 = ((i3 << 3) & 896) | (i3 & 14) | 3072;
        if (ea5Var.i()) {
            s = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s = go1Var.Q();
            if (z || s == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d);
                    s = d;
                } finally {
                }
            }
            go1Var.t();
        }
        go1Var.d0(705124748);
        long j3 = ((k80) s).K;
        go1Var.t();
        x70 a = x70.a(j3);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q2 = go1Var.Q();
        if (z2 || Q2 == jpVar) {
            Q2 = dt4.b(new m80(ea5Var, (byte) 22));
            go1Var.o0(Q2);
        }
        k80 k80Var2 = (k80) ((cw4) Q2).getValue();
        go1Var.d0(705124748);
        long j4 = k80Var2.K;
        go1Var.t();
        x70 a2 = x70.a(j4);
        boolean z3 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q3 = go1Var.Q();
        if (z3 || Q3 == jpVar) {
            Q3 = dt4.b(new m80(ea5Var, (byte) 28));
            go1Var.o0(Q3);
        }
        Object value = ((cw4) Q3).getValue();
        int i7 = (i4 >> 3) & 112;
        int i8 = i5 | 196608;
        ba5 y = mw2.y(ea5Var, a, a2, (ve1) in1Var.invoke(value, go1Var, Integer.valueOf(i7)), ub5Var7, go1Var, i8);
        k80 k80Var3 = (k80) ea5Var.h();
        go1Var.d0(-1062804668);
        long j5 = k80Var3.L;
        go1Var.t();
        v80 f2 = x70.f(j5);
        boolean g2 = go1Var.g(f2);
        Object Q4 = go1Var.Q();
        if (g2 || Q4 == jpVar) {
            Q4 = hf1.s(hhVar, new kh(f2, (byte) 3), go1Var);
        }
        ub5 ub5Var8 = (ub5) Q4;
        if (ea5Var.i()) {
            s2 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z4 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s2 = go1Var.Q();
            if (z4 || s2 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d2 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d2);
                    s2 = d2;
                } finally {
                }
            }
            go1Var.t();
        }
        go1Var.d0(-1062804668);
        long j6 = ((k80) s2).L;
        go1Var.t();
        x70 a3 = x70.a(j6);
        boolean z5 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q5 = go1Var.Q();
        if (z5 || Q5 == jpVar) {
            Q5 = dt4.b(new m80(ea5Var, (byte) 29));
            go1Var.o0(Q5);
        }
        k80 k80Var4 = (k80) ((cw4) Q5).getValue();
        go1Var.d0(-1062804668);
        long j7 = k80Var4.L;
        go1Var.t();
        x70 a4 = x70.a(j7);
        boolean z6 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q6 = go1Var.Q();
        if (z6 || Q6 == jpVar) {
            Q6 = dt4.b(new n80(ea5Var, (byte) 0));
            go1Var.o0(Q6);
        }
        ba5 y2 = mw2.y(ea5Var, a3, a4, (ve1) in1Var.invoke(((cw4) Q6).getValue(), go1Var, Integer.valueOf(i7)), ub5Var8, go1Var, i8);
        k80 k80Var5 = (k80) ea5Var.h();
        go1Var.d0(-1037969973);
        long j8 = k80Var5.M;
        go1Var.t();
        v80 f3 = x70.f(j8);
        boolean g3 = go1Var.g(f3);
        Object Q7 = go1Var.Q();
        if (g3 || Q7 == jpVar) {
            Q7 = hf1.s(hhVar, new kh(f3, (byte) 3), go1Var);
        }
        ub5 ub5Var9 = (ub5) Q7;
        if (ea5Var.i()) {
            s3 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z7 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s3 = go1Var.Q();
            if (z7 || s3 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d3 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d3);
                    s3 = d3;
                } finally {
                }
            }
            go1Var.t();
        }
        go1Var.d0(-1037969973);
        long j9 = ((k80) s3).M;
        go1Var.t();
        x70 a5 = x70.a(j9);
        boolean z8 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q8 = go1Var.Q();
        if (z8 || Q8 == jpVar) {
            Q8 = dt4.b(new n80(ea5Var, (byte) 1));
            go1Var.o0(Q8);
        }
        k80 k80Var6 = (k80) ((cw4) Q8).getValue();
        go1Var.d0(-1037969973);
        long j10 = k80Var6.M;
        go1Var.t();
        x70 a6 = x70.a(j10);
        boolean z9 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q9 = go1Var.Q();
        if (z9 || Q9 == jpVar) {
            Q9 = dt4.b(new n80(ea5Var, (byte) 2));
            go1Var.o0(Q9);
        }
        ba5 y3 = mw2.y(ea5Var, a5, a6, (ve1) in1Var.invoke(((cw4) Q9).getValue(), go1Var, Integer.valueOf(i7)), ub5Var9, go1Var, i8);
        k80 k80Var7 = (k80) ea5Var.h();
        go1Var.d0(-1429178142);
        long j11 = k80Var7.N;
        go1Var.t();
        v80 f4 = x70.f(j11);
        boolean g4 = go1Var.g(f4);
        Object Q10 = go1Var.Q();
        if (g4 || Q10 == jpVar) {
            Q10 = hf1.s(hhVar, new kh(f4, (byte) 3), go1Var);
        }
        ub5 ub5Var10 = (ub5) Q10;
        if (ea5Var.i()) {
            c = 2;
            s4 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z10 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s4 = go1Var.Q();
            if (z10 || s4 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                c = 2;
                j = o63.j(i2);
                try {
                    Object d4 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d4);
                    s4 = d4;
                } finally {
                }
            } else {
                c = 2;
            }
            go1Var.t();
        }
        go1Var.d0(-1429178142);
        long j12 = ((k80) s4).N;
        go1Var.t();
        x70 a7 = x70.a(j12);
        boolean z11 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q11 = go1Var.Q();
        if (z11 || Q11 == jpVar) {
            Q11 = dt4.b(new n80(ea5Var, (byte) 3));
            go1Var.o0(Q11);
        }
        k80 k80Var8 = (k80) ((cw4) Q11).getValue();
        go1Var.d0(-1429178142);
        long j13 = k80Var8.N;
        go1Var.t();
        x70 a8 = x70.a(j13);
        boolean z12 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q12 = go1Var.Q();
        if (z12 || Q12 == jpVar) {
            Q12 = dt4.b(new n80(ea5Var, (byte) 4));
            go1Var.o0(Q12);
        }
        ba5 y4 = mw2.y(ea5Var, a7, a8, (ve1) in1Var.invoke(((cw4) Q12).getValue(), go1Var, Integer.valueOf(i7)), ub5Var10, go1Var, i8);
        k80 k80Var9 = (k80) ea5Var.h();
        go1Var.d0(-489786278);
        long j14 = k80Var9.O;
        go1Var.t();
        v80 f5 = x70.f(j14);
        boolean g5 = go1Var.g(f5);
        Object Q13 = go1Var.Q();
        if (g5 || Q13 == jpVar) {
            Q13 = hf1.s(hhVar, new kh(f5, (byte) 3), go1Var);
        }
        ub5 ub5Var11 = (ub5) Q13;
        if (ea5Var.i()) {
            ub5Var = ub5Var11;
            s5 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z13 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s5 = go1Var.Q();
            if (z13 || s5 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var = ub5Var11;
                try {
                    Object d5 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d5);
                    s5 = d5;
                } finally {
                }
            } else {
                ub5Var = ub5Var11;
            }
            go1Var.t();
        }
        go1Var.d0(-489786278);
        long j15 = ((k80) s5).O;
        go1Var.t();
        x70 a9 = x70.a(j15);
        boolean z14 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q14 = go1Var.Q();
        if (z14 || Q14 == jpVar) {
            Q14 = dt4.b(new n80(ea5Var, (byte) 5));
            go1Var.o0(Q14);
        }
        k80 k80Var10 = (k80) ((cw4) Q14).getValue();
        go1Var.d0(-489786278);
        long j16 = k80Var10.O;
        go1Var.t();
        x70 a10 = x70.a(j16);
        boolean z15 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q15 = go1Var.Q();
        if (z15 || Q15 == jpVar) {
            Q15 = dt4.b(new m80(ea5Var, (byte) 12));
            go1Var.o0(Q15);
        }
        ba5 y5 = mw2.y(ea5Var, a9, a10, (ve1) in1Var.invoke(((cw4) Q15).getValue(), go1Var, Integer.valueOf(i7)), ub5Var, go1Var, i8);
        k80 k80Var11 = (k80) ea5Var.h();
        go1Var.d0(-1968230986);
        long j17 = k80Var11.P;
        go1Var.t();
        v80 f6 = x70.f(j17);
        boolean g6 = go1Var.g(f6);
        Object Q16 = go1Var.Q();
        if (g6 || Q16 == jpVar) {
            Q16 = hf1.s(hhVar, new kh(f6, (byte) 3), go1Var);
        }
        ub5 ub5Var12 = (ub5) Q16;
        if (ea5Var.i()) {
            s6 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z16 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s6 = go1Var.Q();
            if (z16 || s6 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d6 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d6);
                    s6 = d6;
                } finally {
                }
            }
            go1Var.t();
        }
        go1Var.d0(-1968230986);
        long j18 = ((k80) s6).P;
        go1Var.t();
        x70 a11 = x70.a(j18);
        boolean z17 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q17 = go1Var.Q();
        if (z17 || Q17 == jpVar) {
            Q17 = dt4.b(new m80(ea5Var, (byte) 13));
            go1Var.o0(Q17);
        }
        k80 k80Var12 = (k80) ((cw4) Q17).getValue();
        go1Var.d0(-1968230986);
        long j19 = k80Var12.P;
        go1Var.t();
        x70 a12 = x70.a(j19);
        boolean z18 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q18 = go1Var.Q();
        if (z18 || Q18 == jpVar) {
            Q18 = dt4.b(new m80(ea5Var, (byte) 14));
            go1Var.o0(Q18);
        }
        ba5 y6 = mw2.y(ea5Var, a11, a12, (ve1) in1Var.invoke(((cw4) Q18).getValue(), go1Var, Integer.valueOf(i7)), ub5Var12, go1Var, i8);
        k80 k80Var13 = (k80) ea5Var.h();
        go1Var.d0(-566567719);
        long j20 = k80Var13.Q;
        go1Var.t();
        v80 f7 = x70.f(j20);
        boolean g7 = go1Var.g(f7);
        Object Q19 = go1Var.Q();
        if (g7 || Q19 == jpVar) {
            Q19 = hf1.s(hhVar, new kh(f7, (byte) 3), go1Var);
        }
        ub5 ub5Var13 = (ub5) Q19;
        if (ea5Var.i()) {
            ub5Var2 = ub5Var13;
            s7 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z19 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s7 = go1Var.Q();
            if (z19 || s7 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var2 = ub5Var13;
                try {
                    Object d7 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d7);
                    s7 = d7;
                } finally {
                }
            } else {
                ub5Var2 = ub5Var13;
            }
            go1Var.t();
        }
        go1Var.d0(-566567719);
        long j21 = ((k80) s7).Q;
        go1Var.t();
        x70 a13 = x70.a(j21);
        boolean z20 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q20 = go1Var.Q();
        if (z20 || Q20 == jpVar) {
            Q20 = dt4.b(new m80(ea5Var, (byte) 15));
            go1Var.o0(Q20);
        }
        k80 k80Var14 = (k80) ((cw4) Q20).getValue();
        go1Var.d0(-566567719);
        long j22 = k80Var14.Q;
        go1Var.t();
        x70 a14 = x70.a(j22);
        boolean z21 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q21 = go1Var.Q();
        if (z21 || Q21 == jpVar) {
            Q21 = dt4.b(new m80(ea5Var, (byte) 16));
            go1Var.o0(Q21);
        }
        ba5 y7 = mw2.y(ea5Var, a13, a14, (ve1) in1Var.invoke(((cw4) Q21).getValue(), go1Var, Integer.valueOf(i7)), ub5Var2, go1Var, i8);
        k80 k80Var15 = (k80) ea5Var.h();
        go1Var.d0(1193412116);
        long j23 = k80Var15.R;
        go1Var.t();
        v80 f8 = x70.f(j23);
        boolean g8 = go1Var.g(f8);
        Object Q22 = go1Var.Q();
        if (g8 || Q22 == jpVar) {
            Q22 = hf1.s(hhVar, new kh(f8, (byte) 3), go1Var);
        }
        ub5 ub5Var14 = (ub5) Q22;
        if (ea5Var.i()) {
            ub5Var3 = ub5Var14;
            s8 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z22 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s8 = go1Var.Q();
            if (z22 || s8 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var3 = ub5Var14;
                try {
                    Object d8 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d8);
                    s8 = d8;
                } finally {
                }
            } else {
                ub5Var3 = ub5Var14;
            }
            go1Var.t();
        }
        go1Var.d0(1193412116);
        long j24 = ((k80) s8).R;
        go1Var.t();
        x70 a15 = x70.a(j24);
        boolean z23 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q23 = go1Var.Q();
        if (z23 || Q23 == jpVar) {
            Q23 = dt4.b(new m80(ea5Var, (byte) 17));
            go1Var.o0(Q23);
        }
        k80 k80Var16 = (k80) ((cw4) Q23).getValue();
        go1Var.d0(1193412116);
        long j25 = k80Var16.R;
        go1Var.t();
        x70 a16 = x70.a(j25);
        boolean z24 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q24 = go1Var.Q();
        if (z24 || Q24 == jpVar) {
            Q24 = dt4.b(new m80(ea5Var, (byte) 18));
            go1Var.o0(Q24);
        }
        ba5 y8 = mw2.y(ea5Var, a15, a16, (ve1) in1Var.invoke(((cw4) Q24).getValue(), go1Var, Integer.valueOf(i7)), ub5Var3, go1Var, i8);
        k80 k80Var17 = (k80) ea5Var.h();
        go1Var.d0(426203248);
        long j26 = k80Var17.S;
        go1Var.t();
        v80 f9 = x70.f(j26);
        boolean g9 = go1Var.g(f9);
        Object Q25 = go1Var.Q();
        if (g9 || Q25 == jpVar) {
            Q25 = hf1.s(hhVar, new kh(f9, (byte) 3), go1Var);
        }
        ub5 ub5Var15 = (ub5) Q25;
        if (ea5Var.i()) {
            ub5Var4 = ub5Var15;
            s9 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z25 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s9 = go1Var.Q();
            if (z25 || s9 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var4 = ub5Var15;
                try {
                    Object d9 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d9);
                    s9 = d9;
                } finally {
                }
            } else {
                ub5Var4 = ub5Var15;
            }
            go1Var.t();
        }
        go1Var.d0(426203248);
        long j27 = ((k80) s9).S;
        go1Var.t();
        x70 a17 = x70.a(j27);
        boolean z26 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q26 = go1Var.Q();
        if (z26 || Q26 == jpVar) {
            Q26 = dt4.b(new m80(ea5Var, (byte) 19));
            go1Var.o0(Q26);
        }
        k80 k80Var18 = (k80) ((cw4) Q26).getValue();
        go1Var.d0(426203248);
        long j28 = k80Var18.S;
        go1Var.t();
        x70 a18 = x70.a(j28);
        boolean z27 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q27 = go1Var.Q();
        if (z27 || Q27 == jpVar) {
            Q27 = dt4.b(new m80(ea5Var, (byte) 20));
            go1Var.o0(Q27);
        }
        ba5 y9 = mw2.y(ea5Var, a17, a18, (ve1) in1Var.invoke(((cw4) Q27).getValue(), go1Var, Integer.valueOf(i7)), ub5Var4, go1Var, i8);
        k80 k80Var19 = (k80) ea5Var.h();
        go1Var.d0(348506592);
        long j29 = k80Var19.T;
        go1Var.t();
        v80 f10 = x70.f(j29);
        boolean g10 = go1Var.g(f10);
        Object Q28 = go1Var.Q();
        if (g10 || Q28 == jpVar) {
            Q28 = hf1.s(hhVar, new kh(f10, (byte) 3), go1Var);
        }
        ub5 ub5Var16 = (ub5) Q28;
        if (ea5Var.i()) {
            ub5Var5 = ub5Var16;
            s10 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z28 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s10 = go1Var.Q();
            if (z28 || s10 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var5 = ub5Var16;
                try {
                    Object d10 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d10);
                    s10 = d10;
                } finally {
                }
            } else {
                ub5Var5 = ub5Var16;
            }
            go1Var.t();
        }
        go1Var.d0(348506592);
        long j30 = ((k80) s10).T;
        go1Var.t();
        x70 a19 = x70.a(j30);
        boolean z29 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q29 = go1Var.Q();
        if (z29 || Q29 == jpVar) {
            Q29 = dt4.b(new m80(ea5Var, (byte) 21));
            go1Var.o0(Q29);
        }
        k80 k80Var20 = (k80) ((cw4) Q29).getValue();
        go1Var.d0(348506592);
        long j31 = k80Var20.T;
        go1Var.t();
        x70 a20 = x70.a(j31);
        boolean z30 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q30 = go1Var.Q();
        if (z30 || Q30 == jpVar) {
            Q30 = dt4.b(new m80(ea5Var, (byte) 23));
            go1Var.o0(Q30);
        }
        ba5 y10 = mw2.y(ea5Var, a19, a20, (ve1) in1Var.invoke(((cw4) Q30).getValue(), go1Var, Integer.valueOf(i7)), ub5Var5, go1Var, i8);
        k80 k80Var21 = (k80) ea5Var.h();
        go1Var.d0(-2070125551);
        long j32 = k80Var21.U;
        go1Var.t();
        v80 f11 = x70.f(j32);
        boolean g11 = go1Var.g(f11);
        Object Q31 = go1Var.Q();
        if (g11 || Q31 == jpVar) {
            Q31 = hf1.s(hhVar, new kh(f11, (byte) 3), go1Var);
        }
        ub5 ub5Var17 = (ub5) Q31;
        if (ea5Var.i()) {
            ub5Var6 = ub5Var17;
            s11 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z31 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s11 = go1Var.Q();
            if (z31 || s11 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                ub5Var6 = ub5Var17;
                try {
                    Object d11 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d11);
                    s11 = d11;
                } finally {
                }
            } else {
                ub5Var6 = ub5Var17;
            }
            go1Var.t();
        }
        go1Var.d0(-2070125551);
        long j33 = ((k80) s11).U;
        go1Var.t();
        x70 a21 = x70.a(j33);
        boolean z32 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q32 = go1Var.Q();
        if (z32 || Q32 == jpVar) {
            Q32 = dt4.b(new m80(ea5Var, (byte) 24));
            go1Var.o0(Q32);
        }
        k80 k80Var22 = (k80) ((cw4) Q32).getValue();
        go1Var.d0(-2070125551);
        long j34 = k80Var22.U;
        go1Var.t();
        x70 a22 = x70.a(j34);
        boolean z33 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q33 = go1Var.Q();
        if (z33 || Q33 == jpVar) {
            Q33 = dt4.b(new m80(ea5Var, (byte) 25));
            go1Var.o0(Q33);
        }
        ba5 y11 = mw2.y(ea5Var, a21, a22, (ve1) in1Var.invoke(((cw4) Q33).getValue(), go1Var, Integer.valueOf(i7)), ub5Var6, go1Var, i8);
        k80 k80Var23 = (k80) ea5Var.h();
        go1Var.d0(1502375900);
        long j35 = k80Var23.V;
        go1Var.t();
        v80 f12 = x70.f(j35);
        boolean g12 = go1Var.g(f12);
        Object Q34 = go1Var.Q();
        if (g12 || Q34 == jpVar) {
            Q34 = hf1.s(hhVar, new kh(f12, (byte) 3), go1Var);
        }
        ub5 ub5Var18 = (ub5) Q34;
        if (ea5Var.i()) {
            s12 = pt1.s(go1Var, 1666827533, ea5Var);
        } else {
            go1Var.d0(1666573488);
            boolean z34 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
            s12 = go1Var.Q();
            if (z34 || s12 == jpVar) {
                i2 = o63.i();
                e = i2 != null ? i2.e() : null;
                j = o63.j(i2);
                try {
                    Object d12 = ea5Var.d();
                    o63.o(i2, j, e);
                    go1Var.o0(d12);
                    s12 = d12;
                } finally {
                }
            }
            go1Var.t();
        }
        go1Var.d0(1502375900);
        long j36 = ((k80) s12).V;
        go1Var.t();
        x70 a23 = x70.a(j36);
        boolean z35 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q35 = go1Var.Q();
        if (z35 || Q35 == jpVar) {
            Q35 = dt4.b(new m80(ea5Var, (byte) 26));
            go1Var.o0(Q35);
        }
        k80 k80Var24 = (k80) ((cw4) Q35).getValue();
        go1Var.d0(1502375900);
        long j37 = k80Var24.V;
        go1Var.t();
        x70 a24 = x70.a(j37);
        boolean z36 = (i6 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4;
        Object Q36 = go1Var.Q();
        if (z36 || Q36 == jpVar) {
            Q36 = dt4.b(new m80(ea5Var, (byte) 27));
            go1Var.o0(Q36);
        }
        ba5 y12 = mw2.y(ea5Var, a23, a24, (ve1) in1Var.invoke(((cw4) Q36).getValue(), go1Var, Integer.valueOf(i7)), ub5Var18, go1Var, i8);
        x70 a25 = x70.a(c(y));
        x70 a26 = x70.a(k(y2));
        x70 a27 = x70.a(l(y3));
        x70 a28 = x70.a(m(y4));
        x70 a29 = x70.a(n(y5));
        x70 a30 = x70.a(d(y6));
        x70 a31 = x70.a(e(y7));
        x70 a32 = x70.a(f(y8));
        x70 a33 = x70.a(g(y9));
        x70 a34 = x70.a(h(y10));
        x70 a35 = x70.a(i(y11));
        x70 a36 = x70.a(j(y12));
        x70[] x70VarArr = new x70[12];
        x70VarArr[0] = a25;
        x70VarArr[1] = a26;
        x70VarArr[c] = a27;
        x70VarArr[3] = a28;
        x70VarArr[4] = a29;
        x70VarArr[5] = a30;
        x70VarArr[6] = a31;
        x70VarArr[7] = a32;
        x70VarArr[8] = a33;
        x70VarArr[9] = a34;
        x70VarArr[10] = a35;
        x70VarArr[11] = a36;
        return p70.k0(x70VarArr);
    }

    public static final long c(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long d(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long e(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long f(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long g(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long h(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long i(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long j(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long k(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long l(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long m(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long n(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        if (r9 == r6) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List o(defpackage.ea5 r33, defpackage.in1 r34, defpackage.fe0 r35, int r36) {
        /*
            Method dump skipped, instructions count: 3318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.ktx.ColorSchemeKt.o(ea5, in1, fe0, int):java.util.List");
    }

    public static final long p(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long q(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long r(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long s(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long t(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long u(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long v(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long w(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long x(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long y(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }

    public static final long z(ba5 ba5Var) {
        return ((x70) ba5Var.R.getValue()).a;
    }
}
