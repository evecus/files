package defpackage;

import coil3.compose.SingletonImageLoadersKt;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetKind;
import com.github.mytv.dv.widget.WidgetUiKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zu0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ zu0(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 SearchExpanded$lambda$1;
        wd5 singletonImageLoaderFactory$lambda$0;
        wd5 WidgetErrorStatus$lambda$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                SearchExpanded$lambda$1 = DesktopWidgetsKt.SearchExpanded$lambda$1((List) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return SearchExpanded$lambda$1;
            case 1:
                dd2 dd2Var = (dd2) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    x32 c = dd2Var.b.e.c(i);
                    ((zc2) c.c).d.c(fd2.a, Integer.valueOf(i - c.a), go1Var, 6);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 2:
                pf2 pf2Var = (pf2) obj3;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    x32 c2 = pf2Var.b.d.c(i);
                    ((nf2) c2.c).c.c(pf2Var.c, Integer.valueOf(i - c2.a), go1Var2, 0);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 3:
                lg2 lg2Var = (lg2) obj3;
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    x32 c3 = lg2Var.b.d.c(i);
                    ((jg2) c3.c).d.c(mg2.a, Integer.valueOf(i - c3.a), go1Var3, 6);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            case 4:
                ((Integer) obj2).intValue();
                j16.c((LiveRoom) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 5:
                ((Integer) obj2).getClass();
                mw3.j((hu2) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 6:
                ((Integer) obj2).getClass();
                qm4.s((hx1) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 7:
                singletonImageLoaderFactory$lambda$0 = SingletonImageLoadersKt.setSingletonImageLoaderFactory$lambda$0((tm1) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return singletonImageLoaderFactory$lambda$0;
            case 8:
                ((Integer) obj2).intValue();
                fv4.i((MixInfo) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 9:
                ((Integer) obj2).intValue();
                on5.b((Comment) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            default:
                WidgetErrorStatus$lambda$0 = WidgetUiKt.WidgetErrorStatus$lambda$0((WidgetKind) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetErrorStatus$lambda$0;
        }
    }
}
