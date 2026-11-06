package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tl4 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ k80 O;
    public final /* synthetic */ String P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ rm1 R;
    public final /* synthetic */ ki1 S;

    public /* synthetic */ tl4(tm1 tm1Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, k80 k80Var, String str, boolean z, rm1 rm1Var, ki1 ki1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.N = t43Var4;
        this.O = k80Var;
        this.P = str;
        this.Q = z;
        this.R = rm1Var;
        this.S = ki1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        t43 t43Var;
        t43 t43Var2;
        t43 t43Var3;
        go1 go1Var;
        boolean z;
        String str;
        Object ml4Var;
        t43 t43Var4;
        t43 t43Var5;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    f05.a(null, jo.f, ((fw2) go1Var2.k(lw2.b)).a.G, 0L, 12.0f, p70.u0(-381829134, new tl4(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (byte) 1), go1Var2), go1Var2, 12779520, 89);
                    break;
                }
            default:
                sg sgVar = q8.a0;
                sg sgVar2 = q8.d0;
                sg sgVar3 = q8.b0;
                sg sgVar4 = q8.c0;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                uv uvVar = q8.S;
                go1 go1Var3 = (go1) fe0Var2;
                if (!go1Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    i13 i13Var = i13.a;
                    l13 C0 = i42.C0(i13Var, 28.0f);
                    tm1 tm1Var = this.J;
                    boolean g = go1Var3.g(tm1Var);
                    Object Q = go1Var3.Q();
                    t43 t43Var6 = this.K;
                    t43 t43Var7 = this.L;
                    t43 t43Var8 = this.M;
                    t43 t43Var9 = this.N;
                    Object obj4 = de0.a;
                    if (g || Q == obj4) {
                        Q = new v7(tm1Var, t43Var6, t43Var7, t43Var8, t43Var9);
                        obj3 = tm1Var;
                        t43Var = t43Var6;
                        t43Var2 = t43Var8;
                        t43Var3 = t43Var9;
                        go1Var3.o0(Q);
                    } else {
                        t43Var2 = t43Var8;
                        t43Var3 = t43Var9;
                        t43Var = t43Var6;
                        obj3 = tm1Var;
                    }
                    l13 d = r13.d(C0, null, null, null, null, null, null, null, (tm1) Q, null, null, null, null, 260095);
                    t43 t43Var10 = t43Var;
                    t43 t43Var11 = t43Var7;
                    t43 t43Var12 = t43Var2;
                    ba0 a = z90.a(new kp(18.0f, true, new y9()), q8.W, go1Var3, 54);
                    long j = go1Var3.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var3.m();
                    l13 x0 = i42.x0(go1Var3, d);
                    xd0.c.getClass();
                    go1Var3.h0();
                    boolean z2 = go1Var3.S;
                    rm1 rm1Var = wa2.A0;
                    if (z2) {
                        go1Var3.l(rm1Var);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, sgVar4, a);
                    qi4.k(go1Var3, sgVar3, m);
                    r7.G(i, go1Var3, sgVar2, go1Var3);
                    qi4.k(go1Var3, sgVar, x0);
                    String str2 = j42.c((String) t43Var10.getValue(), "input") ? "设置 PIN 码" : "确认 PIN 码";
                    xx3 xx3Var = lw2.b;
                    m65 m65Var = ((fw2) go1Var3.k(xx3Var)).b.g;
                    qk1 qk1Var = qk1.P;
                    k80 k80Var = this.O;
                    r55.b(str2, null, k80Var.q, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var3, 1572864, 0, 131002);
                    r55.b(this.P, null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var3.k(xx3Var)).b.k, go1Var3, 0, 0, 131066);
                    String str3 = j42.c((String) t43Var10.getValue(), "input") ? (String) t43Var11.getValue() : (String) t43Var3.getValue();
                    Object obj5 = obj4;
                    u74 a2 = t74.a(new kp(14.0f, true, new y9()), uvVar, go1Var3, 6);
                    long j2 = go1Var3.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var3.m();
                    l13 x02 = i42.x0(go1Var3, i13Var);
                    go1Var3.h0();
                    Object obj6 = obj3;
                    if (go1Var3.S) {
                        go1Var3.l(rm1Var);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, sgVar4, a2);
                    qi4.k(go1Var3, sgVar3, m2);
                    r7.G(i2, go1Var3, sgVar2, go1Var3);
                    qi4.k(go1Var3, sgVar, x02);
                    go1Var3.d0(-461092264);
                    int i3 = 0;
                    while (i3 < 4) {
                        px.a(mw2.p(o7.m(nq4.k(i13Var, 18.0f), l74.a), ((Boolean) t43Var12.getValue()).booleanValue() ? k80Var.w : i3 < str3.length() ? k80Var.a : k80Var.H, mw2.j), go1Var3, 0);
                        i3++;
                    }
                    go1Var3.q(false);
                    go1Var3.q(true);
                    if (((Boolean) t43Var12.getValue()).booleanValue()) {
                        go1Var3.d0(1081262321);
                        r55.b(j42.c((String) t43Var10.getValue(), "confirm") ? "两次输入不一致，请重新确认" : "PIN 码错误", null, k80Var.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var3.k(lw2.b)).b.l, go1Var3, 0, 0, 131066);
                        go1Var = go1Var3;
                        go1Var.q(false);
                    } else {
                        go1Var3.d0(1081539585);
                        r55.b(j42.c((String) t43Var10.getValue(), "input") ? "输入 4 位数字 PIN 码" : "再次输入相同的 PIN 码", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var3.k(lw2.b)).b.l, go1Var3, 0, 0, 131066);
                        go1Var = go1Var3;
                        go1Var.q(false);
                    }
                    String str4 = "1";
                    List k0 = p70.k0(p70.k0("1", "2", "3"), p70.k0("4", "5", "6"), p70.k0("7", "8", "9"), p70.k0("⌫", "0", j42.c((String) t43Var10.getValue(), "confirm") ? "←" : " "));
                    go1Var.d0(-657828116);
                    Iterator it = k0.iterator();
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        Iterator it2 = it;
                        u74 a3 = t74.a(new kp(10.0f, true, new y9()), uvVar, go1Var, 6);
                        long j3 = go1Var.T;
                        int i4 = (int) (j3 ^ (j3 >>> 32));
                        am3 m3 = go1Var.m();
                        l13 x03 = i42.x0(go1Var, i13Var);
                        xd0.c.getClass();
                        go1Var.h0();
                        if (go1Var.S) {
                            go1Var.l(rm1Var);
                        } else {
                            go1Var.r0();
                        }
                        qi4.k(go1Var, sgVar4, a3);
                        qi4.k(go1Var, sgVar3, m3);
                        r7.G(i4, go1Var, sgVar2, go1Var);
                        qi4.k(go1Var, sgVar, x03);
                        go1Var.d0(1069466105);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            String str5 = (String) it3.next();
                            boolean z3 = !j42.c(str5, " ");
                            ki1 ki1Var = j42.c(str5, str4) ? this.S : null;
                            Iterator it4 = it3;
                            boolean g2 = go1Var.g(str5) | go1Var.g(obj6);
                            Object Q2 = go1Var.Q();
                            ki1 ki1Var2 = ki1Var;
                            Object obj7 = obj5;
                            if (g2 || Q2 == obj7) {
                                str = str4;
                                t43 t43Var13 = t43Var10;
                                t43Var4 = t43Var11;
                                ml4Var = new ml4((Object) str5, obj6, t43Var12, t43Var13, t43Var3, t43Var4, (byte) 1);
                                t43Var5 = t43Var13;
                                go1Var.o0(ml4Var);
                            } else {
                                String str6 = str4;
                                ml4Var = Q2;
                                str = str6;
                                t43Var5 = t43Var10;
                                t43Var4 = t43Var11;
                            }
                            go1 go1Var4 = go1Var;
                            qm4.e(str5, z3, (rm1) ml4Var, ki1Var2, go1Var4, 0);
                            str4 = str;
                            obj5 = obj7;
                            go1Var = go1Var4;
                            t43Var10 = t43Var5;
                            t43Var11 = t43Var4;
                            it3 = it4;
                        }
                        go1Var.q(false);
                        go1Var.q(true);
                        str4 = str4;
                        it = it2;
                    }
                    Object obj8 = obj5;
                    go1Var.q(false);
                    if (this.Q) {
                        go1Var.d0(1085040167);
                        Object Q3 = go1Var.Q();
                        if (Q3 == obj8) {
                            Q3 = ad4.w(Boolean.FALSE);
                            go1Var.o0(Q3);
                        }
                        t43 t43Var14 = (t43) Q3;
                        Object Q4 = go1Var.Q();
                        if (Q4 == obj8) {
                            Q4 = r7.v(go1Var);
                        }
                        t33 t33Var = (t33) Q4;
                        t43 w = ut0.w(t33Var, go1Var);
                        boolean booleanValue = ((Boolean) t43Var14.getValue()).booleanValue();
                        xx3 xx3Var2 = lw2.b;
                        go1 go1Var5 = go1Var;
                        cw4 t0 = p70.t0(booleanValue, ((fw2) go1Var.k(xx3Var2)).a.H, k80Var.w, ((Boolean) w.getValue()).booleanValue(), "pin_clear_bg", go1Var5, 24576, 0);
                        cw4 s0 = p70.s0(((Boolean) t43Var14.getValue()).booleanValue(), k80Var.s, k80Var.x, "pin_clear_fg", go1Var5, 3072);
                        l13 H = p70.H(o7.m(i13Var, l74.a(10.0f)), t0);
                        Object Q5 = go1Var5.Q();
                        if (Q5 == obj8) {
                            Q5 = new qd4(t43Var14, (byte) 24);
                            go1Var5.o0(Q5);
                        }
                        l13 D0 = i42.D0(mw2.B(r13.d(i42.A0(H, (tm1) Q5), null, null, null, null, this.R, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1), 20.0f, 10.0f);
                        u74 a4 = t74.a(i42.b, q8.T, go1Var5, 48);
                        long j4 = go1Var5.T;
                        int i5 = (int) (j4 ^ (j4 >>> 32));
                        am3 m4 = go1Var5.m();
                        l13 x04 = i42.x0(go1Var5, D0);
                        xd0.c.getClass();
                        go1Var5.h0();
                        if (go1Var5.S) {
                            go1Var5.l(rm1Var);
                        } else {
                            go1Var5.r0();
                        }
                        qi4.k(go1Var5, sgVar4, a4);
                        qi4.k(go1Var5, sgVar3, m4);
                        r7.G(i5, go1Var5, sgVar2, go1Var5);
                        qi4.k(go1Var5, sgVar, x04);
                        ow1.a(lq2.K(), null, p70.G(nq4.k(i13Var, 18.0f), s0, k80Var.s, false, null, 12), k80Var.s, go1Var5, 48);
                        oh4.a(go1Var5, nq4.n(i13Var, 8.0f));
                        m65 m65Var2 = ((fw2) go1Var5.k(xx3Var2)).b.k;
                        long j5 = k80Var.s;
                        r55.b("清除 PIN", p70.G(i13Var, s0, j5, false, null, 12), j5, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var2, go1Var5, 6, 0, 131064);
                        go1Var = go1Var5;
                        z = true;
                        go1Var.q(true);
                        go1Var.q(false);
                    } else {
                        z = true;
                        go1Var.d0(1087334074);
                        go1Var.q(false);
                    }
                    go1Var.q(z);
                    break;
                }
        }
        return wd5Var;
    }
}
