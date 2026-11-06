package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.audio.AudioBecomingNoisyManager;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.StreamVolumeManager;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.ee5;
import defpackage.ja;
import defpackage.ry1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.sy1;
import defpackage.x24;
import defpackage.zl1;
import defpackage.zy;
import j$.util.Objects;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private final Looper applicationLooper;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;
    private DecoderCounters audioDecoderCounters;
    private Format audioFormat;
    private final CodecParameterListenerManager audioListenerManager;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private final BackgroundThreadStateHandler<Integer> audioSessionIdState;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;
    private CameraMotionListener cameraMotionListener;
    private final Clock clock;
    private final ComponentListener componentListener;
    private final ConditionVariable constructorFinished = new ConditionVariable();
    private CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private DeviceInfo deviceInfo;
    private sy1 disabledTrackTypesWithoutScrubbingMode;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean enforceAdPlaybackOnTimelineRefresh;
    private boolean foregroundMode;
    private final FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private final ListenerSet<Player.Listener> listeners;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private long maxSeekToPreviousPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSource.Factory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final Timeline.Period period;
    final Player.Commands permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private MediaMetadata playlistMetadata;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;
    private PriorityTaskManager priorityTaskManager;
    private final Renderer[] renderers;
    private int repeatMode;
    private boolean scrubbingModeEnabled;
    private ScrubbingModeParameters scrubbingModeParameters;
    private final Renderer[] secondaryRenderers;
    private long seekBackIncrementMs;
    private long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private MediaMetadata staticAndDynamicMediaMetadata;
    private final StreamVolumeManager streamVolumeManager;
    private final StuckPlayerDetector stuckPlayerDetector;
    private final SuitableOutputChecker suitableOutputChecker;
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private Size surfaceSize;
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final TrackSelector trackSelector;
    private float unmuteVolume;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private DecoderCounters videoDecoderCounters;
    private Format videoFormat;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final CodecParameterListenerManager videoListenerManager;
    private Object videoOutput;
    private int videoScalingMode;
    private VideoSize videoSize;
    private final VirtualDeviceIdChangeListener virtualDeviceIdChangeListener;
    private float volume;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;
    private final Player wrappingPlayer;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Api31 {
        private Api31() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$registerMediaMetricsListener$0(Context context, boolean z, ExoPlayerImpl exoPlayerImpl, PlayerId playerId) {
            MediaMetricsListener create = MediaMetricsListener.create(context);
            if (create == null) {
                Log.w(ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return;
            }
            if (z) {
                exoPlayerImpl.addAnalyticsListener(create);
            }
            playerId.setLogSessionId(create.getLogSessionId());
        }

        public static void registerMediaMetricsListener(final Context context, final ExoPlayerImpl exoPlayerImpl, final boolean z, final PlayerId playerId) {
            exoPlayerImpl.getClock().createHandler(exoPlayerImpl.getPlaybackLooper(), null).post(new Runnable() { // from class: androidx.media3.exoplayer.s
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImpl.Api31.lambda$registerMediaMetricsListener$0(context, z, exoPlayerImpl, playerId);
                }
            });
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class CodecParameterListenerManager {
        private CodecParameters lastNotifiedParameters;
        private final Map<CodecParametersChangeListener, List<String>> listeners;
        private final int trackType;

        private CodecParameterListenerManager(int i) {
            this.trackType = i;
            this.listeners = new HashMap();
            this.lastNotifiedParameters = CodecParameters.EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list) {
            this.listeners.put(codecParametersChangeListener, list);
            updateAndSendSubscribedKeysToRenderer();
            codecParametersChangeListener.onCodecParametersChanged(createFilteredCodecParameters(this.lastNotifiedParameters, list));
        }

        private CodecParameters createFilteredCodecParameters(CodecParameters codecParameters, List<String> list) {
            CodecParameters.Builder buildUpon = codecParameters.buildUpon();
            HashSet hashSet = new HashSet(list);
            for (String str : codecParameters.keySet()) {
                if (!hashSet.contains(str)) {
                    buildUpon.remove(str);
                }
            }
            return buildUpon.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onParametersChanged(CodecParameters codecParameters) {
            for (Map.Entry entry : new HashMap(this.listeners).entrySet()) {
                CodecParametersChangeListener codecParametersChangeListener = (CodecParametersChangeListener) entry.getKey();
                List<String> list = (List) entry.getValue();
                CodecParameters createFilteredCodecParameters = createFilteredCodecParameters(codecParameters, list);
                if (!createFilteredCodecParameters.equals(createFilteredCodecParameters(this.lastNotifiedParameters, list))) {
                    codecParametersChangeListener.onCodecParametersChanged(createFilteredCodecParameters);
                }
            }
            this.lastNotifiedParameters = codecParameters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeListener(CodecParametersChangeListener codecParametersChangeListener) {
            if (this.listeners.remove(codecParametersChangeListener) != null) {
                updateAndSendSubscribedKeysToRenderer();
            }
        }

        private void updateAndSendSubscribedKeysToRenderer() {
            int i = sy1.K;
            ry1 ry1Var = new ry1(4);
            for (List<String> list : this.listeners.values()) {
                list.getClass();
                ry1Var.d(list);
            }
            ExoPlayerImpl.this.sendRendererMessage(this.trackType, 22, ry1Var.g());
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private CameraMotionListener cameraMotionListener;
        private CameraMotionListener internalCameraMotionListener;
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i, Object obj) {
            if (i == 7) {
                this.videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.cameraMotionListener = (CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private final MediaSource mediaSource;
        private Timeline timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Timeline getTimeline() {
            return this.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object getUid() {
            return this.uid;
        }

        public void updateTimeline(Timeline timeline) {
            this.timeline = timeline;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class VirtualDeviceIdChangeListener {
        private final WeakReference<Context> contextReference;
        private final IntConsumer listener;

        private VirtualDeviceIdChangeListener(Context context) {
            this.contextReference = new WeakReference<>(context);
            IntConsumer intConsumer = new IntConsumer() { // from class: androidx.media3.exoplayer.v
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    ExoPlayerImpl.VirtualDeviceIdChangeListener.this.onVirtualDeviceIdChanged(i);
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer2);
                }
            };
            this.listener = intConsumer;
            HandlerWrapper createHandler = ExoPlayerImpl.this.clock.createHandler(ExoPlayerImpl.this.applicationLooper, null);
            Objects.requireNonNull(createHandler);
            context.registerDeviceIdChangeListener(new ja(createHandler, (byte) 1), intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onVirtualDeviceIdChanged(int i) {
            if (ExoPlayerImpl.this.playerReleased) {
                return;
            }
            ExoPlayerImpl.this.sendRendererMessage(1, 19, Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            Context context = this.contextReference.get();
            if (context == null) {
                return;
            }
            context.unregisterDeviceIdChangeListener(this.listener);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    public ExoPlayerImpl(ExoPlayer.Builder builder, Player player) {
        Looper looper;
        Clock clock;
        try {
            Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + Util.DEVICE_DEBUG_INFO + "]");
            this.applicationContext = builder.context.getApplicationContext();
            this.analyticsCollector = (AnalyticsCollector) builder.analyticsCollectorFunction.apply(builder.clock);
            this.priority = builder.priority;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            ComponentListener componentListener = new ComponentListener();
            this.componentListener = componentListener;
            this.frameMetadataListener = new FrameMetadataListener();
            Handler handler = new Handler(builder.looper);
            RenderersFactory renderersFactory = (RenderersFactory) builder.renderersFactorySupplier.get();
            Renderer[] createRenderers = renderersFactory.createRenderers(handler, componentListener, componentListener, componentListener, componentListener);
            this.renderers = createRenderers;
            sp0.z(createRenderers.length > 0);
            this.secondaryRenderers = new Renderer[createRenderers.length];
            int i = 0;
            while (true) {
                Renderer[] rendererArr = this.secondaryRenderers;
                if (i >= rendererArr.length) {
                    break;
                }
                Renderer renderer = this.renderers[i];
                ComponentListener componentListener2 = this.componentListener;
                rendererArr[i] = renderersFactory.createSecondaryRenderer(renderer, handler, componentListener2, componentListener2, componentListener2, componentListener2);
                i++;
            }
            TrackSelector trackSelector = (TrackSelector) builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = (MediaSource.Factory) builder.mediaSourceFactorySupplier.get();
            BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.scrubbingModeParameters = builder.scrubbingModeParameters;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            this.enforceAdPlaybackOnTimelineRefresh = builder.enforceAdPlaybackOnTimelineRefresh;
            Looper looper2 = builder.looper;
            this.applicationLooper = looper2;
            Clock clock2 = builder.clock;
            this.clock = clock2;
            Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            this.listeners = new ListenerSet<>(looper2, clock2, new o(this));
            this.audioOffloadListeners = new CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new ArrayList();
            this.shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = ExoPlayer.PreloadConfiguration.DEFAULT;
            Renderer[] rendererArr2 = this.renderers;
            TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArr2.length], new ExoTrackSelection[rendererArr2.length], Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new Timeline.Period();
            Player.Commands build = new Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, trackSelector.isSetParametersSupported()).addIf(23, builder.deviceVolumeControlEnabled).addIf(25, builder.deviceVolumeControlEnabled).addIf(33, builder.deviceVolumeControlEnabled).addIf(26, builder.deviceVolumeControlEnabled).addIf(34, builder.deviceVolumeControlEnabled).build();
            this.permanentAvailableCommands = build;
            this.availableCommands = new Player.Commands.Builder().addAll(build).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock2.createHandler(looper2, null);
            o oVar = new o(this);
            this.playbackInfoUpdateListener = oVar;
            this.playbackInfo = PlaybackInfo.createDummy(trackSelectorResult);
            this.analyticsCollector.setPlayer(player2, looper2);
            PlayerId playerId = new PlayerId(builder.playerName);
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(this.applicationContext, this.renderers, this.secondaryRenderers, trackSelector, trackSelectorResult, (LoadControl) builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, this.analyticsCollector, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, builder.perStreamMediaProgressionEnabled, looper2, clock2, oVar, playerId, builder.playbackLooperProvider, this.preloadConfiguration, this.frameMetadataListener, builder.enforceAdPlaybackOnTimelineRefresh);
            this.internalPlayer = exoPlayerImplInternal;
            Looper playbackLooper = exoPlayerImplInternal.getPlaybackLooper();
            this.volume = 1.0f;
            this.repeatMode = 0;
            MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
            this.mediaMetadata = mediaMetadata;
            this.playlistMetadata = mediaMetadata;
            this.staticAndDynamicMediaMetadata = mediaMetadata;
            this.maskingWindowIndex = -1;
            this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(this.analyticsCollector);
            bandwidthMeter.addEventListener(new Handler(looper2), this.analyticsCollector);
            addAudioOffloadListener(this.componentListener);
            long j = builder.foregroundModeTimeoutMs;
            if (j > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(j);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                Api31.registerMediaMetricsListener(this.applicationContext, this, builder.usePlatformDiagnostics, playerId);
            }
            BackgroundThreadStateHandler<Integer> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(0, playbackLooper, looper2, clock2, new o(this));
            this.audioSessionIdState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImpl.this.lambda$new$3();
                }
            });
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.context, playbackLooper, builder.looper, this.componentListener, clock2);
            Clock clock3 = clock2;
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            if (builder.suppressPlaybackOnUnsuitableOutput) {
                SuitableOutputChecker suitableOutputChecker = builder.suitableOutputChecker;
                this.suitableOutputChecker = suitableOutputChecker;
                suitableOutputChecker.enable(new o(this), this.applicationContext, looper2, playbackLooper, clock3);
                clock3 = clock3;
            } else {
                this.suitableOutputChecker = null;
            }
            if (builder.deviceVolumeControlEnabled) {
                Clock clock4 = clock3;
                looper = playbackLooper;
                clock = clock4;
                this.streamVolumeManager = new StreamVolumeManager(builder.context, this.componentListener, this.audioAttributes.getVolumeControlStream(), playbackLooper, looper2, clock4);
            } else {
                looper = playbackLooper;
                clock = clock3;
                this.streamVolumeManager = null;
            }
            int i3 = builder.wakeMode;
            if (!builder.wakeModeSet) {
                if (builder.stuckBufferingDetectionTimeoutMs != Integer.MAX_VALUE && builder.stuckPlayingDetectionTimeoutMs != Integer.MAX_VALUE && builder.stuckPlayingNotEndingTimeoutMs != Integer.MAX_VALUE && builder.stuckSuppressedDetectionTimeoutMs != Integer.MAX_VALUE) {
                    i3 = 1;
                }
                i3 = 0;
            }
            WakeLockManager wakeLockManager = new WakeLockManager(builder.context, looper, clock);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(i3 != 0);
            WifiLockManager wifiLockManager = new WifiLockManager(builder.context, looper, clock);
            this.wifiLockManager = wifiLockManager;
            int i4 = 2;
            wifiLockManager.setEnabled(i3 == 2);
            this.deviceInfo = DeviceInfo.UNKNOWN;
            this.videoSize = VideoSize.UNKNOWN;
            this.surfaceSize = Size.UNKNOWN;
            this.virtualDeviceIdChangeListener = i2 >= 34 ? new VirtualDeviceIdChangeListener(builder.context) : null;
            this.audioListenerManager = new CodecParameterListenerManager(1);
            this.videoListenerManager = new CodecParameterListenerManager(i4);
            this.stuckPlayerDetector = new StuckPlayerDetector(this, this.componentListener, clock, builder.stuckBufferingDetectionTimeoutMs, builder.stuckPlayingDetectionTimeoutMs, builder.stuckPlayingNotEndingTimeoutMs, builder.stuckSuppressedDetectionTimeoutMs);
            exoPlayerImplInternal.setScrubbingModeParameters(this.scrubbingModeParameters);
            exoPlayerImplInternal.setAudioAttributes(this.audioAttributes, builder.handleAudioFocus);
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(6, 8, this.frameMetadataListener);
            sendRendererMessage(16, Integer.valueOf(this.priority));
            AudioOutputProvider audioOutputProvider = builder.audioOutputProvider;
            if (audioOutputProvider != null) {
                sendRendererMessage(1, 20, audioOutputProvider);
            }
            this.constructorFinished.open();
        } catch (Throwable th) {
            this.constructorFinished.open();
            throw th;
        }
    }

    private static TrackSelectionParameters addDisabledTrackTypes(TrackSelectionParameters trackSelectionParameters, sy1 sy1Var) {
        TrackSelectionParameters.Builder buildUpon = trackSelectionParameters.buildUpon();
        ee5 it = sy1Var.iterator();
        while (it.hasNext()) {
            buildUpon.setTrackTypeDisabled(((Integer) it.next()).intValue(), true);
        }
        return buildUpon.build();
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2 + i, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private PlaybackInfo addMediaSourcesInternal(PlaybackInfo playbackInfo, int i, List<MediaSource> list) {
        Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(i, list);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, createMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(playbackInfo)));
        this.internalPlayer.addMediaSources(i, addMediaSourceHolders, this.shuffleOrder);
        return maskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaMetadata buildUpdatedMediaMetadata() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i, int i2, List<MediaItem> list) {
        if (i2 - i != list.size()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            if (!this.mediaSourceHolderSnapshots.get(i3).mediaSource.canUpdateMediaItem(list.get(i3 - i))) {
                return false;
            }
        }
        return true;
    }

    private int computePlaybackSuppressionReason(boolean z) {
        if (this.scrubbingModeEnabled) {
            return 4;
        }
        SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback()) {
            return (this.playbackInfo.playbackSuppressionReason != 1 || z) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo createDeviceInfo(StreamVolumeManager streamVolumeManager) {
        return new DeviceInfo.Builder(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
    }

    private Timeline createMaskingTimeline() {
        return new PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    private PlayerMessage createMessageInternal(PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, this.clock, exoPlayerImplInternal.getPlaybackLooper());
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, boolean z, int i, boolean z2, boolean z3) {
        Timeline timeline = playbackInfo2.timeline;
        Timeline timeline2 = playbackInfo.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            return (z && i == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) ? new Pair<>(Boolean.TRUE, 0) : (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            s83.r();
            return null;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    private long getContentPositionInternal(PlaybackInfo playbackInfo) {
        if (!playbackInfo.periodId.isAd()) {
            return Util.usToMs(getCurrentPositionUsInternal(playbackInfo));
        }
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
        if (playbackInfo.requestedContentPositionUs == C.TIME_UNSET) {
            return playbackInfo.timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window).getDefaultPositionMs();
        }
        return Util.usToMs(playbackInfo.requestedContentPositionUs) + this.period.getPositionInWindowMs();
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return Util.msToUs(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = playbackInfo.sleepingForOffload ? playbackInfo.getEstimatedPositionUs() : playbackInfo.positionUs;
        return playbackInfo.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(PlaybackInfo playbackInfo) {
        return playbackInfo.timeline.isEmpty() ? this.maskingWindowIndex : playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(Timeline timeline, Timeline timeline2, int i, long j) {
        boolean isEmpty = timeline.isEmpty();
        long j2 = C.TIME_UNSET;
        if (isEmpty || timeline2.isEmpty()) {
            boolean z = !timeline.isEmpty() && timeline2.isEmpty();
            int i2 = z ? -1 : i;
            if (!z) {
                j2 = j;
            }
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, i2, j2);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, Util.msToUs(j));
        Object obj = ((Pair) Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int resolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        return resolveSubsequentPeriod != -1 ? maskWindowPositionMsOrGetPeriodPositionUs(timeline2, resolveSubsequentPeriod, timeline2.getWindow(resolveSubsequentPeriod, this.window).getDefaultPositionMs()) : maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, C.TIME_UNSET);
    }

    private Player.PositionInfo getPositionInfo(long j) {
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int currentPeriodIndex = getCurrentPeriodIndex();
        if (this.playbackInfo.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            PlaybackInfo playbackInfo = this.playbackInfo;
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            currentPeriodIndex = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
        }
        int i = currentPeriodIndex;
        long usToMs = Util.usToMs(j);
        long usToMs2 = this.playbackInfo.periodId.isAd() ? Util.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : usToMs;
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new Player.PositionInfo(obj, currentMediaItemIndex, mediaItem, obj2, i, usToMs, usToMs2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private Player.PositionInfo getPreviousPositionInfo(int i, PlaybackInfo playbackInfo, int i2) {
        int i3;
        int i4;
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        long j;
        long requestedContentPositionUs;
        Timeline.Period period = new Timeline.Period();
        if (playbackInfo.timeline.isEmpty()) {
            i3 = i2;
            i4 = i3;
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, period);
            int i5 = period.windowIndex;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            Object obj4 = playbackInfo.timeline.getWindow(i5, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i4 = indexOfPeriod;
            obj = obj4;
            i3 = i5;
        }
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        if (i == 0) {
            boolean isAd = mediaPeriodId.isAd();
            MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
            if (isAd) {
                j = period.getAdDurationUs(mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
                requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo);
            } else if (mediaPeriodId2.nextAdGroupIndex != -1) {
                j = getRequestedContentPositionUs(this.playbackInfo);
                requestedContentPositionUs = j;
            } else {
                requestedContentPositionUs = period.positionInWindowUs + period.durationUs;
                j = requestedContentPositionUs;
            }
        } else if (mediaPeriodId.isAd()) {
            j = playbackInfo.positionUs;
            requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo);
        } else {
            j = period.positionInWindowUs + playbackInfo.positionUs;
            requestedContentPositionUs = j;
        }
        long usToMs = Util.usToMs(j);
        long usToMs2 = Util.usToMs(requestedContentPositionUs);
        MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo.periodId;
        return new Player.PositionInfo(obj, i3, mediaItem, obj2, i4, usToMs, usToMs2, mediaPeriodId3.adGroupIndex, mediaPeriodId3.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        return playbackInfo.requestedContentPositionUs == C.TIME_UNSET ? playbackInfo.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + playbackInfo.requestedContentPositionUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        int i;
        long j;
        boolean z;
        long j2;
        int i2 = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i2;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (i2 == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            int i3 = -1;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> childTimelines = ((PlaylistTimeline) timeline).getChildTimelines();
                sp0.z(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i4 = 0; i4 < childTimelines.size(); i4++) {
                    this.mediaSourceHolderSnapshots.get(i4).updateTimeline(childTimelines.get(i4));
                }
            }
            boolean z3 = this.pendingDiscontinuity;
            long j3 = C.TIME_UNSET;
            if (z3) {
                boolean z4 = playbackInfoUpdate.playbackInfo.timeline.isEmpty() && this.playbackInfo.timeline.isEmpty();
                boolean equalsExceptNextAdGroupIndex = playbackInfoUpdate.playbackInfo.periodId.equalsExceptNextAdGroupIndex(this.playbackInfo.periodId);
                boolean z5 = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs;
                if (z4 || (equalsExceptNextAdGroupIndex && z5)) {
                    z2 = false;
                }
                if (z2) {
                    i3 = getCurrentMediaItemIndex();
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        j2 = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        PlaybackInfo playbackInfo = playbackInfoUpdate.playbackInfo;
                        j2 = periodPositionUsToWindowPositionUs(timeline, playbackInfo.periodId, playbackInfo.discontinuityStartPositionUs);
                    }
                    j3 = j2;
                }
                z = z2;
                long j4 = j3;
                i = i3;
                j = j4;
            } else {
                i = -1;
                j = -9223372036854775807L;
                z = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z, this.pendingDiscontinuityReason, j, i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this.wrappingPlayer, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new c(this, playbackInfoUpdate, (byte) 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        int generateAudioSessionId = Util.generateAudioSessionId(this.applicationContext);
        if (this.audioSessionIdState.get().intValue() != generateAudioSessionId) {
            this.audioSessionIdState.setStateInBackground(Integer.valueOf(generateAudioSessionId));
            this.internalPlayer.setAudioSessionId(generateAudioSessionId, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$9(Player.Listener listener) {
        listener.onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setAudioSessionId$13(int i, Integer num) {
        if (i == 0) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$setAudioSessionId$14(int i, Integer num) {
        if (i == 0) {
            i = Util.generateAudioSessionId(this.applicationContext);
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$11(Player.Listener listener) {
        listener.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$31(Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$17(PlaybackInfo playbackInfo, int i, Player.Listener listener) {
        listener.onTimelineChanged(playbackInfo.timeline, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$18(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$20(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlayerErrorChanged(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$21(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlayerError(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$22(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onTracksChanged(playbackInfo.trackSelectorResult.tracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$24(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onLoadingChanged(playbackInfo.isLoading);
        listener.onIsLoadingChanged(playbackInfo.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$25(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlayerStateChanged(playbackInfo.playWhenReady, playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$26(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlaybackStateChanged(playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$27(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$28(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(playbackInfo.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$29(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onIsPlayingChanged(playbackInfo.isPlaying());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$30(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onPlaybackParametersChanged(playbackInfo.playbackParameters);
    }

    private static PlaybackInfo maskPlaybackState(PlaybackInfo playbackInfo, int i) {
        PlaybackInfo copyWithPlaybackState = playbackInfo.copyWithPlaybackState(i);
        return (i == 1 || i == 4) ? copyWithPlaybackState.copyWithIsLoading(false) : copyWithPlaybackState;
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, Timeline timeline, Pair<Object, Long> pair) {
        List<Metadata> list;
        sp0.o(timeline.isEmpty() || pair != null);
        Timeline timeline2 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        PlaybackInfo copyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long msToUs = Util.msToUs(this.maskingWindowPositionMs);
            TrackGroupArray trackGroupArray = TrackGroupArray.EMPTY;
            TrackSelectorResult trackSelectorResult = this.emptyTrackSelectorResult;
            ay1 ay1Var = dy1.J;
            PlaybackInfo copyWithLoadingMediaPeriodId = copyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, msToUs, msToUs, msToUs, 0L, trackGroupArray, trackSelectorResult, x24.M).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            return copyWithLoadingMediaPeriodId;
        }
        Object obj = copyWithTimeline.periodId.periodUid;
        boolean equals = obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = !equals ? new MediaSource.MediaPeriodId(pair.first) : copyWithTimeline.periodId;
        long longValue = ((Long) pair.second).longValue();
        long msToUs2 = Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            msToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
            if (equals && msToUs2 - longValue == 1 && msToUs2 == timeline2.getPeriodByUid(obj, this.period).durationUs) {
                msToUs2--;
            }
        }
        if (!equals || longValue < msToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            sp0.z(!mediaPeriodId2.isAd());
            TrackGroupArray trackGroupArray2 = !equals ? TrackGroupArray.EMPTY : copyWithTimeline.trackGroups;
            TrackSelectorResult trackSelectorResult2 = !equals ? this.emptyTrackSelectorResult : copyWithTimeline.trackSelectorResult;
            if (equals) {
                list = copyWithTimeline.staticMetadata;
            } else {
                ay1 ay1Var2 = dy1.J;
                list = x24.M;
            }
            PlaybackInfo copyWithLoadingMediaPeriodId2 = copyWithTimeline.copyWithNewPosition(mediaPeriodId2, longValue, longValue, longValue, 0L, trackGroupArray2, trackSelectorResult2, list).copyWithLoadingMediaPeriodId(mediaPeriodId2);
            copyWithLoadingMediaPeriodId2.bufferedPositionUs = longValue;
            return copyWithLoadingMediaPeriodId2;
        }
        if (longValue != msToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            sp0.z(!mediaPeriodId3.isAd());
            long max = Math.max(0L, copyWithTimeline.totalBufferedDurationUs - (longValue - msToUs2));
            long j = copyWithTimeline.bufferedPositionUs;
            if (copyWithTimeline.loadingMediaPeriodId.equals(copyWithTimeline.periodId)) {
                j = longValue + max;
            }
            PlaybackInfo copyWithNewPosition = copyWithTimeline.copyWithNewPosition(mediaPeriodId3, longValue, longValue, longValue, max, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata);
            copyWithNewPosition.bufferedPositionUs = j;
            return copyWithNewPosition;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(copyWithTimeline.loadingMediaPeriodId.periodUid);
        if (indexOfPeriod != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
            return copyWithTimeline;
        }
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        boolean isAd = mediaPeriodId.isAd();
        Timeline.Period period = this.period;
        long adDurationUs = isAd ? period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : period.durationUs;
        MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
        PlaybackInfo copyWithLoadingMediaPeriodId3 = copyWithTimeline.copyWithNewPosition(mediaPeriodId4, copyWithTimeline.positionUs, copyWithTimeline.positionUs, copyWithTimeline.discontinuityStartPositionUs, adDurationUs - copyWithTimeline.positionUs, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId4);
        copyWithLoadingMediaPeriodId3.bufferedPositionUs = adDurationUs;
        return copyWithLoadingMediaPeriodId3;
    }

    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i, Util.msToUs(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (i == this.surfaceSize.getWidth() && i2 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new Size(i, i2);
        this.listeners.sendEvent(24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.i
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        sendRendererMessage(2, 14, new Size(i, i2));
    }

    private void maybeUpdatePlaybackSuppressionReason() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReady(playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioSessionIdChanged(int i, int i2) {
        verifyApplicationThread();
        this.internalPlayer.setAudioSessionId(i2, false);
        this.listeners.sendEvent(21, new m((byte) 1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectedOutputSuitabilityChanged(boolean z) {
        if (this.playerReleased) {
            return;
        }
        if (!z) {
            maybeUpdatePlaybackSuppressionReason();
        } else if (this.playbackInfo.playbackSuppressionReason == 3) {
            maybeUpdatePlaybackSuppressionReason();
        }
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return this.period.getPositionInWindowUs() + j;
    }

    private PlaybackInfo removeMediaItemsInternal(PlaybackInfo playbackInfo, int i, int i2) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(playbackInfo);
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i2);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, createMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i3 = maskTimelineAndPosition.playbackState;
        if (i3 != 1 && i3 != 4 && currentWindowIndexInternal >= i && currentWindowIndexInternal < i2) {
            if (ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, playbackInfo.periodId.periodUid, timeline, createMaskingTimeline) == -1) {
                maskTimelineAndPosition = maskPlaybackState(maskTimelineAndPosition, 4);
            }
        }
        this.internalPlayer.removeMediaSources(i, i2, this.shuffleOrder);
        return maskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.mediaSourceHolderSnapshots.remove(i3);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i2);
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRendererMessage(int i, int i2, Object obj) {
        for (Renderer renderer : this.renderers) {
            if (i == -1 || renderer.getTrackType() == i) {
                createMessageInternal(renderer).setType(i2).setPayload(obj).send();
            }
        }
        for (Renderer renderer2 : this.secondaryRenderers) {
            if (renderer2 != null && (i == -1 || renderer2.getTrackType() == i)) {
                createMessageInternal(renderer2).setType(i2).setPayload(obj).send();
            }
        }
    }

    private List<MediaSourceList.MediaSourceHolder> setMediaSourceHolders(List<MediaSource> list, int i) {
        this.mediaSourceHolderSnapshots.clear();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndSet(arrayList.size(), i);
        return arrayList;
    }

    private void setMediaSourcesInternal(List<MediaSource> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> mediaSourceHolders = setMediaSourceHolders(list, i);
        Timeline createMaskingTimeline = createMaskingTimeline();
        if (!createMaskingTimeline.isEmpty() && i >= createMaskingTimeline.getWindowCount()) {
            throw new IllegalSeekPositionException(createMaskingTimeline, i, j);
        }
        if (z) {
            int firstWindowIndex = createMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j2 = C.TIME_UNSET;
            i2 = firstWindowIndex;
        } else if (i == -1) {
            i2 = currentWindowIndexInternal;
            j2 = currentPosition;
        } else {
            j2 = j;
            i2 = i;
        }
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(createMaskingTimeline, i2, j2));
        if (maskTimelineAndPosition.playbackState == 1) {
            i3 = 1;
        } else {
            i3 = 4;
            if (!createMaskingTimeline.isEmpty()) {
                if (i2 == -1) {
                    i3 = maskTimelineAndPosition.playbackState;
                } else if (i2 < createMaskingTimeline.getWindowCount()) {
                    i3 = 2;
                }
            }
        }
        PlaybackInfo maskPlaybackState = maskPlaybackState(maskTimelineAndPosition, i3);
        this.internalPlayer.setMediaSources(mediaSourceHolders, i2, Util.msToUs(j2), this.shuffleOrder);
        updatePlaybackInfo(maskPlaybackState, 0, (this.playbackInfo.periodId.periodUid.equals(maskPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(maskPlaybackState), -1, false);
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(Object obj) {
        Object obj2 = this.videoOutput;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean videoOutput = this.internalPlayer.setVideoOutput(obj, z ? this.detachSurfaceTimeoutMs : C.TIME_UNSET);
        if (z) {
            Object obj3 = this.videoOutput;
            Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (videoOutput) {
            return;
        }
        stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal(ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo copyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        copyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        PlaybackInfo maskPlaybackState = maskPlaybackState(copyWithLoadingMediaPeriodId, 1);
        if (exoPlaybackException != null) {
            maskPlaybackState = maskPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(maskPlaybackState, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private void updateAvailableCommands() {
        Player.Commands commands = this.availableCommands;
        Player.Commands availableCommands = Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new o(this));
    }

    private void updateMediaSourcesWithMediaItems(int i, int i2, List<MediaItem> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i, i2, list);
        for (int i3 = i; i3 < i2; i3++) {
            MediaSourceHolderSnapshot mediaSourceHolderSnapshot = this.mediaSourceHolderSnapshots.get(i3);
            mediaSourceHolderSnapshot.updateTimeline(TimelineWithUpdatedMediaItem.create(mediaSourceHolderSnapshot.getTimeline(), list.get(i3 - i)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z, int i) {
        int computePlaybackSuppressionReason = computePlaybackSuppressionReason(z);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z && playbackInfo.playbackSuppressionReason == computePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == i) {
            return;
        }
        this.pendingOperationAcks++;
        if (playbackInfo.sleepingForOffload) {
            playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        PlaybackInfo copyWithPlayWhenReady = playbackInfo.copyWithPlayWhenReady(z, i, computePlaybackSuppressionReason);
        this.internalPlayer.setPlayWhenReady(z, i, computePlaybackSuppressionReason);
        updatePlaybackInfo(copyWithPlayWhenReady, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private void updatePlaybackInfo(final PlaybackInfo playbackInfo, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        final byte b;
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        final byte b2 = 0;
        if (!playbackInfo.timeline.isEmpty()) {
            sp0.A(playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", playbackInfo.periodId.periodUid, playbackInfo.timeline.getClass().getName(), Integer.valueOf(playbackInfo.timeline.getWindowCount())));
        }
        boolean equals = playbackInfo2.timeline.equals(playbackInfo.timeline);
        Pair<Boolean, Integer> evaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z, i2, !equals, z2);
        boolean booleanValue = ((Boolean) evaluateMediaItemTransitionReason.first).booleanValue();
        final int intValue = ((Integer) evaluateMediaItemTransitionReason.second).intValue();
        if (booleanValue) {
            r6 = playbackInfo.timeline.isEmpty() ? null : playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            this.staticAndDynamicMediaMetadata = MediaMetadata.EMPTY;
        }
        if (booleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(playbackInfo.staticMetadata).build();
        }
        MediaMetadata buildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean equals2 = buildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = buildUpdatedMediaMetadata;
        boolean z3 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z4 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z4 || z3) {
            updateWakeAndWifiLock();
        }
        boolean z5 = playbackInfo2.isLoading;
        boolean z6 = playbackInfo.isLoading;
        boolean z7 = z5 != z6;
        if (z7) {
            updatePriorityTaskManagerForIsLoadingChange(z6);
        }
        if (!equals) {
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.d
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b3 = b2;
                    int i4 = i;
                    Object obj2 = playbackInfo;
                    switch (b3) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17((PlaybackInfo) obj2, i4, (Player.Listener) obj);
                            break;
                        default:
                            ((Player.Listener) obj).onMediaItemTransition((MediaItem) obj2, i4);
                            break;
                    }
                }
            });
        }
        if (z) {
            final Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i2, playbackInfo2, i3);
            final Player.PositionInfo positionInfo = getPositionInfo(j);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ExoPlayerImpl.lambda$updatePlaybackInfo$18(i2, previousPositionInfo, positionInfo, (Player.Listener) obj);
                }
            });
        }
        if (booleanValue) {
            final byte b3 = 1;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.d
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b32 = b3;
                    int i4 = intValue;
                    Object obj2 = r1;
                    switch (b32) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17((PlaybackInfo) obj2, i4, (Player.Listener) obj);
                            break;
                        default:
                            ((Player.Listener) obj).onMediaItemTransition((MediaItem) obj2, i4);
                            break;
                    }
                }
            });
        }
        final byte b4 = 7;
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b5 = b4;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b5) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
            if (playbackInfo.playbackError != null) {
                final byte b5 = 8;
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        byte b52 = b5;
                        PlaybackInfo playbackInfo3 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj;
                        switch (b52) {
                            case 0:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                                break;
                            case 1:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                                break;
                            case 2:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                                break;
                            case 3:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                                break;
                            case 4:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                                break;
                            case 5:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                                break;
                            case 6:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                                break;
                            case 7:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                                break;
                            case 8:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                                break;
                            default:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                                break;
                        }
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            final byte b6 = 9;
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b6;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        if (equals2) {
            b = 0;
        } else {
            b = 0;
            this.listeners.queueEvent(14, new e(this.mediaMetadata, b));
        }
        if (z7) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final byte b7 = 1;
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b7;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        final byte b8 = 4;
        if (z4) {
            final byte b9 = 2;
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b9;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        final byte b10 = 5;
        if (z3 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            final byte b11 = 3;
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b11;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        final byte b12 = 6;
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b8;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b10;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b12;
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo3, listener);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo3, listener);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo3, listener);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo3, listener);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo3, listener);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo3, listener);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo3, listener);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo3, listener);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo3, listener);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo3, listener);
                            break;
                    }
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            Iterator<ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z) {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(this.priority);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean isSleepingForOffload = isSleepingForOffload();
                WakeLockManager wakeLockManager = this.wakeLockManager;
                if (getPlayWhenReady() && !isSleepingForOffload) {
                    z = true;
                }
                wakeLockManager.setStayAwake(z);
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                s83.r();
                return;
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String formatInvariant = Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                zy.i(formatInvariant);
            } else {
                Log.w(TAG, formatInvariant, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
                this.hasNotifiedFullWrongThreadWarning = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.addListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        list.getClass();
        this.audioListenerManager.addListener(codecParametersChangeListener, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void addListener(Player.Listener listener) {
        ListenerSet<Player.Listener> listenerSet = this.listeners;
        listener.getClass();
        listenerSet.add(listener);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i, List<MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(i, createMediaSources(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i, List<MediaSource> list) {
        verifyApplicationThread();
        sp0.o(i >= 0);
        int min = Math.min(i, this.mediaSourceHolderSnapshots.size());
        if (this.playbackInfo.timeline.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, min, list), 0, false, 5, C.TIME_UNSET, -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        list.getClass();
        this.videoListenerManager.addListener(codecParametersChangeListener, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.textureView) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // androidx.media3.common.Player
    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // androidx.media3.common.BasePlayer, androidx.media3.common.Player
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionIdState.get().intValue();
    }

    @Override // androidx.media3.common.Player
    public Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId) ? Util.usToMs(this.playbackInfo.bufferedPositionUs) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Clock getClock() {
        return this.clock;
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Timeline.Period periodByUid = playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        return Util.usToMs(periodPositionUsToWindowPositionUs(playbackInfo3.timeline, playbackInfo3.loadingMediaPeriodId, j));
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (!this.playbackInfo.timeline.isEmpty()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        }
        int i = this.maskingWindowIndex;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // androidx.media3.common.Player
    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // androidx.media3.common.Player
    public Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Renderer getRenderer(int i) {
        verifyApplicationThread();
        return this.renderers[i];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.renderers[i].getTrackType();
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ScrubbingModeParameters getScrubbingModeParameters() {
        verifyApplicationThread();
        return this.scrubbingModeParameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Renderer getSecondaryRenderer(int i) {
        verifyApplicationThread();
        return this.secondaryRenderers[i];
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ShuffleOrder getShuffleOrder() {
        verifyApplicationThread();
        return this.shuffleOrder;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.common.Player
    public Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // androidx.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        TrackSelectionParameters parameters = this.trackSelector.getParameters();
        return this.scrubbingModeEnabled ? parameters.buildUpon().setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode).build() : parameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // androidx.media3.common.Player
    public VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isScrubbingModeEnabled() {
        verifyApplicationThread();
        return this.scrubbingModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        sp0.o(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.mediaSourceHolderSnapshots.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i >= size || i == min || i == min2) {
            return;
        }
        Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        Util.moveItems(this.mediaSourceHolderSnapshots, i, min, min2);
        this.shuffleOrder = this.shuffleOrder.cloneAndMove(i, min, min2);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, createMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(this.playbackInfo)));
        this.internalPlayer.moveMediaSources(i, min, min2, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void mute() {
        verifyApplicationThread();
        if (this.volume != 0.0f) {
            setVolume(0.0f);
        }
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1) {
            return;
        }
        PlaybackInfo copyWithPlaybackError = playbackInfo.copyWithPlaybackError(null);
        PlaybackInfo maskPlaybackState = maskPlaybackState(copyWithPlaybackError, copyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(maskPlaybackState, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void release() {
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + "]");
        verifyApplicationThread();
        this.audioBecomingNoisyManager.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
        VirtualDeviceIdChangeListener virtualDeviceIdChangeListener = this.virtualDeviceIdChangeListener;
        if (virtualDeviceIdChangeListener != null && Build.VERSION.SDK_INT >= 34) {
            virtualDeviceIdChangeListener.release();
        }
        this.stuckPlayerDetector.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.k
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ExoPlayerImpl.lambda$release$9((Player.Listener) obj);
                }
            });
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload) {
            playbackInfo = playbackInfo.copyWithEstimatedPosition();
            this.playbackInfo = playbackInfo;
        }
        PlaybackInfo maskPlaybackState = maskPlaybackState(playbackInfo, 1);
        this.playbackInfo = maskPlaybackState;
        PlaybackInfo copyWithLoadingMediaPeriodId = maskPlaybackState.copyWithLoadingMediaPeriodId(maskPlaybackState.periodId);
        this.playbackInfo = copyWithLoadingMediaPeriodId;
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        removeSurfaceCallbacks();
        Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            priorityTaskManager.getClass();
            priorityTaskManager.remove(this.priority);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
        if (this.playbackInfo.timeline.isEmpty()) {
            return;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        boolean z = playbackInfo2.timeline.getIndexOfPeriod(playbackInfo2.periodId.periodUid) != -1;
        Locale locale = Locale.US;
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        sp0.A(z, String.format(locale, "periodUid %s not found in timeline %s with size %d", playbackInfo3.periodId.periodUid, playbackInfo3.timeline.getClass().getName(), Integer.valueOf(this.playbackInfo.timeline.getWindowCount())));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.removeListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        this.audioListenerManager.removeListener(codecParametersChangeListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        ListenerSet<Player.Listener> listenerSet = this.listeners;
        listener.getClass();
        listenerSet.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        sp0.o(i >= 0 && i2 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        int min = Math.min(i2, size);
        if (i >= size || i == min) {
            return;
        }
        PlaybackInfo removeMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i, min);
        updatePlaybackInfo(removeMediaItemsInternal, 0, !removeMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(removeMediaItemsInternal), -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        this.videoListenerManager.removeListener(codecParametersChangeListener);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, List<MediaItem> list) {
        verifyApplicationThread();
        sp0.o(i >= 0 && i2 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (canUpdateMediaSourcesWithMediaItems(i, min, list)) {
            updateMediaSourcesWithMediaItems(i, min, list);
            return;
        }
        List<MediaSource> createMediaSources = createMediaSources(list);
        if (this.playbackInfo.timeline.isEmpty()) {
            setMediaSources(createMediaSources, this.maskingWindowIndex == -1);
        } else {
            PlaybackInfo removeMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, min, createMediaSources), i, min);
            updatePlaybackInfo(removeMediaItemsInternal, 0, !removeMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(removeMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i, long j, int i2, boolean z) {
        verifyApplicationThread();
        if (i == -1) {
            return;
        }
        sp0.o(i >= 0);
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty() || i < timeline.getWindowCount()) {
            this.analyticsCollector.notifySeekStarted();
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                Log.w(TAG, "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            PlaybackInfo playbackInfo = this.playbackInfo;
            int i3 = playbackInfo.playbackState;
            if (i3 == 3 || (i3 == 4 && !timeline.isEmpty())) {
                playbackInfo = maskPlaybackState(this.playbackInfo, 2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i, j));
            this.internalPlayer.seekTo(timeline, i, Util.msToUs(j));
            updatePlaybackInfo(maskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(maskTimelineAndPosition), currentMediaItemIndex, z);
        }
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!Objects.equals(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            byte b = 1;
            sendRendererMessage(1, 3, audioAttributes);
            StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(audioAttributes.getVolumeControlStream());
            }
            this.listeners.queueEvent(20, new n(audioAttributes, b));
        }
        this.internalPlayer.setAudioAttributes(this.audioAttributes, z);
        this.listeners.flushEvents();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioCodecParameters(CodecParameters codecParameters) {
        verifyApplicationThread();
        codecParameters.getClass();
        sendRendererMessage(1, 21, codecParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int i) {
        verifyApplicationThread();
        if (this.audioSessionIdState.get().intValue() == i) {
            return;
        }
        this.audioSessionIdState.updateStateAsync(new j((byte) 0, i), new k0(this, i, (byte) 3));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z, 1);
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, 1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setEnforceAdPlaybackOnTimelineRefresh(boolean z) {
        verifyApplicationThread();
        if (this.enforceAdPlaybackOnTimelineRefresh == z) {
            return;
        }
        this.enforceAdPlaybackOnTimelineRefresh = z;
        this.internalPlayer.setEnforceAdPlaybackOnTimelineRefresh(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z) {
        verifyApplicationThread();
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (this.internalPlayer.setForegroundMode(z)) {
                return;
            }
            stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMaxSeekToPreviousPositionMs(long j) {
        verifyApplicationThread();
        sp0.o(j >= 0);
        if (this.maxSeekToPreviousPositionMs == j) {
            return;
        }
        this.maxSeekToPreviousPositionMs = j;
        this.listeners.sendEvent(18, new l(j, (byte) 1));
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, C.TIME_UNSET, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z) {
            return;
        }
        this.pauseAtEndOfMediaItems = z;
        this.internalPlayer.setPauseAtEndOfWindow(z);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        updatePlayWhenReady(z, 1);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        PlaybackInfo copyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(copyWithPlaybackParameters, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        mediaMetadata.getClass();
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new n(this, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i) {
        verifyApplicationThread();
        if (this.priority == i) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            priorityTaskManager.getClass();
            priorityTaskManager.add(i);
            priorityTaskManager.remove(this.priority);
        }
        this.priority = i;
        sendRendererMessage(16, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        if (priorityTaskManager2 != priorityTaskManager) {
            if (this.isPriorityTaskManagerRegistered) {
                priorityTaskManager2.getClass();
                priorityTaskManager2.remove(this.priority);
            }
            if (priorityTaskManager == null || !isLoading()) {
                this.isPriorityTaskManagerRegistered = false;
            } else {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            }
            this.priorityTaskManager = priorityTaskManager;
        }
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i) {
        verifyApplicationThread();
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.queueEvent(8, new m((byte) 0, i));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeEnabled(boolean z) {
        TrackSelectionParameters build;
        verifyApplicationThread();
        if (z == this.scrubbingModeEnabled) {
            return;
        }
        this.scrubbingModeEnabled = z;
        if (!this.scrubbingModeParameters.disabledTrackTypes.isEmpty() && this.trackSelector.isSetParametersSupported()) {
            TrackSelectionParameters parameters = this.trackSelector.getParameters();
            if (z) {
                this.disabledTrackTypesWithoutScrubbingMode = parameters.disabledTrackTypes;
                build = addDisabledTrackTypes(parameters, this.scrubbingModeParameters.disabledTrackTypes);
            } else {
                build = parameters.buildUpon().setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode).build();
                this.disabledTrackTypesWithoutScrubbingMode = null;
            }
            if (!build.equals(parameters)) {
                this.trackSelector.setParameters(build);
            }
        }
        this.internalPlayer.setScrubbingModeEnabled(z);
        maybeUpdatePlaybackSuppressionReason();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters) {
        verifyApplicationThread();
        if (this.scrubbingModeParameters.equals(scrubbingModeParameters)) {
            return;
        }
        ScrubbingModeParameters scrubbingModeParameters2 = this.scrubbingModeParameters;
        this.scrubbingModeParameters = scrubbingModeParameters;
        this.internalPlayer.setScrubbingModeParameters(scrubbingModeParameters);
        if (this.scrubbingModeEnabled && this.trackSelector.isSetParametersSupported() && !scrubbingModeParameters2.disabledTrackTypes.equals(scrubbingModeParameters.disabledTrackTypes)) {
            TrackSelectionParameters addDisabledTrackTypes = addDisabledTrackTypes(getTrackSelectionParameters(), scrubbingModeParameters.disabledTrackTypes);
            if (addDisabledTrackTypes.equals(this.trackSelector.getParameters())) {
                return;
            }
            this.trackSelector.setParameters(addDisabledTrackTypes);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekBackIncrementMs(long j) {
        verifyApplicationThread();
        sp0.o(j > 0);
        if (this.seekBackIncrementMs == j) {
            return;
        }
        this.seekBackIncrementMs = j;
        this.listeners.sendEvent(16, new l(j, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekForwardIncrementMs(long j) {
        verifyApplicationThread();
        sp0.o(j > 0);
        if (this.seekForwardIncrementMs == j) {
            return;
        }
        this.seekForwardIncrementMs = j;
        this.listeners.sendEvent(17, new l(j, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            this.listeners.queueEvent(9, new g((byte) 1, z));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        sp0.o(shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size());
        this.shuffleOrder = shuffleOrder;
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(createMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean z) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z) {
            return;
        }
        this.skipSilenceEnabled = z;
        sendRendererMessage(1, 9, Boolean.valueOf(z));
        this.listeners.sendEvent(23, new g((byte) 0, z));
    }

    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
        this.listeners.setThrowsWhenUsingWrongThread(z);
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof DefaultAnalyticsCollector) {
            ((DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z);
        }
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        TrackSelectionParameters trackSelectionParameters2;
        verifyApplicationThread();
        if (this.trackSelector.isSetParametersSupported()) {
            TrackSelectionParameters trackSelectionParameters3 = getTrackSelectionParameters();
            if (this.scrubbingModeEnabled) {
                this.disabledTrackTypesWithoutScrubbingMode = trackSelectionParameters.disabledTrackTypes;
                trackSelectionParameters2 = addDisabledTrackTypes(trackSelectionParameters, this.scrubbingModeParameters.disabledTrackTypes);
            } else {
                trackSelectionParameters2 = trackSelectionParameters;
            }
            if (!trackSelectionParameters2.equals(this.trackSelector.getParameters())) {
                this.trackSelector.setParameters(trackSelectionParameters2);
            }
            if (trackSelectionParameters3.equals(trackSelectionParameters)) {
                return;
            }
            this.listeners.sendEvent(19, new n(trackSelectionParameters, (byte) 2));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i) {
            return;
        }
        this.videoChangeFrameRateStrategy = i;
        sendRendererMessage(2, 5, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoCodecParameters(CodecParameters codecParameters) {
        verifyApplicationThread();
        codecParameters.getClass();
        sendRendererMessage(2, 21, codecParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Effect> list) {
        verifyApplicationThread();
        try {
            try {
                Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class);
                sendRendererMessage(2, 13, list);
            } catch (NoSuchMethodException e) {
                e = e;
                zl1.i("Could not find required lib-effect dependencies.", e);
            }
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e = e2;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.videoScalingMode = i;
        sendRendererMessage(2, 4, Integer.valueOf(i));
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i, i);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            removeSurfaceCallbacks();
            this.sphericalGLSurfaceView = (SphericalGLSurfaceView) surfaceView;
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
            this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
            setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVirtualDeviceId(int i) {
        verifyApplicationThread();
        sendRendererMessage(1, 19, Integer.valueOf(i));
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f) {
        verifyApplicationThread();
        final float constrainValue = Util.constrainValue(f, 0.0f, 1.0f);
        float f2 = this.volume;
        if (f2 == constrainValue) {
            return;
        }
        if (constrainValue != 0.0f) {
            f2 = constrainValue;
        }
        this.unmuteVolume = f2;
        this.volume = constrainValue;
        this.internalPlayer.setVolume(constrainValue);
        this.listeners.sendEvent(22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onVolumeChanged(constrainValue);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else {
            if (i != 2) {
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        stopInternal(null);
        ay1 ay1Var = dy1.J;
        this.currentCueGroup = new CueGroup(x24.M, this.playbackInfo.positionUs);
    }

    @Override // androidx.media3.common.Player
    public void unmute() {
        verifyApplicationThread();
        if (this.volume == 0.0f) {
            float f = this.unmuteVolume;
            if (f != 0.0f) {
                setVolume(f);
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i, MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i, Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i, j);
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z, i);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), z);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i, j, false);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioBecomingNoisyManager.Listener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener, StuckPlayerDetector.Callback {
        private ComponentListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Integer lambda$onAudioSessionIdChanged$2(int i, Integer num) {
            return Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Integer lambda$onAudioSessionIdChanged$3(int i, Integer num) {
            return Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetadata$6(Player.Listener listener) {
            listener.onMediaMetadataChanged(ExoPlayerImpl.this.mediaMetadata);
        }

        @Override // androidx.media3.common.audio.AudioBecomingNoisyManager.Listener
        public void onAudioBecomingNoisy() {
            ExoPlayerImpl.this.updatePlayWhenReady(false, 3);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecParametersChanged(CodecParameters codecParameters) {
            ExoPlayerImpl.this.audioListenerManager.onParametersChanged(codecParameters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            ExoPlayerImpl.this.audioFormat = null;
            ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.audioFormat = format;
            ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
            ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSessionIdChanged(int i) {
            ExoPlayerImpl.this.audioSessionIdState.updateStateAsync(new j((byte) 1, i), new j((byte) 2, i));
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i, long j, long j2) {
            ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(CueGroup cueGroup) {
            ExoPlayerImpl.this.currentCueGroup = cueGroup;
            ExoPlayerImpl.this.listeners.sendEvent(27, new n(cueGroup, (byte) 3));
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i, long j) {
            ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i, j);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.staticAndDynamicMediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            MediaMetadata buildUpdatedMediaMetadata = ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!buildUpdatedMediaMetadata.equals(ExoPlayerImpl.this.mediaMetadata)) {
                ExoPlayerImpl.this.mediaMetadata = buildUpdatedMediaMetadata;
                ExoPlayerImpl.this.listeners.queueEvent(14, new n(this, (byte) 4));
            }
            ExoPlayerImpl.this.listeners.queueEvent(28, new n(metadata, (byte) 5));
            ExoPlayerImpl.this.listeners.flushEvents();
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j) {
            ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j);
            if (ExoPlayerImpl.this.videoOutput == obj) {
                ExoPlayerImpl.this.listeners.sendEvent(26, new s83((byte) 18));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (ExoPlayerImpl.this.skipSilenceEnabled == z) {
                return;
            }
            ExoPlayerImpl.this.skipSilenceEnabled = z;
            ExoPlayerImpl.this.listeners.sendEvent(23, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.t
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z) {
            ExoPlayerImpl.this.updateWakeAndWifiLock();
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i) {
            DeviceInfo createDeviceInfo = ExoPlayerImpl.createDeviceInfo(ExoPlayerImpl.this.streamVolumeManager);
            if (createDeviceInfo.equals(ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            ExoPlayerImpl.this.deviceInfo = createDeviceInfo;
            ExoPlayerImpl.this.listeners.sendEvent(29, new n(createDeviceInfo, (byte) 7));
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i, final boolean z) {
            ExoPlayerImpl.this.listeners.sendEvent(30, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.u
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // androidx.media3.common.util.StuckPlayerDetector.Callback
        public void onStuckPlayerDetected(StuckPlayerException stuckPlayerException) {
            ExoPlayerImpl.this.stopInternal(ExoPlaybackException.createForUnexpected(stuckPlayerException, 1003));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecParametersChanged(CodecParameters codecParameters) {
            ExoPlayerImpl.this.videoListenerManager.onParametersChanged(codecParameters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            ExoPlayerImpl.this.videoFormat = null;
            ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i) {
            ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j, i);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.videoFormat = format;
            ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(VideoSize videoSize) {
            ExoPlayerImpl.this.videoSize = videoSize;
            ExoPlayerImpl.this.listeners.sendEvent(25, new e(videoSize, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(List<Cue> list) {
            ExoPlayerImpl.this.listeners.sendEvent(27, new n(list, (byte) 6));
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public final /* synthetic */ void onOffloadedPlayback(boolean z) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    private void sendRendererMessage(int i, Object obj) {
        sendRendererMessage(-1, i, obj);
    }
}
