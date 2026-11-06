package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class np1 extends gj0 {
    public Context I;
    public lo J;
    public Throwable K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ rp1 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(rp1 rp1Var, fj0 fj0Var) {
        super(fj0Var);
        this.N = rp1Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.deleted$glance_appwidget(null, 0, this);
    }
}
