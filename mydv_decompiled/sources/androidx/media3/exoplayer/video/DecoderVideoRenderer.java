package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import defpackage.ja;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer implements Decoder.Callback {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;
    private Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder;
    protected DecoderCounters decoderCounters;
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private int firstFrameState;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final TimedValueQueue<Format> formatQueue;
    private VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long largestQueuedPresentationTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private Object output;
    private VideoDecoderOutputBuffer outputBuffer;
    private VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private Surface outputSurface;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private Executor playbackThreadExecutor;
    private VideoSize reportedVideoSize;
    private DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class OutputStreamInfo {
        private long durationUs;
        private final long previousStreamLastBufferTimeUs;
        private int streamFlags;
        private final long streamOffsetUs;

        private OutputStreamInfo(long j, long j2, long j3, int i) {
            this.previousStreamLastBufferTimeUs = j;
            this.streamOffsetUs = j2;
            this.durationUs = j3;
            this.streamFlags = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isDurationStrict() {
            return (this.streamFlags & 1) != 0;
        }
    }

    public DecoderVideoRenderer(long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(2);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.formatQueue = new TimedValueQueue<>();
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.outputMode = -1;
        this.firstFrameState = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private boolean drainOutputBuffer(long j, long j2) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBuffer == null) {
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
            decoder.getClass();
            videoDecoderOutputBuffer = decoder.dequeueOutputBuffer();
            this.outputBuffer = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            DecoderCounters decoderCounters = this.decoderCounters;
            int i = decoderCounters.skippedOutputBufferCount;
            int i2 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            decoderCounters.skippedOutputBufferCount = i + i2;
            this.buffersInCodecCount -= i2;
        }
        if (videoDecoderOutputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                this.outputStreamEnded = true;
            }
            return false;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.outputBuffer;
        videoDecoderOutputBuffer2.getClass();
        long j3 = videoDecoderOutputBuffer2.timeUs;
        boolean processOutputBuffer = processOutputBuffer(j, j2);
        if (processOutputBuffer) {
            onProcessedOutputBuffer(j3);
            this.outputBuffer = null;
        }
        return processOutputBuffer;
    }

    private boolean feedInputBuffer() {
        OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
        lastOutputStreamInfo.getClass();
        SampleStream stream = getStream();
        stream.getClass();
        lastOutputStreamInfo.streamFlags = stream.getFlags();
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        DecoderInputBuffer decoderInputBuffer = this.inputBuffer;
        if (decoderInputBuffer == null) {
            decoderInputBuffer = decoder.dequeueInputBuffer();
            this.inputBuffer = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        decoderInputBuffer.getClass();
        if (this.decoderReinitializationState == 1) {
            decoderInputBuffer.setFlags(4);
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder2 = this.decoder;
            decoder2.getClass();
            decoder2.queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, decoderInputBuffer, 0);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4) {
            if (readSource == -3) {
                return false;
            }
            s83.r();
            return false;
        }
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder3 = this.decoder;
            decoder3.getClass();
            decoder3.queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (this.waitingForFirstSampleInFormat) {
            TimedValueQueue<Format> timedValueQueue = this.formatQueue;
            long j = decoderInputBuffer.timeUs;
            Format format = this.inputFormat;
            format.getClass();
            timedValueQueue.add(j, format);
            this.waitingForFirstSampleInFormat = false;
        }
        decoderInputBuffer.flip();
        decoderInputBuffer.format = this.inputFormat;
        onQueueInputBuffer(decoderInputBuffer);
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder4 = this.decoder;
        decoder4.getClass();
        decoder4.queueInputBuffer(decoderInputBuffer);
        this.buffersInCodecCount++;
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, decoderInputBuffer.timeUs);
        this.inputBuffer = null;
        return true;
    }

    private OutputStreamInfo getLastOutputStreamInfo() {
        return !this.pendingOutputStreamChanges.isEmpty() ? this.pendingOutputStreamChanges.getLast() : this.outputStreamInfo;
    }

    private boolean hasOutput() {
        return this.outputMode != -1;
    }

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private void maybeInitDecoder() {
        CryptoConfig cryptoConfig;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        DrmSession drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.getCryptoConfig();
            if (cryptoConfig == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.playbackThreadExecutor == null) {
                Looper myLooper = Looper.myLooper();
                myLooper.getClass();
                this.playbackThreadExecutor = new ja(new Handler(myLooper), (byte) 2);
            }
            Format format = this.inputFormat;
            format.getClass();
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder = createDecoder(format, cryptoConfig);
            this.decoder = createDecoder;
            createDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            this.decoder.setCallback(this, this.playbackThreadExecutor);
            setDecoderOutputMode(this.outputMode);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
            decoder.getClass();
            eventDispatcher.decoderInitialized(decoder.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e) {
            Log.e(TAG, "Video codec error", e);
            this.eventDispatcher.videoCodecError(e);
            throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        } catch (OutOfMemoryError e2) {
            throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.firstFrameState != 3) {
            this.firstFrameState = 3;
            Object obj = this.output;
            if (obj != null) {
                this.eventDispatcher.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeNotifyVideoSizeChanged(int i, int i2) {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == i && videoSize.height == i2) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(i, i2);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Object obj;
        if (this.firstFrameState != 3 || (obj = this.output) == null) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(obj);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.reportedVideoSize = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j, long j2) {
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        videoDecoderOutputBuffer.getClass();
        long j3 = videoDecoderOutputBuffer.timeUs;
        long j4 = j3 - j;
        if (!hasOutput()) {
            if (!isBufferLate(j4)) {
                return false;
            }
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        this.outputStreamInfo.getClass();
        long j5 = j3 - this.outputStreamInfo.streamOffsetUs;
        if (this.outputStreamInfo.isDurationStrict() && this.outputStreamInfo.durationUs != C.TIME_UNSET && j5 >= this.outputStreamInfo.durationUs) {
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        Format pollFloor = this.formatQueue.pollFloor(j3);
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
        } else if (this.outputFormat == null) {
            this.outputFormat = this.formatQueue.pollFirst();
        }
        if (shouldForceRender(j4)) {
            Format format = this.outputFormat;
            format.getClass();
            renderOutputBuffer(videoDecoderOutputBuffer, j5, format);
            return true;
        }
        if (getState() != 2 || j == this.initialPositionUs || (shouldDropBuffersToKeyframe(j4, j2) && maybeDropBuffersToKeyframe(j))) {
            return false;
        }
        if (shouldDropOutputBuffer(j4, j2)) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        if (j4 < 30000) {
            Format format2 = this.outputFormat;
            format2.getClass();
            renderOutputBuffer(videoDecoderOutputBuffer, j5, format2);
            return true;
        }
        return false;
    }

    private void setDecoderDrmSession(DrmSession drmSession) {
        r7.P(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        r7.P(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldForceRender(long j) {
        boolean z = getState() == 2;
        int i = this.firstFrameState;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return z && shouldForceRenderOutputBuffer(j, Util.msToUs(SystemClock.elapsedRealtime()) - this.lastRenderTimeUs);
        }
        s83.r();
        return false;
    }

    public DecoderReuseEvaluation canReuseDecoder(String str, Format format, Format format2) {
        return new DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    public abstract Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder(Format format, CryptoConfig cryptoConfig);

    public void dropOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        updateDroppedBufferCounters(0, 1);
        videoDecoderOutputBuffer.release();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public void flushDecoder() {
        this.buffersInCodecCount = 0;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        decoder.getClass();
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else if (i == 11) {
            this.wakeupListener = (Renderer.WakeupListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat != null && ((isSourceReady() || this.outputBuffer != null) && (this.firstFrameState == 3 || !hasOutput()))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(long j) {
        int skipSource = skipSource(j);
        if (skipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(skipSource, this.buffersInCodecCount);
        flushDecoder();
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = null;
        this.pendingOutputStreamChanges.clear();
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.reportedVideoSize = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        this.firstFrameState = z2 ? 1 : 0;
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onInputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    public void onInputFormatChanged(FormatHolder formatHolder) {
        DecoderReuseEvaluation canReuseDecoder;
        this.waitingForFirstSampleInFormat = true;
        Format format = formatHolder.format;
        format.getClass();
        setSourceDrmSession(formatHolder.drmSession);
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder == null) {
            maybeInitDecoder();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            Format format3 = this.inputFormat;
            format3.getClass();
            eventDispatcher.inputFormatChanged(format3, null);
            return;
        }
        if (this.sourceDrmSession != this.decoderDrmSession) {
            String name = decoder.getName();
            format2.getClass();
            canReuseDecoder = new DecoderReuseEvaluation(name, format2, format, 0, 128);
        } else {
            String name2 = decoder.getName();
            format2.getClass();
            canReuseDecoder = canReuseDecoder(name2, format2, format);
        }
        if (canReuseDecoder.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.eventDispatcher;
        Format format4 = this.inputFormat;
        format4.getClass();
        eventDispatcher2.inputFormatChanged(format4, canReuseDecoder);
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onOutputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (!this.pendingOutputStreamChanges.isEmpty()) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.getLast();
        }
        this.pendingOutputStreamChanges.clear();
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (this.decoder != null) {
            flushDecoder();
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
        if (this.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.formatQueue.clear();
    }

    public void onProcessedOutputBuffer(long j) {
        this.buffersInCodecCount--;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            OutputStreamInfo poll = this.pendingOutputStreamChanges.poll();
            poll.getClass();
            this.outputStreamInfo = poll;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        SampleStream stream = getStream();
        stream.getClass();
        int flags = stream.getFlags();
        if (this.outputStreamInfo != null && (!this.pendingOutputStreamChanges.isEmpty() || this.buffersInCodecCount != 0)) {
            this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j2, getStreamEndPositionUs(), flags));
        } else {
            this.outputStreamInfo = new OutputStreamInfo(C.TIME_UNSET, j2, getStreamEndPositionUs(), flags);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onTimelineChanged(Timeline timeline) {
        OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
        if (lastOutputStreamInfo != null) {
            lastOutputStreamInfo.durationUs = getStreamEndPositionUs();
        }
    }

    public void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.buffersInCodecCount = 0;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            decoder.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    sp0.z(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer(j, j2)) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e) {
                Log.e(TAG, "Video codec error", e);
                this.eventDispatcher.videoCodecError(e);
                throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    public void renderOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, getClock().nanoTime(), format, null);
        }
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
        int i = videoDecoderOutputBuffer.mode;
        boolean z = i == 1 && this.outputSurface != null;
        boolean z2 = i == 0 && this.outputBufferRenderer != null;
        if (!z2 && !z) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return;
        }
        maybeNotifyVideoSizeChanged(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z2) {
            VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer = this.outputBufferRenderer;
            videoDecoderOutputBufferRenderer.getClass();
            videoDecoderOutputBufferRenderer.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            Surface surface = this.outputSurface;
            surface.getClass();
            renderOutputBufferToSurface(videoDecoderOutputBuffer, surface);
        }
        this.consecutiveDroppedFrameCount = 0;
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
    }

    public abstract void renderOutputBufferToSurface(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void setDecoderOutputMode(int i);

    public final void setOutput(Object obj) {
        int i;
        if (obj instanceof Surface) {
            this.outputSurface = (Surface) obj;
            this.outputBufferRenderer = null;
            i = 1;
            this.outputMode = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.outputSurface = null;
            this.outputBufferRenderer = (VideoDecoderOutputBufferRenderer) obj;
            i = 0;
            this.outputMode = 0;
        } else {
            this.outputSurface = null;
            this.outputBufferRenderer = null;
            i = -1;
            this.outputMode = -1;
            obj = null;
        }
        if (this.output == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.output = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.decoder != null) {
            setDecoderOutputMode(i);
        }
        onOutputChanged();
    }

    public boolean shouldDropBuffersToKeyframe(long j, long j2) {
        return isBufferVeryLate(j);
    }

    public boolean shouldDropOutputBuffer(long j, long j2) {
        return isBufferLate(j);
    }

    public boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    public void skipOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.decoderCounters.skippedOutputBufferCount++;
        videoDecoderOutputBuffer.release();
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

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }
}
