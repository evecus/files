package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dr1 extends wt0 implements w31 {
    public final sc K;
    public final r61 L;
    public final li3 M;

    public dr1(r05 r05Var, sc scVar, r61 r61Var, li3 li3Var) {
        this.K = scVar;
        this.L = r61Var;
        this.M = li3Var;
        j0(r05Var);
    }

    public static boolean m0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        boolean z;
        char c;
        long j;
        ya2 ya2Var = (ya2) zh0Var;
        r10 r10Var = ya2Var.I;
        long H = r10Var.J.H();
        sc scVar = this.K;
        scVar.j(H);
        pn pnVar = r10Var.J;
        if (fq4.c(pnVar.H())) {
            ya2Var.a();
            return;
        }
        ya2Var.a();
        scVar.d.getValue();
        Canvas b = ba.b(pnVar.q());
        r61 r61Var = this.L;
        boolean f = r61.f(r61Var.f);
        li3 li3Var = this.M;
        if (f) {
            EdgeEffect c2 = r61Var.c();
            float f2 = -Float.intBitsToFloat((int) (ya2Var.c() & 4294967295L));
            z = m0(270.0f, (Float.floatToRawIntBits(ya2Var.P(li3Var.b(ya2Var.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), c2, b);
        } else {
            z = false;
        }
        if (r61.f(r61Var.d)) {
            c = ' ';
            j = 4294967295L;
            z = m0(0.0f, (((long) Float.floatToRawIntBits(ya2Var.P(li3Var.b))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), r61Var.e(), b) || z;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (r61.f(r61Var.g)) {
            z = m0(90.0f, (((long) Float.floatToRawIntBits(ya2Var.P(li3Var.c(ya2Var.getLayoutDirection())) + (-((float) mw2.P(Float.intBitsToFloat((int) (ya2Var.c() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), r61Var.d(), b) || z;
        }
        if (r61.f(r61Var.e)) {
            EdgeEffect b2 = r61Var.b();
            z = m0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ya2Var.c() & j))) + ya2Var.P(li3Var.d))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ya2Var.c() >> c)))) << c), b2, b) || z;
        }
        if (z) {
            scVar.d();
        }
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
