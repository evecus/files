package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nv4 implements Parcelable {
    public static final Parcelable.Creator<nv4> CREATOR = new l7((byte) 12);
    public int I;
    public int J;
    public int[] K;
    public boolean L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.I + ", mGapDir=" + this.J + ", mHasUnwantedGapAfter=" + this.L + ", mGapPerSpan=" + Arrays.toString(this.K) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.L ? 1 : 0);
        int[] iArr = this.K;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.K);
        }
    }
}
