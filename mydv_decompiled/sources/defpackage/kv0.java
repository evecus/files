package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.SearchSnapshot;
import com.github.mytv.dv.widget.SearchWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetUiKt;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ kv0(hx1 hx1Var, k80 k80Var, boolean z, String str) {
        this.I = (byte) 3;
        this.K = hx1Var;
        this.L = k80Var;
        this.J = z;
        this.M = str;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 NowPlayingContent$lambda$0$0;
        wd5 provideGlance$lambda$0$0$0;
        wd5 WidgetMeta$lambda$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = 6;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        switch (b) {
            case 0:
                NowPlayingContent$lambda$0$0 = DesktopWidgetsKt.NowPlayingContent$lambda$0$0((Bitmap) obj6, this.J, (WidgetPlayback) obj5, (WidgetPalette) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingContent$lambda$0$0;
            case 1:
                provideGlance$lambda$0$0$0 = SearchWidget.provideGlance$lambda$0$0$0((fl4) obj6, this.J, (SearchSnapshot) obj5, (List) obj4, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return provideGlance$lambda$0$0$0;
            case 2:
                hu2 hu2Var = (hu2) obj6;
                String str = (String) obj5;
                cw4 cw4Var = (cw4) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    hx1 hx1Var = eg5.e;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.Style", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep epVar = new ep((byte) 13);
                        epVar.z(2.53f, 19.65f);
                        epVar.y(1.34f, 0.56f);
                        epVar.M(-9.03f);
                        epVar.y(-2.43f, 5.86f);
                        epVar.r(-0.41f, 1.02f, 0.08f, 2.19f, 1.09f, 2.61f);
                        epVar.p();
                        epVar.z(22.03f, 15.95f);
                        epVar.x(17.07f, 3.98f);
                        epVar.r(-0.31f, -0.75f, -1.04f, -1.21f, -1.81f, -1.23f);
                        epVar.r(-0.26f, 0.0f, -0.53f, 0.04f, -0.79f, 0.15f);
                        epVar.x(7.1f, 5.95f);
                        epVar.r(-0.75f, 0.31f, -1.21f, 1.03f, -1.23f, 1.8f);
                        epVar.r(-0.01f, 0.27f, 0.04f, 0.54f, 0.15f, 0.8f);
                        epVar.y(4.96f, 11.97f);
                        epVar.r(0.31f, 0.76f, 1.05f, 1.22f, 1.83f, 1.23f);
                        epVar.r(0.26f, 0.0f, 0.52f, -0.05f, 0.77f, -0.15f);
                        epVar.y(7.36f, -3.05f);
                        epVar.r(1.02f, -0.42f, 1.51f, -1.59f, 1.09f, -2.6f);
                        epVar.p();
                        epVar.z(7.88f, 8.75f);
                        epVar.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        epVar.D(0.45f, -1.0f, 1.0f, -1.0f);
                        epVar.D(1.0f, 0.45f, 1.0f, 1.0f);
                        epVar.D(-0.45f, 1.0f, -1.0f, 1.0f);
                        epVar.p();
                        epVar.z(5.88f, 19.75f);
                        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        epVar.v(1.45f);
                        epVar.y(-3.45f, -8.34f);
                        epVar.M(6.34f);
                        epVar.p();
                        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                        hx1Var = gx1Var.b();
                        eg5.e = hx1Var;
                    }
                    hx1 hx1Var2 = hx1Var;
                    Enum[] enumArr = (Enum[]) s90.M.toArray(new s90[0]);
                    s90 s90Var = (s90) cw4Var.getValue();
                    boolean i2 = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (i2 || Q == jpVar) {
                        Q = new ll4(hu2Var, b2);
                        go1Var.o0(Q);
                    }
                    tm1 tm1Var = (tm1) Q;
                    Object Q2 = go1Var.Q();
                    if (Q2 == jpVar) {
                        Q2 = new yv3((byte) 28);
                        go1Var.o0(Q2);
                    }
                    qm4.j("配色风格", hx1Var2, enumArr, s90Var, tm1Var, (tm1) Q2, null, this.J, str, go1Var, 196614, 64);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 3:
                hx1 hx1Var3 = (hx1) obj6;
                k80 k80Var = (k80) obj5;
                String str2 = (String) obj4;
                w74 w74Var = (w74) obj;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                w74Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((go1) fe0Var2).g(w74Var) ? 4 : 2;
                }
                int i3 = intValue2;
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(i3 & 1, (i3 & 19) != 18)) {
                    p70.n(hx1Var3, false, false, k80Var.M, k80Var.K, go1Var2, 0, 6);
                    ta1 e = ma1.e(qb.k0(180, 6, null), 2);
                    ve1 k0 = qb.k0(260, 6, null);
                    tv tvVar = q8.X;
                    tv tvVar2 = q8.V;
                    if ((12 & 1) != 0) {
                        Map map = js5.a;
                        k0 = qb.g0(0.0f, 400.0f, new z22(4294967297L), 1);
                    }
                    tv tvVar3 = (12 & 2) != 0 ? tvVar : tvVar2;
                    ta1 a = e.a(ma1.c(k0, j42.c(tvVar3, tvVar2) ? q8.M : j42.c(tvVar3, tvVar) ? q8.O : q8.N, new fh((byte) 10)));
                    bc1 f = ma1.f(qb.k0(120, 6, null), 2);
                    ve1 k02 = qb.k0(180, 6, null);
                    tv tvVar4 = q8.X;
                    tv tvVar5 = q8.V;
                    if ((12 & 1) != 0) {
                        Map map2 = js5.a;
                        k02 = qb.g0(0.0f, 400.0f, new z22(4294967297L), 1);
                    }
                    byte b3 = 12;
                    tv tvVar6 = (2 & 12) != 0 ? tvVar4 : tvVar5;
                    p70.c(w74Var, this.J, null, a, f.a(ma1.g(k02, j42.c(tvVar6, tvVar5) ? q8.M : j42.c(tvVar6, tvVar4) ? q8.O : q8.N, new fh(b3))), null, p70.u0(-932550175, new n03(str2, k80Var), go1Var2), go1Var2, (i3 & 14) | 1572864);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            default:
                WidgetMeta$lambda$0 = WidgetUiKt.WidgetMeta$lambda$0((Bitmap) obj6, this.J, (WidgetVideo) obj5, (WidgetPalette) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return WidgetMeta$lambda$0;
        }
    }

    public /* synthetic */ kv0(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.K = obj;
        this.J = z;
        this.L = obj2;
        this.M = obj3;
    }
}
