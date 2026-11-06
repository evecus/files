package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleStream;
import defpackage.e34;
import defpackage.ee5;
import defpackage.eq0;
import defpackage.hf1;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import defpackage.sy1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    protected static final boolean DEBUG_LOG_ENABLED = false;
    protected static final String DEBUG_LOG_TAG = "MCRdebug";
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private CodecParameters activeCodecParameters;
    private final float assumedMinimumCodecOperatingRate;
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private final Context context;
    private float currentPlaybackSpeed;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private boolean experimentalEnableProcessedStreamChangedAtStart;
    private boolean hasSkippedFlushAndWaitingForQueueInputBuffer;
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isOutputBufferStale;
    private long largestQueuedPresentationTimeUs;
    private long largestQueuedPresentationTimeWithinDurationUs;
    private long largestStaleModifiedPresentationTimeUs;
    private CodecParameters lastDispatchedCodecParameters;
    private long lastOutputBufferProcessedRealtimeMs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;
    private MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private ExoPlaybackException pendingPlaybackException;
    private DecoderInitializationException preferredDecoderInitializationException;
    private final AtomicInteger readDataResultHolder;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private long skippedFlushOffsetUs;
    private DrmSession sourceDrmSession;
    private sy1 subscribedCodecParameterKeys;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId2.getStringId());
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        private MediaCodecRendererCodecAdapterListener() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class OutputStreamInfo {
        private static final OutputStreamInfo UNSET = new OutputStreamInfo(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, 0);
        private long durationUs;
        private final TimedValueQueue<Format> formatQueue;
        private long lastBufferTimeUs;
        private final long previousStreamLastBufferTimeUs;
        private boolean queuedBufferAfterReset;
        private final long startPositionUs;
        private int streamFlags;
        private final long streamOffsetUs;

        private OutputStreamInfo(long j, long j2, long j3, long j4, int i) {
            this.previousStreamLastBufferTimeUs = j;
            this.startPositionUs = j2;
            this.streamOffsetUs = j3;
            this.durationUs = j4;
            this.streamFlags = i;
            this.formatQueue = new TimedValueQueue<>();
            this.lastBufferTimeUs = C.TIME_UNSET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isDurationStrict() {
            return (this.streamFlags & 1) != 0;
        }
    }

    public MediaCodecRenderer(Context context, int i, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.context = context.getApplicationContext();
        this.codecAdapterFactory = factory;
        mediaCodecSelector.getClass();
        this.mediaCodecSelector = mediaCodecSelector;
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.readDataResultHolder = new AtomicInteger();
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = C.TIME_UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = CODEC_OPERATING_RATE_UNSET;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeWithinDurationUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
        this.largestStaleModifiedPresentationTimeUs = C.TIME_UNSET;
        int i2 = sy1.K;
        this.subscribedCodecParameterKeys = e34.R;
        CodecParameters codecParameters = CodecParameters.EMPTY;
        this.activeCodecParameters = codecParameters;
        this.lastDispatchedCodecParameters = codecParameters;
    }

    private void bypassRead() {
        sp0.z(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int readSource = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (readSource == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (readSource == -4) {
                if (!this.bypassSampleBuffer.isEndOfStream()) {
                    this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                    if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                        getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    }
                    if (this.waitingForFirstSampleInFormat) {
                        Format format = this.inputFormat;
                        format.getClass();
                        this.outputFormat = format;
                        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && !this.outputFormat.initializationData.isEmpty()) {
                            this.outputFormat = this.outputFormat.buildUpon().setEncoderDelay(OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0))).build();
                        }
                        onOutputFormatChanged(this.outputFormat, null);
                        this.waitingForFirstSampleInFormat = false;
                    }
                    this.bypassSampleBuffer.flip();
                    Format format2 = this.outputFormat;
                    if (format2 != null && Objects.equals(format2.sampleMimeType, MimeTypes.AUDIO_OPUS)) {
                        if (this.bypassSampleBuffer.hasSupplementalData()) {
                            DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
                            decoderInputBuffer.format = this.outputFormat;
                            handleInputBufferSupplementalData(decoderInputBuffer);
                        }
                        if (OpusUtil.needToDecodeOpusFrame(getLastResetPositionUs(), this.bypassSampleBuffer.timeUs)) {
                            this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, this.outputFormat.initializationData);
                        }
                    }
                    if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                        break;
                    }
                } else {
                    this.inputStreamEnded = true;
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
            } else if (readSource != -3) {
                s83.r();
                return;
            } else {
                if (hasReadStreamToEnd()) {
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                return;
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean bypassRender(long j, long j2) {
        boolean z;
        sp0.z(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            ByteBuffer byteBuffer = batchBuffer.data;
            int i = this.outputIndex;
            int sampleCount = batchBuffer.getSampleCount();
            long firstSampleTimeUs = this.bypassBatchBuffer.getFirstSampleTimeUs();
            boolean isDecodeOnly = isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs());
            boolean isEndOfStream = this.bypassBatchBuffer.isEndOfStream();
            Format format = this.outputFormat;
            format.getClass();
            z = false;
            if (!processOutputBuffer(j, j2, null, byteBuffer, i, 0, sampleCount, firstSampleTimeUs, isDecodeOnly, isEndOfStream, format)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        } else {
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            sp0.z(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void checkAndNotifyCodecParameterChanges(MediaFormat mediaFormat) {
        if (this.subscribedCodecParameterKeys.isEmpty()) {
            return;
        }
        CodecParameters build = CodecParameters.createFrom(mediaFormat, this.subscribedCodecParameterKeys).build();
        if (build.equals(this.lastDispatchedCodecParameters)) {
            return;
        }
        this.lastDispatchedCodecParameters = build;
        onCodecParametersChanged(build);
    }

    private int codecAdaptationWorkaroundMode(String str) {
        if (!MediaLibraryInfo.enableWorkarounds()) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            String str3 = Build.DEVICE;
            if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                return 1;
            }
        }
        return 0;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return MediaLibraryInfo.enableWorkarounds() && Build.VERSION.SDK_INT == 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        if (!MediaLibraryInfo.enableWorkarounds()) {
            return false;
        }
        String str = mediaCodecInfo.name;
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mediaCodecInfo.secure;
        }
        return true;
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return MediaLibraryInfo.enableWorkarounds() && Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.bypassEnabled = false;
        resetBypassState();
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (shouldReleaseCodecInsteadOfFlushing()) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    private boolean drainAndUpdateCodecDrmSession() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (shouldReleaseCodecInsteadOfFlushing()) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSession();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j, long j2) {
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        mediaCodecAdapter.getClass();
        if (!hasOutputBuffer()) {
            int dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            if (dequeueOutputBufferIndex < 0) {
                if (dequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                long j3 = this.lastOutputBufferProcessedRealtimeMs;
                if (j3 != C.TIME_UNSET && j3 + 100 < getClock().currentTimeMillis()) {
                    processEndOfStream();
                }
                return false;
            }
            long j4 = this.largestStaleModifiedPresentationTimeUs;
            this.isOutputBufferStale = j4 != C.TIME_UNSET && this.outputBufferInfo.presentationTimeUs <= j4;
            MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
            bufferInfo.presentationTimeUs -= this.skippedFlushOffsetUs;
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(dequeueOutputBufferIndex, false);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = dequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(dequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        boolean z = this.outputStreamInfo.isDurationStrict() && this.outputStreamInfo.durationUs != C.TIME_UNSET && this.outputBufferInfo.presentationTimeUs - getOutputStreamOffsetUs() >= this.outputStreamInfo.durationUs;
        this.isDecodeOnlyOutputBuffer = this.isOutputBufferStale || this.hasSkippedFlushAndWaitingForQueueInputBuffer || this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs() || z;
        boolean z2 = (this.outputStreamInfo.lastBufferTimeUs == C.TIME_UNSET || this.outputStreamInfo.lastBufferTimeUs > this.outputBufferInfo.presentationTimeUs || z) ? false : true;
        ByteBuffer byteBuffer2 = this.outputBuffer;
        int i = this.outputIndex;
        MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
        int i2 = bufferInfo3.flags;
        long j5 = bufferInfo3.presentationTimeUs;
        boolean z3 = this.isDecodeOnlyOutputBuffer;
        Format format = this.outputFormat;
        format.getClass();
        if (processOutputBuffer(j, j2, mediaCodecAdapter, byteBuffer2, i, i2, 1, j5, z3, z2, format)) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z4 = (this.outputBufferInfo.flags & 4) != 0;
            if (!z4 && this.codecReceivedEos && z2) {
                this.lastOutputBufferProcessedRealtimeMs = getClock().currentTimeMillis();
            }
            resetOutputBuffer();
            if (!z4) {
                return true;
            }
            processEndOfStream();
        }
        return false;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, DrmSession drmSession, DrmSession drmSession2) {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            if (!drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid())) {
                return true;
            }
            UUID uuid = C.PLAYREADY_UUID;
            if (!uuid.equals(drmSession.getSchemeUuid()) && !uuid.equals(drmSession2.getSchemeUuid())) {
                if (!mediaCodecInfo.secure) {
                    if (drmSession2.getState() != 2) {
                        if (drmSession2.getState() == 3 || drmSession2.getState() == 4) {
                            String str = format.sampleMimeType;
                            str.getClass();
                            if (drmSession2.requiresSecureDecoder(str)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private boolean feedInputBuffer() {
        int i;
        OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
        SampleStream stream = getStream();
        stream.getClass();
        lastOutputStreamInfo.streamFlags = stream.getFlags();
        if (this.codec != null && (i = this.codecDrainState) != 2 && !this.inputStreamEnded) {
            if (i == 0 && shouldReinitCodec()) {
                drainAndReinitializeCodec();
            }
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            mediaCodecAdapter.getClass();
            if (this.inputIndex < 0) {
                int dequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
                this.inputIndex = dequeueInputBufferIndex;
                if (dequeueInputBufferIndex >= 0) {
                    this.buffer.data = mediaCodecAdapter.getInputBuffer(dequeueInputBufferIndex);
                    this.buffer.clear();
                }
            }
            if (this.codecDrainState == 1) {
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                this.codecDrainState = 2;
                return false;
            }
            if (this.codecNeedsAdaptationWorkaroundBuffer) {
                this.codecNeedsAdaptationWorkaroundBuffer = false;
                ByteBuffer byteBuffer = this.buffer.data;
                byteBuffer.getClass();
                byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
                byteBuffer.put(bArr);
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                return true;
            }
            if (this.codecReconfigurationState == 1) {
                int i2 = 0;
                while (true) {
                    Format format = this.codecInputFormat;
                    format.getClass();
                    if (i2 >= format.initializationData.size()) {
                        break;
                    }
                    byte[] bArr2 = this.codecInputFormat.initializationData.get(i2);
                    ByteBuffer byteBuffer2 = this.buffer.data;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr2);
                    i2++;
                }
                this.codecReconfigurationState = 2;
            }
            ByteBuffer byteBuffer3 = this.buffer.data;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            FormatHolder formatHolder = getFormatHolder();
            try {
                mediaCodecAdapter.useBuffer(new eq0(this, formatHolder, (byte) 7));
                int i3 = this.readDataResultHolder.get();
                if (i3 == -3) {
                    if (hasReadStreamToEnd()) {
                        getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.codecReconfigurationState == 2) {
                            this.buffer.clear();
                            this.codecReconfigurationState = 1;
                        }
                        onInputFormatChanged(formatHolder);
                        return true;
                    }
                    if (!this.buffer.isEndOfStream()) {
                        if (this.codecReceivedBuffers || this.buffer.isKeyFrame()) {
                            DecoderInputBuffer decoderInputBuffer = this.buffer;
                            long j = decoderInputBuffer.timeUs;
                            if (!shouldDiscardDecoderInputBuffer(decoderInputBuffer)) {
                                boolean isEncrypted = this.buffer.isEncrypted();
                                if (isEncrypted) {
                                    this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(position);
                                }
                                if (this.waitingForFirstSampleInFormat) {
                                    OutputStreamInfo lastOutputStreamInfo2 = getLastOutputStreamInfo();
                                    TimedValueQueue timedValueQueue = lastOutputStreamInfo2.formatQueue;
                                    Format format2 = this.inputFormat;
                                    format2.getClass();
                                    timedValueQueue.add(j, format2);
                                    lastOutputStreamInfo2.queuedBufferAfterReset = true;
                                    this.waitingForFirstSampleInFormat = false;
                                }
                                if (this.hasSkippedFlushAndWaitingForQueueInputBuffer) {
                                    long j2 = this.largestQueuedPresentationTimeUs;
                                    long j3 = this.skippedFlushOffsetUs;
                                    this.largestStaleModifiedPresentationTimeUs = j2 + j3;
                                    if (j <= j2) {
                                        this.skippedFlushOffsetUs = (j2 - j) + 1 + j3;
                                    }
                                    this.largestQueuedPresentationTimeUs = j;
                                    this.largestQueuedPresentationTimeWithinDurationUs = j;
                                    this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
                                }
                                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j);
                                long streamEndPositionUs = getStreamEndPositionUs();
                                if (streamEndPositionUs == C.TIME_UNSET || j - getLastOutputStreamInfo().streamOffsetUs < streamEndPositionUs) {
                                    this.largestQueuedPresentationTimeWithinDurationUs = Math.max(this.largestQueuedPresentationTimeWithinDurationUs, j);
                                }
                                if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                                    getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
                                }
                                this.buffer.flip();
                                if (this.buffer.hasSupplementalData()) {
                                    handleInputBufferSupplementalData(this.buffer);
                                }
                                onQueueInputBuffer(this.buffer);
                                int codecBufferFlags = getCodecBufferFlags(this.buffer);
                                long j4 = j + this.skippedFlushOffsetUs;
                                int i4 = this.inputIndex;
                                DecoderInputBuffer decoderInputBuffer2 = this.buffer;
                                if (isEncrypted) {
                                    mediaCodecAdapter.queueSecureInputBuffer(i4, 0, decoderInputBuffer2.cryptoInfo, j4, codecBufferFlags);
                                } else {
                                    ByteBuffer byteBuffer4 = decoderInputBuffer2.data;
                                    byteBuffer4.getClass();
                                    mediaCodecAdapter.queueInputBuffer(i4, 0, byteBuffer4.limit(), j4, codecBufferFlags);
                                }
                                resetInputBuffer();
                                this.codecReceivedBuffers = true;
                                this.codecReconfigurationState = 0;
                                this.decoderCounters.queuedInputBufferCount++;
                                return true;
                            }
                        } else {
                            this.buffer.clear();
                            this.decoderCounters.skippedInputBufferCount++;
                            if (this.codecReconfigurationState == 2) {
                                this.codecReconfigurationState = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
                    if (this.codecReconfigurationState == 2) {
                        this.buffer.clear();
                        this.codecReconfigurationState = 1;
                    }
                    this.inputStreamEnded = true;
                    if (!this.codecReceivedBuffers) {
                        processEndOfStream();
                        return false;
                    }
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                        return false;
                    }
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e) {
                onCodecError(e);
                readSourceOmittingSampleData(0);
                flushCodec();
                return true;
            }
        }
        return false;
    }

    private void flushCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    private boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        if (shouldReleaseCodecInsteadOfFlushing()) {
            releaseCodec();
            return true;
        }
        if (shouldFlushCodec()) {
            flushCodec();
        } else if (this.codecReceivedBuffers) {
            this.hasSkippedFlushAndWaitingForQueueInputBuffer = true;
        }
        return false;
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) {
        Format format = this.inputFormat;
        format.getClass();
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z);
        if (!decoderInfos.isEmpty() || !z) {
            return decoderInfos;
        }
        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.mediaCodecSelector, format, false);
        if (!decoderInfos2.isEmpty()) {
            Log.w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos2 + ".");
        }
        return decoderInfos2;
    }

    private long getLargestValidQueuedPresentationTimeUs() {
        return getLastOutputStreamInfo().isDurationStrict() ? this.largestQueuedPresentationTimeWithinDurationUs : this.largestQueuedPresentationTimeUs;
    }

    private OutputStreamInfo getLastOutputStreamInfo() {
        return !this.pendingOutputStreamChanges.isEmpty() ? this.pendingOutputStreamChanges.getLast() : this.outputStreamInfo;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) {
        boolean z;
        this.codecInfo = mediaCodecInfo;
        Format format = this.inputFormat;
        format.getClass();
        String str = mediaCodecInfo.name;
        float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        if (codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
            codecOperatingRateV23 = CODEC_OPERATING_RATE_UNSET;
        }
        long elapsedRealtime = getClock().elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, codecOperatingRateV23);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodecAdapter createAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = createAdapter;
            this.codecRegisteredOnBufferAvailableListener = createAdapter.registerOnBufferAvailableListener(new MediaCodecRendererCodecAdapterListener());
            TraceUtil.endSection();
            long elapsedRealtime2 = getClock().elapsedRealtime();
            if (mediaCodecInfo.isFormatSupported(this.context, format)) {
                z = false;
            } else {
                z = false;
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(format), str));
            }
            this.codecOperatingRate = codecOperatingRateV23;
            this.codecInputFormat = format;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo);
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            mediaCodecAdapter.getClass();
            if (mediaCodecAdapter.needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0 ? true : z;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31 && !this.subscribedCodecParameterKeys.isEmpty()) {
                MediaCodecAdapter codec = getCodec();
                codec.getClass();
                codec.subscribeToVendorParameters(new ArrayList(this.subscribedCodecParameterKeys));
            }
            onCodecInitialized(str, mediaCodecConfiguration, elapsedRealtime2, j);
        } catch (Throwable th) {
            TraceUtil.endSection();
            throw th;
        }
    }

    @RequiresNonNull({"this.codecDrmSession"})
    private boolean initMediaCryptoIfDrmSessionReady() {
        sp0.z(this.mediaCrypto == null);
        DrmSession drmSession = this.codecDrmSession;
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (MediaLibraryInfo.enableWorkarounds() && FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException error = drmSession.getError();
                error.getClass();
                throw createRendererException(error, this.inputFormat, error.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        return true;
    }

    private boolean isDecodeOnly(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        Format format = this.outputFormat;
        return (format != null && Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && OpusUtil.needToDecodeOpusFrame(j, j2)) ? false : true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$feedInputBuffer$0(FormatHolder formatHolder) {
        this.readDataResultHolder.set(readSource(formatHolder, this.buffer, 0));
    }

    private void maybeInitCodecWithFallback(MediaCrypto mediaCrypto, boolean z) {
        Format format = this.inputFormat;
        format.getClass();
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(format, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format, (Throwable) null, z, -49999);
        }
        ArrayDeque<MediaCodecInfo> arrayDeque2 = this.availableCodecInfos;
        arrayDeque2.getClass();
        while (this.codec == null) {
            MediaCodecInfo peekFirst = arrayDeque2.peekFirst();
            peekFirst.getClass();
            if (!maybeInitializeProcessingPipeline(format) || !shouldInitCodec(peekFirst)) {
                return;
            }
            try {
                initCodec(peekFirst, mediaCrypto);
            } catch (Exception e2) {
                Log.w(TAG, "Failed to initialize decoder: " + peekFirst, e2);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(format, e2, z, peekFirst);
                onCodecError(decoderInitializationException);
                if (this.preferredDecoderInitializationException == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private void processEndOfStream() {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSession();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        mediaCodecAdapter.getClass();
        MediaFormat outputFormat = mediaCodecAdapter.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            checkAndNotifyCodecParameterChanges(outputFormat);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private boolean readSourceOmittingSampleData(int i) {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int readSource = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void resetBypassState() {
        resetCommonStateForFlush();
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.oggOpusAudioPacketizer.reset();
    }

    private void resetCommonStateForFlush() {
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeWithinDurationUs = C.TIME_UNSET;
        getLastOutputStreamInfo().lastBufferTimeUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setCodecDrmSession(DrmSession drmSession) {
        r7.P(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        if (outputStreamInfo.streamOffsetUs != C.TIME_UNSET) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(outputStreamInfo.streamOffsetUs);
        }
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        r7.P(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == C.TIME_UNSET || getClock().elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    public static boolean supportsFormatDrm(Format format) {
        int i = format.cryptoType;
        return i == 0 || i == 2;
    }

    private void updateCodecOperatingRate(Format format) {
        if (this.codec == null || this.codecDrainAction == 3 || getState() == 0) {
            return;
        }
        float f = this.targetPlaybackSpeed;
        format.getClass();
        float codecOperatingRateV23 = getCodecOperatingRateV23(f, format, getStreamFormats());
        float f2 = this.codecOperatingRate;
        if (f2 == codecOperatingRateV23 || codecOperatingRateV23 == CODEC_OPERATING_RATE_UNSET) {
            return;
        }
        if (f2 != CODEC_OPERATING_RATE_UNSET || codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
    }

    private void updateCodecSubscriptions(sy1 sy1Var) {
        if (this.subscribedCodecParameterKeys.equals(sy1Var)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = new HashSet(sy1Var);
            HashSet hashSet2 = new HashSet();
            ee5 it = this.subscribedCodecParameterKeys.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.remove(str)) {
                    hashSet2.add(str);
                }
            }
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                if (!hashSet2.isEmpty()) {
                    codec.unsubscribeFromVendorParameters(new ArrayList(hashSet2));
                }
                if (!hashSet.isEmpty()) {
                    codec.subscribeToVendorParameters(new ArrayList(hashSet));
                }
            }
        }
        this.subscribedCodecParameterKeys = sy1Var;
    }

    private void updateDrmSession() {
        DrmSession drmSession = this.sourceDrmSession;
        drmSession.getClass();
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public final void applyCodecParametersToMediaFormat(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.activeCodecParameters.applyTo(mediaFormat);
        }
    }

    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    public MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.experimentalEnableProcessedStreamChangedAtStart = true;
    }

    public final boolean flushOrReinitializeCodec() {
        boolean flushOrReleaseCodec = flushOrReleaseCodec();
        if (flushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return flushOrReleaseCodec;
    }

    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public final Format getCodecInputFormat() {
        return this.codecInputFormat;
    }

    public float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        return CODEC_OPERATING_RATE_UNSET;
    }

    public final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j, long j2) {
        return getDurationToProgressUs(j, j2, this.codecRegisteredOnBufferAvailableListener);
    }

    public long getLargestQueuedPresentationTimeUs() {
        return this.largestQueuedPresentationTimeUs;
    }

    public long getLastBufferInStreamPresentationTimeUs() {
        return this.outputStreamInfo.lastBufferTimeUs;
    }

    public final long getLastProcessedOutputBufferTimeUs() {
        return this.lastProcessedOutputBufferTimeUs;
    }

    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f);

    public final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    public final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    public float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    public long getSkippedFlushOffsetUs() {
        return this.skippedFlushOffsetUs;
    }

    public final Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 11) {
            Renderer.WakeupListener wakeupListener = (Renderer.WakeupListener) obj;
            wakeupListener.getClass();
            this.wakeupListener = wakeupListener;
            return;
        }
        if (i != 21) {
            if (i != 22) {
                super.handleMessage(i, obj);
                return;
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    obj.getClass();
                    updateCodecSubscriptions((sy1) obj);
                    return;
                }
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            this.activeCodecParameters = (CodecParameters) obj;
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setParameters(this.activeCodecParameters.toBundle());
            }
        }
    }

    public final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    public final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return isReadyForDecoding();
    }

    public final boolean isReadyForDecoding() {
        if (this.inputFormat == null) {
            return false;
        }
        if (isSourceReady() || hasOutputBuffer()) {
            return true;
        }
        return this.codecHotswapDeadlineMs != C.TIME_UNSET && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs;
    }

    public final void maybeInitCodecOrBypass() {
        Format format;
        boolean z;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                DrmSession drmSession = this.codecDrmSession;
                if (drmSession != null) {
                    if (drmSession.getState() != 3) {
                        if (this.codecDrmSession.getState() == 4) {
                        }
                    }
                    DrmSession drmSession2 = this.codecDrmSession;
                    String str = format.sampleMimeType;
                    str.getClass();
                    if (drmSession2.requiresSecureDecoder(str)) {
                        z = true;
                        maybeInitCodecWithFallback(this.mediaCrypto, z);
                    }
                }
                z = false;
                maybeInitCodecWithFallback(this.mediaCrypto, z);
            } catch (DecoderInitializationException e) {
                throw createRendererException(e, format, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
            }
        }
        MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    public boolean maybeInitializeProcessingPipeline(Format format) {
        return true;
    }

    public abstract void onCodecParametersChanged(CodecParameters codecParameters);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        if (this.bypassEnabled) {
            disableBypass();
        } else {
            flushOrReleaseCodec();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (drainAndUpdateCodecDrmSession() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (drainAndUpdateCodecDrmSession() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.onInputFormatChanged(androidx.media3.exoplayer.FormatHolder):androidx.media3.exoplayer.DecoderReuseEvaluation");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        if (!this.pendingOutputStreamChanges.isEmpty()) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.getLast();
        }
        this.pendingOutputStreamChanges.clear();
        if (z2) {
            this.inputStreamEnded = false;
            this.outputStreamEnded = false;
            this.pendingOutputEndOfStream = false;
            if (this.bypassEnabled) {
                resetBypassState();
            } else {
                flushOrReinitializeCodec();
            }
            if (this.outputStreamInfo.formatQueue.size() > 0) {
                this.waitingForFirstSampleInFormat = true;
            }
            this.outputStreamInfo.formatQueue.clear();
            this.outputStreamInfo.queuedBufferAfterReset = false;
        }
    }

    public void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = Math.max(j, this.lastProcessedOutputBufferTimeUs);
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            OutputStreamInfo poll = this.pendingOutputStreamChanges.poll();
            poll.getClass();
            setOutputStreamInfo(poll);
            onProcessedStreamChange();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStreamChanged(androidx.media3.common.Format[] r14, long r15, long r17, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r19) {
        /*
            r13 = this;
            long r7 = r13.getStreamEndPositionUs()
            androidx.media3.exoplayer.source.SampleStream r14 = r13.getStream()
            r14.getClass()
            int r9 = r14.getFlags()
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r14 = r13.outputStreamInfo
            long r0 = androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.access$200(r14)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto L37
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r13.setOutputStreamInfo(r0)
            boolean r14 = r13.experimentalEnableProcessedStreamChangedAtStart
            if (r14 == 0) goto L6d
            r13.onProcessedStreamChange()
            return
        L37:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r14 = r13.pendingOutputStreamChanges
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L6e
            long r0 = r13.largestQueuedPresentationTimeUs
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L4f
            long r2 = r13.lastProcessedOutputBufferTimeUs
            int r14 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r14 == 0) goto L6e
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L6e
        L4f:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r13.setOutputStreamInfo(r0)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r14 = r13.outputStreamInfo
            long r0 = androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.access$200(r14)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L6d
            r13.onProcessedStreamChange()
        L6d:
            return
        L6e:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r14 = r13.pendingOutputStreamChanges
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r1 = r13.largestQueuedPresentationTimeUs
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r14.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.onStreamChanged(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onTimelineChanged(Timeline timeline) {
        getLastOutputStreamInfo().durationUs = getStreamEndPositionUs();
    }

    public abstract boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format);

    /* JADX WARN: Multi-variable type inference failed */
    public void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                MediaCodecInfo mediaCodecInfo = this.codecInfo;
                mediaCodecInfo.getClass();
                onCodecReleased(mediaCodecInfo.name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long elapsedRealtime = getClock().elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(elapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(elapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e) {
            throw createRendererException(e, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            if (!isMediaCodecException(e2)) {
                throw e2;
            }
            onCodecError(e2);
            if ((e2 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                releaseCodec();
            }
            MediaCodecDecoderException createDecoderException = createDecoderException(e2, getCodecInfo());
            throw createRendererException(createDecoderException, this.inputFormat, z, createDecoderException.errorCode == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    public void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        resetCommonStateForFlush();
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isOutputBufferStale = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
        this.largestStaleModifiedPresentationTimeUs = C.TIME_UNSET;
    }

    public void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = CODEC_OPERATING_RATE_UNSET;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    public final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    public boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!shouldSkipDecoderInputBuffer(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.clear();
        this.decoderCounters.skippedInputBufferCount++;
        return true;
    }

    public boolean shouldFlushCodec() {
        return this.codecReceivedBuffers;
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean shouldReinitCodec() {
        return false;
    }

    public boolean shouldReleaseCodecInsteadOfFlushing() {
        int i = this.codecDrainAction;
        if (i == 3 || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && (this.codecReceivedEos || this.codecDrainState == 1)))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            updateDrmSession();
            return false;
        } catch (ExoPlaybackException e) {
            Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean shouldSkipDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw this.createRendererException(e, format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final void updateOutputFormatForTime(long j) {
        Format format = (Format) this.outputStreamInfo.formatQueue.pollFloor(j);
        if (format == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            format = (Format) this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (format != null) {
            this.outputFormat = format;
        } else if (!this.codecOutputMediaFormatChanged || (format = this.outputFormat) == null) {
            return;
        }
        format.getClass();
        onOutputFormatChanged(format, this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    public long getDurationToProgressUs(long j, long j2, boolean z) {
        return hf1.c(this);
    }

    public void onProcessedStreamChange() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
    }

    public void renderToEndOfStream() {
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
    }

    public void onCodecError(Exception exc) {
    }

    public void onCodecReleased(String str) {
    }

    public void onOutputStreamOffsetUsChanged(long j) {
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final MediaCodecInfo codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
    }

    public final void updateCodecOperatingRate() {
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
    }
}
