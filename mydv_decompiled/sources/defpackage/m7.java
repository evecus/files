package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m7 implements Parcelable {
    public static final Parcelable.Creator<m7> CREATOR = new l7((byte) 0);
    public final int I;
    public final Intent J;

    public m7(Intent intent, int i) {
        this.I = i;
        this.J = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + d4.G(this.I) + ", data=" + this.J + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.I);
        Intent intent = this.J;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
