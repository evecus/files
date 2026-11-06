package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pw0 extends wu5 {
    public final /* synthetic */ qw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(qw0 qw0Var) {
        super(1);
        this.K = qw0Var;
    }

    @Override // defpackage.wu5
    public final yv5 c(yv5 yv5Var, List list) {
        qw0 qw0Var = this.K;
        if (!qw0Var.U) {
            View childAt = qw0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, qw0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, qw0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return yv5Var.a.r(max, max2, max3, max4);
            }
        }
        return yv5Var;
    }

    @Override // defpackage.wu5
    public final da d(ev5 ev5Var, da daVar) {
        qw0 qw0Var = this.K;
        if (!qw0Var.U) {
            View childAt = qw0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, qw0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, qw0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                o12 b = o12.b(max, max2, max3, max4);
                int i = b.a;
                o12 o12Var = (o12) daVar.J;
                int i2 = b.b;
                int i3 = b.c;
                int i4 = b.d;
                return new da(yv5.a(o12Var, i, i2, i3, i4), yv5.a((o12) daVar.K, i, i2, i3, i4), (byte) 15);
            }
        }
        return daVar;
    }
}
