package defpackage;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class bp3 {
    public static final i51 a = new i51(new gw2((byte) 16), (byte) 0);
    public static final i51 b = new i51(new gw2((byte) 17), (byte) 0);

    public static final void a(final hx1 hx1Var, final String str, final l13 l13Var, String str2, String str3, fe0 fe0Var, final int i, final int i2) {
        String str4;
        int i3;
        String str5;
        int i4;
        final String str6;
        final String str7;
        m65 m65Var;
        k80 k80Var;
        boolean z;
        String str8;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2108325925);
        int i5 = i | (go1Var.g(hx1Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= go1Var.g(str) ? 32 : 16;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i3 = i5 | (go1Var.g(str4) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            str5 = str3;
        } else {
            str5 = str3;
            i4 = i3 | (go1Var.g(str5) ? 16384 : 8192);
        }
        int i8 = i4;
        if (go1Var.T(i8 & 1, (i8 & 9363) != 9362)) {
            String str9 = i6 != 0 ? null : str4;
            String str10 = i7 != 0 ? null : str5;
            i51 i51Var = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var)).a;
            uv uvVar = q8.T;
            kp kpVar = new kp(10.0f, true, new y9());
            l13 E0 = i42.E0(nq4.e(l13Var, 1.0f), 8.0f, 0.0f, 2);
            u74 a2 = t74.a(kpVar, uvVar, go1Var, 54);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            i13 i13Var = i13.a;
            l13 p = mw2.p(o7.m(nq4.k(i13Var, 28.0f), rt0.L(dw2.a.l(), go1Var)), k80Var2.l, mw2.j);
            uw2 c = px.c(q8.N, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(hx1Var, null, nq4.k(i13Var, 16.0f), k80Var2.m, go1Var, (i8 & 14) | 432);
            go1Var.q(true);
            l13 x = nt3.x(i13Var, 1.0f);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            int Q3 = i82.Q(go1Var.T);
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, x);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(Q3, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x03);
            u74 a4 = t74.a(new kp(8.0f, true, new y9()), uvVar, go1Var, 54);
            int Q4 = i82.Q(go1Var.T);
            am3 m4 = go1Var.m();
            l13 x04 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a4);
            qi4.k(go1Var, sgVar2, m4);
            r7.G(Q4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x04);
            if (str10 == null) {
                go1Var.d0(1234254344);
                m65Var = ((fw2) go1Var.k(i51Var)).b.g;
                go1Var.q(false);
            } else {
                go1Var.d0(1234342663);
                m65Var = ((fw2) go1Var.k(i51Var)).b.h;
                go1Var.q(false);
            }
            m65 m65Var2 = m65Var;
            qk1 qk1Var = qk1.P;
            long j = k80Var2.q;
            if (1.0f <= 0.0d) {
                o02.a("invalid weight; must be greater than zero");
            }
            r55.b(str, new sc2(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j, 0L, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var2, go1Var, ((i8 >> 3) & 14) | 1572864, 24960, 110520);
            go1Var = go1Var;
            if (str9 == null || str9.length() == 0) {
                k80Var = k80Var2;
                z = false;
                go1Var.d0(1235004699);
                go1Var.q(false);
            } else {
                go1Var.d0(1234768696);
                k80Var = k80Var2;
                r55.b(str9, null, k80Var2.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.d(), go1Var, (i8 >> 9) & 14, 24576, 114682);
                go1Var = go1Var;
                z = false;
                go1Var.q(false);
            }
            go1Var.q(true);
            if (str10 == null || str10.length() == 0) {
                boolean z3 = z;
                str8 = str10;
                go1Var.d0(54237911);
                go1Var.q(z3);
            } else {
                go1Var.d0(53970319);
                go1 go1Var2 = go1Var;
                str8 = str10;
                r55.b(str8, null, k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, xc3.b(), go1Var2, (i8 >> 12) & 14, 24960, 110586);
                go1Var = go1Var2;
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
            str7 = str8;
            str6 = str9;
        } else {
            go1Var.W();
            str6 = str4;
            str7 = str5;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: zo3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bp3.a(hx1.this, str, l13Var, str6, str7, (fe0) obj, mu0.X(i | 1), i2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(boolean z, l13 l13Var, final tc0 tc0Var, fe0 fe0Var, final int i, final int i2) {
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1702914562);
        int i3 = (go1Var.h(z) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                l13Var = i13.a;
            }
            l13 l13Var2 = l13Var;
            z2 = z;
            p70.e(z2, l13Var2, ta1.b, bc1.b, null, p70.u0(-525364010, new ut1(tc0Var, b2), go1Var), go1Var, (i3 & 14) | 196608 | (i3 & 112), 16);
            l13Var = l13Var2;
        } else {
            z2 = z;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final l13 l13Var3 = l13Var;
            final boolean z3 = z2;
            u.d = new hn1() { // from class: yo3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bp3.b(z3, l13Var3, tc0Var, (fe0) obj, mu0.X(i | 1), i2);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.rm1 r28, defpackage.l13 r29, boolean r30, defpackage.tm1 r31, final defpackage.tc0 r32, defpackage.fe0 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp3.c(rm1, l13, boolean, tm1, tc0, fe0, int, int):void");
    }

    public static final l13 d(l13 l13Var, go1 go1Var) {
        boolean z;
        l13Var.getClass();
        go1Var.d0(-95886027);
        ui uiVar = (ui) go1Var.k(a);
        if (uiVar == null) {
            go1Var.d0(-387277683);
            go1Var.q(false);
            z = true;
        } else {
            go1Var.d0(-1952154115);
            z = ((bw0) go1Var.k(cw0.a)).e;
            go1Var.q(false);
        }
        if (z) {
            go1Var.q(false);
            return l13Var;
        }
        ku4 d = ((fw2) go1Var.k(lw2.b)).d.d();
        rm1 rm1Var = (rm1) go1Var.k(b);
        l13 a2 = uiVar.a(l13Var, ma1.e(d, 2), ma1.f(d, 2), "panelScrim");
        boolean g = go1Var.g(rm1Var);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new b40(rm1Var, (byte) 10);
            go1Var.o0(Q);
        }
        l13 O = qb.O(a2, (tm1) Q);
        go1Var.q(false);
        return O;
    }

    public static final l13 e(l13 l13Var, xj3 xj3Var, go1 go1Var, int i) {
        boolean z;
        ta1 ta1Var;
        bc1 bc1Var;
        bc1 bc1Var2;
        boolean z2;
        Object Q;
        l13Var.getClass();
        go1Var.d0(1566225671);
        ui uiVar = (ui) go1Var.k(a);
        boolean z3 = true;
        if (uiVar == null) {
            go1Var.d0(-1095627237);
            go1Var.q(false);
            z = true;
        } else {
            go1Var.d0(1904321199);
            z = ((bw0) go1Var.k(cw0.a)).e;
            go1Var.q(false);
        }
        if (z) {
            go1Var.q(false);
            return l13Var;
        }
        ku4 f = ((fw2) go1Var.k(lw2.b)).d.f();
        int ordinal = xj3Var.ordinal();
        byte b2 = 23;
        jp jpVar = de0.a;
        if (ordinal == 0) {
            go1Var.d0(1904326120);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new do2((byte) 22);
                go1Var.o0(Q2);
            }
            ub5 ub5Var = ma1.a;
            ta1Var = new ta1(new da5((cd1) null, new xq4(f, new la1((tm1) Q2, (byte) 0)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
            go1Var.q(false);
        } else if (ordinal == 1) {
            go1Var.d0(1904328007);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new do2(b2);
                go1Var.o0(Q3);
            }
            ub5 ub5Var2 = ma1.a;
            ta1Var = new ta1(new da5((cd1) null, new xq4(f, new la1((tm1) Q3, (byte) 0)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
            go1Var.q(false);
        } else {
            if (ordinal != 2) {
                go1Var.d0(1904324972);
                go1Var.q(false);
                s83.v();
                return null;
            }
            go1Var.d0(1904329957);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new do2(b2);
                go1Var.o0(Q4);
            }
            ta1Var = ma1.i(f, (tm1) Q4);
            go1Var.q(false);
        }
        int ordinal2 = xj3Var.ordinal();
        if (ordinal2 == 0) {
            go1Var.d0(1904332937);
            Object Q5 = go1Var.Q();
            if (Q5 == jpVar) {
                Q5 = new do2((byte) 24);
                go1Var.o0(Q5);
            }
            bc1Var = new bc1(new da5((cd1) null, new xq4(f, new la1((tm1) Q5, (byte) 2)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
            go1Var.q(false);
        } else {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    go1Var.d0(1904331791);
                    go1Var.q(false);
                    s83.v();
                    return null;
                }
                go1Var.d0(1904336838);
                Object Q6 = go1Var.Q();
                if (Q6 == jpVar) {
                    Q6 = new do2(b2);
                    go1Var.o0(Q6);
                }
                bc1Var2 = ma1.j(f, (tm1) Q6);
                go1Var.q(false);
                rm1 rm1Var = (rm1) go1Var.k(b);
                l13 a2 = uiVar.a(l13Var, ta1Var, bc1Var2, "panelSlide");
                boolean g = go1Var.g(rm1Var);
                if ((((i & 112) ^ 48) > 32 || !go1Var.e(xj3Var.ordinal())) && (i & 48) != 32) {
                    z3 = false;
                }
                z2 = g | z3;
                Q = go1Var.Q();
                if (!z2 || Q == jpVar) {
                    Q = new ap3(rm1Var, xj3Var, (byte) 0);
                    go1Var.o0(Q);
                }
                l13 O = qb.O(a2, (tm1) Q);
                go1Var.q(false);
                return O;
            }
            go1Var.d0(1904334856);
            Object Q7 = go1Var.Q();
            if (Q7 == jpVar) {
                Q7 = new do2(b2);
                go1Var.o0(Q7);
            }
            bc1Var = new bc1(new da5((cd1) null, new xq4(f, new la1((tm1) Q7, (byte) 2)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
            go1Var.q(false);
        }
        bc1Var2 = bc1Var;
        rm1 rm1Var2 = (rm1) go1Var.k(b);
        l13 a22 = uiVar.a(l13Var, ta1Var, bc1Var2, "panelSlide");
        boolean g2 = go1Var.g(rm1Var2);
        if (((i & 112) ^ 48) > 32) {
        }
        z3 = false;
        z2 = g2 | z3;
        Q = go1Var.Q();
        if (!z2) {
        }
        Q = new ap3(rm1Var2, xj3Var, (byte) 0);
        go1Var.o0(Q);
        l13 O2 = qb.O(a22, (tm1) Q);
        go1Var.q(false);
        return O2;
    }

    public static final float f(bw0 bw0Var) {
        bw0Var.getClass();
        if (bw0Var.f) {
            return bw0Var.a == ww5.I ? 0.62f : 0.5f;
        }
        return 0.0f;
    }

    public static final rm1 g(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        ui uiVar = (ui) go1Var.k(a);
        boolean g = go1Var.g(uiVar);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new ce(uiVar, (byte) 28);
            go1Var.o0(Q);
        }
        return (rm1) Q;
    }

    public static final rm1 h(rm1 rm1Var, fe0 fe0Var, int i) {
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        Object obj = de0.a;
        if (Q == obj) {
            Q = p70.a(0.0f);
            go1Var.o0(Q);
        }
        bh bhVar = (bh) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == obj) {
            Q2 = mw2.w(go1Var);
            go1Var.o0(Q2);
        }
        dl0 dl0Var = (dl0) Q2;
        boolean i2 = go1Var.i(bhVar) | ((((i & 112) ^ 48) > 32 && go1Var.g(rm1Var)) || (i & 48) == 32) | go1Var.i(dl0Var);
        Object Q3 = go1Var.Q();
        if (i2 || Q3 == obj) {
            Q3 = new wu1(rm1Var, dl0Var, bhVar, null, (byte) 1);
            go1Var.o0(Q3);
        }
        rt0.d(true, (hn1) Q3, go1Var, i & 14);
        boolean g = go1Var.g(bhVar);
        Object Q4 = go1Var.Q();
        if (g || Q4 == obj) {
            Q4 = new ce(bhVar, (byte) 27);
            go1Var.o0(Q4);
        }
        return (rm1) Q4;
    }

    public static final float i(fe0 fe0Var) {
        WeakHashMap weakHashMap = dw5.w;
        return i42.c0(j42.d(wi4.h(fe0Var).l, fe0Var), (da2) ((go1) fe0Var).k(hf0.n));
    }

    public static final float j(fe0 fe0Var) {
        WeakHashMap weakHashMap = dw5.w;
        return i42.d0(j42.d(wi4.h(fe0Var).l, fe0Var), (da2) ((go1) fe0Var).k(hf0.n));
    }
}
