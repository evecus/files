package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p05 extends gj0 {
    public /* synthetic */ Object I;
    public final /* synthetic */ q05 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p05(q05 q05Var, gj0 gj0Var) {
        super(gj0Var);
        this.J = q05Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.h(0L, null, this);
    }
}
