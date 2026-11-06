package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class to extends gj0 {
    public vo I;
    public vo J;
    public List K;
    public int L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ vo O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(vo voVar, gj0 gj0Var) {
        super(gj0Var);
        this.O = voVar;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        return vo.d(this.O, null, this);
    }
}
