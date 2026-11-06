package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qx1 implements ti2 {
    public static final u05 J = new u05(new u7((byte) 26));
    public final nk I;

    public qx1(nk nkVar) {
        this.I = nkVar;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        if (ji2Var != ji2.ON_DESTROY) {
            return;
        }
        Object systemService = this.I.getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        nx1 nx1Var = (nx1) J.getValue();
        Object b = nx1Var.b(inputMethodManager);
        if (b == null) {
            return;
        }
        synchronized (b) {
            View c = nx1Var.c(inputMethodManager);
            if (c == null) {
                return;
            }
            if (c.isAttachedToWindow()) {
                return;
            }
            boolean a = nx1Var.a(inputMethodManager);
            if (a) {
                inputMethodManager.isActive();
            }
        }
    }
}
