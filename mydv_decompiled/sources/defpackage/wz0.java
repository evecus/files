package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wz0 extends gj0 {
    public n11 I;
    public int J;
    public byte K;
    public /* synthetic */ Object L;
    public final /* synthetic */ n11 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        Object I = this.M.I(null, 0, 0, this);
        return I == el0.I ? I : new h54(I);
    }
}
