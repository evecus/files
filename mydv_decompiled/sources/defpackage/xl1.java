package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xl1 implements Parcelable {
    public static final Parcelable.Creator<xl1> CREATOR = new l7((byte) 7);
    public final String I;
    public final String J;
    public final boolean K;
    public final int L;
    public final int M;
    public final String N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final Bundle R;
    public final boolean S;
    public final int T;
    public final Bundle U;

    public xl1(Parcel parcel) {
        this.I = parcel.readString();
        this.J = parcel.readString();
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readString();
        this.O = parcel.readInt() != 0;
        this.P = parcel.readInt() != 0;
        this.Q = parcel.readInt() != 0;
        this.R = parcel.readBundle();
        this.S = parcel.readInt() != 0;
        this.U = parcel.readBundle();
        this.T = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.I);
        sb.append(" (");
        sb.append(this.J);
        sb.append(")}:");
        if (this.K) {
            sb.append(" fromLayout");
        }
        int i = this.M;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.N;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.O) {
            sb.append(" retainInstance");
        }
        if (this.P) {
            sb.append(" removing");
        }
        if (this.Q) {
            sb.append(" detached");
        }
        if (this.S) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeBundle(this.R);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeBundle(this.U);
        parcel.writeInt(this.T);
    }
}
