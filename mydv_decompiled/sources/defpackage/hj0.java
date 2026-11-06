package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.ContinueWidget;
import com.github.mytv.dv.widget.VideoListSnapshot;
import com.github.mytv.dv.widget.WatchLaterWidget;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hj0 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ hj0(ur1 ur1Var, l13 l13Var, wd2 wd2Var, li3 li3Var, mp mpVar, ip ipVar, gf1 gf1Var, boolean z, sc scVar, tm1 tm1Var, int i) {
        this.K = ur1Var;
        this.L = l13Var;
        this.M = wd2Var;
        this.N = li3Var;
        this.O = mpVar;
        this.P = ipVar;
        this.Q = gf1Var;
        this.J = z;
        this.R = scVar;
        this.S = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$4;
        wd5 provideGlance$lambda$3;
        byte b = this.I;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        Object obj5 = this.O;
        Object obj6 = this.N;
        Object obj7 = this.S;
        Object obj8 = this.R;
        Object obj9 = this.M;
        Object obj10 = this.L;
        Object obj11 = this.K;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                provideGlance$lambda$4 = ContinueWidget.provideGlance$lambda$4((WidgetPalette) obj11, (fl4) obj10, this.J, (VideoListSnapshot) obj9, (WidgetVideo) obj6, (Bitmap) obj5, (Bitmap) obj4, (List) obj8, (Bitmap) obj3, (List) obj7, (fe0) obj, intValue);
                return provideGlance$lambda$4;
            case 1:
                ((Integer) obj2).getClass();
                int X = mu0.X(1772593);
                k21.i((ur1) obj11, (l13) obj10, (wd2) obj9, (li3) obj6, (mp) obj5, (ip) obj4, (gf1) obj3, this.J, (sc) obj8, (tm1) obj7, (fe0) obj, X);
                return wd5.a;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                provideGlance$lambda$3 = WatchLaterWidget.provideGlance$lambda$3((WidgetPalette) obj11, (fl4) obj10, this.J, (VideoListSnapshot) obj9, (List) obj8, (List) obj7, (List) obj6, (List) obj5, (List) obj4, (List) obj3, (fe0) obj, intValue2);
                return provideGlance$lambda$3;
        }
    }

    public /* synthetic */ hj0(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, List list, Bitmap bitmap3, List list2) {
        this.K = widgetPalette;
        this.L = fl4Var;
        this.J = z;
        this.M = videoListSnapshot;
        this.N = widgetVideo;
        this.O = bitmap;
        this.P = bitmap2;
        this.R = list;
        this.Q = bitmap3;
        this.S = list2;
    }

    public /* synthetic */ hj0(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, List list, List list2, List list3, List list4, List list5, List list6) {
        this.K = widgetPalette;
        this.L = fl4Var;
        this.J = z;
        this.M = videoListSnapshot;
        this.R = list;
        this.S = list2;
        this.N = list3;
        this.O = list4;
        this.P = list5;
        this.Q = list6;
    }
}
