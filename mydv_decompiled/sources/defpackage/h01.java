package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h01 extends gj0 {
    public n11 I;
    public long J;
    public byte K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n11 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        Object T = this.N.T(null, 0L, 0, false, this);
        return T == el0.I ? T : new h54(T);
    }
}
