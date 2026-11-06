package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b32 implements Parcelable {
    public static final Parcelable.Creator<b32> CREATOR = new l7((byte) 8);
    public final IntentSender I;
    public final Intent J;
    public final int K;
    public final int L;

    public b32(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.I = intentSender;
        this.J = intent;
        this.K = i;
        this.L = i2;
    }

    public final Intent a() {
        return this.J;
    }

    public final int b() {
        return this.K;
    }

    public final int c() {
        return this.L;
    }

    public final IntentSender d() {
        return this.I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.I, i);
        parcel.writeParcelable(this.J, i);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
    }
}
