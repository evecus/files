package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy5 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        sx5 sx5Var = sx5.I;
        boolean z = true;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ky5 ky5Var = ((dz5) obj).a;
                String str = ky5Var.c;
                if (ky5Var.b != sx5Var) {
                    String str2 = ez5.a;
                    fr2.e().a(str2, str + " is not in ENQUEUED state. Nothing more to do");
                    return Boolean.TRUE;
                }
                if ((!ky5Var.c() && (ky5Var.b != sx5Var || ky5Var.k <= 0)) || System.currentTimeMillis() >= ky5Var.a()) {
                    return Boolean.FALSE;
                }
                fr2.e().a(ez5.a, "Delaying execution for " + str + " because it is being executed before schedule.");
                return Boolean.TRUE;
            case 1:
                dz5 dz5Var = (dz5) obj;
                oy5 oy5Var = dz5Var.i;
                String str3 = dz5Var.c;
                if (oy5Var.d(str3) == sx5Var) {
                    oy5Var.j(sx5.J, str3);
                    ((Number) g4.V(oy5Var.a, false, true, new pu0(str3, (byte) 19))).intValue();
                    oy5Var.k(str3, -256);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                WorkDatabase workDatabase = ((pw1) obj).a;
                Long a = workDatabase.s().a("next_job_scheduler_id");
                int longValue = a != null ? (int) a.longValue() : 0;
                int i2 = longValue == Integer.MAX_VALUE ? 0 : longValue + 1;
                xr3 s = workDatabase.s();
                byte b2 = 2;
                g4.V(s.a, false, true, new ap3(s, new wr3("next_job_scheduler_id", Long.valueOf(i2)), b2));
                if (longValue < 0 || longValue > Integer.MAX_VALUE) {
                    xr3 s2 = workDatabase.s();
                    g4.V(s2.a, false, true, new ap3(s2, new wr3("next_job_scheduler_id", 1L), b2));
                } else {
                    i = longValue;
                }
                return Integer.valueOf(i);
        }
    }
}
