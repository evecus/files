package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class xk {
    public static final vk I = new vk(new wk());
    public static final int J = -100;
    public static uq2 K = null;
    public static uq2 L = null;
    public static Boolean M = null;
    public static boolean N = false;
    public static final bq O = new bq(0);
    public static final Object P = new Object();
    public static final Object Q = new Object();

    public static boolean c(Context context) {
        if (M == null) {
            try {
                int i = qn.I;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) qn.class), 640).metaData;
                if (bundle != null) {
                    M = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                M = Boolean.FALSE;
            }
        }
        return M.booleanValue();
    }

    public static void f(kl klVar) {
        synchronized (P) {
            try {
                bq bqVar = O;
                bqVar.getClass();
                aq aqVar = new aq(bqVar);
                while (aqVar.hasNext()) {
                    xk xkVar = (xk) ((WeakReference) aqVar.next()).get();
                    if (xkVar == klVar || xkVar == null) {
                        aqVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i);

    public abstract void i(int i);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
