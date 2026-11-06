package coil3.compose.internal;

import defpackage.sx0;
import defpackage.tk0;
import defpackage.vk0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class DeferredDispatchCoroutineDispatcher extends vk0 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _unconfined$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DeferredDispatchCoroutineDispatcher.class, "_unconfined$volatile");
    private volatile /* synthetic */ int _unconfined$volatile = 1;
    private final vk0 delegate;

    public DeferredDispatchCoroutineDispatcher(vk0 vk0Var) {
        this.delegate = vk0Var;
    }

    private final vk0 getCurrentDispatcher() {
        return _unconfined$volatile$FU.get(this) == 1 ? sx0.b : this.delegate;
    }

    private final /* synthetic */ int get_unconfined$volatile() {
        return this._unconfined$volatile;
    }

    private final /* synthetic */ void set_unconfined$volatile(int i) {
        this._unconfined$volatile = i;
    }

    @Override // defpackage.vk0
    public void dispatch(tk0 tk0Var, Runnable runnable) {
        getCurrentDispatcher().dispatch(tk0Var, runnable);
    }

    @Override // defpackage.vk0
    public void dispatchYield(tk0 tk0Var, Runnable runnable) {
        getCurrentDispatcher().dispatchYield(tk0Var, runnable);
    }

    public final boolean getUnconfined() {
        return this._unconfined$volatile == 1;
    }

    @Override // defpackage.vk0
    public boolean isDispatchNeeded(tk0 tk0Var) {
        return getCurrentDispatcher().isDispatchNeeded(tk0Var);
    }

    @Override // defpackage.vk0
    public vk0 limitedParallelism(int i, String str) {
        return getCurrentDispatcher().limitedParallelism(i, str);
    }

    public final void setUnconfined(boolean z) {
        this._unconfined$volatile = z ? 1 : 0;
    }

    @Override // defpackage.vk0
    public String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.delegate + ")";
    }
}
