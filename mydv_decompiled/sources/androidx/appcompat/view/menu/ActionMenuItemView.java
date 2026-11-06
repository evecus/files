package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.eg5;
import defpackage.ky2;
import defpackage.p6;
import defpackage.q6;
import defpackage.qz3;
import defpackage.rx2;
import defpackage.sx2;
import defpackage.um;
import defpackage.v6;
import defpackage.xy2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionMenuItemView extends um implements xy2, View.OnClickListener, v6 {
    public ky2 Q;
    public CharSequence R;
    public Drawable S;
    public rx2 T;
    public p6 U;
    public q6 V;
    public boolean W;
    public boolean a0;
    public final int b0;
    public int c0;
    public final int d0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.W = r();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.c, 0, 0);
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.d0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.c0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.xy2
    public final void a(ky2 ky2Var) {
        this.Q = ky2Var;
        setIcon(ky2Var.getIcon());
        setTitle(ky2Var.getTitleCondensed());
        setId(ky2Var.a);
        setVisibility(ky2Var.isVisible() ? 0 : 8);
        setEnabled(ky2Var.isEnabled());
        if (ky2Var.hasSubMenu() && this.U == null) {
            this.U = new p6(this);
        }
    }

    @Override // defpackage.v6
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.v6
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.Q.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.xy2
    public ky2 getItemData() {
        return this.Q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rx2 rx2Var = this.T;
        if (rx2Var != null) {
            rx2Var.a(this.Q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.W = r();
        s();
    }

    @Override // defpackage.um, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.c0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.b0;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.S == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.S.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p6 p6Var;
        if (this.Q.hasSubMenu() && (p6Var = this.U) != null && p6Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean r() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void s() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.R);
        if (this.S != null && ((this.Q.y & 4) != 4 || (!this.W && !this.a0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.R : null);
        CharSequence charSequence = this.Q.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.Q.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.Q.r;
        if (TextUtils.isEmpty(charSequence2)) {
            eg5.P(this, z3 ? null : this.Q.e);
        } else {
            eg5.P(this, charSequence2);
        }
    }

    public void setExpandedFormat(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            ky2 ky2Var = this.Q;
            if (ky2Var != null) {
                sx2 sx2Var = ky2Var.n;
                sx2Var.k = true;
                sx2Var.q(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.S = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.d0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        s();
    }

    public void setItemInvoker(rx2 rx2Var) {
        this.T = rx2Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.c0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(q6 q6Var) {
        this.V = q6Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        s();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
