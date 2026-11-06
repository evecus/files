package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class js extends k13 {
    public e75 I;
    public final /* synthetic */ ks J;

    public js(ks ksVar) {
        this.J = ksVar;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        ks ksVar = this.J;
        ksVar.a = this;
        if (ksVar.b != null) {
            this.I = lq2.e0(this, new be(this, ksVar, (byte) 3));
        }
    }

    @Override // defpackage.k13
    public final void onDetach() {
        ks ksVar = this.J;
        if (ksVar.a == this) {
            ksVar.a = null;
        }
        e75 e75Var = this.I;
        if (e75Var != null) {
            e75Var.b();
        }
        this.I = null;
    }
}
