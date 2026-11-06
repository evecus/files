package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m34 extends d2 implements xk0 {
    public final /* synthetic */ ue0 I;
    public final /* synthetic */ n34 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m34(ue0 ue0Var, n34 n34Var) {
        super(wk0.I);
        this.I = ue0Var;
        this.J = n34Var;
    }

    @Override // defpackage.xk0
    public final void handleException(tk0 tk0Var, Throwable th) {
        ue0 ue0Var = this.I;
        n34 n34Var = this.J;
        c5.m0(th, new ka(ue0Var, n34Var, (byte) 12));
        xk0 xk0Var = (xk0) n34Var.I.get(wk0.I);
        if (xk0Var == null) {
            throw th;
        }
        xk0Var.handleException(tk0Var, th);
    }
}
