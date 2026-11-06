package defpackage;

import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.widget.WidgetPlayback;
import com.github.mytv.dv.widget.WidgetPlaybackStore;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xo2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo2(t43 t43Var, t43 t43Var2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = t43Var;
        this.K = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 0);
            case 1:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 1);
            case 2:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 2);
            case 3:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 3);
            case 4:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 4);
            case 5:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 5);
            default:
                return new xo2(t43Var2, t43Var, fj0Var, (byte) 6);
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
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((xo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                Boolean bool = Boolean.FALSE;
                t43Var2.setValue(bool);
                t43Var.setValue(bool);
                break;
            case 1:
                mu0.V(obj);
                LiveRoom liveRoom = (LiveRoom) t43Var2.getValue();
                if (liveRoom != null) {
                    WidgetPlaybackStore widgetPlaybackStore = WidgetPlaybackStore.INSTANCE;
                    String resolvedRoomId = liveRoom.getResolvedRoomId();
                    String title = liveRoom.getTitle();
                    if (jx4.L(title)) {
                        title = "正在直播";
                    }
                    String str = title;
                    String nickname = liveRoom.getOwner().getNickname();
                    String d0 = qg5.d0(liveRoom);
                    if (d0 == null) {
                        d0 = "";
                    }
                    widgetPlaybackStore.publish(new WidgetPlayback(resolvedRoomId, str, nickname, d0, "直播", !((Boolean) t43Var.getValue()).booleanValue(), true, 0L, 128, null));
                    break;
                }
                break;
            case 2:
                mu0.V(obj);
                Boolean bool2 = (Boolean) t43Var2.getValue();
                bool2.booleanValue();
                t43Var.setValue(bool2);
                break;
            case 3:
                mu0.V(obj);
                if (((Number) t43Var2.getValue()).intValue() > 0) {
                    t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                    break;
                }
                break;
            case 4:
                mu0.V(obj);
                Set set = hy3.a;
                if (((vy3) t43Var2.getValue()).f) {
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            case 5:
                mu0.V(obj);
                Boolean bool3 = (Boolean) t43Var2.getValue();
                bool3.booleanValue();
                t43Var.setValue(bool3);
                break;
            default:
                mu0.V(obj);
                if (((Number) t43Var2.getValue()).intValue() > 0) {
                    t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
