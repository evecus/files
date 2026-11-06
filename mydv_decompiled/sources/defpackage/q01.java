package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q01 extends gj0 {
    public long I;
    public byte J;
    public n11 K;
    public LinkedHashMap L;
    public Object M;
    public /* synthetic */ Object N;
    public final /* synthetic */ n11 O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(n11 n11Var, gj0 gj0Var) {
        super(gj0Var);
        this.O = n11Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        Object d0 = this.O.d0(0L, 0, this);
        return d0 == el0.I ? d0 : new h54(d0);
    }
}
