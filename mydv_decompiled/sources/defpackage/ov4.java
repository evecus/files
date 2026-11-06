package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ov4 implements Parcelable {
    public static final Parcelable.Creator<ov4> CREATOR = new l7((byte) 13);
    public int I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int[] N;
    public ArrayList O;
    public boolean P;
    public boolean Q;
    public boolean R;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        if (this.K > 0) {
            parcel.writeIntArray(this.L);
        }
        parcel.writeInt(this.M);
        if (this.M > 0) {
            parcel.writeIntArray(this.N);
        }
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeList(this.O);
    }
}
