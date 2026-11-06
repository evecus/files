package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetHotWord;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f30 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    public /* synthetic */ f30(int i, WidgetHotWord widgetHotWord, int i2) {
        this.J = i;
        this.L = widgetHotWord;
        this.K = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 HotWordRow$lambda$1;
        byte b = this.I;
        int i = this.K;
        Object obj3 = this.L;
        int i2 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                qg5.B((List) obj3, i2, (fe0) obj, mu0.X(i | 1));
                return wd5.a;
            default:
                HotWordRow$lambda$1 = DesktopWidgetsKt.HotWordRow$lambda$1(i2, (WidgetHotWord) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return HotWordRow$lambda$1;
        }
    }

    public /* synthetic */ f30(List list, int i, int i2) {
        this.L = list;
        this.J = i;
        this.K = i2;
    }
}
