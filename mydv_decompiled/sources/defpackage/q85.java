package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q85 implements x6, qx2 {
    public final /* synthetic */ Toolbar I;

    public /* synthetic */ q85(Toolbar toolbar) {
        this.I = toolbar;
    }

    @Override // defpackage.qx2
    public boolean b(sx2 sx2Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.qx2
    public void g(sx2 sx2Var) {
        Toolbar toolbar = this.I;
        u6 u6Var = toolbar.I.e0;
        if (u6Var == null || !u6Var.j()) {
            toolbar.r0.Q();
        }
    }
}
