package defpackage;

import com.github.mytv.dv.widget.WidgetPlaybackStore;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hp2 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hu2 b;

    public /* synthetic */ hp2(hu2 hu2Var, byte b) {
        this.a = b;
        this.b = hu2Var;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        hu2 hu2Var = this.b;
        switch (b) {
            case 0:
                hu2Var.F(null);
                WidgetPlaybackStore.INSTANCE.clear();
                hu2Var.i.q(true);
                break;
            case 1:
                hu2Var.u = false;
                break;
            case 2:
                sn5 sn5Var = sn5.a;
                sn5.a();
                hu2Var.F(null);
                WidgetPlaybackStore.INSTANCE.clear();
                break;
            case 3:
                fw4 fw4Var = hu2Var.i.i;
                Boolean bool = Boolean.FALSE;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                break;
            default:
                sn5 sn5Var2 = sn5.a;
                sn5.a();
                hu2Var.F(null);
                WidgetPlaybackStore.INSTANCE.clear();
                hu2Var.i.q(true);
                break;
        }
    }
}
