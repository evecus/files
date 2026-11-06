package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i11 extends gj0 {
    public n11 I;
    public /* synthetic */ Object J;
    public final /* synthetic */ n11 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.K = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        Object x0 = this.K.x0(null, this);
        return x0 == el0.I ? x0 : new h54(x0);
    }
}
