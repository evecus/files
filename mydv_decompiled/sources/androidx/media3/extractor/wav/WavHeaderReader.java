package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import androidx.media3.extractor.ExtractorInput;
import defpackage.sp0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final byte[] WAVEEXT_SUBFORMAT = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] AMBISONIC_SUBFORMAT = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static boolean checkFileType(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i = ChunkHeader.peek(extractorInput, parsableByteArray).id;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt == 1463899717) {
            return true;
        }
        Log.e(TAG, "Unsupported form type: " + readInt);
        return false;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) {
        byte[] bArr;
        byte[] bArr2;
        int i;
        int i2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader skipToChunk = skipToChunk(WavUtil.FMT_FOURCC, extractorInput, parsableByteArray);
        sp0.z(skipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i3 = ((int) skipToChunk.size) - 16;
        if (i3 > 0) {
            bArr = new byte[i3];
            extractorInput.peekFully(bArr, 0, i3);
            if (readLittleEndianUnsignedShort == 65534 && i3 == 24) {
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr);
                parsableByteArray2.readLittleEndianUnsignedShort();
                int readLittleEndianUnsignedShort5 = parsableByteArray2.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort5 != 0 && readLittleEndianUnsignedShort5 != readLittleEndianUnsignedShort4) {
                    throw ParserException.createForUnsupportedContainerFeature("validBits ( " + readLittleEndianUnsignedShort5 + ")  != bitsPerSample( " + readLittleEndianUnsignedShort4 + ") are not supported");
                }
                int readLittleEndianUnsignedIntToInt3 = parsableByteArray2.readLittleEndianUnsignedIntToInt();
                if (!WavUtil.isChannelMaskValid(readLittleEndianUnsignedIntToInt3, readLittleEndianUnsignedShort2)) {
                    throw ParserException.createForUnsupportedContainerFeature("Channel mask " + readLittleEndianUnsignedIntToInt3 + " is invalid or does not match channel count " + readLittleEndianUnsignedShort2);
                }
                int readLittleEndianUnsignedShort6 = parsableByteArray2.readLittleEndianUnsignedShort();
                byte[] bArr3 = new byte[14];
                parsableByteArray2.readBytes(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, WAVEEXT_SUBFORMAT) && !Arrays.equals(bArr3, AMBISONIC_SUBFORMAT)) {
                    throw ParserException.createForUnsupportedContainerFeature("invalid wav format extension guid");
                }
                bArr2 = bArr;
                i2 = readLittleEndianUnsignedIntToInt3;
                i = readLittleEndianUnsignedShort6;
                extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
                return new WavFormat(i, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr2, i2);
            }
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        bArr2 = bArr;
        i = readLittleEndianUnsignedShort;
        i2 = 0;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(i, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr2, i2);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (peek.id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long readLittleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) peek.size) + 8);
        return readLittleEndianLong;
    }

    private static ChunkHeader skipToChunk(int i, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.id != i) {
            Log.w(TAG, "Ignoring unknown WAV chunk: " + peek.id);
            long j = peek.size;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + peek.id);
            }
            extractorInput.skipFully((int) j2);
            peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        return peek;
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        ChunkHeader skipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(skipToChunk.size));
    }
}
