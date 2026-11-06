package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k01 extends gj0 {
    public int I;
    public int J;
    public n11 K;
    public /* synthetic */ Object L;
    public final /* synthetic */ n11 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        Object W = this.M.W(0, 0, null, null, null, this);
        return W == el0.I ? W : new h54(W);
    }
}
