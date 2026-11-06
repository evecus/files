package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p01 extends gj0 {
    public int I;
    public int J;
    public int K;
    public int L;
    public n11 M;
    public String N;
    public /* synthetic */ Object O;
    public final /* synthetic */ n11 P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.P = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        Object b0 = this.P.b0(0, 0, 0, null, 0, null, this);
        return b0 == el0.I ? b0 : new h54(b0);
    }
}
