package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s75 extends u75 {
    @Override // defpackage.u75
    public final u75 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this;
    }

    @Override // defpackage.u75
    public final void throwIfReached() {
    }

    @Override // defpackage.u75
    public final u75 deadlineNanoTime(long j) {
        return this;
    }
}
