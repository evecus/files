package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l11 extends gj0 {
    public /* synthetic */ Object I;
    public final /* synthetic */ n11 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.J = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        Object A0 = this.J.A0(null, null, this);
        return A0 == el0.I ? A0 : new h54(A0);
    }
}
