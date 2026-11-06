package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rr1 implements lr1 {
    public static final qr1 H = new qr1();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final u31 b;
    public final s10 c;
    public final or5 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public byte n;
    public c80 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public rr1(u31 u31Var) {
        s10 s10Var = new s10();
        r10 r10Var = new r10();
        this.b = u31Var;
        this.c = s10Var;
        or5 or5Var = new or5(u31Var, s10Var, r10Var);
        this.d = or5Var;
        this.e = u31Var.getResources();
        this.f = new Rect();
        u31Var.addView(or5Var);
        or5Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = (byte) 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = x70.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.lr1
    public final float A() {
        return this.v;
    }

    @Override // defpackage.lr1
    public final void B(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.lr1
    public final float C() {
        return this.A;
    }

    @Override // defpackage.lr1
    public final void D(int i) {
        this.p = i;
        O();
    }

    @Override // defpackage.lr1
    public final void E(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.lr1
    public final void F(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            ck.K(qb.i0(j), this.d);
        }
    }

    @Override // defpackage.lr1
    public final Matrix G() {
        return this.d.getMatrix();
    }

    @Override // defpackage.lr1
    public final void H(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.lr1
    public final float I() {
        return this.x;
    }

    @Override // defpackage.lr1
    public final float J() {
        return this.u;
    }

    @Override // defpackage.lr1
    public final void K(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.lr1
    public final int L() {
        return this.n;
    }

    public final void M(int i) {
        Paint paint = this.g;
        or5 or5Var = this.d;
        boolean z = true;
        if (i == 1) {
            or5Var.setLayerType(2, paint);
        } else if (i == 2) {
            or5Var.setLayerType(0, paint);
            z = false;
        } else {
            or5Var.setLayerType(0, paint);
        }
        or5Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void N() {
        boolean z = this.m;
        or5 or5Var = this.d;
        if (z || or5Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        or5Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void O() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            M(i);
        } else {
            M(1);
        }
    }

    public final void P() {
        boolean z = this.r;
        or5 or5Var = this.d;
        if (z || pd3.c(this.s, 9205357640488583168L)) {
            or5Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            or5Var.setPivotY((((int) (4294967295L & this.j)) / 2.0f) + this.E);
        } else {
            or5Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            or5Var.setPivotY(Float.intBitsToFloat((int) (4294967295L & this.s)) + this.E);
        }
    }

    @Override // defpackage.lr1
    public final void a(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.lr1
    public final float b() {
        return this.t;
    }

    @Override // defpackage.lr1
    public final void c(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.lr1
    public final void d(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.lr1
    public final void e(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.lr1
    public final void f(Outline outline, long j) {
        or5 or5Var = this.d;
        or5Var.M = outline;
        or5Var.invalidateOutline();
        if ((this.m || or5Var.getClipToOutline()) && outline != null) {
            or5Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lr1
    public final void g(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z9.j(i)));
        O();
    }

    @Override // defpackage.lr1
    public final float getAlpha() {
        return this.q;
    }

    @Override // defpackage.lr1
    public final c80 getColorFilter() {
        return this.o;
    }

    @Override // defpackage.lr1
    public final void h() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.lr1
    public final void i(o10 o10Var) {
        Rect rect;
        boolean z = this.k;
        or5 or5Var = this.d;
        if (z) {
            if ((this.m || or5Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = or5Var.getWidth();
                rect.bottom = or5Var.getHeight();
            } else {
                rect = null;
            }
            or5Var.setClipBounds(rect);
        }
        Canvas canvas = ba.a;
        if (((aa) o10Var).a.isHardwareAccelerated()) {
            this.b.a(o10Var, or5Var, or5Var.getDrawingTime());
        }
    }

    @Override // defpackage.lr1
    public final int j() {
        return this.p;
    }

    @Override // defpackage.lr1
    public final void k(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.lr1
    public final void l(int i, int i2, long j) {
        if (!z22.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            N();
            return;
        }
        int i3 = this.h;
        or5 or5Var = this.d;
        if (i3 != i) {
            or5Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            or5Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.lr1
    public final float m() {
        return this.B;
    }

    @Override // defpackage.lr1
    public final boolean n() {
        return true;
    }

    @Override // defpackage.lr1
    public final float o() {
        return this.C;
    }

    @Override // defpackage.lr1
    public final void p(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        P();
    }

    @Override // defpackage.lr1
    public final long q() {
        return this.y;
    }

    @Override // defpackage.lr1
    public final void r(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.lr1
    public final void s(c80 c80Var) {
        this.o = c80Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
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
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        N();
        if (z) {
            P();
        }
    }

    @Override // defpackage.lr1
    public final float u() {
        return this.w;
    }

    @Override // defpackage.lr1
    public final long v() {
        return this.z;
    }

    @Override // defpackage.lr1
    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            ck.J(qb.i0(j), this.d);
        }
    }

    @Override // defpackage.lr1
    public final void x(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.lr1
    public final float y() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.lr1
    public final void z(iu0 iu0Var, da2 da2Var, jr1 jr1Var, kh khVar) {
        or5 or5Var = this.d;
        ViewParent parent = or5Var.getParent();
        u31 u31Var = this.b;
        if (parent == null) {
            u31Var.addView(or5Var);
        }
        float f = this.D;
        float f2 = this.E;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        or5Var.O = iu0Var;
        or5Var.P = da2Var;
        or5Var.Q = khVar;
        or5Var.R = jr1Var;
        or5Var.S = intBitsToFloat;
        or5Var.T = intBitsToFloat2;
        if (or5Var.isAttachedToWindow()) {
            or5Var.setVisibility(4);
            or5Var.setVisibility(0);
            try {
                aa aaVar = this.c.a;
                qr1 qr1Var = H;
                Canvas canvas = aaVar.a;
                aaVar.a = qr1Var;
                u31Var.a(aaVar, or5Var, or5Var.getDrawingTime());
                aaVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }
}
