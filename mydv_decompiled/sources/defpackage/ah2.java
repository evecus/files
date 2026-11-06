package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ah2 extends rv4 {
    public final fj0 M;

    public ah2(tk0 tk0Var, hn1 hn1Var) {
        super(tk0Var, false);
        this.M = mu0.n(this, this, hn1Var);
    }

    @Override // defpackage.e62
    public final void Z() {
        try {
            qb.c0(mu0.G(this.M), wd5.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mx0) {
                th = ((mx0) th).I;
            }
            resumeWith(new g54(th));
            throw th;
        }
    }
}
