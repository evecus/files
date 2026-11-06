package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hm extends cl2 implements jm {
    public CharSequence k0;
    public em l0;
    public final Rect m0;
    public int n0;
    public final /* synthetic */ km o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(km kmVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.o0 = kmVar;
        this.m0 = new Rect();
        this.W = kmVar;
        this.f0 = true;
        this.g0.setFocusable(true);
        this.X = new fm(this);
    }

    @Override // defpackage.jm
    public final CharSequence f() {
        return this.k0;
    }

    @Override // defpackage.jm
    public final void i(CharSequence charSequence) {
        this.k0 = charSequence;
    }

    @Override // defpackage.jm
    public final void n(int i) {
        this.n0 = i;
    }

    @Override // defpackage.jm
    public final void o(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        wl wlVar = this.g0;
        boolean isShowing = wlVar.isShowing();
        s();
        wlVar.setInputMethodMode(2);
        g();
        m41 m41Var = this.K;
        m41Var.setChoiceMode(1);
        m41Var.setTextDirection(i);
        m41Var.setTextAlignment(i2);
        km kmVar = this.o0;
        int selectedItemPosition = kmVar.getSelectedItemPosition();
        m41 m41Var2 = this.K;
        if (wlVar.isShowing() && m41Var2 != null) {
            m41Var2.setListSelectionHidden(false);
            m41Var2.setSelection(selectedItemPosition);
            if (m41Var2.getChoiceMode() != 0) {
                m41Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = kmVar.getViewTreeObserver()) == null) {
            return;
        }
        cm cmVar = new cm(this, (byte) 1);
        viewTreeObserver.addOnGlobalLayoutListener(cmVar);
        wlVar.setOnDismissListener(new gm(this, cmVar));
    }

    @Override // defpackage.cl2, defpackage.jm
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.l0 = (em) listAdapter;
    }

    public final void s() {
        int i;
        wl wlVar = this.g0;
        Drawable background = wlVar.getBackground();
        km kmVar = this.o0;
        Rect rect = kmVar.P;
        if (background != null) {
            background.getPadding(rect);
            boolean z = fs5.a;
            i = kmVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = kmVar.getPaddingLeft();
        int paddingRight = kmVar.getPaddingRight();
        int width = kmVar.getWidth();
        int i2 = kmVar.O;
        if (i2 == -2) {
            int a = kmVar.a(this.l0, wlVar.getBackground());
            int i3 = (kmVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = fs5.a;
        this.N = kmVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.M) - this.n0) + i : paddingLeft + this.n0 + i;
    }
}
