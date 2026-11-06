package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pr1 implements lr1 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final s10 b;
    public final r10 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public byte j;
    public c80 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public pr1() {
        s10 s10Var = new s10();
        r10 r10Var = new r10();
        this.b = s10Var;
        this.c = r10Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        N(renderNode, 0);
        this.i = 1.0f;
        this.j = (byte) 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = x70.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.G = 0;
    }

    @Override // defpackage.lr1
    public final float A() {
        return this.o;
    }

    @Override // defpackage.lr1
    public final void B(boolean z) {
        this.x = z;
        M();
    }

    @Override // defpackage.lr1
    public final float C() {
        return this.t;
    }

    @Override // defpackage.lr1
    public final void D(int i) {
        this.G = i;
        O();
    }

    @Override // defpackage.lr1
    public final void E(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.lr1
    public final void F(long j) {
        this.s = j;
        this.d.setSpotShadowColor(qb.i0(j));
    }

    @Override // defpackage.lr1
    public final Matrix G() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.lr1
    public final void H(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.lr1
    public final float I() {
        return this.q;
    }

    @Override // defpackage.lr1
    public final float J() {
        return this.n;
    }

    @Override // defpackage.lr1
    public final void K(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.lr1
    public final int L() {
        return this.j;
    }

    public final void M() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void N(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void O() {
        int i = this.G;
        if (i != 1 && this.j == 3 && this.k == null) {
            N(this.d, i);
        } else {
            N(this.d, 1);
        }
    }

    public final void P() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void Q() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.lr1
    public final void a(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.lr1
    public final float b() {
        return this.m;
    }

    @Override // defpackage.lr1
    public final void c(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.lr1
    public final void d(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.lr1
    public final void e(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.lr1
    public final void f(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lr1
    public final void g(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(z9.i(i));
        O();
    }

    @Override // defpackage.lr1
    public final float getAlpha() {
        return this.i;
    }

    @Override // defpackage.lr1
    public final c80 getColorFilter() {
        return this.k;
    }

    @Override // defpackage.lr1
    public final void h() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.lr1
    public final void i(o10 o10Var) {
        Canvas canvas = ba.a;
        ((aa) o10Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.lr1
    public final int j() {
        return this.G;
    }

    @Override // defpackage.lr1
    public final void k(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.lr1
    public final void l(int i, int i2, long j) {
        this.E = i;
        this.F = i2;
        boolean a = fq4.a(this.e, ut0.b0(j));
        this.e = ut0.b0(j);
        Q();
        if (a || !pd3.c(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.lr1
    public final float m() {
        return this.u;
    }

    @Override // defpackage.lr1
    public final boolean n() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.lr1
    public final float o() {
        return this.v;
    }

    @Override // defpackage.lr1
    public final void p(long j) {
        this.l = j;
        P();
    }

    @Override // defpackage.lr1
    public final long q() {
        return this.r;
    }

    @Override // defpackage.lr1
    public final void r(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.lr1
    public final void s(c80 c80Var) {
        this.k = c80Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(c80Var != null ? c80Var.a : null);
        O();
    }

    @Override // defpackage.lr1
    public final void t(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder D = hf1.D("Outsets cannot be negative! Left: ", i, ", Top: ", i2, ", Right: ");
            D.append(i3);
            D.append(", Bottom: ");
            D.append(i4);
            p02.a(D.toString());
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        Q();
        if (z) {
            P();
        }
    }

    @Override // defpackage.lr1
    public final float u() {
        return this.p;
    }

    @Override // defpackage.lr1
    public final long v() {
        return this.s;
    }

    @Override // defpackage.lr1
    public final void w(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(qb.i0(j));
    }

    @Override // defpackage.lr1
    public final void x(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.lr1
    public final float y() {
        return this.w;
    }

    @Override // defpackage.lr1
    public final void z(iu0 iu0Var, da2 da2Var, jr1 jr1Var, kh khVar) {
        r10 r10Var = this.c;
        RecordingCanvas beginRecording = this.d.beginRecording();
        float f = this.y;
        float f2 = this.z;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            s10 s10Var = this.b;
            aa aaVar = s10Var.a;
            Canvas canvas = aaVar.a;
            aaVar.a = beginRecording;
            pn pnVar = r10Var.J;
            pnVar.V(iu0Var);
            pnVar.W(da2Var);
            pnVar.c = jr1Var;
            pnVar.X(this.e);
            pnVar.U(aaVar);
            if (this.y <= 0.0f && this.z <= 0.0f) {
                khVar.invoke(r10Var);
                s10Var.a.a = canvas;
                this.d.endRecording();
            }
            int i = (int) (floatToRawIntBits >> 32);
            int i2 = (int) (floatToRawIntBits & 4294967295L);
            aaVar.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            khVar.invoke(r10Var);
            aaVar.m(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            s10Var.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }
}
