package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface LoadControl {

    @Deprecated
    public static final MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Parameters {
        public final long bufferedDurationUs;
        public final long lastRebufferRealtimeMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final Timeline timeline;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z, boolean z2, long j3, long j4) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j;
            this.bufferedDurationUs = j2;
            this.playbackSpeed = f;
            this.playWhenReady = z;
            this.rebuffering = z2;
            this.targetLiveOffsetUs = j3;
            this.lastRebufferRealtimeMs = j4;
        }
    }

    Allocator getAllocator(PlayerId playerId);

    @Deprecated
    long getBackBufferDurationUs();

    long getBackBufferDurationUs(PlayerId playerId);

    @Deprecated
    void onPrepared();

    void onPrepared(PlayerId playerId);

    @Deprecated
    void onReleased();

    void onReleased(PlayerId playerId);

    @Deprecated
    void onStopped();

    void onStopped(PlayerId playerId);

    @Deprecated
    void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    void onTracksSelected(Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    boolean retainBackBufferFromKeyframe();

    boolean retainBackBufferFromKeyframe(PlayerId playerId);

    @Deprecated
    boolean shouldContinueLoading(long j, long j2, float f);

    boolean shouldContinueLoading(Parameters parameters);

    boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j);

    @Deprecated
    boolean shouldStartPlayback(long j, float f, boolean z, long j2);

    @Deprecated
    boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2);

    boolean shouldStartPlayback(Parameters parameters);
}
