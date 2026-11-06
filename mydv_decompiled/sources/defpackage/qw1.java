package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qw1 extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final ka a;

    static {
        List k0 = p70.k0("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = k0;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = k0.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        c = intentFilter;
    }

    public qw1(ka kaVar) {
        this.a = kaVar;
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean isDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            isDeviceIdleMode = isDeviceIdleMode || l5.d(powerManager);
        }
        if (isDeviceIdleMode) {
            this.a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (o70.O0(b, intent.getAction())) {
            a(context);
        }
    }
}
