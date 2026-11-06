package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ya2 implements y31, zh0 {
    public final r10 I = new r10();
    public w31 J;

    @Override // defpackage.iu0
    public final long B(float f) {
        return this.I.B(f);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return this.I.F(i);
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / this.I.getDensity();
    }

    @Override // defpackage.y31
    public final void K(tw1 tw1Var, long j, long j2, long j3, long j4, float f, c80 c80Var, int i) {
        this.I.K(tw1Var, j, j2, j3, j4, f, c80Var, i);
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.I.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.I.getDensity() * f;
    }

    @Override // defpackage.y31
    public final pn S() {
        return this.I.J;
    }

    @Override // defpackage.y31
    public final void T(jr1 jr1Var, long j, tm1 tm1Var) {
        jr1Var.e(this, getLayoutDirection(), j, new m6((Object) this, (Object) this.J, (Object) tm1Var, (byte) 13));
    }

    @Override // defpackage.iu0
    public final int X(float f) {
        return r7.b(f, this.I);
    }

    @Override // defpackage.y31
    public final long Y() {
        return this.I.Y();
    }

    @Override // defpackage.y31
    public final void Z(yd ydVar, long j, z31 z31Var) {
        this.I.Z(ydVar, j, z31Var);
    }

    public final void a() {
        r10 r10Var = this.I;
        pn pnVar = r10Var.J;
        o10 q = r10Var.J.q();
        w31 w31Var = this.J;
        if (w31Var == null) {
            throw r7.t("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        k13 child$ui = w31Var.getNode().getChild$ui();
        if (child$ui != null && (child$ui.getAggregateChildKindSet$ui() & 4) != 0) {
            while (child$ui != null && (child$ui.getKindSet$ui() & 2) == 0) {
                if ((child$ui.getKindSet$ui() & 4) != 0) {
                    break;
                } else {
                    child$ui = child$ui.getChild$ui();
                }
            }
        }
        child$ui = null;
        if (child$ui == null) {
            na3 S = ut0.S(w31Var, 4);
            if (S.K0() == w31Var.getNode()) {
                S = S.d0;
                S.getClass();
            }
            S.a1(q, (jr1) pnVar.c);
            return;
        }
        b53 b53Var = null;
        while (child$ui != null) {
            if (child$ui instanceof w31) {
                w31 w31Var2 = (w31) child$ui;
                jr1 jr1Var = (jr1) pnVar.c;
                na3 S2 = ut0.S(w31Var2, 4);
                long b0 = ut0.b0(S2.K);
                wa2 wa2Var = S2.c0;
                wa2Var.getClass();
                za2.a(wa2Var).getSharedDrawScope().b(q, b0, S2, w31Var2, jr1Var);
            } else if ((child$ui.getKindSet$ui() & 4) != 0 && (child$ui instanceof wt0)) {
                int i = 0;
                for (k13 k13Var = ((wt0) child$ui).J; k13Var != null; k13Var = k13Var.getChild$ui()) {
                    if ((k13Var.getKindSet$ui() & 4) != 0) {
                        i++;
                        if (i == 1) {
                            child$ui = k13Var;
                        } else {
                            if (b53Var == null) {
                                b53Var = new b53(new k13[16]);
                            }
                            if (child$ui != null) {
                                b53Var.c(child$ui);
                                child$ui = null;
                            }
                            b53Var.c(k13Var);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            child$ui = ut0.M(b53Var);
        }
    }

    public final void b(o10 o10Var, long j, na3 na3Var, w31 w31Var, jr1 jr1Var) {
        w31 w31Var2 = this.J;
        this.J = w31Var;
        da2 da2Var = na3Var.c0.h0;
        pn pnVar = this.I.J;
        iu0 u = pnVar.u();
        da2 C = pnVar.C();
        o10 q = pnVar.q();
        long H = pnVar.H();
        jr1 jr1Var2 = (jr1) pnVar.c;
        pnVar.V(na3Var);
        pnVar.W(da2Var);
        pnVar.U(o10Var);
        pnVar.X(j);
        pnVar.c = jr1Var;
        o10Var.f();
        try {
            w31Var.draw(this);
            o10Var.n();
            pnVar.V(u);
            pnVar.W(C);
            pnVar.U(q);
            pnVar.X(H);
            pnVar.c = jr1Var2;
            this.J = w31Var2;
        } catch (Throwable th) {
            o10Var.n();
            pnVar.V(u);
            pnVar.W(C);
            pnVar.U(q);
            pnVar.X(H);
            pnVar.c = jr1Var2;
            throw th;
        }
    }

    @Override // defpackage.y31
    public final void b0(wy wyVar, long j, long j2, long j3, float f, z31 z31Var, c80 c80Var, int i) {
        this.I.b0(wyVar, j, j2, j3, f, z31Var, c80Var, i);
    }

    @Override // defpackage.y31
    public final long c() {
        return this.I.J.H();
    }

    @Override // defpackage.iu0
    public final long c0(long j) {
        return r7.e(j, this.I);
    }

    @Override // defpackage.y31
    public final void e(tw1 tw1Var, long j, float f, c80 c80Var, int i) {
        this.I.e(tw1Var, j, f, c80Var, i);
    }

    @Override // defpackage.iu0
    public final float f0(long j) {
        return r7.d(j, this.I);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I.getDensity();
    }

    @Override // defpackage.y31
    public final da2 getLayoutDirection() {
        return this.I.I.b;
    }

    @Override // defpackage.y31
    public final void h0(long j, long j2, long j3, float f, int i) {
        this.I.h0(j, j2, j3, f, i);
    }

    @Override // defpackage.y31
    public final void i0(wy wyVar, long j, long j2, float f, z31 z31Var, c80 c80Var, int i) {
        this.I.i0(wyVar, j, j2, f, z31Var, c80Var, i);
    }

    @Override // defpackage.iu0
    public final long k(long j) {
        return r7.c(j, this.I);
    }

    @Override // defpackage.y31
    public final void m(yd ydVar, wy wyVar, float f, z31 z31Var, c80 c80Var, int i) {
        this.I.m(ydVar, wyVar, f, z31Var, c80Var, i);
    }

    @Override // defpackage.y31
    public final void n(float f, long j, long j2, long j3, long j4) {
        this.I.n(f, j, j2, j3, j4);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        return hf1.f(j, this.I);
    }

    @Override // defpackage.y31
    public final void r(long j, float f, long j2, float f2) {
        this.I.r(j, f, j2, f2);
    }

    @Override // defpackage.y31
    public final void x(long j, long j2, long j3, float f) {
        this.I.x(j, j2, j3, f);
    }
}
