package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mw extends c2 {
    public final Thread M;
    public final eb1 N;

    public mw(tk0 tk0Var, Thread thread, eb1 eb1Var) {
        super(tk0Var, true);
        this.M = thread;
        this.N = eb1Var;
    }

    @Override // defpackage.e62
    public final void m(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.M;
        if (j42.c(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
