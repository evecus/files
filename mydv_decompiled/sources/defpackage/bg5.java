package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bg5 extends gj0 {
    public boolean I;
    public float J;
    public /* synthetic */ Object K;
    public final /* synthetic */ cg5 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg5(cg5 cg5Var, fj0 fj0Var) {
        super(fj0Var);
        this.L = cg5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.a(null, this);
    }
}
