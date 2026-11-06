package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rx1 implements fl2 {
    public static final rx1 I = new rx1();
    public static final cg2 J = new cg2(rx1.class);

    @Override // defpackage.fl2
    public final void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            J.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return hf1.z(new StringBuilder(), super.toString(), "[status=SUCCESS, result=[null]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }
}
