package coil3.compose.internal;

import defpackage.tk0;
import defpackage.vk0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class DeferredDispatchCoroutineContext extends ForwardingCoroutineContext {
    public DeferredDispatchCoroutineContext(tk0 tk0Var) {
        super(tk0Var);
    }

    @Override // coil3.compose.internal.ForwardingCoroutineContext
    public ForwardingCoroutineContext newContext(tk0 tk0Var, tk0 tk0Var2) {
        vk0 dispatcher = UtilsKt.getDispatcher(tk0Var);
        vk0 dispatcher2 = UtilsKt.getDispatcher(tk0Var2);
        if ((dispatcher instanceof DeferredDispatchCoroutineDispatcher) && dispatcher != dispatcher2) {
            ((DeferredDispatchCoroutineDispatcher) dispatcher).setUnconfined(false);
        }
        return new DeferredDispatchCoroutineContext(tk0Var2);
    }
}
