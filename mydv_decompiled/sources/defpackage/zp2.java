package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zp2 extends gj0 {
    public String I;
    public /* synthetic */ Object J;
    public final /* synthetic */ cq2 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp2(cq2 cq2Var, gj0 gj0Var) {
        super(gj0Var);
        this.K = cq2Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.c(null, this);
    }
}
