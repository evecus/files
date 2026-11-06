package defpackage;

import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cp5 extends gj0 {
    public byte I;
    public int J;
    public List K;
    public HashSet L;
    public kq5 M;
    public /* synthetic */ Object N;
    public final /* synthetic */ kq5 O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp5(kq5 kq5Var, gj0 gj0Var) {
        super(gj0Var);
        this.O = kq5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        Object g = this.O.g(0, this);
        return g == el0.I ? g : new h54(g);
    }
}
