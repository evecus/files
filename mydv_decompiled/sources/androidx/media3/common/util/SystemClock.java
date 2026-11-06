package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class SystemClock implements Clock {
    @Override // androidx.media3.common.util.Clock
    public HandlerWrapper createHandler(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // androidx.media3.common.util.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.Clock
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // androidx.media3.common.util.Clock
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public void onThreadBlocked() {
    }
}
