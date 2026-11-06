package androidx.media3.exoplayer.util;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static ReleasableExecutor a(Executor executor, Consumer consumer) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            final /* synthetic */ Executor val$executor;
            final /* synthetic */ Consumer val$releaseCallback;

            public AnonymousClass1(Executor executor2, Consumer consumer2) {
                r1 = executor2;
                r2 = consumer2;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                r1.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void release() {
                r2.accept(r1);
            }
        };
    }
}
