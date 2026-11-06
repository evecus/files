package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetMixItem;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sv0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetMixItem J;

    public /* synthetic */ sv0(WidgetMixItem widgetMixItem, byte b) {
        this.I = b;
        this.J = widgetMixItem;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 MixCompact$lambda$0$1$0$1;
        wd5 MixExpanded$lambda$0$0$0$0$0;
        byte b = this.I;
        WidgetMixItem widgetMixItem = this.J;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                MixCompact$lambda$0$1$0$1 = DesktopWidgetsKt.MixCompact$lambda$0$1$0$1(widgetMixItem, fe0Var, intValue);
                return MixCompact$lambda$0$1$0$1;
            default:
                MixExpanded$lambda$0$0$0$0$0 = DesktopWidgetsKt.MixExpanded$lambda$0$0$0$0$0(widgetMixItem, fe0Var, intValue);
                return MixExpanded$lambda$0$0$0$0$0;
        }
    }
}
