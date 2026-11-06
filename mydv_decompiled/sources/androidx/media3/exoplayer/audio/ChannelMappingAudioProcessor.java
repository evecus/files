package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import defpackage.yx1;
import defpackage.zl1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    private yx1 outputChannels;
    private yx1 pendingOutputChannels;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        yx1 yx1Var = this.pendingOutputChannels;
        if (yx1Var == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (!Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = yx1Var.J;
        boolean z = audioFormat.channelCount != i;
        int i2 = 0;
        while (i2 < i) {
            int b = yx1Var.b(i2);
            if (b >= audioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + yx1Var + ") trying to access non-existent input channel.", audioFormat);
            }
            z |= b != i2;
            i2++;
        }
        return z ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, i, audioFormat.encoding) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        yx1 yx1Var = this.outputChannels;
        yx1Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(((limit - position) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (position < limit) {
            for (int i = 0; i < yx1Var.J; i++) {
                int byteDepth = (Util.getByteDepth(this.inputAudioFormat.encoding) * yx1Var.b(i)) + position;
                int i2 = this.inputAudioFormat.encoding;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                if (i2 != 1879048192) {
                                                    if (i2 != 1895825408) {
                                                        if (i2 != 1912602624) {
                                                            zl1.d(this.inputAudioFormat.encoding, "Unexpected encoding: ");
                                                            return;
                                                        }
                                                    }
                                                }
                                                replaceOutputBuffer.putDouble(byteBuffer.getDouble(byteDepth));
                                            }
                                        }
                                    }
                                }
                                replaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                            }
                            Util.putInt24(replaceOutputBuffer, Util.getInt24(byteBuffer, byteDepth));
                        }
                        replaceOutputBuffer.putFloat(byteBuffer.getFloat(byteDepth));
                    } else {
                        replaceOutputBuffer.put(byteBuffer.get(byteDepth));
                    }
                }
                replaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
            }
            position += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(limit);
        replaceOutputBuffer.flip();
    }

    @Deprecated
    public void setChannelMap(int[] iArr) {
        setChannelMap(iArr == null ? null : yx1.a(iArr));
    }

    public void setChannelMap(yx1 yx1Var) {
        this.pendingOutputChannels = yx1Var;
    }
}
