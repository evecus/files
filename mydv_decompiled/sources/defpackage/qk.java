package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qk extends Button implements f85 {
    public final c8 I;
    public final qm J;
    public rl K;
    public pm L;

    public qk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        u65.a(this, getContext());
        c8 c8Var = new c8(this);
        this.I = c8Var;
        c8Var.y(attributeSet, R.attr.buttonStyle);
        qm qmVar = new qm(this);
        this.J = qmVar;
        qmVar.h(attributeSet, R.attr.buttonStyle);
        qmVar.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private rl getEmojiTextViewHelper() {
        rl rlVar = this.K;
        if (rlVar != null) {
            return rlVar;
        }
        rl rlVar2 = new rl(this);
        this.K = rlVar2;
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
            return super.getAutoSizeMaxTextSize();
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
            return super.getAutoSizeMinTextSize();
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
            return super.getAutoSizeStepGranularity();
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
            return super.getAutoSizeTextAvailableSizes();
        }
        qm qmVar = this.J;
        return qmVar != null ? qmVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (fs5.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
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
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public pm getFontVariationSettingsManager() {
        pm pmVar = this.L;
        if (pmVar != null) {
            return pmVar;
        }
        pm pmVar2 = new pm(this, new pk(this, (byte) 0));
        this.L = pmVar2;
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

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
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
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
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
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
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
            super.setAutoSizeTextTypeWithDefaults(i);
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
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        qm qmVar = this.J;
        if (qmVar != null) {
            qmVar.a.setAllCaps(z);
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
