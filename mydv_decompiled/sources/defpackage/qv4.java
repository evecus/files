package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qv4 extends y6 implements qx2 {
    public final Context K;
    public final ActionBarContextView L;
    public final g12 M;
    public WeakReference N;
    public boolean O;
    public final sx2 P;

    public qv4(Context context, ActionBarContextView actionBarContextView, g12 g12Var) {
        this.K = context;
        this.L = actionBarContextView;
        this.M = g12Var;
        sx2 sx2Var = new sx2(actionBarContextView.getContext());
        sx2Var.l = true;
        this.P = sx2Var;
        sx2Var.e = this;
    }

    @Override // defpackage.y6
    public final void a() {
        if (this.O) {
            return;
        }
        this.O = true;
        this.M.O(this);
    }

    @Override // defpackage.qx2
    public final boolean b(sx2 sx2Var, MenuItem menuItem) {
        return ((mc3) this.M.J).k(this, menuItem);
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
        return this.P;
    }

    @Override // defpackage.y6
    public final MenuInflater e() {
        return new mz4(this.L.getContext());
    }

    @Override // defpackage.y6
    public final CharSequence f() {
        return this.L.getSubtitle();
    }

    @Override // defpackage.qx2
    public final void g(sx2 sx2Var) {
        i();
        u6 u6Var = this.L.L;
        if (u6Var != null) {
            u6Var.l();
        }
    }

    @Override // defpackage.y6
    public final CharSequence h() {
        return this.L.getTitle();
    }

    @Override // defpackage.y6
    public final void i() {
        this.M.P(this, this.P);
    }

    @Override // defpackage.y6
    public final boolean j() {
        return this.L.d0;
    }

    @Override // defpackage.y6
    public final void k(View view) {
        this.L.setCustomView(view);
        this.N = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.y6
    public final void l(int i) {
        m(this.K.getString(i));
    }

    @Override // defpackage.y6
    public final void m(CharSequence charSequence) {
        this.L.setSubtitle(charSequence);
    }

    @Override // defpackage.y6
    public final void n(int i) {
        o(this.K.getString(i));
    }

    @Override // defpackage.y6
    public final void o(CharSequence charSequence) {
        this.L.setTitle(charSequence);
    }

    @Override // defpackage.y6
    public final void p(boolean z) {
        this.J = z;
        this.L.setTitleOptional(z);
    }
}
