package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ng implements uw2 {
    public final /* synthetic */ ir5 a;
    public final /* synthetic */ wa2 b;

    public ng(ir5 ir5Var, wa2 wa2Var) {
        this.a = ir5Var;
        this.b = wa2Var;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        ir5 ir5Var = this.a;
        ViewGroup.LayoutParams layoutParams = ir5Var.getLayoutParams();
        layoutParams.getClass();
        ir5Var.measure(qg.n(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ir5Var.getMeasuredHeight();
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ir5 ir5Var = this.a;
        ViewGroup.LayoutParams layoutParams = ir5Var.getLayoutParams();
        layoutParams.getClass();
        ir5Var.measure(makeMeasureSpec, qg.n(0, i, layoutParams.height));
        return ir5Var.getMeasuredWidth();
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        ir5 ir5Var = this.a;
        int childCount = ir5Var.getChildCount();
        p91 p91Var = p91.I;
        if (childCount == 0) {
            return ww2Var.A(dh0.j(j), dh0.i(j), p91Var, new q4((byte) 7));
        }
        if (dh0.j(j) != 0) {
            ir5Var.getChildAt(0).setMinimumWidth(dh0.j(j));
        }
        if (dh0.i(j) != 0) {
            ir5Var.getChildAt(0).setMinimumHeight(dh0.i(j));
        }
        int j2 = dh0.j(j);
        int h = dh0.h(j);
        ViewGroup.LayoutParams layoutParams = ir5Var.getLayoutParams();
        layoutParams.getClass();
        int n = qg.n(j2, h, layoutParams.width);
        int i = dh0.i(j);
        int g = dh0.g(j);
        ViewGroup.LayoutParams layoutParams2 = ir5Var.getLayoutParams();
        layoutParams2.getClass();
        ir5Var.measure(n, qg.n(i, g, layoutParams2.height));
        return ww2Var.A(ir5Var.getMeasuredWidth(), ir5Var.getMeasuredHeight(), p91Var, new jg(ir5Var, this.b, (byte) 2));
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        ir5 ir5Var = this.a;
        ViewGroup.LayoutParams layoutParams = ir5Var.getLayoutParams();
        layoutParams.getClass();
        ir5Var.measure(qg.n(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ir5Var.getMeasuredHeight();
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ir5 ir5Var = this.a;
        ViewGroup.LayoutParams layoutParams = ir5Var.getLayoutParams();
        layoutParams.getClass();
        ir5Var.measure(makeMeasureSpec, qg.n(0, i, layoutParams.height));
        return ir5Var.getMeasuredWidth();
    }
}
