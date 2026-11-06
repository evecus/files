package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l7 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new m7(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                im imVar = new im(parcel);
                imVar.I = parcel.readByte() != 0;
                return imVar;
            case 2:
                return new nt(parcel);
            case 3:
                return new ot(parcel);
            case 4:
                return new ds0(parcel.readInt());
            case 5:
                sl1 sl1Var = new sl1();
                sl1Var.I = parcel.readString();
                sl1Var.J = parcel.readInt();
                return sl1Var;
            case 6:
                ul1 ul1Var = new ul1();
                ul1Var.M = null;
                ul1Var.N = new ArrayList();
                ul1Var.O = new ArrayList();
                ul1Var.I = parcel.createStringArrayList();
                ul1Var.J = parcel.createStringArrayList();
                ul1Var.K = (nt[]) parcel.createTypedArray(nt.CREATOR);
                ul1Var.L = parcel.readInt();
                ul1Var.M = parcel.readString();
                ul1Var.N = parcel.createStringArrayList();
                ul1Var.O = parcel.createTypedArrayList(ot.CREATOR);
                ul1Var.P = parcel.createTypedArrayList(sl1.CREATOR);
                return ul1Var;
            case 7:
                return new xl1(parcel);
            case 8:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new b32((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                yj2 yj2Var = new yj2();
                yj2Var.I = parcel.readInt();
                yj2Var.J = parcel.readInt();
                yj2Var.K = parcel.readInt() == 1;
                return yj2Var;
            case 10:
                k93 k93Var = new k93(parcel);
                k93Var.I = parcel.readInt();
                return k93Var;
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                nv4 nv4Var = new nv4();
                nv4Var.I = parcel.readInt();
                nv4Var.J = parcel.readInt();
                nv4Var.L = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    nv4Var.K = iArr;
                    parcel.readIntArray(iArr);
                }
                return nv4Var;
            default:
                ov4 ov4Var = new ov4();
                ov4Var.I = parcel.readInt();
                ov4Var.J = parcel.readInt();
                int readInt2 = parcel.readInt();
                ov4Var.K = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    ov4Var.L = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                ov4Var.M = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    ov4Var.N = iArr3;
                    parcel.readIntArray(iArr3);
                }
                ov4Var.P = parcel.readInt() == 1;
                ov4Var.Q = parcel.readInt() == 1;
                ov4Var.R = parcel.readInt() == 1;
                ov4Var.O = parcel.readArrayList(nv4.class.getClassLoader());
                return ov4Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m7[i];
            case 1:
                return new im[i];
            case 2:
                return new nt[i];
            case 3:
                return new ot[i];
            case 4:
                return new ds0[i];
            case 5:
                return new sl1[i];
            case 6:
                return new ul1[i];
            case 7:
                return new xl1[i];
            case 8:
                return new b32[i];
            case 9:
                return new yj2[i];
            case 10:
                return new k93[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new nv4[i];
            default:
                return new ov4[i];
        }
    }
}
