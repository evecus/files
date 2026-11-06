package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ vv0(int i, tm1 tm1Var) {
        this.I = (byte) 2;
        this.J = i;
        this.K = tm1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 LiveCompact$lambda$0$0;
        wd5 SearchExpanded$lambda$0$1$0$0;
        String str;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                LiveCompact$lambda$0$0 = DesktopWidgetsKt.LiveCompact$lambda$0$0((WidgetPalette) obj4, i, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                break;
            case 1:
                SearchExpanded$lambda$0$1$0$0 = DesktopWidgetsKt.SearchExpanded$lambda$0$1$0$0((List) obj4, i, (ca0) obj, (fe0) obj2, ((Integer) obj3).intValue());
                break;
            case 2:
                tm1 tm1Var = (tm1) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    String t = pt1.t(ut0.r(i, 1, 100), "%");
                    float f = i;
                    z60 z60Var = new z60(1.0f, 100.0f);
                    boolean g = go1Var.g(tm1Var);
                    Object Q = go1Var.Q();
                    if (g || Q == de0.a) {
                        Q = new l00(tm1Var, (byte) 17);
                        go1Var.o0(Q);
                    }
                    lq2.h("显示区域", t, f, z60Var, 98, (tm1) Q, 1.0f, 5.0f, null, go1Var, 14180358, 256);
                    break;
                }
                break;
            default:
                MixInfo mixInfo = (MixInfo) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    hx1 g2 = li4.g();
                    if (mixInfo == null) {
                        str = "相关视频";
                    } else {
                        String mixName = mixInfo.getMixName();
                        if (jx4.L(mixName)) {
                            mixName = "未命名合集";
                        }
                        str = "合集 · " + ((Object) mixName);
                    }
                    bp3.a(g2, str, i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 6.0f, 7), null, mixInfo != null ? hf1.v("第 ", mixInfo.getStatis().getCurrentEpisode(), " 集 / 共 ", i, " 集") : null, go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ vv0(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }
}
