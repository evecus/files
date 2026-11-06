package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hh2 extends k13 implements ye0, vq1 {
    public md I;
    public oh2 J;
    public u45 K;
    public final jk3 L = ad4.w(null);

    public hh2(md mdVar, oh2 oh2Var, u45 u45Var) {
        this.I = mdVar;
        this.J = oh2Var;
        this.K = u45Var;
    }

    @Override // defpackage.vq1
    public final void O(na3 na3Var) {
        this.L.setValue(na3Var);
    }

    @Override // defpackage.k13
    public final void onAttach() {
        md mdVar = this.I;
        if (mdVar.a != null) {
            t02.c("Expected textInputModifierNode to be null");
        }
        mdVar.a = this;
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.I.k(this);
    }
}
