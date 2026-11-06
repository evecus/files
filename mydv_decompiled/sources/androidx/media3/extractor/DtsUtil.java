package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface DtsAudioMimeType {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i, int i2, int i3, long j, int i4) {
            this.mimeType = str;
            this.channelCount = i;
            this.sampleRate = i2;
            this.frameSize = i3;
            this.frameDurationUs = j;
            this.bitrate = i4;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface FrameType {
    }

    private DtsUtil() {
    }

    private static void checkCrc(byte[] bArr, int i) {
        int i2 = i - 2;
        if (((bArr[i - 1] & FIRST_BYTE_14B_LE) | ((bArr[i2] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != Util.crc16(bArr, 0, i2, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i) {
        if (i == SYNC_VALUE_BE || i == SYNC_VALUE_LE || i == SYNC_VALUE_14B_BE || i == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i == SYNC_VALUE_EXTSS_BE || i == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i == SYNC_VALUE_UHD_FTOC_SYNC_BE || i == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        if (copyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(copyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(copyOf);
        return parsableBitArray;
    }

    private static int getRemapChannelCount(int i) {
        int i2 = (i & 1) != 0 ? 1 : 0;
        if ((i & 2) != 0) {
            i2 += 2;
        }
        if ((i & 4) != 0) {
            i2 += 2;
        }
        if ((i & 8) != 0) {
            i2++;
        }
        if ((i & 16) != 0) {
            i2++;
        }
        if ((i & 32) != 0) {
            i2 += 2;
        }
        if ((i & 64) != 0) {
            i2 += 2;
        }
        if ((i & 128) != 0) {
            i2++;
        }
        if ((i & 256) != 0) {
            i2++;
        }
        if ((i & 512) != 0) {
            i2 += 2;
        }
        if ((i & 1024) != 0) {
            i2 += 2;
        }
        if ((i & 2048) != 0) {
            i2 += 2;
        }
        if ((i & 4096) != 0) {
            i2++;
        }
        if ((i & 8192) != 0) {
            i2 += 2;
        }
        if ((i & 16384) != 0) {
            i2++;
        }
        return (i & 32768) != 0 ? i2 + 2 : i2;
    }

    public static boolean isDtsBaseAudioMimeType(String str) {
        return Objects.equals(str, MimeTypes.AUDIO_DTS) || Objects.equals(str, MimeTypes.AUDIO_DTS_HD);
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
    }

    private static void parseAssetDescriptorDynamicData(ParsableBitArray parsableBitArray, boolean z, boolean z2, int i, boolean z3, int[] iArr) {
        boolean readBit = parsableBitArray.readBit();
        if (readBit) {
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (readBit && z) {
            parsableBitArray.skipBits(8);
        }
        if (z3 && parsableBitArray.readBit()) {
            iArr.getClass();
            parsableBitArray.skipBits(7);
            if (parsableBitArray.readBits(2) < 3) {
                parsableBitArray.skipBits(3);
            } else {
                parsableBitArray.skipBits(8);
            }
            boolean readBit2 = parsableBitArray.readBit();
            for (int i2 : iArr) {
                if (readBit2) {
                    parsableBitArray.skipBits(i2 * 6);
                } else {
                    parsableBitArray.skipBits(6);
                }
            }
            int[] iArr2 = new int[3];
            iArr2[0] = i;
            int i3 = 1;
            if (z2) {
                iArr2[1] = 6;
                i3 = 2;
            }
            if (z) {
                iArr2[i3] = 2;
                i3++;
            }
            for (int i4 : iArr) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    for (int i7 = 0; i7 < i6; i7++) {
                        parsableBitArray.skipBits(Integer.bitCount(parsableBitArray.readBits(i4)) * 6);
                    }
                }
            }
        }
    }

    private static String parseDecoderNavigationData(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(2);
        if (readBits == 0) {
            return (parsableBitArray.readBits(12) & 256) != 0 ? MimeTypes.AUDIO_DTS_EXPRESS : MimeTypes.AUDIO_DTS_HD;
        }
        if (readBits == 1) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (readBits == 2) {
            return MimeTypes.AUDIO_DTS_EXPRESS;
        }
        throw ParserException.createForMalformedContainer("Unsupported coding mode in DTS HD header: " + readBits, null);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b2 = byteBuffer.get(position + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b2 = byteBuffer.get(position + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, int i, String str3, DrmInitData drmInitData) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i2 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i3 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int readBits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i4 = readBits >= iArr.length ? -1 : (iArr[readBits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        return new Format.Builder().setId(str).setContainerMimeType(str3).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i4).setChannelCount(i2 + (normalizedFrame.readBits(2) > 0 ? 1 : 0)).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) {
        int i;
        int i2;
        boolean z;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        long j;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        int i9;
        int[] iArr2;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int readBits = normalizedFrame.readBits(2);
        if (normalizedFrame.readBit()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        normalizedFrame.skipBits(i2);
        int readBits2 = normalizedFrame.readBits(i) + 1;
        boolean readBit = normalizedFrame.readBit();
        if (readBit) {
            i3 = normalizedFrame.readBits(2);
            i4 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int readBits3 = normalizedFrame.readBits(3) + 1;
            int readBits4 = normalizedFrame.readBits(3) + 1;
            if (readBits3 != 1 || readBits4 != 1) {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i10 = readBits + 1;
            int readBits5 = normalizedFrame.readBits(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                if (((readBits5 >> i11) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            z = normalizedFrame.readBit();
            if (z) {
                normalizedFrame.skipBits(2);
                int readBits6 = (normalizedFrame.readBits(2) + 1) << 2;
                int readBits7 = normalizedFrame.readBits(2) + 1;
                iArr2 = new int[readBits7];
                for (int i12 = 0; i12 < readBits7; i12++) {
                    iArr2[i12] = getRemapChannelCount(normalizedFrame.readBits(readBits6));
                }
            } else {
                iArr2 = null;
            }
            iArr = iArr2;
        } else {
            z = false;
            iArr = null;
            i3 = -1;
            i4 = 0;
        }
        normalizedFrame.skipBits(i);
        normalizedFrame.skipBits(12);
        if (readBit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            int i13 = 5;
            normalizedFrame.skipBits(5);
            int i14 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            int readBits8 = normalizedFrame.readBits(8) + 1;
            if (normalizedFrame.readBit()) {
                boolean readBit2 = readBits8 > 2 ? normalizedFrame.readBit() : false;
                boolean readBit3 = readBits8 > 6 ? normalizedFrame.readBit() : false;
                if (normalizedFrame.readBit()) {
                    i9 = (normalizedFrame.readBits(2) + 1) << 2;
                    normalizedFrame.skipBits(i9);
                } else {
                    i9 = 0;
                }
                int readBits9 = normalizedFrame.readBits(3);
                int[] iArr3 = new int[readBits9];
                i5 = 1;
                for (int i15 = 0; i15 < readBits9; i15++) {
                    iArr3[i15] = normalizedFrame.readBits(i9);
                }
                int i16 = 0;
                while (i16 < readBits9) {
                    int remapChannelCount = getRemapChannelCount(iArr3[i16]);
                    int i17 = i13;
                    int readBits10 = normalizedFrame.readBits(i13) + 1;
                    boolean z5 = z;
                    for (int i18 = 0; i18 < remapChannelCount; i18++) {
                        normalizedFrame.skipBits(Integer.bitCount(normalizedFrame.readBits(readBits10)) * 5);
                    }
                    i16++;
                    i13 = i17;
                    z = z5;
                }
                boolean z6 = readBit2;
                z2 = z;
                z3 = z6;
                z4 = readBit3;
            } else {
                i5 = 1;
                normalizedFrame.skipBits(3);
                z2 = z;
                z3 = false;
                z4 = false;
            }
            parseAssetDescriptorDynamicData(normalizedFrame, z3, z4, readBits8, z2, iArr);
            i7 = readBits8;
            i6 = i14;
            str = parseDecoderNavigationData(normalizedFrame);
        } else {
            i5 = 1;
            i6 = -2147483647;
            str = null;
            i7 = -1;
        }
        if (readBit) {
            if (i3 == 0) {
                i8 = 32000;
            } else if (i3 == i5) {
                i8 = 44100;
            } else {
                if (i3 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + i3, null);
                }
                i8 = OpusUtil.SAMPLE_RATE;
            }
            j = Util.scaleLargeTimestamp(i4, 1000000L, i8);
        } else {
            j = C.TIME_UNSET;
        }
        return new DtsHeader(str, i7, i6, readBits2, j, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(normalizedFrame.readBit() ? 12 : 8) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) {
        int i;
        long j;
        AtomicInteger atomicInteger2;
        int i2;
        int i3;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int i4 = normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE ? 1 : 0;
        int parseUnsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i4 == 0) {
            i = C.RATE_UNSET_INT;
            j = C.TIME_UNSET;
        } else {
            if (!normalizedFrame.readBit()) {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, parseUnsignedVarInt);
            int readBits = normalizedFrame.readBits(2);
            if (readBits == 0) {
                i2 = 512;
            } else if (readBits == 1) {
                i2 = 480;
            } else {
                if (readBits != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + readBits, null);
                }
                i2 = RendererCapabilities.DECODER_SUPPORT_MASK;
            }
            int readBits2 = (normalizedFrame.readBits(3) + 1) * i2;
            int readBits3 = normalizedFrame.readBits(2);
            if (readBits3 == 0) {
                i3 = 32000;
            } else if (readBits3 == 1) {
                i3 = 44100;
            } else {
                if (readBits3 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + readBits3, null);
                }
                i3 = OpusUtil.SAMPLE_RATE;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            i = (1 << normalizedFrame.readBits(2)) * i3;
            j = Util.scaleLargeTimestamp(readBits2, 1000000L, i3);
        }
        int i5 = i;
        long j2 = j;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            i6 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i4 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, i5, i6 + (atomicInteger2.get() != 0 ? parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0) + parseUnsignedVarInt, j2, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && parsableBitArray.readBit(); i3++) {
            i2++;
        }
        if (z) {
            int i4 = 0;
            while (i < i2) {
                i4 += 1 << iArr[i];
                i++;
            }
            i = i4;
        }
        return parsableBitArray.readBits(iArr[i2]) + i;
    }

    public static Format updateFormatWithDtsHdInfo(ExtractorInput extractorInput, int i, Format format) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        if (extractorInput.peekFully(parsableByteArray.getData(), 0, i, true)) {
            extractorInput.resetPeekPosition();
            int peekInt = parsableByteArray.peekInt();
            if (getFrameType(peekInt) == 1) {
                if (parsableByteArray.bytesLeft() >= 10) {
                    byte[] bArr = new byte[10];
                    parsableByteArray.readBytes(bArr, 0, 10);
                    int dtsFrameSize = getDtsFrameSize(bArr);
                    if (dtsFrameSize > 0 && parsableByteArray.limit() >= dtsFrameSize + 4) {
                        parsableByteArray.setPosition(dtsFrameSize);
                        peekInt = parsableByteArray.peekInt();
                    }
                }
            }
            if (getFrameType(peekInt) == 2 && parsableByteArray.bytesLeft() >= 7) {
                int position = parsableByteArray.getPosition();
                byte[] bArr2 = new byte[7];
                parsableByteArray.readBytes(bArr2, 0, 7);
                parsableByteArray.setPosition(position);
                int parseDtsHdHeaderSize = parseDtsHdHeaderSize(bArr2);
                if (parseDtsHdHeaderSize > 0 && parsableByteArray.bytesLeft() >= parseDtsHdHeaderSize) {
                    byte[] bArr3 = new byte[parseDtsHdHeaderSize];
                    parsableByteArray.readBytes(bArr3, 0, parseDtsHdHeaderSize);
                    String str = parseDtsHdHeader(bArr3).mimeType;
                    if (str == null) {
                        str = MimeTypes.AUDIO_DTS_HD;
                    }
                    return Objects.equals(format.sampleMimeType, str) ? format : format.buildUpon().setSampleMimeType(str).build();
                }
            }
        }
        return format;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }
}
