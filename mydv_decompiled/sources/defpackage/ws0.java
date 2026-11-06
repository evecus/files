package defpackage;

import android.os.Handler;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ws0 implements Executor {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ws0(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((BackgroundThreadStateHandler) obj).runInBackground(runnable);
                break;
            case 1:
                ((HandlerWrapper) obj).post(runnable);
                break;
            case 2:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((SimpleBasePlayer) obj).postOrRunOnApplicationHandler(runnable);
                break;
        }
    }
}
