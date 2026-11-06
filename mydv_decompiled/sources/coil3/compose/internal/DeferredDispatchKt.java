package coil3.compose.internal;

import defpackage.dl0;
import defpackage.gl0;
import defpackage.hn1;
import defpackage.i42;
import defpackage.p70;
import defpackage.sx0;
import defpackage.v52;
import defpackage.vk0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DeferredDispatchKt {
    public static final v52 launchWithDeferredDispatch(dl0 dl0Var, hn1 hn1Var) {
        vk0 dispatcher = UtilsKt.getDispatcher(dl0Var.getCoroutineContext());
        gl0 gl0Var = gl0.L;
        return (dispatcher == null || dispatcher.equals(sx0.b)) ? p70.f0(dl0Var, sx0.b, gl0Var, hn1Var) : p70.f0(i42.H(new DeferredDispatchCoroutineContext(dl0Var.getCoroutineContext())), new DeferredDispatchCoroutineDispatcher(dispatcher), gl0Var, hn1Var);
    }
}
