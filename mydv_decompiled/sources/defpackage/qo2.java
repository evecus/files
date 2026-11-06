package defpackage;

import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.widget.LiveSnapshot;
import com.github.mytv.dv.widget.LiveWidget;
import com.github.mytv.dv.widget.SearchSnapshot;
import com.github.mytv.dv.widget.SearchWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qo2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ qo2(fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2) {
        this.I = (byte) 2;
        this.L = fl4Var;
        this.K = z;
        this.J = liveSnapshot;
        this.M = list;
        this.N = list2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$1$0;
        wd5 provideGlance$lambda$0;
        byte b = this.I;
        boolean z = this.K;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.J;
        Object obj6 = this.L;
        switch (b) {
            case 0:
                hu2 hu2Var = (hu2) obj6;
                t43 t43Var = (t43) obj5;
                t43 t43Var2 = (t43) obj4;
                t43 t43Var3 = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    op2 op2Var = hu2Var.n;
                    wm4 wm4Var = hu2Var.h;
                    boolean i = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (i || Q == jpVar) {
                        Q = new ao(hu2Var, (byte) 5);
                        go1Var.o0(Q);
                    }
                    rm1 rm1Var = (rm1) Q;
                    boolean g = go1Var.g(t43Var) | go1Var.i(hu2Var);
                    Object Q2 = go1Var.Q();
                    if (g || Q2 == jpVar) {
                        Q2 = new oo2(t43Var, hu2Var);
                        go1Var.o0(Q2);
                    }
                    rm1 rm1Var2 = (rm1) Q2;
                    ne1 ne1Var = nq4.c;
                    boolean z2 = (((Boolean) t43Var2.getValue()).booleanValue() || z) ? false : true;
                    Object Q3 = go1Var.Q();
                    if (Q3 == jpVar) {
                        Q3 = new uf(t43Var3, (byte) 24);
                        go1Var.o0(Q3);
                    }
                    j16.b(op2Var, wm4Var, rm1Var, rm1Var2, ne1Var, z2, (tm1) Q3, go1Var, 1597512);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                hv4 hv4Var = (hv4) obj6;
                l13 l13Var = (l13) obj4;
                cw4 cw4Var = (cw4) obj3;
                t43 t43Var4 = (t43) obj5;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    List list = (List) cw4Var.getValue();
                    float opacity = ((LiveDanmakuSettings) t43Var4.getValue()).getOpacity();
                    float fontSize = ((LiveDanmakuSettings) t43Var4.getValue()).getFontSize();
                    if (!z) {
                        hv4Var = null;
                    }
                    wx5.a(list, opacity, fontSize, hv4Var, l13Var, go1Var2, 0);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                provideGlance$lambda$1$0 = LiveWidget.provideGlance$lambda$1$0((fl4) obj6, this.K, (LiveSnapshot) obj5, (List) obj4, (List) obj3, (fe0) obj, ((Integer) obj2).intValue());
                return provideGlance$lambda$1$0;
            case 3:
                provideGlance$lambda$0 = SearchWidget.provideGlance$lambda$0((WidgetPalette) obj6, (fl4) obj5, this.K, (SearchSnapshot) obj4, (List) obj3, (fe0) obj, ((Integer) obj2).intValue());
                return provideGlance$lambda$0;
            default:
                ((Integer) obj2).getClass();
                qm4.d((String) obj6, this.K, (rm1) obj5, (tm1) obj4, (rm1) obj3, (fe0) obj, mu0.X(385));
                return wd5Var;
        }
    }

    public /* synthetic */ qo2(hv4 hv4Var, l13 l13Var, t43 t43Var, t43 t43Var2, boolean z) {
        this.I = (byte) 1;
        this.L = hv4Var;
        this.M = l13Var;
        this.N = t43Var;
        this.J = t43Var2;
        this.K = z;
    }

    public /* synthetic */ qo2(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.L = obj;
        this.J = obj2;
        this.K = z;
        this.M = obj3;
        this.N = obj4;
    }

    public /* synthetic */ qo2(String str, boolean z, rm1 rm1Var, tm1 tm1Var, rm1 rm1Var2, int i) {
        this.I = (byte) 4;
        this.L = str;
        this.K = z;
        this.J = rm1Var;
        this.M = tm1Var;
        this.N = rm1Var2;
    }
}
