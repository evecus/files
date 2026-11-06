package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wk1 implements Runnable {
    public static final String M = fr2.h("ForceStopRunnable");
    public static final long N = 315360000000L;
    public final Context I;
    public final ux5 J;
    public final pw1 K;
    public int L = 0;

    public wk1(Context context, ux5 ux5Var) {
        this.I = context.getApplicationContext();
        this.J = ux5Var;
        this.K = ux5Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + N;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk1.a():void");
    }

    public final boolean b() {
        uf0 uf0Var = this.J.b;
        uf0Var.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = M;
        if (isEmpty) {
            fr2.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a = wt3.a(this.I, uf0Var);
        fr2.e().a(str, "Is default app process = " + a);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.I;
        String str = M;
        ux5 ux5Var = this.J;
        uf0 uf0Var = ux5Var.b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    fb4.J(context);
                    fr2.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.L + 1;
                        this.L = i;
                        if (i >= 3) {
                            String str2 = Build.VERSION.SDK_INT >= 24 ? g7.l(context) : true ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            fr2.e().d(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            uf0Var.getClass();
                            throw illegalStateException;
                        }
                        fr2.e().b(str, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.L * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    fr2.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    uf0Var.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            ux5Var.g();
        }
    }
}
