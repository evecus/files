package coil3.request;

import android.view.View;
import coil3.util.CoroutinesKt;
import coil3.util.Utils_androidKt;
import defpackage.ju2;
import defpackage.kt0;
import defpackage.os0;
import defpackage.p70;
import defpackage.sx0;
import defpackage.v52;
import defpackage.xq1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    private ViewTargetDisposable currentDisposable;
    private ViewTargetRequestDelegate currentRequest;
    private boolean isRestart;
    private v52 pendingClear;
    private final View view;

    public ViewTargetRequestManager(View view) {
        this.view = view;
    }

    public final synchronized void dispose() {
        try {
            v52 v52Var = this.pendingClear;
            if (v52Var != null) {
                v52Var.e(null);
            }
            xq1 xq1Var = xq1.I;
            os0 os0Var = sx0.a;
            this.pendingClear = p70.g0(xq1Var, ju2.a.L, null, new ViewTargetRequestManager$dispose$1(this, null), 2);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ViewTargetDisposable getDisposable(kt0 kt0Var) {
        ViewTargetDisposable viewTargetDisposable = this.currentDisposable;
        if (viewTargetDisposable != null && Utils_androidKt.isMainThread() && this.isRestart) {
            this.isRestart = false;
            viewTargetDisposable.setJob(kt0Var);
            return viewTargetDisposable;
        }
        v52 v52Var = this.pendingClear;
        if (v52Var != null) {
            v52Var.e(null);
        }
        this.pendingClear = null;
        ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(this.view, kt0Var);
        this.currentDisposable = viewTargetDisposable2;
        return viewTargetDisposable2;
    }

    public final synchronized ImageResult getResult() {
        ViewTargetDisposable viewTargetDisposable;
        kt0 job;
        viewTargetDisposable = this.currentDisposable;
        return (viewTargetDisposable == null || (job = viewTargetDisposable.getJob()) == null) ? null : (ImageResult) CoroutinesKt.getCompletedOrNull(job);
    }

    public final synchronized boolean isDisposed(ViewTargetDisposable viewTargetDisposable) {
        return viewTargetDisposable != this.currentDisposable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }

    public final void setRequest(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.currentRequest;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.dispose();
        }
        this.currentRequest = viewTargetRequestDelegate;
    }
}
