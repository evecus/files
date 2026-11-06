package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.fr2;
import defpackage.il2;
import defpackage.ji2;
import defpackage.ka;
import defpackage.li2;
import defpackage.mc3;
import defpackage.n84;
import defpackage.ux5;
import defpackage.vi2;
import defpackage.vj4;
import defpackage.wn1;
import defpackage.x81;
import defpackage.xi2;
import defpackage.z05;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class SystemForegroundService extends Service implements vi2 {
    public static final String M = fr2.h("SystemFgService");
    public final x81 I = new x81(this);
    public boolean J;
    public z05 K;
    public NotificationManager L;

    public final void a() {
        this.L = (NotificationManager) getApplicationContext().getSystemService("notification");
        z05 z05Var = new z05(getApplicationContext());
        this.K = z05Var;
        if (z05Var.Q != null) {
            fr2.e().c(z05.R, "A callback already exists.");
        } else {
            z05Var.Q = this;
        }
    }

    public final void c() {
        x81 x81Var = this.I;
        x81Var.getClass();
        x81Var.q(ji2.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        x81 x81Var = this.I;
        x81Var.getClass();
        x81Var.q(ji2.ON_STOP);
        x81Var.q(ji2.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.vi2
    public final li2 k() {
        return (xi2) this.I.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        x81 x81Var = this.I;
        x81Var.getClass();
        x81Var.q(ji2.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        c();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d();
        this.K.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        x81 x81Var = this.I;
        x81Var.getClass();
        x81Var.q(ji2.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.J;
        boolean z2 = false;
        String str = M;
        if (z) {
            fr2.e().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.K.e();
            a();
            this.J = false;
        }
        if (intent == null) {
            return 3;
        }
        z05 z05Var = this.K;
        z05Var.getClass();
        String str2 = z05.R;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            fr2.e().g(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((vj4) ((mc3) z05Var.J).a).execute(new wn1((byte) 11, z05Var, stringExtra, z2));
            z05Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            z05Var.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            fr2.e().g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = z05Var.Q;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.J = true;
            fr2.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        fr2.e().g(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        ux5 ux5Var = z05Var.I;
        UUID fromString = UUID.fromString(stringExtra2);
        ux5Var.getClass();
        fromString.getClass();
        n84 n84Var = ux5Var.b.g;
        vj4 vj4Var = (vj4) ((mc3) ux5Var.d).a;
        vj4Var.getClass();
        il2.P(n84Var, "CancelWorkById", vj4Var, new ka(ux5Var, fromString, (byte) 9));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.K.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.K.f(i, i2);
    }
}
