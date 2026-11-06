package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xz0 extends gj0 {
    public n11 I;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ n11 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz0(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        Object J = this.L.J(0, this, null, null);
        return J == el0.I ? J : new h54(J);
    }
}
