package coil3.request;

import coil3.util.LifecyclesKt;
import defpackage.es0;
import defpackage.fj0;
import defpackage.li2;
import defpackage.v52;
import defpackage.vi2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LifecycleRequestDelegate implements RequestDelegate, es0 {
    private final v52 job;
    private final li2 lifecycle;

    public LifecycleRequestDelegate(li2 li2Var, v52 v52Var) {
        this.lifecycle = li2Var;
        this.job = v52Var;
    }

    @Override // coil3.request.RequestDelegate
    public Object awaitStarted(fj0 fj0Var) {
        return LifecyclesKt.awaitStarted(this.lifecycle, fj0Var);
    }

    @Override // coil3.request.RequestDelegate
    public void complete() {
        this.lifecycle.b(this);
    }

    @Override // coil3.request.RequestDelegate
    public void dispose() {
        this.job.e(null);
    }

    @Override // defpackage.es0
    public void onCreate(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onDestroy(vi2 vi2Var) {
        dispose();
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

    @Override // coil3.request.RequestDelegate
    public void start() {
        this.lifecycle.a(this);
    }

    @Override // coil3.request.RequestDelegate
    public final void assertActive() {
    }
}
