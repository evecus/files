package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gl extends b5 {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ kl d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kl klVar, Context context) {
        super(klVar);
        this.d = klVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b5
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.b5
    public final void k() {
        byte b = this.c;
        kl klVar = this.d;
        switch (b) {
            case 0:
                klVar.m(true, true);
                break;
            default:
                klVar.m(true, true);
                break;
        }
    }

    public final int m() {
        Location location;
        boolean z;
        long j;
        Location location2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    break;
                }
                break;
            default:
                x81 x81Var = (x81) obj;
                sb5 sb5Var = (sb5) x81Var.d;
                LocationManager locationManager = (LocationManager) x81Var.c;
                if (sb5Var.b > System.currentTimeMillis()) {
                    z = sb5Var.a;
                } else {
                    Context context = (Context) x81Var.b;
                    Location location3 = null;
                    if (lq2.t(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (lq2.t(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        rb5 rb5Var = rb5.d;
                        if (rb5Var == null) {
                            rb5Var = new rb5();
                            rb5.d = rb5Var;
                        }
                        rb5 rb5Var2 = rb5Var;
                        rb5Var2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        rb5Var2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = rb5Var2.c;
                        long j2 = rb5Var2.b;
                        long j3 = rb5Var2.a;
                        rb5Var2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = rb5Var2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        sb5Var.a = z;
                        sb5Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kl klVar, x81 x81Var) {
        super(klVar);
        this.d = klVar;
        this.e = x81Var;
    }
}
