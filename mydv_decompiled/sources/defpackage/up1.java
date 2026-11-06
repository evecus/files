package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class up1 {
    public static final /* synthetic */ d82[] a;

    static {
        qx3 qx3Var = new qx3(s00.NO_RECEIVER, up1.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s24.a.getClass();
        a = new d82[]{qx3Var};
    }

    public static yr3 a(Context context) {
        yr3 yr3Var;
        as3 as3Var = yp1.e;
        d82 d82Var = a[0];
        as3Var.getClass();
        context.getClass();
        d82Var.getClass();
        yr3 yr3Var2 = as3Var.e;
        if (yr3Var2 != null) {
            return yr3Var2;
        }
        synchronized (as3Var.d) {
            try {
                if (as3Var.e == null) {
                    Context applicationContext = context.getApplicationContext();
                    tm1 tm1Var = as3Var.b;
                    applicationContext.getClass();
                    List list = (List) tm1Var.invoke(applicationContext);
                    dl0 dl0Var = as3Var.c;
                    zr3 zr3Var = new zr3(applicationContext, as3Var);
                    list.getClass();
                    k04 k04Var = k04.s0;
                    as3Var.e = new yr3(new yp4(new mq1(zr3Var, (byte) 3), k04Var, p70.j0(new r(list, null, (byte) 15)), new j81((byte) 12), dl0Var));
                }
                yr3Var = as3Var.e;
                yr3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return yr3Var;
    }

    public static String b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(null, null);
        invoke.getClass();
        return (String) invoke;
    }

    public static bs3 c(String str) {
        return new bs3(hf1.w("provider:", str));
    }
}
