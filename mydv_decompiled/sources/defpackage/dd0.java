package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd0 implements in1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ dd0(byte b) {
        this.I = b;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        df0 df0Var = wa2.A0;
        i13 i13Var = i13.a;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    p70.k(on5.J0(2.0f).concat(" 倍速 · 按住 ← 中"), null, c21.x(), false, false, null, go1Var, 0, 58);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    l13 e = nq4.e(i13Var, 1.0f);
                    uw2 c = px.c(q8.N, false);
                    int Q = i82.Q(go1Var2.T);
                    am3 m = go1Var2.m();
                    l13 x0 = i42.x0(go1Var2, e);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, q8.c0, c);
                    qi4.k(go1Var2, q8.b0, m);
                    qi4.k(go1Var2, q8.d0, Integer.valueOf(Q));
                    qi4.j(go1Var2);
                    qi4.k(go1Var2, q8.a0, x0);
                    p70.i(null, 24.0f, 0L, go1Var2, 48, 5);
                    go1Var2.q(true);
                    break;
                }
            case 2:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    lq2.a(kb4.E(), 8.0f, go1Var3, 390);
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
                    l13 g = nq4.g(nq4.e(i13Var, 1.0f), 200.0f);
                    uw2 c2 = px.c(q8.N, false);
                    int Q2 = i82.Q(go1Var4.T);
                    am3 m2 = go1Var4.m();
                    l13 x02 = i42.x0(go1Var4, g);
                    xd0.c.getClass();
                    go1Var4.h0();
                    if (go1Var4.S) {
                        go1Var4.l(df0Var);
                    } else {
                        go1Var4.r0();
                    }
                    qi4.k(go1Var4, q8.c0, c2);
                    qi4.k(go1Var4, q8.b0, m2);
                    qi4.k(go1Var4, q8.d0, Integer.valueOf(Q2));
                    qi4.j(go1Var4);
                    qi4.k(go1Var4, q8.a0, x02);
                    p70.g(null, 0.0f, 0L, 0L, go1Var4, 0, 15);
                    go1Var4.q(true);
                    break;
                }
            default:
                tc0 tc0Var = i42.g;
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ih1) obj).getClass();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    go1Var5.W();
                    break;
                } else {
                    tc0Var.invoke(go1Var5, 6);
                    break;
                }
        }
        return wd5Var;
    }
}
