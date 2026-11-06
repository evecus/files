package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;

    public /* synthetic */ l(long j, byte b) {
        this.I = b;
        this.J = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((Player.Listener) obj).onSeekBackIncrementChanged(this.J);
                break;
            case 1:
                ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(this.J);
                break;
            default:
                ((Player.Listener) obj).onSeekForwardIncrementChanged(this.J);
                break;
        }
    }
}
