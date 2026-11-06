package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d60 extends y52 implements c60 {
    public final e62 M;

    public d60(e62 e62Var) {
        this.M = e62Var;
    }

    @Override // defpackage.c60
    public final boolean a(Throwable th) {
        return j().v(th);
    }

    @Override // defpackage.c60
    public final v52 getParent() {
        return j();
    }

    @Override // defpackage.y52
    public final boolean k() {
        return true;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        this.M.q(j());
    }
}
