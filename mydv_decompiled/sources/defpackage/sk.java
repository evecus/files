package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sk extends CheckBox implements f85 {
    public final uk I;
    public final c8 J;
    public final qm K;
    public rl L;

    public sk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        u65.a(this, getContext());
        uk ukVar = new uk(this);
        this.I = ukVar;
        ukVar.c(attributeSet, R.attr.checkboxStyle);
        c8 c8Var = new c8(this);
        this.J = c8Var;
        c8Var.y(attributeSet, R.attr.checkboxStyle);
        qm qmVar = new qm(this);
        this.K = qmVar;
        qmVar.h(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkboxStyle);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.b();
        }
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c8 c8Var = this.J;
        if (c8Var != null) {
            return c8Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c8 c8Var = this.J;
        if (c8Var != null) {
            return c8Var.w();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        uk ukVar = this.I;
        if (ukVar != null) {
            return ukVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        uk ukVar = this.I;
        if (ukVar != null) {
            return ukVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.K.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.K.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.C(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        uk ukVar = this.I;
        if (ukVar != null) {
            if (ukVar.e) {
                ukVar.e = false;
            } else {
                ukVar.e = true;
                ukVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mu0) getEmojiTextViewHelper().b.J).w(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.N(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        uk ukVar = this.I;
        if (ukVar != null) {
            ukVar.a = colorStateList;
            ukVar.c = true;
            ukVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        uk ukVar = this.I;
        if (ukVar != null) {
            ukVar.b = mode;
            ukVar.d = true;
            ukVar.a();
        }
    }

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qm qmVar = this.K;
        qmVar.m(colorStateList);
        qmVar.b();
    }

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qm qmVar = this.K;
        qmVar.n(mode);
        qmVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(j42.C(getContext(), i));
    }
}
