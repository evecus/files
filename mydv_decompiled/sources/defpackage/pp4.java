package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pp4 extends gj0 {
    public yp4 I;
    public Object J;
    public Serializable K;
    public Object L;
    public rp4 M;
    public Iterator N;
    public /* synthetic */ Object O;
    public final /* synthetic */ yp4 P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp4(yp4 yp4Var, gj0 gj0Var) {
        super(gj0Var);
        this.P = yp4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.d(this);
    }
}
