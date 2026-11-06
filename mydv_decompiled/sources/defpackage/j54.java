package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j54 extends y52 {
    public final a62 M;

    public j54(a62 a62Var) {
        this.M = a62Var;
    }

    @Override // defpackage.y52
    public final boolean k() {
        return false;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        Object H = j().H();
        boolean z = H instanceof ub0;
        a62 a62Var = this.M;
        if (z) {
            a62Var.resumeWith(mu0.o(((ub0) H).a));
        } else {
            a62Var.resumeWith(p70.B0(H));
        }
    }
}
