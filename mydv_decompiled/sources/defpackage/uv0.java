package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetMixItem;
import com.github.mytv.dv.widget.WidgetPalette;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetMixItem J;
    public final /* synthetic */ WidgetPalette K;

    public /* synthetic */ uv0(WidgetMixItem widgetMixItem, WidgetPalette widgetPalette, byte b) {
        this.I = b;
        this.J = widgetMixItem;
        this.K = widgetPalette;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 MixCompact$lambda$0$1$0;
        wd5 MixExpanded$lambda$0$0$0$0;
        byte b = this.I;
        WidgetPalette widgetPalette = this.K;
        WidgetMixItem widgetMixItem = this.J;
        ca0 ca0Var = (ca0) obj;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                MixCompact$lambda$0$1$0 = DesktopWidgetsKt.MixCompact$lambda$0$1$0(widgetMixItem, widgetPalette, ca0Var, fe0Var, intValue);
                return MixCompact$lambda$0$1$0;
            default:
                MixExpanded$lambda$0$0$0$0 = DesktopWidgetsKt.MixExpanded$lambda$0$0$0$0(widgetMixItem, widgetPalette, ca0Var, fe0Var, intValue);
                return MixExpanded$lambda$0$0$0$0;
        }
    }
}
