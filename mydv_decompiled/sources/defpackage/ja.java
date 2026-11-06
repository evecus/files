package defpackage;

import android.os.Handler;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Executor {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ja(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((AndroidComposeView) obj).postOnAnimation(runnable);
                break;
            case 1:
                ((HandlerWrapper) obj).post(runnable);
                break;
            default:
                ((Handler) obj).post(runnable);
                break;
        }
    }
}
