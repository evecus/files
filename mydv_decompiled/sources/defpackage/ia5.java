package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ia5 extends s43 {
    public final s43 o;
    public final boolean p;
    public final boolean q;
    public tm1 r;
    public tm1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ia5(defpackage.s43 r8, defpackage.tm1 r9, defpackage.tm1 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            ba4 r0 = defpackage.ws4.a
            if (r8 == 0) goto La
            tm1 r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            zq1 r0 = defpackage.ws4.j
            tm1 r0 = r0.e
        Le:
            tm1 r5 = defpackage.ws4.i(r9, r0, r11)
            if (r8 == 0) goto L1a
            tm1 r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            zq1 r9 = defpackage.ws4.j
            tm1 r9 = r9.f
        L1e:
            tm1 r6 = defpackage.ws4.j(r10, r9)
            r2 = 0
            us4 r4 = defpackage.us4.M
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            tm1 r7 = r1.e
            r1.r = r7
            tm1 r7 = r1.f
            r1.s = r7
            long r7 = defpackage.li4.e()
            r1.t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia5.<init>(s43, tm1, tm1, boolean, boolean):void");
    }

    @Override // defpackage.s43
    public final void C(o43 o43Var) {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.s43
    public final s43 D(tm1 tm1Var, tm1 tm1Var2) {
        tm1 i = ws4.i(tm1Var, this.r, true);
        tm1 j = ws4.j(tm1Var2, this.s);
        return !this.p ? new ia5(E().D(null, j), i, j, false, true) : E().D(i, j);
    }

    public final s43 E() {
        s43 s43Var = this.o;
        return s43Var == null ? ws4.j : s43Var;
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void c() {
        s43 s43Var;
        this.c = true;
        if (!this.q || (s43Var = this.o) == null) {
            return;
        }
        s43Var.c();
    }

    @Override // defpackage.ns4
    public final us4 d() {
        return E().d();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final tm1 e() {
        return this.r;
    }

    @Override // defpackage.ns4
    public final boolean f() {
        return E().f();
    }

    @Override // defpackage.ns4
    public final long g() {
        return E().g();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final int h() {
        return E().h();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final tm1 i() {
        return this.s;
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
        E().m();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void n(kw4 kw4Var) {
        E().n(kw4Var);
    }

    @Override // defpackage.ns4
    public final void r(us4 us4Var) {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.ns4
    public final void s(long j) {
        mw2.Y();
        throw null;
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void t(int i) {
        E().t(i);
    }

    @Override // defpackage.s43, defpackage.ns4
    public final ns4 u(tm1 tm1Var) {
        tm1 i = ws4.i(tm1Var, this.r, true);
        return !this.p ? ws4.e(E().u(null), i, true) : E().u(i);
    }

    @Override // defpackage.s43
    public final wi4 w() {
        return E().w();
    }

    @Override // defpackage.s43
    public final o43 x() {
        return E().x();
    }

    @Override // defpackage.s43
    /* renamed from: y */
    public final tm1 e() {
        return this.r;
    }
}
