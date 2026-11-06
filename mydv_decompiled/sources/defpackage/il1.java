package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class il1 extends u75 {
    public u75 a;

    public il1(u75 u75Var) {
        u75Var.getClass();
        this.a = u75Var;
    }

    @Override // defpackage.u75
    public final void awaitSignal(Condition condition) {
        condition.getClass();
        this.a.awaitSignal(condition);
    }

    @Override // defpackage.u75
    public final u75 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.u75
    public final u75 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.u75
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.u75
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.u75
    public final void throwIfReached() {
        this.a.throwIfReached();
    }

    @Override // defpackage.u75
    public final u75 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.u75
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.u75
    public final void waitUntilNotified(Object obj) {
        obj.getClass();
        this.a.waitUntilNotified(obj);
    }

    @Override // defpackage.u75
    public final u75 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
