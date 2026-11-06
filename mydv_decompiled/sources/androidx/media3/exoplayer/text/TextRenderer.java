package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.li4;
import defpackage.s83;
import defpackage.sp0;
import defpackage.x24;
import defpackage.zy;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final long MAX_READ_AHEAD_DURATION_US = 1000000;
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final CueDecoder cueDecoder;
    private final DecoderInputBuffer cueDecoderInputBuffer;
    private CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private SubtitleInputBuffer nextSubtitleInputBuffer;
    private final TextOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private Format streamFormat;
    private SubtitleOutputBuffer subtitle;
    private SubtitleDecoder subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        textOutput.getClass();
        this.output = textOutput;
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new CueDecoder();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        this.lastRendererPositionUs = C.TIME_UNSET;
        this.legacyDecodingEnabled = false;
    }

    @RequiresNonNull({"streamFormat"})
    private void assertLegacyDecodingEnabledIfRequired() {
        boolean z = this.legacyDecodingEnabled || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA708);
        String str = this.streamFormat.sampleMimeType;
        if (z) {
            return;
        }
        zy.i(li4.h("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, MimeTypes.APPLICATION_MEDIA3_CUES));
    }

    private void clearOutput() {
        ay1 ay1Var = dy1.J;
        updateOutput(new CueGroup(x24.M, getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        return nextEventTimeIndex == -1 ? subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1) : subtitleOutputBuffer.getEventTime(nextEventTimeIndex - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        this.subtitle.getClass();
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j) {
        sp0.z(j != C.TIME_UNSET);
        return j - getStreamOffsetUs();
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        Log.e(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private static boolean hasEventsAfter(Subtitle subtitle, long j) {
        return subtitle != null && subtitle.getEventTimeCount() > 0 && subtitle.getEventTime(subtitle.getEventTimeCount() - 1) > j;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        SubtitleDecoderFactory subtitleDecoderFactory = this.subtitleDecoderFactory;
        Format format = this.streamFormat;
        format.getClass();
        SubtitleDecoder createDecoder = subtitleDecoderFactory.createDecoder(format);
        this.subtitleDecoder = createDecoder;
        createDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    @SideEffectFree
    private static boolean isCuesWithTiming(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_MEDIA3_CUES);
    }

    @RequiresNonNull({"this.cuesResolver"})
    private boolean readAndDecodeCuesWithTiming(long j) {
        if (this.inputStreamEnded) {
            return false;
        }
        int readSource = readSource(this.formatHolder, this.cueDecoderInputBuffer, 5);
        if (readSource == -3 && !this.cueDecoderInputBuffer.isEndOfStream()) {
            return false;
        }
        if (readSource != -4 || this.cueDecoderInputBuffer.isEndOfStream()) {
            if (readSource == -4 || readSource == -3) {
                long streamEndPositionUs = getStreamEndPositionUs();
                long streamOffsetUs = j - getStreamOffsetUs();
                if (streamEndPositionUs == C.TIME_UNSET || streamOffsetUs < streamEndPositionUs - 1000000) {
                    return false;
                }
            }
        } else if (j < this.cueDecoderInputBuffer.timeUs - 1000000) {
            return false;
        }
        if (readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.flip();
        ByteBuffer byteBuffer = this.cueDecoderInputBuffer.data;
        byteBuffer.getClass();
        CuesWithTiming decode = this.cueDecoder.decode(this.cueDecoderInputBuffer.timeUs, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.cueDecoderInputBuffer.clear();
        return this.cuesResolver.addCues(decode, j);
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
        subtitleDecoder.getClass();
        subtitleDecoder.release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    @RequiresNonNull({"this.cuesResolver"})
    private void renderFromCuesWithTiming(long j) {
        boolean readAndDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !readAndDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j) {
            readAndDecodeCuesWithTiming = true;
        }
        if (readAndDecodeCuesWithTiming) {
            dy1 cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j);
            updateOutput(new CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j;
    }

    private void renderFromSubtitles(long j) {
        boolean z;
        boolean z2;
        this.lastRendererPositionUs = j;
        if (this.nextSubtitle == null) {
            SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
            subtitleDecoder.getClass();
            subtitleDecoder.setPositionUs(j);
            try {
                SubtitleDecoder subtitleDecoder2 = this.subtitleDecoder;
                subtitleDecoder2.getClass();
                this.nextSubtitle = subtitleDecoder2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.nextSubtitle;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.subtitle;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j);
                this.subtitle = subtitleOutputBuffer;
                this.nextSubtitle = null;
                z = true;
            }
        }
        if (z) {
            this.subtitle.getClass();
            updateOutput(new CueGroup(this.subtitle.getCues(j), getPresentationTimeUs(getCurrentEventTimeUs(j))));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                SubtitleInputBuffer subtitleInputBuffer = this.nextSubtitleInputBuffer;
                if (subtitleInputBuffer == null) {
                    SubtitleDecoder subtitleDecoder3 = this.subtitleDecoder;
                    subtitleDecoder3.getClass();
                    subtitleInputBuffer = subtitleDecoder3.dequeueInputBuffer();
                    if (subtitleInputBuffer == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = subtitleInputBuffer;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    subtitleInputBuffer.setFlags(4);
                    SubtitleDecoder subtitleDecoder4 = this.subtitleDecoder;
                    subtitleDecoder4.getClass();
                    subtitleDecoder4.queueInputBuffer(subtitleInputBuffer);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int readSource = readSource(this.formatHolder, subtitleInputBuffer, 5);
                if (readSource == -3 && !subtitleInputBuffer.isEndOfStream()) {
                    return;
                }
                if (readSource != -4 || subtitleInputBuffer.isEndOfStream()) {
                    if (readSource == -4 || readSource == -3) {
                        long streamEndPositionUs = getStreamEndPositionUs();
                        long streamOffsetUs = j - getStreamOffsetUs();
                        if (streamEndPositionUs == C.TIME_UNSET) {
                            return;
                        }
                        if (streamOffsetUs < streamEndPositionUs - 1000000) {
                            return;
                        }
                    }
                } else if (j < subtitleInputBuffer.timeUs - 1000000) {
                    return;
                }
                int readSource2 = readSource(this.formatHolder, subtitleInputBuffer, 0);
                if (readSource2 == -4) {
                    if (subtitleInputBuffer.isEndOfStream()) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                        z2 = false;
                    } else {
                        Format format = this.formatHolder.format;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                        subtitleInputBuffer.flip();
                        z2 = this.waitingForKeyFrame & (!subtitleInputBuffer.isKeyFrame());
                        this.waitingForKeyFrame = z2;
                    }
                    if (!z2) {
                        SubtitleDecoder subtitleDecoder5 = this.subtitleDecoder;
                        subtitleDecoder5.getClass();
                        subtitleDecoder5.queueInputBuffer(subtitleInputBuffer);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (readSource2 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                handleDecoderError(e2);
                return;
            }
        }
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z) {
        this.legacyDecodingEnabled = z;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            invokeUpdateOutputInternal((CueGroup) message.obj);
            return true;
        }
        s83.r();
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        Format format = this.streamFormat;
        if (format == null) {
            return true;
        }
        format.getClass();
        if (!isCuesWithTiming(format)) {
            return !this.outputStreamEnded && (!this.inputStreamEnded || hasEventsAfter(this.subtitle, this.lastRendererPositionUs) || hasEventsAfter(this.nextSubtitle, this.lastRendererPositionUs) || this.nextSubtitleInputBuffer == null);
        }
        CuesResolver cuesResolver = this.cuesResolver;
        cuesResolver.getClass();
        if (cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs) != Long.MIN_VALUE) {
            return true;
        }
        try {
            maybeThrowStreamError();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        clearOutput();
        this.lastRendererPositionUs = C.TIME_UNSET;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        this.lastRendererPositionUs = j;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = C.TIME_UNSET;
        Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
        subtitleDecoder.getClass();
        subtitleDecoder.flush();
        subtitleDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Format format = formatArr[0];
        this.streamFormat = format;
        if (isCuesWithTiming(format)) {
            this.cuesResolver = this.streamFormat.cueReplacementBehavior == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != C.TIME_UNSET && j >= j3) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        Format format = this.streamFormat;
        format.getClass();
        if (isCuesWithTiming(format)) {
            this.cuesResolver.getClass();
            renderFromCuesWithTiming(j);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j);
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        sp0.z(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (isCuesWithTiming(format) || this.subtitleDecoderFactory.supportsFormat(format)) {
            return hf1.k(format.cryptoType == 0 ? 4 : 2, 0, 0, 0);
        }
        return MimeTypes.isText(format.sampleMimeType) ? hf1.k(1, 0, 0, 0) : hf1.k(0, 0, 0, 0);
    }

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }
}
