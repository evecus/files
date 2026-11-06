package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z05 implements ne3, nb1 {
    public static final String R = fr2.h("SystemFgDispatcher");
    public final ux5 I;
    public final c25 J;
    public final Object K = new Object();
    public nx5 L;
    public final LinkedHashMap M;
    public final HashMap N;
    public final HashMap O;
    public final d63 P;
    public SystemForegroundService Q;

    public z05(Context context) {
        ux5 e = ux5.e(context);
        this.I = e;
        this.J = e.d;
        this.L = null;
        this.M = new LinkedHashMap();
        this.O = new HashMap();
        this.N = new HashMap();
        this.P = new d63(e.j);
        e.f.a(this);
    }

    public static Intent c(Context context, nx5 nx5Var, xk1 xk1Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", nx5Var.a);
        intent.putExtra("KEY_GENERATION", nx5Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", xk1Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", xk1Var.b);
        intent.putExtra("KEY_NOTIFICATION", xk1Var.c);
        return intent;
    }

    @Override // defpackage.ne3
    public final void a(ky5 ky5Var, hh0 hh0Var) {
        if (hh0Var instanceof gh0) {
            String str = ky5Var.a;
            fr2.e().a(R, "Constraints unmet for WorkSpec " + str);
            nx5 B = hc4.B(ky5Var);
            int i = ((gh0) hh0Var).a;
            ux5 ux5Var = this.I;
            ((vj4) ((mc3) ux5Var.d).a).execute(new ww4(ux5Var.f, new wv4(B), true, i));
        }
    }

    @Override // defpackage.nb1
    public final void b(nx5 nx5Var, boolean z) {
        Map.Entry entry;
        synchronized (this.K) {
            try {
                v52 v52Var = ((ky5) this.N.remove(nx5Var)) != null ? (v52) this.O.remove(nx5Var) : null;
                if (v52Var != null) {
                    v52Var.e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xk1 xk1Var = (xk1) this.M.remove(nx5Var);
        if (nx5Var.equals(this.L)) {
            if (this.M.size() > 0) {
                Iterator it = this.M.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.L = (nx5) entry.getKey();
                if (this.Q != null) {
                    xk1 xk1Var2 = (xk1) entry.getValue();
                    SystemForegroundService systemForegroundService = this.Q;
                    int i = xk1Var2.a;
                    int i2 = xk1Var2.b;
                    Notification notification = xk1Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        io.x(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        io.w(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.Q.L.cancel(xk1Var2.a);
                }
            } else {
                this.L = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.Q;
        if (xk1Var == null || systemForegroundService2 == null) {
            return;
        }
        fr2.e().a(R, "Removing Notification (id: " + xk1Var.a + ", workSpecId: " + nx5Var + ", notificationType: " + xk1Var.b);
        systemForegroundService2.L.cancel(xk1Var.a);
    }

    public final void d(Intent intent) {
        if (this.Q == null) {
            zy.i("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        nx5 nx5Var = new nx5(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        fr2.e().a(R, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            s83.t("Notification passed in the intent was null.");
            return;
        }
        xk1 xk1Var = new xk1(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.M;
        linkedHashMap.put(nx5Var, xk1Var);
        xk1 xk1Var2 = (xk1) linkedHashMap.get(this.L);
        if (xk1Var2 == null) {
            this.L = nx5Var;
        } else {
            this.Q.L.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((xk1) ((Map.Entry) it.next()).getValue()).b;
                }
                xk1Var = new xk1(xk1Var2.a, xk1Var2.c, i);
            } else {
                xk1Var = xk1Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.Q;
        int i2 = xk1Var.a;
        int i3 = xk1Var.b;
        Notification notification2 = xk1Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            io.x(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            io.w(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void e() {
        this.Q = null;
        synchronized (this.K) {
            try {
                Iterator it = this.O.values().iterator();
                while (it.hasNext()) {
                    ((v52) it.next()).e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.I.f.g(this);
    }

    public final void f(int i, int i2) {
        fr2.e().g(R, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.M.entrySet()) {
            if (((xk1) entry.getValue()).b == i2) {
                nx5 nx5Var = (nx5) entry.getKey();
                ux5 ux5Var = this.I;
                ((vj4) ((mc3) ux5Var.d).a).execute(new ww4(ux5Var.f, new wv4(nx5Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.Q;
        if (systemForegroundService != null) {
            systemForegroundService.J = true;
            fr2.e().a(SystemForegroundService.M, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
