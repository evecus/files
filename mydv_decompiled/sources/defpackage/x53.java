package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x53 extends vk0 implements pt0 {
    public final /* synthetic */ pt0 I;
    public final vk0 J;
    public final String K;

    /* JADX WARN: Multi-variable type inference failed */
    public x53(vk0 vk0Var, String str) {
        pt0 pt0Var = vk0Var instanceof pt0 ? (pt0) vk0Var : null;
        this.I = pt0Var == null ? jr0.a : pt0Var;
        this.J = vk0Var;
        this.K = str;
    }

    @Override // defpackage.pt0
    public final void K(long j, k10 k10Var) {
        this.I.K(j, k10Var);
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        this.J.dispatch(tk0Var, runnable);
    }

    @Override // defpackage.vk0
    public final void dispatchYield(tk0 tk0Var, Runnable runnable) {
        this.J.dispatchYield(tk0Var, runnable);
    }

    @Override // defpackage.vk0
    public final boolean isDispatchNeeded(tk0 tk0Var) {
        return this.J.isDispatchNeeded(tk0Var);
    }

    @Override // defpackage.vk0
    public final String toString() {
        return this.K;
    }

    @Override // defpackage.pt0
    public final cy0 y(long j, Runnable runnable, tk0 tk0Var) {
        return this.I.y(j, runnable, tk0Var);
    }
}
