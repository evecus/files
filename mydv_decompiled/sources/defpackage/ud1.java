package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ud1 extends gj0 {
    public String I;
    public long J;
    public /* synthetic */ Object K;
    public final /* synthetic */ yd1 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(yd1 yd1Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = yd1Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.p(null, this);
    }
}
