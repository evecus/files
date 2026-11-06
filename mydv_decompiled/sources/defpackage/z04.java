package defpackage;

import androidx.compose.runtime.Recomposer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class z04 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Recomposer J;

    public /* synthetic */ z04(Recomposer recomposer, byte b) {
        this.I = b;
        this.J = recomposer;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 broadcastFrameClock$lambda$0;
        wd5 nextFrameEndCallbackQueue$lambda$0;
        byte b = this.I;
        Recomposer recomposer = this.J;
        switch (b) {
            case 0:
                broadcastFrameClock$lambda$0 = Recomposer.broadcastFrameClock$lambda$0(recomposer);
                return broadcastFrameClock$lambda$0;
            default:
                nextFrameEndCallbackQueue$lambda$0 = Recomposer.nextFrameEndCallbackQueue$lambda$0(recomposer);
                return nextFrameEndCallbackQueue$lambda$0;
        }
    }
}
