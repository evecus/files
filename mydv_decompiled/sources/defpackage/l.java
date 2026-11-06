package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l extends gj0 {
    public String I;
    public String J;
    public String K;
    public String L;
    public /* synthetic */ Object M;
    public final /* synthetic */ s N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, gj0 gj0Var) {
        super(gj0Var);
        this.N = sVar;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.c(null, null, null, null, this);
    }
}
