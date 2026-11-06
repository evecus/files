package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class uj2 extends ViewGroup {
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public boolean P;
    public int[] Q;
    public int[] R;
    public Drawable S;
    public int T;
    public int U;
    public int V;
    public int W;

    public uj2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.I = true;
        this.J = -1;
        this.K = 0;
        this.M = 8388659;
        int[] iArr = qz3.n;
        pn N = pn.N(context, attributeSet, iArr, 0);
        dr5.g(this, context, iArr, attributeSet, (TypedArray) N.b, 0);
        TypedArray typedArray = (TypedArray) N.b;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.O = typedArray.getFloat(4, -1.0f);
        this.J = typedArray.getInt(3, -1);
        this.P = typedArray.getBoolean(7, false);
        setDividerDrawable(N.v(5));
        this.V = typedArray.getInt(8, 0);
        this.W = typedArray.getDimensionPixelSize(6, 0);
        N.T();
    }

    public final void c(Canvas canvas, int i) {
        this.S.setBounds(getPaddingLeft() + this.W, i, (getWidth() - getPaddingRight()) - this.W, this.U + i);
        this.S.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tj2;
    }

    public final void d(Canvas canvas, int i) {
        this.S.setBounds(i, getPaddingTop() + this.W, this.T + i, (getHeight() - getPaddingBottom()) - this.W);
        this.S.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public tj2 generateDefaultLayoutParams() {
        int i = this.L;
        if (i == 0) {
            return new tj2(-2, -2);
        }
        if (i == 1) {
            return new tj2(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public tj2 generateLayoutParams(AttributeSet attributeSet) {
        return new tj2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public tj2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tj2 ? new tj2((tj2) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new tj2((ViewGroup.MarginLayoutParams) layoutParams) : new tj2(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.J < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.J;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.J == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.K;
        if (this.L == 1 && (i = this.M & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.N) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.N;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((tj2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.J;
    }

    public Drawable getDividerDrawable() {
        return this.S;
    }

    public int getDividerPadding() {
        return this.W;
    }

    public int getDividerWidth() {
        return this.T;
    }

    public int getGravity() {
        return this.M;
    }

    public int getOrientation() {
        return this.L;
    }

    public int getShowDividers() {
        return this.V;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.O;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.V & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.V;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.S == null) {
            return;
        }
        int i2 = 0;
        if (this.L == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((tj2) childAt.getLayoutParams())).topMargin) - this.U);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.U : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((tj2) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = fs5.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                tj2 tj2Var = (tj2) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) tj2Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) tj2Var).leftMargin) - this.T);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                tj2 tj2Var2 = (tj2) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) tj2Var2).leftMargin;
                    i = this.T;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) tj2Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.T;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj2.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj2.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.I = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.J = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.S) {
            return;
        }
        this.S = drawable;
        if (drawable != null) {
            this.T = drawable.getIntrinsicWidth();
            this.U = drawable.getIntrinsicHeight();
        } else {
            this.T = 0;
            this.U = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.W = i;
    }

    public void setGravity(int i) {
        if (this.M != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.M = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.M;
        if ((8388615 & i3) != i2) {
            this.M = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.P = z;
    }

    public void setOrientation(int i) {
        if (this.L != i) {
            this.L = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.V) {
            requestLayout();
        }
        this.V = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.M;
        if ((i3 & 112) != i2) {
            this.M = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.O = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
