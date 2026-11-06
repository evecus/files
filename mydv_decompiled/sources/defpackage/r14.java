package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r14 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ r14(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.g r8, defpackage.rs r9, defpackage.rs r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.a
            androidx.recyclerview.widget.d r0 = r7.w0
            r1 = r0
            bs0 r1 = (defpackage.bs0) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.I
            int r5 = r10.I
            if (r3 != r5) goto L1f
            int r0 = r9.J
            int r2 = r10.J
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.J
            int r6 = r10.J
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.itemView
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.Q()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r14.a(androidx.recyclerview.widget.g, rs, rs):void");
    }

    public void b(g gVar, rs rsVar, rs rsVar2) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.K.l(gVar);
        recyclerView.e(gVar);
        gVar.setIsRecyclable(false);
        bs0 bs0Var = (bs0) recyclerView.w0;
        bs0Var.getClass();
        int i = rsVar.I;
        int i2 = rsVar.J;
        View view = gVar.itemView;
        int left = rsVar2 == null ? view.getLeft() : rsVar2.I;
        int top = rsVar2 == null ? view.getTop() : rsVar2.J;
        if (gVar.isRemoved() || (i == left && i2 == top)) {
            bs0Var.l(gVar);
            bs0Var.h.add(gVar);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = bs0Var.g(gVar, i, i2, left, top);
        }
        if (z) {
            recyclerView.Q();
        }
    }

    public void c(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            g G = RecyclerView.G(childAt);
            c cVar = recyclerView.U;
            if (cVar != null && G != null) {
                cVar.onViewDetachedFromWindow(G);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
