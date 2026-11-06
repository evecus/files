package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ao2 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ k80 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ ao2(k80 k80Var, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = k80Var;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        df0 df0Var = wa2.A0;
        i13 i13Var = i13.a;
        jp jpVar = de0.a;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        t43 t43Var2 = this.K;
        k80 k80Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    uv uvVar = q8.T;
                    kp kpVar = new kp(10.0f, true, new y9());
                    l13 G0 = i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                    u74 a = t74.a(kpVar, uvVar, go1Var, 54);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, G0);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, a);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    hx1 I = c5.I();
                    Object Q = go1Var.Q();
                    if (Q == jpVar) {
                        Q = new d30(t43Var2, t43Var, (byte) 2);
                        go1Var.o0(Q);
                    }
                    lq2.b(I, "返回", (rm1) Q, null, 0.0f, go1Var, 432, 24);
                    r55.b("弹幕样式", null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(lw2.b)).b.g, go1Var, 1572870, 0, 131002);
                    go1Var.q(true);
                    break;
                }
            case 1:
                k25 k25Var = (k25) obj;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((go1) fe0Var2).e(k25Var.a) ? 4 : 2;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    go1Var2.W();
                    break;
                } else {
                    String str = ((vy3) t43Var2.getValue()).a == uy3.L ? "已扫码，请在手机端确认" : "使用抖音 App 扫码登录";
                    i51 i51Var = lw2.b;
                    int i2 = intValue2 & 14;
                    r55.b(str, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, 0L, qk1.P, 0L, k25Var, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.i, go1Var2, 1572864, i2, 129978);
                    r55.b(((vy3) t43Var2.getValue()).b, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.s, oh4.j(12), null, 0L, k25Var, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 24576, i2, 130026);
                    break;
                }
            case 2:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(1 & intValue3, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    String str2 = (String) t43Var2.getValue();
                    k74 a2 = l74.a(12.0f);
                    long j2 = k80Var.a;
                    i51 i51Var2 = lw2.b;
                    long j3 = ((fw2) go1Var3.k(i51Var2)).a.A;
                    long j4 = k80Var.G;
                    t35 l = k04.l(((fw2) go1Var3.k(i51Var2)).a.q, ((fw2) go1Var3.k(i51Var2)).a.q, j4, j4, j2, j3, go1Var3);
                    l13 v = qm4.v(go1Var3, qm4.u(nq4.g(nq4.e(i13Var, 1.0f), 120.0f), go1Var3));
                    Object Q2 = go1Var3.Q();
                    if (Q2 == jpVar) {
                        Q2 = new ol4((byte) 14);
                        go1Var3.o0(Q2);
                    }
                    l13 R = qg5.R(v, (tm1) Q2);
                    Object Q3 = go1Var3.Q();
                    if (Q3 == jpVar) {
                        Q3 = new kn2(t43Var2, t43Var, (byte) 3);
                        go1Var3.o0(Q3);
                    }
                    il2.a(str2, (tm1) Q3, R, false, null, j16.J, null, null, null, false, 5, 0, a2, l, go1Var3, 12582960, 100663296, 1834872);
                    break;
                }
            case 3:
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    go1Var4.W();
                    break;
                } else {
                    String str3 = (String) t43Var2.getValue();
                    k74 a3 = l74.a(12.0f);
                    long j5 = k80Var.a;
                    i51 i51Var3 = lw2.b;
                    long j6 = ((fw2) go1Var4.k(i51Var3)).a.A;
                    long j7 = k80Var.G;
                    t35 l2 = k04.l(((fw2) go1Var4.k(i51Var3)).a.q, ((fw2) go1Var4.k(i51Var3)).a.q, j7, j7, j5, j6, go1Var4);
                    l13 v2 = qm4.v(go1Var4, qm4.u(nq4.g(nq4.e(i13Var, 1.0f), 148.0f), go1Var4));
                    Object Q4 = go1Var4.Q();
                    if (Q4 == jpVar) {
                        Q4 = new yv3((byte) 27);
                        go1Var4.o0(Q4);
                    }
                    l13 R2 = qg5.R(v2, (tm1) Q4);
                    Object Q5 = go1Var4.Q();
                    if (Q5 == jpVar) {
                        Q5 = new kn2(t43Var2, t43Var, (byte) 1);
                        go1Var4.o0(Q5);
                    }
                    il2.a(str3, (tm1) Q5, R2, false, null, j16.L, null, null, null, false, 6, 0, a3, l2, go1Var4, 12582960, 100663296, 1834872);
                    break;
                }
            case 4:
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    go1Var5.W();
                    break;
                } else {
                    String str4 = (String) t43Var2.getValue();
                    k74 a4 = l74.a(12.0f);
                    long j8 = k80Var.a;
                    i51 i51Var4 = lw2.b;
                    long j9 = ((fw2) go1Var5.k(i51Var4)).a.A;
                    long j10 = k80Var.G;
                    t35 l3 = k04.l(((fw2) go1Var5.k(i51Var4)).a.q, ((fw2) go1Var5.k(i51Var4)).a.q, j10, j10, j8, j9, go1Var5);
                    l13 v3 = qm4.v(go1Var5, qm4.u(nq4.g(nq4.e(i13Var, 1.0f), 148.0f), go1Var5));
                    Object Q6 = go1Var5.Q();
                    if (Q6 == jpVar) {
                        Q6 = new ol4((byte) 9);
                        go1Var5.o0(Q6);
                    }
                    l13 R3 = qg5.R(v3, (tm1) Q6);
                    Object Q7 = go1Var5.Q();
                    if (Q7 == jpVar) {
                        Q7 = new kn2(t43Var2, t43Var, (byte) 2);
                        go1Var5.o0(Q7);
                    }
                    il2.a(str4, (tm1) Q7, R3, false, null, j16.M, null, null, null, false, 6, 0, a4, l3, go1Var5, 12582960, 100663296, 1834872);
                    break;
                }
            default:
                fe0 fe0Var6 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    go1Var6.W();
                    break;
                } else {
                    uv uvVar2 = q8.T;
                    kp kpVar2 = new kp(10.0f, true, new y9());
                    l13 G02 = i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                    u74 a5 = t74.a(kpVar2, uvVar2, go1Var6, 54);
                    long j11 = go1Var6.T;
                    int i3 = (int) (j11 ^ (j11 >>> 32));
                    am3 m2 = go1Var6.m();
                    l13 x02 = i42.x0(go1Var6, G02);
                    xd0.c.getClass();
                    go1Var6.h0();
                    if (go1Var6.S) {
                        go1Var6.l(df0Var);
                    } else {
                        go1Var6.r0();
                    }
                    qi4.k(go1Var6, q8.c0, a5);
                    qi4.k(go1Var6, q8.b0, m2);
                    qi4.k(go1Var6, q8.d0, Integer.valueOf(i3));
                    qi4.j(go1Var6);
                    qi4.k(go1Var6, q8.a0, x02);
                    hx1 I2 = c5.I();
                    Object Q8 = go1Var6.Q();
                    if (Q8 == jpVar) {
                        Q8 = new d30(t43Var2, t43Var, (byte) 6);
                        go1Var6.o0(Q8);
                    }
                    lq2.b(I2, "返回", (rm1) Q8, null, 0.0f, go1Var6, 432, 24);
                    r55.b("弹幕设置", null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var6.k(lw2.b)).b.g, go1Var6, 1572870, 0, 131002);
                    go1Var6.q(true);
                    break;
                }
        }
        return wd5Var;
    }
}
