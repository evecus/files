package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class hg1 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public final /* synthetic */ ig1 K;
    public ag1 L;
    public Serializable M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(ig1 ig1Var, fj0 fj0Var) {
        super(fj0Var);
        this.K = ig1Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.K.collect(null, this);
    }
}
