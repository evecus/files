package defpackage;

/* loaded from: classes.dex */
public final class um4 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ w84 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um4(w84 w84Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = w84Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.collect(null, this);
    }
}
