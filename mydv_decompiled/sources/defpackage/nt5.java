package defpackage;

import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nt5 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ WidgetPalette K;
    public final /* synthetic */ String L;

    public /* synthetic */ nt5(String str, WidgetPalette widgetPalette, String str2, byte b) {
        this.I = b;
        this.J = str;
        this.K = widgetPalette;
        this.L = str2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 WidgetCover$lambda$0$1;
        wd5 WidgetStatus$lambda$0$0;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                WidgetCover$lambda$0$1 = WidgetUiKt.WidgetCover$lambda$0$1(this.J, this.K, this.L, (ca0) obj, (fe0) obj2, intValue);
                return WidgetCover$lambda$0$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                WidgetStatus$lambda$0$0 = WidgetUiKt.WidgetStatus$lambda$0$0(this.J, this.K, this.L, (ca0) obj, (fe0) obj2, intValue2);
                return WidgetStatus$lambda$0$0;
        }
    }
}
