package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x43 extends gj0 {
    public c32 I;
    public y43 J;
    public Iterator K;
    public /* synthetic */ Object L;
    public final /* synthetic */ dk0 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(dk0 dk0Var, fj0 fj0Var) {
        super(fj0Var);
        this.M = dk0Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(null, this);
    }
}
