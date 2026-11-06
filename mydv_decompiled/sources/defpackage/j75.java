package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j75 extends k13 implements na2 {
    public t33 I;
    public boolean J;
    public ve1 K;
    public boolean L;
    public bh M;
    public bh N;
    public float O;
    public float P;

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
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        float f;
        float f2 = qg5.o0;
        float f3 = qg5.j0;
        byte b = 0;
        byte b2 = 1;
        boolean z = (pw2Var.b(dh0.h(j)) == 0 || pw2Var.t(dh0.g(j)) == 0) ? false : true;
        if (this.L) {
            f = qg5.h0;
        } else if (z || this.J) {
            float f4 = t05.a;
            f = f3;
        } else {
            float f5 = t05.a;
            f = qg5.s0;
        }
        float P = ww2Var.P(f);
        bh bhVar = this.N;
        int floatValue = (int) (bhVar != null ? ((Number) bhVar.d()).floatValue() : P);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            s02.a("width and height must be >= 0");
        }
        bn3 u = pw2Var.u(eh0.h(floatValue, floatValue, floatValue, floatValue));
        float f6 = t05.a;
        float P2 = ww2Var.P((qg5.n0 - ww2Var.H(P)) / 2.0f);
        float P3 = ww2Var.P((qg5.q0 - f3) - t05.a);
        boolean z2 = this.L;
        if (z2 && this.J) {
            P2 = P3 - ww2Var.P(f2);
        } else if (z2 && !this.J) {
            P2 = ww2Var.P(f2);
        } else if (this.J) {
            P2 = P3;
        }
        bh bhVar2 = this.N;
        fj0 fj0Var = null;
        Float f7 = bhVar2 != null ? (Float) bhVar2.e.getValue() : null;
        if (f7 == null || f7.floatValue() != P) {
            p70.g0(getCoroutineScope(), null, null, new i75(this, P, fj0Var, b), 3);
        }
        bh bhVar3 = this.M;
        Float f8 = bhVar3 != null ? (Float) bhVar3.e.getValue() : null;
        if (f8 == null || f8.floatValue() != P2) {
            p70.g0(getCoroutineScope(), null, null, new i75(this, P2, fj0Var, b2), 3);
        }
        if (Float.isNaN(this.P) && Float.isNaN(this.O)) {
            this.P = P;
            this.O = P2;
        }
        return ww2Var.A(floatValue, floatValue, p91.I, new dc(u, this, P2));
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
        p70.g0(getCoroutineScope(), null, null, new h40((Object) this, (fj0) null, (byte) 25), 3);
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        this.M = null;
        this.N = null;
        this.P = Float.NaN;
        this.O = Float.NaN;
    }
}
