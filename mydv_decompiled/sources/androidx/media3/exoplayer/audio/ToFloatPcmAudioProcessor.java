package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import defpackage.s83;
import defpackage.sp0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ToFloatPcmAudioProcessor extends BaseAudioProcessor {
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        float f = (float) (i * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.encoding;
        if (Util.isEncodingLinearPcm(i)) {
            return i != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer replaceOutputBuffer;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 == 2) {
            replaceOutputBuffer = replaceOutputBuffer(i * 2);
            while (position < limit) {
                writePcm32BitFloat(byteBuffer.getShort(position) << 16, replaceOutputBuffer);
                position += 2;
            }
        } else if (i2 == 3) {
            replaceOutputBuffer = replaceOutputBuffer(i * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & 255) - 128) << 24, replaceOutputBuffer);
                position++;
            }
        } else if (i2 == 21) {
            replaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(sp0.M(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), replaceOutputBuffer);
                position += 3;
            }
        } else if (i2 == 22) {
            replaceOutputBuffer = replaceOutputBuffer(i);
            while (position < limit) {
                writePcm32BitFloat(byteBuffer.getInt(position), replaceOutputBuffer);
                position += 4;
            }
        } else if (i2 == 268435456) {
            replaceOutputBuffer = replaceOutputBuffer(i * 2);
            while (position < limit) {
                writePcm32BitFloat(Short.reverseBytes(byteBuffer.getShort(position)) << 16, replaceOutputBuffer);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            replaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(sp0.M(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), replaceOutputBuffer);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            replaceOutputBuffer = replaceOutputBuffer(i);
            while (position < limit) {
                writePcm32BitFloat(Integer.reverseBytes(byteBuffer.getInt(position)), replaceOutputBuffer);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            replaceOutputBuffer = replaceOutputBuffer(i / 2);
            while (position < limit) {
                replaceOutputBuffer.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 1895825408) {
            replaceOutputBuffer = replaceOutputBuffer(i);
            while (position < limit) {
                replaceOutputBuffer.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position))));
                position += 4;
            }
        } else {
            if (i2 != 1912602624) {
                s83.r();
                return;
            }
            replaceOutputBuffer = replaceOutputBuffer(i / 2);
            while (position < limit) {
                replaceOutputBuffer.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))));
                position += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
    }
}
