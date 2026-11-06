package defpackage;

import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qv3 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ int J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ float L;
    public final /* synthetic */ String M;
    public final /* synthetic */ Object N;

    public /* synthetic */ qv3(int i, boolean z, WidgetPalette widgetPalette, float f, String str) {
        this.J = i;
        this.K = z;
        this.N = widgetPalette;
        this.L = f;
        this.M = str;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 WidgetIconButton_nbWgWpA$lambda$0;
        byte b = this.I;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                mw3.k(this.M, this.L, this.K, (rm1) obj3, (fe0) obj, mu0.X(this.J | 1));
                return wd5.a;
            default:
                int intValue = ((Integer) obj2).intValue();
                WidgetIconButton_nbWgWpA$lambda$0 = WidgetUiKt.WidgetIconButton_nbWgWpA$lambda$0(this.J, this.K, (WidgetPalette) obj3, this.L, this.M, (fe0) obj, intValue);
                return WidgetIconButton_nbWgWpA$lambda$0;
        }
    }

    public /* synthetic */ qv3(String str, float f, boolean z, rm1 rm1Var, int i) {
        this.M = str;
        this.L = f;
        this.K = z;
        this.N = rm1Var;
        this.J = i;
    }
}
