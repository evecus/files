package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.a5;
import defpackage.dw0;
import defpackage.ep;
import defpackage.fp;
import defpackage.j42;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            j42.o0(context, new fp((byte) 1), new ep(this, (byte) 17), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ep epVar = new ep(this, (byte) 17);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new dw0((byte) 1, 11, epVar, null).run();
                        return;
                    }
                    return;
                }
                ep epVar2 = new ep(this, (byte) 17);
                try {
                    j42.S(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new dw0((byte) 1, 10, epVar2, null).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new dw0((byte) 1, 7, epVar2, e).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ep epVar3 = new ep(this, (byte) 17);
            int myPid = Process.myPid();
            if (Build.VERSION.SDK_INT < 24) {
                epVar3.e(13, null);
                return;
            } else {
                Process.sendSignal(myPid, 10);
                epVar3.e(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        ep epVar4 = new ep(this, (byte) 17);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            a5.v(context, epVar4);
            return;
        }
        if (!"SAVE_PROFILE".equals(string2)) {
            epVar4.e(16, null);
            return;
        }
        int i = extras.getInt("EXTRA_PID", Process.myPid());
        if (Build.VERSION.SDK_INT < 24) {
            epVar4.e(13, null);
        } else {
            Process.sendSignal(i, 10);
            epVar4.e(12, null);
        }
    }
}
