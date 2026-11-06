package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p04 implements dw4, zf1, un1 {
    public final /* synthetic */ w43 I;
    private final v52 job;

    public p04(w43 w43Var, rv4 rv4Var) {
        this.I = w43Var;
        this.job = rv4Var;
    }

    @Override // defpackage.un1
    public final zf1 a(tk0 tk0Var, int i, ez ezVar) {
        return (((i < 0 || i >= 2) && i != -2) || ezVar != ez.J) ? o7.w(this, tk0Var, i, ezVar) : this;
    }

    @Override // defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        ((fw4) this.I).collect(ag1Var, fj0Var);
        return el0.I;
    }

    @Override // defpackage.dw4
    public final Object getValue() {
        return ((fw4) this.I).getValue();
    }
}
