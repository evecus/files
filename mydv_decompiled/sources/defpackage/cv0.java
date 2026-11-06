package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ List K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    public /* synthetic */ cv0(List list, List list2, int i, int i2, byte b) {
        this.I = b;
        this.J = list;
        this.K = list2;
        this.L = i;
        this.M = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 LiveCompact$lambda$1;
        wd5 LaterCompact$lambda$1;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LiveCompact$lambda$1 = DesktopWidgetsKt.LiveCompact$lambda$1(this.J, this.K, this.L, this.M, (fe0) obj, intValue);
                return LiveCompact$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LaterCompact$lambda$1 = DesktopWidgetsKt.LaterCompact$lambda$1(this.J, this.K, this.L, this.M, (fe0) obj, intValue2);
                return LaterCompact$lambda$1;
        }
    }
}
