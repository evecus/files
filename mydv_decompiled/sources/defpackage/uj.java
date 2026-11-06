package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uj implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ uj(p34 p34Var, boolean z, rm1 rm1Var) {
        this.I = (byte) 0;
        this.K = p34Var;
        this.J = z;
        this.L = rm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        final sb4 sb4Var;
        final ki1 ki1Var;
        final boolean z;
        byte b = this.I;
        boolean z2 = this.J;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                final p34 p34Var = (p34) obj4;
                final rm1 rm1Var = (rm1) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    final bw0 bw0Var = (bw0) go1Var.k(cw0.a);
                    boolean z3 = bw0Var.c == aw0.I;
                    final float f = ((Configuration) go1Var.k(rb.a)).screenHeightDp * (bw0Var.f ? 0.7f : 0.8f);
                    xx3 xx3Var = lw2.b;
                    final k80 k80Var = ((fw2) go1Var.k(xx3Var)).a;
                    final long j = ((fw2) go1Var.k(xx3Var)).a.G;
                    sb4 E = wx5.E(go1Var);
                    boolean z4 = E.f.h() > 0;
                    boolean g = go1Var.g(E);
                    Object Q = go1Var.Q();
                    Object obj5 = de0.a;
                    if (g || Q == obj5) {
                        Q = dt4.b(new vj(E, (byte) 0));
                        go1Var.o0(Q);
                    }
                    final cw4 cw4Var = (cw4) Q;
                    Object Q2 = go1Var.Q();
                    if (Q2 == obj5) {
                        Q2 = pt1.r(go1Var);
                    }
                    ki1 ki1Var2 = (ki1) Q2;
                    Object Q3 = go1Var.Q();
                    if (Q3 == obj5) {
                        Q3 = pt1.r(go1Var);
                    }
                    final ki1 ki1Var3 = (ki1) Q3;
                    Object Q4 = go1Var.Q();
                    if (Q4 == obj5) {
                        Q4 = ad4.w(Boolean.FALSE);
                        go1Var.o0(Q4);
                    }
                    final t43 t43Var = (t43) Q4;
                    Object Q5 = go1Var.Q();
                    if (Q5 == obj5) {
                        Q5 = mw2.w(go1Var);
                        go1Var.o0(Q5);
                    }
                    final dl0 dl0Var = (dl0) Q5;
                    boolean h = go1Var.h(z3) | go1Var.g(E);
                    final boolean z5 = z4;
                    Object Q6 = go1Var.Q();
                    if (h || Q6 == obj5) {
                        boolean z6 = z3;
                        sb4Var = E;
                        Object zjVar = new zj((byte) 0, null, sb4Var, ki1Var2, ki1Var3, z6);
                        ki1Var = ki1Var2;
                        z = z6;
                        go1Var.o0(zjVar);
                        Q6 = zjVar;
                    } else {
                        sb4Var = E;
                        ki1Var = ki1Var2;
                        z = z3;
                    }
                    mw2.h(go1Var, (hn1) Q6, wd5Var);
                    final boolean z7 = this.J;
                    eu5.g(p70.u0(-1255239279, new hn1() { // from class: wj
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj6, Object obj7) {
                            String str;
                            boolean z8;
                            ki1 ki1Var4;
                            go1 go1Var2;
                            boolean z9;
                            boolean z10;
                            p34 p34Var2 = p34Var;
                            String str2 = p34Var2.e;
                            fe0 fe0Var2 = (fe0) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            go1 go1Var3 = (go1) fe0Var2;
                            if (go1Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                i13 i13Var = i13.a;
                                l13 i = nq4.i(nq4.p(i42.E0(i13Var, 24.0f, 0.0f, 2).then(bw0.this.f ? nq4.e(i13Var, 1.0f) : nq4.n(i13Var, 560.0f)), 0.0f, 560.0f, 1), 0.0f, f, 1);
                                k74 k74Var = jo.f;
                                l13 U = fb4.U(i, 12.0f, k74Var);
                                long j2 = j;
                                l13 F0 = i42.F0(mw2.p(U, j2, k74Var), 24.0f, 24.0f, 24.0f, 20.0f);
                                ba0 a = z90.a(i42.d, q8.V, go1Var3, 0);
                                long j3 = go1Var3.T;
                                int i2 = (int) (j3 ^ (j3 >>> 32));
                                am3 m = go1Var3.m();
                                l13 x0 = i42.x0(go1Var3, F0);
                                xd0.c.getClass();
                                go1Var3.h0();
                                boolean z11 = go1Var3.S;
                                rm1 rm1Var2 = wa2.A0;
                                if (z11) {
                                    go1Var3.l(rm1Var2);
                                } else {
                                    go1Var3.r0();
                                }
                                sg sgVar = q8.c0;
                                qi4.k(go1Var3, sgVar, a);
                                sg sgVar2 = q8.b0;
                                qi4.k(go1Var3, sgVar2, m);
                                Integer valueOf = Integer.valueOf(i2);
                                sg sgVar3 = q8.d0;
                                qi4.k(go1Var3, sgVar3, valueOf);
                                qi4.j(go1Var3);
                                sg sgVar4 = q8.a0;
                                qi4.k(go1Var3, sgVar4, x0);
                                String str3 = p34Var2.b;
                                boolean z12 = z7;
                                c5.b(str3, z12, go1Var3, 0);
                                oh4.a(go1Var3, nq4.g(i13Var, 16.0f));
                                if (1.0f <= 0.0d) {
                                    o02.a("invalid weight; must be greater than zero");
                                }
                                l13 x = j42.x(new sc2(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), ki1Var);
                                Object Q7 = go1Var3.Q();
                                t43 t43Var2 = t43Var;
                                Object obj8 = de0.a;
                                if (Q7 == obj8) {
                                    Q7 = new uf(t43Var2, (byte) 1);
                                    go1Var3.o0(Q7);
                                }
                                l13 A0 = i42.A0(x, (tm1) Q7);
                                dl0 dl0Var2 = dl0Var;
                                boolean i3 = go1Var3.i(dl0Var2);
                                sb4 sb4Var2 = sb4Var;
                                boolean g2 = i3 | go1Var3.g(sb4Var2);
                                Object Q8 = go1Var3.Q();
                                if (g2 || Q8 == obj8) {
                                    Q8 = new xj(dl0Var2, sb4Var2);
                                    go1Var3.o0(Q8);
                                }
                                rm1 rm1Var3 = (rm1) Q8;
                                boolean g3 = go1Var3.g(sb4Var2) | go1Var3.i(dl0Var2);
                                Object Q9 = go1Var3.Q();
                                ki1 ki1Var5 = ki1Var3;
                                if (g3 || Q9 == obj8) {
                                    Q9 = new yj(sb4Var2, dl0Var2, ki1Var5, (byte) 0);
                                    go1Var3.o0(Q9);
                                }
                                l13 d = r13.d(A0, null, null, rm1Var3, (rm1) Q9, null, null, null, null, null, null, null, null, 245679);
                                boolean z13 = z;
                                boolean z14 = z5;
                                if (z13 && z14) {
                                    str = str2;
                                    z8 = true;
                                } else {
                                    str = str2;
                                    z8 = false;
                                }
                                l13 B = mw2.B(d, z8, null, 2);
                                uw2 c = px.c(q8.J, false);
                                long j4 = go1Var3.T;
                                int i4 = (int) (j4 ^ (j4 >>> 32));
                                am3 m2 = go1Var3.m();
                                l13 x02 = i42.x0(go1Var3, B);
                                go1Var3.h0();
                                if (go1Var3.S) {
                                    go1Var3.l(rm1Var2);
                                } else {
                                    go1Var3.r0();
                                }
                                qi4.k(go1Var3, sgVar, c);
                                qi4.k(go1Var3, sgVar2, m2);
                                r7.G(i4, go1Var3, sgVar3, go1Var3);
                                qi4.k(go1Var3, sgVar4, x02);
                                r55.b(p34Var2.c, i42.G0(wx5.G(i13Var, sb4Var2, true), 0.0f, 0.0f, z14 ? 16.0f : 0.0f, 0.0f, 11), k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var3.k(lw2.b)).b.k, go1Var3, 0, 0, 131064);
                                if (z14) {
                                    go1Var3.d0(-1650034701);
                                    boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
                                    vv vvVar = q8.O;
                                    ux uxVar = ux.a;
                                    il2.d(sb4Var2, booleanValue, uxVar.align(i13Var, vvVar), go1Var3, 0);
                                    if (((Boolean) cw4Var.getValue()).booleanValue()) {
                                        ki1Var4 = ki1Var5;
                                        z10 = false;
                                        go1Var3.d0(-1649343339);
                                        go1Var3.q(false);
                                    } else {
                                        go1Var3.d0(-1649775789);
                                        ki1Var4 = ki1Var5;
                                        z10 = false;
                                        px.a(mw2.o(nq4.g(i42.G0(nq4.e(uxVar.align(i13Var, q8.Q), 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f), jp.A(p70.k0(new x70(x70.f), new x70(j2)))), go1Var3, 0);
                                        go1Var3.q(false);
                                    }
                                    go1Var3.q(z10);
                                } else {
                                    ki1Var4 = ki1Var5;
                                    go1Var3.d0(-1649325483);
                                    go1Var3.q(false);
                                }
                                go1Var3.q(true);
                                oh4.a(go1Var3, nq4.g(i13Var, z12 ? 20.0f : 16.0f));
                                l13 e = nq4.e(i13Var, 1.0f);
                                u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var3, 54);
                                long j5 = go1Var3.T;
                                int i5 = (int) (j5 ^ (j5 >>> 32));
                                am3 m3 = go1Var3.m();
                                l13 x03 = i42.x0(go1Var3, e);
                                go1Var3.h0();
                                if (go1Var3.S) {
                                    go1Var3.l(rm1Var2);
                                } else {
                                    go1Var3.r0();
                                }
                                qi4.k(go1Var3, sgVar, a2);
                                qi4.k(go1Var3, sgVar2, m3);
                                r7.G(i5, go1Var3, sgVar3, go1Var3);
                                qi4.k(go1Var3, sgVar4, x03);
                                if (z14 && z13) {
                                    go1Var3.d0(1434434490);
                                    go1Var2 = go1Var3;
                                    il2.c(sb4Var2, ((Boolean) t43Var2.getValue()).booleanValue(), "↓ 到按钮", null, go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                    go1Var2.q(false);
                                } else {
                                    go1Var2 = go1Var3;
                                    go1Var2.d0(1434554615);
                                    go1Var2.q(false);
                                }
                                rm1 rm1Var4 = rm1Var;
                                if (z12) {
                                    go1Var2.d0(1434593055);
                                    p70.h(48, 0, go1Var2, rm1Var4, j42.x(nt3.x(i13Var, 1.0f), ki1Var4), str, true);
                                    go1Var2.q(false);
                                } else {
                                    ki1 ki1Var6 = ki1Var4;
                                    String str4 = str;
                                    go1Var2.d0(1434915610);
                                    oh4.a(go1Var2, nt3.x(i13Var, 1.0f));
                                    if (p34Var2.g) {
                                        go1Var2.d0(1435012020);
                                        p70.h(48, 8, go1Var2, rm1Var4, null, p34Var2.f, false);
                                        z9 = false;
                                        go1Var2.q(false);
                                    } else {
                                        z9 = false;
                                        go1Var2.d0(1435137911);
                                        go1Var2.q(false);
                                    }
                                    p70.h(48, 0, go1Var2, rm1Var4, j42.x(i13Var, ki1Var6), str4, true);
                                    go1Var2.q(z9);
                                }
                                go1Var2.q(true);
                                go1Var2.q(true);
                            } else {
                                go1Var3.W();
                            }
                            return wd5.a;
                        }
                    }, go1Var), go1Var, 6);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                dj1.a((Activity) obj4, z2, (tc0) obj3, (fe0) obj, mu0.X(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                il2.d((sb4) obj4, z2, (l13) obj3, (fe0) obj, mu0.X(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ou2.c((ku2) obj4, z2, (tm1) obj3, (fe0) obj, mu0.X(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                mw3.o((String) obj4, (String) obj3, z2, (fe0) obj, mu0.X(385));
                break;
            default:
                hn1 hn1Var = (hn1) obj4;
                Integer num = (Integer) obj;
                num.getClass();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                ((t43) obj3).setValue(new uj3(num, num2));
                if (z2 && hn1Var != null) {
                    hn1Var.invoke(num, num2);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ uj(Object obj, Object obj2, boolean z, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = z;
        this.L = obj2;
    }

    public /* synthetic */ uj(boolean z, hn1 hn1Var, t43 t43Var) {
        this.I = (byte) 5;
        this.J = z;
        this.K = hn1Var;
        this.L = t43Var;
    }

    public /* synthetic */ uj(boolean z, String str, int i, String str2) {
        this.I = (byte) 4;
        this.K = str;
        this.L = str2;
        this.J = z;
    }
}
