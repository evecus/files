package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pv4 {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public pv4(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        View view = (View) r7.w(this.a, 1);
        mv4 mv4Var = (mv4) view.getLayoutParams();
        this.c = this.f.q.b(view);
        mv4Var.getClass();
    }

    public final void b() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f.v ? e(r1.size() - 1, -1) : e(0, this.a.size());
    }

    public final int d() {
        return this.f.v ? e(0, this.a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int k = staggeredGridLayoutManager.q.k();
        int g = staggeredGridLayoutManager.q.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int e = staggeredGridLayoutManager.q.e(view);
            int b = staggeredGridLayoutManager.q.b(view);
            boolean z = e <= g;
            boolean z2 = b >= k;
            if (z && z2 && (e < k || b > g)) {
                return ((z14) view.getLayoutParams()).a();
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public final View g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.v && e.B(view2) >= i) || ((!staggeredGridLayoutManager.v && e.B(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.v && e.B(view3) <= i) || ((!staggeredGridLayoutManager.v && e.B(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        mv4 mv4Var = (mv4) view.getLayoutParams();
        this.b = this.f.q.e(view);
        mv4Var.getClass();
        return this.b;
    }
}
