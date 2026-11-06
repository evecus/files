package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e11 extends gj0 {
    public String I;
    public n11 J;
    public int K;
    public byte L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n11 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        Object u0 = this.N.u0(0, this, null, null);
        return u0 == el0.I ? u0 : new h54(u0);
    }
}
