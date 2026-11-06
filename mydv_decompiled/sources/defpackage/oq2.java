package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class oq2 {
    public static final i51 a = new i51(new d52((byte) 20), (byte) 0);

    public static le3 a(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        le3 le3Var = (le3) go1Var.k(a);
        Object obj = null;
        if (le3Var == null) {
            go1Var.d0(1208426157);
            View view = (View) go1Var.k(rb.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    le3Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                le3 le3Var2 = tag instanceof le3 ? (le3) tag : null;
                if (le3Var2 != null) {
                    le3Var = le3Var2;
                    break;
                }
                Object f = oh4.f(view);
                view = f instanceof View ? (View) f : null;
            }
        } else {
            go1Var.d0(1208423708);
        }
        go1Var.q(false);
        if (le3Var != null) {
            go1Var.d0(1208423789);
            go1Var.q(false);
            return le3Var;
        }
        go1Var.d0(1208428160);
        Context context = (Context) go1Var.k(rb.b);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof le3) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        le3 le3Var3 = (le3) obj;
        go1Var.q(false);
        return le3Var3;
    }
}
