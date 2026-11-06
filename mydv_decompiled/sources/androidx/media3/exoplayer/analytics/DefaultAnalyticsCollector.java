package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
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
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.aq0;
import defpackage.ay1;
import defpackage.bq0;
import defpackage.c34;
import defpackage.cq0;
import defpackage.dq0;
import defpackage.dy1;
import defpackage.eq0;
import defpackage.fq0;
import defpackage.h;
import defpackage.hq0;
import defpackage.hy1;
import defpackage.iy1;
import defpackage.kq0;
import defpackage.mq0;
import defpackage.nq0;
import defpackage.pq0;
import defpackage.qq0;
import defpackage.rq0;
import defpackage.rt0;
import defpackage.sp0;
import defpackage.sq0;
import defpackage.sr;
import defpackage.vq0;
import defpackage.wq0;
import defpackage.x24;
import defpackage.xq0;
import defpackage.yp0;
import defpackage.yq0;
import defpackage.zp0;
import defpackage.zq0;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private dy1 mediaPeriodQueue;
        private iy1 mediaPeriodTimelines;
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
            ay1 ay1Var = dy1.J;
            this.mediaPeriodQueue = x24.M;
            this.mediaPeriodTimelines = c34.O;
        }

        private void addTimelineForMediaPeriodId(hy1 hy1Var, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                hy1Var.b(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                hy1Var.b(mediaPeriodId, timeline2);
            }
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, dy1 dy1Var, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < dy1Var.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) dy1Var.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (dy1Var.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) {
                return true;
            }
            return !z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            dy1 dy1Var;
            hy1 hy1Var = new hy1(4);
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(hy1Var, this.playingMediaPeriod, timeline);
                if (!Objects.equals(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(hy1Var, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equals(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equals(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(hy1Var, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.mediaPeriodQueue.size();
                    dy1Var = this.mediaPeriodQueue;
                    if (i >= size) {
                        break;
                    }
                    addTimelineForMediaPeriodId(hy1Var, (MediaSource.MediaPeriodId) dy1Var.get(i), timeline);
                    i++;
                }
                if (!dy1Var.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(hy1Var, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = hy1Var.a(true);
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) rt0.z(this.mediaPeriodQueue);
        }

        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = dy1.p(list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                mediaPeriodId.getClass();
                this.readingMediaPeriod = mediaPeriodId;
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        clock.getClass();
        this.clock = clock;
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper());
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$4(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmKeysLoaded$65(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmKeysLoaded(eventTime);
        analyticsListener.onDrmKeysLoaded(eventTime, keyRequestInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$64(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$35(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLoadStarted$26(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$46(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$16(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$59(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$0(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
        analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_PLAYER_RELEASED, new zp0(generateCurrentPlayerMediaPeriodEventTime, (byte) 0));
        this.listeners.release();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void addListener(AnalyticsListener analyticsListener) {
        analyticsListener.getClass();
        this.listeners.add(analyticsListener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z = timeline.equals(this.player.getCurrentTimeline()) && i == this.player.getCurrentMediaItemIndex();
        long j = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z) {
                j = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                j = timeline.getWindow(i, this.window).getDefaultPositionMs();
            }
        } else if (z && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            j = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaPeriodId2, j, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new sr(generateCurrentPlayerMediaPeriodEventTime, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 20, new yp0(generateReadingMediaPeriodEventTime, audioAttributes, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new kq0(generateReadingMediaPeriodEventTime, exc, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new pq0(generateReadingMediaPeriodEventTime, str, j2, j, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(String str) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new dq0(generateReadingMediaPeriodEventTime, str, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DISABLED, new wq0(generatePlayingMediaPeriodEventTime, decoderCounters, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_ENABLED, new aq0(generateReadingMediaPeriodEventTime, decoderCounters, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new xq0(generateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new ListenerSet.Event() { // from class: oq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 21, new fq0(generateReadingMediaPeriodEventTime, i, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new kq0(generateReadingMediaPeriodEventTime, exc, (byte) 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new eq0(generateReadingMediaPeriodEventTime, audioTrackConfig, (byte) 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new yp0(generateReadingMediaPeriodEventTime, audioTrackConfig, (byte) 9));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new ListenerSet.Event() { // from class: lq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 13, new eq0(generateCurrentPlayerMediaPeriodEventTime, commands, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(generateLoadingMediaPeriodEventTime, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new ListenerSet.Event() { // from class: iq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(List<Cue> list) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new yp0(generateCurrentPlayerMediaPeriodEventTime, list, (byte) 5));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 29, new yp0(generateCurrentPlayerMediaPeriodEventTime, deviceInfo, (byte) 6));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 30, new ListenerSet.Event() { // from class: tq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceVolumeChanged(AnalyticsListener.EventTime.this, i, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new eq0(generateMediaPeriodEventTime, mediaLoadData, (byte) 3));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_LOADED, new yp0(generateMediaPeriodEventTime, keyRequestInfo, (byte) 4));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new zp0(generateMediaPeriodEventTime, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_RESTORED, new zp0(generateMediaPeriodEventTime, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new qq0(generateMediaPeriodEventTime, i2, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1024, new kq0(generateMediaPeriodEventTime, exc, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new zp0(generateMediaPeriodEventTime, (byte) 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i, long j) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new rq0(generatePlayingMediaPeriodEventTime, i, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onDroppedSeeksWhileScrubbing(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_DROPPED_SEEKS_WHILE_SCRUBBING, new qq0(generateCurrentPlayerMediaPeriodEventTime, i, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 3, new cq0(generateCurrentPlayerMediaPeriodEventTime, z, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new cq0(generateCurrentPlayerMediaPeriodEventTime, z, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1002, new vq0(generateMediaPeriodEventTime, loadEventInfo, mediaLoadData, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1001, new vq0(generateMediaPeriodEventTime, loadEventInfo, mediaLoadData, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1003, new mq0(generateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1000, new zq0(generateMediaPeriodEventTime, loadEventInfo, mediaLoadData, i2, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long j) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 18, new bq0(generateCurrentPlayerMediaPeriodEventTime, j, (byte) 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(final MediaItem mediaItem, final int i) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: gq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(AnalyticsListener.EventTime.this, mediaItem, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 14, new yq0(generateCurrentPlayerMediaPeriodEventTime, mediaMetadata, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 28, new yp0(generateCurrentPlayerMediaPeriodEventTime, metadata, (byte) 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 5, new nq0(generateCurrentPlayerMediaPeriodEventTime, z, i, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 12, new yp0(generateCurrentPlayerMediaPeriodEventTime, playbackParameters, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new fq0(generateCurrentPlayerMediaPeriodEventTime, i, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 6, new qq0(generateCurrentPlayerMediaPeriodEventTime, i, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new sq0(eventTimeForErrorEvent, playbackException, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new sq0(eventTimeForErrorEvent, playbackException, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z, int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new nq0(generateCurrentPlayerMediaPeriodEventTime, z, i, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 15, new yq0(generateCurrentPlayerMediaPeriodEventTime, mediaMetadata, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onPositionDiscontinuity(player);
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 11, new zq0(generateCurrentPlayerMediaPeriodEventTime, positionInfo, positionInfo2, i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 26, new ListenerSet.Event() { // from class: ar0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(AnalyticsListener.EventTime.this, obj, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i, final int i2, final boolean z) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new ListenerSet.Event() { // from class: uq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(AnalyticsListener.EventTime.this, i, i2, z);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 8, new qq0(generateCurrentPlayerMediaPeriodEventTime, i, (byte) 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 16, new bq0(generateCurrentPlayerMediaPeriodEventTime, j, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 17, new bq0(generateCurrentPlayerMediaPeriodEventTime, j, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 9, new hq0(generateCurrentPlayerMediaPeriodEventTime, z, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 23, new hq0(generateReadingMediaPeriodEventTime, z, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: br0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(AnalyticsListener.EventTime.this, i, i2);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onTimelineChanged(player);
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 0, new fq0(generateCurrentPlayerMediaPeriodEventTime, i, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 19, new yp0(generateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters, (byte) 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(Tracks tracks) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 2, new eq0(generateCurrentPlayerMediaPeriodEventTime, tracks, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1005, new yp0(generateMediaPeriodEventTime, mediaLoadData, (byte) 8));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new kq0(generateReadingMediaPeriodEventTime, exc, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new pq0(generateReadingMediaPeriodEventTime, str, j2, j, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(String str) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, new dq0(generateReadingMediaPeriodEventTime, str, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DISABLED, new wq0(generatePlayingMediaPeriodEventTime, decoderCounters, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_ENABLED, new aq0(generateReadingMediaPeriodEventTime, decoderCounters, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new rq0(generatePlayingMediaPeriodEventTime, j, i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new xq0(generateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 25, new eq0(generateReadingMediaPeriodEventTime, videoSize, (byte) 5));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: jq0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(AnalyticsListener.EventTime.this, f);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void release() {
        HandlerWrapper handlerWrapper = this.handler;
        handlerWrapper.getClass();
        handlerWrapper.post(new h(this, (byte) 8));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void setPlayer(Player player, Looper looper) {
        byte b = 1;
        sp0.z(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        player.getClass();
        this.player = player;
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, this.clock, new eq0(this, player, b));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.listeners.setThrowsWhenUsingWrongThread(z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, player);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(CueGroup cueGroup) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new yp0(generateCurrentPlayerMediaPeriodEventTime, cueGroup, (byte) 7));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final /* synthetic */ void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
