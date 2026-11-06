package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class du2 extends gj0 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ eu2 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(eu2 eu2Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = eu2Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(false, this);
    }
}
