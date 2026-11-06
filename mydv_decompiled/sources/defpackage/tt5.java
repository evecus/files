package defpackage;

import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt5 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;

    public /* synthetic */ tt5(String str, byte b) {
        this.I = b;
        this.J = str;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 WidgetCover$lambda$0$1$1;
        wd5 WidgetCover$lambda$0$1$1$0;
        byte b = this.I;
        v74 v74Var = (v74) obj;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        String str = this.J;
        switch (b) {
            case 0:
                WidgetCover$lambda$0$1$1 = WidgetUiKt.WidgetCover$lambda$0$1$1(str, v74Var, fe0Var, intValue);
                return WidgetCover$lambda$0$1$1;
            default:
                WidgetCover$lambda$0$1$1$0 = WidgetUiKt.WidgetCover$lambda$0$1$1$0(str, v74Var, fe0Var, intValue);
                return WidgetCover$lambda$0$1$1$0;
        }
    }
}
