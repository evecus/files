package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ot implements Parcelable {
    public static final Parcelable.Creator<ot> CREATOR = new l7((byte) 3);
    public final ArrayList I;
    public final ArrayList J;

    public ot(Parcel parcel) {
        this.I = parcel.createStringArrayList();
        this.J = parcel.createTypedArrayList(nt.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.I);
        parcel.writeTypedList(this.J);
    }
}
