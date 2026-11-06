package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ql extends EditText implements f85 {
    public final c8 I;
    public final qm J;
    public final da K;
    public final s65 L;
    public final g12 M;
    public pl N;
    public pm O;

    public ql(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        u65.a(this, getContext());
        c8 c8Var = new c8(this);
        this.I = c8Var;
        c8Var.y(attributeSet, R.attr.editTextStyle);
        qm qmVar = new qm(this);
        this.J = qmVar;
        qmVar.h(attributeSet, R.attr.editTextStyle);
        qmVar.b();
        da daVar = new da((byte) 1);
        daVar.J = this;
        this.K = daVar;
        this.L = new s65();
        g12 g12Var = new g12(this, (byte) 4);
        this.M = g12Var;
        g12Var.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (g12.C(keyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener s = g12Var.s(keyListener);
            if (s == keyListener) {
                return;
            }
            super.setKeyListener(s);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    private pl getSuperCaller() {
        pl plVar = this.N;
        if (plVar != null) {
            return plVar;
        }
        pl plVar2 = new pl(this);
        this.N = plVar2;
        return plVar2;
    }

    public final ki0 d(ki0 ki0Var) {
        this.L.getClass();
        return s65.a(this, ki0Var);
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

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public pm getFontVariationSettingsManager() {
        pm pmVar = this.O;
        if (pmVar != null) {
            return pmVar;
        }
        pm pmVar2 = new pm(this, new ol(this, (byte) 0));
        this.O = pmVar2;
        return pmVar2;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        da daVar;
        if (Build.VERSION.SDK_INT >= 28 || (daVar = this.K) == null) {
            return getSuperCaller().a();
        }
        TextClassifier textClassifier = (TextClassifier) daVar.K;
        return textClassifier == null ? x9.o((TextView) daVar.J) : textClassifier;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.J.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            f71.c(editorInfo, getText());
        }
        d4.E(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (d = dr5.d(this)) != null) {
            f71.b(editorInfo, d);
            onCreateInputConnection = c21.p(this, onCreateInputConnection, editorInfo);
        }
        return this.M.N(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (g4.S(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (g4.T(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setEmojiCompatEnabled(boolean z) {
        this.M.S(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.M.s(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        da daVar;
        if (Build.VERSION.SDK_INT >= 28 || (daVar = this.K) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            daVar.K = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        pm fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }
}
