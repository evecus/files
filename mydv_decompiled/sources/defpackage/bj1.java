package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj1 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ bj1(tc0 tc0Var, xx xxVar) {
        this.I = (byte) 6;
        this.K = tc0Var;
        this.J = xxVar;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        vv vvVar;
        Boolean bool;
        Object bi2Var;
        boolean z;
        boolean z2;
        ki1 ki1Var;
        ki1 ki1Var2;
        wd5 WidgetTheme$lambda$0;
        byte b = this.I;
        jp jpVar = de0.a;
        df0 df0Var = wa2.A0;
        l13 l13Var = i13.a;
        d65 d65Var = null;
        byte b2 = 2;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                cj1 cj1Var = (cj1) obj4;
                br3 br3Var = cj1Var.a;
                tc0 tc0Var = (tc0) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                vv vvVar2 = q8.N;
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ne1 ne1Var = nq4.c;
                    int ordinal = br3Var.ordinal();
                    if (ordinal == 0) {
                        vvVar = vvVar2;
                    } else if (ordinal == 1) {
                        vvVar = q8.Q;
                    } else {
                        if (ordinal != 2) {
                            s83.v();
                            return null;
                        }
                        vvVar = q8.O;
                    }
                    uw2 c = px.c(vvVar, false);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, ne1Var);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    sg sgVar = q8.c0;
                    qi4.k(go1Var, sgVar, c);
                    sg sgVar2 = q8.b0;
                    qi4.k(go1Var, sgVar2, m);
                    Integer valueOf = Integer.valueOf(i);
                    sg sgVar3 = q8.d0;
                    qi4.k(go1Var, sgVar3, valueOf);
                    qi4.j(go1Var);
                    sg sgVar4 = q8.a0;
                    qi4.k(go1Var, sgVar4, x0);
                    l13 C0 = i42.C0(l13Var, 20.0f);
                    int ordinal2 = br3Var.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            l13 e = nq4.e(l13Var, 1.0f);
                            r11 r11Var = new r11(cj1Var.f() - 40.0f);
                            r11 r11Var2 = new r11(0.0f);
                            if (r11Var.compareTo(r11Var2) < 0) {
                                r11Var = r11Var2;
                            }
                            l13Var = nq4.i(e, 0.0f, r11Var.I, 1);
                        } else {
                            if (ordinal2 != 2) {
                                s83.v();
                                return null;
                            }
                            r11 r11Var3 = new r11(cj1Var.g() - 40.0f);
                            r11 r11Var4 = new r11(0.0f);
                            if (r11Var3.compareTo(r11Var4) < 0) {
                                r11Var3 = r11Var4;
                            }
                            l13Var = nq4.b(nq4.n(l13Var, r11Var3.I), 1.0f);
                        }
                    }
                    l13 then = C0.then(l13Var);
                    uw2 c2 = px.c(vvVar2, false);
                    long j2 = go1Var.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var.m();
                    l13 x02 = i42.x0(go1Var, then);
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar, c2);
                    qi4.k(go1Var, sgVar2, m2);
                    r7.G(i2, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar4, x02);
                    tc0Var.invoke(go1Var, 0);
                    go1Var.q(true);
                    go1Var.q(true);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                final rm1 rm1Var = (rm1) obj4;
                final rm1 rm1Var2 = (rm1) obj3;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    return wd5Var;
                }
                t43 g = wi4.g(t34.b, go1Var2);
                t43 g2 = wi4.g(t34.d, go1Var2);
                r34 r34Var = (r34) g.getValue();
                final q34 q34Var = r34Var != null ? r34Var.a : null;
                boolean z3 = (q34Var == null || ((String) g2.getValue()) == null) ? false : true;
                final bw0 bw0Var = (bw0) go1Var2.k(cw0.a);
                boolean z4 = bw0Var.c == aw0.I;
                final k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
                long c3 = x70.c(k80Var.a, 0.3f);
                long c4 = x70.c(k80Var.j, 0.18f);
                Object Q = go1Var2.Q();
                Object obj5 = Q;
                if (Q == jpVar) {
                    obj5 = pt1.r(go1Var2);
                }
                ki1 ki1Var3 = (ki1) obj5;
                Object Q2 = go1Var2.Q();
                Object obj6 = Q2;
                if (Q2 == jpVar) {
                    obj6 = pt1.r(go1Var2);
                }
                ki1 ki1Var4 = (ki1) obj6;
                boolean z5 = q34Var != null;
                Boolean valueOf2 = Boolean.valueOf(z5);
                boolean h = go1Var2.h(z4) | go1Var2.h(z5);
                Object Q3 = go1Var2.Q();
                if (h || Q3 == jpVar) {
                    bool = valueOf2;
                    boolean z6 = z4;
                    boolean z7 = z5;
                    bi2Var = new bi2(z6, z7, ki1Var3, ki1Var4, (fj0) null);
                    z = z6;
                    z2 = z7;
                    ki1Var = ki1Var3;
                    ki1Var2 = ki1Var4;
                    go1Var2.o0(bi2Var);
                } else {
                    bi2Var = Q3;
                    bool = valueOf2;
                    z = z4;
                    z2 = z5;
                    ki1Var = ki1Var3;
                    ki1Var2 = ki1Var4;
                }
                mw2.h(go1Var2, (hn1) bi2Var, bool);
                ne1 ne1Var2 = nq4.c;
                l13 p = mw2.p(ne1Var2, k80Var.p, mw2.j);
                boolean g3 = go1Var2.g(bw0Var) | go1Var2.f(c3) | go1Var2.f(c4);
                Object Q4 = go1Var2.Q();
                Object obj7 = Q4;
                if (g3 || Q4 == jpVar) {
                    vh2 vh2Var = new vh2(bw0Var, c3, c4, (byte) 0);
                    go1Var2.o0(vh2Var);
                    obj7 = vh2Var;
                }
                l13 u = j42.u(p, (tm1) obj7);
                uw2 c5 = px.c(q8.J, false);
                long j3 = go1Var2.T;
                int i3 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var2.m();
                l13 x03 = i42.x0(go1Var2, u);
                xd0.c.getClass();
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                sg sgVar5 = q8.c0;
                qi4.k(go1Var2, sgVar5, c5);
                sg sgVar6 = q8.b0;
                qi4.k(go1Var2, sgVar6, m3);
                Integer valueOf3 = Integer.valueOf(i3);
                sg sgVar7 = q8.d0;
                qi4.k(go1Var2, sgVar7, valueOf3);
                qi4.j(go1Var2);
                sg sgVar8 = q8.a0;
                qi4.k(go1Var2, sgVar8, x03);
                if (bw0Var.f) {
                    go1Var2.d0(1430637562);
                    WeakHashMap weakHashMap = dw5.w;
                    float a = j42.d(wi4.h(go1Var2).e, go1Var2).a();
                    ba0 a2 = z90.a(i42.d, q8.V, go1Var2, 0);
                    long j4 = go1Var2.T;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    am3 m4 = go1Var2.m();
                    l13 x04 = i42.x0(go1Var2, ne1Var2);
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar5, a2);
                    qi4.k(go1Var2, sgVar6, m4);
                    r7.G(i4, go1Var2, sgVar7, go1Var2);
                    qi4.k(go1Var2, sgVar8, x04);
                    ci2.i(84.0f, true, "短视频、直播与搜索", i42.G0(mw2.a0(nq4.e(l13Var, 1.0f), new fj2(wi4.h(go1Var2).l, 16 | 15)), 0.0f, 20.0f, 0.0f, 16.0f, 5), go1Var2, 438);
                    ci2.d(q34Var, z3, z, true, true, l74.b(12), k80Var.G, new li3(20.0f, 22.0f, 20.0f, 20.0f + a), ki1Var2, ki1Var, nq4.e(l13Var, 1.0f).then(new sc2(1.0f, true)), p70.u0(-1929854448, new yh2(ki1Var, rm1Var, z2, rm1Var2, (byte) 0), go1Var2), go1Var2, 905997312);
                    go1Var2.q(true);
                    go1Var2.q(false);
                } else {
                    final boolean z8 = z2;
                    final boolean z9 = z3;
                    go1Var2.d0(1433153863);
                    WeakHashMap weakHashMap2 = dw5.w;
                    final boolean z10 = z;
                    final ki1 ki1Var5 = ki1Var2;
                    final ki1 ki1Var6 = ki1Var;
                    a5.a(mw2.a0(ne1Var2, wi4.h(go1Var2).l), null, false, p70.u0(-108870965, new in1() { // from class: zh2
                        @Override // defpackage.in1
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            wx wxVar = (wx) obj8;
                            fe0 fe0Var3 = (fe0) obj9;
                            int intValue3 = ((Integer) obj10).intValue();
                            wxVar.getClass();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((go1) fe0Var3).g(wxVar) ? 4 : 2;
                            }
                            go1 go1Var3 = (go1) fe0Var3;
                            if (go1Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                                xx xxVar = (xx) wxVar;
                                iu0 iu0Var = xxVar.a;
                                long j5 = xxVar.b;
                                boolean z11 = r11.b(dh0.c(j5) ? iu0Var.F(dh0.g(j5)) : Float.POSITIVE_INFINITY, 420.0f) < 0;
                                l13 D0 = i42.D0(nq4.c, z11 ? 20.0f : 44.0f, z11 ? 16.0f : 40.0f);
                                u74 a3 = t74.a(i42.b, q8.T, go1Var3, 48);
                                long j6 = go1Var3.T;
                                int i5 = (int) (j6 ^ (j6 >>> 32));
                                am3 m5 = go1Var3.m();
                                l13 x05 = i42.x0(go1Var3, D0);
                                xd0.c.getClass();
                                go1Var3.h0();
                                if (go1Var3.S) {
                                    go1Var3.l(wa2.A0);
                                } else {
                                    go1Var3.r0();
                                }
                                qi4.k(go1Var3, q8.c0, a3);
                                qi4.k(go1Var3, q8.b0, m5);
                                qi4.k(go1Var3, q8.d0, Integer.valueOf(i5));
                                qi4.j(go1Var3);
                                qi4.k(go1Var3, q8.a0, x05);
                                float f = z11 ? 64.0f : 112.0f;
                                String str = bw0.this.d ? "短视频、直播与搜索，在大屏上看" : "短视频、直播与搜索";
                                i13 i13Var = i13.a;
                                ci2.i(f, z11, str, nt3.x(i13Var, 0.42f), go1Var3, 0);
                                oh4.a(go1Var3, nq4.n(i13Var, z11 ? 20.0f : 32.0f));
                                k74 a4 = l74.a(28.0f);
                                long c6 = x70.c(k80Var.G, 0.9f);
                                li3 li3Var = new li3(28.0f, 26.0f, 28.0f, 24.0f);
                                l13 x = nt3.x(i13Var, 0.58f);
                                ki1 ki1Var7 = ki1Var6;
                                ci2.d(q34Var, z9, z10, z11, false, a4, c6, li3Var, ki1Var5, ki1Var7, x, p70.u0(-789069667, new yh2(ki1Var7, rm1Var, z8, rm1Var2, (byte) 1), go1Var3), go1Var3, 918577152);
                                go1Var3.q(true);
                            } else {
                                go1Var3.W();
                            }
                            return wd5.a;
                        }
                    }, go1Var2), go1Var2, 3072, 6);
                    go1Var2.q(false);
                }
                go1Var2.q(true);
                return wd5Var;
            case 2:
                wb wbVar = (wb) obj3;
                int intValue3 = ((Integer) obj).intValue();
                si4 si4Var = (si4) obj2;
                if (!((ti4) obj4).b.c(si4Var.f)) {
                    wbVar.i(si4Var, intValue3);
                    wbVar.O.d(wd5Var);
                }
                return wd5Var;
            case 3:
                ((Integer) obj2).getClass();
                d4.c((l13) obj4, (hn1) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 4:
                ((Integer) obj2).getClass();
                c5.a((p34) obj4, (rm1) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 5:
                wy4 wy4Var = (wy4) obj;
                dh0 dh0Var = (dh0) obj2;
                return ((uw2) obj4).mo35measure3p2s80s(wy4Var, wy4Var.v(wd5Var, new tc0(-431986394, new bj1((tc0) obj3, new xx(wy4Var, dh0Var.a)), true)), dh0Var.a);
            case 6:
                tc0 tc0Var2 = (tc0) obj3;
                xx xxVar = (xx) obj4;
                fe0 fe0Var3 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    tc0Var2.invoke(xxVar, go1Var3, 0);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            case 7:
                ((Integer) obj2).getClass();
                ((yi0) obj4).a((xi0) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 8:
                w25 w25Var = (w25) obj4;
                av avVar = (av) obj3;
                fe0 fe0Var4 = (fe0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                go1 go1Var4 = (go1) fe0Var4;
                if (go1Var4.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean g4 = go1Var4.g(w25Var);
                    Object Q5 = go1Var4.Q();
                    if (g4 || Q5 == jpVar) {
                        Q5 = dt4.b(new xa(0, w25Var, w25.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 1));
                        go1Var4.o0(Q5);
                    }
                    at0.a(avVar, (v25) ((cw4) Q5).getValue(), go1Var4, 0);
                } else {
                    go1Var4.W();
                }
                return wd5Var;
            case 9:
                ((Integer) obj2).getClass();
                at0.a((av) obj4, (v25) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 10:
                ((Integer) obj2).getClass();
                c21.a((j80) obj4, (tc0) obj3, (fe0) obj, mu0.X(49));
                return wd5Var;
            case 11:
                ur1 ur1Var = (ur1) obj4;
                ip ipVar = (ip) obj3;
                iu0 iu0Var = (iu0) obj;
                dh0 dh0Var2 = (dh0) obj2;
                if (dh0.h(dh0Var2.a) == Integer.MAX_VALUE) {
                    t02.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h2 = dh0.h(dh0Var2.a);
                int X = iu0Var.X(ipVar.b());
                int i5 = ur1Var.a;
                int i6 = h2 - ((i5 - 1) * X);
                int i7 = i6 / i5;
                int i8 = i6 % i5;
                ArrayList arrayList = new ArrayList(i5);
                int i9 = 0;
                while (i9 < i5) {
                    arrayList.add(Integer.valueOf((i9 < i8 ? 1 : 0) + i7));
                    i9++;
                }
                int[] q1 = o70.q1(arrayList);
                int[] iArr = new int[q1.length];
                ipVar.d(iu0Var, h2, q1, da2.I, iArr);
                return new pd2(q1, iArr);
            case 12:
                hn1 hn1Var = (hn1) obj4;
                Integer num = (Integer) obj;
                num.getClass();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                ((t43) obj3).setValue(new uj3(num, num2));
                if (hn1Var != null) {
                    hn1Var.invoke(num, num2);
                }
                return wd5Var;
            case 13:
                k80 k80Var2 = (k80) obj4;
                tc0 tc0Var3 = (tc0) obj3;
                fe0 fe0Var5 = (fe0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (go1Var5.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    lw2.a(k80Var2, rn.a, jo.h, mc5.a, tc0Var3, go1Var5, 0);
                } else {
                    go1Var5.W();
                }
                return wd5Var;
            case 14:
                o24 o24Var = (o24) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                o24Var.I += ((wf2) obj3).b.a(floatValue - o24Var.I);
                return wd5Var;
            case 15:
                ((Integer) obj2).getClass();
                mw3.m((String) obj4, (String) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 16:
                ((Integer) obj2).getClass();
                hy3.e((ez3) obj4, (l13) obj3, (fe0) obj, mu0.X(9));
                return wd5Var;
            case 17:
                o24 o24Var2 = (o24) obj4;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = o24Var2.I;
                o24Var2.I = ((rb4) obj3).a(floatValue2 - f) + f;
                return wd5Var;
            case 18:
                ((Integer) obj2).getClass();
                he4.g((String) obj4, (cw4) obj3, (fe0) obj, mu0.X(7));
                return wd5Var;
            case 19:
                ((Integer) obj2).getClass();
                he4.l((re4) obj4, (tm1) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 20:
                ((Integer) obj2).getClass();
                qe4.n((String) obj4, (dg0) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 21:
                cy3 cy3Var = (cy3) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                fe0 fe0Var6 = (fe0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                go1 go1Var6 = (go1) fe0Var6;
                if (go1Var6.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    hy3.d(cy3Var, 200.0f, null, p70.u0(705936508, new xh2(bitmap, b2), go1Var6), go1Var6, 3120);
                } else {
                    go1Var6.W();
                }
                return wd5Var;
            case 22:
                ((Integer) obj2).getClass();
                qm4.k((String) obj4, (rm1) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 23:
                ((Integer) obj2).getClass();
                ((rn3) obj4).c((Drawable) obj3, (fe0) obj, mu0.X(49));
                return wd5Var;
            case 24:
                in1 in1Var = (in1) obj4;
                a45 a45Var = (a45) obj3;
                fe0 fe0Var7 = (fe0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                go1 go1Var7 = (go1) fe0Var7;
                if (go1Var7.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    in1Var.invoke(a45Var, go1Var7, 6);
                } else {
                    go1Var7.W();
                }
                return wd5Var;
            case 25:
                u45 u45Var = (u45) obj4;
                dl0 dl0Var = (dl0) obj3;
                t25 t25Var = (t25) obj;
                Context context = (Context) obj2;
                boolean h3 = u45Var.h();
                oj k = u45Var.k();
                String str = k != null ? k.J : null;
                d65 d65Var2 = u45Var.v;
                if (d65Var2 != null) {
                    long j5 = d65Var2.a;
                    td3 td3Var = u45Var.b;
                    d65Var = new d65(ui4.c(td3Var.k((int) (j5 >> 32)), td3Var.k((int) (j5 & 4294967295L))));
                }
                wn3 wn3Var = u45Var.i;
                m6 m6Var = new m6((Object) u45Var, (Object) dl0Var, (Object) context, (byte) 28);
                i51 i51Var = eo3.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || d65Var == null || wn3Var == null || !(wn3Var instanceof co3)) {
                    m6Var.invoke(t25Var);
                    if (str != null && d65Var != null) {
                        il2.h(t25Var, context, h3, str, d65Var.a);
                    }
                } else {
                    String str2 = str;
                    ((co3) wn3Var).a(t25Var, str2, d65Var.a, m6Var);
                    il2.h(t25Var, context, h3, str2, d65Var.a);
                }
                return wd5Var;
            case 26:
                ((Integer) obj2).getClass();
                on5.l((wy2) obj4, (l13) obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 27:
                lu4 lu4Var = (lu4) obj4;
                String str3 = (String) obj3;
                fe0 fe0Var8 = (fe0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                go1 go1Var8 = (go1) fe0Var8;
                if (!go1Var8.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    go1Var8.W();
                } else if (lu4Var == null && str3 == null) {
                    go1Var8.d0(811854046);
                    go1Var8.q(false);
                } else {
                    go1Var8.d0(811005173);
                    ba0 a3 = z90.a(new kp(6.0f, true, new y9()), q8.W, go1Var8, 54);
                    long j6 = go1Var8.T;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    am3 m5 = go1Var8.m();
                    l13 x05 = i42.x0(go1Var8, l13Var);
                    xd0.c.getClass();
                    go1Var8.h0();
                    if (go1Var8.S) {
                        go1Var8.l(df0Var);
                    } else {
                        go1Var8.r0();
                    }
                    qi4.k(go1Var8, q8.c0, a3);
                    qi4.k(go1Var8, q8.b0, m5);
                    qi4.k(go1Var8, q8.d0, Integer.valueOf(i10));
                    qi4.j(go1Var8);
                    qi4.k(go1Var8, q8.a0, x05);
                    if (lu4Var != null) {
                        go1Var8.d0(-1137930902);
                        wx5.c(lu4Var, null, true, go1Var8, 392);
                        go1Var8.q(false);
                    } else {
                        go1Var8.d0(-1137835763);
                        go1Var8.q(false);
                    }
                    if (str3 != null) {
                        go1Var8.d0(-1137759565);
                        r55.b(str3, i42.D0(mw2.p(l13Var, hx2.e, hx2.i), 8.0f, 2.0f), hx2.a, 0L, qk1.P, 0L, null, 0L, 0, false, 1, 0, xc3.e, go1Var8, 1572864, 24576, 114616);
                        go1Var8.q(false);
                    } else {
                        go1Var8.d0(-1137286195);
                        go1Var8.q(false);
                    }
                    go1Var8.q(true);
                    go1Var8.q(false);
                }
                return wd5Var;
            default:
                WidgetTheme$lambda$0 = WidgetUiKt.WidgetTheme$lambda$0((WidgetPalette) obj4, (hn1) obj3, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetTheme$lambda$0;
        }
    }

    public /* synthetic */ bj1(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    public /* synthetic */ bj1(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }
}
