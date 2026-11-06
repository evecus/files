package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetVideo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ve implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ve(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.J = obj3;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 ContinueSmall$lambda$1;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj3 = this.J;
        Object obj4 = this.M;
        Object obj5 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                c5.h((vd3) obj5, (u8) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d4.d((l13) obj5, (xx3) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cj0.a((xi0) obj5, (l13) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                at0.c((av) obj5, (w25) obj4, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 4:
                int intValue = ((Integer) obj2).intValue();
                ContinueSmall$lambda$1 = DesktopWidgetsKt.ContinueSmall$lambda$1((WidgetVideo) obj5, (Bitmap) obj4, (Bitmap) obj3, this.K, (fe0) obj, intValue);
                break;
            case 5:
                ((Integer) obj2).getClass();
                j16.g((rm1) obj5, (ki1) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 6:
                rm1 rm1Var = (rm1) obj3;
                fe0 fe0Var = (fe0) obj;
                ((Integer) obj2).intValue();
                int X = mu0.X(i | 1);
                he4.m(X, fe0Var, rm1Var, (tm1) obj4, (String) obj5);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((y55) obj5).b((Object[]) obj4, (tm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                eu5.d((rm1) obj5, (rm1) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                on5.s((String) obj5, (rj3) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                un5.a((Aweme) obj5, (rj3) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
