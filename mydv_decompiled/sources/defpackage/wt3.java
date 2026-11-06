package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class wt3 {
    public static final String a = fr2.h("ProcessUtils");

    public static final boolean a(Context context, uf0 uf0Var) {
        String str;
        Object obj;
        context.getClass();
        uf0Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            str = ck.q();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, ux5.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                invoke.getClass();
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                fr2.e().b(a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return j42.c(str, context.getApplicationInfo().processName);
    }
}
