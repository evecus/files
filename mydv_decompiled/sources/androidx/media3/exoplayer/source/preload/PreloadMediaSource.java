package androidx.media3.exoplayer.source.preload;

import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.gz4;
import defpackage.h8;
import defpackage.ps3;
import defpackage.sp0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PreloadMediaSource extends WrappingMediaSource {
    private static final long CHECK_FOR_PRELOAD_ERROR_INTERVAL_MS = 100;
    private static final int CONTINUE_LOADING_RETRY_COUNT = 10;
    private static final long MAYBE_CONTINUE_LOADING_INTERVAL_MS = 100;
    private static final String TAG = "PreloadMediaSource";
    private final Allocator allocator;
    private final BandwidthMeter bandwidthMeter;
    private final LoadControl loadControl;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;
    private Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final PreloadControl preloadControl;
    private final HandlerWrapper preloadHandler;
    private Pair<PreloadMediaPeriod, MediaPeriodKey> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final HandlerWrapper releaseHandler;
    private boolean releasePreloadMediaSourceCalled;
    private final RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;
    private Timeline timeline;
    private final TrackSelector trackSelector;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class MediaPeriodKey {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final Long startPositionUs;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = Long.valueOf(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, mediaPeriodKey.mediaPeriodId) && this.startPositionUs.equals(mediaPeriodKey.startPositionUs);
        }

        public int hashCode() {
            int hashCode = (this.mediaPeriodId.periodUid.hashCode() + 527) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return this.startPositionUs.intValue() + ((((((hashCode + mediaPeriodId.adGroupIndex) * 31) + mediaPeriodId.adIndexInAdGroup) * 31) + mediaPeriodId.nextAdGroupIndex) * 31);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface PreloadControl {
        boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, long j);

        void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource);

        boolean onLoadingUnableToContinue(PreloadMediaSource preloadMediaSource);

        void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource);

        boolean onSourcePrepared(PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(PreloadMediaSource preloadMediaSource);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        private int continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
        private Runnable maybeContinueLoadingRunnable;
        private boolean onLoadToTheEndOfSourceNotified;
        private final long periodStartPositionUs;
        private boolean prepared;

        public PreloadMediaPeriodCallback(long j) {
            this.periodStartPositionUs = j;
        }

        private LoadControl.Parameters createLoadControlParameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new LoadControl.Parameters(playerId, timeline, mediaPeriodId, 0L, j, 1.0f, false, false, C.TIME_UNSET, C.TIME_UNSET);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onContinueLoadingRequested$1(MediaPeriod mediaPeriod) {
            if (PreloadMediaSource.this.preloadingMediaPeriodAndKey == null || PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            if (this.prepared) {
                long bufferedPositionUs = mediaPeriod.getBufferedPositionUs();
                if (bufferedPositionUs == Long.MIN_VALUE) {
                    onLoadToTheEndOfSource();
                    return;
                } else if (!PreloadMediaSource.this.preloadControl.onContinueLoadingRequested(PreloadMediaSource.this, bufferedPositionUs - this.periodStartPositionUs)) {
                    PreloadMediaSource.this.stopPreloading();
                    return;
                }
            }
            Pair pair = PreloadMediaSource.this.preloadingMediaPeriodAndKey;
            pair.getClass();
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) pair.second;
            this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
            lambda$maybeContinueLoading$2(preloadMediaPeriod, mediaPeriodKey.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onPrepared$0(MediaPeriod mediaPeriod) {
            TrackSelectorResult trackSelectorResult;
            if (PreloadMediaSource.this.preloadingMediaPeriodAndKey == null || PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            TrackGroupArray trackGroups = preloadMediaPeriod.getTrackGroups();
            Pair pair = PreloadMediaSource.this.preloadingMediaPeriodAndKey;
            pair.getClass();
            MediaSource.MediaPeriodId mediaPeriodId = ((MediaPeriodKey) pair.second).mediaPeriodId;
            try {
                TrackSelector trackSelector = PreloadMediaSource.this.trackSelector;
                RendererCapabilities[] rendererCapabilitiesArr = PreloadMediaSource.this.rendererCapabilities;
                Timeline timeline = PreloadMediaSource.this.timeline;
                timeline.getClass();
                trackSelectorResult = trackSelector.selectTracks(rendererCapabilitiesArr, trackGroups, mediaPeriodId, timeline);
            } catch (ExoPlaybackException e) {
                Log.e(PreloadMediaSource.TAG, "Failed to select tracks", e);
                trackSelectorResult = null;
            }
            if (trackSelectorResult == null) {
                PreloadMediaSource.this.stopPreloading();
                return;
            }
            preloadMediaPeriod.selectTracksForPreloading(trackSelectorResult.selections, this.periodStartPositionUs);
            boolean onTracksSelected = PreloadMediaSource.this.preloadControl.onTracksSelected(PreloadMediaSource.this);
            PreloadMediaSource preloadMediaSource = PreloadMediaSource.this;
            if (!onTracksSelected) {
                preloadMediaSource.stopPreloading();
                return;
            }
            LoadControl loadControl = preloadMediaSource.loadControl;
            PlayerId playerId = PreloadMediaSource.this.getPlayerId();
            Timeline timeline2 = PreloadMediaSource.this.timeline;
            timeline2.getClass();
            loadControl.onTracksSelected(createLoadControlParameters(playerId, timeline2, mediaPeriodId, mediaPeriod.getBufferedPositionUs()), trackGroups, trackSelectorResult.selections);
            this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
            lambda$maybeContinueLoading$2(preloadMediaPeriod, mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: maybeContinueLoading, reason: merged with bridge method [inline-methods] */
        public void lambda$maybeContinueLoading$2(final MediaPeriod mediaPeriod, final MediaSource.MediaPeriodId mediaPeriodId) {
            if (PreloadMediaSource.this.preloadingMediaPeriodAndKey == null || PreloadMediaSource.this.preloadingMediaPeriodAndKey.first != mediaPeriod) {
                return;
            }
            if (this.maybeContinueLoadingRunnable != null) {
                PreloadMediaSource.this.preloadHandler.removeCallbacks(this.maybeContinueLoadingRunnable);
                this.maybeContinueLoadingRunnable = null;
            }
            PlayerId playerId = PreloadMediaSource.this.getPlayerId();
            Timeline timeline = PreloadMediaSource.this.timeline;
            timeline.getClass();
            if (PreloadMediaSource.this.loadControl.shouldContinueLoading(createLoadControlParameters(playerId, timeline, mediaPeriodId, this.prepared ? mediaPeriod.getBufferedPositionUs() : 0L))) {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
                mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.periodStartPositionUs).build());
                if (this.prepared && mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE) {
                    onLoadToTheEndOfSource();
                    return;
                }
                return;
            }
            int i = this.continueLoadingRetryCountBeforeCallingPreloadControlAgain;
            if (i != -1 && i < 10) {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = i + 1;
            } else if (PreloadMediaSource.this.preloadControl.onLoadingUnableToContinue(PreloadMediaSource.this)) {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = 0;
            } else {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
            }
            this.maybeContinueLoadingRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.preload.j
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadMediaSource.PreloadMediaPeriodCallback.this.lambda$maybeContinueLoading$2(mediaPeriod, mediaPeriodId);
                }
            };
            PreloadMediaSource.this.preloadHandler.postDelayed(this.maybeContinueLoadingRunnable, 100L);
        }

        private void onLoadToTheEndOfSource() {
            if (!this.onLoadToTheEndOfSourceNotified) {
                PreloadMediaSource.this.preloadControl.onLoadedToTheEndOfSource(PreloadMediaSource.this);
                this.onLoadToTheEndOfSourceNotified = true;
            }
            PreloadMediaSource.this.stopPreloading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            PreloadMediaSource.this.preloadHandler.post(new k(this, mediaPeriod, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.prepared = true;
            PreloadMediaSource.this.preloadHandler.post(new k(this, mediaPeriod, (byte) 0));
        }
    }

    private PreloadMediaSource(MediaSource mediaSource, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, LoadControl loadControl, Looper looper, Clock clock) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.loadControl = loadControl;
        this.allocator = loadControl.getAllocator(PlayerId.PRELOAD);
        this.preloadHandler = clock.createHandler(looper, null);
        this.releaseHandler = clock.createHandler(looper, null);
        this.startPositionUs = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForPreloadError() {
        try {
            maybeThrowSourceInfoRefreshError();
            Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
            if (pair != null) {
                PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair.first;
                if (preloadMediaPeriod.prepared) {
                    preloadMediaPeriod.maybeThrowStreamError();
                } else {
                    preloadMediaPeriod.maybeThrowPrepareError();
                }
            }
            this.preloadHandler.postDelayed(new ps3(this, (byte) 2), 100L);
        } catch (IOException e) {
            this.preloadControl.onPreloadError(new PreloadException(getMediaItem(), null, e), this);
            stopPreloading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clear$1() {
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$2(Timeline timeline) {
        if (isUsedByPlayer() || this.onSourcePreparedNotified) {
            return;
        }
        this.onSourcePreparedNotified = true;
        if (!this.preloadControl.onSourcePrepared(this)) {
            stopPreloading();
        } else {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(new Timeline.Window(), new Timeline.Period(), 0, this.startPositionUs);
            ((PreloadMediaPeriod) createPeriod(new MediaSource.MediaPeriodId(periodPositionUs.first), this.allocator, ((Long) periodPositionUs.second).longValue())).preload(new PreloadMediaPeriodCallback(((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preload$0(long j) {
        this.onSourcePreparedNotified = false;
        if (isUsedByPlayer()) {
            onUsedByPlayer();
            return;
        }
        this.preloadCalled = true;
        this.startPositionUs = j;
        PlayerId playerId = PlayerId.PRELOAD;
        setPlayerId(playerId);
        setBandwidthMeter(this.bandwidthMeter);
        this.loadControl.onPrepared(playerId);
        prepareSourceInternal(this.bandwidthMeter.getTransferListener());
        checkForPreloadError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadMediaSource$3() {
        if (this.preloadCalled) {
            this.loadControl.onReleased(PlayerId.PRELOAD);
        }
        this.releasePreloadMediaSourceCalled = true;
        this.preloadCalled = false;
        this.startPositionUs = C.TIME_UNSET;
        this.onSourcePreparedNotified = false;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        releaseSourceInternal();
        this.preloadHandler.removeCallbacksAndMessages(null);
        this.releaseHandler.removeCallbacksAndMessages(null);
    }

    private void maybeSetPlayerIdForAllocator() {
        Allocator allocator = this.allocator;
        if (allocator instanceof PlayerIdAwareAllocator) {
            ((PlayerIdAwareAllocator) allocator).setPlayerId(getPlayerId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private void onUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        stopPreloading();
        this.onUsedByPlayerNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPreloading() {
        this.preloadHandler.removeCallbacksAndMessages(null);
    }

    public void clear() {
        Util.postOrRun(this.preloadHandler, new ps3(this, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j);
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            Pair<PreloadMediaPeriod, MediaPeriodKey> pair2 = this.preloadingMediaPeriodAndKey;
            pair2.getClass();
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair2.first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new Pair<>(preloadMediaPeriod, mediaPeriodId);
            }
            return preloadMediaPeriod;
        }
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair3 = this.preloadingMediaPeriodAndKey;
        if (pair3 != null) {
            MediaSource mediaSource = this.mediaSource;
            pair3.getClass();
            mediaSource.releasePeriod(((PreloadMediaPeriod) pair3.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new Pair<>(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        if (pair != null) {
            pair.getClass();
            if (mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (MediaSource.MediaPeriodId) pair.second)) {
                Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
                pair2.getClass();
                return (MediaSource.MediaPeriodId) pair2.second;
            }
        }
        return mediaPeriodId;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        this.preloadHandler.post(new h8(this, timeline, (byte) 22));
    }

    public void preload(final long j) {
        this.preloadHandler.post(new Runnable() { // from class: qs3
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.this.lambda$preload$0(j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        sp0.z(Looper.myLooper() == this.preloadHandler.getLooper());
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            onUsedByPlayer();
        }
        maybeSetPlayerIdForAllocator();
        Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else {
            if (this.prepareChildSourceCalled) {
                return;
            }
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            pair.getClass();
            if (preloadMediaPeriod == pair.first) {
                this.preloadingMediaPeriodAndKey = null;
                this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
            }
        }
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
        if (pair2 != null) {
            pair2.getClass();
            if (preloadMediaPeriod == pair2.first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        }
        this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
    }

    public void releasePreloadMediaSource() {
        this.releaseHandler.post(new ps3(this, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        if (isUsedByPlayer()) {
            return;
        }
        this.onUsedByPlayerNotified = false;
        if (this.preloadCalled && !this.releasePreloadMediaSourceCalled) {
            setPlayerId(PlayerId.PRELOAD);
            maybeSetPlayerIdForAllocator();
        } else {
            this.timeline = null;
            this.prepareChildSourceCalled = false;
            super.releaseSourceInternal();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements MediaSource.Factory {
        private final BandwidthMeter bandwidthMeter;
        private Clock clock;
        private final LoadControl loadControl;
        private final MediaSource.Factory mediaSourceFactory;
        private final PreloadControl preloadControl;
        private final Looper preloadLooper;
        private final RendererCapabilities[] rendererCapabilities;
        private final TrackSelector trackSelector;

        public Factory(MediaSource.Factory factory, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, LoadControl loadControl, Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            sp0.o(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (RendererCapabilities[]) Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.loadControl = loadControl;
            this.preloadLooper = looper;
            this.clock = Clock.DEFAULT;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public PreloadMediaSource createMediaSource(MediaItem mediaItem) {
            return new PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.loadControl, this.preloadLooper, this.clock);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        public Factory setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        public PreloadMediaSource createMediaSource(MediaSource mediaSource) {
            return new PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.loadControl, this.preloadLooper, this.clock);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory setDownloadExecutor(gz4 gz4Var) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }
}
