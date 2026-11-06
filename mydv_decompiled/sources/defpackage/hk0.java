package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetPlaybackStore;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hk0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk0(Object obj, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                hk0 hk0Var = new hk0((xp3) obj4, (s35) obj3, (u45) obj2, fj0Var);
                hk0Var.J = obj;
                return hk0Var;
            case 1:
                return new hk0((List) this.J, (op2) obj4, (cw4) obj3, (t43) obj2, fj0Var, (byte) 1);
            case 2:
                return new hk0((dl0) this.J, (t43) obj4, (t43) obj3, (ki1) obj2, fj0Var, (byte) 2);
            case 3:
                return new hk0((fl4) this.J, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 3);
            default:
                return new hk0((is0) this.J, (t43) obj4, (ab4) obj3, (t43) obj2, fj0Var, (byte) 4);
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
                ((hk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((hk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((hk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((hk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((hk0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        fj0 fj0Var = null;
        byte b2 = 1;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                mu0.V(obj);
                dl0 dl0Var = (dl0) this.J;
                xp3 xp3Var = (xp3) obj4;
                gk0 gk0Var = new gk0(xp3Var, (s35) obj3, fj0Var, (byte) 0);
                gl0 gl0Var = gl0.L;
                p70.g0(dl0Var, null, gl0Var, gk0Var, 1);
                p70.g0(dl0Var, null, gl0Var, new r((Object) xp3Var, obj2, fj0Var, (byte) 14), 1);
                break;
            case 1:
                mu0.V(obj);
                if (((Boolean) ((cw4) obj3).getValue()).booleanValue()) {
                    go2 go2Var = (go2) o70.V0(((Number) ((t43) obj2).getValue()).intValue(), (List) this.J);
                    String str = go2Var != null ? go2Var.a : null;
                    if (str != null) {
                        op2 op2Var = (op2) obj4;
                        op2Var.getClass();
                        if (!j42.c(str, "follow")) {
                            p70.g0(o7.B(op2Var), null, null, new eg1(op2Var, str, fj0Var, b2), 3);
                            break;
                        }
                    }
                }
                break;
            case 2:
                t43 t43Var = (t43) obj3;
                mu0.V(obj);
                if (!((List) ((t43) obj4).getValue()).isEmpty() && !((Boolean) t43Var.getValue()).booleanValue()) {
                    t43Var.setValue(Boolean.TRUE);
                    p70.g0((dl0) this.J, null, null, new oo0((ki1) obj2, fj0Var, b2), 3);
                    break;
                }
                break;
            case 3:
                mu0.V(obj);
                fl4 fl4Var = (fl4) this.J;
                String g = fl4Var.g();
                i51 i51Var = qm4.a;
                ((t43) obj4).setValue(g);
                ((t43) obj3).setValue(fl4Var.m());
                ((t43) obj2).setValue(fl4Var.k());
                break;
            default:
                mu0.V(obj);
                Aweme aweme = (Aweme) o70.V0(((is0) this.J).o(), (List) ((t43) obj4).getValue());
                if (aweme != null) {
                    ab4 ab4Var = (ab4) obj3;
                    t43 t43Var2 = (t43) obj2;
                    WidgetPlaybackStore widgetPlaybackStore = WidgetPlaybackStore.INSTANCE;
                    String awemeId = aweme.getAwemeId();
                    String desc = aweme.getDesc();
                    if (jx4.L(desc)) {
                        desc = "无标题视频";
                    }
                    String str2 = desc;
                    String nickname = aweme.getAuthor().getNickname();
                    String str3 = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList());
                    if (str3 == null && (str3 = (String) o70.U0(aweme.getVideo().getCover().getUrlList())) == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    int ordinal = ab4Var.ordinal();
                    widgetPlaybackStore.publish(new WidgetPlayback(awemeId, str2, nickname, str4, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "播放" : "移动" : "关注" : "推荐" : "精选", !((Boolean) t43Var2.getValue()).booleanValue(), false, aweme.getVideo().getDuration(), 64, null));
                    break;
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(xp3 xp3Var, s35 s35Var, u45 u45Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.K = xp3Var;
        this.L = s35Var;
        this.M = u45Var;
    }
}
