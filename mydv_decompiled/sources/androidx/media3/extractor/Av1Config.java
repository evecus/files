package androidx.media3.extractor;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Av1Config {
    private static final String TAG = "Av1Config";
    public final int bitdepth;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;

    private Av1Config(int i, String str, int i2, int i3, int i4) {
        this.bitdepth = i;
        this.codecs = str;
        this.colorSpace = i2;
        this.colorRange = i3;
        this.colorTransfer = i4;
    }

    private static String buildCodecString(int i, int i2, boolean z, int i3) {
        StringBuilder C = hf1.C("av01.", i, ".");
        C.append(Util.formatInvariant("%02d", Integer.valueOf(i2)));
        C.append(z ? "H" : "M");
        C.append(".");
        C.append(Util.formatInvariant("%02d", Integer.valueOf(i3)));
        return C.toString();
    }

    public static Av1Config parse(byte[] bArr) {
        try {
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            parsableBitArray.skipBit();
            int readBits = parsableBitArray.readBits(7);
            if (readBits != 1) {
                Log.w(TAG, "Unsupported av1C version: " + readBits);
                return null;
            }
            int readBits2 = parsableBitArray.readBits(3);
            int readBits3 = parsableBitArray.readBits(5);
            boolean readBit = parsableBitArray.readBit();
            int i = parsableBitArray.readBit() ? parsableBitArray.readBit() ? 12 : 10 : 8;
            parsableBitArray.skipBits(13);
            String buildCodecString = buildCodecString(readBits2, readBits3, readBit, i);
            if (parsableBitArray.bitsLeft() <= 0) {
                return new Av1Config(i, buildCodecString);
            }
            parsableBitArray.skipBit();
            int readBits4 = parsableBitArray.readBits(4);
            if (readBits4 != 1) {
                Log.i(TAG, "Unsupported obu_type: " + readBits4);
                return new Av1Config(i, buildCodecString);
            }
            if (parsableBitArray.readBit()) {
                Log.i(TAG, "Unsupported obu_extension_flag");
                return new Av1Config(i, buildCodecString);
            }
            boolean readBit2 = parsableBitArray.readBit();
            parsableBitArray.skipBit();
            if (readBit2 && parsableBitArray.readBits(8) > 127) {
                Log.i(TAG, "Excessive obu_size");
                return new Av1Config(i, buildCodecString);
            }
            int readBits5 = parsableBitArray.readBits(3);
            parsableBitArray.skipBit();
            if (parsableBitArray.readBit()) {
                Log.i(TAG, "Unsupported reduced_still_picture_header");
                return new Av1Config(i, buildCodecString);
            }
            if (parsableBitArray.readBit()) {
                Log.i(TAG, "Unsupported timing_info_present_flag");
                return new Av1Config(i, buildCodecString);
            }
            if (parsableBitArray.readBit()) {
                Log.i(TAG, "Unsupported initial_display_delay_present_flag");
                return new Av1Config(i, buildCodecString);
            }
            int readBits6 = parsableBitArray.readBits(5);
            boolean z = false;
            for (int i2 = 0; i2 <= readBits6; i2++) {
                parsableBitArray.skipBits(12);
                if (parsableBitArray.readBits(5) > 7) {
                    parsableBitArray.skipBit();
                }
            }
            int readBits7 = parsableBitArray.readBits(4);
            int readBits8 = parsableBitArray.readBits(4);
            parsableBitArray.skipBits(readBits7 + 1);
            parsableBitArray.skipBits(readBits8 + 1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(7);
            }
            parsableBitArray.skipBits(7);
            boolean readBit3 = parsableBitArray.readBit();
            if (readBit3) {
                parsableBitArray.skipBits(2);
            }
            if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
                parsableBitArray.skipBits(1);
            }
            if (readBit3) {
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(3);
            boolean readBit4 = parsableBitArray.readBit();
            if (readBits5 == 2 && readBit4) {
                parsableBitArray.skipBit();
            }
            if (readBits5 != 1 && parsableBitArray.readBit()) {
                z = true;
            }
            if (!parsableBitArray.readBit()) {
                return new Av1Config(i, buildCodecString);
            }
            int readBits9 = parsableBitArray.readBits(8);
            int readBits10 = parsableBitArray.readBits(8);
            return new Av1Config(i, buildCodecString, ColorInfo.isoColorPrimariesToColorSpace(readBits9), ((z || readBits9 != 1 || readBits10 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) == 1 ? 1 : 2, ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits10));
        } catch (RuntimeException e) {
            throw ParserException.createForMalformedContainer("Error parsing AV1 config", e);
        }
    }

    private Av1Config(int i, String str) {
        this(i, str, -1, -1, -1);
    }
}
