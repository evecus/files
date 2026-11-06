package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jd1 extends b24 {
    public final /* synthetic */ md1 a;

    public jd1(md1 md1Var) {
        this.a = md1Var;
    }

    @Override // defpackage.b24
    public final void a(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        md1 md1Var = this.a;
        int i = md1Var.a;
        int computeVerticalScrollRange = md1Var.s.computeVerticalScrollRange();
        int i2 = md1Var.r;
        md1Var.t = computeVerticalScrollRange - i2 > 0 && i2 >= i;
        int computeHorizontalScrollRange = md1Var.s.computeHorizontalScrollRange();
        int i3 = md1Var.q;
        boolean z = computeHorizontalScrollRange - i3 > 0 && i3 >= i;
        md1Var.u = z;
        boolean z2 = md1Var.t;
        if (!z2 && !z) {
            if (md1Var.v != 0) {
                md1Var.h(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i2;
            md1Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            md1Var.k = Math.min(i2, (i2 * i2) / computeVerticalScrollRange);
        }
        if (md1Var.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i3;
            md1Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            md1Var.n = Math.min(i3, (i3 * i3) / computeHorizontalScrollRange);
        }
        byte b = md1Var.v;
        if (b == 0 || b == 1) {
            md1Var.h(1);
        }
    }
}
