package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g15 implements na4 {
    public static final String N = fr2.h("SystemJobScheduler");
    public final Context I;
    public final JobScheduler J;
    public final f15 K;
    public final WorkDatabase L;
    public final uf0 M;

    public g15(Context context, WorkDatabase workDatabase, uf0 uf0Var) {
        JobScheduler a = z52.a(context);
        f15 f15Var = new f15(context, uf0Var.d);
        this.I = context;
        this.J = a;
        this.K = f15Var;
        this.L = workDatabase;
        this.M = uf0Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            fr2.e().d(N, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f = f(context, jobScheduler);
        if (f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        int size = f.size();
        int i = 0;
        while (i < size) {
            Object obj = f.get(i);
            i++;
            JobInfo jobInfo = (JobInfo) obj;
            nx5 g = g(jobInfo);
            if (g != null && str.equals(g.a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = z52.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            fr2.e().d(z52.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static nx5 g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new nx5(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.na4
    public final boolean c() {
        return true;
    }

    @Override // defpackage.na4
    public final void d(String str) {
        Context context = this.I;
        JobScheduler jobScheduler = this.J;
        ArrayList b = b(context, jobScheduler, str);
        if (b == null || b.isEmpty()) {
            return;
        }
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            a(jobScheduler, ((Integer) obj).intValue());
        }
        c15 t = this.L.t();
        t.getClass();
        str.getClass();
        g4.V(t.a, false, true, new pu0(str, (byte) 8));
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v15 */
    @Override // defpackage.na4
    public final void e(ky5... ky5VarArr) {
        int intValue;
        boolean z;
        ArrayList b;
        int intValue2;
        WorkDatabase workDatabase = this.L;
        pw1 pw1Var = new pw1(workDatabase);
        int length = ky5VarArr.length;
        ?? r5 = 0;
        int i = 0;
        while (i < length) {
            ky5 ky5Var = ky5VarArr[i];
            workDatabase.b();
            try {
                oy5 w = workDatabase.w();
                String str = ky5Var.a;
                ky5 e = w.e(str);
                String str2 = N;
                if (e == null) {
                    fr2.e().i(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (e.b != sx5.I) {
                    fr2.e().i(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    nx5 B = hc4.B(ky5Var);
                    int i2 = B.b;
                    String str3 = B.a;
                    c15 t = workDatabase.t();
                    t.getClass();
                    str3.getClass();
                    a15 a15Var = (a15) g4.V(t.a, true, r5, new b15(str3, i2, r5));
                    byte b2 = 2;
                    WorkDatabase workDatabase2 = pw1Var.a;
                    if (a15Var != null) {
                        intValue = a15Var.c;
                    } else {
                        Object n = workDatabase2.n(new wy5(pw1Var, b2));
                        n.getClass();
                        intValue = ((Number) n).intValue();
                    }
                    if (a15Var == null) {
                        a15 a15Var2 = new a15(str3, i2, intValue);
                        c15 t2 = workDatabase.t();
                        t2.getClass();
                        g4.V(t2.a, false, true, new ap3((Object) t2, (Object) a15Var2, (byte) 8));
                    }
                    h(ky5Var, intValue);
                    if (Build.VERSION.SDK_INT != 23 || (b = b(this.I, this.J, str)) == null) {
                        z = false;
                    } else {
                        int indexOf = b.indexOf(Integer.valueOf(intValue));
                        if (indexOf >= 0) {
                            b.remove(indexOf);
                        }
                        if (b.isEmpty()) {
                            z = false;
                            Object n2 = workDatabase2.n(new wy5(pw1Var, (byte) 2));
                            n2.getClass();
                            intValue2 = ((Number) n2).intValue();
                        } else {
                            z = false;
                            intValue2 = ((Integer) b.get(0)).intValue();
                        }
                        h(ky5Var, intValue2);
                    }
                    workDatabase.p();
                    i++;
                    r5 = z;
                }
                workDatabase.l();
                z = r5;
                i++;
                r5 = z;
            } finally {
                workDatabase.l();
            }
        }
    }

    public final void h(ky5 ky5Var, int i) {
        List<JobInfo> list;
        JobInfo a = this.K.a(ky5Var, i);
        fr2 e = fr2.e();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = ky5Var.a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String sb2 = sb.toString();
        String str2 = N;
        e.a(str2, sb2);
        try {
            if (this.J.schedule(a) == 0) {
                fr2.e().i(str2, "Unable to schedule work ID " + str);
                if (ky5Var.q && ky5Var.r == ug3.I) {
                    ky5Var.q = false;
                    fr2.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    h(ky5Var, i);
                }
            }
        } catch (IllegalStateException e2) {
            String str3 = z52.a;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) g4.V(this.L.w().a, true, false, new m45((byte) 26))).size();
            Context context = this.I;
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler a2 = z52.a(context);
                try {
                    list = a2.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th) {
                    fr2.e().d(z52.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList f = f(context, a2);
                    int size2 = f != null ? list.size() - f.size() : 0;
                    String t = size2 == 0 ? null : pt1.t(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList f2 = f(context, (JobScheduler) systemService);
                    int size3 = f2 != null ? f2.size() : 0;
                    str4 = o70.Z0(dq.b1(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", t, size3 != 0 ? pt1.t(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, 0, null, 62);
                }
            } else {
                ArrayList f3 = f(context, z52.a(context));
                if (f3 != null) {
                    str4 = f3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb3 = new StringBuilder("JobScheduler ");
            sb3.append(i3);
            sb3.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb3.append(str4);
            sb3.append(".\nThere are ");
            sb3.append(size);
            sb3.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String y = hf1.y(sb3, this.M.f, '.');
            fr2.e().c(str2, y);
            zl1.i(y, e2);
        } catch (Throwable th2) {
            fr2.e().d(str2, "Unable to schedule " + ky5Var, th2);
        }
    }
}
