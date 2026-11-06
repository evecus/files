package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p6 extends cl1 {
    public final /* synthetic */ byte R = 0;
    public final /* synthetic */ View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.S = actionMenuItemView;
    }

    @Override // defpackage.cl1
    public final xn4 b() {
        r6 r6Var;
        byte b = this.R;
        View view = this.S;
        switch (b) {
            case 0:
                q6 q6Var = ((ActionMenuItemView) view).V;
                if (q6Var == null || (r6Var = ((s6) q6Var).a.b0) == null) {
                    return null;
                }
                return r6Var.a();
            default:
                r6 r6Var2 = ((t6) view).L.a0;
                if (r6Var2 == null) {
                    return null;
                }
                return r6Var2.a();
        }
    }

    @Override // defpackage.cl1
    public final boolean c() {
        xn4 b;
        byte b2 = this.R;
        View view = this.S;
        switch (b2) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                rx2 rx2Var = actionMenuItemView.T;
                if (rx2Var == null || !rx2Var.a(actionMenuItemView.Q) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((t6) view).L.l();
                break;
        }
        return true;
    }

    @Override // defpackage.cl1
    public boolean d() {
        switch (this.R) {
            case 1:
                u6 u6Var = ((t6) this.S).L;
                if (u6Var.c0 != null) {
                    return false;
                }
                u6Var.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(t6 t6Var, t6 t6Var2) {
        super(t6Var2);
        this.S = t6Var;
    }
}
