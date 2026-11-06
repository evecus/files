package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.ck;
import defpackage.cp0;
import defpackage.fr2;
import defpackage.g7;
import defpackage.nb1;
import defpackage.nx5;
import defpackage.r7;
import defpackage.ub;
import defpackage.ux5;
import defpackage.v05;
import defpackage.wv4;
import defpackage.x81;
import defpackage.yt3;
import defpackage.zl1;
import defpackage.zy;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements nb1 {
    public static final String M = fr2.h("SystemJobService");
    public ux5 I;
    public final HashMap J = new HashMap();
    public final cp0 K = new cp0((byte) 4);
    public v05 L;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        zy.i(r7.C("Cannot invoke ", str, " on a background thread"));
    }

    public static nx5 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new nx5(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.nb1
    public final void b(nx5 nx5Var, boolean z) {
        a("onExecuted");
        fr2.e().a(M, nx5Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.J.remove(nx5Var);
        this.K.j(nx5Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            ux5 e = ux5.e(getApplicationContext());
            this.I = e;
            yt3 yt3Var = e.f;
            this.L = new v05(yt3Var, e.d);
            yt3Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                fr2.e().i(M, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                zl1.i("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ux5 ux5Var = this.I;
        if (ux5Var != null) {
            ux5Var.f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        x81 x81Var;
        a("onStartJob");
        ux5 ux5Var = this.I;
        String str = M;
        if (ux5Var == null) {
            fr2.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        nx5 c = c(jobParameters);
        if (c == null) {
            fr2.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.J;
        if (hashMap.containsKey(c)) {
            fr2.e().a(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        fr2.e().a(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            x81Var = new x81();
            if (g7.i(jobParameters) != null) {
                x81Var.c = Arrays.asList(g7.i(jobParameters));
            }
            if (g7.h(jobParameters) != null) {
                x81Var.b = Arrays.asList(g7.h(jobParameters));
            }
            if (i >= 28) {
                x81Var.d = ck.p(jobParameters);
            }
        } else {
            x81Var = null;
        }
        this.L.g(this.K.n(c), x81Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        a("onStopJob");
        if (this.I == null) {
            fr2.e().a(M, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        nx5 c = c(jobParameters);
        if (c == null) {
            fr2.e().c(M, "WorkSpec id not found!");
            return false;
        }
        fr2.e().a(M, "onStopJob for " + c);
        this.J.remove(c);
        wv4 j = this.K.j(c);
        if (j != null) {
            int n = Build.VERSION.SDK_INT >= 31 ? ub.n(jobParameters) : -512;
            v05 v05Var = this.L;
            v05Var.getClass();
            v05Var.h(j, n);
        }
        yt3 yt3Var = this.I.f;
        String str = c.a;
        synchronized (yt3Var.k) {
            contains = yt3Var.i.contains(str);
        }
        return !contains;
    }
}
