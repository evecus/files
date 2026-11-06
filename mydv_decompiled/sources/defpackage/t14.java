package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t14 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((f24) ((u14) ((Observable) this).mObservers.get(size))).a;
            recyclerView.f(null);
            recyclerView.N0.e = true;
            recyclerView.S(true);
            if (!recyclerView.M.x()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            f24 f24Var = (f24) ((u14) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = f24Var.a;
            recyclerView.f(null);
            c8 c8Var = recyclerView.M;
            ArrayList arrayList = (ArrayList) c8Var.d;
            if (i != i2) {
                arrayList.add(c8Var.A(8, i, i2, null));
                c8Var.b |= 8;
                if (arrayList.size() == 1) {
                    f24Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            f24 f24Var = (f24) ((u14) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = f24Var.a;
            recyclerView.f(null);
            c8 c8Var = recyclerView.M;
            ArrayList arrayList = (ArrayList) c8Var.d;
            if (i2 >= 1) {
                arrayList.add(c8Var.A(4, i, i2, obj));
                c8Var.b = 4 | c8Var.b;
                if (arrayList.size() == 1) {
                    f24Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            f24 f24Var = (f24) ((u14) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = f24Var.a;
            recyclerView.f(null);
            c8 c8Var = recyclerView.M;
            ArrayList arrayList = (ArrayList) c8Var.d;
            if (i2 >= 1) {
                arrayList.add(c8Var.A(1, i, i2, null));
                c8Var.b |= 1;
                if (arrayList.size() == 1) {
                    f24Var.a();
                }
            }
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            f24 f24Var = (f24) ((u14) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = f24Var.a;
            recyclerView.f(null);
            c8 c8Var = recyclerView.M;
            ArrayList arrayList = (ArrayList) c8Var.d;
            if (i2 >= 1) {
                arrayList.add(c8Var.A(2, i, i2, null));
                c8Var.b |= 2;
                if (arrayList.size() == 1) {
                    f24Var.a();
                }
            }
        }
    }

    public final void g() {
        c cVar;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((f24) ((u14) ((Observable) this).mObservers.get(size))).a;
            if (recyclerView.L != null && (cVar = recyclerView.U) != null && cVar.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }
}
