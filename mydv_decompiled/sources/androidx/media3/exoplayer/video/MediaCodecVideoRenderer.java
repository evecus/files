package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.ScrubbingModeParameters;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.fx2;
import defpackage.gx0;
import defpackage.hf1;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import defpackage.sr;
import defpackage.x24;
import defpackage.zy;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    public static final long DEFAULT_EARLY_SCHEDULING_THRESHOLD_US = 50000;
    public static final long DEFAULT_LATE_THRESHOLD_TO_DROP_DECODER_INPUT_US = 15000;
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final String KEY_HDR_ST2094_50_INFO = "hdr-st2094-50-info";
    private static final int MAX_CONSECUTIVE_DROPPED_INPUT_BUFFERS_COUNT_TO_DISCARD_HEADER = 0;
    private static final float MAX_FRAME_RATE_RATIO_DIFF_TO_KEEP_CODEC = 0.01f;
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final long OFFSET_FROM_PERIOD_END_TO_TREAT_AS_LAST_US = 100000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final Av1SampleDependencyParser av1SampleDependencyParser;
    private int buffersInCodecCount;
    private int changeFrameRateStrategy;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private boolean codecNeedsStripNonHdr10PlusT35Workaround;
    private int consecutiveDroppedFrameCount;
    private int consecutiveDroppedInputBufferCount;
    private final Context context;
    private VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private final PriorityQueue<Long> discardedDecoderInputBufferTimestamps;
    private Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final boolean enableDurationToProgressUs;
    private final boolean enableMediaCodecBufferDecodeOnlyFlag;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private VideoFrameMetadataListener frameMetadataListener;
    private final FixedFrameRateEstimator frameRateEstimator;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private boolean isApplyingContainerHagcMetadata;
    private boolean isFlushRequired;
    private long lastFrameReleaseTimeNs;
    private long lastResetToKeyFramePositionUs;
    private final int maxDroppedFramesToNotify;
    private final long minEarlyUsToDropDecoderInput;
    private long nextOutputBufferToProcessPresentationTimeUs;
    private int nextVideoSinkFirstFrameReleaseInstruction;
    private Size outputResolution;
    private final boolean ownsVideoSink;
    private boolean pendingVideoSinkInputStreamChange;
    private PlaceholderSurface placeholderSurface;
    private int rendererPriority;
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private ScrubbingModeParameters scrubbingModeParameters;
    private long startPositionUs;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    private OnFrameRenderedListener tunnelingOnFrameRenderedListener;
    private List<Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private VideoSink videoSink;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(Context context) {
            Display.HdrCapabilities hdrCapabilities;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private long allowedJoiningTimeMs;
        private float assumedMinimumCodecOperatingRate;
        private boolean buildCalled;
        private MediaCodecAdapter.Factory codecAdapterFactory;
        private final Context context;
        private long earlySchedulingThresholdUs;
        private boolean enableDecoderFallback;
        private boolean enableDurationToProgressUs;
        private boolean enableMediaCodecBufferDecodeOnlyFlag;
        private Handler eventHandler;
        private VideoRendererEventListener eventListener;
        private long lateThresholdToDropDecoderInputUs;
        private int maxDroppedFramesToNotify;
        private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
        private boolean parseAv1SampleDependencies;
        private VideoSink videoSink;

        public Builder(Context context) {
            this.context = context;
            int i = fx2.a;
            this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
            this.assumedMinimumCodecOperatingRate = 0.0f;
            this.parseAv1SampleDependencies = true;
            this.lateThresholdToDropDecoderInputUs = 15000L;
            this.earlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;
        }

        public MediaCodecVideoRenderer build() {
            sp0.z(!this.buildCalled);
            Handler handler = this.eventHandler;
            sp0.z((handler == null && this.eventListener == null) || !(handler == null || this.eventListener == null));
            this.buildCalled = true;
            return new MediaCodecVideoRenderer(this);
        }

        public Builder experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
            this.enableMediaCodecBufferDecodeOnlyFlag = z;
            return this;
        }

        public Builder experimentalSetLateThresholdToDropDecoderInputUs(long j) {
            this.lateThresholdToDropDecoderInputUs = j;
            return this;
        }

        public Builder experimentalSetParseAv1SampleDependencies(boolean z) {
            this.parseAv1SampleDependencies = z;
            return this;
        }

        public Builder setAllowedJoiningTimeMs(long j) {
            this.allowedJoiningTimeMs = j;
            return this;
        }

        public Builder setAssumedMinimumCodecOperatingRate(float f) {
            this.assumedMinimumCodecOperatingRate = f;
            return this;
        }

        public Builder setCodecAdapterFactory(MediaCodecAdapter.Factory factory) {
            this.codecAdapterFactory = factory;
            return this;
        }

        public Builder setEarlySchedulingThresholdUs(long j) {
            this.earlySchedulingThresholdUs = j;
            return this;
        }

        public Builder setEnableDecoderFallback(boolean z) {
            this.enableDecoderFallback = z;
            return this;
        }

        public Builder setEnableDurationToProgressUs(boolean z) {
            this.enableDurationToProgressUs = z;
            return this;
        }

        public Builder setEventHandler(Handler handler) {
            this.eventHandler = handler;
            return this;
        }

        public Builder setEventListener(VideoRendererEventListener videoRendererEventListener) {
            this.eventListener = videoRendererEventListener;
            return this;
        }

        public Builder setMaxDroppedFramesToNotify(int i) {
            this.maxDroppedFramesToNotify = i;
            return this;
        }

        public Builder setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
            this.mediaCodecSelector = mediaCodecSelector;
            return this;
        }

        public Builder setVideoSink(VideoSink videoSink) {
            this.videoSink = videoSink;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public final class OnFrameRenderedListener implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListener(MediaCodecAdapter mediaCodecAdapter) {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j) {
            if (this != MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener || MediaCodecVideoRenderer.this.getCodec() == null) {
                return;
            }
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                mediaCodecVideoRenderer.onProcessedTunneledBuffer(j);
            } catch (ExoPlaybackException e) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j, long j2) {
            if (Build.VERSION.SDK_INT >= 30) {
                handleFrameRendered(j);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    public MediaCodecVideoRenderer(Builder builder) {
        super(builder.context.getApplicationContext(), 2, builder.codecAdapterFactory, builder.mediaCodecSelector, builder.enableDecoderFallback, builder.assumedMinimumCodecOperatingRate);
        Context applicationContext = builder.context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = builder.maxDroppedFramesToNotify;
        this.videoSink = builder.videoSink;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(builder.eventHandler, builder.eventListener);
        this.ownsVideoSink = this.videoSink == null;
        VideoFrameReleaseControl videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, builder.allowedJoiningTimeMs);
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setEarlySchedulingThresholdUs(builder.earlySchedulingThresholdUs);
        this.videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.frameRateEstimator = new FixedFrameRateEstimator(new sr(this, (byte) 3));
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = Size.UNKNOWN;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
        this.startPositionUs = C.TIME_UNSET;
        this.av1SampleDependencyParser = builder.parseAv1SampleDependencies ? new Av1SampleDependencyParser() : null;
        this.discardedDecoderInputBufferTimestamps = new PriorityQueue<>();
        if (builder.lateThresholdToDropDecoderInputUs != C.TIME_UNSET) {
            this.minEarlyUsToDropDecoderInput = -builder.lateThresholdToDropDecoderInputUs;
            this.videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster(1.0f);
        } else {
            this.minEarlyUsToDropDecoderInput = C.TIME_UNSET;
            this.videoFrameReleaseEarlyTimeForecaster = null;
        }
        this.enableMediaCodecBufferDecodeOnlyFlag = builder.enableMediaCodecBufferDecodeOnlyFlag;
        this.enableDurationToProgressUs = builder.enableDurationToProgressUs;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        this.scrubbingModeParameters = null;
    }

    @RequiresNonNull({"videoSink"})
    private void configureVideoSink() {
        this.videoSink.setListener(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink.VideoSinkException videoSinkException) {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED));
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered() {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameAvailableForRendering() {
                Renderer.WakeupListener wakeupListener = MediaCodecVideoRenderer.this.getWakeupListener();
                if (wakeupListener != null) {
                    wakeupListener.onWakeup();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped() {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSize videoSize) {
            }
        }, gx0.I);
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
        if (this.displaySurface != null && !this.outputResolution.equals(Size.UNKNOWN)) {
            this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
        }
        this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
        this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
        List<Effect> list = this.videoEffects;
        if (list != null) {
            this.videoSink.setVideoEffects(list);
        }
    }

    private static void debugLogForBufferRelease(int i, long j, long j2, boolean z, boolean z2, VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo, long j3) {
        if (i == 5) {
            return;
        }
        StringBuilder A = hf1.A(j, "video, release output, pts=", ", pos=");
        A.append(j2);
        A.append(", early=");
        A.append(frameReleaseInfo.getEarlyUs());
        String sb = A.toString();
        if (z) {
            sb = sb.concat(", decode-only");
        }
        if (z2) {
            sb = sb.concat(", last-buffer");
        }
        if (i == 0) {
            sb = sb.concat(", release immediately");
        } else if (i == 1) {
            long releaseTimeNs = frameReleaseInfo.getReleaseTimeNs();
            sb = sb + ", release=" + (releaseTimeNs / 1000);
            if (j3 != 0) {
                StringBuilder sb2 = new StringBuilder(sb);
                sb2.append(" (+");
                sb = r7.D(sb2, (releaseTimeNs - j3) / 1000, ")");
            }
        } else if (i == 2) {
            sb = sb.concat(", drop");
        } else if (i == 3) {
            sb = sb.concat(", skip");
        } else if (i == 4) {
            sb = sb.concat(", ignore");
        }
        Log.d("MCRdebug", sb);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        if (MediaLibraryInfo.enableWorkarounds()) {
            return "NVIDIA".equals(Build.MANUFACTURER);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0729, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        /*
            Method dump skipped, instructions count: 3188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.evaluateDeviceNeedsSetOutputSurfaceWorkaround():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r10, androidx.media3.common.Format r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format):int");
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i = format.height;
        int i2 = format.width;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            int i6 = z ? i5 : i4;
            if (!z) {
                i4 = i5;
            }
            Point alignVideoSize = mediaCodecInfo.alignVideoSize(i6, i4);
            float f2 = format.frameRate;
            if (alignVideoSize != null && mediaCodecInfo.isVideoSizeAndRateSupported(alignVideoSize.x, alignVideoSize.y, f2)) {
                return alignVideoSize;
            }
        }
        return null;
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        String str = format.sampleMimeType;
        if (str == null) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, z2);
    }

    public static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format);
        }
        int size = format.initializationData.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.initializationData.get(i2).length;
        }
        return format.maxInputSize + i;
    }

    private static int getMaxSampleSize(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    private Surface getSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (shouldUseDetachedSurface(mediaCodecInfo)) {
            return null;
        }
        sp0.z(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
        if (placeholderSurface2 != null) {
            return placeholderSurface2;
        }
        PlaceholderSurface newInstance = PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
        this.placeholderSurface = newInstance;
        return newInstance;
    }

    private boolean hasSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        if (this.videoSink != null) {
            return true;
        }
        Surface surface = this.displaySurface;
        return (surface != null && surface.isValid()) || shouldUseDetachedSurface(mediaCodecInfo) || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    private boolean isBufferBeforeStartTime(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < getLastResetPositionUs();
    }

    private boolean isBufferProbablyLastSample(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.isLastSample() || getStreamEndPositionUs() == C.TIME_UNSET) {
            return true;
        }
        return getStreamEndPositionUs() - (decoderInputBuffer.timeUs - getOutputStreamOffsetUs()) <= 100000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = getClock().elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.videoSink == null || Util.isFrameDropAllowedOnSurfaceInput(this.context)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        MediaCodecAdapter codec;
        if (this.tunneling && (codec = getCodec()) != null) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListener(codec);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                codec.setParameters(bundle);
            }
        }
    }

    private void notifyFrameMetadataListener(long j, long j2, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFrameRateEstimateChanged(float f) {
        this.videoFrameReleaseControl.setSurfaceMediaFrameRate(f);
        updateCodecOperatingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void releaseFrame(MediaCodecAdapter mediaCodecAdapter, int i, long j, Format format) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer;
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
            skipOutputBuffer(mediaCodecAdapter, i, j);
            mediaCodecVideoRenderer = this;
        } else {
            mediaCodecVideoRenderer = this;
            mediaCodecVideoRenderer.notifyFrameMetadataListener(j, releaseTimeNs, format);
            mediaCodecVideoRenderer.renderOutputBufferV21(mediaCodecAdapter, i, j, releaseTimeNs);
            releaseTimeNs = releaseTimeNs;
        }
        mediaCodecVideoRenderer.updateVideoFrameProcessingOffsetCounters(earlyUs);
        mediaCodecVideoRenderer.lastFrameReleaseTimeNs = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setOutput(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.displaySurface == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.displaySurface = surface;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
        boolean z = false;
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            if (this.videoSink == null) {
                MediaCodecInfo codecInfo = getCodecInfo();
                codecInfo.getClass();
                if (!hasSurfaceForCodec(codecInfo) || this.codecNeedsSetOutputSurfaceWorkaround) {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                } else {
                    setOutputSurface(codec, getSurfaceForCodec(codecInfo));
                }
            }
            z = true;
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(z);
            } else {
                this.videoFrameReleaseControl.join(z);
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        if (surface != null) {
            setOutputSurfaceV23(mediaCodecAdapter, surface);
        } else if (Build.VERSION.SDK_INT >= 35) {
            detachOutputSurfaceV35(mediaCodecAdapter);
        } else {
            s83.r();
        }
    }

    private boolean shouldDiscardCodecForFrameRateChange(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        int i;
        if (this.changeFrameRateStrategy != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && (i != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f = format.frameRate;
            if (f != -1.0f) {
                float f2 = format2.frameRate;
                if (f2 == -1.0f || (mediaCodecInfo.secure && z)) {
                    return false;
                }
                if (Math.abs((Math.max(f2, f) / Math.min(format2.frameRate, format.frameRate)) - Math.round(r3)) > MAX_FRAME_RATE_RATIO_DIFF_TO_KEEP_CODEC) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int supportsFormatInternal(Context context, MediaCodecSelector mediaCodecSelector, Format format) {
        boolean z;
        int i = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return hf1.k(0, 0, 0, 0);
        }
        boolean z2 = format.drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return hf1.k(1, 0, 0, 0);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(format)) {
            return hf1.k(2, 0, 0, 0);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(context, format);
        if (!isFormatSupported) {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i2);
                if (mediaCodecInfo2.isFormatSupported(context, format)) {
                    z = false;
                    isFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
        }
        z = true;
        int i3 = isFormatSupported ? 4 : 3;
        int i4 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i5 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !Api26.doesDisplaySupportDolbyVision(context)) {
            i6 = 256;
        }
        if (isFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(context, mediaCodecSelector, format, z2, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(context, decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(context, format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateDiscardedBufferCountersWithInputBuffers(long j) {
        boolean isJoining = this.videoFrameReleaseControl.isJoining();
        int i = 0;
        int i2 = 0;
        while (true) {
            Long peek = this.discardedDecoderInputBufferTimestamps.peek();
            if (peek == null || peek.longValue() >= j) {
                break;
            }
            this.discardedDecoderInputBufferTimestamps.poll();
            this.frameRateEstimator.onNextFrame(peek.longValue() * 1000);
            if (peek.longValue() < getLastResetPositionUs() || isJoining) {
                i2++;
            } else {
                i++;
            }
        }
        updateDroppedBufferCounters(i, 0);
        this.decoderCounters.skippedInputBufferCount += i2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = canReuseCodec.discardReasons;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        codecMaxValues.getClass();
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i |= 64;
        }
        if (shouldDiscardCodecForFrameRateChange(mediaCodecInfo, format, format2, z)) {
            i |= 65536;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    public void changeVideoSinkInputStream(VideoSink videoSink, int i, Format format, int i2) {
        List<Effect> list = this.videoEffects;
        if (list == null) {
            ay1 ay1Var = dy1.J;
            list = x24.M;
        }
        videoSink.onInputStreamChanged(i, format, getOutputStreamStartPositionUs(), i2, list);
    }

    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    public PlaybackVideoGraphWrapper createPlaybackVideoGraphWrapper(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
        PlaybackVideoGraphWrapper.Builder enablePlaylistMode = new PlaybackVideoGraphWrapper.Builder(context, videoFrameReleaseControl).setEnablePlaylistMode(true);
        long j = this.minEarlyUsToDropDecoderInput;
        long j2 = C.TIME_UNSET;
        if (j != C.TIME_UNSET) {
            j2 = -j;
        }
        return enablePlaylistMode.experimentalSetLateThresholdToDropInputUs(j2).setClock(getClock()).build();
    }

    public void detachOutputSurfaceV35(MediaCodecAdapter mediaCodecAdapter) {
        mediaCodecAdapter.detachOutputSurface();
    }

    public void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null) {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
            return;
        }
        int i = this.nextVideoSinkFirstFrameReleaseInstruction;
        if (i == 0 || i == 1) {
            this.nextVideoSinkFirstFrameReleaseInstruction = 0;
        } else {
            videoSink.allowReleaseFirstFrameBeforeStarted();
        }
    }

    public void experimentalDisableAdvancingTimestampChecksInVideoFrameReleaseControl() {
        this.videoFrameReleaseControl.experimentalDisableAdvancingTimestampChecks();
    }

    public long getBufferTimestampAdjustmentUs() {
        return -this.startPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        ScrubbingModeParameters scrubbingModeParameters;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.enableMediaCodecBufferDecodeOnlyFlag || (((scrubbingModeParameters = this.scrubbingModeParameters) != null && scrubbingModeParameters.useDecodeOnlyFlag) || this.tunneling)) && isBufferBeforeStartTime(decoderInputBuffer) && !isBufferProbablyLastSample(decoderInputBuffer)) ? 32 : 0;
        }
        return 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int i = format.width;
        int i2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(i, i2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            Format format2 = formatArr[i3];
            if (format.colorInfo != null && format2.colorInfo == null) {
                format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                int i4 = format2.width;
                z |= i4 == -1 || format2.height == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i = Math.max(i, codecMaxSize.x);
                i2 = Math.max(i2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i).setHeight(i2).build()));
                Log.w(TAG, "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new CodecMaxValues(i, i2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        MediaCodecInfo codecInfo;
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.frameRate;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f && getCodec() != null && this.frameRateEstimator.getFrameDurationNs() != C.TIME_UNSET) {
            f2 = 1.0E9f / this.frameRateEstimator.getFrameDurationNs();
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.scrubbingModeParameters == null || (codecInfo = getCodecInfo()) == null) {
            return f4;
        }
        float maxSupportedFrameRate = codecInfo.getMaxSupportedFrameRate(format.width, format.height);
        return f4 != -1.0f ? Math.max(f4, maxSupportedFrameRate) : maxSupportedFrameRate;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long getDurationToProgressUs(long j, long j2, boolean z) {
        if (!this.enableDurationToProgressUs || !z) {
            return super.getDurationToProgressUs(j, j2, z);
        }
        if (getState() != 2) {
            if (isReady() || isEnded()) {
                return 1000000L;
            }
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        if (this.nextOutputBufferToProcessPresentationTimeUs != C.TIME_UNSET && this.videoSink == null) {
            if (isEnded()) {
                return Math.max(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, (long) (((this.nextOutputBufferToProcessPresentationTimeUs - j) / getPlaybackSpeed()) / 2.0f));
            }
            try {
                if (this.videoFrameReleaseControl.getFrameReleaseAction(this.nextOutputBufferToProcessPresentationTimeUs, j, j2, getOutputStreamStartPositionUs(), false, false, this.frameRateEstimator.getFrameDurationNs(), this.frameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo) != 5) {
                    return 0L;
                }
                return Math.max(0L, ((Util.msToUs(getClock().elapsedRealtime()) - j2) + this.videoFrameReleaseInfo.getEarlyUs()) - 25000);
            } catch (ExoPlaybackException unused) {
                Log.w(TAG, "Error while evaluating frame release action");
            }
        }
        return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        maybeSetKeyAllowFrameDrop(mediaFormat);
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, surfaceForCodec, mediaCrypto);
    }

    public MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    public Surface getSurface() {
        return this.displaySurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
                if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodecAdapter codec = getCodec();
                    codec.getClass();
                    setHdr10PlusInfoV29(codec, bArr);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT < 37 || !CodecSpecificDataUtil.isHagcMetadata(byteBuffer)) {
                return;
            }
            byteBuffer.position(5);
            int remaining = byteBuffer.remaining();
            byte[] bArr2 = new byte[remaining];
            byteBuffer.get(bArr2);
            byteBuffer.position(0);
            boolean z = remaining > 0;
            this.isApplyingContainerHagcMetadata = z;
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(KEY_HDR_ST2094_50_INFO, bArr2);
                MediaCodecAdapter codec2 = getCodec();
                codec2.getClass();
                codec2.setParameters(bundle);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.changeFrameRateStrategy = intValue2;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(intValue2);
                return;
            } else {
                this.videoFrameReleaseControl.setChangeFrameRateStrategy(intValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            setVideoEffects((List) obj);
            return;
        }
        if (i == 14) {
            obj.getClass();
            Size size = (Size) obj;
            if (size.getWidth() == 0 || size.getHeight() == 0) {
                return;
            }
            this.outputResolution = size;
            VideoSink videoSink3 = this.videoSink;
            if (videoSink3 != null) {
                Surface surface = this.displaySurface;
                surface.getClass();
                videoSink3.setOutputSurfaceInfo(surface, size);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.rendererPriority = ((Integer) obj).intValue();
                updateCodecImportance();
                break;
            case 17:
                Surface surface2 = this.displaySurface;
                setOutput(null);
                obj.getClass();
                ((MediaCodecVideoRenderer) obj).handleMessage(1, surface2);
                break;
            case 18:
                ScrubbingModeParameters scrubbingModeParameters = this.scrubbingModeParameters;
                boolean z = scrubbingModeParameters != null && scrubbingModeParameters.shouldIncreaseCodecOperatingRate;
                ScrubbingModeParameters scrubbingModeParameters2 = (ScrubbingModeParameters) obj;
                this.scrubbingModeParameters = scrubbingModeParameters2;
                if (z != (scrubbingModeParameters2 != null && scrubbingModeParameters2.shouldIncreaseCodecOperatingRate)) {
                    updateCodecOperatingRate();
                    break;
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.videoSink;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean isReadyForDecoding = isReadyForDecoding();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.isReady(isReadyForDecoding);
        }
        if (isReadyForDecoding && (getCodec() == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(isReadyForDecoding);
    }

    public boolean maybeDropBuffersToKeyframe(long j, boolean z) {
        int skipSource = skipSource(j);
        if (skipSource == 0) {
            return false;
        }
        this.lastResetToKeyFramePositionUs = j;
        boolean isJoining = this.videoFrameReleaseControl.isJoining();
        Iterator<Long> it = this.discardedDecoderInputBufferTimestamps.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().longValue() < getLastResetPositionUs() || isJoining) {
                i2++;
            } else {
                i++;
            }
        }
        this.discardedDecoderInputBufferTimestamps.clear();
        DecoderCounters decoderCounters = this.decoderCounters;
        if (z) {
            int i3 = decoderCounters.skippedInputBufferCount + skipSource;
            decoderCounters.skippedInputBufferCount = i3;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
            decoderCounters.skippedInputBufferCount = i3 + i + i2;
        } else {
            decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(skipSource + i, this.buffersInCodecCount);
            this.decoderCounters.skippedInputBufferCount += i2;
        }
        flushOrReinitializeCodec();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean maybeInitializeProcessingPipeline(Format format) {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.videoSink.initialize(format);
        } catch (VideoSink.VideoSinkException e) {
            throw this.createRendererException(e, format, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
        boolean z;
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        MediaCodecInfo codecInfo = getCodecInfo();
        codecInfo.getClass();
        this.codecHandlesHdr10PlusOutOfBandMetadata = codecInfo.isHdr10PlusOutOfBandMetadataSupported();
        if (Build.VERSION.SDK_INT < 37) {
            MediaCodecInfo codecInfo2 = getCodecInfo();
            codecInfo2.getClass();
            if (codecInfo2.mimeType.equals(MimeTypes.VIDEO_AV1)) {
                z = true;
                this.codecNeedsStripNonHdr10PlusT35Workaround = z;
                maybeSetupTunnelingForFirstFrame();
            }
        }
        z = false;
        this.codecNeedsStripNonHdr10PlusT35Workaround = z;
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecParametersChanged(CodecParameters codecParameters) {
        this.eventDispatcher.videoCodecParametersChanged(codecParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.reportedVideoSize = null;
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        this.isFlushRequired = shouldFlushCodec();
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        sp0.z((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if (this.videoEffects != null && this.videoSink == null) {
                PlaybackVideoGraphWrapper createPlaybackVideoGraphWrapper = createPlaybackVideoGraphWrapper(this.context, this.videoFrameReleaseControl);
                createPlaybackVideoGraphWrapper.setTotalVideoInputCount(1);
                this.videoSink = createPlaybackVideoGraphWrapper.getSink(0);
            }
            this.hasSetVideoSink = true;
        }
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setClock(getClock());
            this.videoFrameReleaseControl.onStreamChanged(!z2 ? 1 : 0);
        } else {
            configureVideoSink();
            this.nextVideoSinkFirstFrameReleaseInstruction = !z2 ? 1 : 0;
            experimentalEnableProcessedStreamChangedAtStart();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.isApplyingContainerHagcMetadata = false;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
        Format format = formatHolder.format;
        format.getClass();
        eventDispatcher.inputFormatChanged(format, onInputFormatChanged);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        int integer;
        int i;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i = format.width;
            integer = format.height;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            int integer2 = z ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = format.pixelWidthHeightRatio;
        int i2 = format.rotationDegrees;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.decodedVideoSize = new VideoSize(i, integer, f);
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.pendingVideoSinkInputStreamChange) {
            this.frameRateEstimator.onFormatChanged(format.frameRate);
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            changeVideoSinkInputStream(videoSink, 1, format.buildUpon().setWidth(i).setHeight(integer).setPixelWidthHeightRatio(f).build(), this.nextVideoSinkFirstFrameReleaseInstruction);
            this.nextVideoSinkFirstFrameReleaseInstruction = 2;
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null && !z) {
            videoSink.flush(true);
        }
        if (z2) {
            this.lastResetToKeyFramePositionUs = j;
        }
        super.onPositionReset(j, z, z2);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        if (z) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(false);
            } else {
                this.videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
            if (this.startPositionUs == C.TIME_UNSET) {
                this.startPositionUs = getOutputStreamStartPositionUs();
            }
            this.videoSink.setBufferTimestampAdjustmentUs(getBufferTimestampAdjustmentUs());
        } else {
            this.videoFrameReleaseControl.onStreamChanged(2);
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    public void onProcessedTunneledBuffer(long j) {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ColorInfo colorInfo;
        MediaCodecInfo codecInfo = getCodecInfo();
        codecInfo.getClass();
        String str = codecInfo.mimeType;
        if (str.equals(MimeTypes.VIDEO_AV1) && (byteBuffer2 = decoderInputBuffer.data) != null) {
            Format codecInputFormat = getCodecInputFormat();
            boolean z = (codecInputFormat == null || (colorInfo = codecInputFormat.colorInfo) == null || colorInfo.lumaBitdepth <= 8) ? false : true;
            if (this.isApplyingContainerHagcMetadata && !byteBuffer2.isReadOnly()) {
                Av1ObuUtil.stripAllT35Metadata(byteBuffer2);
            } else if (z && this.codecNeedsStripNonHdr10PlusT35Workaround && !byteBuffer2.isReadOnly()) {
                Av1ObuUtil.stripNonHdr10PlusT35Metadata(byteBuffer2);
            }
            if (this.av1SampleDependencyParser != null && decoderInputBuffer.isKeyFrame()) {
                this.av1SampleDependencyParser.queueInputBuffer(byteBuffer2);
            }
        } else if (str.equals(MimeTypes.VIDEO_H265) && (byteBuffer = decoderInputBuffer.data) != null && this.isApplyingContainerHagcMetadata && !byteBuffer.isReadOnly()) {
            HevcSeiUtil.stripAllT35Metadata(decoderInputBuffer.data);
        }
        this.consecutiveDroppedInputBufferCount = 0;
        int codecBufferFlags = getCodecBufferFlags(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (codecBufferFlags & 32) == 0) && !this.tunneling) {
            this.buffersInCodecCount++;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        super.onRelease();
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = C.TIME_UNSET;
            this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
            this.isApplyingContainerHagcMetadata = false;
            releasePlaceholderSurface();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.startRendering();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.stopRendering();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, final MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, final int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        mediaCodecAdapter.getClass();
        final long outputStreamOffsetUs = j3 - getOutputStreamOffsetUs();
        updateDiscardedBufferCountersWithInputBuffers(j3);
        this.frameRateEstimator.onNextFrame(1000 * j3);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            if (!z || z2) {
                return videoSink.handleInputFrame(j3, new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2
                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void render(long j4) {
                        MediaCodecVideoRenderer.this.renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, j4);
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void skip() {
                        MediaCodecVideoRenderer.this.dropOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
                    }
                });
            }
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            return true;
        }
        long j4 = j3;
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j4, j, j2, getOutputStreamStartPositionUs(), z, z2, this.frameRateEstimator.getFrameDurationNs(), this.frameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null && frameReleaseAction != 5 && frameReleaseAction != 4) {
            videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(j4, this.videoFrameReleaseInfo.getEarlyUs());
        }
        if (frameReleaseAction != 5) {
            j4 = C.TIME_UNSET;
        }
        this.nextOutputBufferToProcessPresentationTimeUs = j4;
        if (frameReleaseAction == 0) {
            long nanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, nanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, nanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            releaseFrame(mediaCodecAdapter, i, outputStreamOffsetUs, format);
            return true;
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 3) {
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 4 && frameReleaseAction != 5) {
            zy.i(String.valueOf(frameReleaseAction));
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        super.render(j, j2);
    }

    @Deprecated
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    public void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j2);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
        } else if (getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET) {
            this.nextOutputBufferToProcessPresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.discardedDecoderInputBufferTimestamps.clear();
        this.buffersInCodecCount = 0;
        this.consecutiveDroppedInputBufferCount = 0;
        this.isFlushRequired = false;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        Av1SampleDependencyParser av1SampleDependencyParser = this.av1SampleDependencyParser;
        if (av1SampleDependencyParser != null) {
            av1SampleDependencyParser.reset();
        }
    }

    public void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) {
        super.setPlaybackSpeed(f, f2);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f);
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f);
        }
    }

    public void setVideoEffects(List<Effect> list) {
        if (list.equals(VideoFrameProcessor.REDRAW)) {
            VideoSink videoSink = this.videoSink;
            if (videoSink == null || !videoSink.isInitialized()) {
                return;
            }
            this.videoSink.redraw();
            return;
        }
        this.videoEffects = list;
        VideoSink videoSink2 = this.videoSink;
        if (videoSink2 != null) {
            videoSink2.setVideoEffects(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldDiscardDecoderInputBuffer(androidx.media3.decoder.DecoderInputBuffer r9) {
        /*
            r8 = this;
            boolean r0 = r8.isBufferProbablyLastSample(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.isBufferBeforeStartTime(r9)
            androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster r2 = r8.videoFrameReleaseEarlyTimeForecaster
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.timeUs
            long r4 = r2.predictEarlyUs(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.minEarlyUsToDropDecoderInput
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.hasSupplementalData()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.notDependedOn()
            if (r2 == 0) goto L40
            r9.clear()
        L3e:
            r1 = r3
            goto L99
        L40:
            androidx.media3.exoplayer.video.Av1SampleDependencyParser r2 = r8.av1SampleDependencyParser
            if (r2 == 0) goto L99
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = r8.getCodecInfo()
            r2.getClass()
            java.lang.String r2 = r2.mimeType
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L99
            java.nio.ByteBuffer r2 = r9.data
            if (r2 == 0) goto L99
            if (r0 != 0) goto L62
            int r4 = r8.consecutiveDroppedInputBufferCount
            if (r4 > 0) goto L60
            goto L62
        L60:
            r4 = r1
            goto L63
        L62:
            r4 = r3
        L63:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            androidx.media3.exoplayer.video.Av1SampleDependencyParser r5 = r8.av1SampleDependencyParser
            int r4 = r5.sampleLimitAfterSkippingNonReferenceFrame(r2, r4)
            if (r4 != 0) goto L76
            r9.clear()
            goto L3e
        L76:
            int r5 = r2.limit()
            if (r4 == r5) goto L99
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$CodecMaxValues r5 = r8.codecMaxValues
            r5.getClass()
            int r5 = r5.inputSize
            int r5 = r5 + r4
            int r2 = r2.capacity()
            if (r5 >= r2) goto L99
            boolean r2 = r9.isEncrypted()
            if (r2 != 0) goto L99
            java.nio.ByteBuffer r1 = r9.data
            r1.getClass()
            r1.position(r4)
            goto L3e
        L99:
            if (r1 == 0) goto Lad
            if (r0 != 0) goto La2
            int r0 = r8.consecutiveDroppedInputBufferCount
            int r0 = r0 + r3
            r8.consecutiveDroppedInputBufferCount = r0
        La2:
            java.util.PriorityQueue<java.lang.Long> r8 = r8.discardedDecoderInputBufferTimestamps
            long r2 = r9.timeUs
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r8.add(r9)
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.shouldDiscardDecoderInputBuffer(androidx.media3.decoder.DecoderInputBuffer):boolean");
    }

    public boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j, long j2, boolean z) {
        return shouldDropOutputBuffer(j, j2, z);
    }

    public boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && !z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldFlushCodec() {
        boolean z;
        if (!super.shouldFlushCodec()) {
            return false;
        }
        Format codecInputFormat = getCodecInputFormat();
        long streamEndPositionUs = getStreamEndPositionUs();
        if (streamEndPositionUs != C.TIME_UNSET) {
            if (getSkippedFlushOffsetUs() + 1 + streamEndPositionUs <= Long.MAX_VALUE - (getOutputStreamOffsetUs() + streamEndPositionUs)) {
                z = false;
                ScrubbingModeParameters scrubbingModeParameters = this.scrubbingModeParameters;
                return scrubbingModeParameters != null || !scrubbingModeParameters.allowSkippingMediaCodecFlush || this.isFlushRequired || this.tunneling || (codecInputFormat != null && codecInputFormat.maxNumReorderSamples > 0) || z || getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET;
            }
        }
        z = true;
        ScrubbingModeParameters scrubbingModeParameters2 = this.scrubbingModeParameters;
        if (scrubbingModeParameters2 != null) {
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j, long j2) {
        return shouldForceRenderOutputBuffer(j, j2);
    }

    public boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && j2 > 100000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) {
        if (this.videoSink != null && this.ownsVideoSink) {
            j2 -= getBufferTimestampAdjustmentUs();
        }
        return shouldDropBuffersToKeyframe(j, j3, z) && maybeDropBuffersToKeyframe(j2, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldReleaseCodecInsteadOfFlushing() {
        MediaCodecInfo codecInfo = getCodecInfo();
        if (this.videoSink == null || codecInfo == null || !(codecInfo.name.equals("c2.mtk.avc.decoder") || codecInfo.name.equals("c2.mtk.hevc.decoder") || codecInfo.name.equals("c2.mtk.vp9.decoder"))) {
            return super.shouldReleaseCodecInsteadOfFlushing();
        }
        return true;
    }

    public boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    public boolean shouldUseDetachedSurface(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported;
    }

    public boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        if (this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context);
    }

    public void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        return supportsFormatInternal(this.context, mediaCodecSelector, format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        if (getLargestQueuedPresentationTimeUs() == C.TIME_UNSET || j < this.lastResetToKeyFramePositionUs) {
            return false;
        }
        long lastProcessedOutputBufferTimeUs = getLastProcessedOutputBufferTimeUs();
        return lastProcessedOutputBufferTimeUs == C.TIME_UNSET || j > lastProcessedOutputBufferTimeUs;
    }

    public void updateDroppedBufferCounters(int i, int i2) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        int i4 = this.consecutiveDroppedFrameCount + i3;
        this.consecutiveDroppedFrameCount = i4;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i4, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i5 = this.maxDroppedFramesToNotify;
        if (i5 <= 0 || this.droppedFrames < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public void updateVideoFrameProcessingOffsetCounters(long j) {
        this.decoderCounters.addVideoFrameProcessingOffset(j);
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    public static int supportsFormat(Context context, MediaCodecSelector mediaCodecSelector, Format format) {
        return supportsFormatInternal(context, mediaCodecSelector, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        renderOutputBufferV21(mediaCodecAdapter, i, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        Context context = this.context;
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(context, getDecoderInfos(context, mediaCodecSelector, format, z, this.tunneling), format);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i).setAssumedMinimumCodecOperatingRate(f));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f, VideoSink videoSink) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i).setAssumedMinimumCodecOperatingRate(f).setVideoSink(videoSink));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector));
    }
}
