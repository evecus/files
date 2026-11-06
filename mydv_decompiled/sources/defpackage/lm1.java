package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lm1 extends SQLiteOpenHelper {
    public static final /* synthetic */ int P = 0;
    public final Context I;
    public final uu2 J;
    public final yw0 K;
    public final boolean L;
    public boolean M;
    public final tt3 N;
    public boolean O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm1(Context context, String str, final uu2 uu2Var, final yw0 yw0Var, boolean z) {
        super(context, str, null, yw0Var.b, new DatabaseErrorHandler() { // from class: im1
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = lm1.P;
                sQLiteDatabase.getClass();
                uu2 uu2Var2 = uu2Var;
                hm1 hm1Var = (hm1) uu2Var2.I;
                if (hm1Var == null || !hm1Var.I.equals(sQLiteDatabase)) {
                    hm1Var = new hm1(sQLiteDatabase);
                    uu2Var2.I = hm1Var;
                }
                SQLiteDatabase sQLiteDatabase2 = hm1Var.I;
                yw0.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + hm1Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        yw0.h(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                yw0.h((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                yw0.h(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    hm1Var.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        yw0Var.getClass();
        this.I = context;
        this.J = uu2Var;
        this.K = yw0Var;
        this.L = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.N = new tt3(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        tt3 tt3Var = this.N;
        try {
            tt3Var.a(tt3Var.a);
            super.close();
            this.J.I = null;
            this.O = false;
        } finally {
            tt3Var.b();
        }
    }

    public final hm1 e(boolean z) {
        tt3 tt3Var = this.N;
        try {
            tt3Var.a((this.O || getDatabaseName() == null) ? false : true);
            this.M = false;
            SQLiteDatabase n = n(z);
            if (!this.M) {
                hm1 g = g(n);
                tt3Var.b();
                return g;
            }
            close();
            hm1 e = e(z);
            tt3Var.b();
            return e;
        } catch (Throwable th) {
            tt3Var.b();
            throw th;
        }
    }

    public final hm1 g(SQLiteDatabase sQLiteDatabase) {
        uu2 uu2Var = this.J;
        hm1 hm1Var = (hm1) uu2Var.I;
        if (hm1Var != null && hm1Var.I.equals(sQLiteDatabase)) {
            return hm1Var;
        }
        hm1 hm1Var2 = new hm1(sQLiteDatabase);
        uu2Var.I = hm1Var2;
        return hm1Var2;
    }

    public final SQLiteDatabase n(boolean z) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.O;
        Context context = this.I;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof jm1) {
                    jm1 jm1Var = (jm1) th;
                    int ordinal = jm1Var.I.ordinal();
                    th = jm1Var.J;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        s83.v();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.L) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (jm1 e) {
                    throw e.J;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.M;
        yw0 yw0Var = this.K;
        if (!z && yw0Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            g(sQLiteDatabase);
            yw0Var.getClass();
        } catch (Throwable th) {
            throw new jm1(km1.I, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((w64) this.K.c).d(new oz4(g(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new jm1(km1.J, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.M = true;
        try {
            this.K.m(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jm1(km1.L, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.M) {
            try {
                yw0 yw0Var = this.K;
                hm1 g = g(sQLiteDatabase);
                w64 w64Var = (w64) yw0Var.c;
                w64Var.f(new oz4(g));
                w64Var.g = g;
            } catch (Throwable th) {
                throw new jm1(km1.M, th);
            }
        }
        this.O = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.M = true;
        try {
            this.K.m(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jm1(km1.K, th);
        }
    }
}
