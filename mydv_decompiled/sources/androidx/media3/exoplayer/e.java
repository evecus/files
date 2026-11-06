package androidx.media3.exoplayer;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.MediaPeriodHolder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ListenerSet.Event, MediaPeriodHolder.Factory {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ e(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j) {
        MediaPeriodHolder createMediaPeriodHolder;
        createMediaPeriodHolder = ((ExoPlayerImplInternal) this.J).createMediaPeriodHolder(mediaPeriodInfo, j);
        return createMediaPeriodHolder;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) obj2);
                break;
            default:
                ((Player.Listener) obj).onVideoSizeChanged((VideoSize) obj2);
                break;
        }
    }
}
