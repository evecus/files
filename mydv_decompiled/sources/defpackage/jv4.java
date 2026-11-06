package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jv4 extends k13 implements na2 {
    public hv4 I;

    @Override // defpackage.na2
    public final /* bridge */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* bridge */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        pw2Var.getClass();
        boolean d = dh0.d(j);
        p91 p91Var = p91.I;
        if (!d || !dh0.c(j)) {
            bn3 u = pw2Var.u(j);
            return ww2Var.A(u.I, u.J, p91Var, new sa(u, (byte) 7));
        }
        int h = dh0.h(j);
        int g = dh0.g(j);
        v22 h2 = p9.h(h, g, this.I.b.h(), 0, ww2Var.X(((r11) this.I.e.getValue()).I));
        int c = h2.c();
        int a = h2.a();
        if (!((a >= 0) & (c >= 0))) {
            s02.a("width and height must be >= 0");
        }
        return ww2Var.A(h, g, p91Var, new ig(pw2Var.u(eh0.h(c, c, a, a)), h2, this, (byte) 4));
    }

    @Override // defpackage.na2
    public final /* bridge */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* bridge */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}
