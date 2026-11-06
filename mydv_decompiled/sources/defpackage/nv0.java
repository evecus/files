package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetMixItem;
import com.github.mytv.dv.widget.WidgetPalette;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nv0 implements in1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ Bitmap J;
    public final /* synthetic */ WidgetMixItem K;
    public final /* synthetic */ WidgetPalette L;

    public /* synthetic */ nv0(Bitmap bitmap, WidgetMixItem widgetMixItem, WidgetPalette widgetPalette) {
        this.J = bitmap;
        this.K = widgetMixItem;
        this.L = widgetPalette;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 MixCompact$lambda$0;
        wd5 MixCompact$lambda$0$1;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                MixCompact$lambda$0 = DesktopWidgetsKt.MixCompact$lambda$0(this.L, this.J, this.K, (ca0) obj, (fe0) obj2, intValue);
                return MixCompact$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                MixCompact$lambda$0$1 = DesktopWidgetsKt.MixCompact$lambda$0$1(this.J, this.K, this.L, (v74) obj, (fe0) obj2, intValue2);
                return MixCompact$lambda$0$1;
        }
    }

    public /* synthetic */ nv0(WidgetPalette widgetPalette, Bitmap bitmap, WidgetMixItem widgetMixItem) {
        this.L = widgetPalette;
        this.J = bitmap;
        this.K = widgetMixItem;
    }
}
