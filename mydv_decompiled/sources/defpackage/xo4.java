package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Size;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xo4 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SimpleBasePlayer.State J;
    public final /* synthetic */ Object K;

    public /* synthetic */ xo4(SimpleBasePlayer simpleBasePlayer, SimpleBasePlayer.State state) {
        this.I = (byte) 5;
        this.K = simpleBasePlayer;
        this.J = state;
    }

    @Override // defpackage.gz4
    public final Object get() {
        SimpleBasePlayer.State lambda$setVideoTextureView$22;
        SimpleBasePlayer.State lambda$setPlaylistMetadata$15;
        SimpleBasePlayer.State lambda$setVideoSurfaceHolder$20;
        SimpleBasePlayer.State lambda$setVideoSurfaceView$21;
        SimpleBasePlayer.State lambda$setAudioAttributes$32;
        SimpleBasePlayer.State lambda$stop$12;
        SimpleBasePlayer.State lambda$setPlaybackParameters$11;
        SimpleBasePlayer.State lambda$setTrackSelectionParameters$14;
        byte b = this.I;
        Object obj = this.K;
        SimpleBasePlayer.State state = this.J;
        switch (b) {
            case 0:
                lambda$setVideoTextureView$22 = SimpleBasePlayer.lambda$setVideoTextureView$22(state, (Size) obj);
                return lambda$setVideoTextureView$22;
            case 1:
                lambda$setPlaylistMetadata$15 = SimpleBasePlayer.lambda$setPlaylistMetadata$15(state, (MediaMetadata) obj);
                return lambda$setPlaylistMetadata$15;
            case 2:
                lambda$setVideoSurfaceHolder$20 = SimpleBasePlayer.lambda$setVideoSurfaceHolder$20(state, (SurfaceHolder) obj);
                return lambda$setVideoSurfaceHolder$20;
            case 3:
                lambda$setVideoSurfaceView$21 = SimpleBasePlayer.lambda$setVideoSurfaceView$21(state, (SurfaceView) obj);
                return lambda$setVideoSurfaceView$21;
            case 4:
                lambda$setAudioAttributes$32 = SimpleBasePlayer.lambda$setAudioAttributes$32(state, (AudioAttributes) obj);
                return lambda$setAudioAttributes$32;
            case 5:
                lambda$stop$12 = ((SimpleBasePlayer) obj).lambda$stop$12(state);
                return lambda$stop$12;
            case 6:
                lambda$setPlaybackParameters$11 = SimpleBasePlayer.lambda$setPlaybackParameters$11(state, (PlaybackParameters) obj);
                return lambda$setPlaybackParameters$11;
            default:
                lambda$setTrackSelectionParameters$14 = SimpleBasePlayer.lambda$setTrackSelectionParameters$14(state, (TrackSelectionParameters) obj);
                return lambda$setTrackSelectionParameters$14;
        }
    }

    public /* synthetic */ xo4(SimpleBasePlayer.State state, Object obj, byte b) {
        this.I = b;
        this.J = state;
        this.K = obj;
    }
}
