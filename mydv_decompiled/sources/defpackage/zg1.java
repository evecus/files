package defpackage;

/* loaded from: classes2.dex */
public final class zg1 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ y30 K;
    public Object L;
    public ag1 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg1(y30 y30Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = y30Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.emit(null, this);
    }
}
