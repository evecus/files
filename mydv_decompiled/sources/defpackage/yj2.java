package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yj2 implements Parcelable {
    public static final Parcelable.Creator<yj2> CREATOR = new l7((byte) 9);
    public int I;
    public int J;
    public boolean K;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }
}
