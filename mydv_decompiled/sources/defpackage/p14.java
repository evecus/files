package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p14 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ RecyclerView J;

    public /* synthetic */ p14(RecyclerView recyclerView, byte b) {
        this.I = b;
        this.J = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.I;
        RecyclerView recyclerView = this.J;
        switch (b) {
            case 0:
                if (recyclerView.f0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.d0) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.i0) {
                        recyclerView.k();
                        break;
                    } else {
                        recyclerView.h0 = true;
                        break;
                    }
                }
                break;
            default:
                d dVar = recyclerView.w0;
                if (dVar != null) {
                    bs0 bs0Var = (bs0) dVar;
                    long j = bs0Var.d;
                    ArrayList arrayList = bs0Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = bs0Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = bs0Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = bs0Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            g gVar = (g) obj;
                            View view = gVar.itemView;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            bs0Var.q.add(gVar);
                            animate.setDuration(j).alpha(0.0f).setListener(new wr0(bs0Var, gVar, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            bs0Var.m.add(arrayList6);
                            arrayList2.clear();
                            vr0 vr0Var = new vr0(bs0Var, arrayList6, (byte) 0);
                            if (z2) {
                                vr0Var.run();
                            } else {
                                View view2 = ((as0) arrayList6.get(0)).a.itemView;
                                WeakHashMap weakHashMap = dr5.a;
                                view2.postOnAnimationDelayed(vr0Var, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            bs0Var.n.add(arrayList7);
                            arrayList3.clear();
                            vr0 vr0Var2 = new vr0(bs0Var, arrayList7, (byte) 1);
                            if (z2) {
                                vr0Var2.run();
                            } else {
                                View view3 = ((zr0) arrayList7.get(0)).a.itemView;
                                WeakHashMap weakHashMap2 = dr5.a;
                                view3.postOnAnimationDelayed(vr0Var2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            bs0Var.l.add(arrayList8);
                            arrayList4.clear();
                            vr0 vr0Var3 = new vr0(bs0Var, arrayList8, (byte) 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? bs0Var.e : 0L, isEmpty3 ? 0L : bs0Var.f) + j;
                                z = false;
                                View view4 = ((g) arrayList8.get(0)).itemView;
                                WeakHashMap weakHashMap3 = dr5.a;
                                view4.postOnAnimationDelayed(vr0Var3, max);
                                recyclerView.T0 = z;
                                break;
                            } else {
                                vr0Var3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.T0 = z;
        }
    }
}
