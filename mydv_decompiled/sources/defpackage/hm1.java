package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hm1 implements Closeable {
    public static final String[] J = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] K = new String[0];
    public static final uc2 L;
    public static final uc2 M;
    public final SQLiteDatabase I;

    static {
        u7 u7Var = new u7((byte) 23);
        dh2 dh2Var = dh2.J;
        L = ut0.K(dh2Var, u7Var);
        M = ut0.K(dh2Var, new u7((byte) 24));
    }

    public hm1(SQLiteDatabase sQLiteDatabase) {
        this.I = sQLiteDatabase;
    }

    public final void A(Object[] objArr) {
        this.I.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean E() {
        return this.I.inTransaction();
    }

    public final void F() {
        this.I.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    public final void e() {
        this.I.beginTransaction();
    }

    public final void g() {
        this.I.beginTransactionNonExclusive();
    }

    public final om1 n(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.I.compileStatement(str);
        compileStatement.getClass();
        return new om1(compileStatement);
    }

    public final void t() {
        this.I.endTransaction();
    }

    public final void y(String str) {
        this.I.execSQL(str);
    }
}
