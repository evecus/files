package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ok4 extends d2 implements xk0 {
    public final /* synthetic */ a85 I;
    public final /* synthetic */ vo J;
    public final /* synthetic */ Context K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok4(a85 a85Var, vo voVar, Context context) {
        super(wk0.I);
        this.I = a85Var;
        this.J = voVar;
        this.K = context;
    }

    @Override // defpackage.xk0
    public final void handleException(tk0 tk0Var, Throwable th) {
        vo voVar = this.J;
        Context context = this.K;
        a85 a85Var = this.I;
        p70.g0(a85Var, null, null, new n6(voVar, context, th, a85Var, null, (byte) 16, false), 3);
    }
}
