package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ya4 extends c2 implements fl0 {
    public final fj0 M;

    public ya4(fj0 fj0Var, tk0 tk0Var) {
        super(tk0Var, true);
        this.M = fj0Var;
    }

    @Override // defpackage.e62
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fl0
    public final fl0 getCallerFrame() {
        fj0 fj0Var = this.M;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    @Override // defpackage.e62
    public void m(Object obj) {
        qb.c0(mu0.G(this.M), mw2.M(obj));
    }

    @Override // defpackage.e62
    public void o(Object obj) {
        this.M.resumeWith(mw2.M(obj));
    }

    public void i0() {
    }
}
