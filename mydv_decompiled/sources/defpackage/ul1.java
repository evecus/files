package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ul1 implements Parcelable {
    public static final Parcelable.Creator<ul1> CREATOR = new l7((byte) 6);
    public ArrayList I;
    public ArrayList J;
    public nt[] K;
    public int L;
    public String M = null;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public ArrayList P;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.I);
        parcel.writeStringList(this.J);
        parcel.writeTypedArray(this.K, i);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeStringList(this.N);
        parcel.writeTypedList(this.O);
        parcel.writeTypedList(this.P);
    }
}
