package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n72 extends gj0 {
    public xp0 I;
    public o72 J;
    public LinkedHashMap K;
    public String L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ o72 O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n72(o72 o72Var, fu fuVar) {
        super(fuVar);
        this.O = o72Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        return this.O.c(null, this);
    }
}
