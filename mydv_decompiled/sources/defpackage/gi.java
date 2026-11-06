package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gi extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int b0 = 0;
    public di I;
    public Rect J;
    public Drawable K;
    public Drawable L;
    public boolean N;
    public boolean P;
    public bl Q;
    public long R;
    public long S;
    public hi T;
    public di U;
    public boolean V;
    public di W;
    public d4 X;
    public boolean a0;
    public int M = 255;
    public int O = -1;
    public int Y = -1;
    public int Z = -1;

    public gi(di diVar, Resources resources) {
        i(new di(diVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x026e, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0275, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gi c(android.content.Context r22, android.content.res.Resources r23, android.content.res.XmlResourceParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):gi");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.N = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.K
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.R
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.M
            r3.setAlpha(r9)
            r13.R = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            di r10 = r13.I
            int r10 = r10.y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.M
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.R = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.L
            if (r9 == 0) goto L61
            long r10 = r13.S
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.L = r0
            r13.S = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            di r4 = r13.I
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.M
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.S = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            bl r14 = r13.Q
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        di diVar = this.I;
        if (theme == null) {
            diVar.getClass();
            return;
        }
        diVar.c();
        int i = diVar.h;
        Drawable[] drawableArr = diVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                diVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            diVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = diVar.c;
            diVar.c = i3;
            if (i4 != i3) {
                diVar.m = false;
                diVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.I.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        hi hiVar = this.T;
        if (hiVar == null) {
            hiVar = new hi();
            this.T = hiVar;
        }
        hiVar.J = drawable.getCallback();
        drawable.setCallback(hiVar);
        try {
            if (this.I.y <= 0 && this.N) {
                drawable.setAlpha(this.M);
            }
            di diVar = this.I;
            if (diVar.C) {
                drawable.setColorFilter(diVar.B);
            } else {
                if (diVar.F) {
                    drawable.setTintList(diVar.D);
                }
                di diVar2 = this.I;
                if (diVar2.G) {
                    drawable.setTintMode(diVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.I.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.I.A);
            Rect rect = this.J;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            hi hiVar2 = this.T;
            Drawable.Callback callback = (Drawable.Callback) hiVar2.J;
            hiVar2.J = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            hi hiVar3 = this.T;
            Drawable.Callback callback2 = (Drawable.Callback) hiVar3.J;
            hiVar3.J = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.L;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z;
        Drawable drawable = this.L;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.L = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.N) {
                this.K.setAlpha(this.M);
            }
        }
        if (this.S != 0) {
            this.S = 0L;
            z = true;
        }
        if (this.R != 0) {
            this.R = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.P && super.mutate() == this) {
            di diVar = new di(this.W, this, null);
            diVar.I = diVar.I.clone();
            diVar.J = diVar.J.clone();
            i(diVar);
            this.P = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.V) {
            f();
            di diVar = this.U;
            diVar.I = diVar.I.clone();
            diVar.J = diVar.J.clone();
            this.V = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.I.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        di diVar = this.I;
        if (!diVar.u) {
            diVar.c();
            diVar.u = true;
            int i = diVar.h;
            Drawable[] drawableArr = diVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    diVar.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    diVar.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = diVar.v;
        }
        if (!z) {
            return null;
        }
        this.I.d = getChangingConfigurations();
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.J;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        di diVar = this.I;
        if (diVar.l) {
            if (!diVar.m) {
                diVar.b();
            }
            return diVar.o;
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        di diVar = this.I;
        if (diVar.l) {
            if (!diVar.m) {
                diVar.b();
            }
            return diVar.n;
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        di diVar = this.I;
        if (diVar.l) {
            if (!diVar.m) {
                diVar.b();
            }
            return diVar.q;
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        di diVar = this.I;
        if (diVar.l) {
            if (!diVar.m) {
                diVar.b();
            }
            return diVar.p;
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.K;
        if (drawable != null && drawable.isVisible()) {
            di diVar = this.I;
            if (diVar.r) {
                return diVar.s;
            }
            diVar.c();
            int i = diVar.h;
            Drawable[] drawableArr = diVar.g;
            r1 = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i2].getOpacity());
            }
            diVar.s = r1;
            diVar.r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        di diVar = this.I;
        Rect rect2 = null;
        boolean z = false;
        if (!diVar.i) {
            Rect rect3 = diVar.k;
            if (rect3 != null || diVar.j) {
                rect2 = rect3;
            } else {
                diVar.c();
                Rect rect4 = new Rect();
                int i = diVar.h;
                Drawable[] drawableArr = diVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                diVar.j = true;
                diVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.K;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.I.A && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.O
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            di r0 = r9.I
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.L
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.K
            if (r0 == 0) goto L29
            r9.L = r0
            di r0 = r9.I
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.S = r0
            goto L35
        L29:
            r9.L = r4
            r9.S = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.K
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            di r0 = r9.I
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.K = r0
            r9.O = r10
            if (r0 == 0) goto L5a
            di r10 = r9.I
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.R = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.K = r4
            r10 = -1
            r9.O = r10
        L5a:
            long r0 = r9.R
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.S
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            bl r10 = r9.Q
            if (r10 != 0) goto L74
            bl r10 = new bl
            r1 = 2
            r10.<init>(r9, r1)
            r9.Q = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.a(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.h(int):boolean");
    }

    public final void i(di diVar) {
        this.I = diVar;
        int i = this.O;
        if (i >= 0) {
            Drawable d = diVar.d(i);
            this.K = d;
            if (d != null) {
                d(d);
            }
        }
        this.L = null;
        this.U = diVar;
        this.W = diVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        di diVar = this.I;
        if (diVar != null) {
            diVar.r = false;
            diVar.t = false;
        }
        if (drawable != this.K || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.I.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        d4 d4Var = this.X;
        if (d4Var != null) {
            d4Var.L();
            this.X = null;
            h(this.Y);
            this.Y = -1;
            this.Z = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.a0) {
            g();
            di diVar = this.W;
            diVar.I = diVar.I.clone();
            diVar.J = diVar.J.clone();
            this.a0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        di diVar = this.I;
        int i2 = this.O;
        int i3 = diVar.h;
        Drawable[] drawableArr = diVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        diVar.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.L;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (h(r1) != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.K || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.N && this.M == i) {
            return;
        }
        this.N = true;
        this.M = i;
        Drawable drawable = this.K;
        if (drawable != null) {
            if (this.R == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        di diVar = this.I;
        if (diVar.A != z) {
            diVar.A = z;
            Drawable drawable = this.K;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        di diVar = this.I;
        diVar.C = true;
        if (diVar.B != colorFilter) {
            diVar.B = colorFilter;
            Drawable drawable = this.K;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        di diVar = this.I;
        if (diVar.w != z) {
            diVar.w = z;
            Drawable drawable = this.K;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.J;
        if (rect == null) {
            this.J = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        di diVar = this.I;
        diVar.F = true;
        if (diVar.D != colorStateList) {
            diVar.D = colorStateList;
            this.K.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        di diVar = this.I;
        diVar.G = true;
        if (diVar.E != mode) {
            diVar.E = mode;
            this.K.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean j = j(z, z2);
        d4 d4Var = this.X;
        if (d4Var != null && (j || z2)) {
            if (z) {
                d4Var.K();
                return j;
            }
            jumpToCurrentState();
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.K || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
