package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n44 extends kz2 {
    public final /* synthetic */ byte c = 1;
    public final Context d;

    public n44(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.kz2
    public final void a(hm1 hm1Var) {
        byte b = this.c;
        Context context = this.d;
        hm1Var.getClass();
        switch (b) {
            case 0:
                if (this.b >= 10) {
                    hm1Var.A(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                hm1Var.y("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    hm1Var.e();
                    try {
                        hm1Var.A(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        hm1Var.A(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        hm1Var.F();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    hm1Var.e();
                    try {
                        hm1Var.A(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        hm1Var.A(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        hm1Var.F();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public n44(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
