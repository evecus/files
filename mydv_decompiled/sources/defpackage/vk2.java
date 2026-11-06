package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vk2 implements vy2, AdapterView.OnItemClickListener {
    public Context I;
    public LayoutInflater J;
    public sx2 K;
    public ExpandedMenuView L;
    public uy2 M;
    public uk2 N;

    public vk2(Context context) {
        this.I = context;
        this.J = LayoutInflater.from(context);
    }

    @Override // defpackage.vy2
    public final void a(sx2 sx2Var, boolean z) {
        uy2 uy2Var = this.M;
        if (uy2Var != null) {
            uy2Var.a(sx2Var, z);
        }
    }

    public final uk2 b() {
        uk2 uk2Var = this.N;
        if (uk2Var != null) {
            return uk2Var;
        }
        uk2 uk2Var2 = new uk2(this);
        this.N = uk2Var2;
        return uk2Var2;
    }

    @Override // defpackage.vy2
    public final boolean c(oy4 oy4Var) {
        if (!oy4Var.hasVisibleItems()) {
            return false;
        }
        iy2 iy2Var = new iy2();
        iy2Var.I = oy4Var;
        n8 n8Var = new n8(oy4Var.a);
        vk2 vk2Var = new vk2(n8Var.getContext());
        iy2Var.K = vk2Var;
        vk2Var.M = iy2Var;
        oy4Var.b(vk2Var);
        uk2 b = iy2Var.K.b();
        j8 j8Var = n8Var.a;
        j8Var.k = b;
        j8Var.l = iy2Var;
        View view = oy4Var.o;
        if (view != null) {
            j8Var.e = view;
        } else {
            j8Var.c = oy4Var.n;
            n8Var.setTitle(oy4Var.m);
        }
        j8Var.j = iy2Var;
        o8 create = n8Var.create();
        iy2Var.J = create;
        create.setOnDismissListener(iy2Var);
        WindowManager.LayoutParams attributes = iy2Var.J.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iy2Var.J.show();
        uy2 uy2Var = this.M;
        if (uy2Var == null) {
            return true;
        }
        uy2Var.k(oy4Var);
        return true;
    }

    @Override // defpackage.vy2
    public final boolean d() {
        return false;
    }

    @Override // defpackage.vy2
    public final boolean e(ky2 ky2Var) {
        return false;
    }

    @Override // defpackage.vy2
    public final void f(uy2 uy2Var) {
        this.M = uy2Var;
    }

    public final yy2 g(ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = (ExpandedMenuView) this.J.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            uk2 uk2Var = this.N;
            if (uk2Var == null) {
                uk2Var = new uk2(this);
                this.N = uk2Var;
            }
            this.L.setAdapter((ListAdapter) uk2Var);
            this.L.setOnItemClickListener(this);
        }
        return this.L;
    }

    @Override // defpackage.vy2
    public final boolean h(ky2 ky2Var) {
        return false;
    }

    @Override // defpackage.vy2
    public final void i() {
        uk2 uk2Var = this.N;
        if (uk2Var != null) {
            uk2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.vy2
    public final void k(Context context, sx2 sx2Var) {
        if (this.I != null) {
            this.I = context;
            if (this.J == null) {
                this.J = LayoutInflater.from(context);
            }
        }
        this.K = sx2Var;
        uk2 uk2Var = this.N;
        if (uk2Var != null) {
            uk2Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.K.r(this.N.getItem(i), this, 0);
    }
}
