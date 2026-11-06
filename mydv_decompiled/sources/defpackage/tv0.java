package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixPlaylistPagination;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetVideo;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ tv0(Bitmap bitmap, WidgetVideo widgetVideo, List list, Bitmap bitmap2, List list2) {
        this.I = (byte) 0;
        this.J = bitmap;
        this.L = widgetVideo;
        this.M = list;
        this.K = bitmap2;
        this.N = list2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 ContinueLarge$lambda$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        Object obj8 = this.J;
        switch (b) {
            case 0:
                ContinueLarge$lambda$0 = DesktopWidgetsKt.ContinueLarge$lambda$0((Bitmap) obj8, (WidgetVideo) obj6, (List) obj5, (Bitmap) obj7, (List) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                break;
            case 1:
                k80 k80Var = (k80) obj8;
                cw4 cw4Var = (cw4) obj7;
                cw4 cw4Var2 = (cw4) obj6;
                String str = (String) obj5;
                t43 t43Var = (t43) obj4;
                k25 k25Var = (k25) obj;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).e(k25Var.a) ? 4 : 2;
                }
                int i = intValue;
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i & 1, (i & 19) != 18)) {
                    go1Var.W();
                    break;
                } else {
                    i51 i51Var = lw2.b;
                    m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
                    qk1 qk1Var = qk1.P;
                    long j = k80Var.q;
                    i13 i13Var = i13.a;
                    int i2 = i & 14;
                    r55.b("手机扫码推送登录信息", p70.G(i13Var, cw4Var, j, false, null, 12), j, 0L, qk1Var, 0L, k25Var, 0L, 0, false, 0, 0, m65Var, go1Var, 1572870, i2, 129976);
                    r55.b("支持同时推送 Cookie、ticket、ts_sign 和 private key", p70.G(i13Var, cw4Var2, k80Var.s, false, null, 12), k80Var.s, oh4.j(12), null, 0L, k25Var, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, 24582, i2, 130024);
                    r55.b(str, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.a, 0L, null, 0L, k25Var, 0L, 0, false, 0, 0, xc3.e, go1Var, 0, i2, 130042);
                    qm4.t(((Boolean) t43Var.getValue()).booleanValue(), go1Var, 0);
                    break;
                }
            default:
                in1 in1Var = (in1) obj8;
                List list = (List) obj;
                Aweme aweme = (Aweme) obj2;
                MixPlaylistPagination mixPlaylistPagination = (MixPlaylistPagination) obj3;
                list.getClass();
                aweme.getClass();
                on5.L((tm1) obj7, (dl0) obj6, (t43) obj5, (ki1) obj4, false);
                if (in1Var != null) {
                    in1Var.invoke(list, aweme, mixPlaylistPagination);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ tv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
        this.N = obj5;
    }
}
