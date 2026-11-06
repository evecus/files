package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mi2 implements ti2, dl0 {
    public final li2 I;
    public final tk0 J;

    public mi2(li2 li2Var, tk0 tk0Var) {
        tk0Var.getClass();
        this.I = li2Var;
        this.J = tk0Var;
        if (((xi2) li2Var).i == ki2.I) {
            vt0.j(tk0Var, null);
        }
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        li2 li2Var = this.I;
        if (((xi2) li2Var).i.compareTo(ki2.I) <= 0) {
            li2Var.b(this);
            vt0.j(this.J, null);
        }
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.J;
    }
}
