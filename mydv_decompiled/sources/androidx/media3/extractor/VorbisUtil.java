package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import defpackage.dy1;
import defpackage.r7;
import defpackage.yx1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";
    private static final yx1 VORBIS_MAPPING_3 = new yx1(new int[]{0, 2, 1}, 3);
    private static final yx1 VORBIS_MAPPING_5 = new yx1(new int[]{0, 2, 1, 3, 4}, 5);
    private static final yx1 VORBIS_MAPPING_6 = new yx1(new int[]{0, 2, 1, 5, 3, 4}, 6);
    private static final yx1 VORBIS_MAPPING_7 = yx1.c(2, 1, 6, 5, 3, 4);
    private static final yx1 VORBIS_MAPPING_8 = yx1.c(2, 1, 7, 5, 6, 3, 4);

    private VorbisUtil() {
    }

    public static yx1 getVorbisToAndroidChannelLayoutMapping(int i) {
        if (i == 3) {
            return VORBIS_MAPPING_3;
        }
        if (i == 5) {
            return VORBIS_MAPPING_5;
        }
        if (i == 6) {
            return VORBIS_MAPPING_6;
        }
        if (i == 7) {
            return VORBIS_MAPPING_7;
        }
        if (i != 8) {
            return null;
        }
        return VORBIS_MAPPING_8;
    }

    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] splitAtFirst = Util.splitAtFirst(str, "=");
            if (splitAtFirst.length != 2) {
                r7.M("Failed to parse Vorbis comment: ", str, TAG);
            } else if (splitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(splitAtFirst[1], 0))));
                } catch (RuntimeException e) {
                    Log.w(TAG, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(splitAtFirst[0], splitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static dy1 parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + i;
        int i2 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i2 += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte() + i2;
        byte[] bArr2 = new byte[readUnsignedByte];
        int position = parsableByteArray.getPosition();
        System.arraycopy(bArr, position, bArr2, 0, readUnsignedByte);
        int i3 = position + readUnsignedByte + readUnsignedByte2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return dy1.u(bArr2, bArr3);
    }
}
