package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hv0 implements in1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ List J;
    public final /* synthetic */ int K;
    public final /* synthetic */ WidgetPalette L;
    public final /* synthetic */ List M;
    public final /* synthetic */ Object N;

    public /* synthetic */ hv0(int i, List list, List list2, WidgetPalette widgetPalette, List list3) {
        this.K = i;
        this.J = list;
        this.M = list2;
        this.L = widgetPalette;
        this.N = list3;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 LaterExpanded$lambda$0;
        wd5 LaterExpanded$lambda$0$0$0$0;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                LaterExpanded$lambda$0 = DesktopWidgetsKt.LaterExpanded$lambda$0(this.K, this.J, this.M, this.L, (List) this.N, (ca0) obj, (fe0) obj2, intValue);
                return LaterExpanded$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                LaterExpanded$lambda$0$0$0$0 = DesktopWidgetsKt.LaterExpanded$lambda$0$0$0$0(this.J, this.K, (WidgetVideo) this.N, this.L, this.M, (ca0) obj, (fe0) obj2, intValue2);
                return LaterExpanded$lambda$0$0$0$0;
        }
    }

    public /* synthetic */ hv0(List list, int i, WidgetVideo widgetVideo, WidgetPalette widgetPalette, List list2) {
        this.J = list;
        this.K = i;
        this.N = widgetVideo;
        this.L = widgetPalette;
        this.M = list2;
    }
}
