package defpackage;

import coil3.compose.SingletonAsyncImageKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n03 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ k80 J;
    public final /* synthetic */ String K;

    public /* synthetic */ n03(String str, k80 k80Var) {
        this.I = (byte) 3;
        this.K = str;
        this.J = k80Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        i13 i13Var = i13.a;
        df0 df0Var = wa2.A0;
        String str = this.K;
        wd5 wd5Var = wd5.a;
        k80 k80Var = this.J;
        switch (b) {
            case 0:
                l13 l13Var = (l13) obj;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                l13Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).g(l13Var) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 19) != 18)) {
                    go1Var.W();
                    break;
                } else {
                    l13 p = mw2.p(o7.m(j42.e(l13Var, 1.7777778f, false), w03.a), k80Var.H, mw2.j);
                    uw2 c = px.c(q8.J, false);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, p);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    if (str == null || str.length() == 0) {
                        go1Var.d0(-1280075352);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-1280329490);
                        SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                        go1Var.q(false);
                    }
                    go1Var.q(true);
                    break;
                }
                break;
            case 1:
                hn1 hn1Var = (hn1) obj;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                hn1Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((go1) fe0Var2).i(hn1Var) ? 4 : 2;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    go1Var2.W();
                    break;
                } else {
                    ne1 ne1Var = nq4.c;
                    u74 a = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var2, 54);
                    long j2 = go1Var2.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var2.m();
                    l13 x02 = i42.x0(go1Var2, ne1Var);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    sg sgVar = q8.c0;
                    qi4.k(go1Var2, sgVar, a);
                    sg sgVar2 = q8.b0;
                    qi4.k(go1Var2, sgVar2, m2);
                    Integer valueOf = Integer.valueOf(i2);
                    sg sgVar3 = q8.d0;
                    qi4.k(go1Var2, sgVar3, valueOf);
                    qi4.j(go1Var2);
                    sg sgVar4 = q8.a0;
                    qi4.k(go1Var2, sgVar4, x02);
                    ow1.a(ad4.s(), null, nq4.k(i13Var, 22.0f), k80Var.s, go1Var2, 432);
                    sc2 sc2Var = new sc2(1.0f, true);
                    uw2 c2 = px.c(q8.M, false);
                    long j3 = go1Var2.T;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    am3 m3 = go1Var2.m();
                    l13 x03 = i42.x0(go1Var2, sc2Var);
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar, c2);
                    qi4.k(go1Var2, sgVar2, m3);
                    r7.G(i3, go1Var2, sgVar3, go1Var2);
                    qi4.k(go1Var2, sgVar4, x03);
                    if (jx4.L(str)) {
                        go1Var2.d0(1863340870);
                        r55.b("关键词或作品 ID", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var2.k(lw2.b)).b.j, go1Var2, 6, 24576, 114682);
                        go1Var2.q(false);
                    } else {
                        go1Var2.d0(1863611593);
                        go1Var2.q(false);
                    }
                    hn1Var.invoke(go1Var2, Integer.valueOf(intValue2 & 14));
                    go1Var2.q(true);
                    go1Var2.q(true);
                    break;
                }
            case 2:
                hn1 hn1Var2 = (hn1) obj;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                hn1Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((go1) fe0Var3).i(hn1Var2) ? 4 : 2;
                }
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    go1Var3.W();
                    break;
                } else {
                    ne1 ne1Var2 = nq4.c;
                    u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var3, 54);
                    long j4 = go1Var3.T;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    am3 m4 = go1Var3.m();
                    l13 x04 = i42.x0(go1Var3, ne1Var2);
                    xd0.c.getClass();
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(df0Var);
                    } else {
                        go1Var3.r0();
                    }
                    sg sgVar5 = q8.c0;
                    qi4.k(go1Var3, sgVar5, a2);
                    sg sgVar6 = q8.b0;
                    qi4.k(go1Var3, sgVar6, m4);
                    Integer valueOf2 = Integer.valueOf(i4);
                    sg sgVar7 = q8.d0;
                    qi4.k(go1Var3, sgVar7, valueOf2);
                    qi4.j(go1Var3);
                    sg sgVar8 = q8.a0;
                    qi4.k(go1Var3, sgVar8, x04);
                    ow1.a(ad4.s(), null, nq4.k(i13Var, 22.0f), k80Var.s, go1Var3, 432);
                    sc2 sc2Var2 = new sc2(1.0f, true);
                    uw2 c3 = px.c(q8.M, false);
                    long j5 = go1Var3.T;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    am3 m5 = go1Var3.m();
                    l13 x05 = i42.x0(go1Var3, sc2Var2);
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(df0Var);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, sgVar5, c3);
                    qi4.k(go1Var3, sgVar6, m5);
                    r7.G(i5, go1Var3, sgVar7, go1Var3);
                    qi4.k(go1Var3, sgVar8, x05);
                    if (jx4.L(str)) {
                        go1Var3.d0(1232705297);
                        r55.b("关键词或作品 ID", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var3.k(lw2.b)).b.j, go1Var3, 6, 24576, 114682);
                        go1Var3.q(false);
                    } else {
                        go1Var3.d0(1232975059);
                        go1Var3.q(false);
                    }
                    hn1Var2.invoke(go1Var3, Integer.valueOf(intValue3 & 14));
                    go1Var3.q(true);
                    go1Var3.q(true);
                    break;
                }
            default:
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    go1Var4.W();
                    break;
                } else {
                    p70.m(this.K, null, false, k80Var.M, go1Var4, 0, 6);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ n03(k80 k80Var, String str, byte b) {
        this.I = b;
        this.J = k80Var;
        this.K = str;
    }
}
