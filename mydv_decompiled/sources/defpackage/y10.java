package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y10 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ py2 J;

    public /* synthetic */ y10(py2 py2Var, byte b) {
        this.I = b;
        this.J = py2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.I;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.I;
        py2 py2Var = this.J;
        switch (b) {
            case 0:
                b20 b20Var = (b20) py2Var;
                ViewTreeObserver viewTreeObserver = b20Var.f0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        b20Var.f0 = view.getViewTreeObserver();
                    }
                    b20Var.f0.removeGlobalOnLayoutListener(b20Var.Q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                sv4 sv4Var = (sv4) py2Var;
                ViewTreeObserver viewTreeObserver2 = sv4Var.W;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sv4Var.W = view.getViewTreeObserver();
                    }
                    sv4Var.W.removeGlobalOnLayoutListener(sv4Var.Q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
