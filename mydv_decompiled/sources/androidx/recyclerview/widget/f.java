package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.bs0;
import defpackage.c24;
import defpackage.d24;
import defpackage.dr5;
import defpackage.h24;
import defpackage.hf1;
import defpackage.l24;
import defpackage.m24;
import defpackage.mo1;
import defpackage.mu0;
import defpackage.r7;
import defpackage.s83;
import defpackage.y4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public d24 g;
    public final /* synthetic */ RecyclerView h;

    public f(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(g gVar, boolean z) {
        RecyclerView.g(gVar);
        View view = gVar.itemView;
        RecyclerView recyclerView = this.h;
        m24 m24Var = recyclerView.U0;
        if (m24Var != null) {
            l24 l24Var = m24Var.J;
            dr5.h(view, r7.O(l24Var) ? (y4) l24Var.J.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.W;
            if (arrayList.size() > 0) {
                r7.K(arrayList.get(0));
                throw null;
            }
            c cVar = recyclerView.U;
            if (cVar != null) {
                cVar.onViewRecycled(gVar);
            }
            if (recyclerView.N0 != null) {
                recyclerView.O.u(gVar);
            }
        }
        gVar.mBindingAdapter = null;
        gVar.mOwnerRecyclerView = null;
        d24 c = c();
        c.getClass();
        int itemViewType = gVar.getItemViewType();
        ArrayList arrayList2 = c.a(itemViewType).a;
        ((c24) c.a.get(itemViewType)).getClass();
        if (5 <= arrayList2.size()) {
            mu0.j(gVar.itemView);
        } else {
            gVar.resetInternal();
            arrayList2.add(gVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        h24 h24Var = recyclerView.N0;
        if (i >= 0 && i < h24Var.b()) {
            return !h24Var.f ? i : recyclerView.M.t(i, 0);
        }
        StringBuilder C = hf1.C("invalid position ", i, ". State item count is ");
        C.append(h24Var.b());
        C.append(recyclerView.w());
        throw new IndexOutOfBoundsException(C.toString());
    }

    public final d24 c() {
        if (this.g == null) {
            d24 d24Var = new d24();
            d24Var.a = new SparseArray();
            d24Var.b = 0;
            d24Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = d24Var;
            d();
        }
        return this.g;
    }

    public final void d() {
        RecyclerView recyclerView;
        c cVar;
        d24 d24Var = this.g;
        if (d24Var == null || (cVar = (recyclerView = this.h).U) == null || !recyclerView.d0) {
            return;
        }
        d24Var.c.add(cVar);
    }

    public final void e(c cVar, boolean z) {
        d24 d24Var = this.g;
        if (d24Var != null) {
            SparseArray sparseArray = d24Var.a;
            Set set = d24Var.c;
            set.remove(cVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((c24) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    mu0.j(((g) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.k1) {
            mo1 mo1Var = this.h.M0;
            int[] iArr = (int[]) mo1Var.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            mo1Var.c = 0;
        }
    }

    public final void g(int i) {
        ArrayList arrayList = this.c;
        a((g) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        g G = RecyclerView.G(view);
        boolean isTmpDetached = G.isTmpDetached();
        RecyclerView recyclerView = this.h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (G.isScrap()) {
            G.unScrap();
        } else if (G.wasReturnedFromScrap()) {
            G.clearReturnedFromScrapFlag();
        }
        i(G);
        if (recyclerView.w0 == null || G.isRecyclable()) {
            return;
        }
        recyclerView.w0.d(G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r6 = r6 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(androidx.recyclerview.widget.g r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.i(androidx.recyclerview.widget.g):void");
    }

    public final void j(View view) {
        d dVar;
        g G = RecyclerView.G(view);
        boolean hasAnyOfTheFlags = G.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!hasAnyOfTheFlags && G.isUpdated() && (dVar = recyclerView.w0) != null) {
            bs0 bs0Var = (bs0) dVar;
            if (G.getUnmodifiedPayloads().isEmpty() && bs0Var.g && !G.isInvalid()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                G.setScrapContainer(this, true);
                this.b.add(G);
                return;
            }
        }
        if (G.isInvalid() && !G.isRemoved() && !recyclerView.U.hasStableIds()) {
            s83.t("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.w()));
        } else {
            G.setScrapContainer(this, false);
            this.a.add(G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x041c, code lost:
    
        if ((r13 + r11) >= r29) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.g k(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.k(int, long):androidx.recyclerview.widget.g");
    }

    public final void l(g gVar) {
        if (gVar.mInChangeScrap) {
            this.b.remove(gVar);
        } else {
            this.a.remove(gVar);
        }
        gVar.mScrapContainer = null;
        gVar.mInChangeScrap = false;
        gVar.clearReturnedFromScrapFlag();
    }

    public final void m() {
        e eVar = this.h.V;
        this.f = this.e + (eVar != null ? eVar.i : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }
}
