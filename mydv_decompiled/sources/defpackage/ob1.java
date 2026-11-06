package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ob1 implements Executor {
    public final /* synthetic */ byte I;
    public final Object J;

    public /* synthetic */ ob1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                Handler handler2 = (Handler) obj;
                runnable.getClass();
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                ((Handler) ((mc3) obj).c).post(runnable);
                return;
        }
    }
}
