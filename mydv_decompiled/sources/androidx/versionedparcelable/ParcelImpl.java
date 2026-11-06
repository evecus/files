package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l7;
import defpackage.vi5;
import defpackage.wi5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new l7((byte) 11);
    public final wi5 I;

    public ParcelImpl(Parcel parcel) {
        this.I = new vi5(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new vi5(parcel).i(this.I);
    }
}
