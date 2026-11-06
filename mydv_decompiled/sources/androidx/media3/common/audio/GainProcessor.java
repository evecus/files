package androidx.media3.common.audio;

import androidx.media3.common.C;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import defpackage.sp0;
import defpackage.zl1;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class GainProcessor extends BaseAudioProcessor {
    private final GainProvider gainProvider;
    private long readFrames;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface GainProvider {
        float getGainFactorAtSamplePosition(long j, int i);

        long isUnityUntil(long j, int i);
    }

    public GainProcessor(GainProvider gainProvider) {
        gainProvider.getClass();
        this.gainProvider = gainProvider;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return (!super.isActive() || Objects.equals(this.inputAudioFormat, AudioProcessor.AudioFormat.NOT_SET) || this.gainProvider.isUnityUntil(0L, this.inputAudioFormat.sampleRate) == Long.MIN_VALUE) ? false : true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.encoding;
        if (i == 2 || i == 4) {
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException("Invalid PCM encoding. Expected 16 bit PCM or float PCM.", audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        this.readFrames = Util.durationUsToSampleCount(streamMetadata.positionOffsetUs, this.inputAudioFormat.sampleRate);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.readFrames = 0L;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        sp0.A(!Objects.equals(this.inputAudioFormat, AudioProcessor.AudioFormat.NOT_SET), "Audio processor must be configured and flushed before calling queueInput().");
        if (byteBuffer.hasRemaining()) {
            sp0.p(byteBuffer.remaining() % this.inputAudioFormat.bytesPerFrame == 0, "Queued an incomplete frame.");
            ByteBuffer replaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            while (byteBuffer.hasRemaining()) {
                float gainFactorAtSamplePosition = this.gainProvider.getGainFactorAtSamplePosition(this.readFrames, this.inputAudioFormat.sampleRate);
                if (gainFactorAtSamplePosition != 1.0f) {
                    int i = 0;
                    while (true) {
                        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                        if (i >= audioFormat.channelCount) {
                            this.readFrames++;
                            break;
                        }
                        int i2 = audioFormat.encoding;
                        if (i2 == 2) {
                            replaceOutputBuffer.putShort((short) (byteBuffer.getShort() * gainFactorAtSamplePosition));
                        } else {
                            if (i2 != 4) {
                                zl1.d(this.inputAudioFormat.encoding, "Unexpected PCM encoding: ");
                                return;
                            }
                            replaceOutputBuffer.putFloat(byteBuffer.getFloat() * gainFactorAtSamplePosition);
                        }
                        i++;
                    }
                } else {
                    int limit = byteBuffer.limit();
                    long isUnityUntil = this.gainProvider.isUnityUntil(this.readFrames, this.inputAudioFormat.sampleRate);
                    sp0.A(isUnityUntil != C.TIME_UNSET, "Expected a valid end boundary for unity region.");
                    if (isUnityUntil != Long.MIN_VALUE) {
                        byteBuffer.limit(Math.min(limit, byteBuffer.position() + ((int) ((isUnityUntil - this.readFrames) * this.inputAudioFormat.bytesPerFrame))));
                    }
                    this.readFrames += byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
                    replaceOutputBuffer.put(byteBuffer);
                    byteBuffer.limit(limit);
                }
            }
            replaceOutputBuffer.flip();
        }
    }
}
