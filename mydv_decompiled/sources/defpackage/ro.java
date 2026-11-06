package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ro extends gj0 {
    public Object I;
    public Context J;
    public v71 K;
    public /* synthetic */ Object L;
    public final /* synthetic */ vo M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(vo voVar, gj0 gj0Var) {
        super(gj0Var);
        this.M = voVar;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return vo.a(this.M, null, null, this);
    }
}
