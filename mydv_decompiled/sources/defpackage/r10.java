package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r10 implements y31 {
    public final q10 I;
    public final pn J;
    public pd K;
    public pd L;

    public r10() {
        lu0 lu0Var = i42.h;
        q10 q10Var = new q10();
        q10Var.a = lu0Var;
        q10Var.b = da2.I;
        q10Var.c = k91.a;
        q10Var.d = 0L;
        this.I = q10Var;
        this.J = new pn(this);
    }

    public static qj3 a(r10 r10Var, long j, z31 z31Var, float f, int i) {
        qj3 d = r10Var.d(z31Var);
        if (f != 1.0f) {
            j = x70.c(j, x70.d(j) * f);
        }
        pd pdVar = (pd) d;
        long a = pdVar.a();
        int i2 = x70.h;
        if (!zc5.a(a, j)) {
            pdVar.f(j);
        }
        if (pdVar.c != null) {
            pdVar.i(null);
        }
        if (!j42.c(pdVar.d, null)) {
            pdVar.g(null);
        }
        if (pdVar.b != i) {
            pdVar.e(i);
        }
        if (pdVar.a.isFilterBitmap()) {
            return d;
        }
        pdVar.h(1);
        return d;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.y31
    public final void K(tw1 tw1Var, long j, long j2, long j3, long j4, float f, c80 c80Var, int i) {
        this.I.c.h(tw1Var, j, j2, j3, j4, b(null, me1.a, f, c80Var, 3, i));
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.I.a.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.y31
    public final pn S() {
        return this.J;
    }

    @Override // defpackage.y31
    public final void T(jr1 jr1Var, long j, tm1 tm1Var) {
        jr1Var.e(this, this.I.b, j, new x31(this, tm1Var, (byte) 0));
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    @Override // defpackage.y31
    public final long Y() {
        return ad4.q(this.J.H());
    }

    @Override // defpackage.y31
    public final void Z(yd ydVar, long j, z31 z31Var) {
        this.I.c.d(ydVar, a(this, j, z31Var, 1.0f, 3));
    }

    public final qj3 b(wy wyVar, z31 z31Var, float f, c80 c80Var, int i, int i2) {
        qj3 d = d(z31Var);
        if (wyVar != null) {
            wyVar.a(f, this.J.H(), d);
        } else {
            pd pdVar = (pd) d;
            if (pdVar.c != null) {
                pdVar.i(null);
            }
            long a = pdVar.a();
            long j = x70.b;
            if (!zc5.a(a, j)) {
                pdVar.f(j);
            }
            if (pdVar.a.getAlpha() / 255.0f != f) {
                pdVar.d(f);
            }
        }
        pd pdVar2 = (pd) d;
        if (!j42.c(pdVar2.d, c80Var)) {
            pdVar2.g(c80Var);
        }
        if (pdVar2.b != i) {
            pdVar2.e(i);
        }
        if (pdVar2.a.isFilterBitmap() == i2) {
            return d;
        }
        pdVar2.h(i2);
        return d;
    }

    @Override // defpackage.y31
    public final void b0(wy wyVar, long j, long j2, long j3, float f, z31 z31Var, c80 c80Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.I.c.b(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(wyVar, z31Var, f, c80Var, i, 1));
    }

    @Override // defpackage.y31
    public final long c() {
        return this.J.H();
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    public final qj3 d(z31 z31Var) {
        if (j42.c(z31Var, me1.a)) {
            pd pdVar = this.K;
            if (pdVar != null) {
                return pdVar;
            }
            pd U = i42.U();
            U.m(0);
            this.K = U;
            return U;
        }
        if (!(z31Var instanceof rx4)) {
            s83.v();
            return null;
        }
        pd pdVar2 = this.L;
        if (pdVar2 == null) {
            pdVar2 = i42.U();
            pdVar2.m(1);
            this.L = pdVar2;
        }
        Paint paint = pdVar2.a;
        float strokeWidth = paint.getStrokeWidth();
        rx4 rx4Var = (rx4) z31Var;
        float f = rx4Var.a;
        if (strokeWidth != f) {
            pdVar2.l(f);
        }
        int b = pdVar2.b();
        int i = rx4Var.c;
        if (b != i) {
            pdVar2.j(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = rx4Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int c = pdVar2.c();
        int i2 = rx4Var.d;
        if (c == i2) {
            return pdVar2;
        }
        pdVar2.k(i2);
        return pdVar2;
    }

    @Override // defpackage.y31
    public final void e(tw1 tw1Var, long j, float f, c80 c80Var, int i) {
        this.I.c.p(tw1Var, j, b(null, me1.a, f, c80Var, i, 1));
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I.a.getDensity();
    }

    @Override // defpackage.y31
    public final da2 getLayoutDirection() {
        return this.I.b;
    }

    @Override // defpackage.y31
    public final void h0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.I.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, me1.a, f, i));
    }

    @Override // defpackage.y31
    public final void i0(wy wyVar, long j, long j2, float f, z31 z31Var, c80 c80Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.I.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(wyVar, z31Var, f, c80Var, i, 1));
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.y31
    public final void m(yd ydVar, wy wyVar, float f, z31 z31Var, c80 c80Var, int i) {
        this.I.c.d(ydVar, b(wyVar, z31Var, f, c80Var, i, 1));
    }

    @Override // defpackage.y31
    public final void n(float f, long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.I.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, me1.a, f, 3));
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    @Override // defpackage.y31
    public final void r(long j, float f, long j2, float f2) {
        this.I.c.o(f, j2, a(this, j, me1.a, f2, 3));
    }

    @Override // defpackage.y31
    public final void x(long j, long j2, long j3, float f) {
        o10 o10Var = this.I.c;
        pd pdVar = this.L;
        if (pdVar == null) {
            pdVar = i42.U();
            pdVar.m(1);
            this.L = pdVar;
        }
        Paint paint = pdVar.a;
        long a = pdVar.a();
        int i = x70.h;
        if (!zc5.a(a, j)) {
            pdVar.f(j);
        }
        if (pdVar.c != null) {
            pdVar.i(null);
        }
        if (!j42.c(pdVar.d, null)) {
            pdVar.g(null);
        }
        if (pdVar.b != 3) {
            pdVar.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            pdVar.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (pdVar.b() != 0) {
            pdVar.j(0);
        }
        if (pdVar.c() != 0) {
            pdVar.k(0);
        }
        if (!paint.isFilterBitmap()) {
            pdVar.h(1);
        }
        o10Var.a(j2, j3, pdVar);
    }
}
