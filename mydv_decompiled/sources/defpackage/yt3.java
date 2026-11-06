package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yt3 {
    public static final String l = fr2.h("Processor");
    public final Context b;
    public final uf0 c;
    public final mc3 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public yt3(Context context, uf0 uf0Var, mc3 mc3Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = uf0Var;
        this.d = mc3Var;
        this.e = workDatabase;
    }

    public static boolean e(String str, dz5 dz5Var, int i) {
        String str2 = l;
        if (dz5Var == null) {
            fr2.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        dz5Var.m.r(new vy5(i));
        fr2.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(nb1 nb1Var) {
        synchronized (this.k) {
            this.j.add(nb1Var);
        }
    }

    public final dz5 b(String str) {
        dz5 dz5Var = (dz5) this.f.remove(str);
        boolean z = dz5Var != null;
        if (!z) {
            dz5Var = (dz5) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = z05.R;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            fr2.e().d(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return dz5Var;
    }

    public final ky5 c(String str) {
        synchronized (this.k) {
            try {
                dz5 d = d(str);
                if (d == null) {
                    return null;
                }
                return d.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dz5 d(String str) {
        dz5 dz5Var = (dz5) this.f.get(str);
        return dz5Var == null ? (dz5) this.g.get(str) : dz5Var;
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.k) {
            z = d(str) != null;
        }
        return z;
    }

    public final void g(nb1 nb1Var) {
        synchronized (this.k) {
            this.j.remove(nb1Var);
        }
    }

    public final void h(nx5 nx5Var) {
        ((ob1) this.d.d).execute(new h8(this, nx5Var, (byte) 23));
    }

    public final boolean i(wv4 wv4Var, int i) {
        String str = wv4Var.a.a;
        synchronized (this.k) {
            try {
                if (this.f.get(str) == null) {
                    Set set = (Set) this.h.get(str);
                    if (set != null && set.contains(wv4Var)) {
                        return e(str, b(str), i);
                    }
                    return false;
                }
                fr2.e().a(l, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
