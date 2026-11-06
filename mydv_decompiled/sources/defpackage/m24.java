package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m24 extends y4 {
    public final RecyclerView I;
    public final l24 J;

    public m24(RecyclerView recyclerView) {
        this.I = recyclerView;
        l24 l24Var = this.J;
        if (l24Var != null) {
            this.J = l24Var;
        } else {
            this.J = new l24(this);
        }
    }

    @Override // defpackage.y4
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.I.J()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N(accessibilityEvent);
        }
    }

    @Override // defpackage.y4
    public final void onInitializeAccessibilityNodeInfo(View view, p5 p5Var) {
        super.onInitializeAccessibilityNodeInfo(view, p5Var);
        RecyclerView recyclerView = this.I;
        if (recyclerView.J() || recyclerView.getLayoutManager() == null) {
            return;
        }
        e layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.O(recyclerView2.K, recyclerView2.N0, p5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[ADDED_TO_REGION] */
    @Override // defpackage.y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r5 = super.performAccessibilityAction(r5, r6, r7)
            r7 = 1
            if (r5 == 0) goto L8
            return r7
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r4.I
            boolean r5 = r4.J()
            r0 = 0
            if (r5 != 0) goto Lad
            androidx.recyclerview.widget.e r5 = r4.getLayoutManager()
            if (r5 == 0) goto Lad
            androidx.recyclerview.widget.e r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r5 = r4.b
            androidx.recyclerview.widget.f r5 = r5.K
            int r5 = r4.n
            int r1 = r4.m
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            boolean r3 = r3.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L44
            int r5 = r2.height()
            int r1 = r2.width()
        L44:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L7b
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r5 = r0
            r6 = r5
            goto La2
        L4f:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            r2 = -1
            boolean r6 = r6.canScrollVertically(r2)
            if (r6 == 0) goto L64
            int r6 = r4.A()
            int r5 = r5 - r6
            int r6 = r4.x()
            int r5 = r5 - r6
            int r5 = -r5
            goto L65
        L64:
            r5 = r0
        L65:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollHorizontally(r2)
            if (r6 == 0) goto L79
            int r6 = r4.y()
            int r1 = r1 - r6
            int r6 = r4.z()
            int r1 = r1 - r6
            int r6 = -r1
            goto La2
        L79:
            r6 = r0
            goto La2
        L7b:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollVertically(r7)
            if (r6 == 0) goto L8e
            int r6 = r4.A()
            int r5 = r5 - r6
            int r6 = r4.x()
            int r5 = r5 - r6
            goto L8f
        L8e:
            r5 = r0
        L8f:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollHorizontally(r7)
            if (r6 == 0) goto L79
            int r6 = r4.y()
            int r1 = r1 - r6
            int r6 = r4.z()
            int r6 = r1 - r6
        La2:
            if (r5 != 0) goto La7
            if (r6 != 0) goto La7
            goto Lad
        La7:
            androidx.recyclerview.widget.RecyclerView r4 = r4.b
            r4.b0(r6, r5, r7)
            return r7
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m24.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }
}
