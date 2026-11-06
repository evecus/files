package defpackage;

/* loaded from: classes2.dex */
public final class ae4 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ wg0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae4(wg0 wg0Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = wg0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.emit(null, this);
    }
}
