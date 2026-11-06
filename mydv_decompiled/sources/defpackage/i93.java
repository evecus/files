package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i93 extends y4 {
    @Override // defpackage.y4
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // defpackage.y4
    public final void onInitializeAccessibilityNodeInfo(View view, p5 p5Var) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, p5Var);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        p5Var.i("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        p5Var.a.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            p5Var.b(j5.f);
            p5Var.b(j5.g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            p5Var.b(j5.e);
            p5Var.b(j5.i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5 != 16908346) goto L30;
     */
    @Override // defpackage.y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r3 = super.performAccessibilityAction(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L8
            return r6
        L8:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L13
            goto L95
        L13:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L30
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L30
            int r3 = r1.height()
        L30:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L6a
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L43
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L43
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L6a
            goto L95
        L43:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L95
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            return r6
        L6a:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L95
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            return r6
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i93.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }
}
