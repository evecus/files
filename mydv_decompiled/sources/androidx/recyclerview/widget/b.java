package androidx.recyclerview.widget;

import android.view.View;
import defpackage.b8;
import defpackage.z14;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ RecyclerView a;

    public b(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(b8 b8Var) {
        byte b = b8Var.a;
        RecyclerView recyclerView = this.a;
        if (b == 1) {
            recyclerView.V.R(b8Var.b, b8Var.d);
            return;
        }
        if (b == 2) {
            recyclerView.V.U(b8Var.b, b8Var.d);
        } else if (b == 4) {
            recyclerView.V.V(b8Var.b, b8Var.d);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.V.T(b8Var.b, b8Var.d);
        }
    }

    public final g b(int i) {
        RecyclerView recyclerView = this.a;
        int K = recyclerView.N.K();
        int i2 = 0;
        g gVar = null;
        while (true) {
            if (i2 >= K) {
                break;
            }
            g G = RecyclerView.G(recyclerView.N.J(i2));
            if (G != null && !G.isRemoved() && G.mPosition == i) {
                if (!((ArrayList) recyclerView.N.d).contains(G.itemView)) {
                    gVar = G;
                    break;
                }
                gVar = G;
            }
            i2++;
        }
        if (gVar != null) {
            if (!((ArrayList) recyclerView.N.d).contains(gVar.itemView)) {
                return gVar;
            }
        }
        return null;
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int K = recyclerView.N.K();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < K; i6++) {
            View J = recyclerView.N.J(i6);
            g G = RecyclerView.G(J);
            if (G != null && !G.shouldIgnore() && (i4 = G.mPosition) >= i && i4 < i5) {
                G.addFlags(2);
                G.addChangePayload(obj);
                ((z14) J.getLayoutParams()).c = true;
            }
        }
        f fVar = recyclerView.K;
        ArrayList arrayList = fVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            if (gVar != null && (i3 = gVar.mPosition) >= i && i3 < i5) {
                gVar.addFlags(2);
                fVar.g(size);
            }
        }
        recyclerView.R0 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int K = recyclerView.N.K();
        for (int i3 = 0; i3 < K; i3++) {
            g G = RecyclerView.G(recyclerView.N.J(i3));
            if (G != null && !G.shouldIgnore() && G.mPosition >= i) {
                G.offsetPosition(i2, false);
                recyclerView.N0.e = true;
            }
        }
        ArrayList arrayList = recyclerView.K.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            g gVar = (g) arrayList.get(i4);
            if (gVar != null && gVar.mPosition >= i) {
                gVar.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.Q0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int K = recyclerView.N.K();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < K; i11++) {
            g G = RecyclerView.G(recyclerView.N.J(i11));
            if (G != null && (i9 = G.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    G.offsetPosition(i2 - i, false);
                } else {
                    G.offsetPosition(i5, false);
                }
                recyclerView.N0.e = true;
            }
        }
        ArrayList arrayList = recyclerView.K.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) arrayList.get(i12);
            if (gVar != null && (i8 = gVar.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    gVar.offsetPosition(i2 - i, false);
                } else {
                    gVar.offsetPosition(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.Q0 = true;
    }
}
