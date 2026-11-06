package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class rj3 {
    public static final int $stable = 8;
    private c80 colorFilter;
    private qj3 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private da2 layoutDirection = da2.I;
    private final tm1 drawLambda = new kh(this, 5);

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m366drawx_KDEd0$default(rj3 rj3Var, y31 y31Var, long j, float f, c80 c80Var, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
            return;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            c80Var = null;
        }
        rj3Var.m367drawx_KDEd0(y31Var, j, f2, c80Var);
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(c80 c80Var) {
        return false;
    }

    public boolean applyLayoutDirection(da2 da2Var) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m367drawx_KDEd0(y31 y31Var, long j, float f, c80 c80Var) {
        if (this.alpha != f) {
            if (!applyAlpha(f)) {
                qj3 qj3Var = this.layerPaint;
                if (f == 1.0f) {
                    if (qj3Var != null) {
                        ((pd) qj3Var).d(f);
                    }
                    this.useLayer = false;
                } else {
                    if (qj3Var == null) {
                        qj3Var = i42.U();
                        this.layerPaint = qj3Var;
                    }
                    ((pd) qj3Var).d(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
        if (!j42.c(this.colorFilter, c80Var)) {
            if (!applyColorFilter(c80Var)) {
                qj3 qj3Var2 = this.layerPaint;
                if (c80Var == null) {
                    if (qj3Var2 != null) {
                        ((pd) qj3Var2).g(null);
                    }
                    this.useLayer = false;
                } else {
                    if (qj3Var2 == null) {
                        qj3Var2 = i42.U();
                        this.layerPaint = qj3Var2;
                    }
                    ((pd) qj3Var2).g(c80Var);
                    this.useLayer = true;
                }
            }
            this.colorFilter = c80Var;
        }
        da2 layoutDirection = y31Var.getLayoutDirection();
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (y31Var.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((ep) y31Var.S().b).w(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.useLayer) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        m14 g = sv2.g(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        o10 q = y31Var.S().q();
                        qj3 qj3Var3 = this.layerPaint;
                        if (qj3Var3 == null) {
                            qj3Var3 = i42.U();
                            this.layerPaint = qj3Var3;
                        }
                        try {
                            q.j(g, qj3Var3);
                            onDraw(y31Var);
                            q.n();
                        } catch (Throwable th) {
                            q.n();
                            throw th;
                        }
                    } else {
                        onDraw(y31Var);
                    }
                }
            } catch (Throwable th2) {
                ((ep) y31Var.S().b).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((ep) y31Var.S().b).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo43getIntrinsicSizeNHjbRc() {
        return 9205357640488583168L;
    }

    public abstract void onDraw(y31 y31Var);
}
