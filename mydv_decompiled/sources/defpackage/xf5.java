package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetPlaybackStore;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xf5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ is0 K;
    public final /* synthetic */ t43 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf5(List list, is0 is0Var, t43 t43Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = list;
        this.K = is0Var;
        this.L = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new xf5(this.J, this.K, this.L, fj0Var, (byte) 0);
            default:
                return new xf5(this.J, this.K, this.L, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((xf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((xf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        is0 is0Var = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                Aweme aweme = (Aweme) o70.V0(is0Var.o(), list);
                if (aweme != null) {
                    WidgetPlaybackStore widgetPlaybackStore = WidgetPlaybackStore.INSTANCE;
                    String awemeId = aweme.getAwemeId();
                    String desc = aweme.getDesc();
                    if (jx4.L(desc)) {
                        desc = "无标题视频";
                    }
                    String str = desc;
                    String nickname = aweme.getAuthor().getNickname();
                    String str2 = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList());
                    if (str2 == null && (str2 = (String) o70.U0(aweme.getVideo().getCover().getUrlList())) == null) {
                        str2 = "";
                    }
                    widgetPlaybackStore.publish(new WidgetPlayback(awemeId, str, nickname, str2, "播放", !((Boolean) t43Var.getValue()).booleanValue(), false, aweme.getVideo().getDuration(), 64, null));
                    break;
                }
                break;
            default:
                mu0.V(obj);
                Aweme aweme2 = (Aweme) o70.V0(is0Var.d.b.h(), list);
                if (aweme2 != null) {
                    t43Var.setValue(aweme2.getAwemeId());
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
