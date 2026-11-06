package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.BundleCollectionUtil;
import defpackage.mm0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j, byte[] bArr, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i, i2);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        ArrayList parcelableArrayList = readBundle.getParcelableArrayList(BUNDLE_FIELD_CUES);
        parcelableArrayList.getClass();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new mm0((byte) 1), parcelableArrayList), j, readBundle.getLong("d"));
    }
}
