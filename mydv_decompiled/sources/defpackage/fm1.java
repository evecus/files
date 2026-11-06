package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fm1 implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ fm1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                nm1 nm1Var = new nm1(sQLiteQuery);
                wz4 wz4Var = (wz4) ((g73) obj5).J;
                int length = wz4Var.L.length;
                for (int i = 1; i < length; i++) {
                    int i2 = wz4Var.L[i];
                    if (i2 == 1) {
                        nm1Var.b(i, wz4Var.M[i]);
                    } else if (i2 == 2) {
                        nm1Var.l(i, wz4Var.N[i]);
                    } else if (i2 == 3) {
                        String str2 = wz4Var.O[i];
                        str2.getClass();
                        nm1Var.j(i, str2);
                    } else if (i2 == 4) {
                        byte[] bArr = wz4Var.P[i];
                        bArr.getClass();
                        nm1Var.c(i, bArr);
                    } else if (i2 == 5) {
                        nm1Var.d(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                in1 in1Var = (in1) obj5;
                zd2 zd2Var = (zd2) obj;
                ((Integer) obj2).intValue();
                fe0 fe0Var = (fe0) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).g(zd2Var) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 131) != 130)) {
                    in1Var.invoke(zd2Var, go1Var, Integer.valueOf(intValue & 14));
                } else {
                    go1Var.W();
                }
                return wd5.a;
        }
    }
}
