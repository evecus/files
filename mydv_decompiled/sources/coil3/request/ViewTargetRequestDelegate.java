package coil3.request;

import coil3.ImageLoader;
import coil3.target.ViewTarget;
import coil3.util.LifecyclesKt;
import defpackage.es0;
import defpackage.fj0;
import defpackage.li2;
import defpackage.ui2;
import defpackage.v52;
import defpackage.vi2;
import defpackage.wd5;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate, es0 {
    private final ImageLoader imageLoader;
    private final ImageRequest initialRequest;
    private final v52 job;
    private final li2 lifecycle;
    private final ViewTarget<?> target;

    public ViewTargetRequestDelegate(ImageLoader imageLoader, ImageRequest imageRequest, ViewTarget<?> viewTarget, li2 li2Var, v52 v52Var) {
        this.imageLoader = imageLoader;
        this.initialRequest = imageRequest;
        this.target = viewTarget;
        this.lifecycle = li2Var;
        this.job = v52Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // coil3.request.RequestDelegate
    public void assertActive() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        ViewTargetRequestManagerKt.getRequestManager(this.target.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil3.request.RequestDelegate
    public Object awaitStarted(fj0 fj0Var) {
        li2 li2Var = this.lifecycle;
        return li2Var != null ? LifecyclesKt.awaitStarted(li2Var, fj0Var) : wd5.a;
    }

    @Override // coil3.request.RequestDelegate
    public void dispose() {
        li2 li2Var;
        this.job.e(null);
        ViewTarget<?> viewTarget = this.target;
        if ((viewTarget instanceof ui2) && (li2Var = this.lifecycle) != null) {
            li2Var.b((ui2) viewTarget);
        }
        li2 li2Var2 = this.lifecycle;
        if (li2Var2 != null) {
            li2Var2.b(this);
        }
    }

    @Override // defpackage.es0
    public void onCreate(vi2 vi2Var) {
        vi2Var.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @Override // defpackage.es0
    public void onDestroy(vi2 vi2Var) {
        ViewTargetRequestManagerKt.getRequestManager(this.target.getView()).dispose();
    }

    @Override // defpackage.es0
    public void onPause(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onResume(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onStart(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onStop(vi2 vi2Var) {
        vi2Var.getClass();
    }

    public final void restart() {
        this.imageLoader.enqueue(this.initialRequest);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // coil3.request.RequestDelegate
    public void start() {
        li2 li2Var;
        li2 li2Var2 = this.lifecycle;
        if (li2Var2 != null) {
            li2Var2.a(this);
        }
        ViewTarget<?> viewTarget = this.target;
        if ((viewTarget instanceof ui2) && (li2Var = this.lifecycle) != null) {
            LifecyclesKt.removeAndAddObserver(li2Var, (ui2) viewTarget);
        }
        ViewTargetRequestManagerKt.getRequestManager(this.target.getView()).setRequest(this);
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
    }
}
