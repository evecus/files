package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pu5 extends y6 implements qx2 {
    public final Context K;
    public final sx2 L;
    public g12 M;
    public WeakReference N;
    public final /* synthetic */ qu5 O;

    public pu5(qu5 qu5Var, Context context, g12 g12Var) {
        this.O = qu5Var;
        this.K = context;
        this.M = g12Var;
        sx2 sx2Var = new sx2(context);
        sx2Var.l = true;
        this.L = sx2Var;
        sx2Var.e = this;
    }

    @Override // defpackage.y6
    public final void a() {
        qu5 qu5Var = this.O;
        if (qu5Var.i != this) {
            return;
        }
        if (qu5Var.p) {
            qu5Var.j = this;
            qu5Var.k = this.M;
        } else {
            this.M.O(this);
        }
        this.M = null;
        qu5Var.a(false);
        ActionBarContextView actionBarContextView = qu5Var.f;
        if (actionBarContextView.S == null) {
            actionBarContextView.e();
        }
        qu5Var.c.setHideOnContentScrollEnabled(qu5Var.u);
        qu5Var.i = null;
    }

    @Override // defpackage.qx2
    public final boolean b(sx2 sx2Var, MenuItem menuItem) {
        g12 g12Var = this.M;
        if (g12Var != null) {
            return ((mc3) g12Var.J).k(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.y6
    public final View c() {
        WeakReference weakReference = this.N;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.y6
    public final sx2 d() {
        return this.L;
    }

    @Override // defpackage.y6
    public final MenuInflater e() {
        return new mz4(this.K);
    }

    @Override // defpackage.y6
    public final CharSequence f() {
        return this.O.f.getSubtitle();
    }

    @Override // defpackage.qx2
    public final void g(sx2 sx2Var) {
        if (this.M == null) {
            return;
        }
        i();
        u6 u6Var = this.O.f.L;
        if (u6Var != null) {
            u6Var.l();
        }
    }

    @Override // defpackage.y6
    public final CharSequence h() {
        return this.O.f.getTitle();
    }

    @Override // defpackage.y6
    public final void i() {
        if (this.O.i != this) {
            return;
        }
        sx2 sx2Var = this.L;
        sx2Var.z();
        try {
            this.M.P(this, sx2Var);
        } finally {
            sx2Var.y();
        }
    }

    @Override // defpackage.y6
    public final boolean j() {
        return this.O.f.d0;
    }

    @Override // defpackage.y6
    public final void k(View view) {
        this.O.f.setCustomView(view);
        this.N = new WeakReference(view);
    }

    @Override // defpackage.y6
    public final void l(int i) {
        m(this.O.a.getResources().getString(i));
    }

    @Override // defpackage.y6
    public final void m(CharSequence charSequence) {
        this.O.f.setSubtitle(charSequence);
    }

    @Override // defpackage.y6
    public final void n(int i) {
        o(this.O.a.getResources().getString(i));
    }

    @Override // defpackage.y6
    public final void o(CharSequence charSequence) {
        this.O.f.setTitle(charSequence);
    }

    @Override // defpackage.y6
    public final void p(boolean z) {
        this.J = z;
        this.O.f.setTitleOptional(z);
    }
}
