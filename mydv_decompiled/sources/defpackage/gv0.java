package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gv0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ int K;

    public /* synthetic */ gv0(String str, int i, byte b) {
        this.I = b;
        this.J = str;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 SearchCompact$lambda$1;
        wd5 WidgetGuideStatus$lambda$0;
        byte b = this.I;
        int i = this.K;
        String str = this.J;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                SearchCompact$lambda$1 = DesktopWidgetsKt.SearchCompact$lambda$1(str, i, fe0Var, intValue);
                return SearchCompact$lambda$1;
            default:
                WidgetGuideStatus$lambda$0 = WidgetUiKt.WidgetGuideStatus$lambda$0(str, i, fe0Var, intValue);
                return WidgetGuideStatus$lambda$0;
        }
    }
}
