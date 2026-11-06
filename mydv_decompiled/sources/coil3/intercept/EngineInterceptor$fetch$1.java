package coil3.intercept;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch", v = 1)
/* loaded from: classes.dex */
public final class EngineInterceptor$fetch$1 extends gj0 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = engineInterceptor;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object fetch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetch = this.this$0.fetch(null, null, null, null, null, this);
        return fetch;
    }
}
