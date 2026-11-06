package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d10 implements f10 {
    public final ScheduledFuture a;

    public d10(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.f10
    public final void a(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
