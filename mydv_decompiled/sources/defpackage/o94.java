package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o94 implements ti2, AutoCloseable {
    public final String I;
    public final n94 J;
    public boolean K;

    public o94(String str, n94 n94Var) {
        this.I = str;
        this.J = n94Var;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        if (ji2Var == ji2.ON_DESTROY) {
            this.K = false;
            vi2Var.k().b(this);
        }
    }

    public final void g(da daVar, li2 li2Var) {
        daVar.getClass();
        li2Var.getClass();
        if (this.K) {
            zy.i("Already attached to lifecycleOwner");
            return;
        }
        this.K = true;
        li2Var.a(this);
        daVar.s(this.I, (ey0) this.J.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
