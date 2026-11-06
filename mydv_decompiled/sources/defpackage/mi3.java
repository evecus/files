package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mi3 extends k13 implements na2 {
    public ji3 I;

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
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        float b = this.I.b(ww2Var.getLayoutDirection());
        float d = this.I.d();
        float c = this.I.c(ww2Var.getLayoutDirection());
        float a = this.I.a();
        if (!((r11.b(b, 0.0f) >= 0) & (r11.b(d, 0.0f) >= 0) & (r11.b(c, 0.0f) >= 0) & (r11.b(a, 0.0f) >= 0))) {
            o02.a("Padding must be non-negative");
        }
        int X = ww2Var.X(b);
        int X2 = ww2Var.X(c) + X;
        int X3 = ww2Var.X(d);
        int X4 = ww2Var.X(a) + X3;
        bn3 u = pw2Var.u(eh0.i(-X2, -X4, j));
        return ww2Var.A(eh0.g(u.I + X2, j), eh0.f(u.J + X4, j), p91.I, new sz2(u, X, X3, (byte) 1));
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
