package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cq1 extends gj0 {
    public Context I;
    public int[] J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ gq1 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(gq1 gq1Var, fj0 fj0Var) {
        super(fj0Var);
        this.N = gq1Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.doDelete$glance_appwidget(null, null, null, this);
    }
}
