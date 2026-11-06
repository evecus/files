package androidx.media3.exoplayer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.StreamVolumeManager;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements ListenerSet.Event, BackgroundThreadStateHandler.StateChangeListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ n(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((ExoPlayerImpl) obj2).lambda$setPlaylistMetadata$11((Player.Listener) obj);
                break;
            case 1:
                ((Player.Listener) obj).onAudioAttributesChanged((AudioAttributes) obj2);
                break;
            case 2:
                ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) obj2);
                break;
            case 3:
                ((Player.Listener) obj).onCues((CueGroup) obj2);
                break;
            case 4:
                ((ExoPlayerImpl.ComponentListener) obj2).lambda$onMetadata$6((Player.Listener) obj);
                break;
            case 5:
                ((Player.Listener) obj).onMetadata((Metadata) obj2);
                break;
            case 6:
                ((Player.Listener) obj).onCues((List<Cue>) obj2);
                break;
            default:
                ((Player.Listener) obj).onDeviceInfoChanged((DeviceInfo) obj2);
                break;
        }
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        ((StreamVolumeManager) this.J).onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
    }
}
