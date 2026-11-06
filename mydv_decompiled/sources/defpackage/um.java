package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class um extends TextView implements f85 {
    public final c8 I;
    public final qm J;
    public final da K;
    public rl L;
    public boolean M;
    public uu2 N;
    public Future O;
    public pm P;

    public um(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.M = false;
        this.N = null;
        u65.a(this, getContext());
        c8 c8Var = new c8(this);
        this.I = c8Var;
        c8Var.y(attributeSet, i);
        qm qmVar = new qm(this);
        this.J = qmVar;
        qmVar.h(attributeSet, i);
        qmVar.b();
        da daVar = new da((byte) 1);
        daVar.J = this;
        this.K = daVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private rl getEmojiTextViewHelper() {
        rl rlVar = this.L;
        if (rlVar != null) {
            return rlVar;
        }
        rl rlVar2 = new rl(this);
        this.L = rlVar2;
        return rlVar2;
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
    public int getAutoSizeMaxTextSize() {
        if (fs5.c) {
            return ((uu2) getSuperCaller()).r();
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            return Math.round(qmVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (fs5.c) {
            return ((uu2) getSuperCaller()).s();
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            return Math.round(qmVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (fs5.c) {
            return ((uu2) getSuperCaller()).t();
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            return Math.round(qmVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (fs5.c) {
            return ((uu2) getSuperCaller()).u();
        }
        qm qmVar = this.J;
        return qmVar != null ? qmVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (fs5.c) {
            return ((uu2) getSuperCaller()).v() == 1 ? 1 : 0;
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            return qmVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kb4.j0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return kb4.x(this);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public pm getFontVariationSettingsManager() {
        pm pmVar = this.P;
        if (pmVar != null) {
            return pmVar;
        }
        pm pmVar2 = new pm(this, new pk(this, (byte) 1));
        this.P = pmVar2;
        return pmVar2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return kb4.y(this);
    }

    public rm getSuperCaller() {
        uu2 uu2Var = this.N;
        if (uu2Var != null) {
            return uu2Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            tm tmVar = new tm(this);
            this.N = tmVar;
            return tmVar;
        }
        if (i >= 28) {
            sm smVar = new sm(this);
            this.N = smVar;
            return smVar;
        }
        if (i < 26) {
            return uu2Var;
        }
        uu2 uu2Var2 = new uu2(this);
        this.N = uu2Var2;
        return uu2Var2;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.O;
        if (future != null) {
            try {
                this.O = null;
                r7.K(future.get());
                kb4.e0(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        da daVar;
        if (Build.VERSION.SDK_INT >= 28 || (daVar = this.K) == null) {
            return ((uu2) getSuperCaller()).B();
        }
        TextClassifier textClassifier = (TextClassifier) daVar.K;
        return textClassifier == null ? x9.o((TextView) daVar.J) : textClassifier;
    }

    public hr3 getTextMetricsParamsCompat() {
        return kb4.D(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.J.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            f71.c(editorInfo, getText());
        }
        d4.E(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        qm qmVar = this.J;
        if (qmVar == null || fs5.c) {
            return;
        }
        qmVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.O;
        if (future != null) {
            try {
                this.O = null;
                r7.K(future.get());
                kb4.e0(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        qm qmVar = this.J;
        if (qmVar != null) {
            xm xmVar = qmVar.i;
            if (fs5.c || !xmVar.f()) {
                return;
            }
            xmVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (fs5.c) {
            ((uu2) getSuperCaller()).G(i, i2, i3, i4);
            return;
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (fs5.c) {
            ((uu2) getSuperCaller()).H(iArr, i);
            return;
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (fs5.c) {
            ((uu2) getSuperCaller()).I(i);
            return;
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.l(i);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? j42.C(context, i) : null, i2 != 0 ? j42.C(context, i2) : null, i3 != 0 ? j42.C(context, i3) : null, i4 != 0 ? j42.C(context, i4) : null);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? j42.C(context, i) : null, i2 != 0 ? j42.C(context, i2) : null, i3 != 0 ? j42.C(context, i3) : null, i4 != 0 ? j42.C(context, i4) : null);
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
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mu0) getEmojiTextViewHelper().b.J).w(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            kb4.a0(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            kb4.b0(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().i(i, f);
        } else {
            kb4.d0(this, i, f);
        }
    }

    public void setPrecomputedText(ir3 ir3Var) {
        kb4.e0(this);
        throw null;
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
            ((uu2) getSuperCaller()).J(textClassifier);
        } else {
            daVar.K = textClassifier;
        }
    }

    public void setTextFuture(Future<ir3> future) {
        this.O = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(hr3 hr3Var) {
        kb4.f0(this, hr3Var);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = fs5.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        qm qmVar = this.J;
        if (qmVar != null) {
            xm xmVar = qmVar.i;
            if (z || xmVar.f()) {
                return;
            }
            xmVar.g(f, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.M) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            ad4 ad4Var = wb5.a;
            if (context == null) {
                s83.t("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.M = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.M = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        kb4.c0(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            pm fontVariationSettingsManager = getFontVariationSettingsManager();
            fontVariationSettingsManager.c = typeface;
            fontVariationSettingsManager.d = typeface;
            fontVariationSettingsManager.b.accept(typeface);
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    public um(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
