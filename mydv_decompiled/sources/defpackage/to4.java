package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.ui.TrackSelectionDialogBuilder;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class to4 implements ListenerSet.Event, TrackSelectionDialogBuilder.DialogCallback {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ to4(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        byte b = this.I;
        int i = this.J;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                ((Player.Listener) obj).onMediaItemTransition((MediaItem) obj2, i);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$34((SimpleBasePlayer.State) obj2, i, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback
    public void onTracksSelected(boolean z, Map map) {
        TrackSelectionDialogBuilder.lambda$new$0((Player) this.K, this.J, z, map);
    }
}
