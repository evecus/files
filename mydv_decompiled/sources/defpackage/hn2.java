package defpackage;

import coil3.compose.SingletonAsyncImageKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;

    public /* synthetic */ hn2(String str, byte b) {
        this.I = b;
        this.J = str;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        char c;
        wd5 wd5Var;
        vv vvVar;
        sg sgVar;
        sg sgVar2;
        sg sgVar3;
        sg sgVar4;
        byte b = this.I;
        df0 df0Var = wa2.A0;
        wd5 wd5Var2 = wd5.a;
        String str = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
                    ne1 ne1Var = nq4.c;
                    long j = k80Var.p;
                    aj5 aj5Var = mw2.j;
                    l13 p = mw2.p(ne1Var, j, aj5Var);
                    vv vvVar2 = q8.N;
                    uw2 c2 = px.c(vvVar2, false);
                    long j2 = go1Var.T;
                    int i = (int) (j2 ^ (j2 >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, p);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    sg sgVar5 = q8.c0;
                    qi4.k(go1Var, sgVar5, c2);
                    sg sgVar6 = q8.b0;
                    qi4.k(go1Var, sgVar6, m);
                    Integer valueOf = Integer.valueOf(i);
                    sg sgVar7 = q8.d0;
                    qi4.k(go1Var, sgVar7, valueOf);
                    qi4.j(go1Var);
                    sg sgVar8 = q8.a0;
                    qi4.k(go1Var, sgVar8, x0);
                    if (str.length() > 0) {
                        go1Var.d0(-286777805);
                        vvVar = vvVar2;
                        c = ' ';
                        sgVar = sgVar6;
                        sgVar4 = sgVar5;
                        sgVar3 = sgVar7;
                        wd5Var = wd5Var2;
                        sgVar2 = sgVar8;
                        SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, ne1Var, null, null, null, li0.b, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                        go1Var = go1Var;
                        go1Var.q(false);
                    } else {
                        c = ' ';
                        wd5Var = wd5Var2;
                        vvVar = vvVar2;
                        sgVar = sgVar6;
                        sgVar2 = sgVar8;
                        sgVar3 = sgVar7;
                        sgVar4 = sgVar5;
                        go1Var.d0(-286455064);
                        go1Var.q(false);
                    }
                    l13 p2 = mw2.p(ne1Var, k80Var.F, aj5Var);
                    uw2 c3 = px.c(vvVar, false);
                    long j3 = go1Var.T;
                    int i2 = (int) (j3 ^ (j3 >>> c));
                    am3 m2 = go1Var.m();
                    l13 x02 = i42.x0(go1Var, p2);
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar4, c3);
                    qi4.k(go1Var, sgVar, m2);
                    r7.G(i2, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar2, x02);
                    p70.i(null, 36.0f, k80Var.a, go1Var, 48, 1);
                    go1Var.q(true);
                    go1Var.q(true);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    ne1 ne1Var2 = nq4.c;
                    l13 p3 = mw2.p(ne1Var2, ((fw2) go1Var2.k(lw2.b)).a.p, mw2.j);
                    uw2 c4 = px.c(q8.N, false);
                    long j4 = go1Var2.T;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    am3 m3 = go1Var2.m();
                    l13 x03 = i42.x0(go1Var2, p3);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, q8.c0, c4);
                    qi4.k(go1Var2, q8.b0, m3);
                    qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
                    qi4.j(go1Var2);
                    qi4.k(go1Var2, q8.a0, x03);
                    if (str.length() > 0) {
                        go1Var2.d0(1318530927);
                        SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var2), null, ne1Var2, null, null, null, li0.b, 0.0f, null, 0, false, go1Var2, 1573296, 0, 1976);
                        go1Var2.q(false);
                    } else {
                        go1Var2.d0(1318830480);
                        go1Var2.q(false);
                    }
                    go1Var2.q(true);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                ci2.g(str, (fe0) obj, mu0.X(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ci2.e(str, (fe0) obj, mu0.X(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                qe4.m(str, (fe0) obj, mu0.X(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                fv4.f(str, (fe0) obj, mu0.X(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                fv4.d(str, (fe0) obj, mu0.X(7));
                break;
            default:
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    String str2 = j42.c(str, "加载超时") ? "加载超时" : "加载失败";
                    hx1 w = j42.c(str, "加载超时") ? fb4.w() : hc4.Q();
                    if (str.length() <= 0 || str.equals(str2)) {
                        str = null;
                    }
                    p70.q(w, str2, null, o70.Z0(dq.b1(new String[]{str, "点击任意位置重试"}), "\n", null, null, 0, null, 62), rw4.J, false, null, go1Var3, 24576, 100);
                    break;
                }
                break;
        }
        return wd5Var2;
    }

    public /* synthetic */ hn2(String str, int i, byte b) {
        this.I = b;
        this.J = str;
    }
}
