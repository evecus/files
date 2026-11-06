package androidx.media3.container;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import defpackage.g62;
import defpackage.hf1;
import defpackage.sp0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        validateData(str, bArr, i2);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("track types = ");
        g62.e().a(sb, list);
        return sb.toString();
    }

    private static void validateData(String str, byte[] bArr, int i) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                sp0.o(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                sp0.o(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                sp0.o(z);
                break;
            case "auxiliary.tracks.map":
                sp0.o(i == 0);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        sp0.A(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(this.value[i + 2] & 255));
        }
        return arrayList;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final Format getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.value) + hf1.n(527, 31, this.key)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public String toString() {
        String formattedValueForAuxiliaryTracksMap;
        int i = this.typeIndicator;
        if (i == 0) {
            if (this.key.equals(KEY_AUXILIARY_TRACKS_MAP)) {
                formattedValueForAuxiliaryTracksMap = getFormattedValueForAuxiliaryTracksMap(getAuxiliaryTrackTypesFromMap());
            }
            formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
        } else if (i == 1) {
            formattedValueForAuxiliaryTracksMap = Util.fromUtf8Bytes(this.value);
        } else if (i == 23) {
            byte[] bArr = this.value;
            sp0.n("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
            formattedValueForAuxiliaryTracksMap = String.valueOf(Float.intBitsToFloat(sp0.M(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            byte[] bArr2 = this.value;
            sp0.n("array too small: %s < %s", bArr2.length, 4, bArr2.length >= 4);
            formattedValueForAuxiliaryTracksMap = String.valueOf(sp0.M(bArr2[0], bArr2[1], bArr2[2], bArr2[3]));
        } else if (i != 75) {
            if (i == 78) {
                formattedValueForAuxiliaryTracksMap = String.valueOf(new ParsableByteArray(this.value).readUnsignedLongToLong());
            }
            formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
        } else {
            formattedValueForAuxiliaryTracksMap = String.valueOf(this.value[0] & 255);
        }
        return "mdta: key=" + this.key + ", value=" + formattedValueForAuxiliaryTracksMap;
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
    }
}
