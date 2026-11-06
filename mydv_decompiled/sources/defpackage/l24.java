package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l24 extends y4 {
    public final m24 I;
    public final WeakHashMap J = new WeakHashMap();

    public l24(m24 m24Var) {
        this.I = m24Var;
    }

    @Override // defpackage.y4
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        y4 y4Var = (y4) this.J.get(view);
        return y4Var != null ? y4Var.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.y4
    public final s5 getAccessibilityNodeProvider(View view) {
        y4 y4Var = (y4) this.J.get(view);
        return y4Var != null ? y4Var.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // defpackage.y4
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            y4Var.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.y4
    public final void onInitializeAccessibilityNodeInfo(View view, p5 p5Var) {
        m24 m24Var = this.I;
        RecyclerView recyclerView = m24Var.I;
        RecyclerView recyclerView2 = m24Var.I;
        if (recyclerView.J() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, p5Var);
            return;
        }
        recyclerView2.getLayoutManager().P(view, p5Var);
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            y4Var.onInitializeAccessibilityNodeInfo(view, p5Var);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, p5Var);
        }
    }

    @Override // defpackage.y4
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            y4Var.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.y4
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        y4 y4Var = (y4) this.J.get(viewGroup);
        return y4Var != null ? y4Var.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.y4
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        m24 m24Var = this.I;
        RecyclerView recyclerView = m24Var.I;
        RecyclerView recyclerView2 = m24Var.I;
        if (recyclerView.J() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            if (y4Var.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        f fVar = recyclerView2.getLayoutManager().b.K;
        return false;
    }

    @Override // defpackage.y4
    public final void sendAccessibilityEvent(View view, int i) {
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            y4Var.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // defpackage.y4
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        y4 y4Var = (y4) this.J.get(view);
        if (y4Var != null) {
            y4Var.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
