package defpackage;

/* loaded from: classes2.dex */
public final class wd4 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ t03 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd4(t03 t03Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = t03Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.collect(null, this);
    }
}
