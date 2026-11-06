package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nh3 extends wt0 {
    public tt0 K;

    @Override // defpackage.k13
    public final void onAttach() {
        tt0 tt0Var;
        k13 node;
        tt0 tt0Var2 = this.K;
        if (tt0Var2 == null || (node = tt0Var2.getNode()) == null || node.isAttached()) {
            tt0Var = null;
        } else {
            tt0Var = this.K;
            tt0Var.getClass();
            j0(tt0Var);
        }
        this.K = tt0Var;
    }

    @Override // defpackage.k13
    public final void onDetach() {
        tt0 tt0Var = this.K;
        if (tt0Var != null) {
            k0(tt0Var);
        }
    }
}
