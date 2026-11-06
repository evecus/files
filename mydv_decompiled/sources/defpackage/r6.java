package defpackage;

import android.content.Context;
import android.view.View;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r6 extends ry2 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ u6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(u6 u6Var, Context context, oy4 oy4Var, View view) {
        super(context, oy4Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = u6Var;
        if ((oy4Var.A.x & 32) != 32) {
            View view2 = u6Var.Q;
            this.e = view2 == null ? (View) u6Var.P : view2;
        }
        uu2 uu2Var = u6Var.e0;
        this.h = uu2Var;
        py2 py2Var = this.i;
        if (py2Var != null) {
            py2Var.f(uu2Var);
        }
    }

    @Override // defpackage.ry2
    public final void c() {
        byte b = this.l;
        u6 u6Var = this.m;
        switch (b) {
            case 0:
                u6Var.b0 = null;
                super.c();
                break;
            default:
                sx2 sx2Var = u6Var.K;
                if (sx2Var != null) {
                    sx2Var.d(true);
                }
                u6Var.a0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(u6 u6Var, Context context, sx2 sx2Var, View view) {
        super(context, sx2Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = u6Var;
        this.f = 8388613;
        uu2 uu2Var = u6Var.e0;
        this.h = uu2Var;
        py2 py2Var = this.i;
        if (py2Var != null) {
            py2Var.f(uu2Var);
        }
    }
}
