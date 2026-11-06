package defpackage;

import com.github.mytv.dv.widget.MixSnapshot;
import com.github.mytv.dv.widget.MixWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dm2 implements hn1 {
    public final /* synthetic */ byte I = 2;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ dm2(op2 op2Var, wm4 wm4Var, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, boolean z, tm1 tm1Var, int i) {
        this.J = op2Var;
        this.O = wm4Var;
        this.K = rm1Var;
        this.P = rm1Var2;
        this.L = l13Var;
        this.M = z;
        this.N = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$1;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        Object obj4 = this.P;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.O;
        Object obj8 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1597449);
                eu5.i((op2) obj8, this.M, (hn1) obj7, (rm1) obj6, (l13) obj5, (x70) obj4, (tm1) obj3, (fe0) obj, X);
                return wd5Var;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(1597513);
                j16.b((op2) obj8, (wm4) obj7, (rm1) obj6, (rm1) obj4, (l13) obj5, this.M, (tm1) obj3, (fe0) obj, X2);
                return wd5Var;
            default:
                int intValue = ((Integer) obj2).intValue();
                provideGlance$lambda$1 = MixWidget.provideGlance$lambda$1((WidgetPalette) obj8, (WidgetPalette) obj7, (fl4) obj6, this.M, (MixSnapshot) obj5, (List) obj4, (List) obj3, (fe0) obj, intValue);
                return provideGlance$lambda$1;
        }
    }

    public /* synthetic */ dm2(op2 op2Var, boolean z, hn1 hn1Var, rm1 rm1Var, l13 l13Var, x70 x70Var, tm1 tm1Var, int i) {
        this.J = op2Var;
        this.M = z;
        this.O = hn1Var;
        this.K = rm1Var;
        this.L = l13Var;
        this.P = x70Var;
        this.N = tm1Var;
    }

    public /* synthetic */ dm2(WidgetPalette widgetPalette, WidgetPalette widgetPalette2, fl4 fl4Var, boolean z, MixSnapshot mixSnapshot, List list, List list2) {
        this.J = widgetPalette;
        this.O = widgetPalette2;
        this.K = fl4Var;
        this.M = z;
        this.L = mixSnapshot;
        this.P = list;
        this.N = list2;
    }
}
