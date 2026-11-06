package coil3.intercept;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed", v = 1)
/* loaded from: classes.dex */
public final class RealInterceptorChain$proceed$1 extends gj0 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealInterceptorChain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = realInterceptorChain;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.proceed(this);
    }
}
