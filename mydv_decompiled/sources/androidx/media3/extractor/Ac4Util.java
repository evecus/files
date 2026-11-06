package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    private static final int CHANNEL_MODE_22_2 = 15;
    private static final int CHANNEL_MODE_3_0 = 2;
    private static final int CHANNEL_MODE_5_0 = 3;
    private static final int CHANNEL_MODE_5_1 = 4;
    private static final int CHANNEL_MODE_7_0_322 = 9;
    private static final int CHANNEL_MODE_7_0_34 = 5;
    private static final int CHANNEL_MODE_7_0_4 = 11;
    private static final int CHANNEL_MODE_7_0_52 = 7;
    private static final int CHANNEL_MODE_7_1_322 = 10;
    private static final int CHANNEL_MODE_7_1_34 = 6;
    private static final int CHANNEL_MODE_7_1_4 = 12;
    private static final int CHANNEL_MODE_7_1_52 = 8;
    private static final int CHANNEL_MODE_9_0_4 = 13;
    private static final int CHANNEL_MODE_9_1_4 = 14;
    private static final int CHANNEL_MODE_MONO = 0;
    private static final int CHANNEL_MODE_STEREO = 1;
    private static final int CHANNEL_MODE_UNKNOWN = -1;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;
    private static final String TAG = "Ac4Util";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Ac4Presentation {
        public int channelMode;
        public boolean hasBackChannels;
        public boolean isChannelCoded;
        public int level;
        public int numOfUmxObjects;
        public int topChannelPairs;
        public int version;

        private Ac4Presentation() {
            this.isChannelCoded = true;
            this.channelMode = -1;
            this.numOfUmxObjects = -1;
            this.hasBackChannels = true;
            this.topChannelPairs = 2;
            this.version = 1;
            this.level = 0;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i, int i2, int i3, int i4, int i5) {
            this.bitstreamVersion = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
        }
    }

    private Ac4Util() {
    }

    private static String createCodecsString(int i, int i2, int i3) {
        return Util.formatInvariant("ac-4.%02d.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void getAc4SampleHeader(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i >> 16) & 255);
        data[5] = (byte) ((i >> 8) & 255);
        data[6] = (byte) (i & 255);
    }

    private static int getAdjustedChannelCount(int i, boolean z, int i2) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i);
        if (i != 11 && i != 12 && i != 13 && i != 14) {
            return channelCountFromChannelMode;
        }
        if (!z) {
            channelCountFromChannelMode -= 2;
        }
        return i2 != 0 ? i2 != 1 ? channelCountFromChannelMode : channelCountFromChannelMode - 2 : channelCountFromChannelMode - 4;
    }

    private static int getChannelCountFromChannelMode(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0119, code lost:
    
        if (r5 == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.Format parseAc4AnnexEFormat(androidx.media3.common.util.ParsableByteArray r20, java.lang.String r21, java.lang.String r22, androidx.media3.common.DrmInitData r23) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Ac4Util.parseAc4AnnexEFormat(androidx.media3.common.util.ParsableByteArray, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):androidx.media3.common.Format");
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.Ac4Util.SyncFrameInfo parseAc4SyncframeInfo(androidx.media3.common.util.ParsableBitArray r11) {
        /*
            r0 = 16
            int r1 = r11.readBits(r0)
            int r0 = r11.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.readBits(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.readBits(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = readVariableBits(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.readBits(r1)
            boolean r4 = r11.readBit()
            if (r4 == 0) goto L45
            int r4 = r11.readBits(r2)
            if (r4 <= 0) goto L45
            r11.skipBits(r0)
        L45:
            boolean r4 = r11.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.readBits(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = androidx.media3.extractor.Ac4Util.SAMPLE_COUNT
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = androidx.media3.extractor.Ac4Util.SAMPLE_COUNT
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            androidx.media3.extractor.Ac4Util$SyncFrameInfo r4 = new androidx.media3.extractor.Ac4Util$SyncFrameInfo
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Ac4Util.parseAc4SyncframeInfo(androidx.media3.common.util.ParsableBitArray):androidx.media3.extractor.Ac4Util$SyncFrameInfo");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static void parseDsiSubstream(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) {
        int readBits = parsableBitArray.readBits(5);
        parsableBitArray.skipBits(2);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (readBits >= 7 && readBits <= 10) {
            parsableBitArray.skipBit();
        }
        if (parsableBitArray.readBit()) {
            int readBits2 = parsableBitArray.readBits(3);
            if (ac4Presentation.channelMode == -1 && readBits >= 0 && readBits <= 15 && (readBits2 == 0 || readBits2 == 1)) {
                ac4Presentation.channelMode = readBits;
            }
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void parseDsiSubstreamGroup(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) {
        parsableBitArray.skipBits(2);
        boolean readBit = parsableBitArray.readBit();
        int readBits = parsableBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            parsableBitArray.skipBits(2);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
            }
            if (readBit) {
                parsableBitArray.skipBits(24);
            } else {
                if (parsableBitArray.readBit()) {
                    if (!parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(4);
                    }
                    ac4Presentation.numOfUmxObjects = parsableBitArray.readBits(6) + 1;
                }
                parsableBitArray.skipBits(4);
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(3);
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i) {
        int i2 = 0;
        while (true) {
            int readBits = parsableBitArray.readBits(i) + i2;
            if (!parsableBitArray.readBit()) {
                return readBits;
            }
            i2 = (readBits + 1) << i;
        }
    }

    private static boolean skipDsiBitrate(ParsableBitArray parsableBitArray) {
        if (parsableBitArray.bitsLeft() < 66) {
            return false;
        }
        parsableBitArray.skipBits(66);
        return true;
    }

    private static void skipDsiLanguage(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(6);
        if (readBits < 2 || readBits > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(readBits)));
        }
        parsableBitArray.skipBits(readBits * 8);
    }
}
