package androidx.media3.common.util;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BackgroundExecutor {
    private static Executor staticInstance;

    private BackgroundExecutor() {
    }

    public static synchronized Executor get() {
        Executor executor;
        synchronized (BackgroundExecutor.class) {
            executor = staticInstance;
            if (executor == null) {
                executor = Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
                staticInstance = executor;
            }
        }
        return executor;
    }

    public static synchronized void set(Executor executor) {
        synchronized (BackgroundExecutor.class) {
            staticInstance = executor;
        }
    }
}
