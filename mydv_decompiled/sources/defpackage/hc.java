package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hc implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ hc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        int ordinal;
        int ordinal2;
        switch (this.I) {
            case 0:
                ((vw0) this.J).h((rm1) this.K, (tw0) this.L, (da2) this.M);
                return wd5.a;
            case 1:
                Float f = (Float) this.J;
                e02 e02Var = (e02) this.K;
                Float f2 = (Float) this.L;
                d02 d02Var = (d02) this.M;
                if (!f.equals(e02Var.I) || !f2.equals(e02Var.J)) {
                    e02Var.I = f;
                    e02Var.J = f2;
                    e02Var.L = new a25(d02Var, p70.F, f, f2, null);
                    e02Var.P.b.setValue(Boolean.TRUE);
                    e02Var.M = false;
                    e02Var.N = true;
                }
                return wd5.a;
            case 2:
                p70.g0((dl0) this.J, null, null, new o1((hu2) this.K, (List) this.L, (tm1) this.M, null, (byte) 8), 3);
                return wd5.a;
            case 3:
                String str = (String) this.J;
                tm1 tm1Var = (tm1) this.K;
                t43 t43Var = (t43) this.L;
                t43 t43Var2 = (t43) this.M;
                if (j42.c(str, "⌫")) {
                    if (((String) t43Var.getValue()).length() > 0) {
                        t43Var.setValue(jx4.F((String) t43Var.getValue()));
                    }
                    t43Var2.setValue(Boolean.FALSE);
                } else if (j42.c(str, "✓")) {
                    if (((String) t43Var.getValue()).length() == 4 && (ordinal2 = ((wm3) tm1Var.invoke((String) t43Var.getValue())).ordinal()) != 0) {
                        if (ordinal2 != 1) {
                            s83.v();
                            return null;
                        }
                        t43Var.setValue("");
                        t43Var2.setValue(Boolean.TRUE);
                    }
                } else if (((String) t43Var.getValue()).length() < 4) {
                    String str2 = ((String) t43Var.getValue()) + str;
                    t43Var.setValue(str2);
                    t43Var2.setValue(Boolean.FALSE);
                    if (str2.length() == 4 && (ordinal = ((wm3) tm1Var.invoke(str2)).ordinal()) != 0) {
                        if (ordinal != 1) {
                            s83.v();
                            return null;
                        }
                        t43Var.setValue("");
                        t43Var2.setValue(Boolean.TRUE);
                    }
                }
                return wd5.a;
            case 4:
                tn5 tn5Var = (tn5) this.J;
                tm1 tm1Var2 = (tm1) this.K;
                t43 t43Var3 = (t43) this.L;
                t43 t43Var4 = (t43) this.M;
                if (tn5Var == null) {
                    tm1Var2.invoke(new tn5(((Number) t43Var3.getValue()).intValue(), ((Number) t43Var4.getValue()).intValue() % 100));
                }
                return wd5.a;
            case 5:
                t43 t43Var5 = (t43) this.J;
                t43 t43Var6 = (t43) this.K;
                fk3 fk3Var = (fk3) this.L;
                hk3 hk3Var = (hk3) this.M;
                String str3 = (String) t43Var5.getValue();
                if (str3 == null) {
                    return null;
                }
                Long l = (Long) t43Var6.getValue();
                return r7.C(str3, " · ", on5.G0(l != null ? l.longValue() : (long) (fk3Var.h() * hk3Var.h())));
            case 6:
                on5.M((t43) this.J, (hk3) this.K, (t43) this.L, (ki1) this.M);
                return wd5.a;
            default:
                mx5 mx5Var = (mx5) this.J;
                UUID uuid = (UUID) this.K;
                xk1 xk1Var = (xk1) this.L;
                Context context = (Context) this.M;
                String uuid2 = uuid.toString();
                ky5 e = mx5Var.c.e(uuid2);
                if (e == null || e.b.a()) {
                    zy.i("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    yt3 yt3Var = mx5Var.b;
                    synchronized (yt3Var.k) {
                        try {
                            fr2.e().g(yt3.l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            dz5 dz5Var = (dz5) yt3Var.g.remove(uuid2);
                            if (dz5Var != null) {
                                if (yt3Var.a == null) {
                                    PowerManager.WakeLock a = ss5.a(yt3Var.b);
                                    yt3Var.a = a;
                                    a.acquire();
                                }
                                yt3Var.f.put(uuid2, dz5Var);
                                Intent c = z05.c(yt3Var.b, hc4.B(dz5Var.a), xk1Var);
                                Context context2 = yt3Var.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    x9.Q(context2, c);
                                } else {
                                    context2.startService(c);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    nx5 B = hc4.B(e);
                    String str4 = z05.R;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", xk1Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", xk1Var.b);
                    intent.putExtra("KEY_NOTIFICATION", xk1Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", B.a);
                    intent.putExtra("KEY_GENERATION", B.b);
                    context.startService(intent);
                }
                return null;
        }
    }
}
