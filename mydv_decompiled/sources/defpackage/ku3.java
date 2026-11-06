package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.NowPlayingWidget;
import com.github.mytv.dv.widget.WidgetLiveItem;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku3 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ku3(k80 k80Var, ki1 ki1Var, dl0 dl0Var, Context context) {
        this.I = (byte) 1;
        this.J = k80Var;
        this.K = ki1Var;
        this.L = dl0Var;
        this.M = context;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        dl4 dl4Var;
        long j;
        boolean z2;
        boolean z3;
        wd5 LaterExpanded$lambda$0$0;
        wd5 LiveExpanded$lambda$0$2$0;
        wd5 ContinueLarge$lambda$0$0;
        wd5 provideGlance$lambda$2$0$0;
        byte b = this.I;
        fj0 fj0Var = null;
        df0 df0Var = wa2.A0;
        byte b2 = 4;
        l13 l13Var = i13.a;
        jp jpVar = de0.a;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.M;
        Object obj5 = this.J;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (b) {
            case 0:
                String str2 = (String) obj7;
                k80 k80Var = (k80) obj5;
                dl4 dl4Var2 = (dl4) obj4;
                String str3 = (String) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).h(booleanValue) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 19) != 18)) {
                    go1Var.W();
                    return wd5Var;
                }
                l13 k = nq4.k(l13Var, 96.0f);
                uw2 c = px.c(q8.J, false);
                long j2 = go1Var.T;
                int i = (int) (j2 ^ (j2 >>> 32));
                am3 m = go1Var.m();
                l13 x0 = i42.x0(go1Var, k);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                sg sgVar = q8.c0;
                qi4.k(go1Var, sgVar, c);
                sg sgVar2 = q8.b0;
                qi4.k(go1Var, sgVar2, m);
                Integer valueOf = Integer.valueOf(i);
                sg sgVar3 = q8.d0;
                qi4.k(go1Var, sgVar3, valueOf);
                qi4.j(go1Var);
                sg sgVar4 = q8.a0;
                qi4.k(go1Var, sgVar4, x0);
                ne1 ne1Var = nq4.c;
                jp jpVar2 = dw2.a;
                l13 m2 = o7.m(ne1Var, rt0.L(jp.k(), go1Var));
                if (booleanValue) {
                    str = str2;
                    z = booleanValue;
                    dl4Var = dl4Var2;
                    j = x70.c(k80Var.v, 0.16f);
                } else {
                    str = str2;
                    z = booleanValue;
                    dl4Var = dl4Var2;
                    j = k80Var.H;
                }
                aj5 aj5Var = mw2.j;
                l13 p = mw2.p(m2, j, aj5Var);
                vv vvVar = q8.N;
                int i2 = intValue;
                uw2 c2 = px.c(vvVar, false);
                long j3 = go1Var.T;
                int i3 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var.m();
                l13 x02 = i42.x0(go1Var, p);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c2);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(i3, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x02);
                ow1.a(rt0.C(), null, nq4.k(l13Var, 48.0f), z ? k80Var.v : k80Var.s, go1Var, 432);
                if (str3 == null || jx4.L(str3)) {
                    go1Var.d0(-115591897);
                    go1Var.q(false);
                } else {
                    go1Var.d0(-115871145);
                    SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str3, go1Var), null, ne1Var, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                    go1Var.q(false);
                }
                go1Var.q(true);
                if (dl4Var.b()) {
                    go1Var.d0(1050537218);
                    l13 p2 = mw2.p(o7.m(nq4.k(eu5.V(ux.a.align(l13Var, q8.R), 2.0f, 2.0f), 30.0f), l74.a), k80Var.j, aj5Var);
                    uw2 c3 = px.c(vvVar, false);
                    long j4 = go1Var.T;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    am3 m4 = go1Var.m();
                    l13 x03 = i42.x0(go1Var, p2);
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar, c3);
                    qi4.k(go1Var, sgVar2, m4);
                    r7.G(i4, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar4, x03);
                    ow1.a(dq2.Q(), "已锁定", nq4.k(l13Var, 16.0f), k80Var.k, go1Var, 432);
                    z2 = true;
                    go1Var.q(true);
                    z3 = false;
                    go1Var.q(false);
                } else {
                    z2 = true;
                    z3 = false;
                    go1Var.d0(1051193581);
                    go1Var.q(false);
                }
                go1Var.q(z2);
                j16.h(str, z, z3, go1Var, ((i2 << 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK);
                return wd5Var;
            case 1:
                k80 k80Var2 = (k80) obj5;
                ki1 ki1Var = (ki1) obj7;
                dl0 dl0Var = (dl0) obj6;
                Context context = (Context) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Object Q = go1Var2.Q();
                    if (Q == jpVar) {
                        Q = ad4.w(Boolean.FALSE);
                        go1Var2.o0(Q);
                    }
                    t43 t43Var = (t43) Q;
                    Object Q2 = go1Var2.Q();
                    if (Q2 == jpVar) {
                        Q2 = r7.v(go1Var2);
                    }
                    t33 t33Var = (t33) Q2;
                    cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var2.c, k80Var2.u, ((Boolean) ut0.w(t33Var, go1Var2).getValue()).booleanValue(), "update_btn_bg", go1Var2, 24576, 0);
                    cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var2.d, k80Var2.v, "update_btn_fg", go1Var2, 3072);
                    i13 i13Var = i13.a;
                    l13 g = nq4.g(nq4.e(i13Var, 1.0f), 48.0f);
                    Object Q3 = go1Var2.Q();
                    if (Q3 == jpVar) {
                        Q3 = new gm4(t43Var, (byte) 1);
                        go1Var2.o0(Q3);
                    }
                    l13 v = qm4.v(go1Var2, j42.x(i42.A0(g, (tm1) Q3), ki1Var));
                    Object Q4 = go1Var2.Q();
                    if (Q4 == jpVar) {
                        Q4 = new ol4((byte) 12);
                        go1Var2.o0(Q4);
                    }
                    l13 u = r7.u(12.0f, qg5.R(v, (tm1) Q4), t0);
                    boolean i5 = go1Var2.i(dl0Var) | go1Var2.i(context);
                    Object Q5 = go1Var2.Q();
                    if (i5 || Q5 == jpVar) {
                        Q5 = new jt2((Object) dl0Var, (Object) context, (byte) 23);
                        go1Var2.o0(Q5);
                    }
                    l13 B = mw2.B(r13.d(u, null, null, null, null, (rm1) Q5, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1);
                    uw2 c4 = px.c(q8.J, false);
                    long j5 = go1Var2.T;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    am3 m5 = go1Var2.m();
                    l13 x04 = i42.x0(go1Var2, B);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    sg sgVar5 = q8.c0;
                    qi4.k(go1Var2, sgVar5, c4);
                    sg sgVar6 = q8.b0;
                    qi4.k(go1Var2, sgVar6, m5);
                    Integer valueOf2 = Integer.valueOf(i6);
                    sg sgVar7 = q8.d0;
                    qi4.k(go1Var2, sgVar7, valueOf2);
                    qi4.j(go1Var2);
                    sg sgVar8 = q8.a0;
                    qi4.k(go1Var2, sgVar8, x04);
                    ne1 ne1Var2 = nq4.c;
                    u74 a = t74.a(i42.e, q8.T, go1Var2, 54);
                    long j6 = go1Var2.T;
                    int i7 = (int) (j6 ^ (j6 >>> 32));
                    am3 m6 = go1Var2.m();
                    l13 x05 = i42.x0(go1Var2, ne1Var2);
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, sgVar5, a);
                    qi4.k(go1Var2, sgVar6, m6);
                    r7.G(i7, go1Var2, sgVar7, go1Var2);
                    qi4.k(go1Var2, sgVar8, x05);
                    hx1 hx1Var = fb4.a;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.SystemUpdate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep p3 = hf1.p(17.0f, 1.01f, 7.0f, 1.0f);
                        p3.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        p3.M(18.0f);
                        p3.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        p3.v(10.0f);
                        p3.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        p3.x(19.0f, 3.0f);
                        p3.r(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                        p3.p();
                        p3.z(17.0f, 19.0f);
                        p3.x(7.0f, 19.0f);
                        p3.x(7.0f, 5.0f);
                        p3.v(10.0f);
                        p3.M(14.0f);
                        p3.p();
                        p3.z(16.0f, 13.0f);
                        p3.v(-3.0f);
                        p3.x(13.0f, 8.0f);
                        p3.v(-2.0f);
                        p3.M(5.0f);
                        p3.x(8.0f, 13.0f);
                        p3.y(4.0f, 4.0f);
                        p3.y(4.0f, -4.0f);
                        p3.p();
                        gx1.a(gx1Var, (ArrayList) p3.J, rt4Var);
                        hx1Var = gx1Var.b();
                        fb4.a = hx1Var;
                    }
                    ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 20.0f), s0, k80Var2.d, false, null, 12), k80Var2.d, go1Var2, 48);
                    oh4.a(go1Var2, nq4.n(i13Var, 12.0f));
                    long j7 = k80Var2.d;
                    r55.b("检查更新", p70.G(i13Var, s0, j7, false, null, 12), j7, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, 1572870, 0, 262072);
                    go1Var2.q(true);
                    go1Var2.q(true);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                hn1 hn1Var = (hn1) obj7;
                yi0 yi0Var = (yi0) obj6;
                in1 in1Var = (in1) obj5;
                rm1 rm1Var = (rm1) obj4;
                xi0 xi0Var = (xi0) obj;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((go1) fe0Var3).g(xi0Var) ? 4 : 2;
                }
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String str4 = (String) hn1Var.invoke(go1Var3, 0);
                    if (jx4.L(str4)) {
                        t02.c("Label must not be blank");
                    }
                    yi0Var.getClass();
                    eu5.g.d(str4, Boolean.TRUE, xi0Var, in1Var, rm1Var, go1Var3, Integer.valueOf((intValue3 << 9) & 7168));
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            case 3:
                LaterExpanded$lambda$0$0 = DesktopWidgetsKt.LaterExpanded$lambda$0$0((List) obj7, (List) obj6, (WidgetPalette) obj5, (List) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return LaterExpanded$lambda$0$0;
            case 4:
                LiveExpanded$lambda$0$2$0 = DesktopWidgetsKt.LiveExpanded$lambda$0$2$0((List) obj7, (List) obj6, (WidgetLiveItem) obj5, (WidgetPalette) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return LiveExpanded$lambda$0$2$0;
            case 5:
                ContinueLarge$lambda$0$0 = DesktopWidgetsKt.ContinueLarge$lambda$0$0((WidgetVideo) obj7, (List) obj6, (Bitmap) obj5, (List) obj4, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return ContinueLarge$lambda$0$0;
            case 6:
                LiveRoom liveRoom = (LiveRoom) obj7;
                tm1 tm1Var = (tm1) obj6;
                t43 t43Var2 = (t43) obj5;
                t43 t43Var3 = (t43) obj4;
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    uj3 uj3Var = (uj3) t43Var2.getValue();
                    int intValue5 = uj3Var != null ? ((Number) uj3Var.I).intValue() : 0;
                    uj3 uj3Var2 = (uj3) t43Var2.getValue();
                    un2.a(liveRoom, intValue5, uj3Var2 != null ? ((Number) uj3Var2.J).intValue() : 0, (String) t43Var3.getValue(), tm1Var, go1Var4, LiveRoom.$stable);
                } else {
                    go1Var4.W();
                }
                return wd5Var;
            case 7:
                List list = (List) obj7;
                wm4 wm4Var = (wm4) obj6;
                ki1 ki1Var2 = (ki1) obj5;
                cw4 cw4Var = (cw4) obj4;
                fe0 fe0Var5 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var5 = (go1) fe0Var5;
                if (go1Var5.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ba0 a2 = z90.a(i42.d, q8.V, go1Var5, 0);
                    long j8 = go1Var5.T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    am3 m7 = go1Var5.m();
                    l13 x06 = i42.x0(go1Var5, l13Var);
                    xd0.c.getClass();
                    go1Var5.h0();
                    if (go1Var5.S) {
                        go1Var5.l(df0Var);
                    } else {
                        go1Var5.r0();
                    }
                    qi4.k(go1Var5, q8.c0, a2);
                    qi4.k(go1Var5, q8.b0, m7);
                    qi4.k(go1Var5, q8.d0, Integer.valueOf(i9));
                    qi4.j(go1Var5);
                    qi4.k(go1Var5, q8.a0, x06);
                    byte b3 = 6;
                    lq2.e(0.0f, "画质", 6, go1Var5, 2);
                    lq5 lq5Var = (lq5) cw4Var.getValue();
                    Object Q6 = go1Var5.Q();
                    if (Q6 == jpVar) {
                        Q6 = new zw1((byte) 13);
                        go1Var5.o0(Q6);
                    }
                    hn1 hn1Var2 = (hn1) Q6;
                    boolean i10 = go1Var5.i(wm4Var);
                    Object Q7 = go1Var5.Q();
                    if (i10 || Q7 == jpVar) {
                        Q7 = new tf2(wm4Var, b3);
                        go1Var5.o0(Q7);
                    }
                    lq2.g(list, lq5Var, hn1Var2, (tm1) Q7, null, ki1Var2, 0.0f, false, null, go1Var5, 196992, 464);
                    go1Var5.q(true);
                } else {
                    go1Var5.W();
                }
                return wd5Var;
            case 8:
                provideGlance$lambda$2$0$0 = NowPlayingWidget.provideGlance$lambda$2$0$0((fl4) obj7, (WidgetPlayback) obj6, (Bitmap) obj5, (Bitmap) obj4, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return provideGlance$lambda$2$0$0;
            case 9:
                cw4 cw4Var2 = (cw4) obj7;
                cw4 cw4Var3 = (cw4) obj6;
                hu2 hu2Var = (hu2) obj5;
                cw4 cw4Var4 = (cw4) obj4;
                fe0 fe0Var6 = (fe0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var6;
                if (go1Var6.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    p70.d(((Boolean) cw4Var2.getValue()).booleanValue() || ((Boolean) cw4Var3.getValue()).booleanValue(), null, ma1.d().a(ma1.e(null, 3)), ma1.h().a(ma1.f(null, 3)), null, p70.u0(-319498873, new ie4(hu2Var, cw4Var4, b2), go1Var6), go1Var6, 1600512);
                } else {
                    go1Var6.W();
                }
                return wd5Var;
            default:
                rt4 rt4Var2 = (rt4) obj7;
                oh2 oh2Var = (oh2) obj6;
                d55 d55Var = (d55) obj5;
                long j9 = d55Var.b;
                td3 td3Var = (td3) obj4;
                l13 l13Var2 = (l13) obj;
                ((Integer) obj3).getClass();
                go1 go1Var7 = (go1) ((fe0) obj2);
                go1Var7.d0(-84507373);
                boolean booleanValue2 = ((Boolean) go1Var7.k(hf0.y)).booleanValue();
                boolean h = go1Var7.h(booleanValue2);
                Object Q8 = go1Var7.Q();
                if (h || Q8 == jpVar) {
                    Q8 = new pm0(booleanValue2);
                    go1Var7.o0(Q8);
                }
                pm0 pm0Var = (pm0) Q8;
                boolean z4 = rt4Var2.a != 16;
                if (((fh2) ((ru5) go1Var7.k(hf0.u))).a() && oh2Var.b() && d65.c(j9) && z4) {
                    go1Var7.d0(-707487962);
                    oj ojVar = d55Var.a;
                    d65 d65Var = new d65(j9);
                    boolean i11 = go1Var7.i(pm0Var);
                    Object Q9 = go1Var7.Q();
                    if (i11 || Q9 == jpVar) {
                        Q9 = new h40((Object) pm0Var, fj0Var, (byte) 22);
                        go1Var7.o0(Q9);
                    }
                    mw2.i(ojVar, d65Var, (hn1) Q9, go1Var7);
                    boolean i12 = go1Var7.i(pm0Var) | go1Var7.i(td3Var) | go1Var7.g(d55Var) | go1Var7.i(oh2Var) | go1Var7.g(rt4Var2);
                    Object Q10 = go1Var7.Q();
                    if (i12 || Q10 == jpVar) {
                        Q10 = new v7(pm0Var, td3Var, d55Var, oh2Var, rt4Var2, (byte) 8);
                        go1Var7.o0(Q10);
                    }
                    l13Var = j42.v(l13Var2, (tm1) Q10);
                    go1Var7.q(false);
                } else {
                    go1Var7.d0(-705473241);
                    go1Var7.q(false);
                }
                go1Var7.q(false);
                return l13Var;
        }
    }

    public /* synthetic */ ku3(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.J = obj3;
        this.M = obj4;
    }

    public /* synthetic */ ku3(String str, k80 k80Var, dl4 dl4Var, String str2) {
        this.I = (byte) 0;
        this.K = str;
        this.J = k80Var;
        this.M = dl4Var;
        this.L = str2;
    }
}
