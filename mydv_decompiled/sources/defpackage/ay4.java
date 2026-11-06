package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ay4 extends k13 implements na2 {
    public dy4 I;

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
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
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        dy4 dy4Var = this.I;
        dy4Var.getClass();
        ey4 o0 = dy4.o0(dy4Var, 1);
        float f = o0.v((byte) 8) ? o0.k : 0.0f;
        final float f2 = (o0.v((byte) 0) ? o0.c : 0.0f) + f;
        float f3 = (o0.v((byte) 1) ? o0.d : 0.0f) + f;
        final float f4 = (o0.v((byte) 2) ? o0.e : 0.0f) + f;
        float f5 = o0.v((byte) 3) ? o0.f : 0.0f;
        int round = Math.round(f3 + f2);
        int round2 = Math.round(f5 + f + f4);
        final bn3 u = pw2Var.u(eh0.i(-round, -round2, j));
        return ww2Var.A(eh0.g(u.I + round, j), eh0.f(u.J + round2, j), p91.I, new tm1() { // from class: zx4
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3.g((an3) obj, bn3.this, Math.round(f2), Math.round(f4));
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

    @Override // defpackage.k13
    public final void onAttach() {
        la5 p = ad4.p(this, "StyleOuterNode");
        p.getClass();
        dy4 dy4Var = (dy4) p;
        dy4Var.K = this;
        this.I = dy4Var;
        dy4Var.p0(true);
    }
}
