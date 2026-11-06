package coil3.request;

import android.view.View;
import defpackage.kt0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ViewTargetDisposable implements Disposable {
    private volatile kt0 job;
    private final View view;

    public ViewTargetDisposable(View view, kt0 kt0Var) {
        this.view = view;
        this.job = kt0Var;
    }

    @Override // coil3.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        ViewTargetRequestManagerKt.getRequestManager(this.view).dispose();
    }

    @Override // coil3.request.Disposable
    public kt0 getJob() {
        return this.job;
    }

    @Override // coil3.request.Disposable
    public boolean isDisposed() {
        return ViewTargetRequestManagerKt.getRequestManager(this.view).isDisposed(this);
    }

    public void setJob(kt0 kt0Var) {
        this.job = kt0Var;
    }
}
