package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g11 extends gj0 {
    public n11 I;
    public int J;
    public byte K;
    public /* synthetic */ Object L;
    public final /* synthetic */ n11 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        Object w0 = this.M.w0(null, 0, null, null, null, null, this);
        return w0 == el0.I ? w0 : new h54(w0);
    }
}
