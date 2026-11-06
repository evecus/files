package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.github.mytv.dv.widget.NowPlayingWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetUiKt;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class in2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ in2(bl4 bl4Var, String str, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, int i) {
        this.I = (byte) 8;
        this.K = bl4Var;
        this.L = str;
        this.J = rm1Var;
        this.M = rm1Var2;
        this.N = l13Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$2;
        t43 t43Var;
        t43 t43Var2;
        wd5 WidgetCover$lambda$0;
        byte b = this.I;
        rm1 rm1Var = wa2.A0;
        Object obj3 = de0.a;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.K;
        Object obj7 = this.L;
        Object obj8 = this.J;
        switch (b) {
            case 0:
                rm1 rm1Var2 = (rm1) obj8;
                t43 t43Var3 = (t43) obj6;
                String str = (String) obj7;
                String str2 = (String) obj5;
                ki1 ki1Var = (ki1) obj4;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    l13 p = mw2.p(nq4.c, ((fw2) go1Var.k(lw2.b)).a.p, mw2.j);
                    String str3 = (String) t43Var3.getValue();
                    boolean g = go1Var.g(rm1Var2);
                    Object Q = go1Var.Q();
                    if (g || Q == obj3) {
                        Q = new c40(rm1Var2, (byte) 1);
                        go1Var.o0(Q);
                    }
                    l13 b2 = m05.b(p, str3, (PointerInputEventHandler) Q);
                    uw2 c = px.c(q8.N, false);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, b2);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(rm1Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    p70.q(hc4.Q(), str, null, str2 != null ? str2.concat("，按确定键重试") : "按确定键重试", rw4.J, false, p70.u0(571584250, new o30(ki1Var, rm1Var2, (byte) 1), go1Var), go1Var, 1597440, 36);
                    go1Var.q(true);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                ((Integer) obj2).getClass();
                c5.c((l13) obj8, (dn4) obj6, (u10) obj7, (w10) obj5, (tc0) obj4, (fe0) obj, mu0.X(196615));
                return wd5Var;
            case 2:
                k80 k80Var = (k80) obj8;
                h23 h23Var = (h23) obj6;
                hn4 hn4Var = (hn4) obj7;
                lc5 lc5Var = (lc5) obj5;
                hn1 hn1Var = (hn1) obj4;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    lw2.a(k80Var, h23Var, hn4Var, lc5Var, hn1Var, go1Var2, 0);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 3:
                provideGlance$lambda$2 = NowPlayingWidget.provideGlance$lambda$2((WidgetPalette) obj8, (fl4) obj6, (WidgetPlayback) obj7, (Bitmap) obj5, (Bitmap) obj4, (fe0) obj, ((Integer) obj2).intValue());
                return provideGlance$lambda$2;
            case 4:
                l13 l13Var = (l13) obj7;
                t43 t43Var4 = (t43) obj6;
                tc0 tc0Var = (tc0) obj5;
                bv bvVar = (bv) obj4;
                rm1 rm1Var3 = (rm1) obj8;
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object Q2 = go1Var3.Q();
                    if (Q2 == obj3) {
                        Q2 = new xx2(t43Var4, (byte) 6);
                        go1Var3.o0(Q2);
                    }
                    l13 X = qb.X(l13Var, (tm1) Q2);
                    uw2 c2 = px.c(q8.J, true);
                    long j2 = go1Var3.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var3.m();
                    l13 x02 = i42.x0(go1Var3, X);
                    xd0.c.getClass();
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(rm1Var);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, q8.c0, c2);
                    qi4.k(go1Var3, q8.b0, m2);
                    qi4.k(go1Var3, q8.d0, Integer.valueOf(i2));
                    qi4.j(go1Var3);
                    qi4.k(go1Var3, q8.a0, x02);
                    tc0Var.invoke(go1Var3, 0);
                    bvVar.b(rm1Var3, go1Var3, 6);
                    go1Var3.q(true);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            case 5:
                sg sgVar = q8.a0;
                sg sgVar2 = q8.d0;
                sg sgVar3 = q8.b0;
                sg sgVar4 = q8.c0;
                k80 k80Var2 = (k80) obj8;
                Object obj9 = (ez3) obj7;
                t43 t43Var5 = (t43) obj6;
                ki1 ki1Var2 = (ki1) obj4;
                t43 t43Var6 = (t43) obj5;
                fe0 fe0Var4 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                uv uvVar = q8.S;
                int i3 = 6;
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    go1Var4.W();
                    return wd5Var;
                }
                i13 i13Var = i13.a;
                l13 C0 = i42.C0(mw2.p(o7.m(nq4.n(i13Var, 340.0f), l74.a(24.0f)), k80Var2.G, mw2.j), 24.0f);
                float f = 12.0f;
                t43 t43Var7 = t43Var5;
                ba0 a = z90.a(new kp(12.0f, true, new y9()), q8.W, go1Var4, 54);
                long j3 = go1Var4.T;
                int i4 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var4.m();
                l13 x03 = i42.x0(go1Var4, C0);
                xd0.c.getClass();
                go1Var4.h0();
                if (go1Var4.S) {
                    go1Var4.l(rm1Var);
                } else {
                    go1Var4.r0();
                }
                qi4.k(go1Var4, sgVar4, a);
                qi4.k(go1Var4, sgVar3, m3);
                qi4.k(go1Var4, sgVar2, Integer.valueOf(i4));
                qi4.j(go1Var4);
                qi4.k(go1Var4, sgVar, x03);
                xx3 xx3Var = lw2.b;
                m65 m65Var = ((fw2) go1Var4.k(xx3Var)).b.h;
                qk1 qk1Var = qk1.P;
                r55.b("输入短信验证码", null, k80Var2.q, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var4, 1572870, 0, 131002);
                r55.b("验证码已发送到你的手机", null, k80Var2.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var4.k(xx3Var)).b.l, go1Var4, 6, 0, 131066);
                r55.b(((String) t43Var7.getValue()).length() == 0 ? "——————" : (String) t43Var7.getValue(), null, k80Var2.q, 0L, qk1Var, oh4.j(6), null, 0L, 0, false, 0, 0, ((fw2) go1Var4.k(xx3Var)).b.f, go1Var4, 102236160, 0, 130746);
                go1Var4.d0(-1177277807);
                Iterator it = p70.k0(p70.k0("1", "2", "3"), p70.k0("4", "5", "6"), p70.k0("7", "8", "9")).iterator();
                while (it.hasNext()) {
                    List<String> list = (List) it.next();
                    l13 e = nq4.e(i13Var, 1.0f);
                    Iterator it2 = it;
                    u74 a2 = t74.a(new kp(f, true, new y9()), uvVar, go1Var4, i3);
                    sg sgVar5 = sgVar2;
                    long j4 = go1Var4.T;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    am3 m4 = go1Var4.m();
                    l13 x04 = i42.x0(go1Var4, e);
                    xd0.c.getClass();
                    go1Var4.h0();
                    if (go1Var4.S) {
                        go1Var4.l(rm1Var);
                    } else {
                        go1Var4.r0();
                    }
                    qi4.k(go1Var4, sgVar4, a2);
                    qi4.k(go1Var4, sgVar3, m4);
                    qi4.k(go1Var4, sgVar5, Integer.valueOf(i5));
                    qi4.j(go1Var4);
                    qi4.k(go1Var4, sgVar, x04);
                    go1Var4.d0(-22409115);
                    for (String str4 : list) {
                        boolean g2 = go1Var4.g(str4);
                        Object Q3 = go1Var4.Q();
                        if (g2 || Q3 == obj3) {
                            t43Var2 = t43Var7;
                            Q3 = new jt2((Object) str4, (Object) t43Var2, (byte) 10);
                            go1Var4.o0(Q3);
                        } else {
                            t43Var2 = t43Var7;
                        }
                        hy3.a(str4, (rm1) Q3, new sc2(1.0f, true), false, j42.c(str4, "1") ? ki1Var2 : null, go1Var4, 0, 8);
                        t43Var7 = t43Var2;
                    }
                    go1Var4.q(false);
                    go1Var4.q(true);
                    f = 12.0f;
                    i3 = 6;
                    it = it2;
                    sgVar2 = sgVar5;
                }
                sg sgVar6 = sgVar2;
                t43 t43Var8 = t43Var7;
                go1Var4.q(false);
                l13 e2 = nq4.e(i13Var, 1.0f);
                u74 a3 = t74.a(new kp(12.0f, true, new y9()), uvVar, go1Var4, 6);
                long j5 = go1Var4.T;
                int i6 = (int) (j5 ^ (j5 >>> 32));
                am3 m5 = go1Var4.m();
                l13 x05 = i42.x0(go1Var4, e2);
                xd0.c.getClass();
                go1Var4.h0();
                if (go1Var4.S) {
                    go1Var4.l(rm1Var);
                } else {
                    go1Var4.r0();
                }
                qi4.k(go1Var4, sgVar4, a3);
                qi4.k(go1Var4, sgVar3, m5);
                qi4.k(go1Var4, sgVar6, Integer.valueOf(i6));
                qi4.j(go1Var4);
                qi4.k(go1Var4, sgVar, x05);
                Object Q4 = go1Var4.Q();
                if (Q4 == obj3) {
                    Q4 = new sf(t43Var8, (byte) 26);
                    go1Var4.o0(Q4);
                }
                hy3.a("删除", (rm1) Q4, nt3.x(i13Var, 1.0f), false, null, go1Var4, 54, 24);
                Object Q5 = go1Var4.Q();
                if (Q5 == obj3) {
                    Q5 = new sf(t43Var8, (byte) 27);
                    go1Var4.o0(Q5);
                }
                hy3.a("0", (rm1) Q5, nt3.x(i13Var, 1.0f), false, null, go1Var4, 54, 24);
                boolean z = ((String) t43Var8.getValue()).length() >= 6;
                l13 x = nt3.x(i13Var, 1.0f);
                boolean i7 = go1Var4.i(obj9);
                Object Q6 = go1Var4.Q();
                if (i7 || Q6 == obj3) {
                    t43Var = t43Var6;
                    Q6 = new yj(obj9, (Object) t43Var8, (Object) t43Var, (byte) 12);
                    go1Var4.o0(Q6);
                } else {
                    t43Var = t43Var6;
                }
                hy3.a("确定", (rm1) Q6, x, z, null, go1Var4, 6, 16);
                go1Var4.q(true);
                l13 e3 = nq4.e(i13Var, 1.0f);
                boolean i8 = go1Var4.i(obj9);
                Object Q7 = go1Var4.Q();
                if (i8 || Q7 == obj3) {
                    Q7 = new jt2(obj9, (Object) t43Var, (byte) 11);
                    go1Var4.o0(Q7);
                }
                hy3.c(3462, 16, go1Var4, (rm1) Q7, e3, "取消", false);
                go1Var4.q(true);
                return wd5Var;
            case 6:
                ((Integer) obj2).getClass();
                qe4.h((String) obj7, (tm1) obj6, (rm1) obj8, (tm1) obj5, (rm1) obj4, (fe0) obj, mu0.X(3073));
                return wd5Var;
            case 7:
                ((Integer) obj2).getClass();
                qe4.i((String) obj7, (tm1) obj6, (rm1) obj8, (l13) obj5, (ki1) obj4, (fe0) obj, mu0.X(27649));
                return wd5Var;
            case 8:
                ((Integer) obj2).getClass();
                qm4.i((bl4) obj6, (String) obj7, (rm1) obj8, (rm1) obj5, (l13) obj4, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 9:
                ((Integer) obj2).getClass();
                qm4.b((dl4) obj6, (rm1) obj8, (rm1) obj7, (rm1) obj5, (rm1) obj4, (fe0) obj, mu0.X(433));
                return wd5Var;
            default:
                WidgetCover$lambda$0 = WidgetUiKt.WidgetCover$lambda$0((Bitmap) obj8, (String) obj7, (WidgetPalette) obj6, (String) obj5, (String) obj4, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetCover$lambda$0;
        }
    }

    public /* synthetic */ in2(l13 l13Var, t43 t43Var, tc0 tc0Var, bv bvVar, rm1 rm1Var) {
        this.I = (byte) 4;
        this.L = l13Var;
        this.K = t43Var;
        this.M = tc0Var;
        this.N = bvVar;
        this.J = rm1Var;
    }

    public /* synthetic */ in2(l13 l13Var, dn4 dn4Var, u10 u10Var, w10 w10Var, tc0 tc0Var, int i) {
        this.I = (byte) 1;
        this.J = l13Var;
        this.K = dn4Var;
        this.L = u10Var;
        this.M = w10Var;
        this.N = tc0Var;
    }

    public /* synthetic */ in2(k80 k80Var, ez3 ez3Var, t43 t43Var, ki1 ki1Var, t43 t43Var2) {
        this.I = (byte) 5;
        this.J = k80Var;
        this.L = ez3Var;
        this.K = t43Var;
        this.N = ki1Var;
        this.M = t43Var2;
    }

    public /* synthetic */ in2(dl4 dl4Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, int i) {
        this.I = (byte) 9;
        this.K = dl4Var;
        this.J = rm1Var;
        this.L = rm1Var2;
        this.M = rm1Var3;
        this.N = rm1Var4;
    }

    public /* synthetic */ in2(Bitmap bitmap, String str, WidgetPalette widgetPalette, String str2, String str3) {
        this.I = (byte) 10;
        this.J = bitmap;
        this.L = str;
        this.K = widgetPalette;
        this.M = str2;
        this.N = str3;
    }

    public /* synthetic */ in2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
        this.N = obj5;
    }

    public /* synthetic */ in2(String str, tm1 tm1Var, rm1 rm1Var, Object obj, Object obj2, int i, byte b) {
        this.I = b;
        this.L = str;
        this.K = tm1Var;
        this.J = rm1Var;
        this.M = obj;
        this.N = obj2;
    }
}
