package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TrimmingAudioProcessor extends BaseAudioProcessor {
    private byte[] endBuffer = Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return Math.max(0L, j - Util.sampleCountToDurationUs(this.trimEndFrames + this.trimStartFrames, this.inputAudioFormat.sampleRate));
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.endBufferSize) > 0) {
            replaceOutputBuffer(i).put(this.endBuffer, 0, this.endBufferSize).flip();
            this.endBufferSize = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.endBufferSize == 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        if (!Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            int i = this.trimEndFrames;
            int i2 = this.inputAudioFormat.bytesPerFrame;
            this.endBuffer = new byte[i * i2];
            this.pendingTrimStartBytes = this.trimStartFrames * i2;
        }
        this.endBufferSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            if (this.endBufferSize > 0) {
                this.trimmedFrameCount += r0 / this.inputAudioFormat.bytesPerFrame;
            }
            this.endBufferSize = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.endBuffer = Util.EMPTY_BYTE_ARRAY;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.pendingTrimStartBytes);
        this.trimmedFrameCount += min / this.inputAudioFormat.bytesPerFrame;
        this.pendingTrimStartBytes -= min;
        byteBuffer.position(position + min);
        if (this.pendingTrimStartBytes > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.endBufferSize + i2) - this.endBuffer.length;
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(length);
        int constrainValue = Util.constrainValue(length, 0, this.endBufferSize);
        replaceOutputBuffer.put(this.endBuffer, 0, constrainValue);
        int constrainValue2 = Util.constrainValue(length - constrainValue, 0, i2);
        byteBuffer.limit(byteBuffer.position() + constrainValue2);
        replaceOutputBuffer.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - constrainValue2;
        int i4 = this.endBufferSize - constrainValue;
        this.endBufferSize = i4;
        byte[] bArr = this.endBuffer;
        System.arraycopy(bArr, constrainValue, bArr, 0, i4);
        byteBuffer.get(this.endBuffer, this.endBufferSize, i3);
        this.endBufferSize += i3;
        replaceOutputBuffer.flip();
    }

    public void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0L;
    }

    public void setTrimFrameCount(int i, int i2) {
        this.trimStartFrames = i;
        this.trimEndFrames = i2;
    }
}
