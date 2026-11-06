package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetHotWord;
import com.github.mytv.dv.widget.WidgetLiveItem;
import com.github.mytv.dv.widget.WidgetMixItem;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ WidgetPalette L;
    public final /* synthetic */ Object M;

    public /* synthetic */ bv0(int i, WidgetPalette widgetPalette, WidgetHotWord widgetHotWord, gb5 gb5Var) {
        this.I = (byte) 2;
        this.K = i;
        this.L = widgetPalette;
        this.J = widgetHotWord;
        this.M = gb5Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 LiveCompact$lambda$0;
        wd5 LaterExpanded$lambda$0$0$0$0$0;
        wd5 HotWordRow$lambda$0;
        wd5 MixExpanded$lambda$0$0$0;
        wd5 LiveCompact$lambda$0$1$0;
        byte b = this.I;
        Object obj4 = this.M;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                LiveCompact$lambda$0 = DesktopWidgetsKt.LiveCompact$lambda$0(this.L, (List) obj5, this.K, (List) obj4, (v74) obj, (fe0) obj2, intValue);
                return LiveCompact$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                LaterExpanded$lambda$0$0$0$0$0 = DesktopWidgetsKt.LaterExpanded$lambda$0$0$0$0$0((List) obj5, this.K, (WidgetVideo) obj4, this.L, (v74) obj, (fe0) obj2, intValue2);
                return LaterExpanded$lambda$0$0$0$0$0;
            case 2:
                int intValue3 = ((Integer) obj3).intValue();
                HotWordRow$lambda$0 = DesktopWidgetsKt.HotWordRow$lambda$0(this.K, this.L, (WidgetHotWord) obj5, (gb5) obj4, (v74) obj, (fe0) obj2, intValue3);
                return HotWordRow$lambda$0;
            case 3:
                int intValue4 = ((Integer) obj3).intValue();
                MixExpanded$lambda$0$0$0 = DesktopWidgetsKt.MixExpanded$lambda$0$0$0((List) obj5, this.K, (WidgetMixItem) obj4, this.L, (v74) obj, (fe0) obj2, intValue4);
                return MixExpanded$lambda$0$0$0;
            default:
                int intValue5 = ((Integer) obj3).intValue();
                LiveCompact$lambda$0$1$0 = DesktopWidgetsKt.LiveCompact$lambda$0$1$0((List) obj5, this.K, (WidgetLiveItem) obj4, this.L, (ca0) obj, (fe0) obj2, intValue5);
                return LiveCompact$lambda$0$1$0;
        }
    }

    public /* synthetic */ bv0(WidgetPalette widgetPalette, List list, int i, List list2) {
        this.I = (byte) 0;
        this.L = widgetPalette;
        this.J = list;
        this.K = i;
        this.M = list2;
    }

    public /* synthetic */ bv0(List list, int i, Object obj, WidgetPalette widgetPalette, byte b) {
        this.I = b;
        this.J = list;
        this.K = i;
        this.M = obj;
        this.L = widgetPalette;
    }
}
