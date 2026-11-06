package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d11 extends gj0 {
    public n11 I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ n11 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        Object t0 = this.L.t0(0, this, null, null);
        return t0 == el0.I ? t0 : new h54(t0);
    }
}
