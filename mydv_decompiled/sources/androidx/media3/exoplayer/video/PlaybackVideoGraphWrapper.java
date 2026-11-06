package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.gz4;
import defpackage.ja;
import defpackage.mc;
import defpackage.sp0;
import defpackage.uo3;
import defpackage.wi4;
import defpackage.ws0;
import defpackage.x24;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PlaybackVideoGraphWrapper implements VideoGraph.Listener {
    public static final long LATE_US_TO_DROP_INPUT_FRAME = 15000;
    private static final Executor NO_OP_EXECUTOR = new mc(1);
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private static final String TAG = "PlaybackVidGraphWrapper";
    private final Clock clock;
    private dy1 compositionEffects;
    private VideoCompositorSettings compositorSettings;
    private final Context context;
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private final long earlyThresholdToDropInputUs;
    private final boolean enablePlaylistMode;
    private long finalFramePresentationTimeUs;
    private HandlerWrapper handler;
    private boolean hasSignaledEndOfVideoGraphOutputStream;
    private final SparseArray<InputVideoSink> inputVideoSinks;
    private boolean isInputSdrToneMapped;
    private long lastOutputFramePresentationTimeUs;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int outputStreamFirstFrameReleaseInstruction;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private TimedValueQueue<StreamChangeInfo> pendingStreamChanges;
    private int registeredVideoInputCount;
    private boolean requestOpenGlToneMapping;
    private int state;
    private int totalVideoInputCount;
    private final VideoSink.VideoFrameHandler videoFrameHandler;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private VideoGraph videoGraph;
    private final VideoGraph.Factory videoGraphFactory;
    private Format videoGraphOutputFormat;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean built;
        private final Context context;
        private boolean enablePlaylistMode;
        private boolean enableReplayableCache;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private VideoGraph.Factory videoGraphFactory;
        private long lateThresholdToDropInputUs = 15000;
        private VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster(1.0f);
        private Clock clock = Clock.DEFAULT;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public PlaybackVideoGraphWrapper build() {
            sp0.z(!this.built);
            if (this.videoGraphFactory == null) {
                this.videoGraphFactory = new ReflectiveSingleInputVideoGraphFactory(this.enableReplayableCache);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public Builder experimentalSetLateThresholdToDropInputUs(long j) {
            this.lateThresholdToDropInputUs = j;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setEnablePlaylistMode(boolean z) {
            this.enablePlaylistMode = z;
            return this;
        }

        public Builder setEnableReplayableCache(boolean z) {
            this.enableReplayableCache = z;
            return this;
        }

        public Builder setVideoFrameReleaseEarlyTimeForecaster(VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster) {
            this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
            return this;
        }

        public Builder setVideoGraphFactory(VideoGraph.Factory factory) {
            this.videoGraphFactory = factory;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onEnded(long j);

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered();

        void onFrameAvailableForRendering();

        void onFrameDropped();

        void onVideoSizeChanged(VideoSize videoSize);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final gz4 DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS = wi4.t(new g());
        private final boolean enableReplayableCache;

        public ReflectiveDefaultVideoFrameProcessorFactory(boolean z) {
            this.enableReplayableCache = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Class lambda$static$0() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, VideoFrameProcessor.Listener listener) {
            try {
                Class cls = (Class) DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS.get();
                Object newInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(newInstance, Boolean.valueOf(this.enableReplayableCache));
                Object invoke = cls.getMethod("build", null).invoke(newInstance, null);
                invoke.getClass();
                return ((VideoFrameProcessor.Factory) invoke).create(context, debugViewProvider, colorInfo, z, executor, listener);
            } catch (Exception e) {
                throw new VideoFrameProcessingException(e);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ReflectiveSingleInputVideoGraphFactory implements VideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectiveSingleInputVideoGraphFactory(boolean z) {
            this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory(z);
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, long j, boolean z) {
            try {
                return ((VideoGraph.Factory) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, j, z);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ShiftingTimestampIterator implements TimestampIterator {
        private final long shift;
        private final TimestampIterator timestampIterator;

        public ShiftingTimestampIterator(TimestampIterator timestampIterator, long j) {
            this.timestampIterator = timestampIterator;
            this.shift = j;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public TimestampIterator copyOf() {
            return new ShiftingTimestampIterator(this.timestampIterator.copyOf(), this.shift);
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long getLastTimestampUs() {
            long lastTimestampUs = this.timestampIterator.getLastTimestampUs();
            return lastTimestampUs == C.TIME_UNSET ? C.TIME_UNSET : lastTimestampUs + this.shift;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return this.timestampIterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            return this.timestampIterator.next() + this.shift;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class StreamChangeInfo {
        public final int firstFrameReleaseInstruction;
        public final long fromTimestampUs;
        public final long startPositionUs;

        public StreamChangeInfo(long j, int i, long j2) {
            this.startPositionUs = j;
            this.firstFrameReleaseInstruction = i;
            this.fromTimestampUs = j2;
        }
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        this.pendingStreamChanges = new TimedValueQueue<>();
        VideoGraph.Factory factory = builder.videoGraphFactory;
        factory.getClass();
        this.videoGraphFactory = factory;
        this.inputVideoSinks = new SparseArray<>();
        ay1 ay1Var = dy1.J;
        this.compositionEffects = x24.M;
        this.compositorSettings = VideoCompositorSettings.DEFAULT;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        Clock clock = builder.clock;
        this.clock = clock;
        this.earlyThresholdToDropInputUs = builder.lateThresholdToDropInputUs != C.TIME_UNSET ? -builder.lateThresholdToDropInputUs : -9223372036854775807L;
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = builder.videoFrameReleaseEarlyTimeForecaster;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, clock);
        this.videoFrameHandler = new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.1
            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void render(long j) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(j);
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void skip() {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(-2L);
            }
        };
        this.listeners = new CopyOnWriteArraySet<>();
        this.videoGraphOutputFormat = new Format.Builder().build();
        this.outputStreamStartPositionUs = C.TIME_UNSET;
        this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
        this.finalFramePresentationTimeUs = C.TIME_UNSET;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowReleaseFirstFrameBeforeStarted() {
        this.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z) {
        TimedValueQueue<StreamChangeInfo> timedValueQueue;
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z);
            while (true) {
                int size = this.pendingStreamChanges.size();
                timedValueQueue = this.pendingStreamChanges;
                if (size <= 1) {
                    break;
                } else {
                    timedValueQueue.pollFirst();
                }
            }
            if (timedValueQueue.size() == 1) {
                StreamChangeInfo pollFirst = this.pendingStreamChanges.pollFirst();
                pollFirst.getClass();
                this.outputStreamStartPositionUs = pollFirst.startPositionUs;
                this.outputStreamFirstFrameReleaseInstruction = pollFirst.firstFrameReleaseInstruction;
                onOutputStreamChanged();
            }
            this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
            if (z) {
                this.finalFramePresentationTimeUs = C.TIME_UNSET;
                this.hasSignaledEndOfVideoGraphOutputStream = false;
            }
            HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.getClass();
            handlerWrapper.post(new defpackage.h(this, (byte) 16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ColorInfo getAdjustedInputColorInfo(ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid() || this.isInputSdrToneMapped) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfVideoGraphOutputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z) {
        return this.defaultVideoSink.isReady(z && this.pendingFlushCount == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinPlayback(boolean z) {
        this.defaultVideoSink.join(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$1() {
        this.pendingFlushCount--;
    }

    private void maybeSetOutputSurfaceInfo(Surface surface, int i, int i2) {
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph == null) {
            return;
        }
        if (surface != null) {
            videoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i, i2));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i, i2));
        } else {
            videoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        VideoSink videoSink = this.defaultVideoSink;
        Format format = this.videoGraphOutputFormat;
        long j = this.outputStreamStartPositionUs;
        int i = this.outputStreamFirstFrameReleaseInstruction;
        ay1 ay1Var = dy1.J;
        videoSink.onInputStreamChanged(1, format, j, i, x24.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean registerInput(Format format, int i) {
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        byte b = 1;
        if (i == 0) {
            sp0.z(this.state == 0);
            ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            try {
                if (this.requestOpenGlToneMapping) {
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                } else if (adjustedInputColorInfo.colorTransfer == 7 && Build.VERSION.SDK_INT < 34 && GlUtil.isBt2020PqExtensionSupported()) {
                    adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
                } else if (GlUtil.isColorTransferSupported(adjustedInputColorInfo.colorTransfer) || Build.VERSION.SDK_INT < 29) {
                    int i2 = adjustedInputColorInfo.colorTransfer;
                    if (i2 == 2 || i2 == 10) {
                        adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                    }
                } else {
                    Log.w(TAG, Util.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(adjustedInputColorInfo.colorTransfer)));
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                }
                ColorInfo colorInfo = adjustedInputColorInfo;
                Clock clock = this.clock;
                Looper myLooper = Looper.myLooper();
                myLooper.getClass();
                HandlerWrapper createHandler = clock.createHandler(myLooper, null);
                this.handler = createHandler;
                try {
                    VideoGraph.Factory factory = this.videoGraphFactory;
                    Context context = this.context;
                    DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                    Objects.requireNonNull(createHandler);
                    playbackVideoGraphWrapper = this;
                    VideoGraph create = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new ja(createHandler, b), 0L, false);
                    playbackVideoGraphWrapper.videoGraph = create;
                    create.setCompositionEffects(playbackVideoGraphWrapper.compositionEffects);
                    playbackVideoGraphWrapper.videoGraph.setCompositorSettings(playbackVideoGraphWrapper.compositorSettings);
                    playbackVideoGraphWrapper.videoGraph.initialize();
                    Pair<Surface, Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        Size size = (Size) pair.second;
                        playbackVideoGraphWrapper.maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                    }
                    playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                    VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
                    DefaultVideoSinkListener defaultVideoSinkListener = new DefaultVideoSinkListener();
                    HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.handler;
                    Objects.requireNonNull(handlerWrapper);
                    videoSink.setListener(defaultVideoSinkListener, new ws0(handlerWrapper, b));
                    playbackVideoGraphWrapper.state = 1;
                } catch (VideoFrameProcessingException e) {
                    throw new VideoSink.VideoSinkException(e, format);
                }
            } catch (GlUtil.GlException e2) {
                throw new VideoSink.VideoSinkException(e2, format);
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!playbackVideoGraphWrapper.isInitialized()) {
                return false;
            }
        }
        try {
            VideoGraph videoGraph = playbackVideoGraphWrapper.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInput(i);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            return true;
        } catch (VideoFrameProcessingException e3) {
            throw new VideoSink.VideoSinkException(e3, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j, long j2) {
        this.defaultVideoSink.render(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeFrameRateStrategy(int i) {
        this.defaultVideoSink.setChangeFrameRateStrategy(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        this.videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f);
        this.defaultVideoSink.setPlaybackSpeed(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i = this.totalVideoInputCount;
        return i != -1 && i == this.registeredVideoInputCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfVideoGraphOutputStream() {
        this.defaultVideoSink.signalEndOfCurrentInputStream();
        this.hasSignaledEndOfVideoGraphOutputStream = true;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public VideoSink getSink(int i) {
        if (Util.contains(this.inputVideoSinks, i)) {
            return this.inputVideoSinks.get(i);
        }
        InputVideoSink inputVideoSink = new InputVideoSink(this.context, i);
        if (i == 0) {
            addListener(inputVideoSink);
        }
        this.inputVideoSinks.put(i, inputVideoSink);
        return inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onEnded(j);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j, boolean z) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, C.TIME_UNSET, this.videoGraphOutputFormat, null);
                return;
            }
            return;
        }
        this.lastOutputFramePresentationTimeUs = j;
        StreamChangeInfo pollFloor = this.pendingStreamChanges.pollFloor(j);
        if (pollFloor != null) {
            this.outputStreamStartPositionUs = pollFloor.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = pollFloor.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.defaultVideoSink.handleInputFrame(j, this.videoFrameHandler);
        long j2 = this.finalFramePresentationTimeUs;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameRateChanged(float f) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setFrameRate(f).build();
        onOutputStreamChanged();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i, int i2) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setWidth(i).setHeight(i2).build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void setCompositionEffects(List<Effect> list) {
        this.compositionEffects = dy1.p(list);
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositionEffects(list);
        }
    }

    public void setCompositorSettings(VideoCompositorSettings videoCompositorSettings) {
        this.compositorSettings = videoCompositorSettings;
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositorSettings(videoCompositorSettings);
        }
    }

    public void setIsInputSdrToneMapped(boolean z) {
        this.isInputSdrToneMapped = z;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void setRequestOpenGlToneMapping(boolean z) {
        this.requestOpenGlToneMapping = z;
    }

    public void setTotalVideoInputCount(int i) {
        if (i < this.totalVideoInputCount) {
            return;
        }
        this.totalVideoInputCount = i;
    }

    public void startRendering() {
        this.defaultVideoSink.startRendering();
    }

    public void stopRendering() {
        this.defaultVideoSink.stopRendering();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        private DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onError(VideoSink.VideoSinkException videoSinkException) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onError(VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFirstFrameRendered() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFirstFrameRendered();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFrameDropped() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public final void onFrameAvailableForRendering() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class InputVideoSink implements VideoSink, Listener {
        private static final int MAX_CONSECUTIVE_FRAMES_TO_DROP = 2;
        private int consecutiveDroppedFrames;
        private long inputBufferTimestampAdjustmentUs;
        private Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean isInitialized;
        private long lastFramePresentationTimeUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private boolean signaledEndOfStream;
        private dy1 videoEffects;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(Context context, int i) {
            this.inputIndex = i;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            ay1 ay1Var = dy1.J;
            this.videoEffects = x24.M;
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            this.listener = VideoSink.Listener.NO_OP;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onError$1(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            Format format = this.inputFormat;
            format.getClass();
            listener.onError(new VideoSink.VideoSinkException(videoFrameProcessingException, format));
        }

        private void registerInputStream(Format format) {
            Format build = format.buildUpon().setColorInfo(PlaybackVideoGraphWrapper.this.getAdjustedInputColorInfo(format.colorInfo)).build();
            int i = this.inputType != 1 ? 2 : 1;
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInputStream(this.inputIndex, i, build, this.videoEffects, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void allowReleaseFirstFrameBeforeStarted() {
            if (PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() == 0) {
                PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            TimedValueQueue timedValueQueue = new TimedValueQueue();
            boolean z = true;
            while (true) {
                int size = PlaybackVideoGraphWrapper.this.pendingStreamChanges.size();
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
                if (size <= 0) {
                    playbackVideoGraphWrapper.pendingStreamChanges = timedValueQueue;
                    return;
                }
                StreamChangeInfo streamChangeInfo = (StreamChangeInfo) playbackVideoGraphWrapper.pendingStreamChanges.pollFirst();
                streamChangeInfo.getClass();
                if (z) {
                    int i = streamChangeInfo.firstFrameReleaseInstruction;
                    if (i == 0 || i == 1) {
                        streamChangeInfo = new StreamChangeInfo(streamChangeInfo.startPositionUs, 0, streamChangeInfo.fromTimestampUs);
                    } else {
                        PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                    }
                    z = false;
                }
                timedValueQueue.add(streamChangeInfo.fromTimestampUs, streamChangeInfo);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z) {
            if (isInitialized()) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.flush();
            }
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.flush(z);
            this.signaledEndOfStream = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            sp0.z(isInitialized());
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            return videoGraph.getInputSurface(this.inputIndex);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            sp0.z(isInitialized());
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            ShiftingTimestampIterator shiftingTimestampIterator = new ShiftingTimestampIterator(timestampIterator, this.inputBufferTimestampAdjustmentUs);
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (!videoGraph.queueInputBitmap(this.inputIndex, bitmap, shiftingTimestampIterator)) {
                return false;
            }
            long lastTimestampUs = shiftingTimestampIterator.getLastTimestampUs();
            sp0.z(lastTimestampUs != C.TIME_UNSET);
            this.lastFramePresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j, VideoSink.VideoFrameHandler videoFrameHandler) {
            int i;
            sp0.z(isInitialized());
            long j2 = j + this.inputBufferTimestampAdjustmentUs;
            long predictEarlyUs = PlaybackVideoGraphWrapper.this.videoFrameReleaseEarlyTimeForecaster.predictEarlyUs(j2);
            if (predictEarlyUs != C.TIME_UNSET && PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs != C.TIME_UNSET && predictEarlyUs < PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs && (i = this.consecutiveDroppedFrames) < 2) {
                this.consecutiveDroppedFrames = i + 1;
                videoFrameHandler.skip();
                return true;
            }
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (videoGraph.getPendingInputFrameCount(this.inputIndex) >= this.videoFrameProcessorMaxPendingFrameCount) {
                return false;
            }
            VideoGraph videoGraph2 = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph2.getClass();
            if (!videoGraph2.registerInputFrame(this.inputIndex)) {
                return false;
            }
            this.lastFramePresentationTimeUs = j2;
            videoFrameHandler.render(j2 * 1000);
            this.consecutiveDroppedFrames = 0;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean initialize(Format format) {
            sp0.z(!isInitialized());
            boolean registerInput = PlaybackVideoGraphWrapper.this.registerInput(format, this.inputIndex);
            this.isInitialized = registerInput;
            return registerInput;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            return isInitialized() && PlaybackVideoGraphWrapper.this.isEnded();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.isInitialized;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z) {
            return PlaybackVideoGraphWrapper.this.isReady(z && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z) {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.joinPlayback(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.this.lambda$onError$1(listener, videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new uo3(listener, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameAvailableForRendering() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new uo3(listener, (byte) 2));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new uo3(listener, (byte) 0));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i, Format format, long j, int i2, List<Effect> list) {
            sp0.z(isInitialized());
            this.videoEffects = dy1.p(list);
            this.inputType = i;
            this.inputFormat = format;
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.hasSignaledEndOfVideoGraphOutputStream = false;
            registerInputStream(format);
            boolean z = this.lastFramePresentationTimeUs == C.TIME_UNSET;
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode || (this.inputIndex == 0 && z)) {
                long j2 = z ? -4611686018427387904L : this.lastFramePresentationTimeUs + 1;
                PlaybackVideoGraphWrapper.this.pendingStreamChanges.add(j2, new StreamChangeInfo(this.inputBufferTimestampAdjustmentUs + j, i2, j2));
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listenerExecutor.execute(new e(this.listener, videoSize, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void redraw() {
            if (isInitialized()) {
                boolean z = this.signaledEndOfStream;
                long j = PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs;
                PlaybackVideoGraphWrapper.this.flush(false);
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.redraw();
                PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs = j;
                if (z) {
                    signalEndOfCurrentInputStream();
                }
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) {
            PlaybackVideoGraphWrapper.this.render(j + this.inputBufferTimestampAdjustmentUs, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setBufferTimestampAdjustmentUs(long j) {
            this.inputBufferTimestampAdjustmentUs = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setChangeFrameRateStrategy(i);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            this.videoEffects = dy1.p(list);
            Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfCurrentInputStream() {
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = this.lastFramePresentationTimeUs;
            if (PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs >= PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs) {
                PlaybackVideoGraphWrapper.this.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.signalEndOfInput(this.inputIndex);
                this.signaledEndOfStream = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void startRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.startRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void stopRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.stopRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public final void onEnded(long j) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }
}
