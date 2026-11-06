package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;

    public /* synthetic */ m(byte b, int i) {
        this.I = b;
        this.J = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        byte b = this.I;
        int i = this.J;
        Player.Listener listener = (Player.Listener) obj;
        switch (b) {
            case 0:
                listener.onRepeatModeChanged(i);
                break;
            default:
                listener.onAudioSessionIdChanged(i);
                break;
        }
    }
}
