package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {
    private ByteBuffer buffer;
    protected AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    protected AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = onConfigure(audioFormat);
        return isActive() ? this.pendingOutputAudioFormat : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(AudioProcessor.StreamMetadata streamMetadata) {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush(streamMetadata);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    public final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat != AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER;
    }

    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        return AudioProcessor.AudioFormat.NOT_SET;
    }

    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        onFlush();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    public final ByteBuffer replaceOutputBuffer(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.outputBuffer = byteBuffer;
        this.inputEnded = false;
        this.buffer = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        onReset();
    }

    @Deprecated
    public void onFlush() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @Deprecated
    public final void flush() {
        flush(AudioProcessor.StreamMetadata.DEFAULT);
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }
}
