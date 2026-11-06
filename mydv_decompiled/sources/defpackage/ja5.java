package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ja5 extends ns4 {
    public final ns4 e;
    public final boolean f;
    public final boolean g;
    public tm1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja5(ns4 ns4Var, tm1 tm1Var, boolean z, boolean z2) {
        super(0L, us4.M);
        tm1 e;
        ba4 ba4Var = ws4.a;
        this.e = ns4Var;
        this.f = z;
        this.g = z2;
        this.h = ws4.i(tm1Var, (ns4Var == null || (e = ns4Var.e()) == null) ? ws4.j.e : e, z);
        this.i = li4.e();
    }

    @Override // defpackage.ns4
    public final void c() {
        ns4 ns4Var;
        this.c = true;
        if (!this.g || (ns4Var = this.e) == null) {
            return;
        }
        ns4Var.c();
    }

    @Override // defpackage.ns4
    public final us4 d() {
        return v().d();
    }

    @Override // defpackage.ns4
    public final tm1 e() {
        return this.h;
    }

    @Override // defpackage.ns4
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ns4
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ns4
    public final tm1 i() {
        return null;
    }

    @Override // defpackage.ns4
    public final void k() {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.ns4
    public final void l() {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.ns4
    public final void m() {
        v().m();
    }

    @Override // defpackage.ns4
    public final void n(kw4 kw4Var) {
        v().n(kw4Var);
    }

    @Override // defpackage.ns4
    public final ns4 u(tm1 tm1Var) {
        tm1 i = ws4.i(tm1Var, this.h, true);
        return !this.f ? ws4.e(v().u(null), i, true) : v().u(i);
    }

    public final ns4 v() {
        ns4 ns4Var = this.e;
        return ns4Var == null ? ws4.j : ns4Var;
    }
}
