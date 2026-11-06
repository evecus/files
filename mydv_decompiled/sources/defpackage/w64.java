package defpackage;

import androidx.media3.common.C;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w64 {
    public boolean a;
    public boolean b;
    public final op0 c;
    public final b74 d;
    public final List e;
    public final zf0 f;
    public hm1 g;

    public w64(op0 op0Var, b74 b74Var) {
        int i;
        cg0 cg0Var;
        z64 z64Var = op0Var.g;
        rz4 rz4Var = op0Var.c;
        String str = op0Var.b;
        this.c = op0Var;
        this.d = b74Var;
        List list = op0Var.e;
        this.e = list == null ? o91.I : list;
        p84 p84Var = op0Var.p;
        if (p84Var != null) {
            if (str == null) {
                cg0Var = new cg0(new g12(this, p84Var));
            } else {
                g12 g12Var = new g12(this, p84Var);
                int ordinal = z64Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + z64Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = z64Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + z64Var + '\'').toString());
                }
                cg0Var = new cg0(g12Var, str, i);
            }
            this.f = cg0Var;
        } else {
            if (rz4Var == null) {
                s83.t("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            this.f = new pz4(new g73(rz4Var.e(new qz4(op0Var.a, str, new yw0(this, b74Var.a), false, false))));
        }
        boolean z = z64Var == z64.J;
        sz4 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(o84 o84Var) {
        q84 Y = o84Var.Y("PRAGMA busy_timeout");
        try {
            Y.T();
            long j = Y.getLong(0);
            mw2.v(Y, null);
            if (j < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                lq2.D(o84Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mw2.v(Y, th);
                throw th2;
            }
        }
    }

    public final void b(o84 o84Var) {
        Object g54Var;
        op0 op0Var = this.c;
        z64 z64Var = op0Var.g;
        z64 z64Var2 = z64.J;
        if (z64Var == z64Var2) {
            lq2.D(o84Var, "PRAGMA journal_mode = WAL");
        } else {
            lq2.D(o84Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (op0Var.g == z64Var2) {
            lq2.D(o84Var, "PRAGMA synchronous = NORMAL");
        } else {
            lq2.D(o84Var, "PRAGMA synchronous = FULL");
        }
        a(o84Var);
        q84 Y = o84Var.Y("PRAGMA user_version");
        try {
            Y.T();
            int i = (int) Y.getLong(0);
            mw2.v(Y, null);
            b74 b74Var = this.d;
            int i2 = b74Var.a;
            int i3 = b74Var.a;
            if (i != i2) {
                lq2.D(o84Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        d(o84Var);
                    } else {
                        e(o84Var, i, i3);
                    }
                    lq2.D(o84Var, "PRAGMA user_version = " + i3);
                    g54Var = wd5.a;
                } catch (Throwable th) {
                    g54Var = new g54(th);
                }
                if (!(g54Var instanceof g54)) {
                    lq2.D(o84Var, "END TRANSACTION");
                }
                Throwable a = h54.a(g54Var);
                if (a != null) {
                    lq2.D(o84Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            f(o84Var);
        } finally {
        }
    }

    public final sz4 c() {
        zf0 zf0Var = this.f;
        pz4 pz4Var = zf0Var instanceof pz4 ? (pz4) zf0Var : null;
        if (pz4Var != null) {
            return (sz4) pz4Var.I.J;
        }
        return null;
    }

    public final void d(o84 o84Var) {
        o84Var.getClass();
        q84 Y = o84Var.Y("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (Y.T()) {
                if (Y.getLong(0) == 0) {
                    z = true;
                }
            }
            mw2.v(Y, null);
            b74 b74Var = this.d;
            b74Var.a(o84Var);
            if (!z) {
                ee0 g = b74Var.g(o84Var);
                if (!g.a) {
                    s83.x((String) g.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            g(o84Var);
            b74Var.c(o84Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((y64) it.next()).getClass();
                if (o84Var instanceof oz4) {
                    ((oz4) o84Var).I.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094 A[EDGE_INSN: B:131:0x0094->B:115:0x0094 BREAK  A[LOOP:4: B:93:0x001b->B:116:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.o84 r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w64.e(o84, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.o84 r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w64.f(o84):void");
    }

    public final void g(o84 o84Var) {
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        lq2.D(o84Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.d.b + "')");
    }

    public w64(op0 op0Var, yv3 yv3Var) {
        this.c = op0Var;
        this.d = new u64("", -1, "");
        List list = op0Var.e;
        o91 o91Var = o91.I;
        this.e = list == null ? o91Var : list;
        o70.g1(list == null ? o91Var : list, new v64(new tf2(this, (byte) 20)));
        Executor executor = op0Var.h;
        Executor executor2 = op0Var.i;
        executor.getClass();
        executor2.getClass();
        throw new ab3(0);
    }
}
