package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetPalette J;
    public final /* synthetic */ String K;

    public /* synthetic */ fv0(WidgetPalette widgetPalette, String str, byte b) {
        this.I = b;
        this.J = widgetPalette;
        this.K = str;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 SearchCompact$lambda$0;
        wd5 SearchCompact$lambda$0$0;
        wd5 WidgetCover$lambda$0$1$0;
        byte b = this.I;
        String str = this.K;
        WidgetPalette widgetPalette = this.J;
        switch (b) {
            case 0:
                SearchCompact$lambda$0 = DesktopWidgetsKt.SearchCompact$lambda$0(widgetPalette, str, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return SearchCompact$lambda$0;
            case 1:
                SearchCompact$lambda$0$0 = DesktopWidgetsKt.SearchCompact$lambda$0$0(widgetPalette, str, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return SearchCompact$lambda$0$0;
            default:
                WidgetCover$lambda$0$1$0 = WidgetUiKt.WidgetCover$lambda$0$1$0(widgetPalette, str, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return WidgetCover$lambda$0$1$0;
        }
    }
}
