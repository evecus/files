package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import defpackage.dy1;
import defpackage.sp0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioProcessingPipeline {
    private final dy1 audioProcessors;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    public AudioProcessingPipeline(dy1 dy1Var) {
        this.audioProcessors = dy1Var;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= getFinalOutputBufferIndex()) {
                if (!this.outputBuffers[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.outputBuffers[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        long remaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i] = audioProcessor.getOutput();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i].hasRemaining();
                    } else if (!this.outputBuffers[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                        this.activeAudioProcessors.get(i + 1).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i);
            AudioProcessor.AudioFormat configure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                sp0.z(!configure.equals(AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = configure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            if (this.audioProcessors.get(i) != audioProcessingPipeline.audioProcessors.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void flush(AudioProcessor.StreamMetadata streamMetadata) {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i);
            audioProcessor.flush(streamMetadata);
            if (audioProcessor.isActive()) {
                streamMetadata = streamMetadata.buildUpon().setPositionOffsetUs(audioProcessor.getDurationAfterProcessorApplied(streamMetadata.positionOffsetUs)).build();
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.outputBuffers[i2] = this.activeAudioProcessors.get(i2).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(AudioProcessor.EMPTY_BUFFER);
        return this.outputBuffers[getFinalOutputBufferIndex()];
    }

    public AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        this.inputEnded = true;
        this.activeAudioProcessors.get(0).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        processData(byteBuffer);
    }

    public void reset() {
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i);
            audioProcessor.flush(AudioProcessor.StreamMetadata.DEFAULT);
            audioProcessor.reset();
        }
        this.activeAudioProcessors.clear();
        this.outputBuffers = new ByteBuffer[0];
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    @Deprecated
    public void flush() {
        flush(AudioProcessor.StreamMetadata.DEFAULT);
    }
}
