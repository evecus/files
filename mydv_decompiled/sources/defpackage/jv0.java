package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jv0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;

    public /* synthetic */ jv0(byte b, int i) {
        this.I = b;
        this.J = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 NowPlayingIdle$lambda$1;
        wd5 WidgetLoadingStatus$lambda$0;
        wd5 WidgetLockedStatus$lambda$0;
        byte b = this.I;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = this.J;
        switch (b) {
            case 0:
                NowPlayingIdle$lambda$1 = DesktopWidgetsKt.NowPlayingIdle$lambda$1(i, fe0Var, intValue);
                return NowPlayingIdle$lambda$1;
            case 1:
                WidgetLoadingStatus$lambda$0 = DesktopWidgetsKt.WidgetLoadingStatus$lambda$0(i, fe0Var, intValue);
                return WidgetLoadingStatus$lambda$0;
            default:
                WidgetLockedStatus$lambda$0 = WidgetUiKt.WidgetLockedStatus$lambda$0(i, fe0Var, intValue);
                return WidgetLockedStatus$lambda$0;
        }
    }
}
