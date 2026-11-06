package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pq3 extends gj0 {
    public Object I;
    public Serializable J;
    public boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ rq3 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(rq3 rq3Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = rq3Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.g(null, null, this);
    }
}
