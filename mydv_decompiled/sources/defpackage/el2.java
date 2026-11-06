package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class el2 implements View.OnTouchListener {
    public static final int Y = ViewConfiguration.getTapTimeout();
    public final xr I;
    public final AccelerateInterpolator J;
    public final m41 K;
    public bl L;
    public final float[] M;
    public final float[] N;
    public final int O;
    public final float[] P;
    public final float[] Q;
    public final float[] R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final m41 X;

    public el2(m41 m41Var) {
        xr xrVar = new xr();
        xrVar.e = Long.MIN_VALUE;
        xrVar.g = -1L;
        xrVar.f = 0L;
        this.I = xrVar;
        this.J = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.M = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.N = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.P = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.Q = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.R = fArr5;
        this.K = m41Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.O = Y;
        xrVar.a = (short) 500;
        xrVar.b = (short) 500;
        this.X = m41Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.M
            r0 = r0[r7]
            float[] r1 = r3.N
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.J
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.P
            r0 = r0[r7]
            float[] r1 = r3.Q
            r1 = r1[r7]
            float[] r3 = r3.R
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el2.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.V) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.T) {
            this.V = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        xr xrVar = this.I;
        int i2 = (int) (currentAnimationTimeMillis - xrVar.e);
        short s = xrVar.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        xrVar.i = i;
        xrVar.h = xrVar.a(currentAnimationTimeMillis);
        xrVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        m41 m41Var;
        int count;
        xr xrVar = this.I;
        float f = xrVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(xrVar.c);
        if (abs != 0 && (count = (m41Var = this.X).getCount()) != 0) {
            int childCount = m41Var.getChildCount();
            int firstVisiblePosition = m41Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && m41Var.getChildAt(0).getTop() >= 0)) : !(i >= count && m41Var.getChildAt(childCount - 1).getBottom() <= m41Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.W
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L78
        L17:
            r7.d()
            return r1
        L1b:
            r7.U = r2
            r7.S = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            m41 r4 = r7.K
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            xr r9 = r7.I
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.V
            if (r8 != 0) goto L78
            boolean r8 = r7.e()
            if (r8 == 0) goto L78
            bl r8 = r7.L
            if (r8 != 0) goto L60
            bl r8 = new bl
            r8.<init>(r7, r2)
            r7.L = r8
        L60:
            r7.V = r2
            r7.T = r2
            boolean r9 = r7.S
            if (r9 != 0) goto L73
            int r9 = r7.O
            if (r9 <= 0) goto L73
            long r5 = (long) r9
            java.util.WeakHashMap r9 = defpackage.dr5.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L76
        L73:
            r8.run()
        L76:
            r7.S = r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
