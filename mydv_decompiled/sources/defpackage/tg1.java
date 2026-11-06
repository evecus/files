package defpackage;

/* loaded from: classes.dex */
public final class tg1 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ jy0 K;
    public Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg1(jy0 jy0Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = jy0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.emit(null, this);
    }
}
