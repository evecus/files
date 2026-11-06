package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ThreadFactory {
    public final /* synthetic */ byte a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, "quickjs-abogus");
                thread.setDaemon(true);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, "quickjs-sign");
                thread2.setDaemon(true);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable, "video-start-prefetch");
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
