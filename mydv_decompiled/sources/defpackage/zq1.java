package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zq1 extends s43 {
    @Override // defpackage.s43
    public final s43 D(tm1 tm1Var, tm1 tm1Var2) {
        return (s43) ((ns4) ws4.b(new y41(new cg(tm1Var, tm1Var2, (byte) 1), (byte) 1)));
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void c() {
        synchronized (ws4.c) {
            o();
        }
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void k() {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void l() {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void m() {
        ws4.c();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final ns4 u(tm1 tm1Var) {
        return (o04) ((ns4) ws4.b(new y41(new yq1(tm1Var, (byte) 0), (byte) 1)));
    }

    @Override // defpackage.s43
    public final wi4 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
