package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.Util;
import defpackage.sp0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SpeedChangingAudioProcessor implements AudioProcessor {
    private final boolean areInputTimestampsAdjusted;
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;
    private long framesRead;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    private final Object lock;
    private final LongArrayQueue pendingCallbackInputTimesUs;
    private final Queue<TimestampConsumer> pendingCallbacks;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final boolean shouldMaintainPitch;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;
    private final SpeedProvider speedProvider;
    private final SpeedProviderUtil.SpeedProviderMapper speedProviderMapper;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider, boolean z, boolean z2) {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.speedProvider = speedProvider;
        this.speedProviderMapper = new SpeedProviderUtil.SpeedProviderMapper(speedProvider);
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj, true);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.currentSpeed = 1.0f;
        this.areInputTimestampsAdjusted = z;
        this.shouldMaintainPitch = z2;
    }

    private static long getDurationUsAfterProcessorApplied(SpeedProvider speedProvider, int i, long j) {
        return Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(speedProvider, i, Util.scaleLargeValue(j, i, 1000000L, RoundingMode.HALF_EVEN)), i);
    }

    public static long getInputFrameCountForOutput(SpeedProvider speedProvider, int i, long j) {
        int i2 = i;
        sp0.o(i2 > 0);
        sp0.o(j >= 0);
        long j2 = j;
        long j3 = 0;
        while (j2 > 0) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j3, i);
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j3, i);
            long expectedFrameCountAfterProcessorApplied = Sonic.getExpectedFrameCountAfterProcessorApplied(i2, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j3);
            if (nextSpeedChangeSamplePosition == -1 || expectedFrameCountAfterProcessorApplied > j2) {
                j3 += Sonic.getExpectedInputFrameCountForOutputFrameCount(i, i, sampleAlignedSpeed, sampleAlignedSpeed, j2);
                j2 = 0;
            } else {
                j2 -= expectedFrameCountAfterProcessorApplied;
                j3 = nextSpeedChangeSamplePosition;
            }
            i2 = i;
        }
        return j3;
    }

    public static long getSampleCountAfterProcessorApplied(SpeedProvider speedProvider, int i, long j) {
        sp0.o(speedProvider != null);
        sp0.o(i > 0);
        long j2 = 0;
        sp0.o(j >= 0);
        long j3 = 0;
        while (j2 < j) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j2, i);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j) {
                nextSpeedChangeSamplePosition = j;
            }
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j2, i);
            j3 += Sonic.getExpectedFrameCountAfterProcessorApplied(i, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j2);
            j2 = nextSpeedChangeSamplePosition;
        }
        return j3;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            try {
                if (this.inputAudioFormat.sampleRate == -1) {
                    return;
                }
                while (!this.pendingCallbacks.isEmpty()) {
                    this.pendingCallbacks.remove().onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, this.inputAudioFormat.sampleRate, this.pendingCallbackInputTimesUs.remove()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetInternalState(boolean z) {
        if (z) {
            this.currentSpeed = 1.0f;
        }
        this.framesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateSpeed(float f) {
        if (f != this.currentSpeed) {
            this.currentSpeed = f;
            this.sonicAudioProcessor.setSpeed(f);
            if (!this.shouldMaintainPitch) {
                this.sonicAudioProcessor.setPitch(f);
            }
            this.sonicAudioProcessor.flush(AudioProcessor.StreamMetadata.DEFAULT);
            this.endOfStreamQueuedToSonic = false;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat configure = this.sonicAudioProcessor.configure(audioFormat);
        this.pendingOutputAudioFormat = configure;
        return configure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush(AudioProcessor.StreamMetadata streamMetadata) {
        this.inputEnded = false;
        resetInternalState(false);
        synchronized (this.lock) {
            try {
                this.inputAudioFormat = this.pendingInputAudioFormat;
                this.sonicAudioProcessor.flush(streamMetadata);
                processPendingCallbacks();
                long j = streamMetadata.positionOffsetUs;
                if (this.areInputTimestampsAdjusted) {
                    j = this.speedProviderMapper.getOriginalTimeUs(j);
                }
                this.framesRead = Util.durationUsToSampleCount(j, this.inputAudioFormat.sampleRate);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return this.areInputTimestampsAdjusted ? j : SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j);
    }

    public long getMediaDurationUs(long j) {
        int i;
        synchronized (this.lock) {
            i = this.inputAudioFormat.sampleRate;
        }
        if (i == -1) {
            return j;
        }
        return Util.sampleCountToDurationUs(getInputFrameCountForOutput(this.speedProvider, i, Util.scaleLargeValue(j, i, 1000000L, RoundingMode.HALF_EVEN)), i);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        return this.sonicAudioProcessor.getOutput();
    }

    public void getSpeedAdjustedTimeAsync(long j, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                int i = this.inputAudioFormat.sampleRate;
                if (i != -1) {
                    timestampConsumer.onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, i, j));
                } else {
                    this.pendingCallbackInputTimesUs.add(j);
                    this.pendingCallbacks.add(timestampConsumer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SpeedProvider getSpeedProvider() {
        return this.speedProvider;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return !this.pendingOutputAudioFormat.equals(AudioProcessor.AudioFormat.NOT_SET);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        this.inputEnded = true;
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        AudioProcessor.AudioFormat audioFormat;
        int i;
        synchronized (this.lock) {
            audioFormat = this.inputAudioFormat;
        }
        float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        updateSpeed(sampleAlignedSpeed);
        int limit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i = (int) ((nextSpeedChangeSamplePosition - this.framesRead) * audioFormat.bytesPerFrame);
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        this.sonicAudioProcessor.queueInput(byteBuffer);
        if (i != -1 && byteBuffer.position() - position == i) {
            this.sonicAudioProcessor.queueEndOfStream();
            this.endOfStreamQueuedToSonic = true;
        }
        long position2 = byteBuffer.position() - position;
        sp0.A(position2 % ((long) audioFormat.bytesPerFrame) == 0, "A frame was not queued completely.");
        this.framesRead = (position2 / audioFormat.bytesPerFrame) + this.framesRead;
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        flush(AudioProcessor.StreamMetadata.DEFAULT);
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        synchronized (this.lock) {
            this.inputAudioFormat = audioFormat;
            this.pendingCallbackInputTimesUs.clear();
            this.pendingCallbacks.clear();
        }
        resetInternalState(true);
        this.sonicAudioProcessor.reset();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this(speedProvider, false, false);
    }
}
