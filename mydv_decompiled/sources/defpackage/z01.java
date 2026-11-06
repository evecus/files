package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z01 extends gj0 {
    public long I;
    public byte J;
    public int K;
    public n11 L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n11 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        Object m0 = this.N.m0(0L, 0, 0, this);
        return m0 == el0.I ? m0 : new h54(m0);
    }
}
