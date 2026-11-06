package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hz5 extends k13 implements na2 {
    public jx0 I;
    public hn1 J;

    public hz5(jx0 jx0Var, hn1 hn1Var) {
        this.I = jx0Var;
        this.J = hn1Var;
    }

    public final void j0(hn1 hn1Var) {
        this.J = hn1Var;
    }

    public final void k0(jx0 jx0Var) {
        this.I = jx0Var;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(final ww2 ww2Var, pw2 pw2Var, long j) {
        final bn3 u = pw2Var.u(eh0.a(this.I != jx0.I ? 0 : dh0.j(j), dh0.h(j), this.I == jx0.J ? dh0.i(j) : 0, dh0.g(j)));
        final int r = ut0.r(u.I, dh0.j(j), dh0.h(j));
        final int r2 = ut0.r(u.J, dh0.i(j), dh0.g(j));
        return ww2Var.A(r, r2, p91.I, new tm1() { // from class: gz5
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                hn1 hn1Var = hz5.this.J;
                an3.h((an3) obj, u, ((r22) hn1Var.invoke(new z22(((r - r1.I) << 32) | ((r2 - r1.J) & 4294967295L)), ww2Var.getLayoutDirection())).a);
                return wd5.a;
            }
        });
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}
