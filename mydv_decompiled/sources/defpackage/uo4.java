package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uo4 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SimpleBasePlayer.State J;
    public final /* synthetic */ int K;

    public /* synthetic */ uo4(SimpleBasePlayer.State state, int i, byte b) {
        this.I = b;
        this.J = state;
        this.K = i;
    }

    @Override // defpackage.gz4
    public final Object get() {
        switch (this.I) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$24(this.J, this.K);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$25(this.J, this.K);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.J, this.K);
        }
    }
}
