package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ew4 extends gj0 {
    public ag1 I;
    public gw4 J;
    public v52 K;
    public Object L;
    public Object M;
    public /* synthetic */ Object N;
    public final /* synthetic */ fw4 O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew4(fw4 fw4Var, fj0 fj0Var) {
        super(fj0Var);
        this.O = fw4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        this.O.collect(null, this);
        return el0.I;
    }
}
