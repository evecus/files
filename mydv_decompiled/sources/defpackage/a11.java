package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a11 extends gj0 {
    public int I;
    public n11 J;
    public /* synthetic */ Object K;
    public final /* synthetic */ n11 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        Object n0 = this.L.n0(0, this);
        return n0 == el0.I ? n0 : new h54(n0);
    }
}
