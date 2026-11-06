package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g24 extends j1 {
    public static final Parcelable.Creator<g24> CREATOR = new i1((byte) 1);
    public Parcelable K;

    public g24(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.K = parcel.readParcelable(classLoader == null ? e.class.getClassLoader() : classLoader);
    }

    public final void b(g24 g24Var) {
        this.K = g24Var.K;
    }

    @Override // defpackage.j1, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.K, 0);
    }

    public g24(Parcelable parcelable) {
        super(parcelable);
    }
}
