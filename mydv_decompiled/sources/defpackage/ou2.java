package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ou2 {
    public static final List a;
    public static final float b;
    public static final float c;
    public static final List d;

    static {
        ab4 ab4Var = ab4.J;
        ab4 ab4Var2 = ab4.L;
        ab4 ab4Var3 = ab4.K;
        a = p70.k0(ab4Var, ab4Var2, ab4Var3);
        b = 96.0f;
        c = 40.0f;
        d = p70.k0(new uj3(ab4Var, "推荐"), new uj3(ab4Var2, "移动"), new uj3(ab4Var3, "关注"));
    }

    public static final void a(String str, boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var;
        t43 t43Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-2128631728);
        int i2 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.h(z) ? 32 : 16) | (go1Var2.i(rm1Var) ? 256 : 128);
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var2 = (t43) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var2);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            long j = z ? hx2.a : hx2.b;
            boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
            long j2 = x70.f;
            cw4 t0 = p70.t0(booleanValue, j2, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "feed-top-tab-bg", go1Var2, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j, k80Var.v, "feed-top-tab-fg", go1Var2, 3072);
            an4 an4Var = ((Boolean) t43Var2.getValue()).booleanValue() ? null : new an4(x70.c(hx2.g, 0.55f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L), 6.0f);
            i13 i13Var = i13.a;
            l13 b2 = nq4.b(i13Var, 1.0f);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                t43Var = t43Var2;
                Q3 = new uf(t43Var, (byte) 28);
                go1Var2.o0(Q3);
            } else {
                t43Var = t43Var2;
            }
            l13 E0 = i42.E0(mw2.B(r13.d(r7.u(12.0f, i42.A0(b2, (tm1) Q3), t0), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 12.0f, 0.0f, 2);
            ba0 a2 = z90.a(i42.e, q8.W, go1Var2, 54);
            int Q4 = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(Q4));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            t43 t43Var3 = t43Var;
            r55.b(str, p70.G(i13Var, s0, j, false, null, 12), j, 0L, z ? qk1.Q : qk1.N, 0L, null, 0L, 0, false, 1, 0, m65.a(((fw2) go1Var2.k(i51Var)).b.h, 0L, 0L, null, null, 0L, an4Var, 0L, null, 16769023), go1Var2, i2 & 14, 24576, 114616);
            go1Var = go1Var2;
            oh4.a(go1Var, nq4.g(i13Var, 3.0f));
            px.a(mw2.p(o7.m(nq4.l(i13Var, 18.0f, 3.0f), l74.a(2.0f)), (!z || ((Boolean) t43Var3.getValue()).booleanValue()) ? j2 : hx2.a, mw2.j), go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new t20(str, z, rm1Var, i, (byte) 3);
        }
    }

    public static final void b(ab4 ab4Var, tm1 tm1Var, l13 l13Var, float f, fe0 fe0Var, int i) {
        ab4 ab4Var2;
        l13 l13Var2;
        tm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1546243817);
        int i2 = i | (go1Var.e(ab4Var.ordinal()) ? 4 : 2) | (go1Var.i(tm1Var) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK | (go1Var.d(f) ? 2048 : 1024);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            uw2 c2 = px.c(q8.J, false);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, e);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            px.a(mw2.o(nq4.g(nq4.e(i13Var, 1.0f), 130.0f + f), jp.A(p70.k0(new x70(x70.c(hx2.e, 0.45f)), new x70(x70.f)))), go1Var, 0);
            l13 align = ux.a.align(i13Var, q8.K);
            r11 r11Var = new r11(20.0f);
            r11 r11Var2 = new r11(4.0f + f);
            if (r11Var.compareTo(r11Var2) < 0) {
                r11Var = r11Var2;
            }
            float f2 = r11Var.I;
            float f3 = c;
            l13 g = nq4.g(i42.G0(align, 0.0f, (f2 + f3) - f3, 0.0f, 0.0f, 13), f3);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, g);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            go1Var.d0(456175296);
            for (uj3 uj3Var : d) {
                ab4 ab4Var3 = (ab4) uj3Var.I;
                String str = (String) uj3Var.J;
                boolean z2 = ab4Var3 == ab4Var;
                boolean e2 = ((i2 & 112) == 32) | go1Var.e(ab4Var3.ordinal());
                Object Q3 = go1Var.Q();
                if (e2 || Q3 == de0.a) {
                    Q3 = new jt2(tm1Var, ab4Var3, (byte) 5);
                    go1Var.o0(Q3);
                }
                a(str, z2, (rm1) Q3, go1Var, 0);
            }
            ab4Var2 = ab4Var;
            r7.J(go1Var, false, true, true);
            l13Var2 = i13Var;
        } else {
            ab4Var2 = ab4Var;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new xt1(ab4Var2, tm1Var, l13Var2, f, i);
        }
    }

    public static final void c(ku2 ku2Var, boolean z, tm1 tm1Var, fe0 fe0Var, int i) {
        tm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1360907151);
        int i2 = i | (go1Var.e(ku2Var == null ? -1 : ku2Var.ordinal()) ? 4 : 2) | (go1Var.i(tm1Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            i13 i13Var = i13.a;
            l13 T = eu5.T(nq4.e(i13Var, 1.0f).then(z ? mw2.o(i13Var, jp.A(p70.k0(new x70(x70.f), new x70(x70.c(hx2.e, 0.55f))))) : mw2.p(i13Var, k80Var.F, mw2.j)));
            i51 i51Var = r13.a;
            float f = 0.0f;
            l13 E0 = i42.E0(nq4.g(T, 64.0f), 8.0f, 0.0f, 2);
            u74 a2 = t74.a(i42.b, q8.S, go1Var, 0);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            go1Var.d0(1619995689);
            za1 za1Var = ku2.R;
            v2 o = hf1.o(za1Var, za1Var);
            while (o.hasNext()) {
                ku2 ku2Var2 = (ku2) o.next();
                boolean z2 = ku2Var2 == ku2Var;
                boolean e = ((i2 & 896) == 256) | go1Var.e(ku2Var2.ordinal());
                Object Q2 = go1Var.Q();
                if (e || Q2 == de0.a) {
                    Q2 = new mu2(tm1Var, ku2Var2, (byte) 1);
                    go1Var.o0(Q2);
                }
                d(ku2Var2, z2, z, (rm1) Q2, i42.E0(nq4.b(nt3.x(i13Var, 1.0f), 1.0f), f, 4.0f, 1), false, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                f = f;
            }
            go1Var.q(false);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uj(ku2Var, tm1Var, z, i, (byte) 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ku2 r39, final boolean r40, final boolean r41, final defpackage.rm1 r42, final defpackage.l13 r43, boolean r44, defpackage.fe0 r45, final int r46) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou2.d(ku2, boolean, boolean, rm1, l13, boolean, fe0, int):void");
    }

    public static final void e(ku2 ku2Var, tm1 tm1Var, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        l13 l13Var2;
        tm1Var.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1025262547);
        int i2 = i | (go1Var2.e(ku2Var == null ? -1 : ku2Var.ordinal()) ? 4 : 2) | (go1Var2.i(tm1Var) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            float f = b;
            i13 i13Var = i13.a;
            l13 b2 = nq4.b(nq4.n(i13Var, f), 1.0f);
            long j = k80Var.p;
            aj5 aj5Var = mw2.j;
            l13 p = mw2.p(b2, j, aj5Var);
            WeakHashMap weakHashMap = dw5.w;
            l13 G0 = i42.G0(mw2.a0(mw2.a0(p, wi4.h(go1Var2).f), wi4.h(go1Var2).e), 0.0f, 24.0f, 0.0f, 16.0f, 5);
            ba0 a2 = z90.a(new kp(12.0f, true, new y9()), q8.W, go1Var2, 54);
            int Q = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, G0);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            l13 k = nq4.k(i42.G0(i13Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 40.0f);
            jp jpVar = dw2.a;
            l13 p2 = mw2.p(o7.m(k, rt0.L(jp.m(), go1Var2)), k80Var.a, aj5Var);
            uw2 c2 = px.c(q8.J, false);
            int Q2 = i82.Q(go1Var2.T);
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, p2);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, c2);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(Q2, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            go1Var = go1Var2;
            ut0.a(vt0.M(go1Var2, R.mipmap.ic_launcher_foreground), null, nq4.c, null, li0.a, 0.0f, null, go1Var, rj3.$stable | 25008, 104);
            go1Var.q(true);
            go1Var.d0(77872181);
            za1 za1Var = ku2.R;
            v2 o = hf1.o(za1Var, za1Var);
            while (o.hasNext()) {
                ku2 ku2Var2 = (ku2) o.next();
                boolean z2 = ku2Var2 == ku2Var;
                boolean e = ((i2 & 112) == 32) | go1Var.e(ku2Var2.ordinal());
                Object Q3 = go1Var.Q();
                if (e || Q3 == de0.a) {
                    Q3 = new mu2(tm1Var, ku2Var2, (byte) 0);
                    go1Var.o0(Q3);
                }
                go1 go1Var3 = go1Var;
                d(ku2Var2, z2, false, (rm1) Q3, nq4.g(nq4.n(i13Var, 80.0f), 64.0f), false, go1Var3, 24960);
                go1Var = go1Var3;
            }
            go1Var.q(false);
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) ku2Var, (Object) tm1Var, l13Var2, i, (byte) 6);
        }
    }

    public static final ku2 f(ab4 ab4Var) {
        switch (ab4Var.ordinal()) {
            case 0:
                return ku2.M;
            case 1:
            case 2:
            case 3:
                return ku2.L;
            case 4:
                return ku2.N;
            case 5:
            case 6:
                return ku2.O;
            case 7:
            case 9:
            case 10:
                return ku2.P;
            case 8:
            default:
                return null;
        }
    }
}
