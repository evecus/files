package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fp0 extends gj0 {
    public Serializable I;
    public Iterator J;
    public /* synthetic */ Object K;
    public final /* synthetic */ n84 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(n84 n84Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = n84Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.j(null, null, this);
    }
}
