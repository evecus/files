package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class z52 {
    public static final String a = fr2.h("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? z4.d(jobScheduler) : jobScheduler;
    }
}
