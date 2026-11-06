package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gm implements PopupWindow.OnDismissListener {
    public final /* synthetic */ cm I;
    public final /* synthetic */ hm J;

    public gm(hm hmVar, cm cmVar) {
        this.J = hmVar;
        this.I = cmVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.J.o0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.I);
        }
    }
}
