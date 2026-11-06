package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class or1 implements lr1 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final s10 b;
    public final r10 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public byte k;
    public c80 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public or1(AndroidComposeView androidComposeView, s10 s10Var, r10 r10Var) {
        this.b = s10Var;
        this.c = r10Var;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c44.c(create, c44.a(create));
                c44.d(create, c44.b(create));
            }
            if (i >= 24) {
                b44.a(create);
            } else {
                a44.a(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        N(0);
        this.j = 0;
        this.k = (byte) 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = x70.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.lr1
    public final float A() {
        return this.r;
    }

    @Override // defpackage.lr1
    public final void B(boolean z) {
        this.A = z;
        M();
    }

    @Override // defpackage.lr1
    public final float C() {
        return this.w;
    }

    @Override // defpackage.lr1
    public final void D(int i) {
        this.j = i;
        O();
    }

    @Override // defpackage.lr1
    public final void E(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.lr1
    public final void F(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            c44.d(this.d, qb.i0(j));
        }
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
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.lr1
    public final float I() {
        return this.t;
    }

    @Override // defpackage.lr1
    public final float J() {
        return this.q;
    }

    @Override // defpackage.lr1
    public final void K(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.lr1
    public final int L() {
        return this.k;
    }

    public final void M() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void N(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void O() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            N(i);
        } else {
            N(1);
        }
    }

    public final void P() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void Q() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.lr1
    public final void a(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.lr1
    public final float b() {
        return this.p;
    }

    @Override // defpackage.lr1
    public final void c(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.lr1
    public final void d(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.lr1
    public final void e(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.lr1
    public final void f(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lr1
    public final void g(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z9.j(i)));
        O();
    }

    @Override // defpackage.lr1
    public final float getAlpha() {
        return this.m;
    }

    @Override // defpackage.lr1
    public final c80 getColorFilter() {
        return this.l;
    }

    @Override // defpackage.lr1
    public final void h() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.d;
        if (i >= 24) {
            b44.a(renderNode);
        } else {
            a44.a(renderNode);
        }
    }

    @Override // defpackage.lr1
    public final void i(o10 o10Var) {
        Canvas canvas = ba.a;
        DisplayListCanvas displayListCanvas = ((aa) o10Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.lr1
    public final int j() {
        return this.j;
    }

    @Override // defpackage.lr1
    public final void k(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.lr1
    public final void l(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean b = z22.b(this.e, j);
        this.e = j;
        Q();
        if (b) {
            return;
        }
        if (this.n || pd3.c(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.lr1
    public final float m() {
        return this.x;
    }

    @Override // defpackage.lr1
    public final boolean n() {
        return this.d.isValid();
    }

    @Override // defpackage.lr1
    public final float o() {
        return this.y;
    }

    @Override // defpackage.lr1
    public final void p(long j) {
        this.o = j;
        P();
    }

    @Override // defpackage.lr1
    public final long q() {
        return this.u;
    }

    @Override // defpackage.lr1
    public final void r(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.lr1
    public final void s(c80 c80Var) {
        this.l = c80Var;
        if (c80Var == null) {
            O();
            return;
        }
        N(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(c80Var.a);
        renderNode.setLayerPaint(paint);
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        Q();
        if (z) {
            P();
        }
    }

    @Override // defpackage.lr1
    public final float u() {
        return this.s;
    }

    @Override // defpackage.lr1
    public final long v() {
        return this.v;
    }

    @Override // defpackage.lr1
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            c44.c(this.d, qb.i0(j));
        }
    }

    @Override // defpackage.lr1
    public final void x(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.lr1
    public final float y() {
        return this.z;
    }

    @Override // defpackage.lr1
    public final void z(iu0 iu0Var, da2 da2Var, jr1 jr1Var, kh khVar) {
        or1 or1Var;
        DisplayListCanvas displayListCanvas;
        s10 s10Var;
        aa aaVar;
        Canvas canvas;
        float f;
        r10 r10Var;
        DisplayListCanvas displayListCanvas2;
        iu0 u;
        da2 C;
        o10 q;
        Canvas canvas2;
        long H;
        jr1 jr1Var2;
        int i;
        int i2;
        long b0;
        pn pnVar;
        DisplayListCanvas start = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f2 = this.B;
        float f3 = this.C;
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        try {
            s10Var = this.b;
            aaVar = s10Var.a;
            canvas = aaVar.a;
            aaVar.a = (Canvas) start;
            f = this.B;
            r10Var = this.c;
        } catch (Throwable th) {
            th = th;
            or1Var = this;
            displayListCanvas = start;
        }
        try {
            try {
                try {
                    if (f <= 0.0f) {
                        try {
                            if (this.C <= 0.0f) {
                                long b02 = ut0.b0(this.e);
                                pn pnVar2 = r10Var.J;
                                pn pnVar3 = r10Var.J;
                                u = pnVar2.u();
                                C = pnVar3.C();
                                q = pnVar3.q();
                                canvas2 = canvas;
                                H = pnVar3.H();
                                displayListCanvas2 = start;
                                jr1Var2 = (jr1) pnVar3.c;
                                pnVar3.V(iu0Var);
                                pnVar3.W(da2Var);
                                pnVar3.U(aaVar);
                                pnVar3.X(b02);
                                pnVar3.c = jr1Var;
                                aaVar.f();
                                try {
                                    khVar.invoke(r10Var);
                                    aaVar.n();
                                    pnVar3.V(u);
                                    pnVar3.W(C);
                                    pnVar3.U(q);
                                    pnVar3.X(H);
                                    pnVar3.c = jr1Var2;
                                    s10Var.a.a = canvas2;
                                    this.d.end(displayListCanvas2);
                                    return;
                                } finally {
                                    aaVar.n();
                                    pn pnVar4 = r10Var.J;
                                    pnVar4.V(u);
                                    pnVar4.W(C);
                                    pnVar4.U(q);
                                    pnVar4.X(H);
                                    pnVar4.c = jr1Var2;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvas2 = start;
                            or1Var = this;
                            displayListCanvas = displayListCanvas2;
                            or1Var.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    khVar.invoke(r10Var);
                    aaVar.n();
                    pnVar.V(u);
                    pnVar.W(C);
                    pnVar.U(q);
                    pnVar.X(H);
                    pnVar.c = jr1Var2;
                    aaVar.m(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    s10Var.a.a = canvas2;
                    this.d.end(displayListCanvas2);
                    return;
                } catch (Throwable th3) {
                    or1Var = this;
                    displayListCanvas = displayListCanvas2;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        or1Var.d.end(displayListCanvas);
                        throw th;
                    }
                }
                jr1Var2 = (jr1) pnVar.c;
                pnVar.V(iu0Var);
                pnVar.W(da2Var);
                pnVar.U(aaVar);
                pnVar.X(b0);
                pnVar.c = jr1Var;
                aaVar.f();
            } catch (Throwable th5) {
                th = th5;
                or1Var = this;
                displayListCanvas = displayListCanvas2;
                or1Var.d.end(displayListCanvas);
                throw th;
            }
            displayListCanvas2 = start;
            canvas2 = canvas;
            i = (int) (floatToRawIntBits >> 32);
            i2 = (int) (floatToRawIntBits & 4294967295L);
            aaVar.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            b0 = ut0.b0(this.e);
            pn pnVar5 = r10Var.J;
            pnVar = r10Var.J;
            u = pnVar5.u();
            C = pnVar.C();
            q = pnVar.q();
            H = pnVar.H();
        } catch (Throwable th6) {
            th = th6;
            or1Var = this;
            displayListCanvas = displayListCanvas2;
            or1Var.d.end(displayListCanvas);
            throw th;
        }
    }

    public /* synthetic */ or1(AndroidComposeView androidComposeView) {
        this(androidComposeView, new s10(), new r10());
    }
}
