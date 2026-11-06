package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class or5 extends View {
    public static final uw0 U = new uw0((byte) 2);
    public final u31 I;
    public final s10 J;
    public final r10 K;
    public boolean L;
    public Outline M;
    public boolean N;
    public iu0 O;
    public da2 P;
    public tm1 Q;
    public jr1 R;
    public float S;
    public float T;

    public or5(u31 u31Var, s10 s10Var, r10 r10Var) {
        super(u31Var.getContext());
        this.I = u31Var;
        this.J = s10Var;
        this.K = r10Var;
        setOutlineProvider(U);
        this.N = true;
        this.O = i42.h;
        this.P = da2.I;
        lr1.a.getClass();
        this.Q = fh.R;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        aa aaVar;
        pn pnVar;
        iu0 u;
        da2 C;
        o10 q;
        long H;
        jr1 jr1Var;
        float f = this.S;
        r10 r10Var = this.K;
        s10 s10Var = this.J;
        if (f > 0.0f || this.T > 0.0f) {
            int save = canvas.save();
            canvas.translate(this.S, this.T);
            aaVar = s10Var.a;
            Canvas canvas2 = aaVar.a;
            aaVar.a = canvas;
            iu0 iu0Var = this.O;
            da2 da2Var = this.P;
            float width = getWidth();
            float height = getHeight();
            long floatToRawIntBits = (4294967295L & Float.floatToRawIntBits(height)) | (Float.floatToRawIntBits(width) << 32);
            jr1 jr1Var2 = this.R;
            tm1 tm1Var = this.Q;
            pn pnVar2 = r10Var.J;
            pnVar = r10Var.J;
            u = pnVar2.u();
            C = pnVar.C();
            q = pnVar.q();
            H = pnVar.H();
            jr1Var = (jr1) pnVar.c;
            pnVar.V(iu0Var);
            pnVar.W(da2Var);
            pnVar.U(aaVar);
            pnVar.X(floatToRawIntBits);
            pnVar.c = jr1Var2;
            aaVar.f();
            try {
                tm1Var.invoke(r10Var);
                aaVar.n();
                pnVar.V(u);
                pnVar.W(C);
                pnVar.U(q);
                pnVar.X(H);
                pnVar.c = jr1Var;
                s10Var.a.a = canvas2;
                canvas.restoreToCount(save);
            } finally {
            }
        } else {
            aaVar = s10Var.a;
            Canvas canvas3 = aaVar.a;
            aaVar.a = canvas;
            iu0 iu0Var2 = this.O;
            da2 da2Var2 = this.P;
            float width2 = getWidth();
            float height2 = getHeight();
            long floatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(height2)) | (Float.floatToRawIntBits(width2) << 32);
            jr1 jr1Var3 = this.R;
            tm1 tm1Var2 = this.Q;
            pn pnVar3 = r10Var.J;
            pnVar = r10Var.J;
            u = pnVar3.u();
            C = pnVar.C();
            q = pnVar.q();
            H = pnVar.H();
            jr1Var = (jr1) pnVar.c;
            pnVar.V(iu0Var2);
            pnVar.W(da2Var2);
            pnVar.U(aaVar);
            pnVar.X(floatToRawIntBits2);
            pnVar.c = jr1Var3;
            aaVar.f();
            try {
                tm1Var2.invoke(r10Var);
                aaVar.n();
                pnVar.V(u);
                pnVar.W(C);
                pnVar.U(q);
                pnVar.X(H);
                pnVar.c = jr1Var;
                s10Var.a.a = canvas3;
            } finally {
            }
        }
        this.L = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.N;
    }

    public final s10 getCanvasHolder() {
        return this.J;
    }

    public final View getOwnerView() {
        return this.I;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.N;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.L) {
            return;
        }
        this.L = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.N != z) {
            this.N = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.L = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
