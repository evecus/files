package defpackage;

import androidx.media3.ui.PlayerView;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.UtilsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ug5(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        wd5 onStateOf$lambda$0;
        byte b = this.I;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                onStateOf$lambda$0 = UtilsKt.onStateOf$lambda$0((tm1) obj4, (tm1) obj3, (tm1) obj2, (AsyncImagePainter.State) obj);
                return onStateOf$lambda$0;
            default:
                lp1 lp1Var = (lp1) obj4;
                fp3 fp3Var = (fp3) obj3;
                t43 t43Var = (t43) obj2;
                PlayerView playerView = (PlayerView) obj;
                playerView.getClass();
                playerView.setPlayer(null);
                lp1Var.b();
                lp1Var.a = null;
                lp1Var.b = null;
                lp1Var.d = null;
                if (fp3Var.a == playerView) {
                    fp3Var.a = null;
                    t43Var.setValue(Boolean.FALSE);
                }
                return wd5.a;
        }
    }
}
