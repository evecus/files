package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    private HevcConfig(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, String str, NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.maxSubLayers = i2;
        this.width = i3;
        this.height = i4;
        this.decodedWidth = i5;
        this.decodedHeight = i6;
        this.bitdepthLuma = i7;
        this.bitdepthChroma = i8;
        this.colorSpace = i9;
        this.colorRange = i10;
        this.colorTransfer = i11;
        this.stereoMode = i12;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i13;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) {
        return parseImpl(parsableByteArray, false, null);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z, NalUnitUtil.H265VpsData h265VpsData) {
        boolean z2;
        int i;
        NalUnitUtil.H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo;
        int i2;
        try {
            if (z) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= readUnsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort; i6++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i5 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
                i4++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i5];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f = 1.0f;
            String str = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < readUnsignedByte2) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i21 = i3;
                NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                while (i21 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z3 = z2;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i22 = readUnsignedByte;
                    System.arraycopy(bArr2, i3, bArr, i20, bArr2.length);
                    int length = i20 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 32 && i21 == 0) {
                        h265VpsData3 = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + readUnsignedShort4);
                        i = readUnsignedByte2;
                    } else {
                        if (readUnsignedByte3 == 33 && i21 == 0) {
                            NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4, h265VpsData3);
                            i7 = parseH265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i8 = parseH265SpsNalUnit.width;
                            int i23 = parseH265SpsNalUnit.height;
                            int i24 = parseH265SpsNalUnit.decodedWidth;
                            i = readUnsignedByte2;
                            int i25 = parseH265SpsNalUnit.decodedHeight;
                            i12 = parseH265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i13 = parseH265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i26 = parseH265SpsNalUnit.colorSpace;
                            int i27 = parseH265SpsNalUnit.colorRange;
                            int i28 = parseH265SpsNalUnit.colorTransfer;
                            float f2 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                            int i29 = parseH265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = parseH265SpsNalUnit.profileTierLevel;
                            if (h265ProfileTierLevel != null) {
                                i2 = i29;
                                str = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                            } else {
                                i2 = i29;
                            }
                            f = f2;
                            i18 = i2;
                            i15 = i27;
                            i16 = i28;
                            i11 = i25;
                            i14 = i26;
                            i10 = i24;
                            i9 = i23;
                        } else {
                            i = readUnsignedByte2;
                            if (readUnsignedByte3 == 39 && i21 == 0 && (parseH265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + readUnsignedShort4)) != null && h265VpsData3 != null) {
                                i3 = 0;
                                i17 = parseH265Sei3dRefDisplayInfo.leftViewId == ((NalUnitUtil.H265LayerInfo) h265VpsData3.layerInfos.get(0)).viewId ? 4 : 5;
                            }
                        }
                        i3 = 0;
                    }
                    i20 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i21++;
                    z2 = z3;
                    readUnsignedByte = i22;
                    readUnsignedByte2 = i;
                }
                i19++;
                h265VpsData2 = h265VpsData3;
            }
            return new HevcConfig(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), readUnsignedByte + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, f, i18, str, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing".concat(z ? "L-HEVC config" : "HEVC config"), e);
        }
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }
}
