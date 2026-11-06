package androidx.recyclerview.widget;

import android.view.View;
import defpackage.e60;
import defpackage.pn;
import defpackage.r14;
import defpackage.rs;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class d {
    public r14 a;
    public ArrayList b;
    public byte c;
    public byte d;
    public short e;
    public short f;

    public static void b(g gVar) {
        int i = gVar.mFlags;
        if (!gVar.isInvalid() && (i & 4) == 0) {
            gVar.getOldPosition();
            gVar.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(g gVar, g gVar2, rs rsVar, rs rsVar2);

    public final void c(g gVar) {
        r14 r14Var = this.a;
        if (r14Var != null) {
            RecyclerView recyclerView = r14Var.a;
            boolean z = true;
            gVar.setIsRecyclable(true);
            if (gVar.mShadowedHolder != null && gVar.mShadowingHolder == null) {
                gVar.mShadowedHolder = null;
            }
            gVar.mShadowingHolder = null;
            if (gVar.shouldBeKeptAsChild()) {
                return;
            }
            View view = gVar.itemView;
            f fVar = recyclerView.K;
            recyclerView.c0();
            pn pnVar = recyclerView.N;
            e60 e60Var = (e60) pnVar.c;
            r14 r14Var2 = (r14) pnVar.b;
            int indexOfChild = r14Var2.a.indexOfChild(view);
            if (indexOfChild == -1) {
                pnVar.Y(view);
            } else if (e60Var.e(indexOfChild)) {
                e60Var.g(indexOfChild);
                pnVar.Y(view);
                r14Var2.c(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                g G = RecyclerView.G(view);
                fVar.l(G);
                fVar.i(G);
            }
            recyclerView.d0(!z);
            if (z || !gVar.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(gVar.itemView, false);
        }
    }

    public abstract void d(g gVar);

    public abstract void e();

    public abstract boolean f();
}
