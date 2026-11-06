package androidx.media3.common.util;

import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WavUtil {
    public static final int DATA_FOURCC = 1684108385;
    public static final int DS64_FOURCC = 1685272116;
    public static final int FACT_FOURCC = 1717658484;
    public static final int FMT_FOURCC = 1718449184;
    public static final int RF64_FOURCC = 1380333108;
    public static final int RIFF_FOURCC = 1380533830;
    public static final int TYPE_ALAW = 6;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_IMA_ADPCM = 17;
    public static final int TYPE_MLAW = 7;
    public static final int TYPE_PCM = 1;
    public static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
    public static final int WAVE_FOURCC = 1463899717;

    private WavUtil() {
    }

    public static int getPcmEncodingForType(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return Util.getFloatPcmEncoding(i2);
            }
            if (i != 65534) {
                return 0;
            }
        }
        return Util.getPcmEncoding(i2);
    }

    public static int getTypeForPcmEncoding(int i) {
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i != 4) {
            if (i == 21 || i == 22) {
                return 1;
            }
            if (i != 1879048192) {
                s83.d();
                return 0;
            }
        }
        return 3;
    }

    public static boolean isChannelMaskValid(int i, int i2) {
        if ((i >> 18) == 0) {
            return i == 0 || Integer.bitCount(i) == i2;
        }
        return false;
    }

    public static int mapToAudioFormatChannelMask(int i) {
        if (i == 0) {
            return -1;
        }
        return i << 2;
    }
}
