package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hb5 extends AtomicReference implements Runnable {
    public static final w32 K = new w32();
    public static final w32 L = new w32();
    public final Callable I;
    public final /* synthetic */ ib5 J;

    public hb5(ib5 ib5Var, Callable callable) {
        this.J = ib5Var;
        callable.getClass();
        this.I = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v32 v32Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof v32;
            w32 w32Var = L;
            if (!z2 && runnable != w32Var) {
                break;
            }
            if (z2) {
                v32Var = (v32) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == w32Var || compareAndSet(runnable, w32Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(v32Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            ib5 ib5Var = this.J;
            boolean isDone = ib5Var.isDone();
            w32 w32Var = K;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.I.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, w32Var)) {
                            a(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        ib5Var.k(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, w32Var)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            if (r2.N.i(ib5Var, null, r2.O)) {
                                r2.e(ib5Var, false);
                            }
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, w32Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = r2.O;
            }
            if (r2.N.i(ib5Var, null, call)) {
                r2.e(ib5Var, false);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == K) {
            str = "running=[DONE]";
        } else if (runnable instanceof v32) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.I.toString();
    }
}
