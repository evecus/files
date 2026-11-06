package coil3.network.okhttp.internal;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "CallFactoryNetworkClient.kt", l = {24, 24, 25}, m = "executeRequest-impl", v = 1)
/* loaded from: classes.dex */
public final class CallFactoryNetworkClient$executeRequest$1<T> extends gj0 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public CallFactoryNetworkClient$executeRequest$1(fj0 fj0Var) {
        super(fj0Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m98executeRequestimpl(null, null, null, this);
    }
}
