package androidx.media3.container;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.sp0;
import defpackage.wy0;
import defpackage.x24;
import defpackage.zx1;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final int VVC_NAL_UNIT_TYPE_DCI = 13;
    public static final int VVC_NAL_UNIT_TYPE_OPI = 12;
    public static final int VVC_NAL_UNIT_TYPE_PREFIX_SEI = 23;
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i, int i2) {
            this.layerIdInVps = i;
            this.viewId = i2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i, int i2, int i3) {
            this.nalUnitType = i;
            this.layerId = i2;
            this.temporalId = i3;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z;
            this.generalProfileIdc = i2;
            this.generalProfileCompatibilityFlags = i3;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i4;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final dy1 profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = dy1.p(list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i, int i2, int i3, int i4, int i5) {
            this.chromaFormatIdc = i;
            this.bitDepthLumaMinus8 = i2;
            this.bitDepthChromaMinus8 = i3;
            this.width = i4;
            this.height = i5;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final dy1 repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = dy1.p(list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.precRefDisplayWidth = i;
            this.precRefViewingDist = i2;
            this.numRefDisplays = i3;
            this.leftViewId = i4;
            this.rightViewId = i5;
            this.exponentRefDisplayWidth = i6;
            this.mantissaRefDisplayWidth = i7;
            this.exponentRefViewingDist = i8;
            this.mantissaRefViewingDist = i9;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int decodedHeight;
        public final int decodedWidth;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i, H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11, int i12, int i13) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i4;
            this.seqParameterSetId = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i10;
            this.colorSpace = i11;
            this.colorRange = i12;
            this.colorTransfer = i13;
            this.decodedWidth = i8;
            this.decodedHeight = i9;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.colorSpace = i;
            this.colorRange = i2;
            this.colorTransfer = i3;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final dy1 videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = dy1.p(list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class H265VpsData {
        public final dy1 layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;
        public final H265RepFormatsAndIndices repFormatsAndIndices;
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, H265RepFormatsAndIndices h265RepFormatsAndIndices, H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            dy1 dy1Var;
            this.nalHeader = h265NalHeader;
            if (list != null) {
                dy1Var = dy1.p(list);
            } else {
                ay1 ay1Var = dy1.J;
                dy1Var = x24.M;
            }
            this.layerInfos = dy1Var;
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i2, boolean z) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i2;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i2;
            this.levelIdc = i3;
            this.seqParameterSetId = i4;
            this.maxNumRefFrames = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i8;
            this.bitDepthChromaMinus8 = i9;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z2;
            this.frameNumLength = i10;
            this.picOrderCountType = i11;
            this.picOrderCntLsbLength = i12;
            this.deltaPicOrderAlwaysZeroFlag = z3;
            this.colorSpace = i13;
            this.colorRange = i14;
            this.colorTransfer = i15;
            this.maxNumReorderFrames = i16;
        }
    }

    private NalUnitUtil() {
    }

    private static int applyConformanceWindowToHeight(int i, int i2, int i3, int i4) {
        return i - ((i3 + i4) * (i2 == 1 ? 2 : 1));
    }

    private static int applyConformanceWindowToWidth(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - ((i3 + i4) * i5);
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(parseH265ProfileTierLevel.generalProfileSpace, parseH265ProfileTierLevel.generalTierFlag, parseH265ProfileTierLevel.generalProfileIdc, parseH265ProfileTierLevel.generalProfileCompatibilityFlags, parseH265ProfileTierLevel.constraintBytes, parseH265ProfileTierLevel.generalLevelIdc);
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= position) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        sp0.z(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    private static dy1 findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        zx1 n = dy1.n();
        int i = 0;
        while (i < bArr.length) {
            int findNalUnit = findNalUnit(bArr, i, bArr.length, zArr);
            if (findNalUnit != bArr.length) {
                n.c(Integer.valueOf(findNalUnit));
            }
            i = findNalUnit + 3;
        }
        return n.f();
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = list.get(i);
            int length = bArr.length;
            if (length > 3) {
                dy1 findNalUnitPositions = findNalUnitPositions(bArr);
                for (int i2 = 0; i2 < findNalUnitPositions.size(); i2++) {
                    if (((Integer) findNalUnitPositions.get(i2)).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, ((Integer) findNalUnitPositions.get(i2)).intValue() + 3, length);
                        H265NalHeader parseH265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (parseH265NalHeader.nalUnitType == 33 && parseH265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    private static String getNalStructureMimeType(Format format) {
        String str;
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) && (str = format.codecs) != null) {
            if (str.startsWith("dva1") || format.codecs.startsWith("dvav")) {
                return MimeTypes.VIDEO_H264;
            }
            if (format.codecs.startsWith("dvh1") || format.codecs.startsWith("dvhe")) {
                return MimeTypes.VIDEO_H265;
            }
        }
        return format.sampleMimeType;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i, int i2, Format format) {
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264)) {
            return isH264NalUnitDependedOn(bArr[i]);
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265)) {
            return isH265NalUnitDependedOn(bArr, i, i2, format);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i, int i2, Format format) {
        H265NalHeader parseH265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2 + i));
        int i3 = parseH265NalHeader.nalUnitType;
        if (i3 == 35) {
            return false;
        }
        return (i3 <= 14 && i3 % 2 == 0 && parseH265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    public static boolean isNalUnitSei(Format format, byte[] bArr, int i) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        if (nalStructureMimeType == null) {
            return false;
        }
        switch (nalStructureMimeType) {
            case "video/hevc":
                if (((bArr[i] & 126) >> 1) == 39) {
                }
                break;
            case "video/avc":
                if ((bArr[i] & 31) == 6) {
                }
                break;
            case "video/vvc":
                if (((bArr[i + 1] & 248) >> 3) == 23) {
                }
                break;
        }
        return false;
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        if (Objects.equals(nalStructureMimeType, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(nalStructureMimeType, MimeTypes.VIDEO_H265) || Objects.equals(nalStructureMimeType, MimeTypes.VIDEO_H266)) ? 2 : 0;
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray r19, boolean r20, int r21, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.readBits(r5)
            boolean r8 = r0.readBit()
            r9 = 5
            int r9 = r0.readBits(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.readBit()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.readBits(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.generalProfileSpace
            boolean r8 = r2.generalTierFlag
            int r9 = r2.generalProfileIdc
            int r11 = r2.generalProfileCompatibilityFlags
            int[] r4 = r2.constraintBytes
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.readBits(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.skipBits(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.skipBits(r6)
        L7b:
            androidx.media3.container.NalUnitUtil$H265ProfileTierLevel r12 = new androidx.media3.container.NalUnitUtil$H265ProfileTierLevel
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray, boolean, int, androidx.media3.container.NalUnitUtil$H265ProfileTierLevel):androidx.media3.container.NalUnitUtil$H265ProfileTierLevel");
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i;
        int i2;
        int i3;
        int readBits = parsableNalUnitBitArray.readBits(16);
        int readBits2 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int readBits3 = parsableNalUnitBitArray.readBits(2);
            if (readBits3 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int readBits4 = parsableNalUnitBitArray.readBits(4);
            i3 = parsableNalUnitBitArray.readBits(4);
            i2 = readBits4;
            i = readBits3;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBits = applyConformanceWindowToWidth(readBits, i, readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2);
            readBits2 = applyConformanceWindowToHeight(readBits2, i, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i, i2, i3, readBits, readBits2);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i2 = readUnsignedExpGolombCodedInt + 1;
        zx1 o = dy1.o(i2);
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i2; i3++) {
            o.c(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i4 = 1;
        if (i2 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i4 < i) {
                iArr[i4] = Math.min(i4, readUnsignedExpGolombCodedInt);
                i4++;
            }
        } else {
            RoundingMode roundingMode = RoundingMode.CEILING;
            int d = wy0.d(i2);
            while (i4 < i) {
                iArr[i4] = parsableNalUnitBitArray.readBits(d);
                i4++;
            }
        }
        return new H265RepFormatsAndIndices(o.f(), iArr);
    }

    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i, int i2) {
        byte b;
        int i3 = i + 2;
        int i4 = i2 - 1;
        while (true) {
            b = bArr[i4];
            if (b != 0 || i4 <= i3) {
                break;
            }
            i4--;
        }
        if (b != 0 && i4 > i3) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i3, i4 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int readBits = parsableNalUnitBitArray.readBits(8);
                int i5 = 0;
                while (readBits == 255) {
                    i5 += 255;
                    readBits = parsableNalUnitBitArray.readBits(8);
                }
                int i6 = i5 + readBits;
                int readBits2 = parsableNalUnitBitArray.readBits(8);
                int i7 = 0;
                while (readBits2 == 255) {
                    i7 += 255;
                    readBits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i8 = i7 + readBits2;
                if (i8 == 0 || !parsableNalUnitBitArray.canReadBits(i8)) {
                    break;
                }
                if (i6 == 176) {
                    int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean readBit = parsableNalUnitBitArray.readBit();
                    int readUnsignedExpGolombCodedInt2 = readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int i9 = -1;
                    int i10 = -1;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 <= readUnsignedExpGolombCodedInt3; i15++) {
                        i9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i11 = parsableNalUnitBitArray.readBits(6);
                        if (i11 == 63) {
                            return null;
                        }
                        i12 = parsableNalUnitBitArray.readBits(i11 == 0 ? Math.max(0, readUnsignedExpGolombCodedInt - 30) : Math.max(0, (i11 + readUnsignedExpGolombCodedInt) - 31));
                        if (readBit) {
                            int readBits3 = parsableNalUnitBitArray.readBits(6);
                            if (readBits3 == 63) {
                                return null;
                            }
                            i13 = readBits3;
                            i14 = parsableNalUnitBitArray.readBits(readBits3 == 0 ? Math.max(0, readUnsignedExpGolombCodedInt2 - 30) : Math.max(0, (readBits3 + readUnsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3 + 1, i9, i10, i11, i12, i13, i14);
                }
                parsableNalUnitBitArray.skipBits(i8 * 8);
            }
        }
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2, H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r20, int r21, int r22, androidx.media3.container.NalUnitUtil.H265NalHeader r23, androidx.media3.container.NalUnitUtil.H265VpsData r24) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265SpsNalUnitPayload(byte[], int, int, androidx.media3.container.NalUnitUtil$H265NalHeader, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.container.NalUnitUtil$H265SpsData");
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(isoColorPrimariesToColorSpace, i, isoTransferCharacteristicsToColorTransfer);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int i2, int[] iArr) {
        if (!parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBit() : true) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        if (readBit || readBit2) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < iArr[i3]; i4++) {
                    boolean readBit3 = readBit ? parsableNalUnitBitArray.readBit() : false;
                    boolean readBit4 = readBit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (readBit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (readBit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int readBits = readBit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i;
        zx1 o = dy1.o(readBits);
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < readBits; i5++) {
            o.c(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (readBit5 && readBits > 1) {
            for (int i6 = 0; i6 < i; i6++) {
                iArr2[i6] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(o.f(), iArr2);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[] iArr;
        int i;
        int i2;
        int[] iArr2;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        x24 x24Var;
        int i6;
        boolean[][] zArr;
        int[] iArr4;
        int i7;
        int i8;
        parsableNalUnitBitArray.skipBits(4);
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        int readBits = parsableNalUnitBitArray.readBits(6);
        int i9 = readBits + 1;
        int readBits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits2, null);
        boolean z = false;
        for (int i10 = parsableNalUnitBitArray.readBit() ? 0 : readBits2; i10 <= readBits2; i10++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int readBits3 = parsableNalUnitBitArray.readBits(6);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(dy1.t(parseH265ProfileTierLevel), new int[1]);
        Object[] objArr = i9 >= 2 && readUnsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = readBit && readBit2;
        int i11 = readBits3 + 1;
        Object[] objArr3 = i11 >= i9;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, readUnsignedExpGolombCodedInt, i11);
        int i12 = 1;
        int[] iArr6 = new int[readUnsignedExpGolombCodedInt];
        int[] iArr7 = new int[readUnsignedExpGolombCodedInt];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i13 = 1; i13 < readUnsignedExpGolombCodedInt; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 <= readBits3; i15++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr5[i13][i14] = i15;
                    iArr7[i13] = i15;
                    i14++;
                }
                iArr6[i13] = i14;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i16 = 0;
            while (i16 < readUnsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i16 == 0 || parsableNalUnitBitArray.readBit()) {
                    z = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z, readBits2);
                i16++;
                z = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, readBits2, parseH265ProfileTierLevel);
        boolean readBit3 = parsableNalUnitBitArray.readBit();
        int i17 = 6;
        boolean[] zArr2 = new boolean[16];
        int i18 = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            zArr2[i19] = readBit4;
            if (readBit4) {
                i18++;
            }
        }
        if (i18 == 0 || !zArr2[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr8 = new int[i18];
        for (int i20 = 0; i20 < i18 - (readBit3 ? 1 : 0); i20++) {
            iArr8[i20] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr9 = new int[i18 + 1];
        if (readBit3) {
            int i21 = 1;
            while (i21 < i18) {
                int[] iArr10 = iArr9;
                for (int i22 = 0; i22 < i21; i22++) {
                    iArr10[i21] = iArr8[i22] + 1 + iArr10[i21];
                }
                i21++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i18] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i9, i18);
        int[] iArr12 = new int[i9];
        iArr12[0] = 0;
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int i23 = 1;
        while (i23 < i9) {
            if (readBit5) {
                i8 = i23;
                iArr12[i8] = parsableNalUnitBitArray.readBits(i17);
            } else {
                i8 = i23;
                iArr12[i8] = i8;
            }
            if (readBit3) {
                for (int i24 = 0; i24 < i18; i24++) {
                    iArr11[i8][i24] = (iArr12[i8] & ((1 << iArr[r33]) - 1)) >> iArr[i24];
                }
            } else {
                int i25 = 0;
                while (i25 < i18) {
                    int i26 = i25;
                    iArr11[i8][i26] = parsableNalUnitBitArray.readBits(iArr8[i25] + 1);
                    i25 = i26 + 1;
                }
            }
            i23 = i8 + 1;
            i17 = 6;
        }
        int[] iArr13 = new int[i11];
        int i27 = 1;
        int i28 = 0;
        while (i28 < i9) {
            iArr13[iArr12[i28]] = -1;
            int[] iArr14 = iArr13;
            int i29 = 0;
            int i30 = 0;
            while (i29 < 16) {
                if (zArr2[i29]) {
                    if (i29 == i12) {
                        iArr14[iArr12[i28]] = iArr11[i28][i30];
                    }
                    i30++;
                }
                i29++;
                i12 = 1;
            }
            if (i28 > 0) {
                int i31 = 0;
                while (true) {
                    if (i31 >= i28) {
                        i27++;
                        break;
                    }
                    int i32 = i31;
                    if (iArr14[iArr12[i28]] == iArr14[iArr12[i31]]) {
                        break;
                    }
                    i31 = i32 + 1;
                }
            }
            i28++;
            iArr13 = iArr14;
            i12 = 1;
        }
        int[] iArr15 = iArr13;
        int readBits4 = parsableNalUnitBitArray.readBits(4);
        if (i27 < 2 || readBits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr16 = new int[i27];
        for (int i33 = 0; i33 < i27; i33++) {
            iArr16[i33] = parsableNalUnitBitArray.readBits(readBits4);
        }
        int[] iArr17 = new int[i11];
        int i34 = 0;
        while (i34 < i9) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i34], readBits3)] = i34;
            i34++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        zx1 n = dy1.n();
        int i35 = 0;
        while (i35 <= readBits3) {
            int i36 = i27;
            int[] iArr20 = iArr7;
            int min = Math.min(iArr15[i35], i36 - 1);
            n.c(new H265LayerInfo(iArr19[i35], min >= 0 ? iArr16[min] : -1));
            i35++;
            i27 = i36;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        x24 f = n.f();
        if (((H265LayerInfo) f.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i37 = 1;
        while (true) {
            if (i37 > readBits3) {
                i = -1;
                i2 = -1;
                break;
            }
            i = -1;
            if (((H265LayerInfo) f.get(i37)).viewId != -1) {
                i2 = i37;
                break;
            }
            i37++;
        }
        if (i2 == i) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        int i38 = 1;
        while (i38 < i9) {
            boolean[][] zArr5 = zArr4;
            for (int i39 = 0; i39 < i38; i39++) {
                boolean[] zArr6 = zArr3[i38];
                boolean[] zArr7 = zArr5[i38];
                boolean readBit6 = parsableNalUnitBitArray.readBit();
                zArr7[i39] = readBit6;
                zArr6[i39] = readBit6;
            }
            i38++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i40 = 1; i40 < i9; i40++) {
            int i41 = 0;
            while (i41 < readBits) {
                int[] iArr22 = iArr12;
                int i42 = 0;
                while (true) {
                    if (i42 < i40) {
                        boolean[] zArr9 = zArr8[i40];
                        if (zArr9[i42] && zArr8[i42][i41]) {
                            zArr9[i41] = true;
                            break;
                        }
                        i42++;
                    }
                }
                i41++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i11];
        for (int i43 = 0; i43 < i9; i43++) {
            int i44 = 0;
            for (int i45 = 0; i45 < i43; i45++) {
                i44 += zArr3[i43][i45] ? 1 : 0;
            }
            iArr24[iArr23[i43]] = i44;
        }
        int i46 = 0;
        for (int i47 = 0; i47 < i9; i47++) {
            if (iArr24[iArr23[i47]] == 0) {
                i46++;
            }
        }
        if (i46 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr25 = new int[i9];
        int[] iArr26 = new int[readUnsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            iArr2 = iArr24;
            int i48 = 0;
            while (i48 < i9) {
                int i49 = i48;
                iArr25[i49] = parsableNalUnitBitArray.readBits(3);
                i48 = i49 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i9, readBits2);
        }
        int i50 = 0;
        while (i50 < readUnsignedExpGolombCodedInt) {
            int i51 = i50;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int i52 = 0;
            for (int i53 = 0; i53 < iArr6[i51]; i53++) {
                i52 = Math.max(i52, iArr27[((H265LayerInfo) f.get(iArr5[i51][i53])).layerIdInVps]);
            }
            iArr26[i51] = i52 + 1;
            i50 = i51 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i54 = 0;
            while (i54 < readBits) {
                int i55 = i54 + 1;
                int i56 = i55;
                while (i56 < i9) {
                    if (zArr11[i56][i54]) {
                        i7 = i54;
                        parsableNalUnitBitArray.skipBits(3);
                    } else {
                        i7 = i54;
                    }
                    i56++;
                    i54 = i7;
                }
                i54 = i55;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        zx1 n2 = dy1.n();
        n2.c(parseH265ProfileTierLevel);
        if (readUnsignedExpGolombCodedInt3 > 1) {
            n2.c(parseH265ProfileTierLevel2);
            for (int i57 = 2; i57 < readUnsignedExpGolombCodedInt3; i57++) {
                parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), readBits2, parseH265ProfileTierLevel2);
                n2.c(parseH265ProfileTierLevel2);
            }
        }
        x24 f2 = n2.f();
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + readUnsignedExpGolombCodedInt;
        if (readUnsignedExpGolombCodedInt4 > readUnsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int readBits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, readUnsignedExpGolombCodedInt4, i11);
        int[] iArr28 = new int[readUnsignedExpGolombCodedInt4];
        int i58 = 0;
        int[] iArr29 = new int[readUnsignedExpGolombCodedInt4];
        int i59 = 0;
        while (i59 < readUnsignedExpGolombCodedInt) {
            iArr28[i59] = i58;
            iArr29[i59] = iArr21[i59];
            if (readBits5 == 0) {
                i6 = i59;
                zArr = zArr12;
                x24Var = f2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i6], i58, iArr6[i6], true);
                iArr4[i6] = iArr6[i6];
            } else {
                x24Var = f2;
                i6 = i59;
                zArr = zArr12;
                iArr4 = iArr28;
                if (readBits5 == 1) {
                    int i60 = iArr21[i6];
                    for (int i61 = 0; i61 < iArr6[i6]; i61++) {
                        zArr[i6][i61] = iArr5[i6][i61] == i60;
                    }
                    iArr4[i6] = 1;
                } else {
                    i58 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i59 = i6 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    f2 = x24Var;
                }
            }
            i58 = 0;
            i59 = i6 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            f2 = x24Var;
        }
        x24 x24Var2 = f2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i11];
        int i62 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i11;
        iArr32[i58] = readUnsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i63 = 1;
        int i64 = 0;
        while (i63 < readUnsignedExpGolombCodedInt4) {
            if (readBits5 == i62) {
                for (int i65 = 0; i65 < iArr6[i63]; i65++) {
                    zArr13[i63][i65] = parsableNalUnitBitArray.readBit();
                    int i66 = iArr30[i63];
                    boolean z2 = zArr13[i63][i65];
                    iArr30[i63] = i66 + (z2 ? 1 : 0);
                    if (z2) {
                        iArr29[i63] = iArr5[i63][i65];
                    }
                }
            }
            if (i64 == 0) {
                i3 = 0;
                if (iArr5[i63][0] == 0 && zArr13[i63][0]) {
                    for (int i67 = 1; i67 < iArr6[i63]; i67++) {
                        if (iArr5[i63][i67] == i2 && zArr13[i63][i2]) {
                            i64 = i63;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i68 = i3;
            while (i68 < iArr6[i63]) {
                if (readUnsignedExpGolombCodedInt3 > 1) {
                    zArr14[i63][i68] = zArr13[i63][i68];
                    i5 = i2;
                    iArr3 = iArr31;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int d = wy0.d(readUnsignedExpGolombCodedInt3);
                    if (!zArr14[i63][i68]) {
                        int i69 = ((H265LayerInfo) f.get(iArr5[i63][i68])).layerIdInVps;
                        i4 = readUnsignedExpGolombCodedInt3;
                        int i70 = i3;
                        while (true) {
                            if (i70 >= i68) {
                                break;
                            }
                            int i71 = i70;
                            if (zArr8[i69][((H265LayerInfo) f.get(iArr5[i63][i71])).layerIdInVps]) {
                                zArr14[i63][i68] = true;
                                break;
                            }
                            i70 = i71 + 1;
                        }
                    } else {
                        i4 = readUnsignedExpGolombCodedInt3;
                    }
                    if (zArr14[i63][i68]) {
                        if (i64 <= 0 || i63 != i64) {
                            parsableNalUnitBitArray.skipBits(d);
                        } else {
                            iArr3[i68] = parsableNalUnitBitArray.readBits(d);
                        }
                    }
                } else {
                    i4 = readUnsignedExpGolombCodedInt3;
                    i5 = i2;
                    iArr3 = iArr31;
                }
                i68++;
                i2 = i5;
                iArr31 = iArr3;
                readUnsignedExpGolombCodedInt3 = i4;
            }
            int i72 = readUnsignedExpGolombCodedInt3;
            int i73 = i2;
            int[] iArr33 = iArr31;
            if (iArr30[i63] == 1 && iArr2[iArr29[i63]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i63++;
            i2 = i73;
            iArr31 = iArr33;
            readUnsignedExpGolombCodedInt3 = i72;
            i62 = 2;
        }
        int[] iArr34 = iArr31;
        if (i64 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices parseH265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i9);
        parsableNalUnitBitArray.skipBits(2);
        for (int i74 = 1; i74 < i9; i74++) {
            if (iArr2[iArr23[i74]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, readUnsignedExpGolombCodedInt4, iArr26, iArr6, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i9, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i9, readUnsignedExpGolombCodedInt, iArr26);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, f, new H265ProfileTierLevelsAndIndices(x24Var2, iArr34), parseH265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):androidx.media3.container.NalUnitUtil$SpsData");
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i2 = 1; i2 < i; i2++) {
            boolean readBit = parsableNalUnitBitArray.readBit();
            int i3 = 0;
            while (i3 < iArr[i2]) {
                if ((i3 <= 0 || !readBit) ? i3 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i4 = 0; i4 < iArr2[i2]; i4++) {
                        if (zArr[i2][i4]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z, int i) {
        ?? r9;
        ?? r1;
        boolean z2;
        boolean readBit;
        if (z) {
            boolean readBit2 = parsableNalUnitBitArray.readBit();
            boolean readBit3 = parsableNalUnitBitArray.readBit();
            if (readBit2 || readBit3) {
                z2 = parsableNalUnitBitArray.readBit();
                if (z2) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (z2) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r1 = readBit3;
                r9 = readBit2;
            } else {
                z2 = false;
                r1 = readBit3;
                r9 = readBit2;
            }
        } else {
            r9 = 0;
            r1 = 0;
            z2 = false;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            if (!readBit4) {
                readBit4 = parsableNalUnitBitArray.readBit();
            }
            if (readBit4) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                readBit = false;
            } else {
                readBit = parsableNalUnitBitArray.readBit();
            }
            int readUnsignedExpGolombCodedInt = !readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i3 = r9 + r1;
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 <= readUnsignedExpGolombCodedInt; i5++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (z2) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < readUnsignedExpGolombCodedInt; i3++) {
            if (i3 == 0 || !parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr3 = new int[readUnsignedExpGolombCodedInt2];
                int i4 = 0;
                while (i4 < readUnsignedExpGolombCodedInt2) {
                    iArr3[i4] = (i4 > 0 ? iArr3[i4 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i4++;
                }
                int[] iArr4 = new int[readUnsignedExpGolombCodedInt3];
                int i5 = 0;
                while (i5 < readUnsignedExpGolombCodedInt3) {
                    iArr4[i5] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1 + (i5 > 0 ? iArr4[i5 - 1] : 0);
                    parsableNalUnitBitArray.skipBit();
                    i5++;
                }
                i = readUnsignedExpGolombCodedInt2;
                iArr = iArr3;
                i2 = readUnsignedExpGolombCodedInt3;
                iArr2 = iArr4;
            } else {
                int i6 = i + i2;
                int readUnsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr5 = new int[i7];
                int[] iArr6 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArr2[i10] + readUnsignedExpGolombCodedInt4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr5[i9] = i11;
                        i9++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 < 0 && zArr[i6]) {
                    iArr5[i9] = readUnsignedExpGolombCodedInt4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + readUnsignedExpGolombCodedInt4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr5[i9] = i13;
                        i9++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + readUnsignedExpGolombCodedInt4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr6[i14] = i16;
                        i14++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 > 0 && zArr[i6]) {
                    iArr6[i14] = readUnsignedExpGolombCodedInt4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArr2[i17] + readUnsignedExpGolombCodedInt4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr6[i14] = i18;
                        i14++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i14);
                iArr = copyOf;
                i = i9;
                i2 = i14;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < readUnsignedExpGolombCodedInt; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, boolean[][] zArr) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
        } else {
            for (int i2 = 1; i2 < i; i2++) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zArr[i2][i3]) {
                        parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i4 = 1; i4 <= readUnsignedExpGolombCodedInt2; i4++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (scratchEscapePositionsLock) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = findNextUnescapeIndex(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i4) {
                            iArr = Arrays.copyOf(iArr, iArr.length * 2);
                            scratchEscapePositions = iArr;
                        }
                        iArr[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = scratchEscapePositions[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    @Deprecated
    public static boolean isNalUnitSei(Format format, byte b) {
        return isNalUnitSei(format, new byte[]{b}, 0);
    }

    @Deprecated
    public static boolean isNalUnitSei(String str, byte b) {
        return (MimeTypes.VIDEO_H264.equals(str) && (b & 31) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b & 126) >> 1) == 39);
    }
}
