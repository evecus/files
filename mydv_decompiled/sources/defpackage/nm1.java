package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class nm1 implements vz4 {
    public final SQLiteProgram I;

    public nm1(SQLiteProgram sQLiteProgram) {
        this.I = sQLiteProgram;
    }

    @Override // defpackage.vz4
    public final void b(int i, long j) {
        this.I.bindLong(i, j);
    }

    @Override // defpackage.vz4
    public final void c(int i, byte[] bArr) {
        this.I.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // defpackage.vz4
    public final void d(int i) {
        this.I.bindNull(i);
    }

    @Override // defpackage.vz4
    public final void j(int i, String str) {
        str.getClass();
        this.I.bindString(i, str);
    }

    @Override // defpackage.vz4
    public final void l(int i, double d) {
        this.I.bindDouble(i, d);
    }
}
