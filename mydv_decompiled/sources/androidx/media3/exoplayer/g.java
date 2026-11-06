package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;

    public /* synthetic */ g(byte b, boolean z) {
        this.I = b;
        this.J = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        byte b = this.I;
        boolean z = this.J;
        Player.Listener listener = (Player.Listener) obj;
        switch (b) {
            case 0:
                listener.onSkipSilenceEnabledChanged(z);
                break;
            default:
                listener.onShuffleModeEnabledChanged(z);
                break;
        }
    }
}
