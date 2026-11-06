package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.LiveSnapshot;
import com.github.mytv.dv.widget.LiveWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetPlayback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qv0 implements in1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ qv0(hu2 hu2Var, bw0 bw0Var, boolean z, String str, cw4 cw4Var) {
        this.K = hu2Var;
        this.L = bw0Var;
        this.J = z;
        this.M = str;
        this.N = cw4Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 NowPlayingContent$lambda$0;
        wd5 provideGlance$lambda$1$0$0;
        byte b = this.I;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (b) {
            case 0:
                NowPlayingContent$lambda$0 = DesktopWidgetsKt.NowPlayingContent$lambda$0(this.J, (Bitmap) obj7, (WidgetPlayback) obj6, (WidgetPalette) obj5, (Context) obj4, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingContent$lambda$0;
            case 1:
                provideGlance$lambda$1$0$0 = LiveWidget.provideGlance$lambda$1$0$0((fl4) obj7, this.J, (LiveSnapshot) obj6, (List) obj5, (List) obj4, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return provideGlance$lambda$1$0$0;
            default:
                hu2 hu2Var = (hu2) obj7;
                bw0 bw0Var = (bw0) obj6;
                String str = (String) obj5;
                cw4 cw4Var = (cw4) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    hx1 hx1Var = g4.f;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.Contrast", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep r = r7.r(12.0f, 22.0f);
                        r.r(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
                        r.C(17.52f, 2.0f, 12.0f, 2.0f);
                        r.C(2.0f, 6.48f, 2.0f, 12.0f);
                        r.C(6.48f, 22.0f, 12.0f, 22.0f);
                        r.p();
                        r.z(13.0f, 4.07f);
                        r.r(3.94f, 0.49f, 7.0f, 3.85f, 7.0f, 7.93f);
                        r.D(-3.05f, 7.44f, -7.0f, 7.93f);
                        r.L(4.07f);
                        r.p();
                        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
                        hx1Var = gx1Var.b();
                        g4.f = hx1Var;
                    }
                    hx1 hx1Var2 = hx1Var;
                    Enum[] enumArr = (Enum[]) z70.O.toArray(new z70[0]);
                    z70 z70Var = (z70) cw4Var.getValue();
                    boolean i2 = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (i2 || Q == jpVar) {
                        Q = new fm4(hu2Var, (byte) 4);
                        go1Var.o0(Q);
                    }
                    tm1 tm1Var = (tm1) Q;
                    boolean g = go1Var.g(bw0Var);
                    Object Q2 = go1Var.Q();
                    if (g || Q2 == jpVar) {
                        Q2 = new im4(bw0Var, (byte) 0);
                        go1Var.o0(Q2);
                    }
                    qm4.j("对比度", hx1Var2, enumArr, z70Var, tm1Var, (tm1) Q2, null, this.J, str, go1Var, 6, 64);
                } else {
                    go1Var.W();
                }
                return wd5.a;
        }
    }

    public /* synthetic */ qv0(fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2) {
        this.K = fl4Var;
        this.J = z;
        this.L = liveSnapshot;
        this.M = list;
        this.N = list2;
    }

    public /* synthetic */ qv0(boolean z, Bitmap bitmap, WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, Context context) {
        this.J = z;
        this.K = bitmap;
        this.L = widgetPlayback;
        this.M = widgetPalette;
        this.N = context;
    }
}
