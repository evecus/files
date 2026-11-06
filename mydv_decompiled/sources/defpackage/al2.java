package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class al2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ cl2 a;

    public al2(cl2 cl2Var) {
        this.a = cl2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        cl2 cl2Var = this.a;
        yk2 yk2Var = cl2Var.Y;
        wl wlVar = cl2Var.g0;
        if (i != 1 || wlVar.getInputMethodMode() == 2 || wlVar.getContentView() == null) {
            return;
        }
        cl2Var.c0.removeCallbacks(yk2Var);
        yk2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
