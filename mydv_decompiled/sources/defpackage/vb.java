package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vb extends gj0 {
    public fz I;
    public /* synthetic */ Object J;
    public final /* synthetic */ wb K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(wb wbVar, fj0 fj0Var) {
        super(fj0Var);
        this.K = wbVar;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(this);
    }
}
