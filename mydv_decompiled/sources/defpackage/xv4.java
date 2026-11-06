package defpackage;

/* loaded from: classes2.dex */
public final class xv4 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ xg0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv4(xg0 xg0Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = xg0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        this.K.collect(null, this);
        return el0.I;
    }
}
