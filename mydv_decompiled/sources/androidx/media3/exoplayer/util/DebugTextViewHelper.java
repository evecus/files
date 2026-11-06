package androidx.media3.exoplayer.util;

import android.os.Build;
import android.os.Looper;
import android.widget.TextView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
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
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.hf1;
import defpackage.sp0;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Updater implements Player.Listener, Runnable {
        private Updater() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i) {
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
        public final void onTracksChanged(Tracks tracks) {
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
        public final void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTimelineChanged(Timeline timeline, int i) {
        }
    }

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        sp0.o(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
        if (Build.VERSION.SDK_INT >= 35) {
            textView.setRequestedFrameRate(-1.0f);
        }
    }

    private static String getColorInfoString(ColorInfo colorInfo) {
        if (colorInfo == null || !colorInfo.isValid()) {
            return "";
        }
        return " colr:" + colorInfo.toLogString();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " dib:" + decoderCounters.droppedInputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f) {
        return (f == -1.0f || f == 1.0f) ? "" : " par:".concat(String.format(Locale.US, "%.02f", Float.valueOf(f)));
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        return i == 0 ? "N/A" : String.valueOf((long) (j / i));
    }

    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(audioFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(audioFormat.id);
        sb.append(" hz:");
        sb.append(audioFormat.sampleRate);
        sb.append(" ch:");
        sb.append(audioFormat.channelCount);
        return hf1.z(sb, getDecoderCountersBufferCountString(audioDecoderCounters), ")");
    }

    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        String str = playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle";
        return "playWhenReady:" + this.player.getPlayWhenReady() + " playbackState:" + str + " item:" + this.player.getCurrentMediaItemIndex();
    }

    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        VideoSize videoSize = this.player.getVideoSize();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(videoFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(videoFormat.id);
        sb.append(" r:");
        sb.append(videoSize.width);
        sb.append("x");
        sb.append(videoSize.height);
        sb.append(getColorInfoString(videoFormat.colorInfo));
        sb.append(getPixelAspectRatioString(videoSize.pixelWidthHeightRatio));
        sb.append(getDecoderCountersBufferCountString(videoDecoderCounters));
        sb.append(" vfpo: ");
        return hf1.z(sb, getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount), ")");
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
