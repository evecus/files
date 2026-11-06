package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import defpackage.dy1;
import defpackage.s83;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class FlacStreamMetadataHolder {
        public FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(FlacStreamMetadata flacStreamMetadata) {
            this.flacStreamMetadata = flacStreamMetadata;
        }
    }

    private FlacMetadataReader() {
    }

    public static boolean checkAndPeekStreamMarker(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        return parsableByteArray.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(2);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        if ((readUnsignedShort >> 2) == SYNC_CODE) {
            extractorInput.resetPeekPosition();
            return readUnsignedShort;
        }
        extractorInput.resetPeekPosition();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static Metadata peekId3Metadata(ExtractorInput extractorInput, boolean z, boolean z2) {
        Metadata peekId3Data = new Id3Peeker().peekId3Data(extractorInput, !z ? Id3Decoder.NO_FRAMES_PREDICATE : z2 ? Id3Decoder.NO_ARTWORK_PREDICATE : null, 0);
        if (peekId3Data == null || peekId3Data.length() == 0) {
            return null;
        }
        return peekId3Data;
    }

    public static Metadata readId3Metadata(ExtractorInput extractorInput, boolean z, boolean z2) {
        extractorInput.resetPeekPosition();
        long peekPosition = extractorInput.getPeekPosition();
        Metadata peekId3Metadata = peekId3Metadata(extractorInput, z, z2);
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - peekPosition));
        return peekId3Metadata;
    }

    public static boolean readMetadataBlock(ExtractorInput extractorInput, FlacStreamMetadataHolder flacStreamMetadataHolder, boolean z) {
        extractorInput.resetPeekPosition();
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[4]);
        extractorInput.peekFully(parsableBitArray.data, 0, 4);
        boolean readBit = parsableBitArray.readBit();
        int readBits = parsableBitArray.readBits(7);
        int readBits2 = parsableBitArray.readBits(24) + 4;
        if (readBits == 0) {
            flacStreamMetadataHolder.flacStreamMetadata = readStreamInfoBlock(extractorInput);
            return readBit;
        }
        FlacStreamMetadata flacStreamMetadata = flacStreamMetadataHolder.flacStreamMetadata;
        if (flacStreamMetadata == null) {
            s83.d();
            return false;
        }
        if (readBits == 3) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(readSeekTableMetadataBlock(extractorInput, readBits2));
            return readBit;
        }
        if (readBits == 4) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(readVorbisCommentMetadataBlock(extractorInput, readBits2));
            return readBit;
        }
        if (readBits != 6) {
            extractorInput.skipFully(readBits2);
            return readBit;
        }
        if (z) {
            extractorInput.skipFully(readBits2);
            return readBit;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(readBits2);
        extractorInput.readFully(parsableByteArray.getData(), 0, readBits2);
        parsableByteArray.skipBytes(4);
        flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(dy1.t(PictureFrame.fromPictureBlock(parsableByteArray)));
        return readBit;
    }

    public static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(1);
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        long position = parsableByteArray.getPosition() + readUnsignedInt24;
        int i = readUnsignedInt24 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long readLong = parsableByteArray.readLong();
            if (readLong == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = readLong;
            jArr2[i2] = parsableByteArray.readLong();
            parsableByteArray.skipBytes(2);
            i2++;
        }
        parsableByteArray.skipBytes((int) (position - parsableByteArray.getPosition()));
        return new FlacStreamMetadata.SeekTable(jArr, jArr2);
    }

    private static FlacStreamMetadata readStreamInfoBlock(ExtractorInput extractorInput) {
        byte[] bArr = new byte[38];
        extractorInput.readFully(bArr, 0, 38);
        return new FlacStreamMetadata(bArr, 4);
    }

    public static void readStreamMarker(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.readFully(parsableByteArray.getData(), 0, 4);
        if (parsableByteArray.readUnsignedInt() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> readVorbisCommentMetadataBlock(ExtractorInput extractorInput, int i) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        parsableByteArray.skipBytes(4);
        return Arrays.asList(androidx.media3.container.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments);
    }

    private static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ExtractorInput extractorInput, int i) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        return readSeekTableMetadataBlock(parsableByteArray);
    }
}
