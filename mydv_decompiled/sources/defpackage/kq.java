package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kq extends gj0 {
    public List I;
    public v44 J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ lq N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(lq lqVar, gj0 gj0Var) {
        super(gj0Var);
        this.N = lqVar;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.c(this);
    }
}
