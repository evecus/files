package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ju3 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ k80 M;
    public final /* synthetic */ String N;
    public final /* synthetic */ ki1 O;

    public /* synthetic */ ju3(tm1 tm1Var, t43 t43Var, t43 t43Var2, k80 k80Var, String str, ki1 ki1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = k80Var;
        this.N = str;
        this.O = ki1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3;
        t43 t43Var;
        tm1 tm1Var;
        t43 t43Var2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    f05.a(null, jo.f, ((fw2) go1Var.k(lw2.b)).a.G, 0L, 12.0f, p70.u0(-1133956840, new ju3(this.J, this.K, this.L, this.M, this.N, this.O, (byte) 1), go1Var), go1Var, 12779520, 89);
                    break;
                } else {
                    go1Var.W();
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
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    i13 i13Var = i13.a;
                    l13 C0 = i42.C0(i13Var, 28.0f);
                    tm1 tm1Var2 = this.J;
                    boolean g = go1Var2.g(tm1Var2);
                    Object Q = go1Var2.Q();
                    t43 t43Var3 = this.K;
                    t43 t43Var4 = this.L;
                    Object obj4 = de0.a;
                    if (g || Q == obj4) {
                        Q = new cv(tm1Var2, t43Var3, t43Var4, (byte) 1);
                        go1Var2.o0(Q);
                    }
                    Object obj5 = obj4;
                    l13 d = r13.d(C0, null, null, null, null, null, null, null, (tm1) Q, null, null, null, null, 260095);
                    t43 t43Var5 = t43Var3;
                    ba0 a = z90.a(new kp(20.0f, true, new y9()), q8.W, go1Var2, 54);
                    long j = go1Var2.T;
                    int i2 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var2.m();
                    l13 x0 = i42.x0(go1Var2, d);
                    xd0.c.getClass();
                    go1Var2.h0();
                    boolean z = go1Var2.S;
                    rm1 rm1Var = wa2.A0;
                    if (z) {
                        go1Var2.l(rm1Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar4, a);
                    qi4.k(go1Var2, sgVar3, m);
                    r7.G(i2, go1Var2, sgVar2, go1Var2);
                    qi4.k(go1Var2, sgVar, x0);
                    xx3 xx3Var = lw2.b;
                    m65 m65Var = ((fw2) go1Var2.k(xx3Var)).b.g;
                    qk1 qk1Var = qk1.P;
                    k80 k80Var = this.M;
                    r55.b("输入 PIN 码", null, k80Var.q, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 1572864, 0, 131002);
                    r55.b(this.N, null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(xx3Var)).b.k, go1Var2, 0, 0, 131066);
                    u74 a2 = t74.a(new kp(14.0f, true, new y9()), uvVar, go1Var2, 6);
                    long j2 = go1Var2.T;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var2.m();
                    l13 x02 = i42.x0(go1Var2, i13Var);
                    go1Var2.h0();
                    t43 t43Var6 = t43Var4;
                    if (go1Var2.S) {
                        go1Var2.l(rm1Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar4, a2);
                    qi4.k(go1Var2, sgVar3, m2);
                    r7.G(i3, go1Var2, sgVar2, go1Var2);
                    qi4.k(go1Var2, sgVar, x02);
                    go1Var2.d0(1256981461);
                    int i4 = 0;
                    while (i4 < 4) {
                        px.a(mw2.p(o7.m(nq4.k(i13Var, 18.0f), l74.a), ((Boolean) t43Var6.getValue()).booleanValue() ? k80Var.w : i4 < ((String) t43Var5.getValue()).length() ? k80Var.a : k80Var.H, mw2.j), go1Var2, 0);
                        i4++;
                    }
                    go1Var2.q(false);
                    go1Var2.q(true);
                    if (((Boolean) t43Var6.getValue()).booleanValue()) {
                        go1Var2.d0(1851344948);
                        i = 6;
                        r55.b("PIN 码错误，请重试", null, k80Var.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(lw2.b)).b.l, go1Var2, 6, 0, 131066);
                        go1Var2.q(false);
                    } else {
                        i = 6;
                        go1Var2.d0(1851581633);
                        r55.b("按遥控器数字键输入 4 位 PIN 码", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(lw2.b)).b.l, go1Var2, 6, 0, 131066);
                        go1Var2.q(false);
                    }
                    ba0 a3 = z90.a(new kp(10.0f, true, new y9()), q8.V, go1Var2, i);
                    long j3 = go1Var2.T;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    am3 m3 = go1Var2.m();
                    l13 x03 = i42.x0(go1Var2, i13Var);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(rm1Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar4, a3);
                    qi4.k(go1Var2, sgVar3, m3);
                    r7.G(i5, go1Var2, sgVar2, go1Var2);
                    qi4.k(go1Var2, sgVar, x03);
                    List k0 = p70.k0(p70.k0("1", "2", "3"), p70.k0("4", "5", "6"), p70.k0("7", "8", "9"), p70.k0("⌫", "0", "✓"));
                    go1Var2.d0(-1007583971);
                    Iterator it = k0.iterator();
                    while (it.hasNext()) {
                        List<String> list = (List) it.next();
                        Iterator it2 = it;
                        u74 a4 = t74.a(new kp(10.0f, true, new y9()), uvVar, go1Var2, 6);
                        long j4 = go1Var2.T;
                        int i6 = (int) (j4 ^ (j4 >>> 32));
                        am3 m4 = go1Var2.m();
                        l13 x04 = i42.x0(go1Var2, i13Var);
                        xd0.c.getClass();
                        go1Var2.h0();
                        if (go1Var2.S) {
                            go1Var2.l(rm1Var);
                        } else {
                            go1Var2.r0();
                        }
                        qi4.k(go1Var2, sgVar4, a4);
                        qi4.k(go1Var2, sgVar3, m4);
                        r7.G(i6, go1Var2, sgVar2, go1Var2);
                        qi4.k(go1Var2, sgVar, x04);
                        go1Var2.d0(1360720090);
                        for (String str : list) {
                            ki1 ki1Var = j42.c(str, "1") ? this.O : null;
                            boolean g2 = go1Var2.g(str) | go1Var2.g(tm1Var2);
                            Object Q2 = go1Var2.Q();
                            if (g2) {
                                obj3 = obj5;
                            } else {
                                obj3 = obj5;
                                if (Q2 != obj3) {
                                    t43Var = t43Var5;
                                    tm1Var = tm1Var2;
                                    t43Var2 = t43Var6;
                                    j16.e(str, (rm1) Q2, ki1Var, go1Var2, 0);
                                    obj5 = obj3;
                                    tm1Var2 = tm1Var;
                                    t43Var5 = t43Var;
                                    t43Var6 = t43Var2;
                                }
                            }
                            t43Var = t43Var5;
                            tm1Var = tm1Var2;
                            t43Var2 = t43Var6;
                            Q2 = new hc(str, tm1Var, t43Var, t43Var2, (byte) 3);
                            go1Var2.o0(Q2);
                            j16.e(str, (rm1) Q2, ki1Var, go1Var2, 0);
                            obj5 = obj3;
                            tm1Var2 = tm1Var;
                            t43Var5 = t43Var;
                            t43Var6 = t43Var2;
                        }
                        go1Var2.q(false);
                        go1Var2.q(true);
                        tm1Var2 = tm1Var2;
                        it = it2;
                    }
                    r7.J(go1Var2, false, true, true);
                    break;
                } else {
                    go1Var2.W();
                    break;
                }
        }
        return wd5Var;
    }
}
