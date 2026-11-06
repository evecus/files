package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.RendererCapabilities;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a91 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ a91(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        wd5 SearchExpanded$lambda$0;
        String str;
        String str2;
        String str3;
        boolean z2;
        ki1 ki1Var;
        l13 l13Var;
        byte b = this.I;
        df0 df0Var = wa2.A0;
        i13 i13Var = i13.a;
        Object obj4 = de0.a;
        byte b2 = 16;
        fj0 fj0Var = null;
        wd5 wd5Var = wd5.a;
        boolean z3 = true;
        Object obj5 = this.K;
        Object obj6 = this.J;
        switch (b) {
            case 0:
                Map map = (Map) obj6;
                String str4 = (String) obj5;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(map.get(str4), go1Var), str4, nq4.c, null, null, null, li0.b, 0.0f, null, 0, false, go1Var, 1573248, 0, 1976);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                wd5 wd5Var2 = null;
                t43 t43Var = (t43) obj6;
                c80 c80Var = (c80) obj5;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((tx) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Bitmap bitmap = ((vy3) t43Var.getValue()).c;
                    if (bitmap == null) {
                        go1Var2.d0(-1068838566);
                        z = false;
                        go1Var2.q(false);
                    } else {
                        z = false;
                        go1Var2.d0(-1068838565);
                        ut0.b(new dd(bitmap), "抖音扫码登录", nq4.c, c80Var, go1Var2, 25008, 168);
                        go1Var2.q(false);
                        wd5Var2 = wd5Var;
                    }
                    if (wd5Var2 == null) {
                        go1Var2.d0(-1697033449);
                        p70.i(null, 0.0f, 0L, go1Var2, 0, 7);
                    } else {
                        go1Var2.d0(-1697047120);
                    }
                    go1Var2.q(z);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                Bitmap bitmap2 = (Bitmap) obj6;
                String str5 = (String) obj5;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((tx) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                } else if (bitmap2 == null) {
                    go1Var3.d0(1851265280);
                    go1Var3.q(false);
                } else {
                    go1Var3.d0(1851265281);
                    ut0.b(new dd(bitmap2), r7.B(str5, " 二维码"), nq4.c, null, go1Var3, 24960, 232);
                    go1Var3.q(false);
                }
                return wd5Var;
            case 3:
                hu2 hu2Var = (hu2) obj6;
                b50 b50Var = (b50) obj5;
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean i = go1Var4.i(hu2Var) | go1Var4.i(b50Var);
                    Object Q = go1Var4.Q();
                    if (i || Q == obj4) {
                        Q = new ka(hu2Var, b50Var, (byte) 10);
                        go1Var4.o0(Q);
                    }
                    p70.p(6, 28, go1Var4, (rm1) Q, null, "重试", false);
                } else {
                    go1Var4.W();
                }
                return wd5Var;
            case 4:
                tm1 tm1Var = (tm1) obj6;
                xi0 xi0Var = (xi0) obj5;
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (go1Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Object Q2 = go1Var5.Q();
                    if (Q2 == obj4) {
                        Q2 = new yi0();
                        go1Var5.o0(Q2);
                    }
                    yi0 yi0Var = (yi0) Q2;
                    yi0Var.a.clear();
                    tm1Var.invoke(yi0Var);
                    yi0Var.a(xi0Var, go1Var5, 0);
                } else {
                    go1Var5.W();
                }
                return wd5Var;
            case 5:
                SearchExpanded$lambda$0 = DesktopWidgetsKt.SearchExpanded$lambda$0((WidgetPalette) obj6, (List) obj5, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return SearchExpanded$lambda$0;
            case 6:
                cw4 cw4Var = (cw4) obj6;
                t43 t43Var2 = (t43) obj5;
                fe0 fe0Var6 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var6;
                if (go1Var6.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    boolean blockEnabled = ((LiveDanmakuSettings) cw4Var.getValue()).getBlockEnabled();
                    Object Q3 = go1Var6.Q();
                    if (Q3 == obj4) {
                        Q3 = new uf(t43Var2, (byte) 21);
                        go1Var6.o0(Q3);
                    }
                    lq2.n("弹幕屏蔽词", blockEnabled, (tm1) Q3, null, a5.G(), null, pt1.t(((LiveDanmakuSettings) cw4Var.getValue()).getBlockWords().size(), "条"), false, 0L, 0.0f, null, 0, 0, go1Var6, 390, 0, 8104);
                } else {
                    go1Var6.W();
                }
                return wd5Var;
            case 7:
                ki1 ki1Var2 = (ki1) obj6;
                ki1 ki1Var3 = (ki1) obj5;
                zd2 zd2Var = (zd2) obj;
                fe0 fe0Var7 = (fe0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                zd2Var.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((go1) fe0Var7).g(zd2Var) ? (byte) 4 : (byte) 2;
                }
                go1 go1Var7 = (go1) fe0Var7;
                if (go1Var7.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    hx1 hx1Var = dq2.e;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.PeopleOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep r = r7.r(16.5f, 13.0f);
                        r.r(-1.2f, 0.0f, -3.07f, 0.34f, -4.5f, 1.0f);
                        r.r(-1.43f, -0.67f, -3.3f, -1.0f, -4.5f, -1.0f);
                        r.q(5.33f, 13.0f, 1.0f, 14.08f, 1.0f, 16.25f);
                        r.x(1.0f, 19.0f);
                        r.v(22.0f);
                        r.M(-2.75f);
                        r.r(0.0f, -2.17f, -4.33f, -3.25f, -6.5f, -3.25f);
                        r.p();
                        r.z(12.5f, 17.5f);
                        r.v(-10.0f);
                        r.M(-1.25f);
                        r.r(0.0f, -0.54f, 2.56f, -1.75f, 5.0f, -1.75f);
                        r.D(5.0f, 1.21f, 5.0f, 1.75f);
                        r.M(1.25f);
                        r.p();
                        r.z(21.5f, 17.5f);
                        r.x(14.0f, 17.5f);
                        r.M(-1.25f);
                        r.r(0.0f, -0.46f, -0.2f, -0.86f, -0.52f, -1.22f);
                        r.r(0.88f, -0.3f, 1.96f, -0.53f, 3.02f, -0.53f);
                        r.r(2.44f, 0.0f, 5.0f, 1.21f, 5.0f, 1.75f);
                        r.M(1.25f);
                        r.p();
                        r.z(7.5f, 12.0f);
                        r.r(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                        r.C(9.43f, 5.0f, 7.5f, 5.0f);
                        r.C(4.0f, 6.57f, 4.0f, 8.5f);
                        r.C(5.57f, 12.0f, 7.5f, 12.0f);
                        r.p();
                        r.z(7.5f, 6.5f);
                        r.r(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                        r.D(-0.9f, 2.0f, -2.0f, 2.0f);
                        r.D(-2.0f, -0.9f, -2.0f, -2.0f);
                        r.D(0.9f, -2.0f, 2.0f, -2.0f);
                        r.p();
                        r.z(16.5f, 12.0f);
                        r.r(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                        r.C(18.43f, 5.0f, 16.5f, 5.0f);
                        r.C(13.0f, 6.57f, 13.0f, 8.5f);
                        r.D(1.57f, 3.5f, 3.5f, 3.5f);
                        r.p();
                        r.z(16.5f, 6.5f);
                        r.r(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                        r.D(-0.9f, 2.0f, -2.0f, 2.0f);
                        r.D(-2.0f, -0.9f, -2.0f, -2.0f);
                        r.D(0.9f, -2.0f, 2.0f, -2.0f);
                        r.p();
                        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
                        hx1Var = gx1Var.b();
                        dq2.e = hx1Var;
                    }
                    hx1 hx1Var2 = hx1Var;
                    l13 B = mw2.B(j42.x(i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 40.0f, 1), ki1Var2), false, null, 3);
                    boolean g = ((intValue7 & 14) == 4) | go1Var7.g(ki1Var3);
                    Object Q4 = go1Var7.Q();
                    if (g || Q4 == obj4) {
                        Q4 = new yz2(zd2Var, ki1Var3, (byte) 9);
                        go1Var7.o0(Q4);
                    }
                    Map singletonMap = Collections.singletonMap(19, (rm1) Q4);
                    singletonMap.getClass();
                    p70.q(hx1Var2, "暂无用户列表", r13.c(B, singletonMap), null, null, true, null, go1Var7, 196656, 88);
                } else {
                    go1Var7.W();
                }
                return wd5Var;
            case 8:
                List list = (List) obj6;
                tm1 tm1Var2 = (tm1) obj5;
                fe0 fe0Var8 = (fe0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ih1) obj).getClass();
                go1 go1Var8 = (go1) fe0Var8;
                if (go1Var8.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    for (String str6 : o70.l1(list, 12)) {
                        boolean g2 = go1Var8.g(tm1Var2) | go1Var8.g(str6);
                        Object Q5 = go1Var8.Q();
                        if (g2 || Q5 == obj4) {
                            Q5 = new le4(tm1Var2, str6, (byte) 3);
                            go1Var8.o0(Q5);
                        }
                        qe4.e(str6, (rm1) Q5, null, null, null, null, go1Var8, 0, 60);
                    }
                } else {
                    go1Var8.W();
                }
                return wd5Var;
            case 9:
                rm1 rm1Var = (rm1) obj6;
                tm1 tm1Var3 = (tm1) obj5;
                ((Integer) obj3).getClass();
                go1 go1Var9 = (go1) ((fe0) obj2);
                go1Var9.d0(759876635);
                Object Q6 = go1Var9.Q();
                if (Q6 == obj4) {
                    Q6 = dt4.b(rm1Var);
                    go1Var9.o0(Q6);
                }
                cw4 cw4Var2 = (cw4) Q6;
                Object Q7 = go1Var9.Q();
                if (Q7 == obj4) {
                    pd3 pd3Var = (pd3) cw4Var2.getValue();
                    long j = pd3Var.a;
                    Q7 = new bh(pd3Var, gi4.b, new pd3(gi4.c), 8);
                    go1Var9.o0(Q7);
                }
                bh bhVar = (bh) Q7;
                boolean i3 = go1Var9.i(bhVar);
                Object Q8 = go1Var9.Q();
                if (i3 || Q8 == obj4) {
                    Q8 = new o1(cw4Var2, bhVar, fj0Var, b2);
                    go1Var9.o0(Q8);
                }
                mw2.h(go1Var9, (hn1) Q8, wd5Var);
                cj cjVar = bhVar.c;
                boolean g3 = go1Var9.g(cjVar);
                Object Q9 = go1Var9.Q();
                if (g3 || Q9 == obj4) {
                    Q9 = new tt2(cjVar, (byte) 3);
                    go1Var9.o0(Q9);
                }
                l13 l13Var2 = (l13) tm1Var3.invoke((rm1) Q9);
                go1Var9.q(false);
                return l13Var2;
            case 10:
                List list2 = (List) obj6;
                cy3 cy3Var = (cy3) obj5;
                l13 l13Var3 = (l13) obj;
                fe0 fe0Var9 = (fe0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                l13Var3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((go1) fe0Var9).g(l13Var3) ? 4 : 2;
                }
                int i4 = intValue9;
                go1 go1Var10 = (go1) fe0Var9;
                if (go1Var10.T(i4 & 1, (i4 & 19) != 18)) {
                    int i5 = 0;
                    for (Object obj7 : list2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p70.A0();
                            throw null;
                        }
                        gb5 gb5Var = (gb5) obj7;
                        String str7 = (String) gb5Var.I;
                        String str8 = (String) gb5Var.J;
                        String str9 = (String) gb5Var.K;
                        if (i5 == 0) {
                            str = str7;
                            str2 = str9;
                            str3 = str8;
                            z2 = true;
                        } else {
                            str = str7;
                            str2 = str9;
                            str3 = str8;
                            z2 = false;
                        }
                        qm4.a(str, str3, str2, cy3Var, z2, l13Var3, go1Var10, (i4 << 15) & 458752);
                        i5 = i6;
                    }
                } else {
                    go1Var10.W();
                }
                return wd5Var;
            case 11:
                fl4 fl4Var = (fl4) obj6;
                k80 k80Var = (k80) obj5;
                fe0 fe0Var10 = (fe0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var11 = (go1) fe0Var10;
                if (go1Var11.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    l13 C0 = i42.C0(mw2.p(o7.m(i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 8.0f, 1), l74.a(18.0f)), fl4Var.u() ? k80Var.h : k80Var.l, mw2.j), 18.0f);
                    uw2 c = px.c(q8.J, false);
                    long j2 = go1Var11.T;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    am3 m = go1Var11.m();
                    l13 x0 = i42.x0(go1Var11, C0);
                    xd0.c.getClass();
                    go1Var11.h0();
                    if (go1Var11.S) {
                        go1Var11.l(df0Var);
                    } else {
                        go1Var11.r0();
                    }
                    sg sgVar = q8.c0;
                    qi4.k(go1Var11, sgVar, c);
                    sg sgVar2 = q8.b0;
                    qi4.k(go1Var11, sgVar2, m);
                    Integer valueOf = Integer.valueOf(i7);
                    sg sgVar3 = q8.d0;
                    qi4.k(go1Var11, sgVar3, valueOf);
                    qi4.j(go1Var11);
                    sg sgVar4 = q8.a0;
                    qi4.k(go1Var11, sgVar4, x0);
                    ba0 a = z90.a(new kp(6.0f, true, new y9()), q8.V, go1Var11, 6);
                    long j3 = go1Var11.T;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    am3 m2 = go1Var11.m();
                    l13 x02 = i42.x0(go1Var11, i13Var);
                    go1Var11.h0();
                    if (go1Var11.S) {
                        go1Var11.l(df0Var);
                    } else {
                        go1Var11.r0();
                    }
                    qi4.k(go1Var11, sgVar, a);
                    qi4.k(go1Var11, sgVar2, m2);
                    r7.G(i8, go1Var11, sgVar3, go1Var11);
                    qi4.k(go1Var11, sgVar4, x02);
                    String str10 = fl4Var.u() ? "已检测到 ticket、ts_sign 和 private key" : "请补充 security-sdk / web_protect 导出的互动安全凭据";
                    i51 i51Var = lw2.b;
                    r55.b(str10, null, fl4Var.u() ? k80Var.i : k80Var.m, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var11.k(i51Var)).b.i, go1Var11, 1572864, 0, 131002);
                    r55.b("支持粘贴 JSON、key=value 文本或 localStorage 导出内容，会自动提取 ticket 和 ts_sign。", null, fl4Var.u() ? k80Var.i : k80Var.m, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var11.k(i51Var)).b.l, go1Var11, 24582, 0, 131050);
                    go1Var11.q(true);
                    go1Var11.q(true);
                } else {
                    go1Var11.W();
                }
                return wd5Var;
            case 12:
                hu2 hu2Var2 = (hu2) obj6;
                dl0 dl0Var = (dl0) obj5;
                fe0 fe0Var11 = (fe0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                byte b3 = 1;
                go1 go1Var12 = (go1) fe0Var11;
                if (go1Var12.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    t43 g4 = wi4.g(hu2Var2.h.o, go1Var12);
                    o7 o7Var = new o7(b3);
                    Object Q10 = go1Var12.Q();
                    if (Q10 == obj4) {
                        Q10 = new ol4((byte) 8);
                        go1Var12.o0(Q10);
                    }
                    qu2 a0 = g4.a0(o7Var, (tm1) Q10, go1Var12, 48);
                    String str11 = ((Boolean) g4.getValue()).booleanValue() ? "已开启，桌面新增「推荐」和「稍后再看」两行" : "关闭，桌面不显示应用内容";
                    boolean booleanValue = ((Boolean) g4.getValue()).booleanValue();
                    boolean i9 = go1Var12.i(hu2Var2) | go1Var12.i(dl0Var) | go1Var12.i(a0);
                    Object Q11 = go1Var12.Q();
                    if (i9 || Q11 == obj4) {
                        Q11 = new m6((Object) hu2Var2, (Object) dl0Var, (Object) a0, (byte) 24);
                        go1Var12.o0(Q11);
                    }
                    qm4.r("电视桌面显示推荐", str11, booleanValue, (tm1) Q11, null, go1Var12, 6);
                } else {
                    go1Var12.W();
                }
                return wd5Var;
            case 13:
                y63 y63Var = (y63) obj6;
                t33 t33Var = (t33) obj5;
                ((Integer) obj3).getClass();
                go1 go1Var13 = (go1) ((fe0) obj2);
                go1Var13.d0(-102778667);
                Object Q12 = go1Var13.Q();
                if (Q12 == obj4) {
                    Q12 = mw2.w(go1Var13);
                    go1Var13.o0(Q12);
                }
                dl0 dl0Var2 = (dl0) Q12;
                Object Q13 = go1Var13.Q();
                if (Q13 == obj4) {
                    Q13 = ad4.w(null);
                    go1Var13.o0(Q13);
                }
                t43 t43Var3 = (t43) Q13;
                t43 x = ad4.x(y63Var, go1Var13);
                boolean g5 = go1Var13.g(t33Var);
                Object Q14 = go1Var13.Q();
                if (g5 || Q14 == obj4) {
                    Q14 = new ap3((Object) t43Var3, (Object) t33Var, (byte) 9);
                    go1Var13.o0(Q14);
                }
                mw2.e(t33Var, (tm1) Q14, go1Var13);
                boolean i10 = go1Var13.i(dl0Var2) | go1Var13.g(t33Var) | go1Var13.g(x);
                Object Q15 = go1Var13.Q();
                if (i10 || Q15 == obj4) {
                    Q15 = new i45(dl0Var2, t43Var3, t33Var, x);
                    go1Var13.o0(Q15);
                }
                l05 l05Var = new l05(t33Var, null, null, (PointerInputEventHandler) Q15, 6);
                go1Var13.q(false);
                return l05Var;
            case 14:
                sg sgVar5 = q8.a0;
                sg sgVar6 = q8.d0;
                sg sgVar7 = q8.b0;
                sg sgVar8 = q8.c0;
                List list3 = (List) obj6;
                ki1 ki1Var4 = (ki1) obj5;
                fe0 fe0Var12 = (fe0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var14 = (go1) fe0Var12;
                if (go1Var14.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ba0 a2 = z90.a(new kp(12.0f, true, new y9()), q8.V, go1Var14, 6);
                    ki1 ki1Var5 = ki1Var4;
                    long j4 = go1Var14.T;
                    int i11 = (int) (j4 ^ (j4 >>> 32));
                    am3 m3 = go1Var14.m();
                    l13 x03 = i42.x0(go1Var14, i13Var);
                    xd0.c.getClass();
                    go1Var14.h0();
                    if (go1Var14.S) {
                        go1Var14.l(df0Var);
                    } else {
                        go1Var14.r0();
                    }
                    qi4.k(go1Var14, sgVar8, a2);
                    qi4.k(go1Var14, sgVar7, m3);
                    qi4.k(go1Var14, sgVar6, Integer.valueOf(i11));
                    qi4.j(go1Var14);
                    qi4.k(go1Var14, sgVar5, x03);
                    go1Var14.d0(211624518);
                    ArrayList N0 = o70.N0(list3, 4);
                    int size = N0.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj8 = N0.get(i13);
                        int i14 = i13 + 1;
                        int i15 = i12 + 1;
                        if (i12 < 0) {
                            p70.A0();
                            throw null;
                        }
                        List list4 = (List) obj8;
                        ArrayList arrayList = N0;
                        int i16 = size;
                        kp kpVar = new kp(8.0f, z3, new y9());
                        l13 e = nq4.e(i13Var, 1.0f);
                        u74 a3 = t74.a(kpVar, q8.S, go1Var14, 6);
                        long j5 = go1Var14.T;
                        int i17 = (int) (j5 ^ (j5 >>> 32));
                        am3 m4 = go1Var14.m();
                        l13 x04 = i42.x0(go1Var14, e);
                        xd0.c.getClass();
                        go1Var14.h0();
                        if (go1Var14.S) {
                            go1Var14.l(df0Var);
                        } else {
                            go1Var14.r0();
                        }
                        qi4.k(go1Var14, sgVar8, a3);
                        qi4.k(go1Var14, sgVar7, m4);
                        qi4.k(go1Var14, sgVar6, Integer.valueOf(i17));
                        qi4.j(go1Var14);
                        qi4.k(go1Var14, sgVar5, x04);
                        go1Var14.d0(1847010161);
                        Iterator it = list4.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                p70.A0();
                                throw null;
                            }
                            wy2 wy2Var = (wy2) next;
                            Iterator it2 = it;
                            l13 x2 = nt3.x(i13Var, 1.0f);
                            if (i12 == 0 && i18 == 0) {
                                ki1Var = ki1Var5;
                                l13Var = j42.x(i13Var, ki1Var);
                            } else {
                                ki1Var = ki1Var5;
                                l13Var = i13Var;
                            }
                            on5.l(wy2Var, x2.then(l13Var), go1Var14, 0);
                            ki1Var5 = ki1Var;
                            i18 = i19;
                            it = it2;
                        }
                        ki1 ki1Var6 = ki1Var5;
                        go1Var14.q(false);
                        go1Var14.d0(1847037033);
                        int size2 = 4 - list4.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            oh4.a(go1Var14, nt3.x(i13Var, 1.0f));
                        }
                        go1Var14.q(false);
                        go1Var14.q(true);
                        i13 = i14;
                        z3 = true;
                        ki1Var5 = ki1Var6;
                        i12 = i15;
                        N0 = arrayList;
                        size = i16;
                    }
                    go1Var14.q(false);
                    oh4.a(go1Var14, nq4.g(i13Var, 4.0f));
                    go1Var14.q(z3);
                } else {
                    go1Var14.W();
                }
                return wd5Var;
            case 15:
                so3 so3Var = (so3) obj6;
                rm1 rm1Var2 = (rm1) obj5;
                fe0 fe0Var13 = (fe0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var15 = (go1) fe0Var13;
                if (go1Var15.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    lq2.d(lq2.L(), "播放完后", rm1Var2, null, false, false, null, so3Var.I, null, 0.0f, 0L, null, 0, 0, go1Var15, 48, 0, 16248);
                } else {
                    go1Var15.W();
                }
                return wd5Var;
            default:
                lq5 lq5Var = (lq5) obj6;
                tm1 tm1Var4 = (tm1) obj5;
                fe0 fe0Var14 = (fe0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var16 = (go1) fe0Var14;
                if (go1Var16.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ba0 a4 = z90.a(i42.d, q8.V, go1Var16, 0);
                    long j6 = go1Var16.T;
                    int i21 = (int) (j6 ^ (j6 >>> 32));
                    am3 m5 = go1Var16.m();
                    l13 x05 = i42.x0(go1Var16, i13Var);
                    xd0.c.getClass();
                    go1Var16.h0();
                    if (go1Var16.S) {
                        go1Var16.l(df0Var);
                    } else {
                        go1Var16.r0();
                    }
                    qi4.k(go1Var16, q8.c0, a4);
                    qi4.k(go1Var16, q8.b0, m5);
                    qi4.k(go1Var16, q8.d0, Integer.valueOf(i21));
                    qi4.j(go1Var16);
                    qi4.k(go1Var16, q8.a0, x05);
                    lq2.e(14.0f, "画质", 54, go1Var16, 0);
                    Object Q16 = go1Var16.Q();
                    if (Q16 == obj4) {
                        Q16 = new fl5(r10);
                        go1Var16.o0(Q16);
                    }
                    lq2.g(lq5.O, lq5Var, (hn1) Q16, tm1Var4, null, null, 0.0f, false, null, go1Var16, RendererCapabilities.DECODER_SUPPORT_MASK, 496);
                    go1Var16.q(true);
                } else {
                    go1Var16.W();
                }
                return wd5Var;
        }
    }
}
