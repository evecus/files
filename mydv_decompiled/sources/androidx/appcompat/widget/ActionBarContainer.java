package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mytv.dv.R;
import defpackage.e6;
import defpackage.pc4;
import defpackage.qz3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean I;
    public View J;
    public View K;
    public Drawable L;
    public Drawable M;
    public Drawable N;
    public final boolean O;
    public boolean P;
    public final int Q;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new e6(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.a);
        boolean z = false;
        this.L = obtainStyledAttributes.getDrawable(0);
        this.M = obtainStyledAttributes.getDrawable(2);
        this.Q = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.O = true;
            this.N = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.O ? !(this.L != null || this.M != null) : this.N == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.L;
        if (drawable != null && drawable.isStateful()) {
            this.L.setState(getDrawableState());
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null && drawable2.isStateful()) {
            this.M.setState(getDrawableState());
        }
        Drawable drawable3 = this.N;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.N.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.N;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.J = findViewById(R.id.action_bar);
        this.K = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.I || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.O) {
            Drawable drawable = this.N;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.L == null) {
                z2 = false;
            } else if (this.J.getVisibility() == 0 || ((view = this.K) != null && view.getVisibility() == 0)) {
                this.L.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                this.L.setBounds(0, 0, 0, 0);
            }
            this.P = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.J == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.Q) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.J == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.L);
        }
        this.L = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.J != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.O ? !(this.L != null || this.M != null) : this.N == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.N;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.N);
        }
        this.N = drawable;
        boolean z = this.O;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.N) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.L != null || this.M != null) : this.N == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.M);
        }
        this.M = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.P && this.M != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.O ? !(this.L != null || this.M != null) : this.N == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.I = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.N;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.L;
        boolean z = this.O;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.M && this.P) {
            return true;
        }
        return (drawable == this.N && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(pc4 pc4Var) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
