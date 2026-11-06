package defpackage;

import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.widget.ComposableSingletons$DesktopWidgetsKt;
import com.materialkolor.ktx.ColorKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc0 implements in1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ uc0(byte b) {
        this.I = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zd2) obj).getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
            hx1 hx1Var = eg5.f;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Filled.SwitchAccount", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep epVar = new ep((byte) 13);
                epVar.z(4.0f, 6.0f);
                epVar.x(2.0f, 6.0f);
                epVar.M(14.0f);
                epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                epVar.v(14.0f);
                epVar.M(-2.0f);
                epVar.x(4.0f, 20.0f);
                epVar.x(4.0f, 6.0f);
                epVar.p();
                epVar.z(20.0f, 2.0f);
                epVar.x(8.0f, 2.0f);
                epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                epVar.M(12.0f);
                epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                epVar.v(12.0f);
                epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                epVar.x(22.0f, 4.0f);
                epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                epVar.p();
                epVar.z(14.0f, 4.0f);
                epVar.r(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
                epVar.D(-1.34f, 3.0f, -3.0f, 3.0f);
                epVar.D(-3.0f, -1.34f, -3.0f, -3.0f);
                epVar.D(1.34f, -3.0f, 3.0f, -3.0f);
                epVar.p();
                epVar.z(20.0f, 16.0f);
                epVar.x(8.0f, 16.0f);
                epVar.M(-1.5f);
                epVar.r(0.0f, -1.99f, 4.0f, -3.0f, 6.0f, -3.0f);
                epVar.D(6.0f, 1.01f, 6.0f, 3.0f);
                epVar.x(20.0f, 16.0f);
                epVar.p();
                gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                hx1Var = gx1Var.b();
                eg5.f = hx1Var;
            }
            qm4.n(6, go1Var, hx1Var, "配置管理");
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 lambda_720070246$lambda$0;
        byte b = this.I;
        i13 i13Var = i13.a;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                str.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).g(str) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 19) != 18)) {
                    go1Var.W();
                    break;
                } else if (str.length() <= 0) {
                    go1Var.d0(1149389270);
                    go1Var.q(false);
                    break;
                } else {
                    go1Var.d0(1149139937);
                    SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                    go1Var.q(false);
                    break;
                }
            case 1:
                ww2 ww2Var = (ww2) obj;
                int X = ww2Var.X(10.0f);
                int i = X * 2;
                bn3 u = ((pw2) obj2).u(eh0.i(i, 0, ((dh0) obj3).a));
                break;
            case 2:
                ww2 ww2Var2 = (ww2) obj;
                int X2 = ww2Var2.X(10.0f);
                int i2 = X2 * 2;
                bn3 u2 = ((pw2) obj2).u(eh0.i(0, i2, ((dh0) obj3).a));
                break;
            case 3:
                tc0 tc0Var = j16.v;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ih1) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    tc0Var.invoke(go1Var2, 6);
                    break;
                }
            case 4:
                ((Integer) obj3).intValue();
                ((z95) obj).getClass();
                go1 go1Var3 = (go1) ((fe0) obj2);
                go1Var3.d0(-1885765762);
                ku4 defaultColorSpring = ColorKt.getDefaultColorSpring();
                go1Var3.q(false);
                break;
            case 5:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var4 = (go1) fe0Var3;
                if (!go1Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var4.W();
                    break;
                } else {
                    l13 g = nq4.g(nq4.n(i13Var, 160.0f), 80.0f);
                    uw2 c = px.c(q8.N, false);
                    long j = go1Var4.T;
                    int i3 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var4.m();
                    l13 x0 = i42.x0(go1Var4, g);
                    xd0.c.getClass();
                    go1Var4.h0();
                    boolean z = go1Var4.S;
                    df0 df0Var = wa2.A0;
                    if (z) {
                        go1Var4.l(df0Var);
                    } else {
                        go1Var4.r0();
                    }
                    sg sgVar = q8.c0;
                    qi4.k(go1Var4, sgVar, c);
                    sg sgVar2 = q8.b0;
                    qi4.k(go1Var4, sgVar2, m);
                    Integer valueOf = Integer.valueOf(i3);
                    sg sgVar3 = q8.d0;
                    qi4.k(go1Var4, sgVar3, valueOf);
                    qi4.j(go1Var4);
                    sg sgVar4 = q8.a0;
                    qi4.k(go1Var4, sgVar4, x0);
                    ba0 a = z90.a(i42.e, q8.W, go1Var4, 54);
                    long j2 = go1Var4.T;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var4.m();
                    l13 x02 = i42.x0(go1Var4, i13Var);
                    go1Var4.h0();
                    if (go1Var4.S) {
                        go1Var4.l(df0Var);
                    } else {
                        go1Var4.r0();
                    }
                    qi4.k(go1Var4, sgVar, a);
                    qi4.k(go1Var4, sgVar2, m2);
                    r7.G(i4, go1Var4, sgVar3, go1Var4);
                    qi4.k(go1Var4, sgVar4, x02);
                    i51 i51Var = lw2.b;
                    p70.i(null, 28.0f, ((fw2) go1Var4.k(i51Var)).a.q, go1Var4, 48, 1);
                    oh4.a(go1Var4, nq4.g(i13Var, 8.0f));
                    r55.b("加载中...", null, ((fw2) go1Var4.k(i51Var)).a.s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, null, go1Var4, 24582, 0, 262122);
                    go1Var4.q(true);
                    go1Var4.q(true);
                    break;
                }
            case 6:
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var5 = (go1) fe0Var4;
                if (!go1Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    go1Var5.W();
                    break;
                } else {
                    p70.o("加载中...", nq4.g(i42.G0(nq4.e(i13Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 200.0f), go1Var5, 54, 0);
                    break;
                }
            case 7:
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var5;
                if (!go1Var6.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    go1Var6.W();
                    break;
                } else {
                    p70.q(j42.B(), "暂无评论", nq4.g(i42.G0(nq4.e(i13Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 200.0f), null, null, true, null, go1Var6, 197040, 88);
                    break;
                }
            case 8:
                xi0 xi0Var = (xi0) obj;
                fe0 fe0Var6 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((go1) fe0Var6).g(xi0Var) ? 4 : 2;
                }
                go1 go1Var7 = (go1) fe0Var6;
                if (!go1Var7.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    go1Var7.W();
                    break;
                } else {
                    px.a(mw2.p(nq4.g(nq4.e(i42.E0(i13Var, 0.0f, zi0.g, 1), 1.0f), zi0.f), xi0Var.c, mw2.j), go1Var7, 0);
                    break;
                }
            case 9:
                lambda_720070246$lambda$0 = ComposableSingletons$DesktopWidgetsKt.lambda_720070246$lambda$0((v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                break;
            case 10:
                fe0 fe0Var7 = (fe0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var8 = (go1) fe0Var7;
                if (!go1Var8.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    go1Var8.W();
                    break;
                } else {
                    l13 g2 = nq4.g(nq4.e(i13Var, 1.0f), 280.0f);
                    i51 i51Var2 = lw2.b;
                    px.a(mw2.o(g2, jp.A(p70.k0(new x70(x70.c(((fw2) go1Var8.k(i51Var2)).a.F, 0.0f)), new x70(x70.c(((fw2) go1Var8.k(i51Var2)).a.F, 0.7f)), new x70(x70.c(((fw2) go1Var8.k(i51Var2)).a.G, 0.9f))))), go1Var8, 0);
                    break;
                }
            case 11:
                fe0 fe0Var8 = (fe0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((mg2) obj).getClass();
                go1 go1Var9 = (go1) fe0Var8;
                if (!go1Var9.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    go1Var9.W();
                    break;
                } else {
                    p70.o(null, i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 40.0f, 1), go1Var9, 54, 0);
                    break;
                }
            case 12:
                fe0 fe0Var9 = (fe0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((mg2) obj).getClass();
                go1 go1Var10 = (go1) fe0Var9;
                if (!go1Var10.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    go1Var10.W();
                    break;
                } else {
                    he4.h(go1Var10, 0);
                    break;
                }
            case 13:
                fe0 fe0Var10 = (fe0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var11 = (go1) fe0Var10;
                if (!go1Var11.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    go1Var11.W();
                    break;
                } else {
                    he4.h(go1Var11, 0);
                    break;
                }
            case 14:
                fe0 fe0Var11 = (fe0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var12 = (go1) fe0Var11;
                if (!go1Var12.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    go1Var12.W();
                    break;
                } else {
                    he4.h(go1Var12, 0);
                    break;
                }
            case 15:
                fe0 fe0Var12 = (fe0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((fd2) obj).getClass();
                go1 go1Var13 = (go1) fe0Var12;
                if (!go1Var13.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    go1Var13.W();
                    break;
                } else {
                    he4.h(go1Var13, 0);
                    break;
                }
            case 16:
                fe0 fe0Var13 = (fe0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((fd2) obj).getClass();
                go1 go1Var14 = (go1) fe0Var13;
                if (!go1Var14.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    go1Var14.W();
                    break;
                } else {
                    he4.h(go1Var14, 0);
                    break;
                }
            case 17:
                fe0 fe0Var14 = (fe0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var15 = (go1) fe0Var14;
                if (!go1Var15.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    go1Var15.W();
                    break;
                } else {
                    he4.n(6, go1Var15, k21.I(), "历史搜索");
                    break;
                }
            case 18:
                fe0 fe0Var15 = (fe0) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var16 = (go1) fe0Var15;
                if (!go1Var16.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    go1Var16.W();
                    break;
                } else {
                    he4.n(6, go1Var16, lq2.J(), "热搜榜");
                    break;
                }
            case 19:
                fe0 fe0Var16 = (fe0) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var17 = (go1) fe0Var16;
                if (!go1Var17.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    go1Var17.W();
                    break;
                } else {
                    hx1 hx1Var = e21.f;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.HighQuality", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep p = hf1.p(19.0f, 4.0f, 5.0f, 4.0f);
                        p.r(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        p.M(12.0f);
                        p.r(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        p.v(14.0f);
                        p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        p.x(21.0f, 6.0f);
                        p.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        p.p();
                        p.z(11.0f, 15.0f);
                        p.x(9.5f, 15.0f);
                        p.M(-2.0f);
                        p.v(-2.0f);
                        p.M(2.0f);
                        p.x(6.0f, 15.0f);
                        p.x(6.0f, 9.0f);
                        p.v(1.5f);
                        p.M(2.5f);
                        p.v(2.0f);
                        p.x(9.5f, 9.0f);
                        p.x(11.0f, 9.0f);
                        p.M(6.0f);
                        p.p();
                        p.z(18.0f, 14.0f);
                        p.r(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        p.v(-0.75f);
                        p.M(1.5f);
                        p.v(-1.5f);
                        p.x(14.75f, 15.0f);
                        p.x(14.0f, 15.0f);
                        p.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        p.M(-4.0f);
                        p.r(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        p.v(3.0f);
                        p.r(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        p.M(4.0f);
                        p.p();
                        p.z(14.5f, 13.5f);
                        p.v(2.0f);
                        p.M(-3.0f);
                        p.v(-2.0f);
                        p.M(3.0f);
                        p.p();
                        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
                        hx1Var = gx1Var.b();
                        e21.f = hx1Var;
                    }
                    qm4.n(6, go1Var17, hx1Var, "视频画质");
                    break;
                }
            case 20:
                fe0 fe0Var17 = (fe0) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var18 = (go1) fe0Var17;
                if (!go1Var18.T(intValue17 & 1, (intValue17 & 17) != 16)) {
                    go1Var18.W();
                    break;
                } else {
                    hx1 hx1Var2 = c5.d;
                    if (hx1Var2 == null) {
                        gx1 gx1Var2 = new gx1("Filled.Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = th5.a;
                        rt4 rt4Var2 = new rt4(x70.b);
                        ep p2 = hf1.p(20.0f, 2.0f, 4.0f, 2.0f);
                        p2.r(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        p2.x(2.0f, 22.0f);
                        p2.y(4.0f, -4.0f);
                        p2.v(14.0f);
                        p2.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        p2.x(22.0f, 4.0f);
                        p2.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        p2.p();
                        p2.z(6.0f, 9.0f);
                        p2.v(12.0f);
                        p2.M(2.0f);
                        p2.x(6.0f, 11.0f);
                        p2.x(6.0f, 9.0f);
                        p2.p();
                        p2.z(14.0f, 14.0f);
                        p2.x(6.0f, 14.0f);
                        p2.M(-2.0f);
                        p2.v(8.0f);
                        p2.M(2.0f);
                        p2.p();
                        p2.z(18.0f, 8.0f);
                        p2.x(6.0f, 8.0f);
                        p2.x(6.0f, 6.0f);
                        p2.v(12.0f);
                        p2.M(2.0f);
                        p2.p();
                        gx1.a(gx1Var2, (ArrayList) p2.J, rt4Var2);
                        hx1Var2 = gx1Var2.b();
                        c5.d = hx1Var2;
                    }
                    qm4.n(6, go1Var18, hx1Var2, "弹幕显示");
                    break;
                }
            case 21:
                fe0 fe0Var18 = (fe0) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var19 = (go1) fe0Var18;
                if (!go1Var19.T(intValue18 & 1, (intValue18 & 17) != 16)) {
                    go1Var19.W();
                    break;
                } else {
                    qm4.n(6, go1Var19, c5.L(), "界面形态");
                    break;
                }
            case 22:
                fe0 fe0Var19 = (fe0) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var20 = (go1) fe0Var19;
                if (!go1Var20.T(intValue19 & 1, (intValue19 & 17) != 16)) {
                    go1Var20.W();
                    break;
                } else {
                    i51 i51Var3 = lw2.b;
                    r55.b("大屏上系统不锁定方向，强制形态只改输入方式与电视判定，取向跟随实际握持。", i42.D0(i13Var, 16.0f, 4.0f), ((fw2) go1Var20.k(i51Var3)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var20.k(i51Var3)).b.l, go1Var20, 54, 0, 131064);
                    break;
                }
            case 23:
                fe0 fe0Var20 = (fe0) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var21 = (go1) fe0Var20;
                if (!go1Var21.T(intValue20 & 1, (intValue20 & 17) != 16)) {
                    go1Var21.W();
                    break;
                } else {
                    hx1 hx1Var3 = kb4.h;
                    if (hx1Var3 == null) {
                        gx1 gx1Var3 = new gx1("Filled.Wallpaper", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = th5.a;
                        rt4 rt4Var3 = new rt4(x70.b);
                        ep epVar = new ep((byte) 13);
                        epVar.z(4.0f, 4.0f);
                        epVar.v(7.0f);
                        epVar.x(11.0f, 2.0f);
                        epVar.x(4.0f, 2.0f);
                        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        epVar.M(7.0f);
                        epVar.v(2.0f);
                        epVar.x(4.0f, 4.0f);
                        epVar.p();
                        epVar.z(10.0f, 13.0f);
                        epVar.y(-4.0f, 5.0f);
                        epVar.v(12.0f);
                        epVar.y(-3.0f, -4.0f);
                        epVar.y(-2.03f, 2.71f);
                        epVar.x(10.0f, 13.0f);
                        epVar.p();
                        epVar.z(17.0f, 8.5f);
                        epVar.r(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                        epVar.C(14.0f, 7.67f, 14.0f, 8.5f);
                        epVar.D(0.67f, 1.5f, 1.5f, 1.5f);
                        epVar.C(17.0f, 9.33f, 17.0f, 8.5f);
                        epVar.p();
                        epVar.z(20.0f, 2.0f);
                        epVar.v(-7.0f);
                        epVar.M(2.0f);
                        epVar.v(7.0f);
                        epVar.M(7.0f);
                        epVar.v(2.0f);
                        epVar.x(22.0f, 4.0f);
                        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        epVar.p();
                        epVar.z(20.0f, 20.0f);
                        epVar.v(-7.0f);
                        epVar.M(2.0f);
                        epVar.v(7.0f);
                        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        epVar.M(-7.0f);
                        epVar.v(-2.0f);
                        epVar.M(7.0f);
                        epVar.p();
                        epVar.z(4.0f, 13.0f);
                        epVar.x(2.0f, 13.0f);
                        epVar.M(7.0f);
                        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        epVar.v(7.0f);
                        epVar.M(-2.0f);
                        epVar.x(4.0f, 20.0f);
                        epVar.M(-7.0f);
                        epVar.p();
                        gx1.a(gx1Var3, (ArrayList) epVar.J, rt4Var3);
                        hx1Var3 = gx1Var3.b();
                        kb4.h = hx1Var3;
                    }
                    qm4.n(6, go1Var21, hx1Var3, "取色来源");
                    break;
                }
            case 24:
                fe0 fe0Var21 = (fe0) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var22 = (go1) fe0Var21;
                if (!go1Var22.T(intValue21 & 1, (intValue21 & 17) != 16)) {
                    go1Var22.W();
                    break;
                } else {
                    hx1 hx1Var4 = e21.h;
                    if (hx1Var4 == null) {
                        gx1 gx1Var4 = new gx1("Filled.Layers", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = th5.a;
                        rt4 rt4Var4 = new rt4(x70.b);
                        ep epVar2 = new ep((byte) 13);
                        epVar2.z(11.99f, 18.54f);
                        epVar2.y(-7.37f, -5.73f);
                        epVar2.x(3.0f, 14.07f);
                        epVar2.y(9.0f, 7.0f);
                        epVar2.y(9.0f, -7.0f);
                        epVar2.y(-1.63f, -1.27f);
                        epVar2.y(-7.38f, 5.74f);
                        epVar2.p();
                        epVar2.z(12.0f, 16.0f);
                        epVar2.y(7.36f, -5.73f);
                        epVar2.x(21.0f, 9.0f);
                        epVar2.y(-9.0f, -7.0f);
                        epVar2.y(-9.0f, 7.0f);
                        epVar2.y(1.63f, 1.27f);
                        epVar2.x(12.0f, 16.0f);
                        epVar2.p();
                        gx1.a(gx1Var4, (ArrayList) epVar2.J, rt4Var4);
                        hx1Var4 = gx1Var4.b();
                        e21.h = hx1Var4;
                    }
                    qm4.n(6, go1Var22, hx1Var4, "幕光与动效");
                    break;
                }
            case 25:
                fe0 fe0Var22 = (fe0) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var23 = (go1) fe0Var22;
                if (!go1Var23.T(intValue22 & 1, (intValue22 & 17) != 16)) {
                    go1Var23.W();
                    break;
                } else {
                    hx1 hx1Var5 = kb4.a;
                    if (hx1Var5 == null) {
                        gx1 gx1Var5 = new gx1("Filled.Security", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i9 = th5.a;
                        rt4 rt4Var5 = new rt4(x70.b);
                        ep epVar3 = new ep((byte) 13);
                        epVar3.z(12.0f, 1.0f);
                        epVar3.x(3.0f, 5.0f);
                        epVar3.M(6.0f);
                        epVar3.r(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
                        epVar3.r(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
                        epVar3.x(21.0f, 5.0f);
                        epVar3.y(-9.0f, -4.0f);
                        epVar3.p();
                        epVar3.z(12.0f, 11.99f);
                        epVar3.v(7.0f);
                        epVar3.r(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
                        epVar3.x(12.0f, 12.0f);
                        epVar3.x(5.0f, 12.0f);
                        epVar3.x(5.0f, 6.3f);
                        epVar3.y(7.0f, -3.11f);
                        epVar3.M(8.8f);
                        epVar3.p();
                        gx1.a(gx1Var5, (ArrayList) epVar3.J, rt4Var5);
                        hx1Var5 = gx1Var5.b();
                        kb4.a = hx1Var5;
                    }
                    qm4.n(6, go1Var23, hx1Var5, "状态");
                    break;
                }
            case 26:
                break;
            case 27:
                fe0 fe0Var23 = (fe0) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var24 = (go1) fe0Var23;
                if (!go1Var24.T(intValue23 & 1, (intValue23 & 17) != 16)) {
                    go1Var24.W();
                    break;
                } else {
                    qm4.n(6, go1Var24, dq2.S(), "扫码登录");
                    break;
                }
            case 28:
                fe0 fe0Var24 = (fe0) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var25 = (go1) fe0Var24;
                if (!go1Var25.T(intValue24 & 1, (intValue24 & 17) != 16)) {
                    go1Var25.W();
                    break;
                } else {
                    qm4.n(6, go1Var25, a5.K(), "Cookie");
                    break;
                }
            default:
                fe0 fe0Var25 = (fe0) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var26 = (go1) fe0Var25;
                if (!go1Var26.T(intValue25 & 1, (intValue25 & 17) != 16)) {
                    go1Var26.W();
                    break;
                } else {
                    hx1 hx1Var6 = kb4.g;
                    if (hx1Var6 == null) {
                        gx1 gx1Var6 = new gx1("Filled.VerifiedUser", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = th5.a;
                        rt4 rt4Var6 = new rt4(x70.b);
                        ep epVar4 = new ep((byte) 13);
                        epVar4.z(12.0f, 1.0f);
                        epVar4.x(3.0f, 5.0f);
                        epVar4.M(6.0f);
                        epVar4.r(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
                        epVar4.r(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
                        epVar4.x(21.0f, 5.0f);
                        epVar4.y(-9.0f, -4.0f);
                        epVar4.p();
                        epVar4.z(10.0f, 17.0f);
                        epVar4.y(-4.0f, -4.0f);
                        epVar4.y(1.41f, -1.41f);
                        epVar4.x(10.0f, 14.17f);
                        epVar4.y(6.59f, -6.59f);
                        epVar4.x(18.0f, 9.0f);
                        epVar4.y(-8.0f, 8.0f);
                        epVar4.p();
                        gx1.a(gx1Var6, (ArrayList) epVar4.J, rt4Var6);
                        hx1Var6 = gx1Var6.b();
                        kb4.g = hx1Var6;
                    }
                    qm4.n(6, go1Var26, hx1Var6, "互动安全凭据");
                    break;
                }
        }
        return wd5Var;
    }
}
