package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetPlayback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetPlayback J;
    public final /* synthetic */ WidgetPalette K;
    public final /* synthetic */ boolean L;

    public /* synthetic */ mv0(WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, boolean z, byte b) {
        this.I = b;
        this.J = widgetPlayback;
        this.K = widgetPalette;
        this.L = z;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 NowPlayingContent$lambda$0$0$0;
        wd5 NowPlayingContent$lambda$0$0$0$0;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                NowPlayingContent$lambda$0$0$0 = DesktopWidgetsKt.NowPlayingContent$lambda$0$0$0(this.J, this.K, this.L, (ca0) obj, (fe0) obj2, intValue);
                return NowPlayingContent$lambda$0$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                NowPlayingContent$lambda$0$0$0$0 = DesktopWidgetsKt.NowPlayingContent$lambda$0$0$0$0(this.J, this.K, this.L, (v74) obj, (fe0) obj2, intValue2);
                return NowPlayingContent$lambda$0$0$0$0;
        }
    }
}
