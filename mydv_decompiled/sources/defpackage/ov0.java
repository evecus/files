package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ List K;

    public /* synthetic */ ov0(List list, List list2, byte b) {
        this.I = b;
        this.J = list;
        this.K = list2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 ContinueLarge$lambda$0$0$1;
        wd5 LaterCompact$lambda$0$0;
        byte b = this.I;
        v74 v74Var = (v74) obj;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                ContinueLarge$lambda$0$0$1 = DesktopWidgetsKt.ContinueLarge$lambda$0$0$1(this.J, this.K, v74Var, fe0Var, intValue);
                return ContinueLarge$lambda$0$0$1;
            default:
                LaterCompact$lambda$0$0 = DesktopWidgetsKt.LaterCompact$lambda$0$0(this.J, this.K, v74Var, fe0Var, intValue);
                return LaterCompact$lambda$0$0;
        }
    }
}
