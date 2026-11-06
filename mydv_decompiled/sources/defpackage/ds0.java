package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ds0 implements Parcelable {
    public static final Parcelable.Creator<ds0> CREATOR = new l7((byte) 4);
    public final int I;

    public ds0(int i) {
        this.I = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds0) && this.I == ((ds0) obj).I;
    }

    public final int hashCode() {
        return this.I;
    }

    public final String toString() {
        return r7.z("DefaultLazyKey(index=", this.I, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.I);
    }
}
