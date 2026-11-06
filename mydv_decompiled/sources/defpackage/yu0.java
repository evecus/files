package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yu0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetPalette J;

    public /* synthetic */ yu0(WidgetPalette widgetPalette, byte b) {
        this.I = b;
        this.J = widgetPalette;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 SearchExpanded$lambda$0$0;
        wd5 NowPlayingIdle$lambda$0$0;
        wd5 NowPlayingIdle$lambda$0;
        wd5 NowPlayingIdle$lambda$0$0$0;
        wd5 MixCompact$lambda$0$0;
        byte b = this.I;
        WidgetPalette widgetPalette = this.J;
        switch (b) {
            case 0:
                SearchExpanded$lambda$0$0 = DesktopWidgetsKt.SearchExpanded$lambda$0$0(widgetPalette, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return SearchExpanded$lambda$0$0;
            case 1:
                NowPlayingIdle$lambda$0$0 = DesktopWidgetsKt.NowPlayingIdle$lambda$0$0(widgetPalette, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingIdle$lambda$0$0;
            case 2:
                NowPlayingIdle$lambda$0 = DesktopWidgetsKt.NowPlayingIdle$lambda$0(widgetPalette, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingIdle$lambda$0;
            case 3:
                NowPlayingIdle$lambda$0$0$0 = DesktopWidgetsKt.NowPlayingIdle$lambda$0$0$0(widgetPalette, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingIdle$lambda$0$0$0;
            default:
                MixCompact$lambda$0$0 = DesktopWidgetsKt.MixCompact$lambda$0$0(widgetPalette, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return MixCompact$lambda$0$0;
        }
    }
}
