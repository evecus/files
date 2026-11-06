package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oy4 extends sx2 implements SubMenu {
    public final ky2 A;
    public final sx2 z;

    public oy4(Context context, sx2 sx2Var, ky2 ky2Var) {
        super(context);
        this.z = sx2Var;
        this.A = ky2Var;
    }

    @Override // defpackage.sx2
    public final boolean e(ky2 ky2Var) {
        return this.z.e(ky2Var);
    }

    @Override // defpackage.sx2
    public final boolean f(sx2 sx2Var, MenuItem menuItem) {
        return super.f(sx2Var, menuItem) || this.z.f(sx2Var, menuItem);
    }

    @Override // defpackage.sx2
    public final boolean g(ky2 ky2Var) {
        return this.z.g(ky2Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.sx2
    public final String k() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return hf1.u(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.sx2
    public final sx2 l() {
        return this.z.l();
    }

    @Override // defpackage.sx2
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.sx2
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.sx2
    public final boolean p() {
        return this.z.p();
    }

    @Override // defpackage.sx2, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.sx2, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // defpackage.sx2
    public final void v(qx2 qx2Var) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }
}
