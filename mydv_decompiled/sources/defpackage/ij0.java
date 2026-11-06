package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.ContinueWidget;
import com.github.mytv.dv.widget.VideoListSnapshot;
import com.github.mytv.dv.widget.WatchLaterWidget;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ij0 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ fl4 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ VideoListSnapshot L;
    public final /* synthetic */ List M;
    public final /* synthetic */ List N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ ij0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, List list, Bitmap bitmap3, List list2) {
        this.J = fl4Var;
        this.K = z;
        this.L = videoListSnapshot;
        this.O = widgetVideo;
        this.P = bitmap;
        this.Q = bitmap2;
        this.M = list;
        this.R = bitmap3;
        this.N = list2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$4$0;
        wd5 provideGlance$lambda$3$0;
        switch (this.I) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                provideGlance$lambda$4$0 = ContinueWidget.provideGlance$lambda$4$0(this.J, this.K, this.L, (WidgetVideo) this.O, (Bitmap) this.P, (Bitmap) this.Q, this.M, (Bitmap) this.R, this.N, (fe0) obj, intValue);
                return provideGlance$lambda$4$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                provideGlance$lambda$3$0 = WatchLaterWidget.provideGlance$lambda$3$0(this.J, this.K, this.L, this.M, this.N, (List) this.O, (List) this.P, (List) this.Q, (List) this.R, (fe0) obj, intValue2);
                return provideGlance$lambda$3$0;
        }
    }

    public /* synthetic */ ij0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, List list, List list2, List list3, List list4, List list5, List list6) {
        this.J = fl4Var;
        this.K = z;
        this.L = videoListSnapshot;
        this.M = list;
        this.N = list2;
        this.O = list3;
        this.P = list4;
        this.Q = list5;
        this.R = list6;
    }
}
