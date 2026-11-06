package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class u12 extends k13 implements na2, la5 {
    public vu5 I;
    public vu5 J;
    public vu5 K;

    public u12(vu5 vu5Var) {
        bf1 bf1Var = j42.w;
        this.I = bf1Var;
        this.J = bf1Var;
        this.K = vu5Var;
    }

    @Override // defpackage.la5
    public final Object g() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public final void j0() {
        this.J = new vd5(this.I, this.K);
        ad4.E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new p12(this, (byte) 0));
        ut0.U(this).H();
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
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        final int d = this.J.d(ww2Var, ww2Var.getLayoutDirection()) - this.I.d(ww2Var, ww2Var.getLayoutDirection());
        final int a = this.J.a(ww2Var) - this.I.a(ww2Var);
        int b = (this.J.b(ww2Var, ww2Var.getLayoutDirection()) - this.I.b(ww2Var, ww2Var.getLayoutDirection())) + d;
        int c = (this.J.c(ww2Var) - this.I.c(ww2Var)) + a;
        final bn3 u = pw2Var.u(eh0.i(-b, -c, j));
        return ww2Var.A(eh0.g(u.I + b, j), eh0.f(u.J + c, j), p91.I, new tm1() { // from class: t12
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3.g((an3) obj, u, d, a);
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
    public void onAttach() {
        ad4.C(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new p12(this, (byte) 1));
        j0();
        super.onAttach();
    }

    @Override // defpackage.k13
    public void onDetach() {
        this.J = this.I;
        ad4.E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new p12(this, (byte) 0));
        super.onDetach();
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        this.I = j42.w;
    }
}
