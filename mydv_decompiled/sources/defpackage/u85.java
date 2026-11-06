package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u85 extends j1 {
    public static final Parcelable.Creator<u85> CREATOR = new i1((byte) 2);
    public int K;
    public boolean L;

    public u85(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.K = parcel.readInt();
        this.L = parcel.readInt() != 0;
    }

    @Override // defpackage.j1, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
