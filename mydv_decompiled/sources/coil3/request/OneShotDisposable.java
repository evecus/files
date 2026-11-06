package coil3.request;

import defpackage.e62;
import defpackage.kt0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class OneShotDisposable implements Disposable {
    private final kt0 job;

    public OneShotDisposable(kt0 kt0Var) {
        this.job = kt0Var;
    }

    @Override // coil3.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        ((e62) getJob()).e(null);
    }

    @Override // coil3.request.Disposable
    public kt0 getJob() {
        return this.job;
    }

    @Override // coil3.request.Disposable
    public boolean isDisposed() {
        return !getJob().isActive();
    }
}
