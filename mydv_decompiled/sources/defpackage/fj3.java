package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fj3 extends gj0 {
    public int I;
    public ku4 J;
    public /* synthetic */ Object K;
    public final /* synthetic */ jj3 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj3(jj3 jj3Var, fj0 fj0Var) {
        super(fj0Var);
        this.L = jj3Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.f(0, null, this);
    }
}
