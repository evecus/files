package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class j1 implements Parcelable {
    public final Parcelable I;
    public static final h1 J = new h1();
    public static final Parcelable.Creator<j1> CREATOR = new i1(0);

    public j1(Parcelable parcelable) {
        if (parcelable != null) {
            this.I = parcelable == J ? null : parcelable;
        } else {
            s83.t("superState must not be null");
            throw null;
        }
    }

    public final Parcelable a() {
        return this.I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.I, i);
    }

    public j1() {
        this.I = null;
    }

    public j1(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.I = readParcelable == null ? J : readParcelable;
    }
}
