package defpackage;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qn2 implements Player.Listener {
    public final /* synthetic */ t43 I;

    public qn2(t43 t43Var) {
        this.I = t43Var;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        tracks.getClass();
        un2.e(this.I, tracks);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(List list) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
    }
}
