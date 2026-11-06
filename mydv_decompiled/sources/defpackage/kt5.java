package defpackage;

import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kt5 implements in1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ int J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ WidgetPalette L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;
    public final /* synthetic */ d6 P;

    public /* synthetic */ kt5(int i, boolean z, WidgetPalette widgetPalette, String str, d6 d6Var, String str2, String str3) {
        this.J = i;
        this.K = z;
        this.L = widgetPalette;
        this.M = str;
        this.P = d6Var;
        this.N = str2;
        this.O = str3;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 WidgetStatus$lambda$0;
        wd5 WidgetStatus$lambda$2;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                WidgetStatus$lambda$0 = WidgetUiKt.WidgetStatus$lambda$0(this.J, this.K, this.L, this.M, this.P, this.N, this.O, (v74) obj, (fe0) obj2, intValue);
                return WidgetStatus$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                WidgetStatus$lambda$2 = WidgetUiKt.WidgetStatus$lambda$2(this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ca0) obj, (fe0) obj2, intValue2);
                return WidgetStatus$lambda$2;
        }
    }

    public /* synthetic */ kt5(int i, boolean z, WidgetPalette widgetPalette, String str, String str2, String str3, d6 d6Var) {
        this.J = i;
        this.K = z;
        this.L = widgetPalette;
        this.M = str;
        this.N = str2;
        this.O = str3;
        this.P = d6Var;
    }
}
