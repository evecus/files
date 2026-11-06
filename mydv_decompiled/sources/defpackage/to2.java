package defpackage;

import com.github.mytv.dv.widget.LiveSnapshot;
import com.github.mytv.dv.widget.LiveWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class to2 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ to2(x70 x70Var, hu2 hu2Var, t43 t43Var, boolean z, t43 t43Var2, t43 t43Var3) {
        this.K = x70Var;
        this.L = hu2Var;
        this.M = t43Var;
        this.J = z;
        this.N = t43Var2;
        this.O = t43Var3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$1;
        byte b = this.I;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (b) {
            case 0:
                x70 x70Var = (x70) obj7;
                hu2 hu2Var = (hu2) obj6;
                t43 t43Var = (t43) obj5;
                t43 t43Var2 = (t43) obj4;
                t43 t43Var3 = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xh0.a(x70Var, ma4.M, p70.u0(-2102407739, new qo2((Object) hu2Var, (Object) t43Var, this.J, (Object) t43Var2, (Object) t43Var3, (byte) 0), go1Var), go1Var, 432);
                } else {
                    go1Var.W();
                }
                return wd5.a;
            default:
                provideGlance$lambda$1 = LiveWidget.provideGlance$lambda$1((WidgetPalette) obj7, (fl4) obj6, this.J, (LiveSnapshot) obj5, (List) obj4, (List) obj3, (fe0) obj, ((Integer) obj2).intValue());
                return provideGlance$lambda$1;
        }
    }

    public /* synthetic */ to2(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2) {
        this.K = widgetPalette;
        this.L = fl4Var;
        this.J = z;
        this.M = liveSnapshot;
        this.N = list;
        this.O = list2;
    }
}
