package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPlayback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rv0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ rv0(tn5 tn5Var, int i, boolean z, String str, int i2) {
        this.I = (byte) 2;
        this.L = tn5Var;
        this.K = i;
        this.J = z;
        this.M = str;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 NowPlayingContent$lambda$1;
        byte b = this.I;
        int i = this.K;
        boolean z = this.J;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                NowPlayingContent$lambda$1 = DesktopWidgetsKt.NowPlayingContent$lambda$1((WidgetPlayback) obj4, (Bitmap) obj3, this.J, this.K, (fe0) obj, intValue);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ci2.c((String) obj4, z, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                mw3.w((tn5) obj4, this.K, this.J, (String) obj3, (fe0) obj, X);
                break;
            case 3:
                ((Integer) obj2).getClass();
                t05.a(z, (l13) obj4, (s05) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                eg5.d(z, (s44) obj4, (u45) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                eu5.l(X2, (fe0) obj, (rm1) obj4, (l13) obj3, z);
                break;
            default:
                ((Integer) obj2).intValue();
                on5.F((String) obj4, z, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ rv0(Object obj, Object obj2, boolean z, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.J = z;
        this.K = i;
    }

    public /* synthetic */ rv0(String str, boolean z, Object obj, int i, byte b) {
        this.I = b;
        this.L = str;
        this.J = z;
        this.M = obj;
        this.K = i;
    }

    public /* synthetic */ rv0(boolean z, Object obj, Object obj2, int i, byte b) {
        this.I = b;
        this.J = z;
        this.L = obj;
        this.M = obj2;
        this.K = i;
    }
}
