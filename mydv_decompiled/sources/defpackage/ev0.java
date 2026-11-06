package defpackage;

import com.github.mytv.dv.widget.DesktopWidgetsKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev0 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ long J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ev0(rm1 rm1Var, long j, l13 l13Var, int i) {
        this.K = rm1Var;
        this.J = j;
        this.M = l13Var;
        this.L = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 LiveExpanded$lambda$1;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        Object obj3 = this.M;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LiveExpanded$lambda$1 = DesktopWidgetsKt.LiveExpanded$lambda$1((List) obj4, (List) obj3, this.J, this.L, (fe0) obj, intValue);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                qb.p((l13) obj3, this.J, (List) obj4, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                on5.c((rm1) obj4, this.J, (l13) obj3, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ev0(l13 l13Var, long j, List list, int i) {
        this.M = l13Var;
        this.J = j;
        this.K = list;
        this.L = i;
    }

    public /* synthetic */ ev0(List list, List list2, long j, int i) {
        this.K = list;
        this.M = list2;
        this.J = j;
        this.L = i;
    }
}
