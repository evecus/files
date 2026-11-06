package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import defpackage.cc1;
import defpackage.dc1;
import defpackage.fc1;
import defpackage.gz4;
import defpackage.jr;
import defpackage.ks0;
import defpackage.ls0;
import defpackage.ms0;
import defpackage.ns0;
import defpackage.pn1;
import defpackage.qz;
import defpackage.sp0;
import defpackage.tr;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @Deprecated
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;

    @Deprecated
    public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;

    @Deprecated
    public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface AudioOffloadListener {
        void onOffloadedPlayback(boolean z);

        void onSleepingForOffloadChanged(boolean z);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void addVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    AnalyticsCollector getAnalyticsCollector();

    DecoderCounters getAudioDecoderCounters();

    Format getAudioFormat();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    @Override // androidx.media3.common.Player
    ExoPlaybackException getPlayerError();

    PreloadConfiguration getPreloadConfiguration();

    Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    ScrubbingModeParameters getScrubbingModeParameters();

    Renderer getSecondaryRenderer(int i);

    SeekParameters getSeekParameters();

    ShuffleOrder getShuffleOrder();

    boolean getSkipSilenceEnabled();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    DecoderCounters getVideoDecoderCounters();

    Format getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isScrubbingModeEnabled();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void removeVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i, int i2, List<MediaItem> list);

    void setAudioCodecParameters(CodecParameters codecParameters);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setEnforceAdPlaybackOnTimelineRefresh(boolean z);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setImageOutput(ImageOutput imageOutput);

    void setMaxSeekToPreviousPositionMs(long j);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j);

    void setMediaSource(MediaSource mediaSource, boolean z);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i, long j);

    void setMediaSources(List<MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    void setPriority(int i);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setScrubbingModeEnabled(boolean z);

    void setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters);

    void setSeekBackIncrementMs(long j);

    void setSeekForwardIncrementMs(long j);

    void setSeekParameters(SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoCodecParameters(CodecParameters codecParameters);

    void setVideoEffects(List<Effect> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setVirtualDeviceId(int i);

    void setWakeMode(int i);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
        public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;
        public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;
        public static final int DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS;
        public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;
        public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;
        public static boolean experimentalEnableStuckPlayingDetection;
        pn1 analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        AudioOutputProvider audioOutputProvider;
        gz4 bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        boolean enforceAdPlaybackOnTimelineRefresh;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        gz4 loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        gz4 mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        boolean perStreamMediaProgressionEnabled;
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        gz4 renderersFactorySupplier;
        ScrubbingModeParameters scrubbingModeParameters;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        int stuckBufferingDetectionTimeoutMs;
        int stuckPlayingDetectionTimeoutMs;
        int stuckPlayingNotEndingTimeoutMs;
        int stuckSuppressedDetectionTimeoutMs;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        gz4 trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;
        boolean wakeModeSet;

        static {
            DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS = Util.isRunningOnEmulator() ? 30000 : 10000;
            experimentalEnableStuckPlayingDetection = true;
        }

        private Builder(Context context, gz4 gz4Var, gz4 gz4Var2, gz4 gz4Var3, gz4 gz4Var4, gz4 gz4Var5, pn1 pn1Var) {
            context.getClass();
            this.context = context;
            this.renderersFactorySupplier = gz4Var;
            this.mediaSourceFactorySupplier = gz4Var2;
            this.trackSelectorSupplier = gz4Var3;
            this.loadControlSupplier = gz4Var4;
            this.bandwidthMeterSupplier = gz4Var5;
            this.analyticsCollectorFunction = pn1Var;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.stuckBufferingDetectionTimeoutMs = 600000;
            boolean z = experimentalEnableStuckPlayingDetection;
            int i = Log.LOG_LEVEL_OFF;
            this.stuckPlayingDetectionTimeoutMs = z ? DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS : Integer.MAX_VALUE;
            this.stuckPlayingNotEndingTimeoutMs = z ? 60000 : i;
            this.stuckSuppressedDetectionTimeoutMs = 600000;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
            this.dynamicSchedulingEnabled = true;
            this.enforceAdPlaybackOnTimelineRefresh = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public ExoPlayer build() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder enablePerStreamMediaProgression(boolean z) {
            sp0.z(!this.buildCalled);
            this.perStreamMediaProgressionEnabled = z;
            return this;
        }

        public Builder experimentalSetDynamicSchedulingEnabled(boolean z) {
            sp0.z(!this.buildCalled);
            this.dynamicSchedulingEnabled = z;
            return this;
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
            sp0.z(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            sp0.z(!this.buildCalled);
            analyticsCollector.getClass();
            this.analyticsCollectorFunction = new cc1(analyticsCollector, (byte) 0);
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            sp0.z(!this.buildCalled);
            audioAttributes.getClass();
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z;
            return this;
        }

        public Builder setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
            sp0.z(!this.buildCalled);
            audioOutputProvider.getClass();
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            byte b = 1;
            sp0.z(!this.buildCalled);
            bandwidthMeter.getClass();
            sp0.o(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeterSupplier = new ms0(bandwidthMeter, b);
            return this;
        }

        public Builder setClock(Clock clock) {
            sp0.z(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j) {
            sp0.z(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public Builder setDeviceVolumeControlEnabled(boolean z) {
            sp0.z(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        public Builder setEnforceAdPlaybackOnTimelineRefresh(boolean z) {
            sp0.z(!this.buildCalled);
            this.enforceAdPlaybackOnTimelineRefresh = z;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z) {
            sp0.z(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            sp0.z(!this.buildCalled);
            livePlaybackSpeedControl.getClass();
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            sp0.z(!this.buildCalled);
            loadControl.getClass();
            this.loadControlSupplier = new ks0(loadControl, (byte) 1);
            return this;
        }

        public Builder setLooper(Looper looper) {
            sp0.z(!this.buildCalled);
            looper.getClass();
            this.looper = looper;
            return this;
        }

        public Builder setMaxSeekToPreviousPositionMs(long j) {
            sp0.o(j >= 0);
            sp0.z(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            sp0.z(!this.buildCalled);
            factory.getClass();
            this.mediaSourceFactorySupplier = new dc1(factory, (byte) 1);
            return this;
        }

        public Builder setName(String str) {
            sp0.z(!this.buildCalled);
            sp0.o(!str.equals(PlayerId.PRELOAD.name));
            this.playerName = str;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z) {
            sp0.z(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public Builder setPlaybackLooper(Looper looper) {
            sp0.z((this.buildCalled || looper == Looper.getMainLooper()) ? false : true);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            sp0.z(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        public Builder setPriority(int i) {
            sp0.z(!this.buildCalled);
            this.priority = i;
            return this;
        }

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            sp0.z(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j) {
            sp0.z(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            sp0.z(!this.buildCalled);
            renderersFactory.getClass();
            this.renderersFactorySupplier = new dc1(renderersFactory, (byte) 0);
            return this;
        }

        public Builder setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters) {
            sp0.z(!this.buildCalled);
            scrubbingModeParameters.getClass();
            this.scrubbingModeParameters = scrubbingModeParameters;
            return this;
        }

        public Builder setSeekBackIncrementMs(long j) {
            sp0.o(j > 0);
            sp0.z(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public Builder setSeekForwardIncrementMs(long j) {
            sp0.o(j > 0);
            sp0.z(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            sp0.z(!this.buildCalled);
            seekParameters.getClass();
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z) {
            sp0.z(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public Builder setStuckBufferingDetectionTimeoutMs(int i) {
            sp0.z(!this.buildCalled);
            sp0.o(i > 0);
            this.stuckBufferingDetectionTimeoutMs = i;
            return this;
        }

        public Builder setStuckPlayingDetectionTimeoutMs(int i) {
            sp0.z(!this.buildCalled);
            sp0.o(i > 0);
            this.stuckPlayingDetectionTimeoutMs = i;
            return this;
        }

        public Builder setStuckPlayingNotEndingTimeoutMs(int i) {
            sp0.z(!this.buildCalled);
            sp0.o(i > 0);
            this.stuckPlayingNotEndingTimeoutMs = i;
            return this;
        }

        public Builder setStuckSuppressedDetectionTimeoutMs(int i) {
            sp0.z(!this.buildCalled);
            sp0.o(i > 0);
            this.stuckSuppressedDetectionTimeoutMs = i;
            return this;
        }

        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            sp0.z(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z) {
            sp0.z(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z;
            return this;
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            sp0.z(!this.buildCalled);
            trackSelector.getClass();
            this.trackSelectorSupplier = new fc1(trackSelector, (byte) 1);
            return this;
        }

        public Builder setUseLazyPreparation(boolean z) {
            sp0.z(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public Builder setUsePlatformDiagnostics(boolean z) {
            sp0.z(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i) {
            sp0.z(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public Builder setVideoScalingMode(int i) {
            sp0.z(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public Builder setWakeMode(int i) {
            sp0.z(!this.buildCalled);
            this.wakeMode = i;
            this.wakeModeSet = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public Builder(Context context, RenderersFactory renderersFactory) {
            this(context, new ls0(renderersFactory, (byte) 2), new ns0(context, (byte) 2));
            renderersFactory.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(android.content.Context r4, final androidx.media3.exoplayer.source.MediaSource.Factory r5) {
            /*
                r3 = this;
                ns0 r0 = new ns0
                r1 = 3
                r0.<init>(r4, r1)
                ec1 r1 = new ec1
                r2 = 2
                r1.<init>()
                r3.<init>(r4, r0, r1)
                r5.getClass()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayer.Builder.<init>(android.content.Context, androidx.media3.exoplayer.source.MediaSource$Factory):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(android.content.Context r4, androidx.media3.exoplayer.RenderersFactory r5, final androidx.media3.exoplayer.source.MediaSource.Factory r6) {
            /*
                r3 = this;
                ls0 r0 = new ls0
                r1 = 1
                r0.<init>(r5, r1)
                ec1 r1 = new ec1
                r2 = 0
                r1.<init>()
                r3.<init>(r4, r0, r1)
                r5.getClass()
                r6.getClass()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayer.Builder.<init>(android.content.Context, androidx.media3.exoplayer.RenderersFactory, androidx.media3.exoplayer.source.MediaSource$Factory):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(android.content.Context r9, androidx.media3.exoplayer.RenderersFactory r10, final androidx.media3.exoplayer.source.MediaSource.Factory r11, androidx.media3.exoplayer.trackselection.TrackSelector r12, androidx.media3.exoplayer.LoadControl r13, androidx.media3.exoplayer.upstream.BandwidthMeter r14, androidx.media3.exoplayer.analytics.AnalyticsCollector r15) {
            /*
                r8 = this;
                ls0 r2 = new ls0
                r0 = 3
                r2.<init>(r10, r0)
                ec1 r3 = new ec1
                r0 = 1
                r3.<init>()
                fc1 r4 = new fc1
                r0 = 0
                r4.<init>(r12, r0)
                ks0 r5 = new ks0
                r0 = 2
                r5.<init>(r13, r0)
                ms0 r6 = new ms0
                r13 = 2
                r6.<init>(r14, r13)
                cc1 r7 = new cc1
                r13 = 1
                r7.<init>(r15, r13)
                r0 = r8
                r1 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r10.getClass()
                r11.getClass()
                r12.getClass()
                r14.getClass()
                r15.getClass()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayer.Builder.<init>(android.content.Context, androidx.media3.exoplayer.RenderersFactory, androidx.media3.exoplayer.source.MediaSource$Factory, androidx.media3.exoplayer.trackselection.TrackSelector, androidx.media3.exoplayer.LoadControl, androidx.media3.exoplayer.upstream.BandwidthMeter, androidx.media3.exoplayer.analytics.AnalyticsCollector):void");
        }

        private Builder(Context context, gz4 gz4Var, gz4 gz4Var2) {
            this(context, gz4Var, gz4Var2, new jr(context, (byte) 3), new tr((byte) 2), new jr(context, (byte) 4), new qz((byte) 2));
        }

        public Builder(Context context) {
            this(context, new jr(context, (byte) 1), new jr(context, (byte) 2));
        }
    }
}
