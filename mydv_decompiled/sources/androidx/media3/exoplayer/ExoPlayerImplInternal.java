package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.audio.AudioFocusManager;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.DefaultMediaClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.image.ImageMetadataListener;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.sp0;
import defpackage.wy0;
import defpackage.x24;
import defpackage.zl1;
import defpackage.zx1;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender, AudioFocusManager.PlayerControl, VideoFrameMetadataListener {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = Util.usToMs(Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    private static final long DURATION_TO_ADVANCE_READING_THRESHOLD_US = 10000000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_AUDIO_FOCUS_PLAYER_COMMAND = 33;
    private static final int MSG_AUDIO_FOCUS_VOLUME_MULTIPLIER = 34;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE = 37;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_AUDIO_ATTRIBUTES = 31;
    private static final int MSG_SET_AUDIO_SESSION_ID = 40;
    private static final int MSG_SET_ENFORCE_AD_PLAYBACK_ON_TIMELINE_REFRESH = 24;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_IMAGE_METADATA_LISTENER = 39;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SCRUBBING_MODE_ENABLED = 36;
    private static final int MSG_SET_SCRUBBING_MODE_PARAMETERS = 38;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 35;
    private static final int MSG_SET_VIDEO_OUTPUT = 30;
    private static final int MSG_SET_VOLUME = 32;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final int PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper applicationLooperHandler;
    private final AudioFocusManager audioFocusManager;
    private final long backBufferDurationUs;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private int droppedSeeksWhileScrubbing;
    private final boolean dynamicSchedulingEnabled;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean enforceAdPlaybackOnTimelineRefresh;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final boolean hasSecondaryRenderers;
    private boolean isPrewarmingDisabledUntilNextTransition;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final boolean perStreamMediaProgressionEnabled;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final PlaybackLooperProvider playbackLooperProvider;
    private final PlayerId playerId;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final MediaPeriodQueue queue;
    private SeekPosition queuedSeekWhileScrubbing;
    private final long releaseTimeoutMs;
    private boolean releasedOnApplicationThread;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final RendererHolder[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private boolean scrubbingModeEnabled;
    private SeekParameters scrubbingModeSeekParameters;
    private boolean seekIsPendingWhileScrubbing;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private long prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
    private float volume = 1.0f;
    private ScrubbingModeParameters scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
    private long playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
    private long lastRebufferRealtimeMs = C.TIME_UNSET;
    private Timeline lastPreloadPoolInvalidationTimeline = Timeline.EMPTY;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.newFromIndex = i3;
            this.shuffleOrder = shuffleOrder;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : Long.compare(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                sp0.o(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PositionUpdateForPlaylistChange {
        private final int discontinuityReason;
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        private final boolean periodPositionChanged;
        public final long periodPositionUs;
        private final boolean reportDiscontinuity;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
            this.periodPositionChanged = z4;
            this.reportDiscontinuity = z5;
            this.discontinuityReason = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    public ExoPlayerImplInternal(Context context, Renderer[] rendererArr, Renderer[] rendererArr2, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, boolean z3, boolean z4, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, PlaybackLooperProvider playbackLooperProvider, ExoPlayer.PreloadConfiguration preloadConfiguration, final VideoFrameMetadataListener videoFrameMetadataListener, boolean z5) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.dynamicSchedulingEnabled = z3;
        this.perStreamMediaProgressionEnabled = z4;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.enforceAdPlaybackOnTimelineRefresh = z5;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        this.renderers = new RendererHolder[rendererArr.length];
        boolean z6 = false;
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].init(i2, playerId, clock);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i2].setListener(rendererCapabilitiesListener);
            }
            Renderer renderer = rendererArr2[i2];
            if (renderer != null) {
                renderer.init(i2, playerId, clock);
                z6 = true;
            }
            this.renderers[i2] = new RendererHolder(rendererArr[i2], rendererArr2[i2], i2);
        }
        this.hasSecondaryRenderers = z6;
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        HandlerWrapper createHandler = clock.createHandler(looper, null);
        this.applicationLooperHandler = createHandler;
        this.queue = new MediaPeriodQueue(analyticsCollector, createHandler, new e(this, (byte) 2), preloadConfiguration, rendererArr.length);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, createHandler, playerId, bandwidthMeter);
        PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        Looper obtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = obtainLooper;
        HandlerWrapper createHandler2 = clock.createHandler(obtainLooper, this);
        this.handler = createHandler2;
        this.audioFocusManager = new AudioFocusManager(context, obtainLooper, this);
        createHandler2.obtainMessage(35, new VideoFrameMetadataListener() { // from class: androidx.media3.exoplayer.y
            @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
            public final void onVideoFrameAboutToBeRendered(long j2, long j3, Format format, MediaFormat mediaFormat) {
                ExoPlayerImplInternal.this.lambda$new$0(videoFrameMetadataListener, j2, j3, format, mediaFormat);
            }
        }).sendToTarget();
        createHandler2.obtainMessage(39, new ImageMetadataListener() { // from class: androidx.media3.exoplayer.z
            @Override // androidx.media3.exoplayer.image.ImageMetadataListener
            public final void onImageAboutToBeAvailable(long j2, Format format) {
                ExoPlayerImplInternal.this.lambda$new$1(j2, format);
            }
        }).sendToTarget();
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].enableMayRenderStartOfStream();
            }
        }
    }

    private void applyScrubbingModeParameters() {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setScrubbingMode(this.scrubbingModeEnabled ? this.scrubbingModeParameters : null);
        }
    }

    private boolean areAllRenderersInCorrectState(MediaPeriodHolder mediaPeriodHolder) {
        for (int i = 0; i < this.renderers.length; i++) {
            if (!mediaPeriodHolder.isRendererInCorrectState(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            if (rendererHolder.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    private void attemptRendererErrorRecovery() {
        reselectTracksInternalAndSeek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPeriodHolder createMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, long j) {
        return new MediaPeriodHolder(this.rendererCapabilities, j, this.trackSelector, this.loadControl.getAllocator(this.playerId), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs, this.perStreamMediaProgressionEnabled);
    }

    private void deliverMessage(PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableAndResetPrewarmingRenderers() {
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (RendererHolder rendererHolder : this.renderers) {
                int enabledRendererCount = rendererHolder.getEnabledRendererCount();
                rendererHolder.disablePrewarming(this.mediaClock);
                this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            }
            this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
        }
    }

    private void disableRenderer(int i) {
        int enabledRendererCount = this.renderers[i].getEnabledRendererCount();
        this.renderers[i].disable(this.mediaClock);
        maybeTriggerOnRendererReadyChanged(i, false);
        this.enabledRendererCount -= enabledRendererCount;
    }

    private void disableRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            disableRenderer(i);
        }
        this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doSomeWork() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.doSomeWork():void");
    }

    private void enableRenderer(MediaPeriodHolder mediaPeriodHolder, int i, boolean z, long j) {
        RendererHolder rendererHolder = this.renderers[i];
        if (rendererHolder.isRendererEnabled()) {
            return;
        }
        boolean z2 = mediaPeriodHolder == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i];
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        rendererHolder.enable(rendererConfiguration, exoTrackSelection, mediaPeriodHolder.sampleStreams[i], this.rendererPositionUs, z4, z2, j, mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id, this.mediaClock);
        rendererHolder.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (ExoPlayerImplInternal.this.isDynamicSchedulingEnabled() || ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        }, mediaPeriodHolder);
        if (z3 && z2) {
            rendererHolder.start();
        }
    }

    private void enableRenderers(boolean[] zArr, long j) {
        ExoPlayerImplInternal exoPlayerImplInternal;
        long j2;
        sp0.z(!isReadingAhead());
        MediaPeriodHolder earliestReadingPeriod = this.queue.getEarliestReadingPeriod();
        TrackSelectorResult trackSelectorResult = earliestReadingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].reset();
            }
        }
        int i2 = 0;
        while (i2 < this.renderers.length) {
            if (!trackSelectorResult.isRendererEnabled(i2) || this.renderers[i2].isReadingFromPeriod(earliestReadingPeriod)) {
                exoPlayerImplInternal = this;
                j2 = j;
            } else {
                exoPlayerImplInternal = this;
                j2 = j;
                exoPlayerImplInternal.enableRenderer(earliestReadingPeriod, i2, zArr[i2], j2);
            }
            i2++;
            this = exoPlayerImplInternal;
            j = j2;
        }
    }

    private dy1 extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        zx1 zx1Var = new zx1(4);
        boolean z = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    zx1Var.c(new Metadata(new Metadata.Entry[0]));
                } else {
                    zx1Var.c(metadata);
                    z = true;
                }
            }
        }
        if (z) {
            return zx1Var.f();
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getDurationToMediaPeriodUs(MediaPeriodHolder mediaPeriodHolder) {
        sp0.z(mediaPeriodHolder.prepared);
        return (long) ((mediaPeriodHolder.getStartPositionRendererTime() - this.rendererPositionUs) / this.mediaClock.getPlaybackParameters().speed);
    }

    private long getDynamicSchedulingWakeUpIntervalMs() {
        long j = this.playbackInfo.playbackState == 3 ? 1000L : BUFFERING_MAXIMUM_INTERVAL_MS;
        for (RendererHolder rendererHolder : this.renderers) {
            j = Math.min(j, Util.usToMs(rendererHolder.getMinDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
        }
        if (!this.playbackInfo.isPlaying()) {
            return j;
        }
        MediaPeriodHolder next = this.queue.getPlayingPeriod() != null ? this.queue.getPlayingPeriod().getNext() : null;
        if (next != null) {
            return (((float) Util.msToUs(j)) * this.playbackInfo.playbackParameters.speed) + ((float) this.rendererPositionUs) >= ((float) next.getStartPositionRendererTime()) ? Math.min(j, BUFFERING_MAXIMUM_INTERVAL_MS) : j;
        }
        return j;
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (this.period.getPositionInWindowUs() + j);
            }
        }
        return C.TIME_UNSET;
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(this.playbackInfo, timeline, periodPositionUs.first, 0L, true, false);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(longValue));
    }

    private long getRendererReadingPositionUs(MediaPeriodHolder mediaPeriodHolder, int i) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        return (mediaPeriodHolder.prepared && this.renderers[i].isReadingFromPeriod(mediaPeriodHolder)) ? this.renderers[i].getReadingPositionUs(mediaPeriodHolder) : mediaPeriodHolder.getRendererOffset();
    }

    private SeekParameters getSeekParameters(long j) {
        ScrubbingModeParameters scrubbingModeParameters;
        Double d;
        if (!this.scrubbingModeEnabled || j == C.TIME_UNSET || (d = (scrubbingModeParameters = this.scrubbingModeParameters).fractionalSeekToleranceBefore) == null || scrubbingModeParameters.fractionalSeekToleranceAfter == null) {
            return this.seekParameters;
        }
        double d2 = j;
        double doubleValue = d.doubleValue() * d2;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long e = wy0.e(doubleValue, roundingMode);
        long e2 = wy0.e(this.scrubbingModeParameters.fractionalSeekToleranceAfter.doubleValue() * d2, roundingMode);
        SeekParameters seekParameters = this.scrubbingModeSeekParameters;
        if (seekParameters != null && seekParameters.toleranceBeforeUs == e && seekParameters.toleranceAfterUs == e2) {
            return seekParameters;
        }
        SeekParameters seekParameters2 = new SeekParameters(e, e2);
        this.scrubbingModeSeekParameters = seekParameters2;
        return seekParameters2;
    }

    private long getStaticSchedulingWakeUpIntervalMs() {
        if (this.playbackInfo.playbackState != 3 || shouldPlayWhenReady()) {
            return BUFFERING_MAXIMUM_INTERVAL_MS;
        }
        return 1000L;
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handleAudioFocusPlayerCommandInternal(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, i, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void handleAudioFocusVolumeMultiplierChange() {
        setVolumeInternal(this.volume);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        boolean isLoading = this.queue.isLoading(mediaPeriod);
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        if (isLoading) {
            mediaPeriodQueue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (mediaPeriodQueue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handleIoException(IOException iOException, int i) {
        ExoPlaybackException createForSource = ExoPlaybackException.createForSource(iOException, i);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        Log.e(TAG, "Playback error", createForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean equals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!equals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!equals || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleLoadingPeriodPrepared(MediaPeriodHolder mediaPeriodHolder) {
        ExoPlayerImplInternal exoPlayerImplInternal;
        if (!mediaPeriodHolder.prepared) {
            float f = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs, true);
            enableRenderers();
            setAllRenderersToCorrectState(mediaPeriodHolder);
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j = mediaPeriodHolder.info.startPositionUs;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j, playbackInfo2.requestedContentPositionUs, j, false, 5);
        } else {
            exoPlayerImplInternal = this;
        }
        exoPlayerImplInternal.maybeContinueLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline, boolean):void");
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) {
        boolean isLoading = this.queue.isLoading(mediaPeriod);
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        if (isLoading) {
            MediaPeriodHolder loadingPeriod = mediaPeriodQueue.getLoadingPeriod();
            loadingPeriod.getClass();
            handleLoadingPeriodPrepared(loadingPeriod);
            return;
        }
        MediaPeriodHolder preloadHolderByMediaPeriod = mediaPeriodQueue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            sp0.z(!preloadHolderByMediaPeriod.prepared);
            float f = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setPlaybackSpeed(f, playbackParameters.speed);
        }
    }

    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            TrackGroupArray trackGroups = playingPeriod == null ? TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j2) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j2);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = extractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                ay1 ay1Var = dy1.J;
                list2 = x24.M;
            }
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, j3, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean haveAllRenderersFinishedReading(MediaPeriodHolder mediaPeriodHolder) {
        if (!mediaPeriodHolder.prepared) {
            return false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            if (!rendererHolder.hasFinishedReadingFromPeriod(mediaPeriodHolder)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDynamicSchedulingEnabled() {
        if (this.dynamicSchedulingEnabled) {
            return true;
        }
        return this.scrubbingModeEnabled && this.scrubbingModeParameters.shouldEnableDynamicScheduling;
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(Timeline timeline, boolean z, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSource.MediaPeriodId mediaPeriodId2, long j2, Timeline.Period period) {
        if (!z && j == j2 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            timeline.getPeriodByUid(mediaPeriodId2.periodUid, period);
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLoadingPossible(MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private boolean isReadingAhead() {
        for (int i = 0; i < this.renderers.length; i++) {
            if (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRendererPrewarming(int i) {
        if (this.hasSecondaryRenderers) {
            return this.renderers[i].isPrewarming();
        }
        return false;
    }

    private boolean isRendererPrewarmingMediaPeriod(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (this.queue.getPrewarmingPeriod(i) == null || !this.queue.getPrewarmingPeriod(i).info.id.equals(mediaPeriodId)) {
            return false;
        }
        return this.renderers[i].isPrewarmingPeriod(this.queue.getPrewarmingPeriod(i));
    }

    private boolean isSafeToAdvancePerStream(MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        next.getClass();
        if (mediaPeriodHolder.info.id.isAd() != next.info.id.isAd()) {
            return false;
        }
        Timeline.Window window = new Timeline.Window();
        this.playbackInfo.timeline.getWindow(this.playbackInfo.timeline.getPeriodByUid(mediaPeriodHolder.info.id.periodUid, this.period).windowIndex, window);
        boolean isLive = window.isLive();
        this.playbackInfo.timeline.getWindow(this.playbackInfo.timeline.getPeriodByUid(next.info.id.periodUid, this.period).windowIndex, window);
        return (isLive || window.isLive()) ? false : true;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j == C.TIME_UNSET || this.playbackInfo.positionUs < j || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeTriggerOnRendererReadyChanged$2(int i, boolean z) {
        this.analyticsCollector.onRendererReadyChanged(i, this.renderers[i].getTrackType(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(VideoFrameMetadataListener videoFrameMetadataListener, long j, long j2, Format format, MediaFormat mediaFormat) {
        videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
        onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(long j, Format format) {
        if (this.seekIsPendingWhileScrubbing) {
            this.handler.obtainMessage(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$4(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.e(TAG, "Unexpected error delivering message on external thread.", e);
            zl1.k(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setScrubbingModeEnabledInternal$3(int i) {
        this.analyticsCollector.onDroppedSeeksWhileScrubbing(i);
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.getClass();
            loadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(loadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playerId, this.playbackInfo.timeline, preloadingPeriod.info.id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.prepareCalled) {
                        preloadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    }
                }
            }
        }
    }

    private void maybeNotifyPlaybackInfoChanged(int i) {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            if (!this.playbackInfo.timeline.isEmpty()) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                boolean z = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid) != -1;
                Locale locale = Locale.US;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                sp0.A(z, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", playbackInfo2.periodId.periodUid, playbackInfo2.timeline.getClass().getName(), Integer.valueOf(this.playbackInfo.timeline.getWindowCount()), Integer.valueOf(i)));
            }
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void maybePrewarmRenderer(int i) {
        MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod(i);
        if (prewarmingPeriod != null && prewarmingPeriod.getTrackSelectorResult().isRendererEnabled(i) && this.renderers[i].hasSecondary() && !this.renderers[i].isPrewarming()) {
            this.renderers[i].startPrewarming();
            enableRenderer(prewarmingPeriod, i, false, prewarmingPeriod.getStartPositionRendererTime());
        }
    }

    private void maybePrewarmRenderers() {
        ExoPlayerImplInternal exoPlayerImplInternal;
        MediaPeriodHolder earliestPrewarmingPeriod = this.queue.getEarliestPrewarmingPeriod();
        if (earliestPrewarmingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = earliestPrewarmingPeriod.getTrackSelectorResult();
        int i = 0;
        while (i < this.renderers.length) {
            if (trackSelectorResult.isRendererEnabled(i) && this.renderers[i].hasSecondary() && !this.renderers[i].isPrewarming()) {
                this.renderers[i].startPrewarming();
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.enableRenderer(earliestPrewarmingPeriod, i, false, earliestPrewarmingPeriod.getStartPositionRendererTime());
            } else {
                exoPlayerImplInternal = this;
            }
            i++;
            this = exoPlayerImplInternal;
        }
        ExoPlayerImplInternal exoPlayerImplInternal2 = this;
        if (exoPlayerImplInternal2.areRenderersPrewarming()) {
            exoPlayerImplInternal2.prewarmingMediaPeriodDiscontinuity = earliestPrewarmingPeriod.mediaPeriod.readDiscontinuity();
            if (earliestPrewarmingPeriod.isFullyBuffered()) {
                return;
            }
            exoPlayerImplInternal2.queue.removeAfter(earliestPrewarmingPeriod);
            exoPlayerImplInternal2.handleLoadingMediaPeriodChanged(false);
            exoPlayerImplInternal2.maybeContinueLoading();
        }
    }

    private void maybeThrowRendererStreamError(int i) {
        RendererHolder rendererHolder = this.renderers[i];
        try {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            playingPeriod.getClass();
            rendererHolder.maybeThrowStreamError(playingPeriod);
        } catch (IOException | RuntimeException e) {
            int trackType = rendererHolder.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e;
            }
            TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
            Log.e(TAG, "Disabling track due to error: " + Format.toLogString(trackSelectorResult.selections[i].getSelectedFormat()), e);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i] = null;
            trackSelectorResult2.selections[i] = null;
            disableRenderer(i);
            this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i, final boolean z) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.applicationLooperHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.x
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.this.lambda$maybeTriggerOnRendererReadyChanged$2(i, z);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeTriggerPendingMessages(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private boolean maybeUpdateLoadingPeriod() {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!enqueueNextMediaPeriodHolder.prepareCalled) {
                enqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (enqueueNextMediaPeriodHolder.prepared) {
                this.handler.obtainMessage(8, enqueueNextMediaPeriodHolder.mediaPeriod).sendToTarget();
            }
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs, true);
            }
            handleLoadingMediaPeriodChanged(false);
            z = true;
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
        updateIsLoading();
        return z;
    }

    private void maybeUpdateOffloadScheduling() {
        MediaPeriodHolder playingPeriod;
        boolean z;
        if (isReadingAhead() || (playingPeriod = this.queue.getPlayingPeriod()) == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (true) {
            if (i >= this.renderers.length) {
                z = true;
                break;
            }
            if (trackSelectorResult.isRendererEnabled(i)) {
                if (this.renderers[i].getTrackType() != 1) {
                    z = false;
                    break;
                } else if (trackSelectorResult.rendererConfigurations[i].offloadModePreferred != 0) {
                    z3 = true;
                }
            }
            i++;
        }
        if (z3 && z) {
            z2 = true;
        }
        setOffloadSchedulingEnabled(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeUpdatePlayingPeriod() {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.shouldAdvancePlayingPeriod()
            if (r2 == 0) goto L8e
            r2 = -1
            if (r1 == 0) goto Le
            r15.maybeNotifyPlaybackInfoChanged(r2)
        Le:
            r15.isPrewarmingDisabledUntilNextTransition = r0
            androidx.media3.exoplayer.MediaPeriodQueue r1 = r15.queue
            androidx.media3.exoplayer.MediaPeriodHolder r1 = r1.advancePlayingPeriod()
            r1.getClass()
            androidx.media3.exoplayer.PlaybackInfo r3 = r15.playbackInfo
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = r3.periodId
            java.lang.Object r3 = r3.periodUid
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r4 = r4.id
            java.lang.Object r4 = r4.periodUid
            boolean r3 = r3.equals(r4)
            r4 = 1
            if (r3 == 0) goto L44
            androidx.media3.exoplayer.PlaybackInfo r3 = r15.playbackInfo
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = r3.periodId
            int r5 = r3.adGroupIndex
            if (r5 != r2) goto L44
            androidx.media3.exoplayer.MediaPeriodInfo r5 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r5 = r5.id
            int r6 = r5.adGroupIndex
            if (r6 != r2) goto L44
            int r2 = r3.nextAdGroupIndex
            int r3 = r5.nextAdGroupIndex
            if (r2 == r3) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = r0
        L45:
            androidx.media3.exoplayer.MediaPeriodInfo r3 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r6 = r3.id
            long r7 = r3.startPositionUs
            long r9 = r3.requestedContentPositionUs
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.PlaybackInfo r15 = r5.handlePositionDiscontinuity(r6, r7, r9, r11, r13, r14)
            r5.playbackInfo = r15
            r5.resetPendingPauseAtEndOfPeriod()
            r5.updatePlaybackPositions()
            r15 = r0
        L5f:
            androidx.media3.exoplayer.RendererHolder[] r2 = r5.renderers
            int r2 = r2.length
            if (r15 >= r2) goto L7d
            boolean r2 = r5.isRendererPrewarming(r15)
            if (r2 == 0) goto L7a
            androidx.media3.exoplayer.MediaPeriodQueue r2 = r5.queue
            androidx.media3.exoplayer.MediaPeriodHolder r2 = r2.getPrewarmingPeriod(r15)
            if (r1 == r2) goto L73
            goto L7a
        L73:
            androidx.media3.exoplayer.RendererHolder[] r2 = r5.renderers
            r2 = r2[r15]
            r2.maybeHandlePrewarmingTransition()
        L7a:
            int r15 = r15 + 1
            goto L5f
        L7d:
            androidx.media3.exoplayer.PlaybackInfo r15 = r5.playbackInfo
            int r15 = r15.playbackState
            r1 = 3
            if (r15 != r1) goto L87
            r5.startRenderers()
        L87:
            r5.allowRenderersToRenderStartOfStreams()
            r1 = r4
            r15 = r5
            goto L2
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.maybeUpdatePlayingPeriod():void");
    }

    private void maybeUpdatePreloadPeriods(boolean z) {
        if (this.preloadConfiguration.targetPreloadDurationUs == C.TIME_UNSET) {
            return;
        }
        if (z || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            Timeline timeline = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = timeline;
            this.queue.invalidatePreloadPool(timeline);
        }
        maybeContinuePreloading();
    }

    private void maybeUpdatePrewarmingPeriod() {
        MediaPeriodHolder earliestPrewarmingPeriod;
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition || areRenderersPrewarming() || (earliestPrewarmingPeriod = this.queue.getEarliestPrewarmingPeriod()) == null || earliestPrewarmingPeriod != this.queue.getEarliestReadingPeriod() || earliestPrewarmingPeriod.getNext() == null || !earliestPrewarmingPeriod.getNext().prepared || getDurationToMediaPeriodUs(earliestPrewarmingPeriod.getNext()) > DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
            return;
        }
        this.queue.advancePrewarmingPeriod();
        maybePrewarmRenderers();
    }

    private void maybeUpdatePrewarmingPeriods() {
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition) {
            return;
        }
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                return;
            }
            if (rendererHolderArr[i].hasSecondary()) {
                maybeUpdatePrewarmingPeriod(i);
            }
            i++;
        }
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder earliestReadingPeriod = this.queue.getEarliestReadingPeriod();
        if (earliestReadingPeriod == null) {
            return;
        }
        int i = 0;
        if (earliestReadingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (earliestReadingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                RendererHolder[] rendererHolderArr = this.renderers;
                int length = rendererHolderArr.length;
                while (i < length) {
                    RendererHolder rendererHolder = rendererHolderArr[i];
                    if (rendererHolder.isReadingFromPeriod(earliestReadingPeriod) && rendererHolder.hasReadPeriodToEnd(earliestReadingPeriod)) {
                        long j = earliestReadingPeriod.info.durationUs;
                        rendererHolder.setCurrentStreamFinal(earliestReadingPeriod, (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : earliestReadingPeriod.getRendererOffset() + earliestReadingPeriod.info.durationUs);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (haveAllRenderersFinishedReading(this.queue.getEarliestReadingPeriod())) {
            if (areRenderersPrewarming() && this.queue.getEarliestPrewarmingPeriod() == this.queue.getEarliestReadingPeriod()) {
                return;
            }
            if (earliestReadingPeriod.getNext().prepared || this.rendererPositionUs >= earliestReadingPeriod.getNext().getStartPositionRendererTime()) {
                if (!earliestReadingPeriod.getNext().prepared || getDurationToMediaPeriodUs(earliestReadingPeriod.getNext()) <= DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
                    TrackSelectorResult trackSelectorResult = earliestReadingPeriod.getTrackSelectorResult();
                    MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                    Timeline timeline = this.playbackInfo.timeline;
                    updatePlaybackSpeedSettingsForNewPeriod(timeline, advanceReadingPeriod.info.id, timeline, earliestReadingPeriod.info.id, C.TIME_UNSET, false);
                    if (advanceReadingPeriod.prepared && ((this.hasSecondaryRenderers && this.prewarmingMediaPeriodDiscontinuity != C.TIME_UNSET) || advanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET)) {
                        this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
                        boolean z = this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition;
                        if (z) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.renderers.length) {
                                    if (trackSelectorResult2.isRendererEnabled(i2) && this.renderers[i2].getTrackType() != -2 && !MimeTypes.allSamplesAreSyncSamples(trackSelectorResult2.selections[i2].getSelectedFormat().sampleMimeType, trackSelectorResult2.selections[i2].getSelectedFormat().codecs) && !this.renderers[i2].isPrewarming()) {
                                        z = false;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            setAllNonPrewarmingRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                            if (advanceReadingPeriod.isFullyBuffered()) {
                                return;
                            }
                            this.queue.removeAfter(advanceReadingPeriod);
                            handleLoadingMediaPeriodChanged(false);
                            maybeContinueLoading();
                            return;
                        }
                    }
                    RendererHolder[] rendererHolderArr2 = this.renderers;
                    int length2 = rendererHolderArr2.length;
                    while (i < length2) {
                        rendererHolderArr2[i].maybeSetOldStreamToFinal(trackSelectorResult, trackSelectorResult2, advanceReadingPeriod.getStartPositionRendererTime());
                        i++;
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingPeriods() {
        for (int i = 0; i < this.renderers.length; i++) {
            maybeUpdateReadingPeriod(i);
        }
    }

    private void maybeUpdateReadingRenderers() {
        MediaPeriodHolder earliestReadingPeriod = this.queue.getEarliestReadingPeriod();
        if (earliestReadingPeriod == null || this.queue.getPlayingPeriod() == earliestReadingPeriod || areAllRenderersInCorrectState(earliestReadingPeriod) || !updateRenderersForTransition()) {
            return;
        }
        setAllRenderersToCorrectState(this.queue.getEarliestReadingPeriod());
    }

    private void maybeUpdateReadingRenderersPerStream() {
        for (int i = 0; i < this.renderers.length; i++) {
            MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod(i);
            if (readingPeriod != null && this.queue.getPlayingPeriod() != readingPeriod && !readingPeriod.isRendererInCorrectState(i) && updateRendererForTransition(i)) {
                this.queue.getReadingPeriod(i).setRendererToCorrectState(i);
            }
        }
    }

    private void mediaSourceListUpdateRequestedInternal() {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        updatePlayWhenReadyWithAudioFocus();
        this.mediaSourceList.prepare();
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal(ConditionVariable conditionVariable) {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            this.audioFocusManager.release();
            this.trackSelector.release();
            setState(1);
        } finally {
            this.handler.removeCallbacksAndMessages(null);
            this.playbackLooperProvider.releaseLooper();
            conditionVariable.open();
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            this.renderers[i].release();
        }
    }

    private void removeMediaItemsInternal(int i, int i2, ShuffleOrder shuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder), false);
    }

    private void reselectTracksInternal() {
        int i;
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder latestReadingPeriod = this.queue.getLatestReadingPeriod();
        TrackSelectorResult trackSelectorResult = null;
        boolean z = true;
        while (playingPeriod != null && playingPeriod.prepared) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            TrackSelectorResult trackSelectorResult2 = playingPeriod == this.queue.getPlayingPeriod() ? selectTracks : trackSelectorResult;
            if (!selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                MediaPeriodQueue mediaPeriodQueue = this.queue;
                if (z) {
                    MediaPeriodHolder playingPeriod2 = mediaPeriodQueue.getPlayingPeriod();
                    boolean z2 = (this.queue.removeAfter(playingPeriod2) & 1) != 0;
                    boolean[] zArr = new boolean[this.renderers.length];
                    trackSelectorResult2.getClass();
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, z2, zArr);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z3 = (playbackInfo2.playbackState == 4 || applyTrackSelection == playbackInfo2.positionUs) ? false : true;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    i = 4;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, applyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z3, 5);
                    if (z3) {
                        resetRendererPosition(applyTrackSelection, true);
                    }
                    disableAndResetPrewarmingRenderers();
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i2 = 0;
                    while (true) {
                        RendererHolder[] rendererHolderArr = this.renderers;
                        if (i2 >= rendererHolderArr.length) {
                            break;
                        }
                        int enabledRendererCount = rendererHolderArr[i2].getEnabledRendererCount();
                        zArr2[i2] = this.renderers[i2].isRendererEnabled();
                        this.renderers[i2].maybeDisableOrResetPosition(playingPeriod2.sampleStreams[i2], this.mediaClock, this.rendererPositionUs, zArr[i2]);
                        if (enabledRendererCount - this.renderers[i2].getEnabledRendererCount() > 0) {
                            maybeTriggerOnRendererReadyChanged(i2, false);
                        }
                        this.enabledRendererCount -= enabledRendererCount - this.renderers[i2].getEnabledRendererCount();
                        i2++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                    setAllRenderersToCorrectState(playingPeriod2);
                } else {
                    i = 4;
                    mediaPeriodQueue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        long max = Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs));
                        if (this.hasSecondaryRenderers) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= this.renderers.length) {
                                    break;
                                }
                                if (this.queue.getPrewarmingPeriod(i3) == playingPeriod && this.renderers[i3].isPrewarmingPeriod(playingPeriod)) {
                                    disableAndResetPrewarmingRenderers();
                                    break;
                                }
                                i3++;
                            }
                        }
                        playingPeriod.applyTrackSelection(selectTracks, max, false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != i) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            trackSelectorResult = trackSelectorResult2;
            if (playingPeriod == latestReadingPeriod) {
                z = false;
            }
            playingPeriod = playingPeriod.getNext();
        }
    }

    private void reselectTracksInternalAndSeek() {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resetInternal(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.resetInternal(boolean, boolean, boolean, boolean):void");
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j, boolean z) {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.resetPosition(playingPeriod, this.rendererPositionUs, z);
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i, period, true).uid;
        long j = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i, j != C.TIME_UNSET ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPositionUs.first), ((Long) resolveSeekPositionUs.second).longValue(), resolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, period.getPositionInWindowUs() + pendingMessageInfo.resolvedPeriodTimeUs);
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (true) {
            ArrayList<PendingMessageInfo> arrayList = this.pendingMessages;
            if (size < 0) {
                Collections.sort(arrayList);
                return;
            }
            Timeline timeline3 = timeline;
            Timeline timeline4 = timeline2;
            if (!resolvePendingMessagePosition(arrayList.get(size), timeline3, timeline4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025b, code lost:
    
        if ((r4 + r11) <= r9) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(androidx.media3.common.Timeline r41, androidx.media3.exoplayer.PlaybackInfo r42, androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition r43, androidx.media3.exoplayer.MediaPeriodQueue r44, int r45, boolean r46, boolean r47, androidx.media3.common.Timeline.Window r48, androidx.media3.common.Timeline.Period r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.resolvePositionForPlaylistChange(androidx.media3.common.Timeline, androidx.media3.exoplayer.PlaybackInfo, androidx.media3.exoplayer.ExoPlayerImplInternal$SeekPosition, androidx.media3.exoplayer.MediaPeriodQueue, int, boolean, boolean, androidx.media3.common.Timeline$Window, androidx.media3.common.Timeline$Period, boolean):androidx.media3.exoplayer.ExoPlayerImplInternal$PositionUpdateForPlaylistChange");
    }

    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPositionUs;
        Timeline timeline2;
        int resolveSubsequentPeriod;
        Timeline timeline3 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline3.isEmpty()) {
            timeline3 = timeline;
        }
        try {
            periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            timeline2 = timeline3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline2)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline2.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline2, timeline)) != -1) {
            return timeline.getPeriodPositionUs(window, period, resolveSubsequentPeriod, C.TIME_UNSET);
        }
        return null;
    }

    public static int resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline.Period period2;
        Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        int i2 = 0;
        for (int i3 = 0; i3 < timeline2.getWindowCount(); i3++) {
            if (timeline2.getWindow(i3, window).uid.equals(obj2)) {
                return i3;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i4 = indexOfPeriod;
        int i5 = -1;
        while (i2 < periodCount && i5 == -1) {
            Timeline.Window window2 = window;
            period2 = period;
            int i6 = i;
            boolean z2 = z;
            Timeline timeline3 = timeline;
            i4 = timeline3.getNextPeriodIndex(i4, period2, window2, i6, z2);
            if (i4 == -1) {
                break;
            }
            i5 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(i4));
            i2++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i = i6;
            z = z2;
        }
        period2 = period;
        if (i5 == -1) {
            return -1;
        }
        return timeline2.getPeriod(i5, period2).windowIndex;
    }

    private void scheduleNextWork(long j) {
        this.handler.sendEmptyMessageAtTime(2, j + (isDynamicSchedulingEnabled() ? getDynamicSchedulingWakeUpIntervalMs() : getStaticSchedulingWakeUpIntervalMs()));
    }

    private void seekToCurrentPosition(boolean z) {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    private void seekToInternal(SeekPosition seekPosition) {
        long j;
        long j2;
        long j3;
        MediaSource.MediaPeriodId mediaPeriodId;
        boolean z;
        MediaSource.MediaPeriodId mediaPeriodId2;
        boolean z2;
        long j4;
        long j5;
        long seekToPeriodPosition;
        PlaybackInfo playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId3;
        Timeline timeline;
        long j6;
        MediaSource.MediaPeriodId mediaPeriodId4;
        long j7;
        PlaybackInfo playbackInfo2;
        int i;
        int i2;
        long j8;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        if (exoPlayerImplInternal.seekIsPendingWhileScrubbing) {
            if (exoPlayerImplInternal.queuedSeekWhileScrubbing != null) {
                exoPlayerImplInternal.droppedSeeksWhileScrubbing++;
                exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            exoPlayerImplInternal.queuedSeekWhileScrubbing = seekPosition;
            return;
        }
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        if (resolveSeekPositionUs == null) {
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
            mediaPeriodId = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            j3 = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            z = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
            j2 = -9223372036854775807L;
            j = 0;
        } else {
            Object obj = resolveSeekPositionUs.first;
            long longValue = ((Long) resolveSeekPositionUs.second).longValue();
            long j9 = seekPosition.windowPositionUs == C.TIME_UNSET ? -9223372036854775807L : longValue;
            MediaPeriodQueue mediaPeriodQueue = exoPlayerImplInternal.queue;
            PlaybackInfo playbackInfo3 = exoPlayerImplInternal.playbackInfo;
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(playbackInfo3, playbackInfo3.timeline, obj, longValue, true, false);
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                long adResumePositionUs = exoPlayerImplInternal.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? exoPlayerImplInternal.period.getAdResumePositionUs() : 0L;
                AdPlaybackState.AdGroup adGroup = exoPlayerImplInternal.period.adPlaybackState.getAdGroup(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex);
                j = 0;
                long max = Math.max(j9, adGroup.timeUs + adGroup.contentResumeOffsetUs);
                j3 = adResumePositionUs;
                mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                z = true;
                j2 = max;
            } else {
                j = 0;
                j2 = j9;
                j3 = longValue;
                mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                z = seekPosition.windowPositionUs == C.TIME_UNSET;
            }
        }
        try {
        } catch (Throwable th) {
            th = th;
            mediaPeriodId2 = mediaPeriodId;
        }
        try {
            if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
            } else {
                PlaybackInfo playbackInfo4 = exoPlayerImplInternal.playbackInfo;
                if (resolveSeekPositionUs == null) {
                    if (playbackInfo4.playbackState != 1) {
                        exoPlayerImplInternal.setState(4);
                    }
                    exoPlayerImplInternal.resetInternal(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (mediaPeriodId.equals(playbackInfo4.periodId)) {
                                        MediaPeriodHolder playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                                        j5 = (playingPeriod == null || !playingPeriod.prepared || j3 == j) ? j3 : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(j3, exoPlayerImplInternal.getSeekParameters(exoPlayerImplInternal.window.durationUs));
                                        if (Util.usToMs(j5) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs) || ((i = (playbackInfo2 = exoPlayerImplInternal.playbackInfo).playbackState) != 2 && i != 3)) {
                                            mediaPeriodId2 = mediaPeriodId;
                                        }
                                        j7 = playbackInfo2.positionUs;
                                        mediaPeriodId4 = mediaPeriodId;
                                        i2 = 2;
                                        z2 = z;
                                        j8 = j7;
                                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId4, j7, j2, j8, z2, i2);
                                    }
                                    mediaPeriodId2 = mediaPeriodId;
                                    j5 = j3;
                                    exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId3, timeline, playbackInfo.periodId, j6, true);
                                    mediaPeriodId4 = mediaPeriodId3;
                                    j2 = j6;
                                    j7 = seekToPeriodPosition;
                                    i2 = 2;
                                    j8 = j7;
                                    exoPlayerImplInternal = this;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId4, j7, j2, j8, z2, i2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    mediaPeriodId2 = mediaPeriodId3;
                                    j2 = j6;
                                    j4 = seekToPeriodPosition;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j4, j2, j4, z2, 2);
                                    throw th;
                                }
                                timeline = playbackInfo.timeline;
                                j6 = j2;
                            } catch (Throwable th3) {
                                th = th3;
                                mediaPeriodId2 = mediaPeriodId3;
                            }
                            playbackInfo = exoPlayerImplInternal.playbackInfo;
                            mediaPeriodId3 = mediaPeriodId2;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        seekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodId2, j5, exoPlayerImplInternal.playbackInfo.playbackState == 4);
                        z2 = (j3 != seekToPeriodPosition) | z;
                    } catch (Throwable th5) {
                        th = th5;
                        z2 = z;
                        j4 = j3;
                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j4, j2, j4, z2, 2);
                        throw th;
                    }
                }
            }
            z2 = z;
            mediaPeriodId4 = mediaPeriodId;
            j7 = j3;
            i2 = 2;
            j8 = j7;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId4, j7, j2, j8, z2, i2);
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
            mediaPeriodId2 = mediaPeriodId;
            j4 = j3;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j4, j2, j4, z2, 2);
            throw th;
        }
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) {
        MediaPeriodQueue mediaPeriodQueue;
        stopRenderers();
        boolean z3 = true;
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            disableRenderers();
            if (mediaPeriodHolder != null) {
                while (true) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    mediaPeriodQueue = this.queue;
                    if (playingPeriod2 == mediaPeriodHolder) {
                        break;
                    }
                    mediaPeriodQueue.advancePlayingPeriod();
                }
                mediaPeriodQueue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                enableRenderers();
                setAllRenderersToCorrectState(mediaPeriodHolder);
            }
        }
        disableAndResetPrewarmingRenderers();
        if (this.scrubbingModeEnabled) {
            for (RendererHolder rendererHolder : this.renderers) {
                if (rendererHolder.isRendererEnabled() && (rendererHolder.getTrackType() == 2 || rendererHolder.getTrackType() == 4)) {
                    this.seekIsPendingWhileScrubbing = true;
                    break;
                }
            }
        }
        MediaPeriodQueue mediaPeriodQueue2 = this.queue;
        if (mediaPeriodHolder != null) {
            mediaPeriodQueue2.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j, C.TIME_UNSET);
            } else if (mediaPeriodHolder.hasEnabledTracks) {
                if (this.scrubbingModeEnabled && this.scrubbingModeParameters.allowSkippingKeyFrameReset && shouldSkipKeyFrameReset(mediaPeriodHolder, j)) {
                    z3 = false;
                } else {
                    j = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                    mediaPeriodHolder.mediaPeriod.discardBuffer(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                }
            }
            resetRendererPosition(j, z3);
            maybeContinueLoading();
        } else {
            mediaPeriodQueue2.clear();
            resetRendererPosition(j, true);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void sendMessageInternal(PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        Timeline timeline = this.playbackInfo.timeline;
        if (!resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) {
        if (playerMessage.getLooper() != this.playbackLooper) {
            this.handler.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        deliverMessage(playerMessage);
        int i = this.playbackInfo.playbackState;
        if (i == 3 || i == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (looper.getThread().isAlive()) {
            this.clock.createHandler(looper, null).post(new c(this, playerMessage, (byte) 3));
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void setAllNonPrewarmingRendererStreamsFinal(long j) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setAllNonPrewarmingRendererStreamsFinal(j);
        }
    }

    private void setAllRenderersToCorrectState(MediaPeriodHolder mediaPeriodHolder) {
        for (int i = 0; i < this.renderers.length; i++) {
            mediaPeriodHolder.setRendererToCorrectState(i);
        }
    }

    private void setAudioAttributesInternal(AudioAttributes audioAttributes, boolean z) {
        this.trackSelector.setAudioAttributes(audioAttributes);
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (!z) {
            audioAttributes = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes);
        updatePlayWhenReadyWithAudioFocus();
    }

    private void setAudioSessionIdInternal(int i) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setAudioSessionId(i);
        }
    }

    private void setEnforceAdPlaybackOnTimelineRefreshInternal(boolean z) {
        this.enforceAdPlaybackOnTimelineRefresh = z;
    }

    private void setForegroundModeInternal(boolean z, ConditionVariable conditionVariable) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (RendererHolder rendererHolder : this.renderers) {
                    rendererHolder.reset();
                }
            }
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    private void setImageMetadataListenerInternal(ImageMetadataListener imageMetadataListener) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setImageMetadataListener(imageMetadataListener);
        }
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabled(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z) {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (this.pendingPauseAtEndOfPeriod && isReadingAhead()) {
            seekToCurrentPosition(true);
            handleLoadingMediaPeriodChanged(false);
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        updatePlayWhenReadyWithAudioFocus(z, i, i2);
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void setRepeatModeInternal(int i) {
        this.repeatMode = i;
        int updateRepeatMode = this.queue.updateRepeatMode(this.playbackInfo.timeline, i);
        if ((updateRepeatMode & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateRepeatMode & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setScrubbingModeEnabledInternal(boolean z) {
        if (!z) {
            if (this.queuedSeekWhileScrubbing != null && this.seekIsPendingWhileScrubbing && !this.handler.hasMessages(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE)) {
                this.droppedSeeksWhileScrubbing++;
            }
            int i = this.droppedSeeksWhileScrubbing;
            byte b = 0;
            if (i > 0) {
                this.applicationLooperHandler.post(new w(this, i, b));
            }
            this.droppedSeeksWhileScrubbing = 0;
            this.seekIsPendingWhileScrubbing = false;
            this.handler.removeMessages(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE);
            SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
            if (seekPosition != null) {
                seekToInternal(seekPosition);
                this.queuedSeekWhileScrubbing = null;
                this.seekIsPendingWhileScrubbing = false;
            }
        }
        this.scrubbingModeEnabled = z;
        applyScrubbingModeParameters();
    }

    private void setScrubbingModeParametersInternal(ScrubbingModeParameters scrubbingModeParameters) {
        this.scrubbingModeParameters = scrubbingModeParameters;
        applyScrubbingModeParameters();
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z) {
        this.shuffleModeEnabled = z;
        int updateShuffleModeEnabled = this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z);
        if ((updateShuffleModeEnabled & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateShuffleModeEnabled & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
            }
            if (i != 3 && playbackInfo.sleepingForOffload) {
                playbackInfo = playbackInfo.copyWithSleepingForOffload(false);
                this.playbackInfo = playbackInfo;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void setVideoFrameMetadataListenerInternal(VideoFrameMetadataListener videoFrameMetadataListener) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
    }

    private void setVideoOutputInternal(Object obj, ConditionVariable conditionVariable) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoOutput(obj);
        }
        int i = this.playbackInfo.playbackState;
        if (i == 3 || i == 2) {
            this.handler.sendEmptyMessage(2);
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    private void setVolumeInternal(float f) {
        this.volume = f;
        float volumeMultiplier = this.audioFocusManager.getVolumeMultiplier() * f;
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVolume(volumeMultiplier);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && areAllRenderersInCorrectState(next);
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = this.rendererPositionUs;
        LoadControl.Parameters parameters = new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.id, loadingPeriod == playingPeriod ? loadingPeriod.toPeriodTime(j) : loadingPeriod.toPeriodTime(j) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET, this.lastRebufferRealtimeMs);
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
        if (shouldContinueLoading || !playingPeriod2.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US || (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe)) {
            return shouldContinueLoading;
        }
        playingPeriod2.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldSkipKeyFrameReset(MediaPeriodHolder mediaPeriodHolder, long j) {
        if (!this.playbackInfo.timeline.isEmpty() && mediaPeriodHolder.info.id.equals(this.playbackInfo.periodId)) {
            long rendererTime = mediaPeriodHolder.toRendererTime(j);
            boolean z = true;
            for (RendererHolder rendererHolder : this.renderers) {
                if (rendererHolder.isRendererEnabled()) {
                    z &= rendererHolder.supportsResetPositionWithoutKeyFrameReset(mediaPeriodHolder, rendererTime);
                }
            }
            if (!z) {
                return false;
            }
            MediaPeriod mediaPeriod = mediaPeriodHolder.mediaPeriod;
            long j2 = this.playbackInfo.positionUs;
            SeekParameters seekParameters = SeekParameters.PREVIOUS_SYNC;
            if (mediaPeriod.getAdjustedSeekPositionUs(j2, seekParameters) == mediaPeriodHolder.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z3 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) {
            z2 = true;
        }
        if (z3 || z2) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs, this.lastRebufferRealtimeMs));
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].start();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        this.audioFocusManager.updateAudioFocus(this.playbackInfo.playWhenReady, 1);
        setState(1);
    }

    private void stopRenderers() {
        this.mediaClock.stop();
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.stop();
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z);
        }
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        loadingPeriod.getClass();
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = this.rendererPositionUs;
        this.loadControl.onTracksSelected(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, loadingPeriod == playingPeriod ? loadingPeriod.toPeriodTime(j) : loadingPeriod.toPeriodTime(j) - loadingPeriod.info.startPositionUs, getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET, this.lastRebufferRealtimeMs), trackGroupArray, trackSelectorResult.selections);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i2, List<MediaItem> list) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i, i2, list), false);
    }

    private void updatePeriods() {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean maybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        if (this.perStreamMediaProgressionEnabled) {
            maybeUpdatePrewarmingPeriods();
            maybeUpdateReadingPeriods();
            maybeUpdateReadingRenderersPerStream();
        } else {
            maybeUpdatePrewarmingPeriod();
            maybeUpdateReadingPeriod();
            maybeUpdateReadingRenderers();
        }
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(maybeUpdateLoadingPeriod);
    }

    private static int updatePlayWhenReadyChangeReason(int i, int i2) {
        if (i == -1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2;
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2, int i3) {
        boolean z2 = z && i != -1;
        int updatePlayWhenReadyChangeReason = updatePlayWhenReadyChangeReason(i, i3);
        int updatePlaybackSuppressionReason = updatePlaybackSuppressionReason(i, i2, this.scrubbingModeEnabled);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z2 && playbackInfo.playbackSuppressionReason == updatePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == updatePlayWhenReadyChangeReason) {
            return;
        }
        this.playbackInfo = playbackInfo.copyWithPlayWhenReady(z2, updatePlayWhenReadyChangeReason, updatePlaybackSuppressionReason);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z2);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (playbackInfo2.sleepingForOffload) {
                this.playbackInfo = playbackInfo2.copyWithSleepingForOffload(false);
            }
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            return;
        }
        int i4 = this.playbackInfo.playbackState;
        if (i4 == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i4 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void updatePlaybackPositions() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                disableAndResetPrewarmingRenderers();
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity, true);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                long j = readDiscontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j, playbackInfo.requestedContentPositionUs, j, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(isReadingAhead());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z = !this.playbackInfoUpdate.positionDiscontinuity;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z) {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j != C.TIME_UNSET) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (!Objects.equals(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
        }
    }

    private static int updatePlaybackSuppressionReason(int i, int i2, boolean z) {
        if (i == 0) {
            return 1;
        }
        return i2 == 1 ? z ? 4 : 0 : i2;
    }

    private void updateRebufferingState(boolean z, boolean z2) {
        this.isRebuffering = z;
        this.lastRebufferRealtimeMs = (!z || z2) ? C.TIME_UNSET : this.clock.elapsedRealtime();
    }

    private boolean updateRendererForTransition(int i) {
        RendererHolder rendererHolder = this.renderers[i];
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod(i);
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        if (readingPeriod.prepared && trackSelectorResult.isRendererEnabled(i) && rendererHolder.isRendererEnabled() && !isRendererPrewarming(i) && !rendererHolder.isReadingFromPeriod(readingPeriod)) {
            int flags = readingPeriod.sampleStreams[i].getFlags();
            if ((flags & 2) != 0) {
                return false;
            }
            if ((flags & 4) != 0) {
                rendererHolder.setCurrentStreamFinal(readingPeriod.getStartPositionRendererTime());
            }
        }
        int enabledRendererCount = rendererHolder.getEnabledRendererCount();
        int replaceStreamsOrDisableRendererForTransition = rendererHolder.replaceStreamsOrDisableRendererForTransition(readingPeriod, trackSelectorResult, this.mediaClock);
        if ((replaceStreamsOrDisableRendererForTransition & 2) != 0 && this.offloadSchedulingEnabled) {
            setOffloadSchedulingEnabled(false);
        }
        this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
        boolean z = (replaceStreamsOrDisableRendererForTransition & 1) != 0;
        if (z && trackSelectorResult.isRendererEnabled(i) && !rendererHolder.isReadingFromPeriod(readingPeriod)) {
            enableRenderer(readingPeriod, i, false, readingPeriod.getStartPositionRendererTime());
        }
        return z;
    }

    private boolean updateRenderersForTransition() {
        ExoPlayerImplInternal exoPlayerImplInternal;
        MediaPeriodHolder earliestReadingPeriod = this.queue.getEarliestReadingPeriod();
        TrackSelectorResult trackSelectorResult = earliestReadingPeriod.getTrackSelectorResult();
        boolean z = true;
        for (RendererHolder rendererHolder : this.renderers) {
            int enabledRendererCount = rendererHolder.getEnabledRendererCount();
            int replaceStreamsOrDisableRendererForTransition = rendererHolder.replaceStreamsOrDisableRendererForTransition(earliestReadingPeriod, trackSelectorResult, this.mediaClock);
            if ((replaceStreamsOrDisableRendererForTransition & 2) != 0 && this.offloadSchedulingEnabled) {
                setOffloadSchedulingEnabled(false);
            }
            this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            z &= (replaceStreamsOrDisableRendererForTransition & 1) != 0;
        }
        if (z) {
            int i = 0;
            while (i < this.renderers.length) {
                if (!trackSelectorResult.isRendererEnabled(i) || this.renderers[i].isReadingFromPeriod(earliestReadingPeriod)) {
                    exoPlayerImplInternal = this;
                } else {
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.enableRenderer(earliestReadingPeriod, i, false, earliestReadingPeriod.getStartPositionRendererTime());
                }
                i++;
                this = exoPlayerImplInternal;
            }
        }
        return z;
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, C.TIME_UNSET)).sendToTarget();
    }

    @Override // androidx.media3.common.audio.AudioFocusManager.PlayerControl
    public void executePlayerCommand(int i) {
        this.handler.obtainMessage(33, i, 0).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i;
        MediaPeriodQueue mediaPeriodQueue;
        MediaSource.MediaPeriodId mediaPeriodId;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i2 = message.arg2;
                    setPlayWhenReadyInternal(z, i2 >> 4, true, i2 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal((ConditionVariable) message.obj);
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    this.trackSelector.onParametersActivated((TrackSelectionParameters) message.obj);
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (ConditionVariable) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setEnforceAdPlaybackOnTimelineRefreshInternal(message.arg1 != 0);
                    break;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    setVideoOutputInternal(pair.first, (ConditionVariable) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((AudioAttributes) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
                case 35:
                    setVideoFrameMetadataListenerInternal((VideoFrameMetadataListener) message.obj);
                    break;
                case 36:
                    setScrubbingModeEnabledInternal(((Boolean) message.obj).booleanValue());
                    break;
                case MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE /* 37 */:
                    this.seekIsPendingWhileScrubbing = false;
                    SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
                    if (seekPosition != null) {
                        seekToInternal(seekPosition);
                        this.queuedSeekWhileScrubbing = null;
                        break;
                    }
                    break;
                case 38:
                    setScrubbingModeParametersInternal((ScrubbingModeParameters) message.obj);
                    break;
                case 39:
                    setImageMetadataListenerInternal((ImageMetadataListener) message.obj);
                    break;
                case 40:
                    setAudioSessionIdInternal(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (ParserException e) {
            int i3 = e.dataType;
            if (i3 == 1) {
                r2 = e.contentIsMalformed ? PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED : PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED;
            } else if (i3 == 4) {
                r2 = e.contentIsMalformed ? PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED : PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;
            }
            handleIoException(e, r2);
        } catch (DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            if (e.type == 1 && e.mediaPeriodId == null) {
                RendererHolder rendererHolder = this.renderers[e.rendererIndex];
                MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                while (playingPeriod != null && !rendererHolder.isReadingFromPeriod(playingPeriod)) {
                    playingPeriod = playingPeriod.getNext();
                }
                if (playingPeriod == null) {
                    playingPeriod = this.queue.getEarliestReadingPeriod();
                }
                if (playingPeriod != null) {
                    e = e.copyWithMediaPeriodId(playingPeriod.info.id);
                }
            }
            if (e.type == 1 && (mediaPeriodId = e.mediaPeriodId) != null && isRendererPrewarmingMediaPeriod(e.rendererIndex, mediaPeriodId)) {
                this.isPrewarmingDisabledUntilNextTransition = true;
                disableAndResetPrewarmingRenderers();
                MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod(e.rendererIndex);
                MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                if (this.queue.getPlayingPeriod() != prewarmingPeriod) {
                    while (playingPeriod2 != null && playingPeriod2.getNext() != prewarmingPeriod) {
                        playingPeriod2 = playingPeriod2.getNext();
                    }
                }
                this.queue.removeAfter(playingPeriod2);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    this.handler.sendEmptyMessage(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getLatestReadingPeriod()) {
                    MediaPeriodHolder playingPeriod3 = this.queue.getPlayingPeriod();
                    while (playingPeriod3 != null && !Objects.equals(playingPeriod3.info.id, e.mediaPeriodId)) {
                        playingPeriod3 = playingPeriod3.getNext();
                    }
                    if (playingPeriod3 == null) {
                        playingPeriod3 = this.queue.getEarliestReadingPeriod();
                    }
                    while (true) {
                        MediaPeriodHolder playingPeriod4 = this.queue.getPlayingPeriod();
                        mediaPeriodQueue = this.queue;
                        if (playingPeriod4 == playingPeriod3) {
                            break;
                        }
                        mediaPeriodQueue.advancePlayingPeriod();
                    }
                    MediaPeriodHolder playingPeriod5 = mediaPeriodQueue.getPlayingPeriod();
                    sp0.v(playingPeriod5);
                    maybeNotifyPlaybackInfoChanged(message.what);
                    MediaPeriodInfo mediaPeriodInfo = playingPeriod5.info;
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo.id;
                    long j = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
                }
                if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i = e.errorCode) == 5004 || i == 5003)) {
                    Log.w(TAG, "Recoverable renderer error", e);
                    if (this.pendingRecoverableRendererError == null) {
                        this.pendingRecoverableRendererError = e;
                    }
                    HandlerWrapper handlerWrapper = this.handler;
                    handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
                } else {
                    Log.e(TAG, "Playback error", e);
                    stopInternal(true, false);
                    this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
                }
            }
        } catch (DrmSession.DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            handleIoException(e5, 1002);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged(message.what);
        return true;
    }

    public void moveMediaSources(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i, i2, i3, shuffleOrder)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated(TrackSelectionParameters trackSelectionParameters) {
        this.handler.obtainMessage(10, trackSelectionParameters).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
        if (this.seekIsPendingWhileScrubbing) {
            this.handler.obtainMessage(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE).sendToTarget();
        }
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public boolean release() {
        if (this.releasedOnApplicationThread || !this.playbackLooper.getThread().isAlive()) {
            return true;
        }
        this.releasedOnApplicationThread = true;
        ConditionVariable conditionVariable = new ConditionVariable(this.clock);
        this.handler.obtainMessage(7, conditionVariable).sendToTarget();
        return conditionVariable.blockUninterruptible(this.releaseTimeoutMs);
    }

    public void removeMediaSources(int i, int i2, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public void sendMessage(PlayerMessage playerMessage) {
        if (!this.releasedOnApplicationThread && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
        } else {
            Log.w(TAG, "Ignoring messages sent after release.");
            playerMessage.markAsProcessed(false);
        }
    }

    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        this.handler.obtainMessage(31, z ? 1 : 0, 0, audioAttributes).sendToTarget();
    }

    public void setAudioSessionId(int i, boolean z) {
        HandlerWrapper.Message obtainMessage = this.handler.obtainMessage(40, i, 0);
        if (z) {
            this.handler.sendMessageAtFrontOfQueue(obtainMessage);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    public void setEnforceAdPlaybackOnTimelineRefresh(boolean z) {
        this.handler.obtainMessage(24, z ? 1 : 0, 0).sendToTarget();
    }

    public boolean setForegroundMode(boolean z) {
        if (this.releasedOnApplicationThread || !this.playbackLooper.getThread().isAlive()) {
            return true;
        }
        if (z) {
            this.handler.obtainMessage(13, 1, 0).sendToTarget();
            return true;
        }
        ConditionVariable conditionVariable = new ConditionVariable(this.clock);
        this.handler.obtainMessage(13, 0, 0, conditionVariable).sendToTarget();
        return conditionVariable.blockUninterruptible(this.setForegroundModeTimeoutMs);
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        this.handler.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        this.handler.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setScrubbingModeEnabled(boolean z) {
        this.handler.obtainMessage(36, Boolean.valueOf(z)).sendToTarget();
    }

    public void setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters) {
        this.handler.obtainMessage(38, scrubbingModeParameters).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public boolean setVideoOutput(Object obj, long j) {
        if (!this.releasedOnApplicationThread && this.playbackLooper.getThread().isAlive()) {
            ConditionVariable conditionVariable = new ConditionVariable(this.clock);
            this.handler.obtainMessage(30, new Pair(obj, conditionVariable)).sendToTarget();
            if (j != C.TIME_UNSET) {
                return conditionVariable.blockUninterruptible(j);
            }
        }
        return true;
    }

    public void setVolume(float f) {
        this.handler.obtainMessage(32, Float.valueOf(f)).sendToTarget();
    }

    @Override // androidx.media3.common.audio.AudioFocusManager.PlayerControl
    public void setVolumeMultiplier(float f) {
        this.handler.sendEmptyMessage(34);
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i, int i2, List<MediaItem> list) {
        this.handler.obtainMessage(27, i, i2, list).sendToTarget();
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void maybeUpdatePrewarmingPeriod(int i) {
        MediaPeriodHolder prewarmingPeriod;
        if (!this.renderers[i].isPrewarming() && (prewarmingPeriod = this.queue.getPrewarmingPeriod(i)) != null && prewarmingPeriod == this.queue.getReadingPeriod(i) && prewarmingPeriod.getNext() != null && prewarmingPeriod.getNext().prepared && getDurationToMediaPeriodUs(prewarmingPeriod.getNext()) <= DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
            this.queue.advancePrewarmingPeriod(i);
            maybePrewarmRenderer(i);
        }
    }

    private void enableRenderers() {
        sp0.z(!isReadingAhead());
        enableRenderers(new boolean[this.renderers.length], this.queue.getEarliestReadingPeriod().getStartPositionRendererTime());
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2) {
        updatePlayWhenReadyWithAudioFocus(z, this.audioFocusManager.updateAudioFocus(z, this.playbackInfo.playbackState), i, i2);
    }

    private void updatePlayWhenReadyWithAudioFocus() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) {
        return seekToPeriodPosition(mediaPeriodId, j, isReadingAhead(), z);
    }

    private void maybeUpdateReadingPeriod(int i) {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod(i);
        RendererHolder rendererHolder = this.renderers[i];
        if (readingPeriod == null || !readingPeriod.prepared) {
            return;
        }
        if (readingPeriod.getNext() != null && !this.pendingPauseAtEndOfPeriod) {
            if ((isRendererPrewarming(i) || rendererHolder.isReadingFromPeriod(readingPeriod) || haveAllRenderersFinishedReading(readingPeriod)) && this.renderers[i].hasFinishedReadingFromPeriod(readingPeriod)) {
                if (isRendererPrewarming(i) && this.queue.getPrewarmingPeriod(i) == this.queue.getReadingPeriod(i)) {
                    return;
                }
                if (readingPeriod.getNext().prepared || (this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime() && haveAllRenderersFinishedReading(readingPeriod))) {
                    if (haveAllRenderersFinishedReading(readingPeriod) || isSafeToAdvancePerStream(readingPeriod)) {
                        if (!readingPeriod.getNext().prepared || getDurationToMediaPeriodUs(readingPeriod.getNext()) <= DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
                            boolean z = readingPeriod == this.queue.getLatestReadingPeriod();
                            TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                            MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod(i);
                            TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                            if (z) {
                                Timeline timeline = this.playbackInfo.timeline;
                                updatePlaybackSpeedSettingsForNewPeriod(timeline, advanceReadingPeriod.info.id, timeline, readingPeriod.info.id, C.TIME_UNSET, false);
                            }
                            rendererHolder.maybeSetOldStreamToFinal(trackSelectorResult, trackSelectorResult2, advanceReadingPeriod.getStartPositionRendererTime());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) && rendererHolder.isReadingFromPeriod(readingPeriod) && rendererHolder.hasReadPeriodToEnd(readingPeriod)) {
            long j = readingPeriod.info.durationUs;
            long j2 = C.TIME_UNSET;
            if (j != C.TIME_UNSET && j != Long.MIN_VALUE) {
                j2 = readingPeriod.info.durationUs + readingPeriod.getRendererOffset();
            }
            rendererHolder.setCurrentStreamFinal(readingPeriod, j2);
        }
    }
}
