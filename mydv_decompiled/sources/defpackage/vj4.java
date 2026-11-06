package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vj4 implements Executor {
    public final /* synthetic */ byte I;
    public final ArrayDeque J;
    public Runnable K;
    public final Object L;
    public final Executor M;

    public vj4(Executor executor) {
        this.I = (byte) 1;
        executor.getClass();
        this.M = executor;
        this.J = new ArrayDeque();
        this.L = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.L) {
            try {
                this.J.add(new wn1(this, runnable, (byte) 10));
                if (this.K == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        switch (this.I) {
            case 0:
                Runnable runnable = (Runnable) this.J.poll();
                this.K = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.M).execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.L) {
                    Object poll = this.J.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.K = runnable2;
                    if (poll != null) {
                        this.M.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.I) {
            case 0:
                a(runnable);
                return;
            default:
                runnable.getClass();
                synchronized (this.L) {
                    this.J.offer(new n95(runnable, this, (byte) 0));
                    if (this.K == null) {
                        b();
                    }
                }
                return;
        }
    }

    public vj4(ExecutorService executorService) {
        this.I = (byte) 0;
        this.M = executorService;
        this.J = new ArrayDeque();
        this.L = new Object();
    }
}
