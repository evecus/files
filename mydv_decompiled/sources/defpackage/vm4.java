package defpackage;

/* loaded from: classes.dex */
public final class vm4 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ vt2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm4(vt2 vt2Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = vt2Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.emit(null, this);
    }
}
