package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v32 extends AbstractOwnableSynchronizer implements Runnable {
    public final hb5 I;

    public v32(hb5 hb5Var) {
        this.I = hb5Var;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.I.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
