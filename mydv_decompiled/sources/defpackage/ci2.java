package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ci2 {
    public static final long a = qb.j(4288040947L);
    public static final v24 b = new v24("^(\\d{1,2})\\s*[.、．]\\s*(.+)$");

    public static final void a(final float f, fe0 fe0Var, final int i) {
        int i2;
        Object g54Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-769133157);
        if ((i & 6) == 0) {
            i2 = (go1Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go1Var.k(rb.b);
            int X = ((iu0) go1Var.k(hf0.h)).X(f);
            boolean g = go1Var.g(context) | go1Var.e(X);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                try {
                    Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
                    applicationIcon.getClass();
                    g54Var = new dd(c21.J(applicationIcon, X, X));
                } catch (Throwable th) {
                    g54Var = new g54(th);
                }
                if (g54Var instanceof g54) {
                    g54Var = null;
                }
                Q = (tw1) g54Var;
                go1Var.o0(Q);
            }
            tw1 tw1Var = (tw1) Q;
            i13 i13Var = i13.a;
            if (tw1Var != null) {
                go1Var.d0(405007078);
                ut0.b(tw1Var, "myDV", nq4.k(i13Var, f), null, go1Var, 48, 248);
                go1Var.q(false);
            } else {
                go1Var.d0(405124754);
                l13 m = o7.m(nq4.k(i13Var, f), l74.a);
                uw2 c = px.c(q8.J, false);
                long j = go1Var.T;
                int i3 = (int) (j ^ (j >>> 32));
                am3 m2 = go1Var.m();
                l13 x0 = i42.x0(go1Var, m);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(wa2.A0);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, q8.c0, c);
                qi4.k(go1Var, q8.b0, m2);
                qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
                qi4.j(go1Var);
                qi4.k(go1Var, q8.a0, x0);
                rj3 M = vt0.M(go1Var, R.mipmap.ic_launcher_background);
                ux uxVar = ux.a;
                l13 matchParentSize = uxVar.matchParentSize(i13Var);
                int i4 = rj3.$stable | 24624;
                jp jpVar = li0.a;
                ut0.a(M, null, matchParentSize, null, jpVar, 0.0f, null, go1Var, i4, 104);
                ut0.a(vt0.M(go1Var, R.mipmap.ic_launcher_foreground), "myDV", uxVar.matchParentSize(i13Var), null, jpVar, 0.0f, null, go1Var, i4, 104);
                go1Var.q(true);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: uh2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int X2 = mu0.X(i | 1);
                    ci2.a(f, (fe0) obj, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(rm1 rm1Var, rm1 rm1Var2, l13 l13Var, fe0 fe0Var, int i) {
        rm1Var.getClass();
        rm1Var2.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1360487735);
        int i2 = (go1Var.i(rm1Var) ? 4 : 2) | i | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            j(p70.u0(489611083, new bj1(rm1Var, rm1Var2, (byte) 1), go1Var), go1Var, 6);
            l13Var = i13.a;
        } else {
            go1Var.W();
        }
        l13 l13Var2 = l13Var;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) rm1Var, (Object) rm1Var2, l13Var2, i, (byte) 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r11 == defpackage.de0.a) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r35, boolean r36, defpackage.l13 r37, defpackage.fe0 r38, int r39) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci2.c(java.lang.String, boolean, l13, fe0, int):void");
    }

    public static final void d(final q34 q34Var, final boolean z, final boolean z2, boolean z3, final boolean z4, final k74 k74Var, final long j, final li3 li3Var, final ki1 ki1Var, final ki1 ki1Var2, final l13 l13Var, tc0 tc0Var, fe0 fe0Var, final int i) {
        final tc0 tc0Var2;
        go1 go1Var;
        boolean z5;
        int i2;
        i13 i13Var;
        sg sgVar;
        sg sgVar2;
        sg sgVar3;
        boolean z6;
        m65 m65Var;
        boolean z7;
        Object sh2Var;
        boolean z8;
        boolean z9;
        sb4 sb4Var;
        i13 i13Var2;
        boolean z10;
        boolean z11;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(797497108);
        int i3 = (go1Var2.g(q34Var) ? 4 : 2) | i | (go1Var2.h(z) ? 32 : 16) | (go1Var2.h(z2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= go1Var2.h(z3) ? 2048 : 1024;
        }
        int i4 = i3 | (go1Var2.g(k74Var) ? 131072 : 65536) | (go1Var2.f(j) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i) == 0) {
            i4 |= go1Var2.g(li3Var) ? 8388608 : 4194304;
        }
        if (go1Var2.T(i4 & 1, ((306783379 & i4) == 306783378 && (((go1Var2.g(l13Var) ? (char) 4 : (char) 2) | '0') & 19) == 18) ? false : true)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            sb4 E = wx5.E(go1Var2);
            boolean z12 = q34Var == null;
            boolean z13 = E.f.h() > 0;
            boolean g = go1Var2.g(E);
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                i2 = i4;
                Q = dt4.b(new vj(E, (byte) 1));
                go1Var2.o0(Q);
            } else {
                i2 = i4;
            }
            cw4 cw4Var = (cw4) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = mw2.w(go1Var2);
                go1Var2.o0(Q3);
            }
            dl0 dl0Var = (dl0) Q3;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.H, false, "license-card-bg", go1Var2, ((i2 >> 15) & 112) | 24576, 8);
            go1Var = go1Var2;
            l13 B0 = i42.B0(p70.H(o7.m(l13Var, k74Var), t0), li3Var);
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            boolean z14 = z13;
            long j2 = go1Var.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, B0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z15 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z15) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar4 = q8.c0;
            qi4.k(go1Var, sgVar4, a2);
            sg sgVar5 = q8.b0;
            qi4.k(go1Var, sgVar5, m);
            Integer valueOf = Integer.valueOf(i5);
            sg sgVar6 = q8.d0;
            qi4.k(go1Var, sgVar6, valueOf);
            qi4.j(go1Var);
            sg sgVar7 = q8.a0;
            qi4.k(go1Var, sgVar7, x0);
            u74 a3 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            i13 i13Var3 = i13.a;
            l13 x02 = i42.x0(go1Var, i13Var3);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a3);
            qi4.k(go1Var, sgVar5, m2);
            r7.G(i6, go1Var, sgVar6, go1Var);
            qi4.k(go1Var, sgVar7, x02);
            hx1 hx1Var = k21.d;
            if (hx1Var != null) {
                sgVar3 = sgVar5;
                sgVar = sgVar7;
                sgVar2 = sgVar6;
                i13Var = i13Var3;
            } else {
                gx1 gx1Var = new gx1("Filled.Gavel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i7 = th5.a;
                long j4 = x70.b;
                rt4 rt4Var = new rt4(j4);
                i13Var = i13Var3;
                ArrayList arrayList = new ArrayList(32);
                sgVar = sgVar7;
                sgVar2 = sgVar6;
                arrayList.add(new vk3(5.25f, 8.069f));
                arrayList.add(new cl3(2.83f, -2.827f));
                arrayList.add(new cl3(14.134f, 14.15f));
                arrayList.add(new cl3(-2.83f, 2.827f));
                rk3 rk3Var = rk3.c;
                arrayList.add(rk3Var);
                gx1.a(gx1Var, arrayList, rt4Var);
                rt4 rt4Var2 = new rt4(j4);
                ArrayList arrayList2 = new ArrayList(32);
                sgVar3 = sgVar5;
                arrayList2.add(new vk3(9.486f, 3.827f));
                arrayList2.add(new cl3(2.828f, -2.829f));
                arrayList2.add(new cl3(5.658f, 5.656f));
                arrayList2.add(new cl3(-2.828f, 2.829f));
                arrayList2.add(rk3Var);
                gx1.a(gx1Var, arrayList2, rt4Var2);
                rt4 rt4Var3 = new rt4(j4);
                ArrayList arrayList3 = new ArrayList(32);
                arrayList3.add(new vk3(0.999f, 12.315f));
                arrayList3.add(new cl3(2.828f, -2.828f));
                arrayList3.add(new cl3(5.657f, 5.657f));
                arrayList3.add(new cl3(-2.828f, 2.828f));
                arrayList3.add(rk3Var);
                gx1.a(gx1Var, arrayList3, rt4Var3);
                rt4 rt4Var4 = new rt4(j4);
                ArrayList arrayList4 = new ArrayList(32);
                arrayList4.add(new vk3(1.0f, 21.0f));
                arrayList4.add(new bl3(12.0f));
                arrayList4.add(new hl3(2.0f));
                arrayList4.add(new bl3(-12.0f));
                arrayList4.add(rk3Var);
                gx1.a(gx1Var, arrayList4, rt4Var4);
                hx1Var = gx1Var.b();
                k21.d = hx1Var;
            }
            k(hx1Var, go1Var, 0);
            String str = q34Var != null ? q34Var.a : "用户许可协议";
            if (z3) {
                go1Var.d0(-1527829595);
                m65Var = ((fw2) go1Var.k(i51Var)).b.h;
                z6 = false;
            } else {
                z6 = false;
                go1Var.d0(-1527828252);
                m65Var = ((fw2) go1Var.k(i51Var)).b.g;
            }
            go1Var.q(z6);
            m65 m65Var2 = m65Var;
            i13 i13Var4 = i13Var;
            r55.b(str, new sc2(1.0f, true), k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, m65Var2, go1Var, 1572864, 0, 131000);
            String str2 = q34Var != null ? q34Var.c : null;
            if (!z2 || str2 == null) {
                z7 = false;
                go1Var.d0(-117784888);
            } else {
                go1Var.d0(-1527820600);
                z7 = false;
                e(str2, go1Var, 0);
            }
            go1Var.q(z7);
            go1Var.q(true);
            oh4.a(go1Var, nq4.g(i13Var4, z3 ? 12.0f : 14.0f));
            if (z) {
                go1Var.d0(-314338199);
                f(go1Var, 0);
                oh4.a(go1Var, nq4.g(i13Var4, 10.0f));
                go1Var.q(false);
            } else {
                go1Var.d0(-314250748);
                go1Var.q(false);
            }
            if (1.0f <= 0.0d) {
                o02.a("invalid weight; must be greater than zero");
            }
            l13 x = j42.x(new sc2(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z4), ki1Var);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new uf(t43Var, (byte) 18);
                go1Var.o0(Q4);
            }
            l13 A0 = i42.A0(x, (tm1) Q4);
            boolean h = go1Var.h(z14) | go1Var.i(dl0Var) | go1Var.g(E);
            Object Q5 = go1Var.Q();
            if (h || Q5 == jpVar) {
                Q5 = new zv1((byte) 1, dl0Var, E, z14);
                go1Var.o0(Q5);
            }
            rm1 rm1Var = (rm1) Q5;
            boolean z16 = z12;
            boolean h2 = go1Var.h(z16) | go1Var.h(z14) | go1Var.g(E) | go1Var.i(dl0Var);
            Object Q6 = go1Var.Q();
            if (h2 || Q6 == jpVar) {
                sh2Var = new sh2(z16, z14, E, dl0Var, ki1Var2);
                z8 = z16;
                z9 = z14;
                sb4Var = E;
                go1Var.o0(sh2Var);
            } else {
                z9 = z14;
                z8 = z16;
                sh2Var = Q6;
                sb4Var = E;
            }
            l13 B = mw2.B(r13.d(A0, null, null, rm1Var, (rm1) sh2Var, null, null, null, null, null, null, null, null, 245679), z2 && (z8 || z9), null, 2);
            uw2 c = px.c(z8 ? q8.N : q8.J, false);
            long j5 = go1Var.T;
            int i8 = (int) (j5 ^ (j5 >>> 32));
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, B);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, c);
            sg sgVar8 = sgVar3;
            qi4.k(go1Var, sgVar8, m3);
            sg sgVar9 = sgVar2;
            r7.G(i8, go1Var, sgVar9, go1Var);
            sg sgVar10 = sgVar;
            qi4.k(go1Var, sgVar10, x03);
            if (q34Var == null) {
                go1Var.d0(-1595672660);
                l13 E0 = i42.E0(nq4.e(i13Var4, 1.0f), 0.0f, 28.0f, 1);
                ba0 a4 = z90.a(new kp(12.0f, true, new y9()), q8.W, go1Var, 54);
                long j6 = go1Var.T;
                int i9 = (int) (j6 ^ (j6 >>> 32));
                am3 m4 = go1Var.m();
                l13 x04 = i42.x0(go1Var, E0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a4);
                qi4.k(go1Var, sgVar8, m4);
                r7.G(i9, go1Var, sgVar9, go1Var);
                qi4.k(go1Var, sgVar10, x04);
                p70.g(null, 48.0f, 0L, 0L, go1Var, 48, 13);
                r55.b("正在获取最新协议…", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.k, go1Var, 6, 0, 131066);
                go1Var.q(true);
                go1Var.q(false);
                z11 = true;
                i13Var2 = i13Var4;
                z5 = z3;
            } else {
                go1Var.d0(-1595032045);
                i13Var2 = i13Var4;
                z5 = z3;
                c(q34Var.b, z5, i42.G0(wx5.G(i13Var2, sb4Var, true), 0.0f, 0.0f, z9 ? 16.0f : 0.0f, 0.0f, 11), go1Var, (i2 >> 6) & 112);
                if (z9) {
                    go1Var.d0(-1594714388);
                    boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
                    vv vvVar = q8.O;
                    ux uxVar = ux.a;
                    il2.d(sb4Var, booleanValue, uxVar.align(i13Var2, vvVar), go1Var, 0);
                    if (((Boolean) cw4Var.getValue()).booleanValue()) {
                        z10 = false;
                        go1Var.d0(-1593873110);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-1594455476);
                        l13 g2 = nq4.g(i42.G0(nq4.e(uxVar.align(i13Var2, q8.Q), 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 48.0f);
                        boolean g3 = go1Var.g(t0);
                        Object Q7 = go1Var.Q();
                        if (g3 || Q7 == jpVar) {
                            Q7 = new z20(t0, (byte) 1);
                            go1Var.o0(Q7);
                        }
                        z10 = false;
                        px.a(j42.u(g2, (tm1) Q7), go1Var, 0);
                        go1Var.q(false);
                    }
                    go1Var.q(z10);
                } else {
                    z10 = false;
                    go1Var.d0(-1593855254);
                    go1Var.q(false);
                }
                go1Var.q(z10);
                z11 = true;
            }
            go1Var.q(z11);
            if (z9 && z2) {
                go1Var.d0(-311294495);
                oh4.a(go1Var, nq4.g(i13Var2, 10.0f));
                il2.c(sb4Var, ((Boolean) t43Var.getValue()).booleanValue(), "↓ 去同意", null, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                go1Var.q(false);
            } else {
                go1Var.d0(-311137852);
                go1Var.q(false);
            }
            String str3 = q34Var != null ? q34Var.c : null;
            if (z2 || str3 == null) {
                go1Var.d0(-310973180);
                go1Var.q(false);
            } else {
                go1Var.d0(-311069280);
                oh4.a(go1Var, nq4.g(i13Var2, 10.0f));
                g(str3, go1Var, 0);
                go1Var.q(false);
            }
            oh4.a(go1Var, nq4.g(i13Var2, 16.0f));
            tc0Var2 = tc0Var;
            tc0Var2.invoke(go1Var, 6);
            go1Var.q(true);
        } else {
            tc0Var2 = tc0Var;
            go1Var = go1Var2;
            z5 = z3;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final boolean z17 = z5;
            u.d = new hn1() { // from class: th2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    ci2.d(q34.this, z, z2, z17, z4, k74Var, j, li3Var, ki1Var, ki1Var2, l13Var, tc0Var2, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void e(String str, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(586798296);
        int i2 = i | (go1Var.g(str) ? 4 : 2);
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            cy3 h = hy3.h(go1Var);
            Bitmap g = hy3.g(str, h, go1Var, (i2 & 14) | 48, 0);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, i13.a);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            i51 i51Var = lw2.b;
            r55.b("扫码看全文", null, ((fw2) go1Var.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 6, 0, 131066);
            go1Var = go1Var;
            hy3.d(h, 72.0f, null, p70.u0(762754842, new xh2(g, (byte) 0), go1Var), go1Var, 3120);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn2(str, i, (byte) 3);
        }
    }

    public static final void f(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1935062598);
        if (go1Var.T(i & 1, i != 0)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(mw2.p(o7.m(nq4.g(i13Var, 26.0f), l74.a(8.0f)), k80Var.l, mw2.j), 9.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
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
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(fb4.w(), null, nq4.k(i13Var, 14.0f), k80Var.m, go1Var, 432);
            r55.b("网络不可用，显示内置协议", null, k80Var.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 6, 0, 131066);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zw1(i);
        }
    }

    public static final void g(String str, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1538268665);
        int i2 = (go1Var.g(str) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go1Var.k(rb.b);
            i51 i51Var = lw2.b;
            long j = ((fw2) go1Var.k(i51Var)).a.a;
            k74 a2 = l74.a(8.0f);
            i13 i13Var = i13.a;
            l13 m = o7.m(i13Var, a2);
            boolean i3 = go1Var.i(context) | ((i2 & 14) == 4);
            Object Q = go1Var.Q();
            if (i3 || Q == de0.a) {
                Q = new pc2(context, str, (byte) 1);
                go1Var.o0(Q);
            }
            l13 E0 = i42.E0(r13.d(m, null, null, null, null, (rm1) Q, null, null, null, null, null, null, null, 261887), 0.0f, 4.0f, 1);
            u74 a3 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a3);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hx1 hx1Var = dq2.c;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("AutoMirrored.Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i5 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep epVar = new ep((byte) 13);
                epVar.z(19.0f, 19.0f);
                epVar.u(5.0f);
                epVar.L(5.0f);
                epVar.v(7.0f);
                epVar.L(3.0f);
                epVar.u(5.0f);
                epVar.r(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                epVar.M(14.0f);
                epVar.r(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                epVar.v(14.0f);
                epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                epVar.M(-7.0f);
                epVar.v(-2.0f);
                epVar.M(7.0f);
                epVar.p();
                epVar.z(14.0f, 3.0f);
                epVar.M(2.0f);
                epVar.v(3.59f);
                epVar.y(-9.83f, 9.83f);
                epVar.y(1.41f, 1.41f);
                epVar.x(19.0f, 6.41f);
                epVar.L(10.0f);
                epVar.v(2.0f);
                epVar.L(3.0f);
                epVar.v(-7.0f);
                epVar.p();
                gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                hx1Var = gx1Var.b();
                dq2.c = hx1Var;
            }
            ow1.a(hx1Var, null, nq4.k(i13Var, 16.0f), j, go1Var, 432);
            r55.b("在浏览器打开全文", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, 6, 0, 131066);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn2(str, i, (byte) 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r32, final defpackage.rm1 r33, final boolean r34, final defpackage.l13 r35, boolean r36, long r37, float r39, defpackage.fe0 r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci2.h(java.lang.String, rm1, boolean, l13, boolean, long, float, fe0, int, int):void");
    }

    public static final void i(final float f, final boolean z, final String str, final l13 l13Var, fe0 fe0Var, final int i) {
        int i2;
        k80 k80Var;
        i51 i51Var;
        ew2 ew2Var;
        m65 m65Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-322757669);
        if ((i & 6) == 0) {
            i2 = (go1Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(str) ? 256 : 128;
        }
        int i3 = i2 | (go1Var.g(l13Var) ? 2048 : 1024);
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            i51 i51Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var2)).a;
            bw0 bw0Var = (bw0) go1Var.k(cw0.a);
            jp jpVar = dw2.a;
            ew2 L = rt0.L(jp.k(), go1Var);
            e02 e02Var = null;
            if (bw0Var.e) {
                go1Var.d0(1158361747);
                go1Var.q(false);
                i51Var = i51Var2;
                k80Var = k80Var2;
                ew2Var = L;
            } else {
                go1Var.d0(1158396250);
                k80Var = k80Var2;
                i51Var = i51Var2;
                ew2Var = L;
                e02Var = c21.i(c21.F("welcome-halo", go1Var), 0.0f, 360.0f, qb.R(qb.k0(24000, 2, m61.b), null, 0L, 6), "welcome-halo-rotation", go1Var);
                go1Var.q(false);
            }
            ba0 a2 = z90.a(i42.d, q8.W, go1Var, 48);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
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
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            i13 i13Var = i13.a;
            l13 k = nq4.k(i13Var, 2.54f * f);
            uw2 c = px.c(q8.N, false);
            i51 i51Var3 = i51Var;
            k80 k80Var3 = k80Var;
            long j2 = go1Var.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, k);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            l13 matchParentSize = ux.a.matchParentSize(i13Var);
            boolean g = go1Var.g(e02Var);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new z20(e02Var, (byte) 2);
                go1Var.o0(Q);
            }
            l13 m3 = o7.m(qb.O(matchParentSize, (tm1) Q), ew2Var);
            long c2 = x70.c(k80Var3.a, 0.12f);
            aj5 aj5Var = mw2.j;
            px.a(mw2.p(m3, c2, aj5Var), go1Var, 0);
            px.a(mw2.p(o7.m(nq4.k(i13Var, 1.79f * f), ew2Var), x70.c(k80Var3.c, 0.72f), aj5Var), go1Var, 0);
            a(f, go1Var, i3 & 14);
            go1Var.q(true);
            oh4.a(go1Var, nq4.g(i13Var, z ? 8.0f : 14.0f));
            r55.b("欢迎使用", null, k80Var3.s, 0L, null, oh4.j(2), null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var3)).b.n, go1Var, 100663302, 0, 130810);
            if (z) {
                go1Var.d0(1573321266);
                m65Var = ((fw2) go1Var.k(i51Var3)).b.d;
            } else {
                go1Var.d0(1573322673);
                m65Var = ((fw2) go1Var.k(i51Var3)).b.a;
            }
            go1Var.q(false);
            r55.b("myDV", null, k80Var3.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65.a(m65Var, 0L, 0L, qk1.P, mc5.b, 0L, null, 0L, null, 16777179), go1Var, 6, 0, 131066);
            r55.b(str, i42.G0(i13Var, 0.0f, z ? 2.0f : 6.0f, 0.0f, 0.0f, 13), k80Var3.s, 0L, null, 0L, new k25(3), 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var3)).b.k, go1Var, (i3 >> 6) & 14, 0, 130040);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ai2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ci2.i(f, z, str, l13Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void j(tc0 tc0Var, fe0 fe0Var, int i) {
        tc0 tc0Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(574255691);
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            double d = ((bw0) go1Var.k(cw0.a)).d ? 0.5d : 0.0d;
            boolean c = go1Var.c(d);
            Object Q = go1Var.Q();
            if (c || Q == de0.a) {
                LruCache lruCache = va4.a;
                Q = va4.b(a, true, vj3.K, d);
                go1Var.o0(Q);
            }
            tc0Var2 = tc0Var;
            lw2.a((k80) Q, rn.a, jo.h, mc5.a, tc0Var2, go1Var, 24576);
        } else {
            tc0Var2 = tc0Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new x10(tc0Var2, i, (byte) 5);
        }
    }

    public static final void k(hx1 hx1Var, fe0 fe0Var, int i) {
        hx1 hx1Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(887014923);
        int i2 = (go1Var.g(hx1Var) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            i13 i13Var = i13.a;
            l13 p = mw2.p(o7.m(nq4.k(i13Var, 28.0f), rt0.L(dw2.a.l(), go1Var)), k80Var.l, mw2.j);
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, p);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            long j2 = k80Var.m;
            hx1Var2 = hx1Var;
            ow1.a(hx1Var2, null, nq4.k(i13Var, 16.0f), j2, go1Var, (i2 & 14) | 432);
            go1Var.q(true);
        } else {
            hx1Var2 = hx1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(hx1Var2, i, (byte) 7);
        }
    }
}
