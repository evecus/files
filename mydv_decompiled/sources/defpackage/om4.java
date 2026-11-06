package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class om4 implements jn1 {
    public final /* synthetic */ za1 I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ k80 M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ cw4 O;
    public final /* synthetic */ cw4 P;
    public final /* synthetic */ ki1 Q;
    public final /* synthetic */ ki1 R;
    public final /* synthetic */ s33 S;

    public om4(za1 za1Var, ki1 ki1Var, t43 t43Var, t43 t43Var2, k80 k80Var, boolean z, cw4 cw4Var, cw4 cw4Var2, ki1 ki1Var2, ki1 ki1Var3, s33 s33Var) {
        this.I = za1Var;
        this.J = ki1Var;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = k80Var;
        this.N = z;
        this.O = cw4Var;
        this.P = cw4Var2;
        this.Q = ki1Var2;
        this.R = ki1Var3;
        this.S = s33Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l13] */
    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        long j;
        l13 R;
        String str;
        zd2 zd2Var = (zd2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((go1) fe0Var).g(zd2Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        ?? r3 = (go1) fe0Var;
        if (r3.T(i & 1, (i & 147) != 146)) {
            bl4 bl4Var = (bl4) this.I.get(intValue);
            r3.d0(-1270932912);
            t43 t43Var = this.K;
            boolean z = ((bl4) t43Var.getValue()) == bl4Var;
            i13 i13Var = i13.a;
            i13 x = z ? j42.x(i13Var, this.J) : i13Var;
            boolean e = r13.e(r3);
            Object obj6 = de0.a;
            t43 t43Var2 = this.L;
            if (e) {
                r3.d0(-1270823204);
                t80 t80Var = (t80) this.O.getValue();
                t65 t65Var = (t65) this.P.getValue();
                int ordinal = bl4Var.ordinal();
                if (ordinal == 0) {
                    str = "画质、编码、播放行为";
                } else if (ordinal == 1) {
                    str = "直播画质";
                } else if (ordinal == 2) {
                    str = "开关、样式、屏蔽词";
                } else if (ordinal == 3) {
                    str = r7.C(t80Var.I, " · ", t65Var == t65.K ? "自动深浅" : t65Var.I);
                } else if (ordinal == 4) {
                    str = "Cookie 与互动凭据";
                } else {
                    if (ordinal != 5) {
                        s83.v();
                        return null;
                    }
                    str = "v2.3.43 · 检查更新";
                }
                String str2 = str;
                boolean g = r3.g(t43Var) | r3.e(bl4Var.ordinal());
                Object Q = r3.Q();
                if (g || Q == obj6) {
                    Q = new yu1(bl4Var, t43Var, (byte) 6);
                    r3.o0(Q);
                }
                rm1 rm1Var = (rm1) Q;
                boolean g2 = r3.g(t43Var) | r3.e(bl4Var.ordinal()) | r3.g(t43Var2);
                Object Q2 = r3.Q();
                if (g2 || Q2 == obj6) {
                    Q2 = new z30(bl4Var, t43Var, t43Var2, (byte) 1);
                    r3.o0(Q2);
                }
                qm4.i(bl4Var, str2, rm1Var, (rm1) Q2, x, r3, 0);
                r3.q(false);
                r3.q(false);
            } else {
                r3.d0(-1270227384);
                r3.q(false);
                Object Q3 = r3.Q();
                if (Q3 == obj6) {
                    Q3 = ad4.w(Boolean.FALSE);
                    r3.o0(Q3);
                }
                t43 t43Var3 = (t43) Q3;
                Object Q4 = r3.Q();
                if (Q4 == obj6) {
                    Q4 = r7.v(r3);
                }
                t33 t33Var = (t33) Q4;
                t43 w = ut0.w(t33Var, r3);
                k80 k80Var = this.M;
                if (z) {
                    obj5 = obj6;
                    j = k80Var.d;
                } else {
                    obj5 = obj6;
                    j = k80Var.s;
                }
                long j2 = j;
                boolean booleanValue = ((Boolean) t43Var3.getValue()).booleanValue();
                Object obj7 = obj5;
                cw4 t0 = p70.t0(booleanValue, z ? k80Var.c : x70.f, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "nav_bg", r3, 24576, 0);
                cw4 s0 = p70.s0(((Boolean) t43Var3.getValue()).booleanValue(), j2, k80Var.v, "nav_fg", r3, 3072);
                boolean z2 = z;
                l13 then = nq4.i(nq4.e(i13Var, 1.0f), 52.0f, 0.0f, 2).then(x);
                int ordinal2 = bl4Var.ordinal();
                if (ordinal2 == 4) {
                    r3.d0(-1149302706);
                    Object Q5 = r3.Q();
                    if (Q5 == obj7) {
                        Q5 = new km4(this.R, (byte) 1);
                        r3.o0(Q5);
                    }
                    R = qg5.R(i13Var, (tm1) Q5);
                    r3.q(false);
                } else if (ordinal2 != 5) {
                    r3.d0(-1149299774);
                    r3.q(false);
                    R = i13Var;
                } else {
                    r3.d0(-1149307790);
                    Object Q6 = r3.Q();
                    if (Q6 == obj7) {
                        Q6 = new km4(this.Q, (byte) 0);
                        r3.o0(Q6);
                    }
                    R = qg5.R(i13Var, (tm1) Q6);
                    r3.q(false);
                }
                l13 then2 = then.then(R);
                boolean g3 = r3.g(t43Var) | r3.e(bl4Var.ordinal());
                Object Q7 = r3.Q();
                if (g3 || Q7 == obj7) {
                    Q7 = new lm4(bl4Var, t43Var3, t43Var, this.S);
                    r3.o0(Q7);
                }
                l13 u = r7.u(12.0f, i42.A0(then2, (tm1) Q7), t0);
                boolean g4 = r3.g(t43Var) | r3.e(bl4Var.ordinal());
                boolean z3 = this.N;
                boolean h = g4 | r3.h(z3) | r3.g(t43Var2);
                Object Q8 = r3.Q();
                if (h || Q8 == obj7) {
                    Q8 = new mm4(bl4Var, z3, t43Var, t43Var2);
                    r3.o0(Q8);
                }
                l13 d = r13.d(u, null, null, null, null, (rm1) Q8, null, null, null, null, null, null, t33Var, 130815);
                uw2 c = px.c(q8.N, false);
                long j3 = r3.T;
                int i2 = (int) (j3 ^ (j3 >>> 32));
                am3 m = r3.m();
                l13 x0 = i42.x0(r3, d);
                xd0.c.getClass();
                r3.h0();
                boolean z4 = r3.S;
                df0 df0Var = wa2.A0;
                if (z4) {
                    r3.l(df0Var);
                } else {
                    r3.r0();
                }
                sg sgVar = q8.c0;
                qi4.k(r3, sgVar, c);
                sg sgVar2 = q8.b0;
                qi4.k(r3, sgVar2, m);
                Integer valueOf = Integer.valueOf(i2);
                sg sgVar3 = q8.d0;
                qi4.k(r3, sgVar3, valueOf);
                qi4.j(r3);
                sg sgVar4 = q8.a0;
                qi4.k(r3, sgVar4, x0);
                l13 E0 = i42.E0(nq4.c, 16.0f, 0.0f, 2);
                u74 a = t74.a(i42.b, q8.T, r3, 48);
                long j4 = r3.T;
                int i3 = (int) (j4 ^ (j4 >>> 32));
                am3 m2 = r3.m();
                l13 x02 = i42.x0(r3, E0);
                r3.h0();
                if (r3.S) {
                    r3.l(df0Var);
                } else {
                    r3.r0();
                }
                qi4.k(r3, sgVar, a);
                qi4.k(r3, sgVar2, m2);
                r7.G(i3, r3, sgVar3, r3);
                qi4.k(r3, sgVar4, x02);
                ow1.a(bl4Var.J, null, p70.G(nq4.k(i13Var, 22.0f), s0, j2, false, null, 12), j2, r3, 48);
                oh4.a(r3, nq4.n(i13Var, 14.0f));
                r55.b(bl4Var.I, p70.G(new sc2(1.0f, false), s0, j2, false, null, 12), j2, oh4.j(15), (z2 || ((Boolean) t43Var3.getValue()).booleanValue()) ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 0, 0, null, r3, 24576, 0, 262056);
                r7.J(r3, true, true, false);
            }
        } else {
            r3.W();
        }
        return wd5.a;
    }
}
