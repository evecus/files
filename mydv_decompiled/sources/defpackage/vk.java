package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vk implements Executor {
    public final Object I = new Object();
    public final ArrayDeque J = new ArrayDeque();
    public final wk K;
    public Runnable L;

    public vk(wk wkVar) {
        this.K = wkVar;
    }

    public final void a() {
        synchronized (this.I) {
            try {
                Runnable runnable = (Runnable) this.J.poll();
                this.L = runnable;
                if (runnable != null) {
                    this.K.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.I) {
            try {
                this.J.add(new h8(this, runnable, (byte) 2));
                if (this.L == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
