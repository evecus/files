package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qz2 {
    public final boolean a;
    public final int b;
    public final Serializable c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public qz2(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.c = jArr;
        this.d = remoteViewsArr;
        this.a = false;
        this.b = 1;
        if (jArr.length != remoteViewsArr.length) {
            s83.t("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = o70.P0(arrayList).size();
        if (size <= 1) {
            return;
        }
        s83.h(r7.z("View type count is set to 1, but the collection contains ", size, " different layout ids"));
        throw null;
    }

    public static void a(oz2[][][] oz2VarArr, int i, oz2 oz2Var) {
        oz2[] oz2VarArr2 = oz2VarArr[i + oz2Var.d][oz2Var.c];
        h13 h13Var = oz2Var.a;
        int ordinal = h13Var.ordinal();
        char c = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c = 1;
            } else if (ordinal == 4) {
                c = 3;
            } else {
                if (ordinal != 6) {
                    zl1.l(h13Var, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        oz2 oz2Var2 = oz2VarArr2[c];
        if (oz2Var2 == null || oz2Var2.f > oz2Var.f) {
            oz2VarArr2[c] = oz2Var;
        }
    }

    public static boolean c(h13 h13Var, char c) {
        int ordinal = h13Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c < '`' ? x91.a[c] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return x91.b(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static si5 e(int i) {
        int F = pt1.F(i);
        return F != 0 ? F != 1 ? si5.a(40) : si5.a(26) : si5.a(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.si5 r13, defpackage.oz2[][][] r14, int r15, defpackage.oz2 r16) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz2.b(si5, oz2[][][], int, oz2):void");
    }

    public x81 d(si5 si5Var) {
        int i;
        String str = (String) this.c;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((d61) this.d).a;
        oz2[][][] oz2VarArr = (oz2[][][]) Array.newInstance((Class<?>) oz2.class, length + 1, charsetEncoderArr.length, 4);
        b(si5Var, oz2VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    oz2 oz2Var = oz2VarArr[i2][i3][i4];
                    if (oz2Var != null && i2 < length) {
                        b(si5Var, oz2VarArr, i2, oz2Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                oz2 oz2Var2 = oz2VarArr[length][i8][i9];
                if (oz2Var2 != null && (i = oz2Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new x81(this, si5Var, oz2VarArr[length][i5][i7]);
        }
        throw new os4(r7.C("Internal error: failed to encode \"", str, "\""));
    }

    public qz2(String str, Charset charset, boolean z, int i) {
        this.c = str;
        this.a = z;
        this.d = new d61(str, charset);
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public qz2(Parcel parcel) {
        int readInt = parcel.readInt();
        ?? r1 = new long[readInt];
        this.c = r1;
        parcel.readLongArray(r1);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                s83.w(remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.d = remoteViewsArr;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt();
    }
}
