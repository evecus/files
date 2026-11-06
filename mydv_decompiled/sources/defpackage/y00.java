package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y00 implements fl2 {
    public final WeakReference I;
    public final x00 J = new x00(this);

    public y00(v00 v00Var) {
        this.I = new WeakReference(v00Var);
    }

    @Override // defpackage.fl2
    public final void a(Executor executor, Runnable runnable) {
        this.J.a(executor, runnable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        v00 v00Var = (v00) this.I.get();
        boolean cancel = this.J.cancel(z);
        if (cancel && v00Var != null) {
            v00Var.a = null;
            v00Var.b = null;
            v00Var.c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.J.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.J.I instanceof h4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.J.isDone();
    }

    public final String toString() {
        return this.J.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.J.get(j, timeUnit);
    }
}
