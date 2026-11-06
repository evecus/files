package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nt implements Parcelable {
    public static final Parcelable.Creator<nt> CREATOR = new l7((byte) 2);
    public final int[] I;
    public final ArrayList J;
    public final int[] K;
    public final int[] L;
    public final int M;
    public final String N;
    public final int O;
    public final int P;
    public final CharSequence Q;
    public final int R;
    public final CharSequence S;
    public final ArrayList T;
    public final ArrayList U;
    public final boolean V;

    public nt(mt mtVar) {
        int size = mtVar.a.size();
        this.I = new int[size * 6];
        if (!mtVar.g) {
            zy.i("Not on back stack");
            throw null;
        }
        this.J = new ArrayList(size);
        this.K = new int[size];
        this.L = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            yl1 yl1Var = (yl1) mtVar.a.get(i2);
            this.I[i] = yl1Var.a;
            this.J.add(null);
            int[] iArr = this.I;
            iArr[i + 1] = yl1Var.b ? 1 : 0;
            iArr[i + 2] = yl1Var.c;
            iArr[i + 3] = yl1Var.d;
            int i3 = i + 5;
            iArr[i + 4] = yl1Var.e;
            i += 6;
            iArr[i3] = yl1Var.f;
            this.K[i2] = yl1Var.g.ordinal();
            this.L[i2] = yl1Var.h.ordinal();
        }
        this.M = mtVar.f;
        this.N = mtVar.h;
        this.O = mtVar.q;
        this.P = mtVar.i;
        this.Q = mtVar.j;
        this.R = mtVar.k;
        this.S = mtVar.l;
        this.T = mtVar.m;
        this.U = mtVar.n;
        this.V = mtVar.o;
    }

    public final mt a(tl1 tl1Var) {
        ArrayList arrayList;
        mt mtVar = new mt(tl1Var);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.I;
            int length = iArr.length;
            arrayList = mtVar.a;
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            yl1 yl1Var = new yl1();
            int i4 = i2 + 1;
            yl1Var.a = iArr[i2];
            if (tl1.h(2)) {
                Log.v("FragmentManager", "Instantiate " + mtVar + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            yl1Var.g = ki2.values()[this.K[i3]];
            yl1Var.h = ki2.values()[this.L[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            yl1Var.b = z;
            int i6 = iArr[i5];
            yl1Var.c = i6;
            int i7 = iArr[i2 + 3];
            yl1Var.d = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            yl1Var.e = i9;
            i2 += 6;
            int i10 = iArr[i8];
            yl1Var.f = i10;
            mtVar.b = i6;
            mtVar.c = i7;
            mtVar.d = i9;
            mtVar.e = i10;
            arrayList.add(yl1Var);
            yl1Var.c = mtVar.b;
            yl1Var.d = mtVar.c;
            yl1Var.e = mtVar.d;
            yl1Var.f = mtVar.e;
            i3++;
        }
        mtVar.f = this.M;
        mtVar.h = this.N;
        mtVar.g = true;
        mtVar.i = this.P;
        mtVar.j = this.Q;
        mtVar.k = this.R;
        mtVar.l = this.S;
        mtVar.m = this.T;
        mtVar.n = this.U;
        mtVar.o = this.V;
        mtVar.q = this.O;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i >= arrayList2.size()) {
                mtVar.a(1);
                return mtVar;
            }
            String str = (String) arrayList2.get(i);
            if (str != null) {
                yl1 yl1Var2 = (yl1) arrayList.get(i);
                r7.K(((HashMap) tl1Var.c.K).get(str));
                yl1Var2.getClass();
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.I);
        parcel.writeStringList(this.J);
        parcel.writeIntArray(this.K);
        parcel.writeIntArray(this.L);
        parcel.writeInt(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        TextUtils.writeToParcel(this.Q, parcel, 0);
        parcel.writeInt(this.R);
        TextUtils.writeToParcel(this.S, parcel, 0);
        parcel.writeStringList(this.T);
        parcel.writeStringList(this.U);
        parcel.writeInt(this.V ? 1 : 0);
    }

    public nt(Parcel parcel) {
        this.I = parcel.createIntArray();
        this.J = parcel.createStringArrayList();
        this.K = parcel.createIntArray();
        this.L = parcel.createIntArray();
        this.M = parcel.readInt();
        this.N = parcel.readString();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.Q = (CharSequence) creator.createFromParcel(parcel);
        this.R = parcel.readInt();
        this.S = (CharSequence) creator.createFromParcel(parcel);
        this.T = parcel.createStringArrayList();
        this.U = parcel.createStringArrayList();
        this.V = parcel.readInt() != 0;
    }
}
