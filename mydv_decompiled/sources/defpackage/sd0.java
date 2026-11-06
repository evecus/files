package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sd0 extends gj0 {
    public Object I;
    public v22 J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ td0 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd0(td0 td0Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = td0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.a(null, null, this);
    }
}
