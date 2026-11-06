package androidx.media3.common.util;

import android.os.Message;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
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
import defpackage.pl2;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class StuckPlayerDetector {
    private static final int MSG_STUCK_BUFFERING_TIMEOUT = 1;
    private static final int MSG_STUCK_PLAYING_NOT_ENDING_TIMEOUT = 3;
    private static final int MSG_STUCK_PLAYING_TIMEOUT = 2;
    private static final int MSG_STUCK_SUPPRESSED_TIMEOUT = 4;
    private final Callback callback;
    private final Clock clock;
    private final HandlerWrapper handler;
    private final Timeline.Period period = new Timeline.Period();
    private final Player player;
    private final Player.Listener playerListener;
    private final StuckBufferingDetector stuckBufferingDetector;
    private final StuckPlayingDetector stuckPlayingDetector;
    private final StuckPlayingNotEndingDetector stuckPlayingNotEndingDetector;
    private final StuckSuppressedDetector stuckSuppressedDetector;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback {
        void onStuckPlayerDetected(StuckPlayerException stuckPlayerException);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StuckBufferingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long bufferedDurationInOtherPeriodsMs;
        private long bufferedPositionInPeriodMs;
        private boolean isBuffering;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckBufferingTimeoutMs;

        public StuckBufferingDetector(int i) {
            this.stuckBufferingTimeoutMs = i;
        }

        public void update() {
            if (StuckPlayerDetector.this.player.getPlaybackState() != 2 || !StuckPlayerDetector.this.player.getPlayWhenReady() || StuckPlayerDetector.this.player.getPlaybackSuppressionReason() != 0) {
                if (this.isBuffering) {
                    StuckPlayerDetector.this.handler.removeMessages(1);
                }
                this.isBuffering = false;
                return;
            }
            Timeline currentTimeline = StuckPlayerDetector.this.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long bufferedPosition = StuckPlayerDetector.this.player.getBufferedPosition();
            long max = Math.max(0L, StuckPlayerDetector.this.player.getTotalBufferedDuration() - Math.max(0L, bufferedPosition - StuckPlayerDetector.this.player.getCurrentPosition()));
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                bufferedPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, StuckPlayerDetector.this.period).getPositionInWindowMs();
            }
            long elapsedRealtime = StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isBuffering && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && bufferedPosition == this.bufferedPositionInPeriodMs && max == this.bufferedDurationInOtherPeriodsMs) {
                if (elapsedRealtime - this.startRealtimeMs >= this.stuckBufferingTimeoutMs) {
                    StuckPlayerDetector.this.callback.onStuckPlayerDetected(new StuckPlayerException(1, this.stuckBufferingTimeoutMs));
                    return;
                }
                return;
            }
            this.isBuffering = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.bufferedPositionInPeriodMs = bufferedPosition;
            this.bufferedDurationInOtherPeriodsMs = max;
            StuckPlayerDetector.this.handler.removeMessages(1);
            StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(1, this.stuckBufferingTimeoutMs);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StuckPlayingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long currentPositionInPeriodMs;
        private boolean isPlaying;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingTimeoutMs;

        public StuckPlayingDetector(int i) {
            this.stuckPlayingTimeoutMs = i;
        }

        public void update() {
            if (!StuckPlayerDetector.this.player.isPlaying()) {
                if (this.isPlaying) {
                    StuckPlayerDetector.this.handler.removeMessages(2);
                }
                this.isPlaying = false;
                return;
            }
            Timeline currentTimeline = StuckPlayerDetector.this.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long currentPosition = StuckPlayerDetector.this.player.getCurrentPosition();
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                currentPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, StuckPlayerDetector.this.period).getPositionInWindowMs();
            }
            long elapsedRealtime = StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isPlaying && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && currentPosition == this.currentPositionInPeriodMs) {
                if (elapsedRealtime - this.startRealtimeMs >= this.stuckPlayingTimeoutMs) {
                    StuckPlayerDetector.this.callback.onStuckPlayerDetected(new StuckPlayerException(2, this.stuckPlayingTimeoutMs));
                    return;
                }
                return;
            }
            this.isPlaying = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.currentPositionInPeriodMs = currentPosition;
            StuckPlayerDetector.this.handler.removeMessages(2);
            StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(2, this.stuckPlayingTimeoutMs);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StuckPlayingNotEndingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private boolean isPlayingAndReachedDuration;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingNotEndingTimeoutMs;

        public StuckPlayingNotEndingDetector(int i) {
            this.stuckPlayingNotEndingTimeoutMs = i;
        }

        public void update() {
            long duration;
            Timeline currentTimeline = StuckPlayerDetector.this.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long currentPosition = StuckPlayerDetector.this.player.getCurrentPosition();
            if (uidOfPeriod == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? StuckPlayerDetector.this.player.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.getPeriodByUid(uidOfPeriod, StuckPlayerDetector.this.period);
                currentPosition -= StuckPlayerDetector.this.period.getPositionInWindowMs();
                duration = StuckPlayerDetector.this.period.getDurationMs();
            }
            boolean isPlaying = StuckPlayerDetector.this.player.isPlaying();
            if (!isPlaying || duration == C.TIME_UNSET || currentPosition < duration) {
                StuckPlayerDetector.this.handler.removeMessages(3);
                if (isPlaying && duration != C.TIME_UNSET) {
                    StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / StuckPlayerDetector.this.player.getPlaybackParameters().speed));
                }
                this.isPlayingAndReachedDuration = false;
                return;
            }
            long elapsedRealtime = StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isPlayingAndReachedDuration && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup) {
                if (elapsedRealtime - this.startRealtimeMs >= this.stuckPlayingNotEndingTimeoutMs) {
                    StuckPlayerDetector.this.callback.onStuckPlayerDetected(new StuckPlayerException(3, this.stuckPlayingNotEndingTimeoutMs));
                    return;
                }
                return;
            }
            this.isPlayingAndReachedDuration = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            StuckPlayerDetector.this.handler.removeMessages(3);
            StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(3, this.stuckPlayingNotEndingTimeoutMs);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StuckSuppressedDetector {
        private boolean isSuppressed;
        private long startRealtimeMs;
        private final int stuckSuppressedTimeoutMs;
        private int suppressionReason;

        public StuckSuppressedDetector(int i) {
            this.stuckSuppressedTimeoutMs = i;
        }

        public void update() {
            int playbackSuppressionReason = StuckPlayerDetector.this.player.getPlaybackSuppressionReason();
            if (!StuckPlayerDetector.this.player.getPlayWhenReady() || StuckPlayerDetector.this.player.getPlaybackState() == 1 || StuckPlayerDetector.this.player.getPlaybackState() == 4 || playbackSuppressionReason == 0 || playbackSuppressionReason == 1) {
                if (this.isSuppressed) {
                    StuckPlayerDetector.this.handler.removeMessages(4);
                }
                this.isSuppressed = false;
                return;
            }
            long elapsedRealtime = StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isSuppressed && this.suppressionReason == playbackSuppressionReason) {
                if (elapsedRealtime - this.startRealtimeMs >= this.stuckSuppressedTimeoutMs) {
                    StuckPlayerDetector.this.callback.onStuckPlayerDetected(new StuckPlayerException(4, this.stuckSuppressedTimeoutMs));
                }
            } else {
                this.isSuppressed = true;
                this.startRealtimeMs = elapsedRealtime;
                this.suppressionReason = playbackSuppressionReason;
                StuckPlayerDetector.this.handler.removeMessages(4);
                StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(4, this.stuckSuppressedTimeoutMs);
            }
        }
    }

    public StuckPlayerDetector(Player player, Callback callback, Clock clock, int i, int i2, int i3, int i4) {
        this.player = player;
        this.callback = callback;
        this.clock = clock;
        this.handler = clock.createHandler(player.getApplicationLooper(), new pl2(this, (byte) 1));
        this.stuckBufferingDetector = new StuckBufferingDetector(i);
        this.stuckPlayingDetector = new StuckPlayingDetector(i2);
        this.stuckPlayingNotEndingDetector = new StuckPlayingNotEndingDetector(i3);
        this.stuckSuppressedDetector = new StuckSuppressedDetector(i4);
        Player.Listener listener = new Player.Listener() { // from class: androidx.media3.common.util.StuckPlayerDetector.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(Player player2, Player.Events events) {
                StuckPlayerDetector.this.onPlayerEvents();
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onCues(List list) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onRenderedFirstFrame() {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onAudioSessionIdChanged(int i5) {
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
            public final void onPlaybackStateChanged(int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onPlaybackSuppressionReasonChanged(int i5) {
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
            public final void onPositionDiscontinuity(int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onRepeatModeChanged(int i5) {
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
            public final void onDeviceVolumeChanged(int i5, boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onMediaItemTransition(MediaItem mediaItem, int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onPlayWhenReadyChanged(boolean z, int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onPlayerStateChanged(boolean z, int i5) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onSurfaceSizeChanged(int i5, int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onTimelineChanged(Timeline timeline, int i5) {
            }
        };
        this.playerListener = listener;
        player.addListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.stuckBufferingDetector.update();
            return true;
        }
        if (i == 2) {
            this.stuckPlayingDetector.update();
            return true;
        }
        if (i == 3) {
            this.stuckPlayingNotEndingDetector.update();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.stuckSuppressedDetector.update();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerEvents() {
        this.stuckBufferingDetector.update();
        this.stuckPlayingDetector.update();
        this.stuckPlayingNotEndingDetector.update();
        this.stuckSuppressedDetector.update();
    }

    public void release() {
        this.handler.removeCallbacksAndMessages(null);
        this.player.removeListener(this.playerListener);
    }
}
