package defpackage;

import com.github.mytv.dv.model.Author;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fu1 implements in1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ cw4 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ fu1(k80 k80Var, ki1 ki1Var, cw4 cw4Var, Author author, String str, fl4 fl4Var) {
        this.L = k80Var;
        this.J = ki1Var;
        this.M = cw4Var;
        this.N = author;
        this.K = str;
        this.O = fl4Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sg sgVar;
        sg sgVar2;
        long j;
        boolean z;
        hu2 hu2Var;
        i51 i51Var;
        long j2;
        jp jpVar;
        long j3;
        i13 i13Var;
        cw4 cw4Var;
        long j4;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        df0 df0Var = wa2.A0;
        jp jpVar2 = de0.a;
        Object obj4 = this.O;
        String str = this.K;
        Object obj5 = this.N;
        cw4 cw4Var2 = this.M;
        ki1 ki1Var = this.J;
        Object obj6 = this.L;
        switch (b) {
            case 0:
                sg sgVar3 = q8.a0;
                sg sgVar4 = q8.d0;
                sg sgVar5 = q8.b0;
                sg sgVar6 = q8.c0;
                t43 t43Var = (t43) obj6;
                hu2 hu2Var2 = (hu2) obj4;
                t43 t43Var2 = (t43) cw4Var2;
                t43 t43Var3 = (t43) obj5;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ea0) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    i13 i13Var2 = i13.a;
                    l13 E0 = i42.E0(i13Var2, 0.0f, 8.0f, 1);
                    ba0 a = z90.a(i42.d, q8.V, go1Var, 0);
                    ki1 ki1Var2 = ki1Var;
                    long j5 = go1Var.T;
                    int i = (int) (j5 ^ (j5 >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, E0);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar6, a);
                    qi4.k(go1Var, sgVar5, m);
                    qi4.k(go1Var, sgVar4, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, sgVar3, x0);
                    i51 i51Var2 = lw2.b;
                    r55.b("切换配置", i42.D0(i13Var2, 16.0f, 4.0f), ((fw2) go1Var.k(i51Var2)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var2)).b.n, go1Var, 54, 0, 131064);
                    go1Var.d0(1685961480);
                    Iterator it = ((List) t43Var.getValue()).iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p70.A0();
                            throw null;
                        }
                        dl4 dl4Var = (dl4) next;
                        boolean c = j42.c(dl4Var.a, str);
                        Iterator it2 = it;
                        Object Q = go1Var.Q();
                        if (Q == jpVar2) {
                            Q = ad4.w(Boolean.FALSE);
                            go1Var.o0(Q);
                        }
                        t43 t43Var4 = (t43) Q;
                        ki1 ki1Var3 = ki1Var2;
                        l13 m2 = o7.m(j42.x(nq4.e(i13Var2, 1.0f), i2 == 0 ? ki1Var3 : ki1.b), l74.a(8.0f));
                        if (((Boolean) t43Var4.getValue()).booleanValue()) {
                            go1Var.d0(-1805921745);
                            sgVar = sgVar3;
                            sgVar2 = sgVar4;
                            j = ((fw2) go1Var.k(lw2.b)).a.u;
                            go1Var.q(false);
                        } else {
                            sgVar = sgVar3;
                            sgVar2 = sgVar4;
                            if (c) {
                                go1Var.d0(-1805918607);
                                j = ((fw2) go1Var.k(lw2.b)).a.c;
                                go1Var.q(false);
                            } else {
                                go1Var.d0(-1805916212);
                                go1Var.q(false);
                                j = x70.f;
                            }
                        }
                        l13 p = mw2.p(m2, j, mw2.j);
                        Object Q2 = go1Var.Q();
                        if (Q2 == jpVar2) {
                            Q2 = new uf(t43Var4, (byte) 16);
                            go1Var.o0(Q2);
                        }
                        l13 A0 = i42.A0(p, (tm1) Q2);
                        boolean h = go1Var.h(c) | go1Var.i(dl4Var) | go1Var.i(hu2Var2);
                        Object Q3 = go1Var.Q();
                        if (h || Q3 == jpVar2) {
                            z = c;
                            hu2Var = hu2Var2;
                            Q3 = new hu1(z, dl4Var, hu2Var, t43Var2, t43Var3, (byte) 0);
                            go1Var.o0(Q3);
                        } else {
                            z = c;
                            hu2Var = hu2Var2;
                        }
                        l13 D0 = i42.D0(mw2.B(i42.g0(A0, false, null, null, null, (rm1) Q3, 15), false, null, 3), 12.0f, 8.0f);
                        u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
                        long j6 = go1Var.T;
                        int i4 = (int) (j6 ^ (j6 >>> 32));
                        am3 m3 = go1Var.m();
                        l13 x02 = i42.x0(go1Var, D0);
                        xd0.c.getClass();
                        go1Var.h0();
                        if (go1Var.S) {
                            go1Var.l(df0Var);
                        } else {
                            go1Var.r0();
                        }
                        qi4.k(go1Var, sgVar6, a2);
                        qi4.k(go1Var, sgVar5, m3);
                        sg sgVar7 = sgVar2;
                        qi4.k(go1Var, sgVar7, Integer.valueOf(i4));
                        qi4.j(go1Var);
                        sg sgVar8 = sgVar;
                        qi4.k(go1Var, sgVar8, x02);
                        if (((Boolean) t43Var4.getValue()).booleanValue()) {
                            go1Var.d0(1802682197);
                            i51Var = lw2.b;
                            j2 = ((fw2) go1Var.k(i51Var)).a.v;
                            go1Var.q(false);
                        } else if (z) {
                            go1Var.d0(1802685143);
                            i51Var = lw2.b;
                            j2 = ((fw2) go1Var.k(i51Var)).a.d;
                            go1Var.q(false);
                        } else {
                            go1Var.d0(1802687982);
                            i51Var = lw2.b;
                            j2 = ((fw2) go1Var.k(i51Var)).a.q;
                            go1Var.q(false);
                        }
                        long j7 = j2;
                        ow1.a(z ? d4.w() : il2.G(), null, nq4.k(i13Var2, 16.0f), j7, go1Var, 432);
                        oh4.a(go1Var, nq4.n(i13Var2, 8.0f));
                        r55.b(dl4Var.a, null, j7, 0L, z ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, 0, 24576, 114618);
                        go1Var.q(true);
                        it = it2;
                        sgVar3 = sgVar8;
                        sgVar4 = sgVar7;
                        i2 = i3;
                        ki1Var2 = ki1Var3;
                        hu2Var2 = hu2Var;
                    }
                    go1Var.q(false);
                    go1Var.q(true);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            default:
                k80 k80Var = (k80) obj6;
                Author author = (Author) obj5;
                fl4 fl4Var = (fl4) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    return wd5Var;
                }
                Object Q4 = go1Var2.Q();
                if (Q4 == jpVar2) {
                    Q4 = ad4.w(Boolean.FALSE);
                    go1Var2.o0(Q4);
                }
                t43 t43Var5 = (t43) Q4;
                Object Q5 = go1Var2.Q();
                if (Q5 == jpVar2) {
                    Q5 = r7.v(go1Var2);
                }
                t33 t33Var = (t33) Q5;
                t43 w = ut0.w(t33Var, go1Var2);
                boolean L = jx4.L((String) cw4Var2.getValue());
                if (L) {
                    jpVar = jpVar2;
                    j3 = k80Var.l;
                } else {
                    jpVar = jpVar2;
                    j3 = k80Var.h;
                }
                long j8 = j3;
                long j9 = !L ? k80Var.i : k80Var.m;
                cw4 t0 = p70.t0(((Boolean) t43Var5.getValue()).booleanValue(), j8, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "auth_status_bg", go1Var2, 24576, 0);
                long j10 = j9;
                cw4 s0 = p70.s0(((Boolean) t43Var5.getValue()).booleanValue(), j10, k80Var.v, "auth_status_title", go1Var2, 3072);
                cw4 s02 = p70.s0(((Boolean) t43Var5.getValue()).booleanValue(), j10, k80Var.v, "auth_status_body", go1Var2, 3072);
                cw4 s03 = p70.s0(((Boolean) t43Var5.getValue()).booleanValue(), j10, k80Var.v, "auth_status_icon", go1Var2, 3072);
                i13 i13Var3 = i13.a;
                l13 x = j42.x(i42.E0(nq4.e(i13Var3, 1.0f), 0.0f, 8.0f, 1), ki1Var);
                Object Q6 = go1Var2.Q();
                jp jpVar3 = jpVar;
                if (Q6 == jpVar3) {
                    Q6 = new gm4(t43Var5, (byte) 3);
                    go1Var2.o0(Q6);
                }
                l13 v = qm4.v(go1Var2, p70.H(o7.m(i42.A0(x, (tm1) Q6), l74.a(20.0f)), t0));
                Object Q7 = go1Var2.Q();
                if (Q7 == jpVar3) {
                    Q7 = new wd3((byte) 25);
                    go1Var2.o0(Q7);
                }
                l13 d = r13.d(v, null, null, null, null, (rm1) Q7, null, null, null, null, null, null, t33Var, 130815);
                uw2 c2 = px.c(q8.J, false);
                long j11 = go1Var2.T;
                int i5 = (int) (j11 ^ (j11 >>> 32));
                am3 m4 = go1Var2.m();
                l13 x03 = i42.x0(go1Var2, d);
                xd0.c.getClass();
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                sg sgVar9 = q8.c0;
                qi4.k(go1Var2, sgVar9, c2);
                sg sgVar10 = q8.b0;
                qi4.k(go1Var2, sgVar10, m4);
                Integer valueOf = Integer.valueOf(i5);
                sg sgVar11 = q8.d0;
                qi4.k(go1Var2, sgVar11, valueOf);
                qi4.j(go1Var2);
                sg sgVar12 = q8.a0;
                qi4.k(go1Var2, sgVar12, x03);
                l13 D02 = i42.D0(i13Var3, 20.0f, 16.0f);
                u74 a3 = t74.a(i42.b, q8.T, go1Var2, 48);
                long j12 = go1Var2.T;
                int i6 = (int) (j12 ^ (j12 >>> 32));
                am3 m5 = go1Var2.m();
                l13 x04 = i42.x0(go1Var2, D02);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar9, a3);
                qi4.k(go1Var2, sgVar10, m5);
                r7.G(i6, go1Var2, sgVar11, go1Var2);
                qi4.k(go1Var2, sgVar12, x04);
                qm4.g(author, 40.0f, go1Var2, Author.$stable | 48);
                oh4.a(go1Var2, nq4.n(i13Var3, 14.0f));
                sc2 sc2Var = new sc2(1.0f, true);
                ba0 a4 = z90.a(i42.d, q8.V, go1Var2, 0);
                long j13 = go1Var2.T;
                int i7 = (int) (j13 ^ (j13 >>> 32));
                am3 m6 = go1Var2.m();
                l13 x05 = i42.x0(go1Var2, sc2Var);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar9, a4);
                qi4.k(go1Var2, sgVar10, m6);
                r7.G(i7, go1Var2, sgVar11, go1Var2);
                qi4.k(go1Var2, sgVar12, x05);
                String B = r7.B(str, !L ? " · 登录 Cookie 已配置" : " · 未配置登录 Cookie");
                i51 i51Var3 = lw2.b;
                m65 m65Var = ((fw2) go1Var2.k(i51Var3)).b.i;
                r55.b(B, p70.G(i13Var3, s0, j10, false, null, 12), j10, oh4.j(16), qk1.P, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 1597440, 0, 130984);
                if (L) {
                    i13Var = i13Var3;
                    cw4Var = s02;
                    go1Var2.d0(739810221);
                    r55.b("请配置 Cookie 以获取登录后的视频数据", p70.G(i13Var, cw4Var, j10, false, null, 12), j10, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var3)).b.l, go1Var2, 24582, 0, 131048);
                    j4 = j10;
                    go1Var2.q(false);
                } else {
                    go1Var2.d0(739249400);
                    String str2 = (String) fl4Var.h().get("s_v_web_id");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String C = r7.C("WebID: ", jx4.f0(20, str2), "...");
                    m65 m65Var2 = ((fw2) go1Var2.k(i51Var3)).b.l;
                    i13Var = i13Var3;
                    cw4Var = s02;
                    r55.b(C, p70.G(i13Var3, s02, j10, false, null, 12), j10, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, m65Var2, go1Var2, 24576, 0, 131048);
                    j4 = j10;
                    go1Var2.q(false);
                }
                String str3 = fl4Var.u() ? "互动安全凭据已完整配置，可尝试点赞和收藏" : "互动安全凭据未完整配置，点赞和收藏会被禁用";
                long j14 = j4;
                r55.b(str3, p70.G(i13Var, cw4Var, j4, false, null, 12), j14, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var3)).b.l, go1Var2, 24576, 0, 131048);
                long j15 = j14;
                if (jx4.L(fl4Var.q())) {
                    go1Var2.d0(741310590);
                    r55.b("数字用户 ID 尚未就绪，互动中的 uid 参数将缺失，请打开一次个人主页", p70.G(i13Var, cw4Var, j15, false, null, 12), j15, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var3)).b.l, go1Var2, 24582, 0, 131048);
                    j15 = j15;
                    go1Var2.q(false);
                } else {
                    go1Var2.d0(741803800);
                    go1Var2.q(false);
                }
                go1Var2.q(true);
                oh4.a(go1Var2, nq4.n(i13Var, 12.0f));
                ow1.a(!L ? d4.w() : hc4.Q(), null, p70.G(nq4.k(i13Var, 24.0f), s03, j15, false, null, 12), j15, go1Var2, 48);
                go1Var2.q(true);
                go1Var2.q(true);
                return wd5Var;
        }
    }

    public /* synthetic */ fu1(t43 t43Var, String str, ki1 ki1Var, hu2 hu2Var, t43 t43Var2, t43 t43Var3) {
        this.L = t43Var;
        this.K = str;
        this.J = ki1Var;
        this.O = hu2Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }
}
