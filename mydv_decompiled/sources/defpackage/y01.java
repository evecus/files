package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y01 extends gj0 {
    public String I;
    public n11 J;
    public LinkedHashMap K;
    public /* synthetic */ Object L;
    public final /* synthetic */ n11 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        Object l0 = this.M.l0(null, this);
        return l0 == el0.I ? l0 : new h54(l0);
    }
}
