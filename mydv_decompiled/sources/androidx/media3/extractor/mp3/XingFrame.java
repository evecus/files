package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class XingFrame {
    private static final int LAME_TO_DECODED_PCM_TRIM_OFFSET_SAMPLES = 529;
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;
    public final Mp3InfoReplayGain replayGain;
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j, long j2, long[] jArr, Mp3InfoReplayGain mp3InfoReplayGain, int i, int i2) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j2;
        this.tableOfContents = jArr;
        this.replayGain = mp3InfoReplayGain;
        this.encoderDelay = i;
        this.encoderPadding = i2;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i;
        int i2;
        int readInt = parsableByteArray.readInt();
        int readUnsignedIntToInt = (readInt & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long readUnsignedInt = (readInt & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        Mp3InfoReplayGain mp3InfoReplayGain = null;
        if ((readInt & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((readInt & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            String readString = parsableByteArray.readString(9);
            parsableByteArray.skipBytes(2);
            mp3InfoReplayGain = Mp3InfoReplayGain.parse(parsableByteArray.readFloat(), parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
            parsableByteArray.skipBytes(2);
            int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
            int i4 = (16773120 & readUnsignedInt24) >> 12;
            int i5 = readUnsignedInt24 & 4095;
            if (usesLameGaplessEncoding(readString)) {
                i4 += LAME_TO_DECODED_PCM_TRIM_OFFSET_SAMPLES;
                i5 = Math.max(0, i5 - 529);
            }
            i2 = i5;
            i = i4;
        } else {
            i = -1;
            i2 = -1;
        }
        return new XingFrame(header, readUnsignedIntToInt, readUnsignedInt, jArr, mp3InfoReplayGain, i, i2);
    }

    private static boolean usesLameGaplessEncoding(String str) {
        return str.startsWith("LAME") || str.startsWith("Lavf") || str.startsWith("Lavc");
    }

    public long computeDurationUs() {
        int i;
        long j = this.frameCount;
        if (j == -1 || j == 0) {
            return C.TIME_UNSET;
        }
        MpegAudioUtil.Header header = this.header;
        long j2 = j * header.samplesPerFrame;
        if (this.encoderDelay != -1 && (i = this.encoderPadding) != -1) {
            j2 -= r7 + i;
        }
        return j2 <= 0 ? C.TIME_UNSET : Util.sampleCountToDurationUs(j2 - 1, header.sampleRate);
    }

    public Metadata getMetadata() {
        Mp3InfoReplayGain mp3InfoReplayGain = this.replayGain;
        if (mp3InfoReplayGain != null) {
            return new Metadata(mp3InfoReplayGain);
        }
        return null;
    }
}
