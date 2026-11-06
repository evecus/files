package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vr0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ArrayList J;
    public final /* synthetic */ bs0 K;

    public /* synthetic */ vr0(bs0 bs0Var, ArrayList arrayList, byte b) {
        this.I = b;
        this.K = bs0Var;
        this.J = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        byte b = this.I;
        int i = 0;
        ArrayList arrayList = this.J;
        switch (b) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    bs0 bs0Var = this.K;
                    if (i >= size) {
                        arrayList.clear();
                        bs0Var.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        as0 as0Var = (as0) obj;
                        g gVar = as0Var.a;
                        int i2 = as0Var.b;
                        int i3 = as0Var.c;
                        int i4 = as0Var.d;
                        int i5 = as0Var.e;
                        bs0Var.getClass();
                        View view = gVar.itemView;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        bs0Var.p.add(gVar);
                        animate.setDuration(bs0Var.e).setListener(new xr0(bs0Var, gVar, i6, view, i7, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    bs0 bs0Var2 = this.K;
                    if (i >= size2) {
                        arrayList.clear();
                        bs0Var2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i);
                        i++;
                        zr0 zr0Var = (zr0) obj2;
                        ArrayList arrayList2 = bs0Var2.r;
                        long j = bs0Var2.f;
                        g gVar2 = zr0Var.a;
                        View view2 = gVar2 == null ? null : gVar2.itemView;
                        g gVar3 = zr0Var.b;
                        View view3 = gVar3 != null ? gVar3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(zr0Var.a);
                            duration.translationX(zr0Var.e - zr0Var.c);
                            duration.translationY(zr0Var.f - zr0Var.d);
                            duration.alpha(0.0f).setListener(new yr0(bs0Var2, zr0Var, duration, view2, (byte) 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(zr0Var.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new yr0(bs0Var2, zr0Var, animate2, view3, (byte) 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    bs0 bs0Var3 = this.K;
                    if (i >= size3) {
                        arrayList.clear();
                        bs0Var3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i);
                        i++;
                        g gVar4 = (g) obj3;
                        bs0Var3.getClass();
                        View view4 = gVar4.itemView;
                        ViewPropertyAnimator animate3 = view4.animate();
                        bs0Var3.o.add(gVar4);
                        animate3.alpha(1.0f).setDuration(bs0Var3.c).setListener(new wr0(bs0Var3, gVar4, view4, animate3)).start();
                    }
                }
        }
    }
}
