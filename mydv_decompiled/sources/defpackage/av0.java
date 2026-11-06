package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetVideo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class av0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ WidgetVideo J;
    public final /* synthetic */ Bitmap K;

    public /* synthetic */ av0(WidgetVideo widgetVideo, Bitmap bitmap, byte b) {
        this.I = b;
        this.J = widgetVideo;
        this.K = bitmap;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 ContinueSmall$lambda$0$0;
        wd5 ContinueLarge$lambda$0$0$0;
        byte b = this.I;
        Bitmap bitmap = this.K;
        WidgetVideo widgetVideo = this.J;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ContinueSmall$lambda$0$0 = DesktopWidgetsKt.ContinueSmall$lambda$0$0(widgetVideo, bitmap, fe0Var, intValue);
                return ContinueSmall$lambda$0$0;
            default:
                ContinueLarge$lambda$0$0$0 = DesktopWidgetsKt.ContinueLarge$lambda$0$0$0(widgetVideo, bitmap, fe0Var, intValue);
                return ContinueLarge$lambda$0$0$0;
        }
    }
}
