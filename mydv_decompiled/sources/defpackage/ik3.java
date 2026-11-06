package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ik3 implements Parcelable.ClassLoaderCreator {
    public static jk3 a(Parcel parcel, ClassLoader classLoader) {
        q8 q8Var;
        if (classLoader == null) {
            classLoader = ik3.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            q8Var = q8.v0;
        } else if (readInt == 1) {
            q8Var = q8.B0;
        } else {
            if (readInt != 2) {
                zy.i(r7.z("Unsupported MutableState policy ", readInt, " was restored"));
                return null;
            }
            q8Var = q8.y0;
        }
        return new jk3(readValue, q8Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new jk3[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
