package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pu4 extends gj0 {
    public String I;
    public /* synthetic */ Object J;
    public final /* synthetic */ qu4 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu4(qu4 qu4Var, gj0 gj0Var) {
        super(gj0Var);
        this.K = qu4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(null, null, null, this);
    }
}
