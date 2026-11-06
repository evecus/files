package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lo4 extends gj0 {
    public String I;
    public String J;
    public String K;
    public /* synthetic */ Object L;
    public final /* synthetic */ no4 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo4(no4 no4Var, gj0 gj0Var) {
        super(gj0Var);
        this.M = no4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(null, null, null, this);
    }
}
