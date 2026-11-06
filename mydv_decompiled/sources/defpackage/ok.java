package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ok extends AutoCompleteTextView implements f85 {
    public static final int[] L = {R.attr.popupBackground};
    public final c8 I;
    public final qm J;
    public final g12 K;

    public ok(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.github.mytv.dv.R.attr.autoCompleteTextViewStyle);
        u65.a(this, getContext());
        pn N = pn.N(getContext(), attributeSet, L, com.github.mytv.dv.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) N.b).hasValue(0)) {
            setDropDownBackgroundDrawable(N.v(0));
        }
        N.T();
        c8 c8Var = new c8(this);
        this.I = c8Var;
        c8Var.y(attributeSet, com.github.mytv.dv.R.attr.autoCompleteTextViewStyle);
        qm qmVar = new qm(this);
        this.J = qmVar;
        qmVar.h(attributeSet, com.github.mytv.dv.R.attr.autoCompleteTextViewStyle);
        qmVar.b();
        g12 g12Var = new g12(this, (byte) 4);
        this.K = g12Var;
        g12Var.E(attributeSet, com.github.mytv.dv.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener s = g12Var.s(keyListener);
        if (s == keyListener) {
            return;
        }
        super.setKeyListener(s);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.b();
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kb4.j0(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.J.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.J.g();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        d4.E(onCreateInputConnection, editorInfo, this);
        return this.K.N(onCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kb4.o0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(j42.C(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.K.S(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.K.s(keyListener));
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

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qm qmVar = this.J;
        qmVar.m(colorStateList);
        qmVar.b();
    }

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qm qmVar = this.J;
        qmVar.n(mode);
        qmVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.i(context, i);
        }
    }

    public ok(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
