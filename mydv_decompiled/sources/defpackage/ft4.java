package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ft4 implements Parcelable.ClassLoaderCreator {
    public static gt4 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ft4.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        ap3 ap3Var = new ap3((Object) parcel, (Object) classLoader, (byte) 6);
        if (readInt == 0) {
            return new gt4();
        }
        rm3 h = xr4.J.h();
        for (int i = 0; i < readInt; i++) {
            h.add(ap3Var.invoke(Integer.valueOf(i)));
        }
        return new gt4(h.e());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new gt4[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
