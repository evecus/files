package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ty5 {
    public final ol2 a(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(ol2.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                newInstance.getClass();
                ol2 ol2Var = (ol2) newInstance;
                if (!ol2Var.isUsed()) {
                    return ol2Var;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                fr2.e().d(uy5.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            fr2.e().d(uy5.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
