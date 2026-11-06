package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yz0 extends gj0 {
    public n11 I;
    public long J;
    public long K;
    public long L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n11 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        Object K = this.N.K(null, null, 0L, 0L, 0L, null, this);
        return K == el0.I ? K : new h54(K);
    }
}
