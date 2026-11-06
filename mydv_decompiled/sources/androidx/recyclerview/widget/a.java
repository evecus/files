package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.f95;
import defpackage.h24;
import defpackage.mo1;
import defpackage.no1;
import defpackage.xi1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    public static final ThreadLocal M = new ThreadLocal();
    public static final xi1 N = new xi1((byte) 9);
    public long J;
    public long K;
    public final ArrayList I = new ArrayList();
    public final ArrayList L = new ArrayList();

    public static g d(RecyclerView recyclerView, int i, long j) {
        int K = recyclerView.N.K();
        for (int i2 = 0; i2 < K; i2++) {
            g G = RecyclerView.G(recyclerView.N.J(i2));
            if (G.mPosition == i && !G.isInvalid()) {
                return null;
            }
        }
        f fVar = recyclerView.K;
        try {
            recyclerView.N();
            g k = fVar.k(i, j);
            if (k != null) {
                if (!k.isBound() || k.isInvalid()) {
                    fVar.a(k, false);
                } else {
                    fVar.h(k.itemView);
                }
            }
            recyclerView.O(false);
            return k;
        } catch (Throwable th) {
            recyclerView.O(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView) {
        this.I.add(recyclerView);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.d0 && this.J == 0) {
            this.J = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        mo1 mo1Var = recyclerView.M0;
        mo1Var.a = i;
        mo1Var.b = i2;
    }

    public final void c(long j) {
        no1 no1Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        no1 no1Var2;
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            mo1 mo1Var = recyclerView3.M0;
            if (windowVisibility == 0) {
                mo1Var.b(recyclerView3, false);
                i += mo1Var.c;
            }
        }
        ArrayList arrayList2 = this.L;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                mo1 mo1Var2 = recyclerView4.M0;
                int abs = Math.abs(mo1Var2.b) + Math.abs(mo1Var2.a);
                for (int i5 = 0; i5 < mo1Var2.c * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        no1Var2 = new no1();
                        arrayList2.add(no1Var2);
                    } else {
                        no1Var2 = (no1) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) mo1Var2.d;
                    int i6 = iArr[i5 + 1];
                    no1Var2.a = i6 <= abs;
                    no1Var2.b = abs;
                    no1Var2.c = i6;
                    no1Var2.d = recyclerView4;
                    no1Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, N);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (no1Var = (no1) arrayList2.get(i7)).d) != null; i7++) {
            g d = d(recyclerView, no1Var.e, no1Var.a ? Long.MAX_VALUE : j);
            if (d != null && d.mNestedRecyclerView != null && d.isBound() && !d.isInvalid() && (recyclerView2 = d.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.n0 && recyclerView2.N.K() != 0) {
                    f fVar = recyclerView2.K;
                    d dVar = recyclerView2.w0;
                    if (dVar != null) {
                        dVar.e();
                    }
                    e eVar = recyclerView2.V;
                    if (eVar != null) {
                        eVar.b0(fVar);
                        recyclerView2.V.c0(fVar);
                    }
                    fVar.a.clear();
                    fVar.f();
                }
                mo1 mo1Var3 = recyclerView2.M0;
                mo1Var3.b(recyclerView2, true);
                if (mo1Var3.c != 0) {
                    try {
                        int i8 = f95.a;
                        Trace.beginSection("RV Nested Prefetch");
                        h24 h24Var = recyclerView2.N0;
                        c cVar = recyclerView2.U;
                        h24Var.c = (byte) 1;
                        h24Var.d = cVar.getItemCount();
                        h24Var.f = false;
                        h24Var.g = false;
                        h24Var.h = false;
                        for (int i9 = 0; i9 < mo1Var3.c * 2; i9 += 2) {
                            d(recyclerView2, ((int[]) mo1Var3.d)[i9], j);
                        }
                        Trace.endSection();
                        no1Var.a = false;
                        no1Var.b = 0;
                        no1Var.c = 0;
                        no1Var.d = null;
                        no1Var.e = 0;
                    } catch (Throwable th) {
                        int i10 = f95.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            no1Var.a = false;
            no1Var.b = 0;
            no1Var.c = 0;
            no1Var.d = null;
            no1Var.e = 0;
        }
    }

    public final void e(RecyclerView recyclerView) {
        this.I.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.I;
        try {
            int i = f95.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    c(TimeUnit.MILLISECONDS.toNanos(j) + this.K);
                }
            }
            this.J = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.J = 0L;
            int i3 = f95.a;
            Trace.endSection();
            throw th;
        }
    }
}
