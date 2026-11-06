package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oc0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ oc0(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.N = obj4;
        this.J = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 ContinueLarge$lambda$1;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i) | 1;
                ((tc0) obj6).a((av) obj5, this.M, this.N, (fe0) obj, X);
                break;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                ContinueLarge$lambda$1 = DesktopWidgetsKt.ContinueLarge$lambda$1((List) obj6, (Bitmap) obj5, (Bitmap) obj4, (List) obj3, this.J, (fe0) obj, intValue);
                break;
            case 2:
                ((Integer) obj2).getClass();
                j16.f((dl4) obj6, (Author) obj5, (ki1) obj4, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mw3.t((Author) obj6, (rm1) obj5, (rm1) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                mw3.f((Aweme) obj6, (rm1) obj5, (l13) obj4, (String) obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }
}
