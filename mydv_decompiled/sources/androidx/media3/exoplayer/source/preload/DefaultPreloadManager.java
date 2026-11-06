package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.PlaybackLooperProvider;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.source.preload.RankingDataComparator;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import defpackage.fp;
import defpackage.gz4;
import defpackage.js0;
import defpackage.ks0;
import defpackage.ls0;
import defpackage.mr3;
import defpackage.ms0;
import defpackage.ns0;
import defpackage.sp0;
import defpackage.tr;
import defpackage.w7;
import defpackage.wi4;
import defpackage.zy;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultPreloadManager extends BasePreloadManager<Integer, PreloadStatus> {
    private final PreCacheHelper.Factory preCacheHelperFactory;
    private final HandlerThread preCacheThread;
    private final HandlerWrapper preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private boolean releaseCalled;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PreloadMediaSourceControl implements PreloadMediaSource.PreloadControl {
        private PreloadMediaSourceControl() {
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, mr3 mr3Var) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return false;
            }
            if (mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
                return true;
            }
            DefaultPreloadManager.this.onCompleted(preloadMediaSource, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 6));
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$continueOrCompletePreloading$6(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, PreloadStatus preloadStatus) {
            if (preloadStatus.stage != 2) {
                return false;
            }
            long j2 = preloadStatus.durationMs;
            return j2 != C.TIME_UNSET && j2 > Util.usToMs(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onLoadedToTheEndOfSource$4(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPreloadError$5(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onSourcePrepared$0(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onTracksSelected$1(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onUsedByPlayer$3(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j) {
            return continueOrCompletePreloading(preloadMediaSource, new mr3() { // from class: androidx.media3.exoplayer.source.preload.d
                @Override // defpackage.mr3
                public final boolean apply(Object obj) {
                    boolean lambda$onContinueLoadingRequested$2;
                    lambda$onContinueLoadingRequested$2 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onContinueLoadingRequested$2(j, (DefaultPreloadManager.PreloadStatus) obj);
                    return lambda$onContinueLoadingRequested$2;
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onCompleted(preloadMediaSource, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 5));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onLoadingUnableToContinue(PreloadMediaSource preloadMediaSource) {
            BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolderToClear = DefaultPreloadManager.this.getMediaSourceHolderToClear();
            if (mediaSourceHolderToClear == null) {
                return false;
            }
            ((PreloadMediaSource) mediaSourceHolderToClear.getMediaSource()).clear();
            DefaultPreloadManager.this.onSourceCleared();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onError(preloadException, preloadMediaSource, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 4));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new c((byte) 0));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new c((byte) 1));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onSkipped(preloadMediaSource, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 3));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PreloadMediaSourceHolder extends BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder {
        public PreCacheHelper preCacheHelper;

        public PreloadMediaSourceHolder(MediaItem mediaItem, PreloadMediaSource preloadMediaSource, Integer num) {
            super(mediaItem, num, preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized PreloadMediaSource getMediaSource() {
            return (PreloadMediaSource) super.getMediaSource();
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized void setMediaSource(MediaSource mediaSource) {
            getMediaSource().releasePreloadMediaSource();
            super.setMediaSource(mediaSource);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class SimpleRankingDataComparator implements RankingDataComparator<Integer> {
        private int currentPlayingIndex = -1;
        private RankingDataComparator.InvalidationListener invalidationListener;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }

        public final int getCurrentPlayingIndex() {
            return this.currentPlayingIndex;
        }

        public final void setCurrentPlayingIndex(int i) {
            if (i != this.currentPlayingIndex) {
                this.currentPlayingIndex = i;
                RankingDataComparator.InvalidationListener invalidationListener = this.invalidationListener;
                if (invalidationListener != null) {
                    invalidationListener.onRankingDataComparatorInvalidated();
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator
        public final void setInvalidationListener(RankingDataComparator.InvalidationListener invalidationListener) {
            this.invalidationListener = invalidationListener;
        }
    }

    private DefaultPreloadManager(Builder builder) {
        super(builder.rankingDataComparator, builder.targetPreloadStatusControl, (MediaSource.Factory) builder.mediaSourceFactorySupplier.get());
        DefaultRendererCapabilitiesList createRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = createRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector createTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = createTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
        Objects.requireNonNull(createTrackSelector);
        createTrackSelector.init(new w7(createTrackSelector, (byte) 5), bandwidthMeter);
        Looper obtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory((MediaSource.Factory) builder.mediaSourceFactorySupplier.get(), new PreloadMediaSourceControl(), createTrackSelector, bandwidthMeter, createRendererCapabilitiesList.getRendererCapabilities(), (LoadControl) builder.loadControlSupplier.get(), obtainLooper).setClock(builder.clock);
        Cache cache = builder.cache;
        if (cache != null) {
            HandlerThread handlerThread = new HandlerThread("DefaultPreloadManager:PreCacheHelper");
            this.preCacheThread = handlerThread;
            handlerThread.start();
            this.preCacheHelperFactory = new PreCacheHelper.Factory(builder.context, cache, builder.dataSourceFactory != null ? builder.dataSourceFactory : new DefaultDataSource.Factory(builder.context), handlerThread.getLooper()).setDownloadExecutor(builder.cachingExecutor).setListener(new PreCacheHelperListener());
        } else {
            this.preCacheThread = null;
            this.preCacheHelperFactory = null;
        }
        this.preloadHandler = builder.clock.createHandler(obtainLooper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$preloadMediaSourceHolderInternal$0(PreloadStatus preloadStatus) {
        return preloadStatus.stage == Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadUtils$1() {
        this.rendererCapabilitiesList.release();
        this.trackSelector.release();
        this.preloadLooperProvider.releaseLooper();
    }

    private void maybeClearPreloadMediaSource(PreloadMediaSource preloadMediaSource, PreloadStatus preloadStatus) {
        int i = preloadStatus.stage;
        if (i == Integer.MIN_VALUE || i == -1 || i == 0) {
            preloadMediaSource.clear();
        }
    }

    private void releasePreCacheUtils() {
        HandlerThread handlerThread = this.preCacheThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    private void releasePreloadUtils() {
        this.preloadHandler.post(new defpackage.h(this, (byte) 10));
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder createMediaSourceHolder(MediaItem mediaItem, MediaSource mediaSource, Integer num) {
        PreloadMediaSource.Factory factory = this.preloadMediaSourceFactory;
        return new PreloadMediaSourceHolder(mediaItem, mediaSource != null ? factory.createMediaSource(mediaSource) : factory.createMediaSource(mediaItem), num);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadMediaSourceHolderInternal(BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolder, PreloadStatus preloadStatus) {
        if (this.releaseCalled) {
            return;
        }
        sp0.o(mediaSourceHolder instanceof PreloadMediaSourceHolder);
        PreloadMediaSourceHolder preloadMediaSourceHolder = (PreloadMediaSourceHolder) mediaSourceHolder;
        PreloadMediaSource mediaSource = preloadMediaSourceHolder.getMediaSource();
        maybeClearPreloadMediaSource(mediaSource, preloadStatus);
        if (preloadStatus.equals(PreloadStatus.PRELOAD_STATUS_NOT_PRELOADED)) {
            onSkipped(mediaSource, new js0((byte) 0));
            return;
        }
        if (preloadStatus.stage != -1) {
            mediaSource.preload(Util.msToUs(preloadStatus.startPositionMs));
            return;
        }
        PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        if (preCacheHelper == null) {
            PreCacheHelper.Factory factory = this.preCacheHelperFactory;
            sp0.w(factory, "DefaultPreloadManager wasn't configured with a Cache");
            preCacheHelper = factory.create(mediaSourceHolder.mediaItem);
            preloadMediaSourceHolder.preCacheHelper = preCacheHelper;
        }
        preCacheHelper.getClass();
        preCacheHelper.preCache(preloadStatus.startPositionMs, preloadStatus.durationMs);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseInternal() {
        this.releaseCalled = true;
        releasePreloadUtils();
        releasePreCacheUtils();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseMediaSourceHolderInternal(BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolder) {
        if (this.releaseCalled) {
            return;
        }
        super.releaseMediaSourceHolderInternal(mediaSourceHolder);
        sp0.o(mediaSourceHolder instanceof PreloadMediaSourceHolder);
        PreloadMediaSourceHolder preloadMediaSourceHolder = (PreloadMediaSourceHolder) mediaSourceHolder;
        preloadMediaSourceHolder.getMediaSource().releasePreloadMediaSource();
        PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        if (preCacheHelper != null) {
            preCacheHelper.release(true);
            preloadMediaSourceHolder.preCacheHelper = null;
        }
    }

    public void setCurrentPlayingIndex(int i) {
        ((SimpleRankingDataComparator) this.rankingDataComparator).setCurrentPlayingIndex(i);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class DefaultMediaSourceFactorySupplier implements MediaSourceFactorySupplier {
        private Cache cache;
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private final gz4 defaultMediaSourceFactorySupplier;

        private DefaultMediaSourceFactorySupplier(final Context context) {
            this.context = context;
            this.defaultMediaSourceFactorySupplier = wi4.t(new gz4() { // from class: androidx.media3.exoplayer.source.preload.a
                @Override // defpackage.gz4
                public final Object get() {
                    DefaultMediaSourceFactory lambda$new$0;
                    lambda$new$0 = DefaultPreloadManager.DefaultMediaSourceFactorySupplier.lambda$new$0(context);
                    return lambda$new$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DefaultMediaSourceFactory lambda$new$0(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier, defpackage.gz4
        public MediaSource.Factory get() {
            DefaultMediaSourceFactory defaultMediaSourceFactory = (DefaultMediaSourceFactory) this.defaultMediaSourceFactorySupplier.get();
            DataSource.Factory factory = this.dataSourceFactory;
            if (factory == null) {
                factory = new DefaultDataSource.Factory(this.context);
            }
            Cache cache = this.cache;
            if (cache != null) {
                defaultMediaSourceFactory.setDataSourceFactory(new CacheDataSource.Factory().setUpstreamDataSourceFactory(factory).setCache(cache).setCacheWriteDataSinkFactory(null));
                return defaultMediaSourceFactory;
            }
            defaultMediaSourceFactory.setDataSourceFactory(factory);
            return defaultMediaSourceFactory;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public DefaultMediaSourceFactorySupplier setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public DefaultMediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PreloadStatus {
        public static final PreloadStatus PRELOAD_STATUS_NOT_PRELOADED = new PreloadStatus(Integer.MIN_VALUE, C.TIME_UNSET, 0);
        public static final PreloadStatus PRELOAD_STATUS_SOURCE_PREPARED = new PreloadStatus(0, C.TIME_UNSET, 0);
        public static final PreloadStatus PRELOAD_STATUS_TRACKS_SELECTED = new PreloadStatus(1, C.TIME_UNSET, 0);
        public static final int STAGE_NOT_PRELOADED = Integer.MIN_VALUE;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_SPECIFIED_RANGE_CACHED = -1;
        public static final int STAGE_SPECIFIED_RANGE_LOADED = 2;
        public static final int STAGE_TRACKS_SELECTED = 1;
        public final long durationMs;
        public final int stage;
        public final long startPositionMs;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        private PreloadStatus(int i, long j, long j2) {
            boolean z = true;
            sp0.o(j == C.TIME_UNSET || j >= 0);
            if (j2 != C.TIME_UNSET && j2 < 0) {
                z = false;
            }
            sp0.o(z);
            this.stage = i;
            this.startPositionMs = j;
            this.durationMs = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreCachingCategory() {
            return this.stage == -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreloadingCategory() {
            int i = this.stage;
            return i == 0 || i == 1 || i == 2;
        }

        public static PreloadStatus specifiedRangeCached(long j) {
            return new PreloadStatus(-1, C.TIME_UNSET, j);
        }

        public static PreloadStatus specifiedRangeLoaded(long j) {
            return new PreloadStatus(2, C.TIME_UNSET, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PreloadStatus.class == obj.getClass()) {
                PreloadStatus preloadStatus = (PreloadStatus) obj;
                if (this.stage == preloadStatus.stage && this.startPositionMs == preloadStatus.startPositionMs && this.durationMs == preloadStatus.durationMs) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.stage) * 31) + ((int) this.startPositionMs)) * 31) + ((int) this.durationMs);
        }

        public static PreloadStatus specifiedRangeCached(long j, long j2) {
            return new PreloadStatus(-1, j, j2);
        }

        public static PreloadStatus specifiedRangeLoaded(long j, long j2) {
            return new PreloadStatus(2, j, j2);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder extends BasePreloadManager.BuilderBase<Integer, PreloadStatus> {
        private gz4 bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private Cache cache;
        private Executor cachingExecutor;
        private Clock clock;
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private gz4 loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private gz4 renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        public Builder(Context context, SimpleRankingDataComparator simpleRankingDataComparator, TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl) {
            super(simpleRankingDataComparator, targetPreloadStatusControl, new DefaultMediaSourceFactorySupplier(context));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new zy((byte) 17);
            this.bandwidthMeterSupplier = new ns0(context, (byte) 0);
            byte b = 1;
            this.renderersFactorySupplier = wi4.t(new ns0(context, b));
            this.loadControlSupplier = wi4.t(new tr((byte) 2));
            this.cachingExecutor = new fp(b);
            this.clock = Clock.DEFAULT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$1(Context context) {
            return new DefaultRenderersFactory(context);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer, PreloadStatus> build() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory((MediaSource.Factory) this.mediaSourceFactorySupplier.get()).setBandwidthMeter((BandwidthMeter) this.bandwidthMeterSupplier.get()).setRenderersFactory((RenderersFactory) this.renderersFactorySupplier.get()).setLoadControl((LoadControl) this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            sp0.o(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeterSupplier = new ms0(bandwidthMeter, (byte) 0);
            return this;
        }

        public Builder setCache(Cache cache) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.cache = cache;
            this.mediaSourceFactorySupplier.setCache(cache);
            return this;
        }

        public Builder setCachingExecutor(Executor executor) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.cachingExecutor = executor;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setDataSourceFactory(DataSource.Factory factory) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.dataSourceFactory = factory;
            this.mediaSourceFactorySupplier.setDataSourceFactory(factory);
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new ks0(loadControl, (byte) 0);
            return this;
        }

        @Deprecated
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new MediaSourceFactorySupplier() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.1
                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier, defpackage.gz4
                public MediaSource.Factory get() {
                    return factory;
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public MediaSourceFactorySupplier setCache(Cache cache) {
                    return this;
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public MediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory2) {
                    return this;
                }
            };
            return this;
        }

        public Builder setMediaSourceFactorySupplier(MediaSourceFactorySupplier mediaSourceFactorySupplier) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = mediaSourceFactorySupplier.setCache(this.cache).setDataSourceFactory(this.dataSourceFactory);
            return this;
        }

        public Builder setPreloadLooper(Looper looper) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled || looper == Looper.getMainLooper()) ? false : true);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new ls0(renderersFactory, (byte) 0);
            return this;
        }

        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            sp0.z((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$4(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$3(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public Builder(Context context, TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl) {
            this(context, new SimpleRankingDataComparator(), targetPreloadStatusControl);
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PreCacheHelperListener implements PreCacheHelper.Listener {
        private PreCacheHelperListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onDownloadError$2(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPreCacheCompleted$0(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPrepareError$1(PreloadStatus preloadStatus, PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onDownloadError(MediaItem mediaItem, IOException iOException) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onError(new PreloadException(mediaItem, null, iOException), mediaItem, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 2));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPreCacheCompleted(MediaItem mediaItem) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onCompleted(mediaItem, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepareError(MediaItem mediaItem, IOException iOException) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onError(new PreloadException(mediaItem, null, iOException), mediaItem, new b(targetPreloadStatusIfCurrentlyPreloading, (byte) 0));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepared(MediaItem mediaItem, MediaItem mediaItem2) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            DefaultPreloadManager.this.onMediaSourceUpdated(mediaItem, DefaultPreloadManager.this.preloadMediaSourceFactory.createMediaSource(mediaItem2));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public final void onPreCacheProgress(MediaItem mediaItem, long j, long j2, float f) {
        }
    }
}
