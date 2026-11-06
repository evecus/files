package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class km extends Spinner {
    public static final int[] Q = {R.attr.spinnerMode};
    public final c8 I;
    public final Context J;
    public final bm K;
    public SpinnerAdapter L;
    public final boolean M;
    public final jm N;
    public int O;
    public final Rect P;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public km(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130968892(0x7f04013c, float:1.754645E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.P = r1
            android.content.Context r1 = r12.getContext()
            defpackage.u65.a(r12, r1)
            int[] r1 = defpackage.qz3.u
            pn r2 = defpackage.pn.N(r13, r14, r1, r0)
            java.lang.Object r3 = r2.b
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            c8 r4 = new c8
            r4.<init>(r12)
            r12.I = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            ej0 r6 = new ej0
            r6.<init>(r13, r4)
            r12.J = r6
            goto L37
        L35:
            r12.J = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.km.Q     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            hm r4 = new hm
            android.content.Context r9 = r12.J
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.J
            pn r1 = defpackage.pn.N(r9, r14, r1, r0)
            java.lang.Object r9 = r1.b
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.O = r9
            android.graphics.drawable.Drawable r9 = r1.v(r8)
            r4.k(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.k0 = r7
            r1.T()
            r12.N = r4
            bm r1 = new bm
            r1.<init>(r12, r12, r4)
            r12.K = r1
            goto Laa
        L9d:
            dm r1 = new dm
            r1.<init>(r12)
            r12.N = r1
            java.lang.String r4 = r3.getString(r7)
            r1.K = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131559614(0x7f0d04be, float:1.8744577E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.T()
            r12.M = r8
            android.widget.SpinnerAdapter r13 = r12.L
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.L = r6
        Lcf:
            c8 r12 = r12.I
            r12.y(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.P;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        jm jmVar = this.N;
        return jmVar != null ? jmVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        jm jmVar = this.N;
        return jmVar != null ? jmVar.p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.N != null ? this.O : super.getDropDownWidth();
    }

    public final jm getInternalPopup() {
        return this.N;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        jm jmVar = this.N;
        return jmVar != null ? jmVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.J;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        jm jmVar = this.N;
        return jmVar != null ? jmVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        c8 c8Var = this.I;
        if (c8Var != null) {
            return c8Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c8 c8Var = this.I;
        if (c8Var != null) {
            return c8Var.w();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jm jmVar = this.N;
        if (jmVar == null || !jmVar.b()) {
            return;
        }
        jmVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.N == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        im imVar = (im) parcelable;
        super.onRestoreInstanceState(imVar.getSuperState());
        if (!imVar.I || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new cm(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        im imVar = new im(super.onSaveInstanceState());
        jm jmVar = this.N;
        imVar.I = jmVar != null && jmVar.b();
        return imVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bm bmVar = this.K;
        if (bmVar == null || !bmVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        jm jmVar = this.N;
        if (jmVar == null) {
            return super.performClick();
        }
        if (jmVar.b()) {
            return true;
        }
        jmVar.o(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.M) {
            this.L = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        jm jmVar = this.N;
        if (jmVar != null) {
            Context context = this.J;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            em emVar = new em();
            emVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                emVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            jmVar.q(emVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.C(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        jm jmVar = this.N;
        if (jmVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            jmVar.n(i);
            jmVar.e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.N != null) {
            this.O = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(j42.C(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.N(mode);
        }
    }
}
