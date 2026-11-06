package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bg0 extends gj0 {
    public Object I;
    public Serializable J;
    public iq3 K;
    public r24 L;
    public tk0 M;
    public r24 N;
    public boolean O;
    public /* synthetic */ Object P;
    public final /* synthetic */ cg0 Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(cg0 cg0Var, gj0 gj0Var) {
        super(gj0Var);
        this.Q = cg0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.P = obj;
        this.R |= Integer.MIN_VALUE;
        return this.Q.o(false, null, this);
    }
}
