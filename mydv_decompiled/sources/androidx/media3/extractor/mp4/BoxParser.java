package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.DolbyVisionConfig;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.extractor.Av1Config;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.VvcConfig;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.ts.PsExtractor;
import defpackage.dy1;
import defpackage.fy1;
import defpackage.g62;
import defpackage.hf1;
import defpackage.pn1;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import defpackage.x24;
import defpackage.zx1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BoxParser {
    private static final int EDIT_LIST_DURATION_TOLERANCE_TIMESCALE_UNITS = 2;
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subp = 1937072752;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j, long j2) {
            this.avgBitrate = j;
            this.maxBitrate = j2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            boolean z = this.chunkOffsetsAreLongs;
            ParsableByteArray parsableByteArray = this.chunkOffsets;
            this.offset = z ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MdhdData {
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j2, String str) {
            this.timescale = j;
            this.mediaDurationUs = j2;
            this.language = str;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z2;
            this.eyeViewsReversed = z3;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;
        private final int id;
        private final boolean mirrorHorizontal;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i, long j, int i2, int i3, boolean z, int i4, int i5) {
            this.id = i;
            this.duration = j;
            this.alternateGroup = i2;
            this.rotationDegrees = i3;
            this.mirrorHorizontal = z;
            this.width = i4;
            this.height = i5;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class VexuData {
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j + 2;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i, int i2) {
        sp0.z(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(sp0.M(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3])))));
        }
        StringBuilder D = hf1.D("size: ", i, "x", i2, "\npalette: ");
        D.append(g62.d().c(arrayList));
        D.append("\n");
        return D.toString();
    }

    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c = cArr[i2];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp || i == TYPE_subp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            parsableBitArray.skipBytes(1);
            int readBits2 = parsableBitArray.readBits(8);
            for (int i2 = 0; i2 < readBits2; i2++) {
                parsableBitArray.skipBits(6);
                boolean readBit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int readBits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(readBits3);
                builder.setChromaBitdepth(readBits3);
                parsableBitArray.skipBytes(1);
                if (readBit) {
                    int readBits4 = parsableBitArray.readBits(8);
                    int readBits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0161, code lost:
    
        if (r11 == (-1)) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, androidx.media3.common.DrmInitData r33, androidx.media3.extractor.mp4.BoxParser.StsdData r34, int r35) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    public static Metadata parseChpl(ParsableByteArray parsableByteArray) {
        try {
            parsableByteArray.skipBytes(5);
            int readInt = parsableByteArray.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                long readLong = parsableByteArray.readLong() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
                if (readLong < 0) {
                    readLong = C.TIME_UNSET;
                }
                arrayList.add(new Chapter.Builder().setStartTimeMs(readLong).setTitle(new Label(null, parsableByteArray.readString(parsableByteArray.readUnsignedByte()))).build());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new Metadata(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    private static Pair<fy1, fy1> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        int i = 0;
        sp0.m(readUnsignedIntToInt, "Invalid initialCapacity: %s", readUnsignedIntToInt >= 0);
        long[] jArr = new long[readUnsignedIntToInt];
        sp0.m(readUnsignedIntToInt, "Invalid initialCapacity: %s", readUnsignedIntToInt >= 0);
        long[] jArr2 = jArr;
        long[] jArr3 = new long[readUnsignedIntToInt];
        int i2 = 0;
        int i3 = 0;
        while (i < readUnsignedIntToInt) {
            long readUnsignedLongToLong = parseFullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            int i4 = i2 + 1;
            int length = jArr2.length;
            int i5 = Log.LOG_LEVEL_OFF;
            if (i4 > length) {
                int length2 = jArr2.length;
                if (i4 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int i6 = length2 + (length2 >> 1) + 1;
                if (i6 < i4) {
                    i6 = Integer.highestOneBit(i2) << 1;
                }
                if (i6 < 0) {
                    i6 = Integer.MAX_VALUE;
                }
                jArr2 = Arrays.copyOf(jArr2, i6);
            }
            long[] jArr4 = jArr2;
            jArr2[i2] = readUnsignedLongToLong;
            i2++;
            long readLong = parseFullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            int i7 = i3 + 1;
            if (i7 > jArr3.length) {
                int length3 = jArr3.length;
                if (i7 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int i8 = length3 + (length3 >> 1) + 1;
                if (i8 < i7) {
                    i8 = Integer.highestOneBit(i3) << 1;
                }
                if (i8 >= 0) {
                    i5 = i8;
                }
                jArr3 = Arrays.copyOf(jArr3, i5);
            }
            long[] jArr5 = jArr3;
            jArr3[i3] = readLong;
            i3++;
            if (parsableByteArray.readShort() != 1) {
                s83.t("Unsupported media rate.");
                return null;
            }
            parsableByteArray.skipBytes(2);
            i++;
            jArr3 = jArr5;
            jArr2 = jArr4;
        }
        fy1 fy1Var = fy1.K;
        fy1 fy1Var2 = i2 == 0 ? fy1Var : new fy1(jArr2, i2);
        if (i3 != 0) {
            fy1Var = new fy1(jArr3, i3);
        }
        return Pair.create(fy1Var2, fy1Var);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    public static int parseFullBoxFlags(int i) {
        return i & 16777215;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i, boolean z) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray, z);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long readUnsignedInt2 = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt2 != 0) {
                    long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedInt2, 1000000L, readUnsignedInt);
                    readUnsignedInt = readUnsignedInt;
                    j = scaleLargeTimestamp;
                }
            } else {
                i2++;
            }
        }
        return new MdhdData(readUnsignedInt, j, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                r7.L("Skipped metadata with unknown key index: ", readInt4, TAG);
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
                return;
            }
            return;
        }
        if (i == 1769222965) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            byte[] bArr = new byte[readUnsignedByte];
            parsableByteArray.readBytes(bArr, 0, readUnsignedByte);
            stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(MimeTypes.APPLICATION_ITUT_T35).setInitializationData(dy1.t(bArr)).build();
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x020b, code lost:
    
        r4 = r0;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0379  */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.mp4.TrackSampleTable parseStbl(androidx.media3.extractor.mp4.Track r43, androidx.media3.container.Mp4Box.ContainerBox r44, androidx.media3.extractor.GaplessInfoHolder r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseStbl(androidx.media3.extractor.mp4.Track, androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder, boolean):androidx.media3.extractor.mp4.TrackSampleTable");
    }

    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((readUnsignedByte & 1) == 1, (readUnsignedByte & 2) == 2, (readUnsignedByte & 8) == 8));
            }
            position += readInt;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, String str, DrmInitData drmInitData, boolean z) {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        int i = 0;
        while (i < readInt) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1987470129 || readInt3 == 1987471665 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241 || readInt3 == 1684108849) {
                StsdData stsdData2 = stsdData;
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData, str, drmInitData, stsdData2, i);
                stsdData = stsdData2;
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678 || readInt3 == 1768973165 || readInt3 == 1718641517) {
                int i2 = i;
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData.id, str, z, drmInitData, stsdData3, i2);
                stsdData = stsdData3;
                i = i2;
            } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672 || readInt3 == 1836070003 || readInt3 == TYPE_text) {
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData, str, stsdData);
            } else if (readInt3 == 1835365492 || readInt3 == 1769222965) {
                parseMetaDataSampleEntry(parsableByteArray, readInt3, position, tkhdData.id, stsdData);
            } else if (readInt3 == 1667329389) {
                stsdData.format = new Format.Builder().setId(tkhdData.id).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + readInt2);
            i++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, TkhdData tkhdData, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        x24 x24Var = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i4 = i3 - 16;
                byte[] bArr = new byte[i4];
                parsableByteArray.readBytes(bArr, 0, i4);
                x24Var = dy1.t(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else if (i == 1836070003) {
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    EsdsData parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (parseEsdsFromParent.initializationData == null || parseEsdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    x24Var = dy1.t(Util.getUtf8Bytes(formatVobsubIdx(parseEsdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                } else {
                    str2 = null;
                }
            } else {
                if (i != TYPE_text) {
                    s83.r();
                    return;
                }
                str2 = MimeTypes.TEXT_UNKNOWN;
            }
        }
        if (str2 != null) {
            stsdData.format = new Format.Builder().setId(tkhdData.id).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(x24Var).build();
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long readUnsignedInt = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j = readUnsignedInt;
                }
            } else {
                i2++;
            }
        }
        parsableByteArray.skipBytes(10);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        int i3 = (readInt2 == 0 && readInt3 == 65536 && (readInt4 == -65536 || readInt4 == 65536) && readInt5 == 0) ? 90 : (readInt2 == 0 && readInt3 == -65536 && (readInt4 == 65536 || readInt4 == -65536) && readInt5 == 0) ? 270 : ((readInt2 == -65536 || readInt2 == 65536) && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) ? 180 : 0;
        parsableByteArray.skipBytes(16);
        long j2 = j;
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        return new TkhdData(readInt, j2, readUnsignedShort, i3, (((long) readInt2) * ((long) readInt5)) - (((long) readInt3) * ((long) readInt4)) < 0, readShort, parsableByteArray.readShort());
    }

    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        fy1 fy1Var;
        fy1 fy1Var2;
        Format format;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<fy1, fy1> parseEdts;
        Mp4Box.LeafBox leafBoxOfType;
        Mp4Box.ContainerBox containerBoxOfType2 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia);
        containerBoxOfType2.getClass();
        Mp4Box.LeafBox leafBoxOfType2 = containerBoxOfType2.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        leafBoxOfType2.getClass();
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(leafBoxOfType2.data));
        int i = -1;
        if (trackTypeForHdlr == -1) {
            return null;
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd);
        leafBoxOfType3.getClass();
        TkhdData parseTkhd = parseTkhd(leafBoxOfType3.data);
        long j2 = C.TIME_UNSET;
        long j3 = j == C.TIME_UNSET ? parseTkhd.duration : j;
        long j4 = parseMvhd(leafBox.data).timescale;
        if (j3 != C.TIME_UNSET) {
            j2 = Util.scaleLargeTimestamp(j3, 1000000L, j4);
        }
        Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(Mp4Box.TYPE_minf);
        containerBoxOfType3.getClass();
        Mp4Box.ContainerBox containerBoxOfType4 = containerBoxOfType3.getContainerBoxOfType(Mp4Box.TYPE_stbl);
        containerBoxOfType4.getClass();
        Mp4Box.LeafBox leafBoxOfType4 = containerBoxOfType2.getLeafBoxOfType(Mp4Box.TYPE_mdhd);
        leafBoxOfType4.getClass();
        MdhdData parseMdhd = parseMdhd(leafBoxOfType4.data);
        Mp4Box.LeafBox leafBoxOfType5 = containerBoxOfType4.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType5 == null) {
            Log.w(TAG, "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
            return null;
        }
        StsdData parseStsd = parseStsd(leafBoxOfType5.data, parseTkhd, parseMdhd.language, drmInitData, z2);
        Mp4Box.ContainerBox containerBoxOfType5 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_tref);
        if (containerBoxOfType5 != null && (leafBoxOfType = containerBoxOfType5.getLeafBoxOfType(Mp4Box.TYPE_chap)) != null) {
            ParsableByteArray parsableByteArray = leafBoxOfType.data;
            parsableByteArray.setPosition(8);
            if (parsableByteArray.bytesLeft() >= 4) {
                i = parsableByteArray.readInt();
            }
        }
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (parseEdts = parseEdts(containerBoxOfType)) == null) {
            fy1Var = null;
            fy1Var2 = null;
        } else {
            fy1Var2 = (fy1) parseEdts.first;
            fy1Var = (fy1) parseEdts.second;
        }
        if (parseStsd.format == null) {
            return null;
        }
        if (parseTkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(parseTkhd.alternateGroup);
            Format.Builder buildUpon = parseStsd.format.buildUpon();
            Metadata metadata = parseStsd.format.metadata;
            format = buildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            format = parseStsd.format;
        }
        return new Track.Builder().setId(parseTkhd.id).setType(trackTypeForHdlr).setTimescale(parseMdhd.timescale).setMovieTimescale(j4).setDurationUs(j2).setMediaDurationUs(parseMdhd.mediaDurationUs).setFormat(format).setSampleTransformation(parseStsd.requiredSampleTransformation).setSampleDescriptionEncryptionBoxes(parseStsd.trackEncryptionBoxes).setNalUnitLengthFieldLength(parseStsd.nalUnitLengthFieldLength).setEditListDurations(fy1Var2).setEditListMediaTimes(fy1Var).setShouldBeExposed(true ^ Objects.equals(format.sampleMimeType, MimeTypes.TEXT_UNKNOWN)).setChapterTrackId(i).build();
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, pn1 pn1Var, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099) {
                Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd);
                leafBoxOfType.getClass();
                Track track = (Track) pn1Var.apply(parseTrak(containerBox2, leafBoxOfType, j, drmInitData, z, z2));
                if (track != null) {
                    Mp4Box.ContainerBox containerBoxOfType = containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia);
                    containerBoxOfType.getClass();
                    Mp4Box.ContainerBox containerBoxOfType2 = containerBoxOfType.getContainerBoxOfType(Mp4Box.TYPE_minf);
                    containerBoxOfType2.getClass();
                    Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(Mp4Box.TYPE_stbl);
                    containerBoxOfType3.getClass();
                    arrayList.add(parseStbl(track, containerBoxOfType3, gaplessInfoHolder, z3));
                }
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox, boolean z) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + readInt, z));
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + readInt));
            } else if (readInt2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            } else if (readInt2 == 1667788908) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseChpl(parsableByteArray));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return metadata;
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i, boolean z) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt, z);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        EyesData eyesData = null;
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                eyesData = parseStereoViewBox(parsableByteArray, position, readInt);
            }
            position += readInt;
        }
        if (eyesData == null) {
            return null;
        }
        return new VexuData(eyesData);
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, TkhdData tkhdData, String str, DrmInitData drmInitData, StsdData stsdData, int i4) {
        DrmInitData drmInitData2;
        int i5;
        List<byte[]> list;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr;
        String str2;
        int i10;
        DolbyVisionConfig dolbyVisionConfig;
        String str3;
        String str4;
        int i11;
        String str5;
        int i12;
        int i13;
        DrmInitData drmInitData3;
        int i14;
        List<byte[]> list2;
        String str6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = i2;
        int i26 = i3;
        DrmInitData drmInitData4 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i25 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i27 = i;
        if (i27 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i25, i26);
            if (parseSampleEntryEncryptionData != null) {
                i27 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData4 = drmInitData4 == null ? null : drmInitData4.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i4] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str7 = MimeTypes.VIDEO_H263;
        String str8 = i27 == 1831958048 ? MimeTypes.VIDEO_MPEG : i27 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        float f = 1.0f;
        int i28 = 8;
        int i29 = 8;
        DolbyVisionConfig dolbyVisionConfig2 = null;
        List<byte[]> list3 = null;
        String str9 = null;
        byte[] bArr2 = null;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        ByteBuffer byteBuffer = null;
        BtrtData btrtData = null;
        EsdsData esdsData = null;
        NalUnitUtil.H265VpsData h265VpsData = null;
        boolean z = false;
        while (true) {
            if (position - i25 >= i26) {
                drmInitData2 = drmInitData4;
                i5 = i28;
                list = list3;
                i6 = i30;
                i7 = i35;
                i8 = i36;
                i9 = i37;
                bArr = null;
                str2 = str8;
                i10 = i29;
                dolbyVisionConfig = dolbyVisionConfig2;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i2 == i26) {
                drmInitData2 = drmInitData4;
                i5 = i28;
                dolbyVisionConfig = dolbyVisionConfig2;
                list = list3;
                i6 = i30;
                i7 = i35;
                i8 = i36;
                i9 = i37;
                bArr = null;
                str2 = str8;
                i10 = i29;
                break;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str8 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                List<byte[]> list4 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f = parse.pixelWidthHeightRatio;
                }
                String str10 = parse.codecs;
                int i38 = parse.maxNumReorderFrames;
                int i39 = parse.colorSpace;
                int i40 = parse.colorRange;
                list3 = list4;
                int i41 = parse.colorTransfer;
                int i42 = parse.bitdepthLuma;
                int i43 = parse.bitdepthChroma;
                drmInitData3 = drmInitData4;
                i11 = position;
                i15 = i27;
                str5 = str7;
                i12 = i39;
                i13 = i40;
                i37 = i41;
                str6 = MimeTypes.VIDEO_H264;
                i29 = i43;
                str9 = str10;
                i31 = i38;
                i28 = i42;
            } else {
                i11 = position;
                if (readInt2 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str8 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list5 = parse2.initializationData;
                    stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    if (!z) {
                        f = parse2.pixelWidthHeightRatio;
                    }
                    int i44 = parse2.maxNumReorderPics;
                    int i45 = parse2.maxSubLayers;
                    String str11 = parse2.codecs;
                    int i46 = parse2.stereoMode;
                    list3 = list5;
                    if (i46 != -1) {
                        i30 = i46;
                    }
                    int i47 = parse2.decodedWidth;
                    int i48 = parse2.decodedHeight;
                    int i49 = parse2.colorSpace;
                    int i50 = parse2.colorRange;
                    int i51 = parse2.colorTransfer;
                    int i52 = parse2.bitdepthLuma;
                    int i53 = parse2.bitdepthChroma;
                    h265VpsData = parse2.vpsData;
                    drmInitData3 = drmInitData4;
                    str6 = MimeTypes.VIDEO_H265;
                    i15 = i27;
                    str5 = str7;
                    i12 = i49;
                    i13 = i50;
                    i37 = i51;
                    i31 = i44;
                    i32 = i45;
                    i33 = i47;
                    i28 = i52;
                    str9 = str11;
                    i34 = i48;
                    i29 = i53;
                } else {
                    str5 = str7;
                    if (readInt2 == 1818785347) {
                        ExtractorUtil.checkContainerInput(MimeTypes.VIDEO_H265.equals(str8), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
                        ExtractorUtil.checkContainerInput(h265VpsData2 != null && h265VpsData2.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        h265VpsData2.getClass();
                        HevcConfig parseLayered = HevcConfig.parseLayered(parsableByteArray, h265VpsData2);
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == parseLayered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i54 = parseLayered.colorSpace;
                        int i55 = i35;
                        if (i54 != -1) {
                            ExtractorUtil.checkContainerInput(i55 == i54, "colorSpace must be the same for both views");
                        }
                        int i56 = parseLayered.colorRange;
                        int i57 = i36;
                        if (i56 != -1) {
                            ExtractorUtil.checkContainerInput(i57 == i56, "colorRange must be the same for both views");
                        }
                        int i58 = parseLayered.colorTransfer;
                        if (i58 != -1) {
                            int i59 = i37;
                            i23 = i59;
                            ExtractorUtil.checkContainerInput(i59 == i58, "colorTransfer must be the same for both views");
                        } else {
                            i23 = i37;
                        }
                        ExtractorUtil.checkContainerInput(i28 == parseLayered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i29 == parseLayered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> list6 = list3;
                        if (list6 != null) {
                            zx1 n = dy1.n();
                            n.d(list6);
                            n.d(parseLayered.initializationData);
                            list6 = n.f();
                            i24 = i55;
                        } else {
                            i24 = i55;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str12 = parseLayered.codecs;
                        h265VpsData = h265VpsData2;
                        drmInitData3 = drmInitData4;
                        str6 = MimeTypes.VIDEO_MV_HEVC;
                        i15 = i27;
                        i13 = i57;
                        i12 = i24;
                        i37 = i23;
                        str9 = str12;
                        list3 = list6;
                    } else {
                        List<byte[]> list7 = list3;
                        i12 = i35;
                        i13 = i36;
                        int i60 = i37;
                        NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData;
                        if (readInt2 == 1987470147) {
                            ExtractorUtil.checkContainerInput(str8 == null, null);
                            parsableByteArray.setPosition(position2 + 8);
                            VvcConfig parse3 = VvcConfig.parse(parsableByteArray);
                            List<byte[]> list8 = parse3.initializationData;
                            stsdData2.nalUnitLengthFieldLength = parse3.nalUnitLengthFieldLength;
                            String str13 = parse3.codecs;
                            i29 = parse3.bitdepthLuma;
                            h265VpsData = h265VpsData3;
                            drmInitData3 = drmInitData4;
                            list3 = list8;
                            str9 = str13;
                            str6 = MimeTypes.VIDEO_H266;
                            i15 = i27;
                            i37 = i60;
                            i31 = 16;
                            i28 = i29;
                        } else if (readInt2 == 1986361461) {
                            VexuData parseVideoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, readInt);
                            if (parseVideoExtendedUsageBox != null && parseVideoExtendedUsageBox.eyesData != null) {
                                if (h265VpsData3 == null || h265VpsData3.layerInfos.size() < 2) {
                                    i22 = i30;
                                    if (i22 == -1) {
                                        i30 = parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                        h265VpsData = h265VpsData3;
                                        drmInitData3 = drmInitData4;
                                        list3 = list7;
                                        str6 = str8;
                                        i15 = i27;
                                        i37 = i60;
                                    }
                                    i30 = i22;
                                    h265VpsData = h265VpsData3;
                                    drmInitData3 = drmInitData4;
                                    list3 = list7;
                                    str6 = str8;
                                    i15 = i27;
                                    i37 = i60;
                                } else {
                                    ExtractorUtil.checkContainerInput(parseVideoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                    ExtractorUtil.checkContainerInput(!parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i22 = i30;
                            i30 = i22;
                            h265VpsData = h265VpsData3;
                            drmInitData3 = drmInitData4;
                            list3 = list7;
                            str6 = str8;
                            i15 = i27;
                            i37 = i60;
                        } else {
                            int i61 = i30;
                            if (readInt2 == 1685480259 || readInt2 == 1685485123 || readInt2 == 1685485379) {
                                drmInitData3 = drmInitData4;
                                i14 = i28;
                                list2 = list7;
                                str6 = str8;
                                i15 = i27;
                                i16 = i29;
                                i17 = i12;
                                i18 = i60;
                                dolbyVisionConfig2 = DolbyVisionConfig.parse(parsableByteArray);
                            } else {
                                if (readInt2 == 1987076931) {
                                    ExtractorUtil.checkContainerInput(str8 == null, null);
                                    String str14 = i27 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                    parsableByteArray.setPosition(position2 + 12);
                                    byte readUnsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                    byte readUnsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                    i29 = readUnsignedByte3 >> 4;
                                    i15 = i27;
                                    byte b = (byte) ((readUnsignedByte3 >> 1) & 7);
                                    if (str14.equals(MimeTypes.VIDEO_VP9)) {
                                        list7 = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(readUnsignedByte, readUnsignedByte2, (byte) i29, b);
                                    }
                                    boolean z2 = (readUnsignedByte3 & 1) != 0;
                                    int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                    int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                                    int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte4);
                                    int i62 = z2 ? 1 : 2;
                                    i37 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte5);
                                    drmInitData3 = drmInitData4;
                                    i28 = i29;
                                    i13 = i62;
                                    h265VpsData = h265VpsData3;
                                    i12 = isoColorPrimariesToColorSpace;
                                    str6 = str14;
                                    list3 = list7;
                                } else {
                                    i15 = i27;
                                    if (readInt2 == 1635135811) {
                                        int i63 = readInt - 8;
                                        byte[] bArr3 = new byte[i63];
                                        parsableByteArray.readBytes(bArr3, 0, i63);
                                        list3 = dy1.t(bArr3);
                                        Av1Config parse4 = Av1Config.parse(bArr3);
                                        if (parse4 != null) {
                                            i28 = parse4.bitdepth;
                                            int i64 = parse4.colorSpace;
                                            i21 = parse4.colorRange;
                                            int i65 = parse4.colorTransfer;
                                            str9 = parse4.codecs;
                                            i20 = i64;
                                            i29 = i28;
                                            i37 = i65;
                                        } else {
                                            i20 = i12;
                                            i21 = i13;
                                            i37 = i60;
                                        }
                                        drmInitData3 = drmInitData4;
                                        i13 = i21;
                                        h265VpsData = h265VpsData3;
                                        i12 = i20;
                                        str6 = MimeTypes.VIDEO_AV1;
                                    } else if (readInt2 == 1668050025) {
                                        ByteBuffer allocateHdrStaticInfo = byteBuffer == null ? allocateHdrStaticInfo() : byteBuffer;
                                        allocateHdrStaticInfo.position(21);
                                        allocateHdrStaticInfo.putShort(parsableByteArray.readShort());
                                        allocateHdrStaticInfo.putShort(parsableByteArray.readShort());
                                        byteBuffer = allocateHdrStaticInfo;
                                        drmInitData3 = drmInitData4;
                                        list3 = list7;
                                        str6 = str8;
                                        h265VpsData = h265VpsData3;
                                        i37 = i60;
                                    } else {
                                        if (readInt2 == 1835295606) {
                                            ByteBuffer allocateHdrStaticInfo2 = byteBuffer == null ? allocateHdrStaticInfo() : byteBuffer;
                                            short readShort = parsableByteArray.readShort();
                                            short readShort2 = parsableByteArray.readShort();
                                            short readShort3 = parsableByteArray.readShort();
                                            str6 = str8;
                                            short readShort4 = parsableByteArray.readShort();
                                            short readShort5 = parsableByteArray.readShort();
                                            int i66 = i29;
                                            short readShort6 = parsableByteArray.readShort();
                                            int i67 = i28;
                                            short readShort7 = parsableByteArray.readShort();
                                            drmInitData3 = drmInitData4;
                                            short readShort8 = parsableByteArray.readShort();
                                            long readUnsignedInt = parsableByteArray.readUnsignedInt();
                                            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                                            allocateHdrStaticInfo2.position(1);
                                            allocateHdrStaticInfo2.putShort(readShort5);
                                            allocateHdrStaticInfo2.putShort(readShort6);
                                            allocateHdrStaticInfo2.putShort(readShort);
                                            allocateHdrStaticInfo2.putShort(readShort2);
                                            allocateHdrStaticInfo2.putShort(readShort3);
                                            allocateHdrStaticInfo2.putShort(readShort4);
                                            allocateHdrStaticInfo2.putShort(readShort7);
                                            allocateHdrStaticInfo2.putShort(readShort8);
                                            allocateHdrStaticInfo2.putShort((short) (readUnsignedInt / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                            allocateHdrStaticInfo2.putShort((short) (readUnsignedInt2 / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                            byteBuffer = allocateHdrStaticInfo2;
                                            i29 = i66;
                                            i28 = i67;
                                            i37 = i60;
                                            list3 = list7;
                                        } else {
                                            drmInitData3 = drmInitData4;
                                            i14 = i28;
                                            list2 = list7;
                                            str6 = str8;
                                            i16 = i29;
                                            if (readInt2 == 1681012275) {
                                                ExtractorUtil.checkContainerInput(str6 == null, null);
                                                i29 = i16;
                                                i28 = i14;
                                                str6 = str5;
                                            } else if (readInt2 == 1702061171) {
                                                ExtractorUtil.checkContainerInput(str6 == null, null);
                                                esdsData = parseEsdsFromParent(parsableByteArray, position2);
                                                String str15 = esdsData.mimeType;
                                                byte[] bArr4 = esdsData.initializationData;
                                                list3 = bArr4 != null ? dy1.t(bArr4) : list2;
                                                str6 = str15;
                                                i29 = i16;
                                                i28 = i14;
                                                i37 = i60;
                                            } else {
                                                if (readInt2 == 1651798644) {
                                                    btrtData = parseBtrtFromParent(parsableByteArray, position2);
                                                } else {
                                                    if (readInt2 == 1885434736) {
                                                        f = parsePaspFromParent(parsableByteArray, position2);
                                                        i29 = i16;
                                                        i28 = i14;
                                                        i37 = i60;
                                                        list3 = list2;
                                                        z = true;
                                                    } else if (readInt2 == 1937126244) {
                                                        bArr2 = parseProjFromParent(parsableByteArray, position2, readInt);
                                                    } else if (readInt2 == 1936995172) {
                                                        int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                                        parsableByteArray.skipBytes(3);
                                                        if (readUnsignedByte6 == 0) {
                                                            int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                                            if (readUnsignedByte7 != 0) {
                                                                i19 = 1;
                                                                if (readUnsignedByte7 != 1) {
                                                                    if (readUnsignedByte7 == 2) {
                                                                        i19 = 2;
                                                                    } else if (readUnsignedByte7 == 3) {
                                                                        i19 = 3;
                                                                    }
                                                                }
                                                            } else {
                                                                i19 = 0;
                                                            }
                                                            i29 = i16;
                                                            i28 = i14;
                                                            i37 = i60;
                                                            list3 = list2;
                                                            h265VpsData = h265VpsData3;
                                                            i30 = i19;
                                                        }
                                                        i19 = i61;
                                                        i29 = i16;
                                                        i28 = i14;
                                                        i37 = i60;
                                                        list3 = list2;
                                                        h265VpsData = h265VpsData3;
                                                        i30 = i19;
                                                    } else {
                                                        if (readInt2 == 1634760259) {
                                                            int i68 = readInt - 12;
                                                            byte[] bArr5 = new byte[i68];
                                                            parsableByteArray.setPosition(position2 + 12);
                                                            parsableByteArray.readBytes(bArr5, 0, i68);
                                                            str9 = CodecSpecificDataUtil.buildApvCodecString(bArr5);
                                                            list3 = dy1.t(bArr5);
                                                            ColorInfo parseApvc = parseApvc(new ParsableByteArray(bArr5));
                                                            int i69 = parseApvc.lumaBitdepth;
                                                            int i70 = parseApvc.chromaBitdepth;
                                                            int i71 = parseApvc.colorSpace;
                                                            int i72 = parseApvc.colorRange;
                                                            i37 = parseApvc.colorTransfer;
                                                            i29 = i70;
                                                            i12 = i71;
                                                            i13 = i72;
                                                            str6 = MimeTypes.VIDEO_APV;
                                                            h265VpsData = h265VpsData3;
                                                            i28 = i69;
                                                        } else {
                                                            i17 = i12;
                                                            if (readInt2 == 1668246642) {
                                                                i18 = i60;
                                                                if (i17 == -1 && i18 == -1) {
                                                                    int readInt3 = parsableByteArray.readInt();
                                                                    if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                                                                        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                                                        int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                                                        parsableByteArray.skipBytes(2);
                                                                        boolean z3 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                                        i12 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                                                        i13 = z3 ? 1 : 2;
                                                                        i29 = i16;
                                                                        i28 = i14;
                                                                        list3 = list2;
                                                                        i37 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                                                    } else {
                                                                        Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(readInt3));
                                                                    }
                                                                }
                                                            } else {
                                                                i18 = i60;
                                                            }
                                                        }
                                                    }
                                                    h265VpsData = h265VpsData3;
                                                }
                                                i29 = i16;
                                                i28 = i14;
                                            }
                                            i37 = i60;
                                            list3 = list2;
                                        }
                                        h265VpsData = h265VpsData3;
                                    }
                                }
                                i30 = i61;
                            }
                            i12 = i17;
                            i29 = i16;
                            i28 = i14;
                            list3 = list2;
                            i37 = i18;
                            h265VpsData = h265VpsData3;
                            i30 = i61;
                        }
                    }
                    position = i11 + readInt;
                    i25 = i2;
                    i26 = i3;
                    stsdData2 = stsdData;
                    str8 = str6;
                    i27 = i15;
                    str7 = str5;
                    i35 = i12;
                    i36 = i13;
                    drmInitData4 = drmInitData3;
                }
            }
            position = i11 + readInt;
            i25 = i2;
            i26 = i3;
            stsdData2 = stsdData;
            str8 = str6;
            i27 = i15;
            str7 = str5;
            i35 = i12;
            i36 = i13;
            drmInitData4 = drmInitData3;
        }
        if (dolbyVisionConfig != null) {
            str3 = dolbyVisionConfig.codecs;
            str4 = MimeTypes.VIDEO_DOLBY_VISION;
        } else {
            str3 = str9;
            str4 = str2;
        }
        if (str4 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(tkhdData.id).setSampleMimeType(str4).setCodecs(str3).setWidth(readUnsignedShort).setHeight(readUnsignedShort2).setDecodedWidth(i33).setDecodedHeight(i34).setPixelWidthHeightRatio(f).setRotationDegrees(tkhdData.rotationDegrees).setMirrorHorizontal(tkhdData.mirrorHorizontal).setProjectionData(bArr2).setStereoMode(i6).setInitializationData(list).setMaxNumReorderSamples(i31).setMaxSubLayers(i32).setDrmInitData(drmInitData2).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i7).setColorRange(i8).setColorTransfer(i9).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : bArr).setLumaBitdepth(i5).setChromaBitdepth(i10).build());
        if (btrtData != null) {
            colorInfo.setAverageBitrate(sp0.d0(btrtData.avgBitrate)).setPeakBitrate(sp0.d0(btrtData.maxBitrate));
        } else if (esdsData != null) {
            colorInfo.setAverageBitrate(sp0.d0(esdsData.bitrate)).setPeakBitrate(sp0.d0(esdsData.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = ((i >> 8) & 255) - 128;
        int i4 = (i & 255) - 128;
        return Util.constrainValue(((i4 * 17790) / 10000) + i2, 0, 255) | (Util.constrainValue(((i3 * 14075) / 10000) + i2, 0, 255) << 16) | (Util.constrainValue((i2 - ((i4 * 3455) / 10000)) - ((i3 * 7169) / 10000), 0, 255) << 8);
    }
}
