package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ty2 extends cl2 implements jy2 {
    public static final Method l0;
    public uu2 k0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                l0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.cl2
    public final m41 a(Context context, boolean z) {
        sy2 sy2Var = new sy2(context, z);
        sy2Var.setHoverListener(this);
        return sy2Var;
    }

    @Override // defpackage.jy2
    public final void d(sx2 sx2Var, MenuItem menuItem) {
        uu2 uu2Var = this.k0;
        if (uu2Var != null) {
            uu2Var.d(sx2Var, menuItem);
        }
    }

    @Override // defpackage.jy2
    public final void l(sx2 sx2Var, ky2 ky2Var) {
        uu2 uu2Var = this.k0;
        if (uu2Var != null) {
            uu2Var.l(sx2Var, ky2Var);
        }
    }
}
