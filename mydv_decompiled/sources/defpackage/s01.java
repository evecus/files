package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s01 extends gj0 {
    public n11 I;
    public long J;
    public byte K;
    public /* synthetic */ Object L;
    public final /* synthetic */ n11 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        Object f0 = this.M.f0(null, null, 0L, 0, this);
        return f0 == el0.I ? f0 : new h54(f0);
    }
}
