package androidx.media3.common.util;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ts.TsExtractor;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.kb4;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CodecSpecificDataUtil {
    private static final String CODEC_ID_AC4 = "ac-4";
    private static final String CODEC_ID_APV1 = "apv1";
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_H263 = "s263";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_IAMF = "iamf";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String CODEC_ID_VVC1 = "vvc1";
    private static final String CODEC_ID_VVI1 = "vvi1";
    private static final int EXTENDED_PAR = 15;
    private static final int OBU_IA_CODEC_CONFIG = 0;
    private static final int OBU_IA_SEQUENCE_HEADER = 31;
    private static final int RECTANGULAR = 0;
    private static final String TAG = "CodecSpecificDataUtil";
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final int VP9_CHROMA_SUBSAMPLING_420 = 0;
    private static final int VP9_CHROMA_SUBSAMPLING_422 = 2;
    private static final int VP9_CHROMA_SUBSAMPLING_444 = 3;
    private static final int VP9_COLOR_SPACE_RGB = 7;
    private static final int VP9_FRAME_MARKER = 2;
    private static final int VP9_FRAME_TYPE_KEY_FRAME = 0;
    private static final int VP9_MAX_UNCOMPRESSED_HEADER_SIZE_BYTES = 128;
    private static final int VP9_SYNC_CODE = 4817730;
    private static final int VVC_HIGH_TIER_LEVEL_4_0 = 64;
    private static final int VVC_HIGH_TIER_LEVEL_4_1 = 256;
    private static final int VVC_HIGH_TIER_LEVEL_5_0 = 1024;
    private static final int VVC_HIGH_TIER_LEVEL_5_1 = 4096;
    private static final int VVC_HIGH_TIER_LEVEL_5_2 = 16384;
    private static final int VVC_HIGH_TIER_LEVEL_6_0 = 65536;
    private static final int VVC_HIGH_TIER_LEVEL_6_1 = 262144;
    private static final int VVC_HIGH_TIER_LEVEL_6_2 = 1048576;
    private static final int VVC_HIGH_TIER_LEVEL_6_3 = 4194304;
    private static final int VVC_MAIN_TIER_LEVEL_1_0 = 1;
    private static final int VVC_MAIN_TIER_LEVEL_2_0 = 2;
    private static final int VVC_MAIN_TIER_LEVEL_2_1 = 4;
    private static final int VVC_MAIN_TIER_LEVEL_3_0 = 8;
    private static final int VVC_MAIN_TIER_LEVEL_3_1 = 16;
    private static final int VVC_MAIN_TIER_LEVEL_4_0 = 32;
    private static final int VVC_MAIN_TIER_LEVEL_4_1 = 128;
    private static final int VVC_MAIN_TIER_LEVEL_5_0 = 512;
    private static final int VVC_MAIN_TIER_LEVEL_5_1 = 2048;
    private static final int VVC_MAIN_TIER_LEVEL_5_2 = 8192;
    private static final int VVC_MAIN_TIER_LEVEL_6_0 = 32768;
    private static final int VVC_MAIN_TIER_LEVEL_6_1 = 131072;
    private static final int VVC_MAIN_TIER_LEVEL_6_2 = 524288;
    private static final int VVC_MAIN_TIER_LEVEL_6_3 = 2097152;
    private static final int VVC_PROFILE_MAIN_10 = 2;
    private static final int VVC_PROFILE_MAIN_10_HDR10 = 4096;
    private static final int VVC_PROFILE_MAIN_10_STILL = 4;
    private static final int VVC_PROFILE_MAIN_8 = 1;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final byte[] expectedHagcPayloadPrefix = {-75, 0, -112, 0, 1};

    private CodecSpecificDataUtil() {
    }

    private static int ac4BitstreamAndPresentationVersionsToProfileConst(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return TsExtractor.TS_STREAM_TYPE_AIT;
            }
            return -1;
        }
        if (i == 1) {
            if (i2 == 0) {
                return 513;
            }
            return i2 == 1 ? 514 : -1;
        }
        if (i != 2) {
            return -1;
        }
        if (i2 == 1) {
            return AnalyticsListener.EVENT_DRM_KEYS_REMOVED;
        }
        if (i2 == 2) {
            return AnalyticsListener.EVENT_PLAYER_RELEASED;
        }
        return -1;
    }

    private static int ac4LevelNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int apvLevelAndBandNumberToConst(int i, int i2) {
        switch (i) {
            case 30:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 90:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 120:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 123:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 150:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 180:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 183:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 210:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            case 213:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                r7.L("Unrecognized APV band: ", i2, TAG);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                r7.L("Unrecognized APV level index: ", i, TAG);
                break;
        }
        return -1;
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return VVC_HIGH_TIER_LEVEL_6_1;
            case 19:
                return VVC_MAIN_TIER_LEVEL_6_2;
            case 20:
                return 1048576;
            case 21:
                return VVC_MAIN_TIER_LEVEL_6_3;
            case 22:
                return VVC_HIGH_TIER_LEVEL_6_3;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildApvCodecString(byte[] bArr) {
        sp0.m(bArr.length, "Invalid APV CSD length: %s", bArr.length >= 17);
        byte b = bArr[0];
        sp0.m(b, "Invalid APV CSD version: %s", b == 1);
        return Util.formatInvariant("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(kb4.i0(bArr[5])), Integer.valueOf(kb4.i0(bArr[6])), Integer.valueOf(kb4.i0(bArr[7])));
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildDolbyVisionCodecString(int i, int i2) {
        return i > 9 ? Util.formatInvariant("dvh1.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : i > 8 ? Util.formatInvariant("dvav.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : Util.formatInvariant("dvhe.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static byte[] buildDolbyVisionInitializationData(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = new byte[24];
        if (i == 8) {
            i3 = 4;
            i4 = 0;
        } else if (i == 9) {
            i3 = 2;
            i4 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        byte b = (byte) ((i & 127) << 1);
        bArr[2] = b;
        bArr[2] = (byte) ((b | ((i2 >> 5) & 1)) & 255);
        byte b2 = (byte) ((i2 & 31) << 3);
        bArr[3] = b2;
        byte b3 = (byte) (b2 | 4);
        bArr[3] = b3;
        byte b4 = b3;
        bArr[3] = b4;
        bArr[3] = (byte) (b4 | 1);
        byte b5 = (byte) (i3 << 4);
        bArr[4] = b5;
        bArr[4] = (byte) (b5 | (i4 << 2));
        return bArr;
    }

    public static String buildH263CodecString(int i, int i2) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String buildIamfCodecString(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        String str = null;
        String str2 = null;
        while (parsableByteArray.bytesLeft() > 0 && (str == null || str2 == null)) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int i = readUnsignedByte >> 3;
            boolean z = (readUnsignedByte & 2) != 0;
            boolean z2 = (readUnsignedByte & 1) != 0;
            int readUnsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
            if (i > 4 && i < 24 && z) {
                parsableByteArray.skipLeb128();
                parsableByteArray.skipLeb128();
            }
            if (z2) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedLeb128ToInt());
            }
            int position = parsableByteArray.getPosition() + readUnsignedLeb128ToInt;
            if (i == 31) {
                parsableByteArray.skipBytes(4);
                str = Util.formatInvariant("iamf.%03X.%03X", Integer.valueOf(parsableByteArray.readUnsignedByte()), Integer.valueOf(parsableByteArray.readUnsignedByte()));
            } else if (i == 0) {
                parsableByteArray.skipLeb128();
                str2 = parsableByteArray.readString(4);
                if (str2.equals(CODEC_ID_MP4A)) {
                    parsableByteArray.skipLeb128();
                    parsableByteArray.skipBytes(2);
                    ParsableBitArray parsableBitArray = new ParsableBitArray();
                    parsableBitArray.reset(parsableByteArray);
                    int readBits = parsableBitArray.readBits(5);
                    if (readBits == 31) {
                        readBits = parsableBitArray.readBits(6) + 32;
                    }
                    str2 = str2 + ".40." + readBits;
                }
            }
            parsableByteArray.setPosition(position);
        }
        if (str == null || str2 == null) {
            return null;
        }
        return r7.C(str, ".", str2);
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] buildVp9CodecPrivateFromUncompressedHeader(java.nio.ByteBuffer r8) {
        /*
            int r0 = r8.remaining()
            r1 = 128(0x80, float:1.8E-43)
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = new byte[r0]
            r2 = 0
            r8.get(r1, r2, r0)
            androidx.media3.common.util.ParsableBitArray r0 = new androidx.media3.common.util.ParsableBitArray
            r0.<init>(r1)
            int r8 = r8.remaining()
            r1 = 5
            r3 = 1
            if (r8 < r1) goto L1f
            r8 = r3
            goto L20
        L1f:
            r8 = r2
        L20:
            defpackage.sp0.z(r8)
            r8 = 2
            int r1 = r0.readBits(r8)
            r4 = 0
            if (r1 == r8) goto L2c
            return r4
        L2c:
            int r1 = r0.readBits(r3)
            int r5 = r0.readBits(r3)
            int r5 = r5 << r3
            r1 = r1 | r5
            r5 = 3
            if (r1 != r5) goto L46
            int r5 = r0.bitsLeft()
            if (r5 < r3) goto L45
            boolean r5 = r0.readBit()
            if (r5 == 0) goto L46
        L45:
            return r4
        L46:
            boolean r5 = r0.readBit()
            if (r5 == 0) goto L4d
            return r4
        L4d:
            int r5 = r0.readBits(r3)
            boolean r6 = r0.readBit()
            boolean r7 = r0.readBit()
            if (r5 != 0) goto L5d
            r5 = r3
            goto L5e
        L5d:
            r5 = r2
        L5e:
            if (r5 != 0) goto L75
            if (r6 != 0) goto L67
            int r6 = r0.readBits(r3)
            goto L68
        L67:
            r6 = r2
        L68:
            if (r7 != 0) goto L6d
            r0.skipBits(r8)
        L6d:
            if (r6 == 0) goto L75
            if (r1 <= 0) goto L73
            r5 = r3
            goto L76
        L73:
            r5 = r2
            goto L76
        L75:
            r3 = r5
        L76:
            if (r3 != 0) goto L79
            return r4
        L79:
            r8 = 24
            int r8 = r0.readBits(r8)
            r3 = 4817730(0x498342, float:6.751078E-39)
            if (r8 == r3) goto L85
            return r4
        L85:
            if (r5 == 0) goto L9f
            android.util.Pair r8 = getVp9BitdepthChromaSubSampling(r0, r1)
            if (r8 != 0) goto L8e
            return r4
        L8e:
            java.lang.Object r0 = r8.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto La2
        L9f:
            r0 = 8
            r8 = r2
        La2:
            byte r1 = (byte) r1
            byte r0 = (byte) r0
            byte r8 = (byte) r8
            dy1 r8 = buildVp9CodecPrivateInitializationData(r1, r2, r0, r8)
            java.lang.Object r8 = r8.get(r2)
            byte[] r8 = (byte[]) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.buildVp9CodecPrivateFromUncompressedHeader(java.nio.ByteBuffer):byte[]");
    }

    public static dy1 buildVp9CodecPrivateInitializationData(byte b, byte b2, byte b3, byte b4) {
        return dy1.t(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static int calculateMediaCodecDolbyVisionLevel(int i, int i2, float f) {
        int max = Math.max(i, i2);
        sp0.z(max <= 7680);
        float f2 = i * i2 * f;
        if (max <= 1280) {
            return f2 <= 2.21184E7f ? 1 : 2;
        }
        if (max <= 1920 && f2 <= 4.97664E7f) {
            return 4;
        }
        if (max <= 2560 && f2 <= 6.2208E7f) {
            return 8;
        }
        if (max > 3840) {
            if (max <= 7680) {
                return f2 <= 9.95328E8f ? 1024 : 2048;
            }
            return -1;
        }
        if (f2 <= 1.24416E8f) {
            return 16;
        }
        if (f2 <= 1.990656E8f) {
            return 32;
        }
        if (f2 <= 2.48832E8f) {
            return 64;
        }
        if (f2 <= 3.981312E8f) {
            return 128;
        }
        return f2 <= 4.97664E8f ? 256 : 512;
    }

    public static int dolbyVisionConstantToLevelNumber(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                switch (i) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        s83.t(hf1.u(i, "Unknown Dolby Vision level: "));
                        return 0;
                }
            }
        }
        return i2;
    }

    public static int dolbyVisionConstantToProfileNumber(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        if (i == 1024) {
            return 10;
        }
        s83.t(hf1.u(i, "Unknown Dolby Vision profile: "));
        return 0;
    }

    private static Integer dolbyVisionStringToLevel(String str) {
        str.getClass();
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int findNalStartCode(byte[] bArr, int i) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i <= length) {
            if (isNalStartCode(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static MediaCodecProfileAndLevel getAacCodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 3) {
            r7.M("Ignoring malformed MP4A codec string: ", str, TAG);
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16)))) {
                int mp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]));
                if (mp4aAudioObjectTypeToProfile != -1) {
                    return new MediaCodecProfileAndLevel(mp4aAudioObjectTypeToProfile, 0);
                }
                Log.w(TAG, "Unrecognized MP4A profile: " + mp4aAudioObjectTypeToProfile);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed MP4A codec string: ", str, TAG);
        }
        return null;
    }

    private static MediaCodecProfileAndLevel getAc4CodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 4) {
            r7.M("Ignoring malformed AC-4 codec string: ", str, TAG);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int parseInt3 = Integer.parseInt(strArr[3]);
            int ac4BitstreamAndPresentationVersionsToProfileConst = ac4BitstreamAndPresentationVersionsToProfileConst(parseInt, parseInt2);
            if (ac4BitstreamAndPresentationVersionsToProfileConst != -1) {
                int ac4LevelNumberToConst = ac4LevelNumberToConst(parseInt3);
                if (ac4LevelNumberToConst != -1) {
                    return new MediaCodecProfileAndLevel(ac4BitstreamAndPresentationVersionsToProfileConst, ac4LevelNumberToConst);
                }
                r7.L("Unknown AC-4 level: ", parseInt3, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            Log.w(TAG, "Unknown AC-4 profile: " + parseInt + "." + parseInt2);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed AC-4 codec string: ", str, TAG);
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getApvProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            r7.M("Ignoring malformed APV codec string: ", str, TAG);
            return null;
        }
        int i = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1].substring(4));
            int parseInt2 = Integer.parseInt(strArr[2].substring(4));
            int parseInt3 = Integer.parseInt(strArr[3].substring(4));
            if (parseInt != 33) {
                if (parseInt != 44) {
                    r7.L("Unrecognized APV profile: ", parseInt, TAG);
                    return MediaCodecProfileAndLevel.UNSUPPORTABLE;
                }
                i = 8192;
            }
            int apvLevelAndBandNumberToConst = apvLevelAndBandNumberToConst(parseInt2, parseInt3);
            return apvLevelAndBandNumberToConst == -1 ? MediaCodecProfileAndLevel.UNSUPPORTABLE : new MediaCodecProfileAndLevel(i, apvLevelAndBandNumberToConst);
        } catch (NumberFormatException e) {
            Log.w(TAG, "Ignoring malformed APV codec string: " + str, e);
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        if (strArr.length < 4) {
            r7.M("Ignoring malformed AV1 codec string: ", str, TAG);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                r7.L("Unknown AV1 profile: ", parseInt, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                r7.L("Unknown AV1 bit depth: ", parseInt3, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int i2 = parseInt3 != 8 ? (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i = colorInfo.colorTransfer) == 7 || i == 6)) ? 2 : 4096 : 1;
            int av1LevelNumberToConst = av1LevelNumberToConst(parseInt2);
            if (av1LevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(i2, av1LevelNumberToConst);
            }
            r7.L("Unknown AV1 level: ", parseInt2, TAG);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed AV1 codec string: ", str, TAG);
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getAvcProfileAndLevel(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            r7.M("Ignoring malformed AVC codec string: ", str, TAG);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            }
            int avcProfileNumberToConst = avcProfileNumberToConst(i);
            if (avcProfileNumberToConst == -1) {
                r7.L("Unknown AVC profile: ", i, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int avcLevelNumberToConst = avcLevelNumberToConst(parseInt);
            if (avcLevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(avcProfileNumberToConst, avcLevelNumberToConst);
            }
            r7.L("Unknown AVC level: ", parseInt, TAG);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed AVC codec string: ", str, TAG);
            return null;
        }
    }

    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        MediaCodecProfileAndLevel mediaCodecProfileAndLevel = getMediaCodecProfileAndLevel(format);
        if (mediaCodecProfileAndLevel == null || !mediaCodecProfileAndLevel.isSupportableByMediaCodec()) {
            return null;
        }
        return new Pair<>(Integer.valueOf(mediaCodecProfileAndLevel.getProfile()), Integer.valueOf(mediaCodecProfileAndLevel.getLevel()));
    }

    public static String getDolbyVisionBaseLayerMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (!Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int intValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (intValue == 16 || intValue == 32 || intValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (intValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        if (intValue != 1024) {
            return null;
        }
        return MimeTypes.VIDEO_AV1;
    }

    private static MediaCodecProfileAndLevel getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            r7.M("Ignoring malformed Dolby Vision codec string: ", str, TAG);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            r7.M("Ignoring malformed Dolby Vision codec string: ", str, TAG);
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Integer dolbyVisionStringToProfile = dolbyVisionStringToProfile(group);
        if (dolbyVisionStringToProfile == null) {
            Log.w(TAG, "Unknown Dolby Vision profile string: ".concat(group));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        }
        String str2 = strArr[2];
        Integer dolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (dolbyVisionStringToLevel != null) {
            return new MediaCodecProfileAndLevel(dolbyVisionStringToProfile.intValue(), dolbyVisionStringToLevel.intValue());
        }
        r7.M("Unknown Dolby Vision level string: ", str2, TAG);
        return null;
    }

    private static MediaCodecProfileAndLevel getH263ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            r7.M("Ignoring malformed H263 codec string: ", str, TAG);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int h263ProfileNumberToConst = h263ProfileNumberToConst(parseInt);
            if (h263ProfileNumberToConst == -1) {
                r7.L("Unknown H263 profile: ", parseInt, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int h263LevelNumberToConst = h263LevelNumberToConst(parseInt2);
            if (h263LevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(h263ProfileNumberToConst, h263LevelNumberToConst);
            }
            r7.L("Unknown H263 level: ", parseInt2, TAG);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed H263 codec string: ", str, TAG);
            return null;
        }
    }

    public static MediaCodecProfileAndLevel getHevcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 4) {
            r7.M("Ignoring malformed HEVC codec string: ", str, TAG);
            return null;
        }
        int i = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            r7.M("Ignoring malformed HEVC codec string: ", str, TAG);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                r7.M("Unknown HEVC profile string: ", group, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            i = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer hevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (hevcCodecStringToProfileLevel != null) {
            return new MediaCodecProfileAndLevel(i, hevcCodecStringToProfileLevel.intValue());
        }
        r7.M("Unknown HEVC level string: ", str2, TAG);
        return MediaCodecProfileAndLevel.UNSUPPORTABLE;
    }

    private static MediaCodecProfileAndLevel getIamfCodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            r7.M("Ignoring malformed IAMF codec string: ", str, TAG);
            return null;
        }
        try {
            int iamfProfileNumberToConst = iamfProfileNumberToConst(strArr[3], Integer.parseInt(strArr[1]));
            return iamfProfileNumberToConst == -1 ? MediaCodecProfileAndLevel.UNSUPPORTABLE : new MediaCodecProfileAndLevel(iamfProfileNumberToConst, 0);
        } catch (NumberFormatException e) {
            Log.w(TAG, "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
    
        if (r3.equals(androidx.media3.common.util.CodecSpecificDataUtil.CODEC_ID_AC4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.util.CodecSpecificDataUtil.MediaCodecProfileAndLevel getMediaCodecProfileAndLevel(androidx.media3.common.Format r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.getMediaCodecProfileAndLevel(androidx.media3.common.Format):androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel");
    }

    public static byte[] getOpusInitializationData(Format format) {
        sp0.p(!format.initializationData.isEmpty(), "csd-0 must be present for Opus.");
        int i = 0;
        byte[] bArr = format.initializationData.get(0);
        sp0.o(bArr.length >= 8);
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int length = bArr.length;
        String readString = parsableByteArray.readString(8);
        if (readString.equals("AOPUSHDR")) {
            sp0.o(bArr.length >= 24);
            long readLittleEndianLong = parsableByteArray.readLittleEndianLong();
            sp0.o(16 + readLittleEndianLong <= ((long) bArr.length));
            length = (int) readLittleEndianLong;
            i = 16;
        } else {
            sp0.o(readString.equals("OpusHead"));
        }
        return Arrays.copyOfRange(bArr, i, length + i);
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i2++;
        }
        sp0.p(z, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i2 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        sp0.p(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        sp0.o(parsableBitArray.readBit());
        int readBits = parsableBitArray.readBits(16);
        sp0.o(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            sp0.o(readBits > 0);
            for (int i4 = readBits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            parsableBitArray.skipBits(i);
        }
        sp0.o(parsableBitArray.readBit());
        int readBits2 = parsableBitArray.readBits(13);
        sp0.o(parsableBitArray.readBit());
        int readBits3 = parsableBitArray.readBits(13);
        sp0.o(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(readBits2), Integer.valueOf(readBits3));
    }

    public static ByteBuffer getVorbisInitializationData(Format format) {
        sp0.p(format.initializationData.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] xiphLaceEnc = xiphLaceEnc(length);
        byte[] xiphLaceEnc2 = xiphLaceEnc(23);
        ByteBuffer allocate = ByteBuffer.allocate(xiphLaceEnc.length + 1 + xiphLaceEnc2.length + length + 23 + length2);
        allocate.put((byte) 2);
        allocate.put(xiphLaceEnc);
        allocate.put(xiphLaceEnc2);
        allocate.put(bArr);
        allocate.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
        allocate.put(bArr2);
        allocate.flip();
        return allocate;
    }

    private static Pair<Integer, Integer> getVp9BitdepthChromaSubSampling(ParsableBitArray parsableBitArray, int i) {
        int i2 = 2;
        int i3 = i >= 2 ? parsableBitArray.readBit() ? 12 : 10 : 8;
        int i4 = 3;
        if (parsableBitArray.readBits(3) != 7) {
            parsableBitArray.skipBits(1);
            if (i == 1 || i == 3) {
                int readBits = parsableBitArray.readBits(1);
                int readBits2 = parsableBitArray.readBits(1);
                if (readBits == 1 && readBits2 == 1) {
                    return null;
                }
                if (readBits != 1 || readBits2 != 0) {
                    if (readBits != 0 || readBits2 != 0) {
                        return null;
                    }
                    i2 = 3;
                }
                i4 = i2;
            } else {
                i4 = 0;
            }
        }
        return Pair.create(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    private static MediaCodecProfileAndLevel getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            r7.M("Ignoring malformed VP9 codec string: ", str, TAG);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int vp9ProfileNumberToConst = vp9ProfileNumberToConst(parseInt);
            if (vp9ProfileNumberToConst == -1) {
                r7.L("Unknown VP9 profile: ", parseInt, TAG);
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int vp9LevelNumberToConst = vp9LevelNumberToConst(parseInt2);
            if (vp9LevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(vp9ProfileNumberToConst, vp9LevelNumberToConst);
            }
            r7.L("Unknown VP9 level: ", parseInt2, TAG);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed VP9 codec string: ", str, TAG);
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getVvcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 3) {
            r7.M("Ignoring malformed VVC codec string: ", str, TAG);
            return null;
        }
        int i = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            if (parseInt == 1) {
                if (colorInfo != null && colorInfo.colorTransfer == 6) {
                    i = 4096;
                } else if (colorInfo == null || colorInfo.lumaBitdepth != 8) {
                    i = 2;
                }
            } else {
                if (parseInt != 65) {
                    Log.w(TAG, "Unknown VVC profile IDC: " + strArr[1]);
                    return MediaCodecProfileAndLevel.UNSUPPORTABLE;
                }
                i = 4;
            }
            String str2 = strArr[2];
            Integer vvcCodecStringToProfileLevel = vvcCodecStringToProfileLevel(str2);
            if (vvcCodecStringToProfileLevel != null) {
                return new MediaCodecProfileAndLevel(i, vvcCodecStringToProfileLevel.intValue());
            }
            r7.M("Unknown VVC level string: ", str2, TAG);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            r7.M("Ignoring malformed VVC codec string: ", str, TAG);
            return null;
        }
    }

    public static int h263ConstToLevelNumber(int i) {
        if (i == 1) {
            return 10;
        }
        if (i == 2) {
            return 20;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 8) {
            return 40;
        }
        if (i == 16) {
            return 45;
        }
        if (i == 32) {
            return 50;
        }
        if (i != 64) {
            return i != 128 ? -1 : 70;
        }
        return 60;
    }

    public static int h263ConstToProfileNumber(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i != 128) {
            return i != 256 ? -1 : 8;
        }
        return 7;
    }

    private static int h263LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 20) {
            return 2;
        }
        if (i == 30) {
            return 4;
        }
        if (i == 40) {
            return 8;
        }
        if (i == 45) {
            return 16;
        }
        if (i == 50) {
            return 32;
        }
        if (i != 60) {
            return i != 70 ? -1 : 128;
        }
        return 64;
    }

    private static int h263ProfileNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            default:
                return -1;
        }
    }

    private static Integer hevcCodecStringToProfileLevel(String str) {
        str.getClass();
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_2);
            case "H180":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_3);
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_1);
            case "L180":
                return 1048576;
            case "L183":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_3);
            case "L186":
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int iamfProfileNumberToConst(String str, int i) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case 2464863:
                if (str.equals("Opus")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3114792:
                if (str.equals("fLaC")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3238865:
                if (str.equals("ipcm")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str.equals(CODEC_ID_MP4A)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            r7.L("Unrecognized IAMF Opus profile: ", i, TAG);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            r7.L("Unrecognized IAMF FLAC profile: ", i, TAG);
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            r7.L("Unrecognized IAMF PCM profile: ", i, TAG);
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            r7.L("Unrecognized IAMF AAC profile: ", i, TAG);
                            break;
                        }
                    }
                }
                break;
            default:
                Log.w(TAG, "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str));
                break;
        }
        return -1;
    }

    public static boolean isHagcMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < expectedHagcPayloadPrefix.length) {
            return false;
        }
        int position = byteBuffer.position();
        int i = 0;
        while (true) {
            byte[] bArr = expectedHagcPayloadPrefix;
            if (i >= bArr.length) {
                return true;
            }
            if (byteBuffer.get(position + i) != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean isHagcTrack(Format format) {
        if (!Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_ITUT_T35)) {
            return false;
        }
        for (byte[] bArr : format.initializationData) {
            if (isHagcMetadata(bArr, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNalStartCode(byte[] bArr, int i) {
        if (bArr.length - i <= NAL_START_CODE.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int[] parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(5);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(9);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return new int[]{parsableByteArray.readUnsignedIntToInt(), readUnsignedByte2, readUnsignedByte};
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = findNalStartCode(bArr, i + NAL_START_CODE.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Integer vvcCodecStringToProfileLevel(String str) {
        str.getClass();
        switch (str) {
            case "H64":
                return 64;
            case "H67":
                return 256;
            case "H80":
                return 1024;
            case "H83":
                return 4096;
            case "H86":
                return 16384;
            case "H96":
                return 65536;
            case "L16":
                return 1;
            case "L32":
                return 2;
            case "L35":
                return 4;
            case "L48":
                return 8;
            case "L51":
                return 16;
            case "L64":
                return 32;
            case "L67":
                return 128;
            case "L80":
                return 512;
            case "L83":
                return 2048;
            case "L86":
                return 8192;
            case "L96":
                return 32768;
            case "H112":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_1);
            case "H128":
                return 1048576;
            case "H144":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_3);
            case "L112":
                return 131072;
            case "L128":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_2);
            case "L144":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_3);
            default:
                return null;
        }
    }

    private static byte[] xiphLaceEnc(int i) {
        int i2 = i / 255;
        byte[] bArr = new byte[i2 + 1];
        Arrays.fill(bArr, (byte) -1);
        bArr[i2] = (byte) (i % 255);
        return bArr;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaCodecProfileAndLevel {
        public static final MediaCodecProfileAndLevel UNSUPPORTABLE = new MediaCodecProfileAndLevel(0, 0, false);
        private final boolean isSupportableByMediaCodec;
        private final int level;
        private final int profile;

        private MediaCodecProfileAndLevel(int i, int i2, boolean z) {
            this.isSupportableByMediaCodec = z;
            this.profile = i;
            this.level = i2;
        }

        public int getLevel() {
            sp0.z(this.isSupportableByMediaCodec);
            return this.level;
        }

        public int getProfile() {
            sp0.z(this.isSupportableByMediaCodec);
            return this.profile;
        }

        public boolean isSupportableByMediaCodec() {
            return this.isSupportableByMediaCodec;
        }

        public MediaCodecProfileAndLevel(int i, int i2) {
            this(i, i2, true);
        }
    }

    public static boolean isHagcMetadata(byte[] bArr, int i) {
        if (i < expectedHagcPayloadPrefix.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = expectedHagcPayloadPrefix;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }
}
