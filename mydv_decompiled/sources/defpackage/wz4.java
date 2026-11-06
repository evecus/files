package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wz4 extends yz4 {
    public int[] L;
    public long[] M;
    public double[] N;
    public String[] O;
    public byte[][] P;
    public Cursor Q;

    public static void t(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            lq2.l0(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final String H(int i) {
        e();
        Cursor y = y();
        t(y, i);
        String string = y.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.q84
    public final boolean T() {
        e();
        n();
        Cursor cursor = this.Q;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        zy.i("Required value was null.");
        return false;
    }

    @Override // defpackage.q84
    public final void b(int i, long j) {
        e();
        g(1, i);
        this.L[i] = 1;
        this.M[i] = j;
    }

    @Override // defpackage.q84
    public final void c(int i, byte[] bArr) {
        e();
        g(4, i);
        this.L[i] = 4;
        this.P[i] = bArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.K) {
            e();
            this.L = new int[0];
            this.M = new long[0];
            this.N = new double[0];
            this.O = new String[0];
            this.P = new byte[0][];
            reset();
        }
        this.K = true;
    }

    @Override // defpackage.q84
    public final void d(int i) {
        e();
        g(5, i);
        this.L[i] = 5;
    }

    public final void g(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.L;
        if (iArr.length < i3) {
            this.L = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.M;
            if (jArr.length < i3) {
                this.M = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.N;
            if (dArr.length < i3) {
                this.N = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.O;
            if (strArr.length < i3) {
                this.O = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.P;
        if (bArr.length < i3) {
            this.P = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.q84
    public final byte[] getBlob(int i) {
        e();
        Cursor y = y();
        t(y, i);
        byte[] blob = y.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.q84
    public final int getColumnCount() {
        e();
        n();
        Cursor cursor = this.Q;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.q84
    public final String getColumnName(int i) {
        e();
        n();
        Cursor cursor = this.Q;
        if (cursor == null) {
            zy.i("Required value was null.");
            return null;
        }
        t(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.q84
    public final long getLong(int i) {
        e();
        Cursor y = y();
        t(y, i);
        return y.getLong(i);
    }

    @Override // defpackage.q84
    public final boolean isNull(int i) {
        e();
        Cursor y = y();
        t(y, i);
        return y.isNull(i);
    }

    public final void n() {
        if (this.Q == null) {
            g73 g73Var = new g73((Object) this, (byte) 11);
            hm1 hm1Var = this.I;
            hm1Var.getClass();
            final fm1 fm1Var = new fm1(g73Var, (byte) 0);
            Cursor rawQueryWithFactory = hm1Var.I.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: gm1
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) fm1.this.c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((wz4) g73Var.J).J, hm1.K, null);
            rawQueryWithFactory.getClass();
            this.Q = rawQueryWithFactory;
        }
    }

    @Override // defpackage.q84
    public final void reset() {
        e();
        Cursor cursor = this.Q;
        if (cursor != null) {
            cursor.close();
        }
        this.Q = null;
    }

    @Override // defpackage.q84
    public final void v(int i, String str) {
        str.getClass();
        e();
        g(3, i);
        this.L[i] = 3;
        this.O[i] = str;
    }

    public final Cursor y() {
        Cursor cursor = this.Q;
        if (cursor != null) {
            return cursor;
        }
        lq2.l0(21, "no row");
        throw null;
    }
}
